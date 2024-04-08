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

package xio.sds.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.PoolNestview;
/**
 * ObjectStorage contains information of a object storage and it&#x27;s stats.
 */
@Schema(description = "ObjectStorage contains information of a object storage and it's stats.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class ObjectStorage {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("cname_enabled")
  private Boolean cnameEnabled = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("dns_names")
  private List<String> dnsNames = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("index_pool")
  private PoolNestview indexPool = null;

  @SerializedName("lifecycle_end_on")
  private String lifecycleEndOn = null;

  @SerializedName("lifecycle_start_on")
  private String lifecycleStartOn = null;

  @SerializedName("multi_zone_enabled")
  private Boolean multiZoneEnabled = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("origin_pull_host_ids")
  private List<Long> originPullHostIds = null;

  @SerializedName("s3_lb_system_user_ak")
  private String s3LbSystemUserAk = null;

  @SerializedName("s3_lb_system_user_sk")
  private String s3LbSystemUserSk = null;

  @SerializedName("search_enabled")
  private Boolean searchEnabled = null;

  @SerializedName("second_mergence_enabled")
  private Boolean secondMergenceEnabled = null;

  @SerializedName("second_mergence_end_on")
  private String secondMergenceEndOn = null;

  @SerializedName("second_mergence_start_on")
  private String secondMergenceStartOn = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("tiering_host_ids")
  private List<Long> tieringHostIds = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public ObjectStorage actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @Schema(description = "")
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }

  public ObjectStorage cluster(ClusterNestview cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public ClusterNestview getCluster() {
    return cluster;
  }

  public void setCluster(ClusterNestview cluster) {
    this.cluster = cluster;
  }

  public ObjectStorage cnameEnabled(Boolean cnameEnabled) {
    this.cnameEnabled = cnameEnabled;
    return this;
  }

   /**
   * Get cnameEnabled
   * @return cnameEnabled
  **/
  @Schema(description = "")
  public Boolean isCnameEnabled() {
    return cnameEnabled;
  }

  public void setCnameEnabled(Boolean cnameEnabled) {
    this.cnameEnabled = cnameEnabled;
  }

  public ObjectStorage create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public ObjectStorage dnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
    return this;
  }

  public ObjectStorage addDnsNamesItem(String dnsNamesItem) {
    if (this.dnsNames == null) {
      this.dnsNames = new ArrayList<String>();
    }
    this.dnsNames.add(dnsNamesItem);
    return this;
  }

   /**
   * Get dnsNames
   * @return dnsNames
  **/
  @Schema(description = "")
  public List<String> getDnsNames() {
    return dnsNames;
  }

  public void setDnsNames(List<String> dnsNames) {
    this.dnsNames = dnsNames;
  }

  public ObjectStorage id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ObjectStorage indexPool(PoolNestview indexPool) {
    this.indexPool = indexPool;
    return this;
  }

   /**
   * Get indexPool
   * @return indexPool
  **/
  @Schema(description = "")
  public PoolNestview getIndexPool() {
    return indexPool;
  }

  public void setIndexPool(PoolNestview indexPool) {
    this.indexPool = indexPool;
  }

  public ObjectStorage lifecycleEndOn(String lifecycleEndOn) {
    this.lifecycleEndOn = lifecycleEndOn;
    return this;
  }

   /**
   * Get lifecycleEndOn
   * @return lifecycleEndOn
  **/
  @Schema(description = "")
  public String getLifecycleEndOn() {
    return lifecycleEndOn;
  }

  public void setLifecycleEndOn(String lifecycleEndOn) {
    this.lifecycleEndOn = lifecycleEndOn;
  }

  public ObjectStorage lifecycleStartOn(String lifecycleStartOn) {
    this.lifecycleStartOn = lifecycleStartOn;
    return this;
  }

   /**
   * Get lifecycleStartOn
   * @return lifecycleStartOn
  **/
  @Schema(description = "")
  public String getLifecycleStartOn() {
    return lifecycleStartOn;
  }

  public void setLifecycleStartOn(String lifecycleStartOn) {
    this.lifecycleStartOn = lifecycleStartOn;
  }

  public ObjectStorage multiZoneEnabled(Boolean multiZoneEnabled) {
    this.multiZoneEnabled = multiZoneEnabled;
    return this;
  }

   /**
   * Get multiZoneEnabled
   * @return multiZoneEnabled
  **/
  @Schema(description = "")
  public Boolean isMultiZoneEnabled() {
    return multiZoneEnabled;
  }

  public void setMultiZoneEnabled(Boolean multiZoneEnabled) {
    this.multiZoneEnabled = multiZoneEnabled;
  }

  public ObjectStorage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ObjectStorage originPullHostIds(List<Long> originPullHostIds) {
    this.originPullHostIds = originPullHostIds;
    return this;
  }

  public ObjectStorage addOriginPullHostIdsItem(Long originPullHostIdsItem) {
    if (this.originPullHostIds == null) {
      this.originPullHostIds = new ArrayList<Long>();
    }
    this.originPullHostIds.add(originPullHostIdsItem);
    return this;
  }

   /**
   * Get originPullHostIds
   * @return originPullHostIds
  **/
  @Schema(description = "")
  public List<Long> getOriginPullHostIds() {
    return originPullHostIds;
  }

  public void setOriginPullHostIds(List<Long> originPullHostIds) {
    this.originPullHostIds = originPullHostIds;
  }

  public ObjectStorage s3LbSystemUserAk(String s3LbSystemUserAk) {
    this.s3LbSystemUserAk = s3LbSystemUserAk;
    return this;
  }

   /**
   * Get s3LbSystemUserAk
   * @return s3LbSystemUserAk
  **/
  @Schema(description = "")
  public String getS3LbSystemUserAk() {
    return s3LbSystemUserAk;
  }

  public void setS3LbSystemUserAk(String s3LbSystemUserAk) {
    this.s3LbSystemUserAk = s3LbSystemUserAk;
  }

  public ObjectStorage s3LbSystemUserSk(String s3LbSystemUserSk) {
    this.s3LbSystemUserSk = s3LbSystemUserSk;
    return this;
  }

   /**
   * Get s3LbSystemUserSk
   * @return s3LbSystemUserSk
  **/
  @Schema(description = "")
  public String getS3LbSystemUserSk() {
    return s3LbSystemUserSk;
  }

  public void setS3LbSystemUserSk(String s3LbSystemUserSk) {
    this.s3LbSystemUserSk = s3LbSystemUserSk;
  }

  public ObjectStorage searchEnabled(Boolean searchEnabled) {
    this.searchEnabled = searchEnabled;
    return this;
  }

   /**
   * Get searchEnabled
   * @return searchEnabled
  **/
  @Schema(description = "")
  public Boolean isSearchEnabled() {
    return searchEnabled;
  }

  public void setSearchEnabled(Boolean searchEnabled) {
    this.searchEnabled = searchEnabled;
  }

  public ObjectStorage secondMergenceEnabled(Boolean secondMergenceEnabled) {
    this.secondMergenceEnabled = secondMergenceEnabled;
    return this;
  }

   /**
   * Get secondMergenceEnabled
   * @return secondMergenceEnabled
  **/
  @Schema(description = "")
  public Boolean isSecondMergenceEnabled() {
    return secondMergenceEnabled;
  }

  public void setSecondMergenceEnabled(Boolean secondMergenceEnabled) {
    this.secondMergenceEnabled = secondMergenceEnabled;
  }

  public ObjectStorage secondMergenceEndOn(String secondMergenceEndOn) {
    this.secondMergenceEndOn = secondMergenceEndOn;
    return this;
  }

   /**
   * Get secondMergenceEndOn
   * @return secondMergenceEndOn
  **/
  @Schema(description = "")
  public String getSecondMergenceEndOn() {
    return secondMergenceEndOn;
  }

  public void setSecondMergenceEndOn(String secondMergenceEndOn) {
    this.secondMergenceEndOn = secondMergenceEndOn;
  }

  public ObjectStorage secondMergenceStartOn(String secondMergenceStartOn) {
    this.secondMergenceStartOn = secondMergenceStartOn;
    return this;
  }

   /**
   * Get secondMergenceStartOn
   * @return secondMergenceStartOn
  **/
  @Schema(description = "")
  public String getSecondMergenceStartOn() {
    return secondMergenceStartOn;
  }

  public void setSecondMergenceStartOn(String secondMergenceStartOn) {
    this.secondMergenceStartOn = secondMergenceStartOn;
  }

  public ObjectStorage status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ObjectStorage tieringHostIds(List<Long> tieringHostIds) {
    this.tieringHostIds = tieringHostIds;
    return this;
  }

  public ObjectStorage addTieringHostIdsItem(Long tieringHostIdsItem) {
    if (this.tieringHostIds == null) {
      this.tieringHostIds = new ArrayList<Long>();
    }
    this.tieringHostIds.add(tieringHostIdsItem);
    return this;
  }

   /**
   * Get tieringHostIds
   * @return tieringHostIds
  **/
  @Schema(description = "")
  public List<Long> getTieringHostIds() {
    return tieringHostIds;
  }

  public void setTieringHostIds(List<Long> tieringHostIds) {
    this.tieringHostIds = tieringHostIds;
  }

  public ObjectStorage update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectStorage objectStorage = (ObjectStorage) o;
    return Objects.equals(this.actionStatus, objectStorage.actionStatus) &&
        Objects.equals(this.cluster, objectStorage.cluster) &&
        Objects.equals(this.cnameEnabled, objectStorage.cnameEnabled) &&
        Objects.equals(this.create, objectStorage.create) &&
        Objects.equals(this.dnsNames, objectStorage.dnsNames) &&
        Objects.equals(this.id, objectStorage.id) &&
        Objects.equals(this.indexPool, objectStorage.indexPool) &&
        Objects.equals(this.lifecycleEndOn, objectStorage.lifecycleEndOn) &&
        Objects.equals(this.lifecycleStartOn, objectStorage.lifecycleStartOn) &&
        Objects.equals(this.multiZoneEnabled, objectStorage.multiZoneEnabled) &&
        Objects.equals(this.name, objectStorage.name) &&
        Objects.equals(this.originPullHostIds, objectStorage.originPullHostIds) &&
        Objects.equals(this.s3LbSystemUserAk, objectStorage.s3LbSystemUserAk) &&
        Objects.equals(this.s3LbSystemUserSk, objectStorage.s3LbSystemUserSk) &&
        Objects.equals(this.searchEnabled, objectStorage.searchEnabled) &&
        Objects.equals(this.secondMergenceEnabled, objectStorage.secondMergenceEnabled) &&
        Objects.equals(this.secondMergenceEndOn, objectStorage.secondMergenceEndOn) &&
        Objects.equals(this.secondMergenceStartOn, objectStorage.secondMergenceStartOn) &&
        Objects.equals(this.status, objectStorage.status) &&
        Objects.equals(this.tieringHostIds, objectStorage.tieringHostIds) &&
        Objects.equals(this.update, objectStorage.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, cluster, cnameEnabled, create, dnsNames, id, indexPool, lifecycleEndOn, lifecycleStartOn, multiZoneEnabled, name, originPullHostIds, s3LbSystemUserAk, s3LbSystemUserSk, searchEnabled, secondMergenceEnabled, secondMergenceEndOn, secondMergenceStartOn, status, tieringHostIds, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectStorage {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    cnameEnabled: ").append(toIndentedString(cnameEnabled)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dnsNames: ").append(toIndentedString(dnsNames)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexPool: ").append(toIndentedString(indexPool)).append("\n");
    sb.append("    lifecycleEndOn: ").append(toIndentedString(lifecycleEndOn)).append("\n");
    sb.append("    lifecycleStartOn: ").append(toIndentedString(lifecycleStartOn)).append("\n");
    sb.append("    multiZoneEnabled: ").append(toIndentedString(multiZoneEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originPullHostIds: ").append(toIndentedString(originPullHostIds)).append("\n");
    sb.append("    s3LbSystemUserAk: ").append(toIndentedString(s3LbSystemUserAk)).append("\n");
    sb.append("    s3LbSystemUserSk: ").append(toIndentedString(s3LbSystemUserSk)).append("\n");
    sb.append("    searchEnabled: ").append(toIndentedString(searchEnabled)).append("\n");
    sb.append("    secondMergenceEnabled: ").append(toIndentedString(secondMergenceEnabled)).append("\n");
    sb.append("    secondMergenceEndOn: ").append(toIndentedString(secondMergenceEndOn)).append("\n");
    sb.append("    secondMergenceStartOn: ").append(toIndentedString(secondMergenceStartOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tieringHostIds: ").append(toIndentedString(tieringHostIds)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
