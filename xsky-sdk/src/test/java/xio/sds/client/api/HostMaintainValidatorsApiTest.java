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

import xio.sds.client.model.HostMaintainValidatorCreateReq;
import xio.sds.client.model.HostMaintainValidatorResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for HostMaintainValidatorsApi
 */
@Ignore
public class HostMaintainValidatorsApiTest {

    private final HostMaintainValidatorsApi api = new HostMaintainValidatorsApi();

    /**
     * 
     *
     * Create host maintain validator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createHostMaintainValidatorTest() throws Exception {
        HostMaintainValidatorCreateReq body = null;
        HostMaintainValidatorResp response = api.createHostMaintainValidator(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get host maintain validator
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getHostMaintainValidatorTest() throws Exception {
        Long hostMaintainValidatorId = null;
        HostMaintainValidatorResp response = api.getHostMaintainValidator(hostMaintainValidatorId);

        // TODO: test validations
    }
}
