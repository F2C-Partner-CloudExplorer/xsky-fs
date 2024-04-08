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

import xio.sds.client.model.DfsNFSShareAddACLsReq;
import xio.sds.client.model.DfsNFSShareCreateReq;
import xio.sds.client.model.DfsNFSShareRemoveACLsReq;
import xio.sds.client.model.DfsNFSShareResp;
import xio.sds.client.model.DfsNFSShareSetACLsReq;
import xio.sds.client.model.DfsNFSShareUpdateACLsReq;
import xio.sds.client.model.DfsNFSShareUpdateReq;
import xio.sds.client.model.DfsNFSSharesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsNfsSharesApi
 */
@Ignore
public class DfsNfsSharesApiTest {

    private final DfsNfsSharesApi api = new DfsNfsSharesApi();

    /**
     * 
     *
     * Add dfs nfs shares acls
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addDfsNFSShareACLsTest() throws Exception {
        DfsNFSShareAddACLsReq body = null;
        Long dfsNfsShareId = null;
        DfsNFSShareResp response = api.addDfsNFSShareACLs(body, dfsNfsShareId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create dfs nfs shares
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDfsNFSShareTest() throws Exception {
        DfsNFSShareCreateReq body = null;
        Boolean allowPathCreate = null;
        DfsNFSShareResp response = api.createDfsNFSShare(body, allowPathCreate);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete dfs nfs shares
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDfsNFSShareTest() throws Exception {
        Long dfsNfsShareId = null;
        Boolean force = null;
        Boolean withDirectory = null;
        DfsNFSShareResp response = api.deleteDfsNFSShare(dfsNfsShareId, force, withDirectory);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get dfs nfs shares
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsNFSShareTest() throws Exception {
        Long dfsNfsShareId = null;
        DfsNFSShareResp response = api.getDfsNFSShare(dfsNfsShareId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs nfs sharess
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsNFSSharesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        Long dfsRootfsId = null;
        String path = null;
        Long dfsGatewayGroupId = null;
        String nfsVersions = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        DfsNFSSharesResp response = api.listDfsNFSShares(limit, offset, dfsRootfsId, path, dfsGatewayGroupId, nfsVersions, q, sort, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * remove dfs nfs shares acls
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeDfsNFSShareACLsTest() throws Exception {
        DfsNFSShareRemoveACLsReq body = null;
        Long dfsNfsShareId = null;
        DfsNFSShareResp response = api.removeDfsNFSShareACLs(body, dfsNfsShareId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set all acls of dfs nfs share
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setDfsNFSShareACLsTest() throws Exception {
        DfsNFSShareSetACLsReq body = null;
        Long dfsNfsShareId = null;
        DfsNFSShareResp response = api.setDfsNFSShareACLs(body, dfsNfsShareId);

        // TODO: test validations
    }
    /**
     * 
     *
     * update dfs nfs shares
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsNFSShareTest() throws Exception {
        DfsNFSShareUpdateReq body = null;
        Long dfsNfsShareId = null;
        DfsNFSShareResp response = api.updateDfsNFSShare(body, dfsNfsShareId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs nfs share acls
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsNFSShareACLsTest() throws Exception {
        DfsNFSShareUpdateACLsReq body = null;
        Long dfsNfsShareId = null;
        DfsNFSShareResp response = api.updateDfsNFSShareACLs(body, dfsNfsShareId);

        // TODO: test validations
    }
}
