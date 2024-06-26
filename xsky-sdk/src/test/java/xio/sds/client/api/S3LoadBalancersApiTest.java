/*
 * XMS API
 * XMS is the controller of distributed storage system
 *
 * OpenAPI spec version: XSCALEROS_6.2.000.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xio.sds.client.api;

import xio.sds.client.model.MultiS3LoadBalancersSamplesResp;
import xio.sds.client.model.S3LoadBalancerResp;
import xio.sds.client.model.S3LoadBalancerSamplesResp;
import xio.sds.client.model.S3LoadBalancersResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for S3LoadBalancersApi
 */
@Ignore
public class S3LoadBalancersApiTest {

    private final S3LoadBalancersApi api = new S3LoadBalancersApi();

    /**
     * 
     *
     * Get samples of multiple s3 load balancers
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void batchGetS3LoadBalancerSamplesTest() throws Exception {
        MultiS3LoadBalancersSamplesResp response = api.batchGetS3LoadBalancerSamples();

        // TODO: test validations
    }
    /**
     * 
     *
     * Get s3 load balancer
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getS3LoadBalancerTest() throws Exception {
        Long loadBalancerId = null;
        S3LoadBalancerResp response = api.getS3LoadBalancer(loadBalancerId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a s3 load balancer&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getS3LoadBalancerSamplesTest() throws Exception {
        Long s3LoadBalancerId = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        S3LoadBalancerSamplesResp response = api.getS3LoadBalancerSamples(s3LoadBalancerId, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * List s3 load balancers
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listS3LoadBalancersTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        Long groupId = null;
        Long ospZoneId = null;
        Long hostId = null;
        S3LoadBalancersResp response = api.listS3LoadBalancers(limit, offset, q, sort, clusterId, groupId, ospZoneId, hostId);

        // TODO: test validations
    }
}
