echo "清理旧文件 ..."
rm -rf *.tar.gz *.md5 extension

module_version="module.version"
property_file="fs/src/main/resources/application.properties"
has_version=`grep "^$module_version=" $property_file | wc -l`

version=`awk '/<version>[^<]+<\/version>/{gsub(/<version>|<\/version>/,"",$1);print $1;exit;}' pom.xml`

docker_compose_path=docker-compose.yml

if [ "${internal}" == 'true' ];then
    echo "内网镜像"
    docker_compose_path=dev/docker-compose.yml
fi

#Linux的sed命令
sed -i "s/BRANCH/$branch/g" ${docker_compose_path}

image_url=registry.fit2cloud.com/north/xsky-fs-service:dev-preview-zxqh
image_name=`echo $image_url | awk -F"/" '{ print $3 }'`
image=`echo $image_name | awk -F":" '{ print $1 }'`

echo "编译工程源码 ..."
mvn clean package -U -Dmaven.test.skip=true

function export_image_package() {
  install_file=$image-$version.tar.gz

  echo "拉取扩展模块 $1 镜像 ..."
  docker pull --platform="linux/$1" "${image_url}"
  install_file=$image-$version.tar.gz
  if [[ "$1" == "arm64" ]]; then
    install_file=$image-arm64-$version.tar.gz
  fi

  echo "导出扩展模块 $1 镜像 ..."
  docker save -o extension/"${image_name}".tar "${image_url}"
  #sed -i '/^version=/d' service.inf
  #echo "version=$build_version" >> service.inf
  \cp service.inf extension/
  \cp service.ico extension/
  \cp ${docker_compose_path} extension/


  echo "制作扩展模块 $1 安装包 ..."
  tar zcvf "${install_file}" extension

  md5_file_name=${install_file}.md5
  md5sum "${install_file}" | awk -F" " '{print "md5: "$1}' > "${md5_file_name}"
}

function build_image() {
  echo "构建扩展模块镜像 ..."
  if [[ "${tools}" == 'buildx' ]]; then
    docker buildx build -t $image_url --platform=linux/arm64,linux/amd64 . --push
  else
    docker build -t $image_url .
    if [[ "${action}" == 'push' ]]; then
        docker push $image_url
    fi
  fi
}

#构建镜像
build_image

mkdir extension
# AMD 打包
export_image_package amd64

# ARM 打包
export_image_package arm64

# 删除多架构镜像
rm -rf extension
git checkout $property_file service.inf
