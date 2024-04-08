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

import xio.sds.client.model.DfsGatewayNetworkAddressResp;
import xio.sds.client.model.DfsGatewayNetworkAddressesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsGatewayNetworkAddressesApi
 */
@Ignore
public class DfsGatewayNetworkAddressesApiTest {

    private final DfsGatewayNetworkAddressesApi api = new DfsGatewayNetworkAddressesApi();

    /**
     * 
     *
     * Get dfs gateway
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsGatewayNetworkAddressTest() throws Exception {
        Long dfsGatewayNetworkAddressId = null;
        DfsGatewayNetworkAddressResp response = api.getDfsGatewayNetworkAddress(dfsGatewayNetworkAddressId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs gateway network addresses
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsGatewayNetworkAddressesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        Long dfsGatewayGroupId = null;
        Long dfsGatewayZoneId = null;
        DfsGatewayNetworkAddressesResp response = api.listDfsGatewayNetworkAddresses(limit, offset, q, sort, clusterId, dfsGatewayGroupId, dfsGatewayZoneId);

        // TODO: test validations
    }
}