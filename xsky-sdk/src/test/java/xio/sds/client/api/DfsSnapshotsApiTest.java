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

import xio.sds.client.model.DfsSnapShotsOverviewPageResp;
import xio.sds.client.model.DfsSnapshotCreateReq;
import xio.sds.client.model.DfsSnapshotResp;
import xio.sds.client.model.DfsSnapshotRollbackReq;
import xio.sds.client.model.DfsSnapshotUpdateReq;
import xio.sds.client.model.DfsSnapshotsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsSnapshotsApi
 */
@Ignore
public class DfsSnapshotsApiTest {

    private final DfsSnapshotsApi api = new DfsSnapshotsApi();

    /**
     * 
     *
     * Create dfs snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDfsSnapshotTest() throws Exception {
        DfsSnapshotCreateReq body = null;
        Boolean allowPathCreate = null;
        DfsSnapshotResp response = api.createDfsSnapshot(body, allowPathCreate);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete a dfs snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDfsSnapshotTest() throws Exception {
        Long dfsSnapshotId = null;
        DfsSnapshotResp response = api.deleteDfsSnapshot(dfsSnapshotId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get dfs snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsSnapshotTest() throws Exception {
        Long dfsSnapshotId = null;
        DfsSnapshotResp response = api.getDfsSnapshot(dfsSnapshotId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get dfs snapshots overview page
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsSnapshotsOverViewPageTest() throws Exception {
        DfsSnapShotsOverviewPageResp response = api.getDfsSnapshotsOverViewPage();

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs snapshots
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsSnapshotsTest() throws Exception {
        String clusterId = null;
        Long dfsPathId = null;
        Long dpDfsSnapshotId = null;
        String path = null;
        String name = null;
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        DfsSnapshotsResp response = api.listDfsSnapshots(clusterId, dfsPathId, dpDfsSnapshotId, path, name, limit, offset, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Lock dfs snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void lockDfsSnapshotTest() throws Exception {
        Long dfsSnapshotId = null;
        DfsSnapshotResp response = api.lockDfsSnapshot(dfsSnapshotId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Rollback dfs snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rollbackDfsSnapshotTest() throws Exception {
        DfsSnapshotRollbackReq body = null;
        Long dfsSnapshotId = null;
        DfsSnapshotResp response = api.rollbackDfsSnapshot(body, dfsSnapshotId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Unlock dfs snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unlockDfsSnapshotTest() throws Exception {
        Long dfsSnapshotId = null;
        DfsSnapshotResp response = api.unlockDfsSnapshot(dfsSnapshotId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsSnapshotTest() throws Exception {
        DfsSnapshotUpdateReq body = null;
        Long dfsSnapshotId = null;
        DfsSnapshotResp response = api.updateDfsSnapshot(body, dfsSnapshotId);

        // TODO: test validations
    }
}
