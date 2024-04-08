package com.fit2cloud.oss;

import com.fit2cloud.oss.job.CalculatePriceJob;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.fit2cloud.oss.Application.class)
@TestPropertySource(locations = "file:/opt/fit2cloud/conf/fit2cloud.properties")
public class JobTest {

    @Resource
    private CalculatePriceJob calculatePriceJob;

    @Test
    public void calculateResourcePrice() {
        calculatePriceJob.calculateResourcePrice();
    }
}
