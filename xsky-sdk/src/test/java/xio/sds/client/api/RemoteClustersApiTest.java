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

import xio.sds.client.model.RemoteClusterCreateReq;
import xio.sds.client.model.RemoteClusterResp;
import xio.sds.client.model.RemoteClusterUpdateReq;
import xio.sds.client.model.RemoteClustersResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RemoteClustersApi
 */
@Ignore
public class RemoteClustersApiTest {

    private final RemoteClustersApi api = new RemoteClustersApi();

    /**
     * 
     *
     * Create a remote cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createRemoteClusterTest() throws Exception {
        RemoteClusterCreateReq body = null;
        RemoteClusterResp response = api.createRemoteCluster(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete a remote cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteRemoteClusterTest() throws Exception {
        Long clusterId = null;
        RemoteClusterResp response = api.deleteRemoteCluster(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get remote cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRemoteClusterTest() throws Exception {
        Long clusterId = null;
        RemoteClusterResp response = api.getRemoteCluster(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List remote clusters
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listRemoteClustersTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String fsId = null;
        RemoteClustersResp response = api.listRemoteClusters(limit, offset, q, sort, fsId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a remote cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRemoteClusterTest() throws Exception {
        RemoteClusterUpdateReq body = null;
        Long clusterId = null;
        RemoteClusterResp response = api.updateRemoteCluster(body, clusterId);

        // TODO: test validations
    }
}
