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

import xio.sds.client.model.ClientLunMappingResp;
import xio.sds.client.model.ClientLunMappingsResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ClientLunMappingsApi
 */
@Ignore
public class ClientLunMappingsApiTest {

    private final ClientLunMappingsApi api = new ClientLunMappingsApi();

    /**
     * 
     *
     * get a client lun mapping
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getClientLunMappingTest() throws Exception {
        Long clientLunMappingId = null;
        Boolean isFetchLunInfo = null;
        ClientLunMappingResp response = api.getClientLunMapping(clientLunMappingId, isFetchLunInfo);

        // TODO: test validations
    }
    /**
     * 
     *
     * List client lun mappings
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listClientLunMappingsTest() throws Exception {
        Long mappingGroupId = null;
        Long limit = null;
        Long offset = null;
        ClientLunMappingsResp response = api.listClientLunMappings(mappingGroupId, limit, offset);

        // TODO: test validations
    }
}
