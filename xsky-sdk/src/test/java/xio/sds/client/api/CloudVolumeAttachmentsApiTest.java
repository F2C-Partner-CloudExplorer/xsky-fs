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

import xio.sds.client.model.CloudVolumeAttachmentsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CloudVolumeAttachmentsApi
 */
@Ignore
public class CloudVolumeAttachmentsApiTest {

    private final CloudVolumeAttachmentsApi api = new CloudVolumeAttachmentsApi();

    /**
     * 
     *
     * List cloud volume attachments
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listCloudVolumeAttachmentsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        Long cloudInstanceId = null;
        CloudVolumeAttachmentsResp response = api.listCloudVolumeAttachments(limit, offset, cloudInstanceId);

        // TODO: test validations
    }
}
