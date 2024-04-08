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

import xio.sds.client.model.OspGatewayCreateReq;
import xio.sds.client.model.OspGatewayResp;
import xio.sds.client.model.OspGatewaySamplesResp;
import xio.sds.client.model.OspGatewaysResp;
import xio.sds.client.model.OspZoneStatResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OspGatewaysApi
 */
@Ignore
public class OspGatewaysApiTest {

    private final OspGatewaysApi api = new OspGatewaysApi();

    /**
     * 
     *
     * Create osp gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOspGatewayTest() throws Exception {
        OspGatewayCreateReq body = null;
        OspGatewayResp response = api.createOspGateway(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete osp gateway or gateways
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOspGatewayTest() throws Exception {
        String ospGatewayId = null;
        OspGatewayResp response = api.deleteOspGateway(ospGatewayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get osp gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOspGatewayTest() throws Exception {
        Long ospGatewayId = null;
        OspGatewayResp response = api.getOspGateway(ospGatewayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get osp gateway&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOspGatewaySamplesTest() throws Exception {
        Long ospGatewayId = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        OspGatewaySamplesResp response = api.getOspGatewaySamples(ospGatewayId, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * calculate osp gateways stat by zone
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOspGatewaysStatSumByZoneTest() throws Exception {
        Long ospZoneId = null;
        String clusterId = null;
        OspZoneStatResp response = api.getOspGatewaysStatSumByZone(ospZoneId, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List osp gateways
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listOspGatewaysTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String clusterId = null;
        Long ospZoneId = null;
        String gatewayName = null;
        String role = null;
        OspGatewaysResp response = api.listOspGateways(limit, offset, clusterId, ospZoneId, gatewayName, role);

        // TODO: test validations
    }
    /**
     * 
     *
     * Restart osp gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void restartOspGatewayTest() throws Exception {
        Long ospGatewayId = null;
        OspGatewayResp response = api.restartOspGateway(ospGatewayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Restart osp gateways
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void restartOspGatewaysTest() throws Exception {
        String clusterId = null;
        api.restartOspGateways(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Start osp gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void startOspGatewayTest() throws Exception {
        Long ospGatewayId = null;
        OspGatewayResp response = api.startOspGateway(ospGatewayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Stop osp gateway or gateways
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void stopOspGatewayTest() throws Exception {
        String ospGatewayId = null;
        OspGatewayResp response = api.stopOspGateway(ospGatewayId);

        // TODO: test validations
    }
}
