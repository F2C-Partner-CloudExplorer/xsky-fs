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

import xio.sds.client.model.CloudVolumeResp;
import xio.sds.client.model.CloudVolumesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CloudVolumesApi
 */
@Ignore
public class CloudVolumesApiTest {

    private final CloudVolumesApi api = new CloudVolumesApi();

    /**
     * 
     *
     * Get a cloud volume
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCloudVolumeTest() throws Exception {
        Long cloudVolumeId = null;
        CloudVolumeResp response = api.getCloudVolume(cloudVolumeId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List cloud volumes
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listCloudVolumesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        Long cloudInstanceId = null;
        CloudVolumesResp response = api.listCloudVolumes(limit, offset, cloudInstanceId);

        // TODO: test validations
    }
}