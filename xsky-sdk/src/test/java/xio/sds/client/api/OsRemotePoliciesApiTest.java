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

import xio.sds.client.model.OSRemotePoliciesResp;
import xio.sds.client.model.OSRemotePolicyResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OsRemotePoliciesApi
 */
@Ignore
public class OsRemotePoliciesApiTest {

    private final OsRemotePoliciesApi api = new OsRemotePoliciesApi();

    /**
     * 
     *
     * Get a os remote policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOSRemotePolicyTest() throws Exception {
        String policyUuid = null;
        OSRemotePolicyResp response = api.getOSRemotePolicy(policyUuid);

        // TODO: test validations
    }
    /**
     * 
     *
     * List os remote policies
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listOSRemotePoliciesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String marker = null;
        String zoneUuid = null;
        String clusterId = null;
        OSRemotePoliciesResp response = api.listOSRemotePolicies(limit, offset, marker, zoneUuid, clusterId);

        // TODO: test validations
    }
}
