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

import xio.sds.client.model.S3LoadBalancerGroupCreateReq;
import xio.sds.client.model.S3LoadBalancerGroupResp;
import xio.sds.client.model.S3LoadBalancerGroupUpdateReq;
import xio.sds.client.model.S3LoadBalancerGroupsResp;
import xio.sds.client.model.S3LoadBalancerRegisterServiceReq;
import xio.sds.client.model.S3LoadBalancerRemoveServiceReq;
import xio.sds.client.model.S3LoadBalancerServiceResp;
import xio.sds.client.model.S3LoadBalancersAddReq;
import xio.sds.client.model.S3LoadBalancersRemoveReq;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for S3LoadBalancerGroupsApi
 */
@Ignore
public class S3LoadBalancerGroupsApiTest {

    private final S3LoadBalancerGroupsApi api = new S3LoadBalancerGroupsApi();

    /**
     * 
     *
     * add load balancers to group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addS3LoadBalancersToGroupTest() throws Exception {
        S3LoadBalancersAddReq body = null;
        Long groupId = null;
        S3LoadBalancerGroupResp response = api.addS3LoadBalancersToGroup(body, groupId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a s3 load balancer group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createS3LoadBalancerGroupTest() throws Exception {
        S3LoadBalancerGroupCreateReq body = null;
        String clusterId = null;
        S3LoadBalancerGroupResp response = api.createS3LoadBalancerGroup(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete s3 load balancer group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteS3LoadBalancerGroupTest() throws Exception {
        Long groupId = null;
        Boolean force = null;
        S3LoadBalancerGroupResp response = api.deleteS3LoadBalancerGroup(groupId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get s3 load balancer group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getS3LoadBalancerGroupTest() throws Exception {
        Long groupId = null;
        S3LoadBalancerGroupResp response = api.getS3LoadBalancerGroup(groupId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List s3 load balancer groups
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listS3LoadBalancerGroupsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        Long ospZoneId = null;
        S3LoadBalancerGroupsResp response = api.listS3LoadBalancerGroups(limit, offset, q, sort, clusterId, ospZoneId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Redeploy a s3 load balancer group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void redeployS3LoadBalancerGroupTest() throws Exception {
        Long groupId = null;
        Boolean reloadKeepalived = null;
        S3LoadBalancerGroupResp response = api.redeployS3LoadBalancerGroup(groupId, reloadKeepalived);

        // TODO: test validations
    }
    /**
     * 
     *
     * Register s3 load balancer service
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerS3LoadBalancerServiceTest() throws Exception {
        S3LoadBalancerRegisterServiceReq body = null;
        S3LoadBalancerServiceResp response = api.registerS3LoadBalancerService(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove s3 load balancer service
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeS3LoadBalancerServiceTest() throws Exception {
        S3LoadBalancerRemoveServiceReq body = null;
        S3LoadBalancerServiceResp response = api.removeS3LoadBalancerService(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * remove load balancers from group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeS3LoadBalancersFromGroupTest() throws Exception {
        S3LoadBalancersRemoveReq body = null;
        Long groupId = null;
        Boolean force = null;
        S3LoadBalancerGroupResp response = api.removeS3LoadBalancersFromGroup(body, groupId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a s3 load balancer group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateS3LoadBalancerGroupTest() throws Exception {
        S3LoadBalancerGroupUpdateReq body = null;
        Long groupId = null;
        S3LoadBalancerGroupResp response = api.updateS3LoadBalancerGroup(body, groupId);

        // TODO: test validations
    }
}
