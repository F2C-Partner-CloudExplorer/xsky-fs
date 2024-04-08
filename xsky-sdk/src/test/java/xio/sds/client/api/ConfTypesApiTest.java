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

import xio.sds.client.model.ConfTypesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ConfTypesApi
 */
@Ignore
public class ConfTypesApiTest {

    private final ConfTypesApi api = new ConfTypesApi();

    /**
     * 
     *
     * List conf types
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listConfTypesTest() throws Exception {
        String clusterId = null;
        ConfTypesResp response = api.listConfTypes(clusterId);

        // TODO: test validations
    }
}
