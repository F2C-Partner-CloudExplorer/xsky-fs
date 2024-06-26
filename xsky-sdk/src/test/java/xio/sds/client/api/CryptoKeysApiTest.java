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

import xio.sds.client.model.CryptoKeyResp;
import xio.sds.client.model.CryptoKeyUpdateReq;
import xio.sds.client.model.CryptoKeysResp;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CryptoKeysApi
 */
@Ignore
public class CryptoKeysApiTest {

    private final CryptoKeysApi api = new CryptoKeysApi();

    /**
     * 
     *
     * Create a crypto key
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createCryptoKeyTest() throws Exception {
        String name = null;
        String key = null;
        CryptoKeyResp response = api.createCryptoKey(name, key);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadCryptoKeyTest() throws Exception {
        Long keyId = null;
        String password = null;
        File response = api.downloadCryptoKey(keyId, password);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get a crypto key
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCryptoKeyTest() throws Exception {
        Long keyId = null;
        CryptoKeyResp response = api.getCryptoKey(keyId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List crypto keys
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listCryptoKeysTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        CryptoKeysResp response = api.listCryptoKeys(limit, offset, q, sort);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update a crypto key
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateCryptoKeyTest() throws Exception {
        CryptoKeyUpdateReq body = null;
        Long keyId = null;
        CryptoKeyResp response = api.updateCryptoKey(body, keyId);

        // TODO: test validations
    }
}
