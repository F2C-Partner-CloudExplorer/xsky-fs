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

import xio.sds.client.model.FSUserCreateReq;
import xio.sds.client.model.FSUserResp;
import xio.sds.client.model.FSUserUpdateReq;
import xio.sds.client.model.FSUserUpdateSecondaryGroupsReq;
import xio.sds.client.model.FSUserVerifyReq;
import xio.sds.client.model.FSUsersResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for FsUsersApi
 */
@Ignore
public class FsUsersApiTest {

    private final FsUsersApi api = new FsUsersApi();

    /**
     * 
     *
     * create file storage user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createFSUserTest() throws Exception {
        FSUserCreateReq body = null;
        String clusterId = null;
        Boolean allowPathCreate = null;
        FSUserResp response = api.createFSUser(body, clusterId, allowPathCreate);

        // TODO: test validations
    }
    /**
     * 
     *
     * delete file storage user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteFSUserTest() throws Exception {
        Long fsUserId = null;
        api.deleteFSUser(fsUserId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get file storage user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFSUserTest() throws Exception {
        Long fsUserId = null;
        FSUserResp response = api.getFSUser(fsUserId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List file storage users
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listFSUsersTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        String security = null;
        Long fsUserGroupId = null;
        Long notFsUserGroupId = null;
        Long notDfsSmbShareId = null;
        Long notDfsHdfsId = null;
        Boolean notDfsFtpShare = null;
        Long dfsGatewayGroupId = null;
        Boolean s3Enabled = null;
        Long userId = null;
        FSUsersResp response = api.listFSUsers(limit, offset, q, sort, clusterId, security, fsUserGroupId, notFsUserGroupId, notDfsSmbShareId, notDfsHdfsId, notDfsFtpShare, dfsGatewayGroupId, s3Enabled, userId);

        // TODO: test validations
    }
    /**
     * 
     *
     * update file storage user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateFSUserTest() throws Exception {
        FSUserUpdateReq body = null;
        Long fsUserId = null;
        Boolean allowPathCreate = null;
        FSUserResp response = api.updateFSUser(body, fsUserId, allowPathCreate);

        // TODO: test validations
    }
    /**
     * 
     *
     * update file storage user secondary group and primary group
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateFSUserSecondaryGroupsTest() throws Exception {
        FSUserUpdateSecondaryGroupsReq body = null;
        Long fsUserId = null;
        FSUserResp response = api.updateFSUserSecondaryGroups(body, fsUserId);

        // TODO: test validations
    }
    /**
     * 
     *
     * verify fs user password
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void verifyFSUserTest() throws Exception {
        FSUserVerifyReq body = null;
        FSUserResp response = api.verifyFSUser(body);

        // TODO: test validations
    }
}
