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

import xio.sds.client.model.ExtCompatConfResp;
import xio.sds.client.model.SetExtCompatConfReq;
import xio.sds.client.model.SetExtCompatConfResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ExtCompatConfigsApi
 */
@Ignore
public class ExtCompatConfigsApiTest {

    private final ExtCompatConfigsApi api = new ExtCompatConfigsApi();

    /**
     * 
     *
     * list ext compat conf
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listExtCompatConfTest() throws Exception {
        String extName = null;
        String funcName = null;
        String policy = null;
        Long hostId = null;
        ExtCompatConfResp response = api.listExtCompatConf(extName, funcName, policy, hostId);

        // TODO: test validations
    }
    /**
     * 
     *
     * set ext compat conf
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setExtCompatConfTest() throws Exception {
        SetExtCompatConfReq body = null;
        SetExtCompatConfResp response = api.setExtCompatConf(body);

        // TODO: test validations
    }
}
