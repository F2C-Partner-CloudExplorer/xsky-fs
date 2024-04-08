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

import xio.sds.client.model.DfsHdfsAddACLsReq;
import xio.sds.client.model.DfsHdfsAddIPWhiteListReq;
import xio.sds.client.model.DfsHdfsAddProxyUsersReq;
import xio.sds.client.model.DfsHdfsCreateReq;
import xio.sds.client.model.DfsHdfsRemoveACLsReq;
import xio.sds.client.model.DfsHdfsRemoveIPWhiteListReq;
import xio.sds.client.model.DfsHdfsRemoveProxyUsersReq;
import xio.sds.client.model.DfsHdfsResp;
import xio.sds.client.model.DfsHdfsUpdateACLsReq;
import xio.sds.client.model.DfsHdfsUpdateIPWhiteListsReq;
import xio.sds.client.model.DfsHdfsUpdateProxyUsersReq;
import xio.sds.client.model.DfsHdfsUpdateReq;
import xio.sds.client.model.DfsHdfsesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsHdfsesApi
 */
@Ignore
public class DfsHdfsesApiTest {

    private final DfsHdfsesApi api = new DfsHdfsesApi();

    /**
     * 
     *
     * add dfs hdfs acls
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addDfsHdfsACLsTest() throws Exception {
        DfsHdfsAddACLsReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.addDfsHdfsACLs(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * add dfs hdfs ip white list
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addDfsHdfsIPWhiteListsTest() throws Exception {
        DfsHdfsAddIPWhiteListReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.addDfsHdfsIPWhiteLists(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * add dfs hdfs proxy users
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addDfsHdfsProxyUsersTest() throws Exception {
        DfsHdfsAddProxyUsersReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.addDfsHdfsProxyUsers(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create dfs hdfs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDfsHdfsTest() throws Exception {
        DfsHdfsCreateReq body = null;
        Boolean allowPathCreate = null;
        DfsHdfsResp response = api.createDfsHdfs(body, allowPathCreate);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete dfs hdfs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDfsHdfsTest() throws Exception {
        Long dfsHdfsId = null;
        Boolean force = null;
        DfsHdfsResp response = api.deleteDfsHdfs(dfsHdfsId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get dfs hdfs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsHdfsTest() throws Exception {
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.getDfsHdfs(dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs hdfs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsHdfsesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String clusterId = null;
        String path = null;
        String auth = null;
        Long dfsGatewayZoneId = null;
        String q = null;
        String sort = null;
        DfsHdfsesResp response = api.listDfsHdfses(limit, offset, clusterId, path, auth, dfsGatewayZoneId, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * remove dfs hdfs acls
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeDfsHdfsACLsTest() throws Exception {
        DfsHdfsRemoveACLsReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.removeDfsHdfsACLs(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * remove dfs hdfs ip white lists
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeDfsHdfsIPWhiteListsTest() throws Exception {
        DfsHdfsRemoveIPWhiteListReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.removeDfsHdfsIPWhiteLists(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * remove dfs hdfs proxy users
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeDfsHdfsProxyUsersTest() throws Exception {
        DfsHdfsRemoveProxyUsersReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.removeDfsHdfsProxyUsers(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs hdfs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsHdfsTest() throws Exception {
        DfsHdfsUpdateReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.updateDfsHdfs(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs hdfs ACL
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsHdfsACLsTest() throws Exception {
        DfsHdfsUpdateACLsReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.updateDfsHdfsACLs(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs hdfs IP White List
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsHdfsIPWhiteListsTest() throws Exception {
        DfsHdfsUpdateIPWhiteListsReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.updateDfsHdfsIPWhiteLists(body, dfsHdfsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs hdfs proxy users
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsHdfsProxyUsersTest() throws Exception {
        DfsHdfsUpdateProxyUsersReq body = null;
        Long dfsHdfsId = null;
        DfsHdfsResp response = api.updateDfsHdfsProxyUsers(body, dfsHdfsId);

        // TODO: test validations
    }
}
