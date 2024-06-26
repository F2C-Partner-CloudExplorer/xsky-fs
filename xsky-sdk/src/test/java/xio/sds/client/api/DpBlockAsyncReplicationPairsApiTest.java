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

import xio.sds.client.model.DpBlockAsyncReplicationPairCreateReq;
import xio.sds.client.model.DpBlockAsyncReplicationPairResp;
import xio.sds.client.model.DpBlockAsyncReplicationPairUpdateReq;
import xio.sds.client.model.DpBlockAsyncReplicationPairsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DpBlockAsyncReplicationPairsApi
 */
@Ignore
public class DpBlockAsyncReplicationPairsApiTest {

    private final DpBlockAsyncReplicationPairsApi api = new DpBlockAsyncReplicationPairsApi();

    /**
     * 
     *
     * switch the roles of the pair
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void asyncFailoverDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.asyncFailoverDpBlockAsyncReplicationPair(pairId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create dp block async replication pair
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDpBlockAsyncReplicationPairTest() throws Exception {
        DpBlockAsyncReplicationPairCreateReq body = null;
        DpBlockAsyncReplicationPairResp response = api.createDpBlockAsyncReplicationPair(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete dp block async replication pair
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        Boolean reserveVolume = null;
        DpBlockAsyncReplicationPairResp response = api.deleteDpBlockAsyncReplicationPair(pairId, reserveVolume);

        // TODO: test validations
    }
    /**
     * 
     *
     * switch the roles of the pair to synced
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void failbackDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.failbackDpBlockAsyncReplicationPair(pairId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get dp block async replication pair
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.getDpBlockAsyncReplicationPair(pairId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dp block async replication pairs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDpBlockAsyncReplicationPairTest() throws Exception {
        Long blockVolumeId = null;
        Long dpBlockAsyncReplicationPolicyId = null;
        DpBlockAsyncReplicationPairsResp response = api.listDpBlockAsyncReplicationPair(blockVolumeId, dpBlockAsyncReplicationPolicyId);

        // TODO: test validations
    }
    /**
     * 
     *
     * pause periodic sync
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void pauseDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.pauseDpBlockAsyncReplicationPair(pairId);

        // TODO: test validations
    }
    /**
     * 
     *
     * resume periodic sync
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void resumeDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.resumeDpBlockAsyncReplicationPair(pairId);

        // TODO: test validations
    }
    /**
     * 
     *
     * rollback volume snapshot pair to previous snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rollbackDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.rollbackDpBlockAsyncReplicationPair(pairId);

        // TODO: test validations
    }
    /**
     * 
     *
     * sync pair
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void syncDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.syncDpBlockAsyncReplicationPair(pairId);

        // TODO: test validations
    }
    /**
     * 
     *
     * switch the roles of the pair
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void syncFailoverDpBlockAsyncReplicationPairTest() throws Exception {
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.syncFailoverDpBlockAsyncReplicationPair(pairId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dp block async replication pair
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDpBlockAsyncReplicationPairTest() throws Exception {
        DpBlockAsyncReplicationPairUpdateReq body = null;
        Long pairId = null;
        DpBlockAsyncReplicationPairResp response = api.updateDpBlockAsyncReplicationPair(body, pairId);

        // TODO: test validations
    }
}
