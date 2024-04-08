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

import xio.sds.client.model.DpVolumeGroupSnapshotReplicationPoliciesResp;
import xio.sds.client.model.DpVolumeGroupSnapshotReplicationPolicyCreateReq;
import xio.sds.client.model.DpVolumeGroupSnapshotReplicationPolicyResp;
import xio.sds.client.model.DpVolumeGroupSnapshotReplicationPolicyUpdateReq;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DpVolumeGroupSnapshotReplicationPoliciesApi
 */
@Ignore
public class DpVolumeGroupSnapshotReplicationPoliciesApiTest {

    private final DpVolumeGroupSnapshotReplicationPoliciesApi api = new DpVolumeGroupSnapshotReplicationPoliciesApi();

    /**
     * 
     *
     * Create dp volume group snapshot replication policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDpVolumeGroupSnapshotReplicationPolicyTest() throws Exception {
        DpVolumeGroupSnapshotReplicationPolicyCreateReq body = null;
        DpVolumeGroupSnapshotReplicationPolicyResp response = api.createDpVolumeGroupSnapshotReplicationPolicy(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete dp volume group snapshot replication policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDpVolumeGroupSnapshotReplicationPolicyTest() throws Exception {
        Long policyId = null;
        Boolean force = null;
        DpVolumeGroupSnapshotReplicationPolicyResp response = api.deleteDpVolumeGroupSnapshotReplicationPolicy(policyId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get dp volume group snapshot replication policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDpVolumeGroupSnapshotReplicationPolicyTest() throws Exception {
        Long policyId = null;
        DpVolumeGroupSnapshotReplicationPolicyResp response = api.getDpVolumeGroupSnapshotReplicationPolicy(policyId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dp volume group snapshot replication policies
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDpVolumeGroupSnapshotReplicationPoliciesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        Long dpSiteId = null;
        Long volumeGroupId = null;
        DpVolumeGroupSnapshotReplicationPoliciesResp response = api.listDpVolumeGroupSnapshotReplicationPolicies(limit, offset, q, sort, dpSiteId, volumeGroupId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dp volume group snapshot replication policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDpVolumeGroupSnapshotReplicationPolicyTest() throws Exception {
        DpVolumeGroupSnapshotReplicationPolicyUpdateReq body = null;
        Long policyId = null;
        DpVolumeGroupSnapshotReplicationPolicyResp response = api.updateDpVolumeGroupSnapshotReplicationPolicy(body, policyId);

        // TODO: test validations
    }
}
