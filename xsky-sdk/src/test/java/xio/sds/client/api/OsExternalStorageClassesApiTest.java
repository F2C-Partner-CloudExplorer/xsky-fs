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

import xio.sds.client.model.OSExternalStorageClassCreateReq;
import xio.sds.client.model.OSExternalStorageClassResp;
import xio.sds.client.model.OSExternalStorageClassUpdateReq;
import xio.sds.client.model.OSExternalStorageClassesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OsExternalStorageClassesApi
 */
@Ignore
public class OsExternalStorageClassesApiTest {

    private final OsExternalStorageClassesApi api = new OsExternalStorageClassesApi();

    /**
     * 
     *
     * Create os external storage class
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createExternalStorageClassTest() throws Exception {
        OSExternalStorageClassCreateReq body = null;
        String clusterId = null;
        OSExternalStorageClassResp response = api.createExternalStorageClass(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete an os external storage class
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteOSExternalStorageClassTest() throws Exception {
        Long externalStorageClassId = null;
        String clusterId = null;
        OSExternalStorageClassResp response = api.deleteOSExternalStorageClass(externalStorageClassId, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get a os external storage class
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOSExternalStorageClassTest() throws Exception {
        Long externalStorageClassId = null;
        OSExternalStorageClassResp response = api.getOSExternalStorageClass(externalStorageClassId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List os external storage classes
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listOSExternalStorageClassesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        Long osPolicyId = null;
        Boolean generalStatus = null;
        String clusterId = null;
        OSExternalStorageClassesResp response = api.listOSExternalStorageClasses(limit, offset, osPolicyId, generalStatus, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * update os external storage class
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateOSExternalStorageClassTest() throws Exception {
        OSExternalStorageClassUpdateReq body = null;
        Long externalStorageClassId = null;
        String clusterId = null;
        OSExternalStorageClassResp response = api.updateOSExternalStorageClass(body, externalStorageClassId, clusterId);

        // TODO: test validations
    }
}
