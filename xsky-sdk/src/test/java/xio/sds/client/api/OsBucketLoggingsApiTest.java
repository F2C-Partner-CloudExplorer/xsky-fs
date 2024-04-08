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

import xio.sds.client.model.OSBucketLoggingsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OsBucketLoggingsApi
 */
@Ignore
public class OsBucketLoggingsApiTest {

    private final OsBucketLoggingsApi api = new OsBucketLoggingsApi();

    /**
     * 
     *
     * List os bucket loggings
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listOSBucketLoggingsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String sourceBucketName = null;
        String targetBucketName = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        OSBucketLoggingsResp response = api.listOSBucketLoggings(limit, offset, sourceBucketName, targetBucketName, q, sort, clusterId);

        // TODO: test validations
    }
}
