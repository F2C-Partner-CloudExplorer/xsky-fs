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

import xio.sds.client.model.ObjectStorageGatewayCreateReq;
import xio.sds.client.model.ObjectStorageGatewayResp;
import xio.sds.client.model.ObjectStorageGatewaySamplesResp;
import xio.sds.client.model.ObjectStorageGatewayUpdateReq;
import xio.sds.client.model.ObjectStorageGatewaysResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OsGatewaysApi
 */
@Ignore
public class OsGatewaysApiTest {

    private final OsGatewaysApi api = new OsGatewaysApi();

    /**
     * 
     *
     * Create s3 gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createGatewayTest() throws Exception {
        ObjectStorageGatewayCreateReq body = null;
        String clusterId = null;
        ObjectStorageGatewayResp response = api.createGateway(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete s3 gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteGatewayTest() throws Exception {
        Long gatewayId = null;
        ObjectStorageGatewayResp response = api.deleteGateway(gatewayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get s3 gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGatewayTest() throws Exception {
        Long gatewayId = null;
        ObjectStorageGatewayResp response = api.getGateway(gatewayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get s3 gateway&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getGatewaySamplesTest() throws Exception {
        Long gatewayId = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        ObjectStorageGatewaySamplesResp response = api.getGatewaySamples(gatewayId, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * List s3 gateways
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listGatewaysTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        ObjectStorageGatewaysResp response = api.listGateways(limit, offset, q, sort, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update s3 gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateGatewayTest() throws Exception {
        ObjectStorageGatewayUpdateReq body = null;
        Long gatewayId = null;
        ObjectStorageGatewayResp response = api.updateGateway(body, gatewayId);

        // TODO: test validations
    }
}
