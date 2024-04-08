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

import xio.sds.client.model.AlertRuleResourceBlacklistResp;
import xio.sds.client.model.AlertRuleResp;
import xio.sds.client.model.AlertRuleSchemaResp;
import xio.sds.client.model.AlertRuleUpdateReq;
import xio.sds.client.model.AlertRulesResp;
import xio.sds.client.model.UpdateAlertRuleResourceBlacklistReq;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AlertRulesApi
 */
@Ignore
public class AlertRulesApiTest {

    private final AlertRulesApi api = new AlertRulesApi();

    /**
     * 
     *
     * create resource blacklist of alert rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createAlertRuleResourceBlacklistTest() throws Exception {
        UpdateAlertRuleResourceBlacklistReq body = null;
        Long ruleId = null;
        AlertRuleResourceBlacklistResp response = api.createAlertRuleResourceBlacklist(body, ruleId);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete alert rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAlertRuleTest() throws Exception {
        Long ruleId = null;
        api.deleteAlertRule(ruleId);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete resource blacklist of alert rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteAlertRuleResourceBlacklistTest() throws Exception {
        UpdateAlertRuleResourceBlacklistReq body = null;
        Long ruleId = null;
        api.deleteAlertRuleResourceBlacklist(body, ruleId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get alert rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlertRuleTest() throws Exception {
        Long ruleId = null;
        AlertRuleResp response = api.getAlertRule(ruleId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get alert rule schema
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlertRuleSchemaTest() throws Exception {
        AlertRuleSchemaResp response = api.getAlertRuleSchema();

        // TODO: test validations
    }
    /**
     * 
     *
     * Get report of alert rules
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlertRulesReportTest() throws Exception {
        String resourceType = null;
        String groupName = null;
        String level = null;
        Boolean enabled = null;
        String basicType = null;
        api.getAlertRulesReport(resourceType, groupName, level, enabled, basicType);

        // TODO: test validations
    }
    /**
     * 
     *
     * List all blacklist of alert rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listAlertRuleResourceBlacklistTest() throws Exception {
        Long ruleId = null;
        String blacklist = null;
        Long limit = null;
        Long offset = null;
        AlertRuleResourceBlacklistResp response = api.listAlertRuleResourceBlacklist(ruleId, blacklist, limit, offset);

        // TODO: test validations
    }
    /**
     * 
     *
     * List all alert rules
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listAlertRulesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        Long alertGroupId = null;
        String resourceType = null;
        String groupName = null;
        String level = null;
        Boolean enabled = null;
        String q = null;
        String sort = null;
        String basicType = null;
        AlertRulesResp response = api.listAlertRules(limit, offset, alertGroupId, resourceType, groupName, level, enabled, q, sort, basicType);

        // TODO: test validations
    }
    /**
     * 
     *
     * set alert rule
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateAlertRuleTest() throws Exception {
        AlertRuleUpdateReq body = null;
        Long ruleId = null;
        AlertRuleResp response = api.updateAlertRule(body, ruleId);

        // TODO: test validations
    }
}