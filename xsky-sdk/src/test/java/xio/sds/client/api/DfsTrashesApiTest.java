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

import xio.sds.client.model.DfsTrashFileJobResp;
import xio.sds.client.model.DfsTrashFilesResp;
import xio.sds.client.model.DfsTrashOpenReq;
import xio.sds.client.model.DfsTrashRemoveFileReq;
import xio.sds.client.model.DfsTrashResp;
import xio.sds.client.model.DfsTrashRestoreFileReq;
import xio.sds.client.model.DfsTrashUpdateReq;
import xio.sds.client.model.DfsTrashesResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DfsTrashesApi
 */
@Ignore
public class DfsTrashesApiTest {

    private final DfsTrashesApi api = new DfsTrashesApi();

    /**
     * 
     *
     * Close dfs trash
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void closeDfsTrashTest() throws Exception {
        Long dfsTrashId = null;
        DfsTrashResp response = api.closeDfsTrash(dfsTrashId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Empty dfs trash
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void emptyDfsTrashTest() throws Exception {
        Long dfsTrashId = null;
        Boolean force = null;
        DfsTrashResp response = api.emptyDfsTrash(dfsTrashId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get dfs trash
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getDfsTrashTest() throws Exception {
        Long dfsTrashId = null;
        DfsTrashResp response = api.getDfsTrash(dfsTrashId);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs trash file job
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsTrashFileJobsTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String clusterId = null;
        String dfsTrashId = null;
        String path = null;
        String action = null;
        DfsTrashFileJobResp response = api.listDfsTrashFileJobs(limit, offset, clusterId, dfsTrashId, path, action);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs trash files
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsTrashFilesTest() throws Exception {
        Long dfsTrashId = null;
        Long limit = null;
        String path = null;
        String start = null;
        String prefix = null;
        DfsTrashFilesResp response = api.listDfsTrashFiles(dfsTrashId, limit, path, start, prefix);

        // TODO: test validations
    }
    /**
     * 
     *
     * List dfs trashes
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listDfsTrashesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        String clusterId = null;
        String status = null;
        DfsTrashesResp response = api.listDfsTrashes(limit, offset, q, sort, clusterId, status);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create dfs trash
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void openDfsTrashTest() throws Exception {
        DfsTrashOpenReq body = null;
        Boolean allowPathCreate = null;
        DfsTrashResp response = api.openDfsTrash(body, allowPathCreate);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove dfs trash file
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeDfsTrashFileTest() throws Exception {
        DfsTrashRemoveFileReq body = null;
        Long dfsTrashId = null;
        DfsTrashFileJobResp response = api.removeDfsTrashFile(body, dfsTrashId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Restore dfs trash file
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void restoreDfsTrashFileTest() throws Exception {
        DfsTrashRestoreFileReq body = null;
        Long dfsTrashId = null;
        Boolean force = null;
        DfsTrashFileJobResp response = api.restoreDfsTrashFile(body, dfsTrashId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Search dfs trash files
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void searchDfsTrashFilesTest() throws Exception {
        Long dfsTrashId = null;
        Long limit = null;
        String path = null;
        String start = null;
        String prefix = null;
        DfsTrashFilesResp response = api.searchDfsTrashFiles(dfsTrashId, limit, path, start, prefix);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update dfs trash
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateDfsTrashTest() throws Exception {
        DfsTrashUpdateReq body = null;
        Long dfsTrashId = null;
        DfsTrashResp response = api.updateDfsTrash(body, dfsTrashId);

        // TODO: test validations
    }
}
