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

import xio.sds.client.model.DfsHdfsProxyUsersResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsHdfsProxyUsersApi
 */
@Ignore
public class DfsHdfsProxyUsersApiTest {

    private final DfsHdfsProxyUsersApi api = new DfsHdfsProxyUsersApi();

    /**
     * 
     *
     * List dfs hdfs proxy users
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsHdfsProxyUsersTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        Long dfsHdfsId = null;
        DfsHdfsProxyUsersResp response = api.listDfsHdfsProxyUsers(limit, offset, q, sort, clusterId, dfsHdfsId);

        // TODO: test validations
    }
}