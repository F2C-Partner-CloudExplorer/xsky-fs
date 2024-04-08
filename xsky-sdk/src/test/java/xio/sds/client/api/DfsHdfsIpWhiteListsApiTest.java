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

import xio.sds.client.model.DfsHdfsIPWhiteListsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsHdfsIpWhiteListsApi
 */
@Ignore
public class DfsHdfsIpWhiteListsApiTest {

    private final DfsHdfsIpWhiteListsApi api = new DfsHdfsIpWhiteListsApi();

    /**
     * 
     *
     * List dfs hdfs ip white list
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsHdfsIPWhiteListTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String clusterId = null;
        Long dfsHdfsId = null;
        String permission = null;
        String q = null;
        String sort = null;
        DfsHdfsIPWhiteListsResp response = api.listDfsHdfsIPWhiteList(limit, offset, clusterId, dfsHdfsId, permission, q, sort);

        // TODO: test validations
    }
}