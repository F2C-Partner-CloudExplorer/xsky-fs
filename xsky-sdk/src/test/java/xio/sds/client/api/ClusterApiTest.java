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

import xio.sds.client.model.BootNodeReq;
import xio.sds.client.model.BootNodeResp;
import xio.sds.client.model.ClusterInstallationResp;
import xio.sds.client.model.ClusterMaintainReq;
import xio.sds.client.model.ClusterOverviewResp;
import xio.sds.client.model.ClusterRecordResp;
import xio.sds.client.model.ClusterResp;
import xio.sds.client.model.ClusterSamplesResp;
import xio.sds.client.model.ClusterServerTimeResp;
import xio.sds.client.model.ClusterSetAccessInfoReq;
import xio.sds.client.model.ClusterSetNetworkReq;
import xio.sds.client.model.ClusterStatsPredictionResp;
import xio.sds.client.model.ClusterUpdateReq;
import java.io.File;
import xio.sds.client.model.NgObjectStorageResp;
import xio.sds.client.model.NgObjectStorageSetDomainNamesReq;
import xio.sds.client.model.ObjectStorageInitReq;
import xio.sds.client.model.ObjectStorageResp;
import xio.sds.client.model.ObjectStorageSamplesResp;
import xio.sds.client.model.ObjectStorageSetDNSNamesReq;
import xio.sds.client.model.ObjectStorageSetFunctionEnableHostsReq;
import xio.sds.client.model.ObjectStorageSetReq;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ClusterApi
 */
@Ignore
public class ClusterApiTest {

    private final ClusterApi api = new ClusterApi();

    /**
     * 
     *
     * get bootnode info
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void bootNodeTest() throws Exception {
        String clusterId = null;
        BootNodeResp response = api.bootNode(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Output the status of the cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void clusterTest() throws Exception {
        String clusterId = null;
        ClusterRecordResp response = api.cluster(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Commit the switch to new master os zone.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void commitMasterSwitchingTest() throws Exception {
        String clusterId = null;
        ObjectStorageResp response = api.commitMasterSwitching(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Delete object storage system in current cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteObjectStorageTest() throws Exception {
        Boolean force = null;
        String clusterId = null;
        ObjectStorageResp response = api.deleteObjectStorage(force, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * download the file which in whitelist path
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void downloadTest() throws Exception {
        String paths = null;
        File response = api.download(paths);

        // TODO: test validations
    }
    /**
     * 
     *
     * Enable multi zone for object storage system
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void enableMultiZoneTest() throws Exception {
        String clusterId = null;
        ObjectStorageResp response = api.enableMultiZone(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get report of cluster action logs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getActionLogReportTest() throws Exception {
        String clusterId = null;
        File response = api.getActionLogReport(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get report of cluster alerts
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getAlertReportTest() throws Exception {
        File response = api.getAlertReport();

        // TODO: test validations
    }
    /**
     * 
     *
     * Get overview data of a cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getClusterOverviewTest() throws Exception {
        ClusterOverviewResp response = api.getClusterOverview();

        // TODO: test validations
    }
    /**
     * 
     *
     * Get report of a cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getClusterReportTest() throws Exception {
        String clusterId = null;
        File response = api.getClusterReport(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * get cluster&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getClusterSamplesTest() throws Exception {
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        ClusterSamplesResp response = api.getClusterSamples(durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get prediction of stats space usage
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getClusterStatsUsagePredictionTest() throws Exception {
        ClusterStatsPredictionResp response = api.getClusterStatsUsagePrediction();

        // TODO: test validations
    }
    /**
     * 
     *
     * Get report of cluster event logs
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEventLogReportTest() throws Exception {
        String clusterId = null;
        File response = api.getEventLogReport(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get osp status
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getNgObjectStorageTest() throws Exception {
        String clusterId = null;
        NgObjectStorageResp response = api.getNgObjectStorage(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get object storage system status
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getObjectStorageTest() throws Exception {
        String clusterId = null;
        ObjectStorageResp response = api.getObjectStorage(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get object storage&#x27;s samples
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getObjectStorageSamplesTest() throws Exception {
        String clusterId = null;
        String durationBegin = null;
        String durationEnd = null;
        String period = null;
        ObjectStorageSamplesResp response = api.getObjectStorageSamples(clusterId, durationBegin, durationEnd, period);

        // TODO: test validations
    }
    /**
     * 
     *
     * Initialize object storage system in current cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void initObjectStorageTest() throws Exception {
        ObjectStorageInitReq body = null;
        String clusterId = null;
        ObjectStorageResp response = api.initObjectStorage(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * show the installation status
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void installationTest() throws Exception {
        ClusterInstallationResp response = api.installation();

        // TODO: test validations
    }
    /**
     * 
     *
     * Prepare to switch to new master os zone.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void prepareMasterSwitchingTest() throws Exception {
        String clusterId = null;
        ObjectStorageResp response = api.prepareMasterSwitching(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Remove cluster access info
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeClusterAccessInfoTest() throws Exception {
        String clusterId = null;
        ClusterResp response = api.removeClusterAccessInfo(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Rollback the switch to new master os zone.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void rollbackMasterSwitchingTest() throws Exception {
        String clusterId = null;
        ObjectStorageResp response = api.rollbackMasterSwitching(clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * show current server time
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void serverTimeTest() throws Exception {
        ClusterServerTimeResp response = api.serverTime();

        // TODO: test validations
    }
    /**
     * 
     *
     * set bootnode info
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setBootNodeTest() throws Exception {
        BootNodeReq body = null;
        String clusterId = null;
        BootNodeResp response = api.setBootNode(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set cluster access info
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setClusterAccessInfoTest() throws Exception {
        ClusterSetAccessInfoReq body = null;
        String clusterId = null;
        ClusterResp response = api.setClusterAccessInfo(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set cluster gateway networks
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setClusterNetworkTest() throws Exception {
        ClusterSetNetworkReq body = null;
        String clusterId = null;
        ClusterResp response = api.setClusterNetwork(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set osp domain names
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setNgObjectStorageDomainNamesTest() throws Exception {
        NgObjectStorageSetDomainNamesReq body = null;
        String clusterId = null;
        NgObjectStorageResp response = api.setNgObjectStorageDomainNames(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set object storage system in current cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setObjectStorageTest() throws Exception {
        ObjectStorageSetReq body = null;
        String clusterId = null;
        ObjectStorageResp response = api.setObjectStorage(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set object storage dns names
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setObjectStorageDNSNamesTest() throws Exception {
        ObjectStorageSetDNSNamesReq body = null;
        String clusterId = null;
        ObjectStorageResp response = api.setObjectStorageDNSNames(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set object storage origin pull enable hosts
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setObjectStorageOriginPullHostsTest() throws Exception {
        ObjectStorageSetFunctionEnableHostsReq body = null;
        String clusterId = null;
        ObjectStorageResp response = api.setObjectStorageOriginPullHosts(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Set object storage tiering enable hosts
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setObjectStorageTieringHostsTest() throws Exception {
        ObjectStorageSetFunctionEnableHostsReq body = null;
        String clusterId = null;
        ObjectStorageResp response = api.setObjectStorageTieringHosts(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Switch current os zone to master
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void switchOSZoneToMasterTest() throws Exception {
        String clusterId = null;
        Boolean force = null;
        ObjectStorageResp response = api.switchOSZoneToMaster(clusterId, force);

        // TODO: test validations
    }
    /**
     * 
     *
     * set disk lighting mode of cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateClusterTest() throws Exception {
        ClusterUpdateReq body = null;
        String clusterId = null;
        ClusterResp response = api.updateCluster(body, clusterId);

        // TODO: test validations
    }
    /**
     * 
     *
     * update maintenance mode of cluster
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateClusterMaintenanceTest() throws Exception {
        ClusterMaintainReq body = null;
        String clusterId = null;
        ClusterResp response = api.updateClusterMaintenance(body, clusterId);

        // TODO: test validations
    }
}
