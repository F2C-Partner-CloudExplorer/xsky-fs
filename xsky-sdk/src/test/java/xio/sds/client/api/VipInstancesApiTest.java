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

import xio.sds.client.model.VIPInstanceResp;
import xio.sds.client.model.VIPInstancesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for VipInstancesApi
 */
@Ignore
public class VipInstancesApiTest {

    private final VipInstancesApi api = new VipInstancesApi();

    /**
     * 
     *
     * Get a vip group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getVIPInstanceTest() throws Exception {
        Long vipInstanceId = null;
        VIPInstanceResp response = api.getVIPInstance(vipInstanceId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List vip instances
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listVIPInstancesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        Long vipId = null;
        VIPInstancesResp response = api.listVIPInstances(limit, offset, vipId);

        // TODO: test validations
    }
}
