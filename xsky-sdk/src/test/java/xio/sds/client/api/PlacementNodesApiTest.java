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

import xio.sds.client.model.PlacementNodeCreateReq;
import xio.sds.client.model.PlacementNodeResp;
import xio.sds.client.model.PlacementNodeTopologyResp;
import xio.sds.client.model.PlacementNodeUpdateReq;
import xio.sds.client.model.PlacementNodesResp;
import xio.sds.client.model.TopologyFromOsdReq;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for PlacementNodesApi
 */
@Ignore
public class PlacementNodesApiTest {

    private final PlacementNodesApi api = new PlacementNodesApi();

    /**
     * 
     *
     * Create placement node
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPlacementNodeTest() throws Exception {
        PlacementNodeCreateReq body = null;
        PlacementNodeResp response = api.createPlacementNode(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete placement node
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePlacementNodeTest() throws Exception {
        Long placementNodeId = null;
        api.deletePlacementNode(placementNodeId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get placement node
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPlacementNodeTest() throws Exception {
        Long placementNodeId = null;
        PlacementNodeResp response = api.getPlacementNode(placementNodeId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get subtree topology of placement node
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPlacementNodeTopologyTest() throws Exception {
        Long placementNodeId = null;
        String clusterId = null;
        String osdType = null;
        String osdRole = null;
        Boolean withCompound = null;
        Boolean withHybrid = null;
        PlacementNodeTopologyResp response = api.getPlacementNodeTopology(placementNodeId, clusterId, osdType, osdRole, withCompound, withHybrid);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get topology from osds
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTopologyFromOsdsTest() throws Exception {
        TopologyFromOsdReq body = null;
        PlacementNodeTopologyResp response = api.getTopologyFromOsds(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * List placement nodes
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listPlacementNodesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String type = null;
        Long parentId = null;
        PlacementNodesResp response = api.listPlacementNodes(limit, offset, type, parentId);

        // TODO: test validations
    }
    /**
     * 
     *
     * update placement node
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePlacementNodeTest() throws Exception {
        PlacementNodeUpdateReq body = null;
        Long placementNodeId = null;
        PlacementNodeResp response = api.updatePlacementNode(body, placementNodeId);

        // TODO: test validations
    }
}
