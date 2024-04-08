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

import xio.sds.client.model.FCPortClientCodesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FcPortClientCodesApi
 */
@Ignore
public class FcPortClientCodesApiTest {

    private final FcPortClientCodesApi api = new FcPortClientCodesApi();

    /**
     * 
     *
     * List fc port client codes
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listFCPortClientCodesTest() throws Exception {
        Boolean unused = null;
        Long limit = null;
        Long offset = null;
        FCPortClientCodesResp response = api.listFCPortClientCodes(unused, limit, offset);

        // TODO: test validations
    }
}