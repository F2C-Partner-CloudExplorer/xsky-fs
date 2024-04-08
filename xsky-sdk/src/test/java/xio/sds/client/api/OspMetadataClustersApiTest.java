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

import xio.sds.client.model.OspMetadataClusterCreateReq;
import xio.sds.client.model.OspMetadataClusterResp;
import xio.sds.client.model.OspMetadataClusterSamplesResp;
import xio.sds.client.model.OspMetadataClusterSetNameReq;
import xio.sds.client.model.OspMetadataClusterSetStatelessNumReq;
import xio.sds.client.model.OspMetadataClusterSetStatelessServerReq;
import xio.sds.client.model.OspMetadataClusterUpdateReq;
import xio.sds.client.model.OspMetadataClustersResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OspMetadataClustersApi
 */
@Ignore
public class OspMetadataClustersApiTest {

    private final OspMetadataClustersApi api = new OspMetadataClustersApi();

    /**
     * 
     *
     * add osp metadata cluster partitions
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addPartitionsTest() throws Exception {
        OspMetadataClusterUpdateReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.addPartitions(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create new osp metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOspMetadataClusterTest() throws Exception {
        OspMetadataClusterCreateReq body = null;
        OspMetadataClusterResp response = api.createOspMetadataCluster(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete osp metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOspMetadataClusterTest() throws Exception {
        Long id = null;
        OspMetadataClusterResp response = api.deleteOspMetadataCluster(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns info a osp metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOspMetadataClusterTest() throws Exception {
        Long id = null;
        OspMetadataClusterResp response = api.getOspMetadataCluster(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get osp metadata cluster&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOspMetadataClusterSamplesTest() throws Exception {
        Long id = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        OspMetadataClusterSamplesResp response = api.getOspMetadataClusterSamples(id, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * Lists osp metadata clusters
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listOspMetadataClustersTest() throws Exception {
        Long limit = null;
        Long offset = null;
        Long clusterId = null;
        Long objectStorageId = null;
        OspMetadataClustersResp response = api.listOspMetadataClusters(limit, offset, clusterId, objectStorageId);

        // TODO: test validations
    }
    /**
     * 
     *
     * remove osp metadata cluster partitions
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removePartitionsTest() throws Exception {
        OspMetadataClusterUpdateReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.removePartitions(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * set osp metadata cluster coordinator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setCoordinatorTest() throws Exception {
        OspMetadataClusterUpdateReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setCoordinator(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * set osp metadata cluster deploy mode
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setDeployModeTest() throws Exception {
        OspMetadataClusterUpdateReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setDeployMode(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * set osp metadata cluster log services
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setLogServicesTest() throws Exception {
        OspMetadataClusterUpdateReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setLogServices(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * set osp metadata cluster metadata services
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setMetadataServicesTest() throws Exception {
        OspMetadataClusterUpdateReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setMetadataServices(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * set osp metadata cluster name
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setNameTest() throws Exception {
        OspMetadataClusterSetNameReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setName(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * set osp metadata cluster primary data center
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setPrimaryDcTest() throws Exception {
        OspMetadataClusterSetStatelessNumReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setPrimaryDc(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * set osp metadata cluster security policy
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setSecurityPolicyTest() throws Exception {
        OspMetadataClusterUpdateReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setSecurityPolicy(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * set osp metadata cluster Stateless server num
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setStatelessNumTest() throws Exception {
        OspMetadataClusterSetStatelessNumReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setStatelessNum(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set osp metadata cluster stateless server
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setStatelessServerTest() throws Exception {
        OspMetadataClusterSetStatelessServerReq body = null;
        Long id = null;
        OspMetadataClusterResp response = api.setStatelessServer(body, id);

        // TODO: test validations
    }
    /**
     * 
     *
     * upgrade osp metadata cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void upgradeOspMetadataClusterTest() throws Exception {
        Long id = null;
        OspMetadataClusterResp response = api.upgradeOspMetadataCluster(id);

        // TODO: test validations
    }
}