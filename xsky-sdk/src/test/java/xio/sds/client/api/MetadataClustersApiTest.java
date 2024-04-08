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

import xio.sds.client.model.MetadataClusterAddServicesReq;
import xio.sds.client.model.MetadataClusterCreateReq;
import xio.sds.client.model.MetadataClusterPredictionsResp;
import xio.sds.client.model.MetadataClusterRemoveServicesReq;
import xio.sds.client.model.MetadataClusterResp;
import xio.sds.client.model.MetadataClusterSamplesResp;
import xio.sds.client.model.MetadataClusterUpdatePrimaryDcReq;
import xio.sds.client.model.MetadataClusterUpdateReq;
import xio.sds.client.model.MetadataClustersResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MetadataClustersApi
 */
@Ignore
public class MetadataClustersApiTest {

    private final MetadataClustersApi api = new MetadataClustersApi();

    /**
     * 
     *
     * Add metadata services to cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addMetadataServicesToClusterTest() throws Exception {
        MetadataClusterAddServicesReq body = null;
        Long metadataClusterId = null;
        MetadataClusterResp response = api.addMetadataServicesToCluster(body, metadataClusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create metadata cluster on specific disk
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createMetadataClusterTest() throws Exception {
        MetadataClusterCreateReq body = null;
        String clusterId = null;
        MetadataClusterResp response = api.createMetadataCluster(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete a metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMetadataClusterTest() throws Exception {
        Long metadataClusterId = null;
        MetadataClusterResp response = api.deleteMetadataCluster(metadataClusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMetadataClusterTest() throws Exception {
        Long metadataClusterId = null;
        MetadataClusterResp response = api.getMetadataCluster(metadataClusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a metadata cluster&#x27;s prediction
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMetadataClusterPredictionsTest() throws Exception {
        Long metadataClusterId = null;
        MetadataClusterPredictionsResp response = api.getMetadataClusterPredictions(metadataClusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get samples of a metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMetadataClusterSamplesTest() throws Exception {
        Long metadataClusterId = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        MetadataClusterSamplesResp response = api.getMetadataClusterSamples(metadataClusterId, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * List all metadata clusters in the cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listMetadataClustersTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String clusterId = null;
        Long hostId = null;
        Long metadataClusterId = null;
        String q = null;
        String sort = null;
        MetadataClustersResp response = api.listMetadataClusters(limit, offset, clusterId, hostId, metadataClusterId, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove metadata services from cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeMetadataServicesFromClusterTest() throws Exception {
        MetadataClusterRemoveServicesReq body = null;
        Long metadataClusterId = null;
        MetadataClusterResp response = api.removeMetadataServicesFromCluster(body, metadataClusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * set metadata cluster to stretched
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setMetadataClusterToStretchedTest() throws Exception {
        Long metadataClusterId = null;
        MetadataClusterResp response = api.setMetadataClusterToStretched(metadataClusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * update metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateMetadataClusterTest() throws Exception {
        MetadataClusterUpdateReq body = null;
        Long metadataClusterId = null;
        MetadataClusterResp response = api.updateMetadataCluster(body, metadataClusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * update primary datacenter of metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePrimaryDcTest() throws Exception {
        MetadataClusterUpdatePrimaryDcReq body = null;
        Long metadataClusterId = null;
        MetadataClusterResp response = api.updatePrimaryDc(body, metadataClusterId);

        // TODO: test validations
    }
}
