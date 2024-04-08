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

import xio.sds.client.model.RoleMappingCreateReq;
import xio.sds.client.model.RoleMappingResp;
import xio.sds.client.model.RoleMappingUpdateReq;
import xio.sds.client.model.RoleMappingsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RoleMappingsApi
 */
@Ignore
public class RoleMappingsApiTest {

    private final RoleMappingsApi api = new RoleMappingsApi();

    /**
     * 
     *
     * Create role mapping
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createRoleMappingTest() throws Exception {
        RoleMappingCreateReq body = null;
        RoleMappingResp response = api.createRoleMapping(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete role mapping
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteRoleMappingTest() throws Exception {
        Long roleMappingId = null;
        api.deleteRoleMapping(roleMappingId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get a role mapping
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRoleMappingTest() throws Exception {
        Long roleMappingId = null;
        RoleMappingResp response = api.getRoleMapping(roleMappingId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List role mappings
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listRoleMappingsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        Long identityPlatformId = null;
        RoleMappingsResp response = api.listRoleMappings(limit, offset, identityPlatformId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a role mapping
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRoleMappingTest() throws Exception {
        RoleMappingUpdateReq body = null;
        Long roleMappingId = null;
        RoleMappingResp response = api.updateRoleMapping(body, roleMappingId);

        // TODO: test validations
    }
}