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

import xio.sds.client.model.OSZonePairsUpdateReq;
import xio.sds.client.model.ObjectStorageZoneCreateReq;
import xio.sds.client.model.ObjectStorageZoneRecordResp;
import xio.sds.client.model.ObjectStorageZoneResp;
import xio.sds.client.model.ObjectStorageZoneSamplesResp;
import xio.sds.client.model.ObjectStorageZonesRecordResp;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OsZonesApi
 */
@Ignore
public class OsZonesApiTest {

    private final OsZonesApi api = new OsZonesApi();

    /**
     * 
     *
     * Create a object storage zone
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createObjectStorageZoneTest() throws Exception {
        ObjectStorageZoneCreateReq body = null;
        String clusterId = null;
        ObjectStorageZoneResp response = api.createObjectStorageZone(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete a object storage zone
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteObjectStorageZoneTest() throws Exception {
        String zoneUuid = null;
        Boolean force = null;
        ObjectStorageZoneResp response = api.deleteObjectStorageZone(zoneUuid, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get object storage zone
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getObjectStorageZoneTest() throws Exception {
        String zoneUuid = null;
        ObjectStorageZoneRecordResp response = api.getObjectStorageZone(zoneUuid);

        // TODO: test validations
    }
    /**
     * 
     *
     * get an object storage zone&#x27;s Samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getObjectStorageZoneSamplesTest() throws Exception {
        String zoneUuid = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        ObjectStorageZoneSamplesResp response = api.getObjectStorageZoneSamples(zoneUuid, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * List object storage zones
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listObjectStorageZonesTest() throws Exception {
        Long limit = null;
        Long offset = null;
        String q = null;
        String sort = null;
        Boolean local = null;
        Boolean master = null;
        String name = null;
        String clusterId = null;
        ObjectStorageZonesRecordResp response = api.listObjectStorageZones(limit, offset, q, sort, local, master, name, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * update os zone pairs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateOSZonesClockDiffTest() throws Exception {
        OSZonePairsUpdateReq body = null;
        String zoneUuid = null;
        ObjectStorageZoneResp response = api.updateOSZonesClockDiff(body, zoneUuid);

        // TODO: test validations
    }
}
