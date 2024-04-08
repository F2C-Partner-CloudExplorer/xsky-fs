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

import xio.sds.client.model.OSReplicationPathResp;
import xio.sds.client.model.OSReplicationPathsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OsReplicationPathsApi
 */
@Ignore
public class OsReplicationPathsApiTest {

    private final OsReplicationPathsApi api = new OsReplicationPathsApi();

    /**
     * 
     *
     * Get a os replication path
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOSReplicationPathTest() throws Exception {
        String pathUuid = null;
        OSReplicationPathResp response = api.getOSReplicationPath(pathUuid);

        // TODO: test validations
    }
    /**
     * 
     *
     * List os replication paths
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listOSReplicationPathsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String marker = null;
        String replicationUuid = null;
        Boolean allowUnknownZone = null;
        String clusterId = null;
        OSReplicationPathsResp response = api.listOSReplicationPaths(limit, offset, marker, replicationUuid, allowUnknownZone, clusterId);

        // TODO: test validations
    }
}