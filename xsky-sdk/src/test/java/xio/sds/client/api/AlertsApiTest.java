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

import xio.sds.client.model.AlertActionReq;
import xio.sds.client.model.AlertResp;
import xio.sds.client.model.AlertStatsResp;
import xio.sds.client.model.AlertsActionReq;
import xio.sds.client.model.AlertsResolveReq;
import xio.sds.client.model.AlertsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AlertsApi
 */
@Ignore
public class AlertsApiTest {

    private final AlertsApi api = new AlertsApi();

    /**
     * 
     *
     * count all alert
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void countAlertsTest() throws Exception {
        Boolean acked = null;
        Boolean resolved = null;
        String resourceType = null;
        Long resourceId = null;
        AlertStatsResp response = api.countAlerts(acked, resolved, resourceType, resourceId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete alert
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAlertTest() throws Exception {
        Long alertId = null;
        api.deleteAlert(alertId);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete alerts
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAlertsTest() throws Exception {
        String before = null;
        api.deleteAlerts(before);

        // TODO: test validations
    }
    /**
     * 
     *
     * set the ack status of alert
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void doAlertTest() throws Exception {
        AlertActionReq body = null;
        Long alertId = null;
        AlertResp response = api.doAlert(body, alertId);

        // TODO: test validations
    }
    /**
     * 
     *
     * set the ack status of alerts
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void doAlertsTest() throws Exception {
        AlertsActionReq body = null;
        api.doAlerts(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a alert
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlertTest() throws Exception {
        Long alertId = null;
        AlertResp response = api.getAlert(alertId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List all alerts
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listAlertsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String resourceType = null;
        Long resourceId = null;
        String alertType = null;
        Boolean acked = null;
        Boolean resolved = null;
        String resolveType = null;
        String level = null;
        String durationBegin = null;
        String durationEnd = null;
        Long durationLimit = null;
        Long durationOffset = null;
        String q = null;
        String relatedResource = null;
        String sort = null;
        AlertsResp response = api.listAlerts(limit, offset, resourceType, resourceId, alertType, acked, resolved, resolveType, level, durationBegin, durationEnd, durationLimit, durationOffset, q, relatedResource, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * set the resolved status of alert
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void resolveAlertTest() throws Exception {
        Long alertId = null;
        AlertResp response = api.resolveAlert(alertId);

        // TODO: test validations
    }
    /**
     * 
     *
     * resolve alerts of specific group or resource type
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void resolveAlertsTest() throws Exception {
        AlertsResolveReq body = null;
        api.resolveAlerts(body);

        // TODO: test validations
    }
}
