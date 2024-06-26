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

import xio.sds.client.model.DfsQosCreateReq;
import xio.sds.client.model.DfsQosResp;
import xio.sds.client.model.DfsQosSamplesResp;
import xio.sds.client.model.DfsQosUpdateReq;
import xio.sds.client.model.DfsQosesRecordsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsQosesApi
 */
@Ignore
public class DfsQosesApiTest {

    private final DfsQosesApi api = new DfsQosesApi();

    /**
     * 
     *
     * Create dfs qos
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createDfsQosTest() throws Exception {
        DfsQosCreateReq body = null;
        DfsQosResp response = api.createDfsQos(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete dfs qos
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDfsQosTest() throws Exception {
        Long dfsQosId = null;
        DfsQosResp response = api.deleteDfsQos(dfsQosId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get dfs qos
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsQosTest() throws Exception {
        Long dfsQosId = null;
        DfsQosResp response = api.getDfsQos(dfsQosId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a dfs qos&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsQosSamplesTest() throws Exception {
        Long dfsQosId = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        DfsQosSamplesResp response = api.getDfsQosSamples(dfsQosId, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs qoses
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsQosesTest() throws Exception {
        Long policyId = null;
        String path = null;
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        DfsQosesRecordsResp response = api.listDfsQoses(policyId, path, limit, offset, q, sort, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs qos
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsQosTest() throws Exception {
        DfsQosUpdateReq body = null;
        Long dfsQosId = null;
        String clusterId = null;
        DfsQosResp response = api.updateDfsQos(body, dfsQosId, clusterId);

        // TODO: test validations
    }
}
