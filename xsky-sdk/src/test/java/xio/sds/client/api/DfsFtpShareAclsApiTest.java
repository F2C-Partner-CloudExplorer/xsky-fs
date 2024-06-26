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

import xio.sds.client.model.DfsFTPShareACLsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsFtpShareAclsApi
 */
@Ignore
public class DfsFtpShareAclsApiTest {

    private final DfsFtpShareAclsApi api = new DfsFtpShareAclsApi();

    /**
     * 
     *
     * List dfs ftp share acls
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsFTPShareACLsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String clusterId = null;
        Long dfsFtpShareId = null;
        String q = null;
        String sort = null;
        DfsFTPShareACLsResp response = api.listDfsFTPShareACLs(limit, offset, clusterId, dfsFtpShareId, q, sort);

        // TODO: test validations
    }
}
