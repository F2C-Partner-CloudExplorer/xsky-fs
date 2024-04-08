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

import xio.sds.client.model.DfsAuditLogResp;
import xio.sds.client.model.DfsAuditLogUpdateReq;
import xio.sds.client.model.DfsAuditLogsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsAuditLogsApi
 */
@Ignore
public class DfsAuditLogsApiTest {

    private final DfsAuditLogsApi api = new DfsAuditLogsApi();

    /**
     * 
     *
     * List dfs audit logs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsAuditLogsTest() throws Exception {
        String clusterId = null;
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        DfsAuditLogsResp response = api.listDfsAuditLogs(clusterId, limit, offset, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs audit log
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsAuditLogTest() throws Exception {
        DfsAuditLogUpdateReq body = null;
        Long dfsAuditLogId = null;
        DfsAuditLogResp response = api.updateDfsAuditLog(body, dfsAuditLogId);

        // TODO: test validations
    }
}
