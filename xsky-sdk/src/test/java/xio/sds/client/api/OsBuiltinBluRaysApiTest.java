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

import xio.sds.client.model.OSBuiltinBluRayCreateReq;
import xio.sds.client.model.OSBuiltinBluRayResp;
import xio.sds.client.model.OSBuiltinBluRayUpdateReq;
import xio.sds.client.model.OSBuiltinBluRaysResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OsBuiltinBluRaysApi
 */
@Ignore
public class OsBuiltinBluRaysApiTest {

    private final OsBuiltinBluRaysApi api = new OsBuiltinBluRaysApi();

    /**
     * 
     *
     * Create an os builtin blu ray
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createOSBuiltinBluRayTest() throws Exception {
        OSBuiltinBluRayCreateReq body = null;
        OSBuiltinBluRayResp response = api.createOSBuiltinBluRay(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete an os builtin blu ray
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOSBuiltinBluRayTest() throws Exception {
        Long builtinBluRayId = null;
        api.deleteOSBuiltinBluRay(builtinBluRayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get an os builtin blu ray
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOSBuiltinBluRayTest() throws Exception {
        Long builtinBluRayId = null;
        OSBuiltinBluRayResp response = api.getOSBuiltinBluRay(builtinBluRayId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List os builtin blu rays
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listOSBuiltinBluRaysTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        OSBuiltinBluRaysResp response = api.listOSBuiltinBluRays(limit, offset, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * update os builtin blu ray
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateOSBuiltinBluRayTest() throws Exception {
        OSBuiltinBluRayUpdateReq body = null;
        Long builtinBluRayId = null;
        OSBuiltinBluRayResp response = api.updateOSBuiltinBluRay(body, builtinBluRayId);

        // TODO: test validations
    }
}