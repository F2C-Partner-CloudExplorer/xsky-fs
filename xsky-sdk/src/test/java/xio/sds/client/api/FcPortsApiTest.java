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

import xio.sds.client.model.FCPortResp;
import xio.sds.client.model.FCPortsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FcPortsApi
 */
@Ignore
public class FcPortsApiTest {

    private final FcPortsApi api = new FcPortsApi();

    /**
     * 
     *
     * Clear fc port errcode
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void clearFCPortErrCodeTest() throws Exception {
        Long fcPortId = null;
        FCPortResp response = api.clearFCPortErrCode(fcPortId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get fc port
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFCPortTest() throws Exception {
        Long fcPortId = null;
        FCPortResp response = api.getFCPort(fcPortId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List fc ports
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listFCPortsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String clusterId = null;
        String q = null;
        String sort = null;
        FCPortsResp response = api.listFCPorts(limit, offset, clusterId, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Reset fc port
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void resetFCPortTest() throws Exception {
        Long fcPortId = null;
        FCPortResp response = api.resetFCPort(fcPortId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set fc port
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setFCPortTest() throws Exception {
        Long fcPortId = null;
        FCPortResp response = api.setFCPort(fcPortId);

        // TODO: test validations
    }
}
