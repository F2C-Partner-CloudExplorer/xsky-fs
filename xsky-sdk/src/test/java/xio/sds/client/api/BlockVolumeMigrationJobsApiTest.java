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

import xio.sds.client.model.BlockVolumeMigrationJobResp;
import xio.sds.client.model.BlockVolumeMigrationJobsResp;
import xio.sds.client.model.BlockVolumeUpdateMigrationReq;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for BlockVolumeMigrationJobsApi
 */
@Ignore
public class BlockVolumeMigrationJobsApiTest {

    private final BlockVolumeMigrationJobsApi api = new BlockVolumeMigrationJobsApi();

    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelBlockVolumeMigrationJobTest() throws Exception {
        Long blockVolumeMigrationJobId = null;
        BlockVolumeMigrationJobResp response = api.cancelBlockVolumeMigrationJob(blockVolumeMigrationJobId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get a volume migration job
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getBlockVolumeMigrationJobTest() throws Exception {
        Long blockVolumeMigrationJobId = null;
        BlockVolumeMigrationJobResp response = api.getBlockVolumeMigrationJob(blockVolumeMigrationJobId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List volume migration jobs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listBlockVolumeMigrationJobsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String status = null;
        String q = null;
        String sort = null;
        BlockVolumeMigrationJobsResp response = api.listBlockVolumeMigrationJobs(limit, offset, status, q, sort);

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
    public void updateMigrationTest() throws Exception {
        BlockVolumeUpdateMigrationReq body = null;
        Long blockVolumeMigrationJobId = null;
        BlockVolumeMigrationJobResp response = api.updateMigration(body, blockVolumeMigrationJobId);

        // TODO: test validations
    }
}
