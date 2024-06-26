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
/**
 * DpBlockAsyncReplicationPairCreateReqPair
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DpBlockAsyncReplicationPairCreateReqPair {
  @SerializedName("chain_name")
  private String chainName = null;

  @SerializedName("group_pair_id")
  private Long groupPairId = null;

  @SerializedName("master_cluster_fs_id")
  private String masterClusterFsId = null;

  @SerializedName("master_gateway")
  private String masterGateway = null;

  @SerializedName("master_pair_id")
  private Long masterPairId = null;

  @SerializedName("master_pool_id")
  private Long masterPoolId = null;

  @SerializedName("master_pool_name")
  private String masterPoolName = null;

  @SerializedName("master_volume_id")
  private Long masterVolumeId = null;

  @SerializedName("master_volume_name")
  private String masterVolumeName = null;

  @SerializedName("master_volume_size")
  private Long masterVolumeSize = null;

  @SerializedName("master_volume_uuid")
  private String masterVolumeUuid = null;

  @SerializedName("policy_cron")
  private String policyCron = null;

  @SerializedName("slave_gateway")
  private String slaveGateway = null;

  @SerializedName("slave_pool_id")
  private Long slavePoolId = null;

  @SerializedName("slave_pool_name")
  private String slavePoolName = null;

  @SerializedName("slave_volume_name")
  private String slaveVolumeName = null;

  public DpBlockAsyncReplicationPairCreateReqPair chainName(String chainName) {
    this.chainName = chainName;
    return this;
  }

   /**
   * chain name
   * @return chainName
  **/
  @Schema(required = true, description = "chain name")
  public String getChainName() {
    return chainName;
  }

  public void setChainName(String chainName) {
    this.chainName = chainName;
  }

  public DpBlockAsyncReplicationPairCreateReqPair groupPairId(Long groupPairId) {
    this.groupPairId = groupPairId;
    return this;
  }

   /**
   * group pair id
   * @return groupPairId
  **/
  @Schema(required = true, description = "group pair id")
  public Long getGroupPairId() {
    return groupPairId;
  }

  public void setGroupPairId(Long groupPairId) {
    this.groupPairId = groupPairId;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterClusterFsId(String masterClusterFsId) {
    this.masterClusterFsId = masterClusterFsId;
    return this;
  }

   /**
   * master cluster fs id
   * @return masterClusterFsId
  **/
  @Schema(required = true, description = "master cluster fs id")
  public String getMasterClusterFsId() {
    return masterClusterFsId;
  }

  public void setMasterClusterFsId(String masterClusterFsId) {
    this.masterClusterFsId = masterClusterFsId;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterGateway(String masterGateway) {
    this.masterGateway = masterGateway;
    return this;
  }

   /**
   * gateway ip
   * @return masterGateway
  **/
  @Schema(required = true, description = "gateway ip")
  public String getMasterGateway() {
    return masterGateway;
  }

  public void setMasterGateway(String masterGateway) {
    this.masterGateway = masterGateway;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterPairId(Long masterPairId) {
    this.masterPairId = masterPairId;
    return this;
  }

   /**
   * master pair id
   * @return masterPairId
  **/
  @Schema(required = true, description = "master pair id")
  public Long getMasterPairId() {
    return masterPairId;
  }

  public void setMasterPairId(Long masterPairId) {
    this.masterPairId = masterPairId;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterPoolId(Long masterPoolId) {
    this.masterPoolId = masterPoolId;
    return this;
  }

   /**
   * master pool id
   * @return masterPoolId
  **/
  @Schema(required = true, description = "master pool id")
  public Long getMasterPoolId() {
    return masterPoolId;
  }

  public void setMasterPoolId(Long masterPoolId) {
    this.masterPoolId = masterPoolId;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterPoolName(String masterPoolName) {
    this.masterPoolName = masterPoolName;
    return this;
  }

   /**
   * master pool name
   * @return masterPoolName
  **/
  @Schema(required = true, description = "master pool name")
  public String getMasterPoolName() {
    return masterPoolName;
  }

  public void setMasterPoolName(String masterPoolName) {
    this.masterPoolName = masterPoolName;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterVolumeId(Long masterVolumeId) {
    this.masterVolumeId = masterVolumeId;
    return this;
  }

   /**
   * master volume id
   * @return masterVolumeId
  **/
  @Schema(required = true, description = "master volume id")
  public Long getMasterVolumeId() {
    return masterVolumeId;
  }

  public void setMasterVolumeId(Long masterVolumeId) {
    this.masterVolumeId = masterVolumeId;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterVolumeName(String masterVolumeName) {
    this.masterVolumeName = masterVolumeName;
    return this;
  }

   /**
   * master volume name
   * @return masterVolumeName
  **/
  @Schema(required = true, description = "master volume name")
  public String getMasterVolumeName() {
    return masterVolumeName;
  }

  public void setMasterVolumeName(String masterVolumeName) {
    this.masterVolumeName = masterVolumeName;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterVolumeSize(Long masterVolumeSize) {
    this.masterVolumeSize = masterVolumeSize;
    return this;
  }

   /**
   * volume size
   * @return masterVolumeSize
  **/
  @Schema(required = true, description = "volume size")
  public Long getMasterVolumeSize() {
    return masterVolumeSize;
  }

  public void setMasterVolumeSize(Long masterVolumeSize) {
    this.masterVolumeSize = masterVolumeSize;
  }

  public DpBlockAsyncReplicationPairCreateReqPair masterVolumeUuid(String masterVolumeUuid) {
    this.masterVolumeUuid = masterVolumeUuid;
    return this;
  }

   /**
   * master volume uuid
   * @return masterVolumeUuid
  **/
  @Schema(description = "master volume uuid")
  public String getMasterVolumeUuid() {
    return masterVolumeUuid;
  }

  public void setMasterVolumeUuid(String masterVolumeUuid) {
    this.masterVolumeUuid = masterVolumeUuid;
  }

  public DpBlockAsyncReplicationPairCreateReqPair policyCron(String policyCron) {
    this.policyCron = policyCron;
    return this;
  }

   /**
   * policy cron
   * @return policyCron
  **/
  @Schema(required = true, description = "policy cron")
  public String getPolicyCron() {
    return policyCron;
  }

  public void setPolicyCron(String policyCron) {
    this.policyCron = policyCron;
  }

  public DpBlockAsyncReplicationPairCreateReqPair slaveGateway(String slaveGateway) {
    this.slaveGateway = slaveGateway;
    return this;
  }

   /**
   * gateway ip
   * @return slaveGateway
  **/
  @Schema(required = true, description = "gateway ip")
  public String getSlaveGateway() {
    return slaveGateway;
  }

  public void setSlaveGateway(String slaveGateway) {
    this.slaveGateway = slaveGateway;
  }

  public DpBlockAsyncReplicationPairCreateReqPair slavePoolId(Long slavePoolId) {
    this.slavePoolId = slavePoolId;
    return this;
  }

   /**
   * slave pool id
   * @return slavePoolId
  **/
  @Schema(required = true, description = "slave pool id")
  public Long getSlavePoolId() {
    return slavePoolId;
  }

  public void setSlavePoolId(Long slavePoolId) {
    this.slavePoolId = slavePoolId;
  }

  public DpBlockAsyncReplicationPairCreateReqPair slavePoolName(String slavePoolName) {
    this.slavePoolName = slavePoolName;
    return this;
  }

   /**
   * slave pool name
   * @return slavePoolName
  **/
  @Schema(required = true, description = "slave pool name")
  public String getSlavePoolName() {
    return slavePoolName;
  }

  public void setSlavePoolName(String slavePoolName) {
    this.slavePoolName = slavePoolName;
  }

  public DpBlockAsyncReplicationPairCreateReqPair slaveVolumeName(String slaveVolumeName) {
    this.slaveVolumeName = slaveVolumeName;
    return this;
  }

   /**
   * slave volume name
   * @return slaveVolumeName
  **/
  @Schema(required = true, description = "slave volume name")
  public String getSlaveVolumeName() {
    return slaveVolumeName;
  }

  public void setSlaveVolumeName(String slaveVolumeName) {
    this.slaveVolumeName = slaveVolumeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpBlockAsyncReplicationPairCreateReqPair dpBlockAsyncReplicationPairCreateReqPair = (DpBlockAsyncReplicationPairCreateReqPair) o;
    return Objects.equals(this.chainName, dpBlockAsyncReplicationPairCreateReqPair.chainName) &&
        Objects.equals(this.groupPairId, dpBlockAsyncReplicationPairCreateReqPair.groupPairId) &&
        Objects.equals(this.masterClusterFsId, dpBlockAsyncReplicationPairCreateReqPair.masterClusterFsId) &&
        Objects.equals(this.masterGateway, dpBlockAsyncReplicationPairCreateReqPair.masterGateway) &&
        Objects.equals(this.masterPairId, dpBlockAsyncReplicationPairCreateReqPair.masterPairId) &&
        Objects.equals(this.masterPoolId, dpBlockAsyncReplicationPairCreateReqPair.masterPoolId) &&
        Objects.equals(this.masterPoolName, dpBlockAsyncReplicationPairCreateReqPair.masterPoolName) &&
        Objects.equals(this.masterVolumeId, dpBlockAsyncReplicationPairCreateReqPair.masterVolumeId) &&
        Objects.equals(this.masterVolumeName, dpBlockAsyncReplicationPairCreateReqPair.masterVolumeName) &&
        Objects.equals(this.masterVolumeSize, dpBlockAsyncReplicationPairCreateReqPair.masterVolumeSize) &&
        Objects.equals(this.masterVolumeUuid, dpBlockAsyncReplicationPairCreateReqPair.masterVolumeUuid) &&
        Objects.equals(this.policyCron, dpBlockAsyncReplicationPairCreateReqPair.policyCron) &&
        Objects.equals(this.slaveGateway, dpBlockAsyncReplicationPairCreateReqPair.slaveGateway) &&
        Objects.equals(this.slavePoolId, dpBlockAsyncReplicationPairCreateReqPair.slavePoolId) &&
        Objects.equals(this.slavePoolName, dpBlockAsyncReplicationPairCreateReqPair.slavePoolName) &&
        Objects.equals(this.slaveVolumeName, dpBlockAsyncReplicationPairCreateReqPair.slaveVolumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainName, groupPairId, masterClusterFsId, masterGateway, masterPairId, masterPoolId, masterPoolName, masterVolumeId, masterVolumeName, masterVolumeSize, masterVolumeUuid, policyCron, slaveGateway, slavePoolId, slavePoolName, slaveVolumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpBlockAsyncReplicationPairCreateReqPair {\n");
    
    sb.append("    chainName: ").append(toIndentedString(chainName)).append("\n");
    sb.append("    groupPairId: ").append(toIndentedString(groupPairId)).append("\n");
    sb.append("    masterClusterFsId: ").append(toIndentedString(masterClusterFsId)).append("\n");
    sb.append("    masterGateway: ").append(toIndentedString(masterGateway)).append("\n");
    sb.append("    masterPairId: ").append(toIndentedString(masterPairId)).append("\n");
    sb.append("    masterPoolId: ").append(toIndentedString(masterPoolId)).append("\n");
    sb.append("    masterPoolName: ").append(toIndentedString(masterPoolName)).append("\n");
    sb.append("    masterVolumeId: ").append(toIndentedString(masterVolumeId)).append("\n");
    sb.append("    masterVolumeName: ").append(toIndentedString(masterVolumeName)).append("\n");
    sb.append("    masterVolumeSize: ").append(toIndentedString(masterVolumeSize)).append("\n");
    sb.append("    masterVolumeUuid: ").append(toIndentedString(masterVolumeUuid)).append("\n");
    sb.append("    policyCron: ").append(toIndentedString(policyCron)).append("\n");
    sb.append("    slaveGateway: ").append(toIndentedString(slaveGateway)).append("\n");
    sb.append("    slavePoolId: ").append(toIndentedString(slavePoolId)).append("\n");
    sb.append("    slavePoolName: ").append(toIndentedString(slavePoolName)).append("\n");
    sb.append("    slaveVolumeName: ").append(toIndentedString(slaveVolumeName)).append("\n");
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
