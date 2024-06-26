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

import xio.sds.client.model.AlertInfoRootResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AlertInfoRootApi
 */
@Ignore
public class AlertInfoRootApiTest {

    private final AlertInfoRootApi api = new AlertInfoRootApi();

    /**
     * 
     *
     * set the acked status of all alert infos
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ackAlertInfoRootTest() throws Exception {
        AlertInfoRootResp response = api.ackAlertInfoRoot();

        // TODO: test validations
    }
    /**
     * 
     *
     * get the alert info root
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlertInfoRootTest() throws Exception {
        AlertInfoRootResp response = api.getAlertInfoRoot();

        // TODO: test validations
    }
    /**
     * 
     *
     * set the resolved status of all alert infos
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void resolveAlertInfoRootTest() throws Exception {
        AlertInfoRootResp response = api.resolveAlertInfoRoot();

        // TODO: test validations
    }
}
