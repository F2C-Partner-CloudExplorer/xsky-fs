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

import xio.sds.client.model.DfsSMBShareACLsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsSmbShareAclsApi
 */
@Ignore
public class DfsSmbShareAclsApiTest {

    private final DfsSmbShareAclsApi api = new DfsSmbShareAclsApi();

    /**
     * 
     *
     * List dfs smb share acls
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsSMBShareACLsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String clusterId = null;
        Long dfsSmbShareId = null;
        String q = null;
        String sort = null;
        DfsSMBShareACLsResp response = api.listDfsSMBShareACLs(limit, offset, clusterId, dfsSmbShareId, q, sort);

        // TODO: test validations
    }
}