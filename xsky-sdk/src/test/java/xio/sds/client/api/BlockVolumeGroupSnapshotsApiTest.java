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

import xio.sds.client.model.VolumeGroupSnapshotCreateReq;
import xio.sds.client.model.VolumeGroupSnapshotResp;
import xio.sds.client.model.VolumeGroupSnapshotUpdateReq;
import xio.sds.client.model.VolumeGroupSnapshotsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BlockVolumeGroupSnapshotsApi
 */
@Ignore
public class BlockVolumeGroupSnapshotsApiTest {

    private final BlockVolumeGroupSnapshotsApi api = new BlockVolumeGroupSnapshotsApi();

    /**
     * 
     *
     * Create block volume group snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createBlockVolumeGroupSnapshotTest() throws Exception {
        VolumeGroupSnapshotCreateReq body = null;
        String clusterId = null;
        VolumeGroupSnapshotResp response = api.createBlockVolumeGroupSnapshot(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete a block volume group snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteBlockVolumeGroupSnapshotTest() throws Exception {
        Long blockVolumeGroupSnapshotId = null;
        VolumeGroupSnapshotResp response = api.deleteBlockVolumeGroupSnapshot(blockVolumeGroupSnapshotId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get block volume group snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBlockVolumeGroupSnapshotTest() throws Exception {
        Long blockVolumeGroupSnapshotId = null;
        VolumeGroupSnapshotResp response = api.getBlockVolumeGroupSnapshot(blockVolumeGroupSnapshotId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List block volume group snapshots
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listBlockVolumeGroupSnapshotsTest() throws Exception {
        String clusterId = null;
        Long blockVolumeGroupId = null;
        String name = null;
        Boolean passive = null;
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        VolumeGroupSnapshotsResp response = api.listBlockVolumeGroupSnapshots(clusterId, blockVolumeGroupId, name, passive, limit, offset, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update block volume group snapshot
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateBlockVolumeGroupSnapshotTest() throws Exception {
        VolumeGroupSnapshotUpdateReq body = null;
        Long blockVolumeGroupSnapshotId = null;
        VolumeGroupSnapshotResp response = api.updateBlockVolumeGroupSnapshot(body, blockVolumeGroupSnapshotId);

        // TODO: test validations
    }
}
