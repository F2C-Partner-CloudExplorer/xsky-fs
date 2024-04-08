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

import xio.sds.client.model.DfsGatewayZoneCreateReq;
import xio.sds.client.model.DfsGatewayZoneResp;
import xio.sds.client.model.DfsGatewayZoneSamplesResp;
import xio.sds.client.model.DfsGatewayZoneUpdateReq;
import xio.sds.client.model.DfsGatewayZonesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsGatewayZonesApi
 */
@Ignore
public class DfsGatewayZonesApiTest {

    private final DfsGatewayZonesApi api = new DfsGatewayZonesApi();

    /**
     * 
     *
     * Create dfs gateway zone
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDfsGatewayZoneTest() throws Exception {
        DfsGatewayZoneCreateReq body = null;
        String clusterId = null;
        DfsGatewayZoneResp response = api.createDfsGatewayZone(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete dfs gateway zone
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDfsGatewayZoneTest() throws Exception {
        Long dfsGatewayZoneId = null;
        Boolean force = null;
        DfsGatewayZoneResp response = api.deleteDfsGatewayZone(dfsGatewayZoneId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get dfs gateway zone
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsGatewayZoneTest() throws Exception {
        Long dfsGatewayZoneId = null;
        DfsGatewayZoneResp response = api.getDfsGatewayZone(dfsGatewayZoneId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a dfs gateway zone&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsGatewayZoneSamplesTest() throws Exception {
        Long dfsGatewayZoneId = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        DfsGatewayZoneSamplesResp response = api.getDfsGatewayZoneSamples(dfsGatewayZoneId, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs gateway zones
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsGatewayZonesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        DfsGatewayZonesResp response = api.listDfsGatewayZones(limit, offset, q, sort, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs gateway zone
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsGatewayZoneTest() throws Exception {
        DfsGatewayZoneUpdateReq body = null;
        Long dfsGatewayZoneId = null;
        DfsGatewayZoneResp response = api.updateDfsGatewayZone(body, dfsGatewayZoneId);

        // TODO: test validations
    }
}
