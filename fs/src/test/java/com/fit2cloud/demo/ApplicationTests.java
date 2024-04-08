package com.fit2cloud.demo;

import com.fit2cloud.commons.pluginmanager.CloudProviderManager;
import com.fit2cloud.sdk.ICloudProvider;
import com.fit2cloud.sdk.model.F2CDisk;
import com.fit2cloud.sdk.model.Request;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "file:/opt/fit2cloud/conf/fit2cloud.properties")
public class ApplicationTests {

    @Resource
    private CloudProviderManager cloudProviderManager;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testAliyun() throws Exception {
        Request req = new Request();
        req.setCredential("{\"accessKey\":\"69p7js7TNbt7RSgK\",\"secretKey\":\"UjFDAHmEapnpz1bWqZQRgM1klg7NMT\"}");
        ICloudProvider cloudProvider = cloudProviderManager.getCloudProvider("fit2cloud-aliyun-plugin");
        List<F2CDisk> f2CDiskList = cloudProvider.getF2CDiskList(req);
        System.out.println(f2CDiskList);
    }

}
