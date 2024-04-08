FROM registry.fit2cloud.com/north/fabric8-java-alpine-openjdk8-jre

MAINTAINER FIT2CLOUD <support@fit2cloud.com>

RUN mkdir -p /opt/apps

ADD fs/target/fs-2.0.0.jar /opt/apps

RUN mkdir -p /opt/fit2cloud/upload/ticket-fs/

ENV JAVA_APP_JAR=/opt/apps/fs-2.0.0.jar

ENV AB_OFF=true

ENV JAVA_OPTIONS=-Dfile.encoding=utf-8

HEALTHCHECK --interval=15s --timeout=5s --retries=20 --start-period=30s CMD curl -f 127.0.0.1:6707

CMD ["/deployments/run-java.sh"]
