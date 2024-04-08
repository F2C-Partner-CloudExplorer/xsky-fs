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

import xio.sds.client.model.DfsGatewayConnectionsResp;
import xio.sds.client.model.DfsGatewayResp;
import xio.sds.client.model.DfsGatewaySamplesResp;
import xio.sds.client.model.DfsGatewaysResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsGatewaysApi
 */
@Ignore
public class DfsGatewaysApiTest {

    private final DfsGatewaysApi api = new DfsGatewaysApi();

    /**
     * 
     *
     * Get dfs gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsGatewayTest() throws Exception {
        Long dfsGatewayId = null;
        DfsGatewayResp response = api.getDfsGateway(dfsGatewayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a dfs gateway&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsGatewaySamplesTest() throws Exception {
        Long dfsGatewayId = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        DfsGatewaySamplesResp response = api.getDfsGatewaySamples(dfsGatewayId, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * list client connections of dfs gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsGatewayConnectionsTest() throws Exception {
        Long dfsGatewayId = null;
        String types = null;
        DfsGatewayConnectionsResp response = api.listDfsGatewayConnections(dfsGatewayId, types);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs gateways
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsGatewaysTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        Long dfsGatewayGroupId = null;
        DfsGatewaysResp response = api.listDfsGateways(limit, offset, q, sort, clusterId, dfsGatewayGroupId);

        // TODO: test validations
    }
}
