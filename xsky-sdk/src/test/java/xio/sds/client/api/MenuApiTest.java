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

import xio.sds.client.model.MenuResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for MenuApi
 */
@Ignore
public class MenuApiTest {

    private final MenuApi api = new MenuApi();

    /**
     * 
     *
     * delete the menu for the user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteMenuTest() throws Exception {
        String type = null;
        Long userId = null;
        MenuResp response = api.deleteMenu(type, userId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get the menu info of current user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getMenuTest() throws Exception {
        String type = null;
        MenuResp response = api.getMenu(type);

        // TODO: test validations
    }
    /**
     * 
     *
     * update the latest menu info of current user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateMenuTest() throws Exception {
        String type = null;
        MenuResp response = api.updateMenu(type);

        // TODO: test validations
    }
}
