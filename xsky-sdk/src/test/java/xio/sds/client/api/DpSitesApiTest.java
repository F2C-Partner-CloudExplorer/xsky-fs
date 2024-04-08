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

import xio.sds.client.model.DpBackupBlockSnapshotsResp;
import xio.sds.client.model.DpBackupBlockVolumesResp;
import xio.sds.client.model.DpBackupClustersResp;
import xio.sds.client.model.DpSiteCreateReq;
import xio.sds.client.model.DpSiteResp;
import xio.sds.client.model.DpSiteUpdateReq;
import xio.sds.client.model.DpSitesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DpSitesApi
 */
@Ignore
public class DpSitesApiTest {

    private final DpSitesApi api = new DpSitesApi();

    /**
     * 
     *
     * Create a data protection site
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDpSiteTest() throws Exception {
        DpSiteCreateReq body = null;
        DpSiteResp response = api.createDpSite(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete data protection site
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDpSiteTest() throws Exception {
        Long siteId = null;
        api.deleteDpSite(siteId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List snapshots of a volume stored on a dp site
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBackupBlockSnapshotsTest() throws Exception {
        Long siteId = null;
        Long dpGatewayId = null;
        String clusterFsId = null;
        String blockVolumeName = null;
        String after = null;
        DpBackupBlockSnapshotsResp response = api.getBackupBlockSnapshots(siteId, dpGatewayId, clusterFsId, blockVolumeName, after);

        // TODO: test validations
    }
    /**
     * 
     *
     * List volumes of a cluster stored on a dp site
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBackupBlockVolumesTest() throws Exception {
        Long siteId = null;
        Long dpGatewayId = null;
        String clusterFsId = null;
        String after = null;
        DpBackupBlockVolumesResp response = api.getBackupBlockVolumes(siteId, dpGatewayId, clusterFsId, after);

        // TODO: test validations
    }
    /**
     * 
     *
     * List clusters stored on a dp site
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBackupClustersTest() throws Exception {
        Long siteId = null;
        Long dpGatewayId = null;
        DpBackupClustersResp response = api.getBackupClusters(siteId, dpGatewayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get data protection site
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDpSiteTest() throws Exception {
        Long siteId = null;
        DpSiteResp response = api.getDpSite(siteId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List data protection sites
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDpSitesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String protectionType = null;
        DpSitesResp response = api.listDpSites(limit, offset, q, sort, protectionType);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a data protection site
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDpSiteTest() throws Exception {
        DpSiteUpdateReq body = null;
        Long siteId = null;
        DpSiteResp response = api.updateDpSite(body, siteId);

        // TODO: test validations
    }
}
