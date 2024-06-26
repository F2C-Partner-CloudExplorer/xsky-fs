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

import xio.sds.client.model.DpBlockBackupPoliciesResp;
import xio.sds.client.model.DpBlockBackupPolicyCreateReq;
import xio.sds.client.model.DpBlockBackupPolicyResp;
import xio.sds.client.model.DpBlockBackupPolicyUpdateReq;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DpBlockBackupPoliciesApi
 */
@Ignore
public class DpBlockBackupPoliciesApiTest {

    private final DpBlockBackupPoliciesApi api = new DpBlockBackupPoliciesApi();

    /**
     * 
     *
     * Create dp block backup policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDpBlockBackupPolicyTest() throws Exception {
        DpBlockBackupPolicyCreateReq body = null;
        DpBlockBackupPolicyResp response = api.createDpBlockBackupPolicy(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete dp block backup policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDpBlockBackupPolicyTest() throws Exception {
        Long policyId = null;
        Boolean force = null;
        DpBlockBackupPolicyResp response = api.deleteDpBlockBackupPolicy(policyId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get dp block backup policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDpBlockBackupPolicyTest() throws Exception {
        Long policyId = null;
        DpBlockBackupPolicyResp response = api.getDpBlockBackupPolicy(policyId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dp block backup policies
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDpBlockBackupPoliciesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        Long blockVolumeId = null;
        Long dpSiteId = null;
        DpBlockBackupPoliciesResp response = api.listDpBlockBackupPolicies(limit, offset, q, sort, blockVolumeId, dpSiteId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dp block backup policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDpBlockBackupPolicyTest() throws Exception {
        DpBlockBackupPolicyUpdateReq body = null;
        Long policyId = null;
        DpBlockBackupPolicyResp response = api.updateDpBlockBackupPolicy(body, policyId);

        // TODO: test validations
    }
}
