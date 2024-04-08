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

import xio.sds.client.model.DomainUsersResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DomainUsersApi
 */
@Ignore
public class DomainUsersApiTest {

    private final DomainUsersApi api = new DomainUsersApi();

    /**
     * 
     *
     * delete domain user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteDomainUserTest() throws Exception {
        Long domainUserId = null;
        api.deleteDomainUser(domainUserId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List domain users
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDomainUsersTest() throws Exception {
        Long limit = null;
        Long offset = null;
        DomainUsersResp response = api.listDomainUsers(limit, offset);

        // TODO: test validations
    }
}
