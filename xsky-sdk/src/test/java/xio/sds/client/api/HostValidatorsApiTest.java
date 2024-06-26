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

import xio.sds.client.model.HostValidatorCreateReq;
import xio.sds.client.model.HostValidatorResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for HostValidatorsApi
 */
@Ignore
public class HostValidatorsApiTest {

    private final HostValidatorsApi api = new HostValidatorsApi();

    /**
     * 
     *
     * Create host validator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createHostValidatorTest() throws Exception {
        HostValidatorCreateReq body = null;
        HostValidatorResp response = api.createHostValidator(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get host validator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getHostValidatorTest() throws Exception {
        Long hostValidatorId = null;
        HostValidatorResp response = api.getHostValidator(hostValidatorId);

        // TODO: test validations
    }
}
