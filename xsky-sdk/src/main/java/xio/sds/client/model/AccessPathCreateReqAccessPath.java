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
import xio.sds.client.model.MappingGroupReq;
import xio.sds.client.model.TargetReq;
/**
 * AccessPathCreateReqAccessPath
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AccessPathCreateReqAccessPath {
  @SerializedName("chap")
  private Boolean chap = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("host_ids")
  private List<Long> hostIds = null;

  @SerializedName("mapping_groups")
  private List<MappingGroupReq> mappingGroups = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nvmf_type")
  private String nvmfType = null;

  @SerializedName("protection_domain_id")
  private Long protectionDomainId = null;

  @SerializedName("targets")
  private List<TargetReq> targets = null;

  @SerializedName("tname")
  private String tname = null;

  @SerializedName("tsecret")
  private String tsecret = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("uid")
  private String uid = null;

  public AccessPathCreateReqAccessPath chap(Boolean chap) {
    this.chap = chap;
    return this;
  }

   /**
   * Get chap
   * @return chap
  **/
  @Schema(description = "")
  public Boolean isChap() {
    return chap;
  }

  public void setChap(Boolean chap) {
    this.chap = chap;
  }

  public AccessPathCreateReqAccessPath description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccessPathCreateReqAccessPath hostIds(List<Long> hostIds) {
    this.hostIds = hostIds;
    return this;
  }

  public AccessPathCreateReqAccessPath addHostIdsItem(Long hostIdsItem) {
    if (this.hostIds == null) {
      this.hostIds = new ArrayList<Long>();
    }
    this.hostIds.add(hostIdsItem);
    return this;
  }

   /**
   * Get hostIds
   * @return hostIds
  **/
  @Schema(description = "")
  public List<Long> getHostIds() {
    return hostIds;
  }

  public void setHostIds(List<Long> hostIds) {
    this.hostIds = hostIds;
  }

  public AccessPathCreateReqAccessPath mappingGroups(List<MappingGroupReq> mappingGroups) {
    this.mappingGroups = mappingGroups;
    return this;
  }

  public AccessPathCreateReqAccessPath addMappingGroupsItem(MappingGroupReq mappingGroupsItem) {
    if (this.mappingGroups == null) {
      this.mappingGroups = new ArrayList<MappingGroupReq>();
    }
    this.mappingGroups.add(mappingGroupsItem);
    return this;
  }

   /**
   * Get mappingGroups
   * @return mappingGroups
  **/
  @Schema(description = "")
  public List<MappingGroupReq> getMappingGroups() {
    return mappingGroups;
  }

  public void setMappingGroups(List<MappingGroupReq> mappingGroups) {
    this.mappingGroups = mappingGroups;
  }

  public AccessPathCreateReqAccessPath name(String name) {
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

  public AccessPathCreateReqAccessPath nvmfType(String nvmfType) {
    this.nvmfType = nvmfType;
    return this;
  }

   /**
   * Get nvmfType
   * @return nvmfType
  **/
  @Schema(description = "")
  public String getNvmfType() {
    return nvmfType;
  }

  public void setNvmfType(String nvmfType) {
    this.nvmfType = nvmfType;
  }

  public AccessPathCreateReqAccessPath protectionDomainId(Long protectionDomainId) {
    this.protectionDomainId = protectionDomainId;
    return this;
  }

   /**
   * Get protectionDomainId
   * @return protectionDomainId
  **/
  @Schema(description = "")
  public Long getProtectionDomainId() {
    return protectionDomainId;
  }

  public void setProtectionDomainId(Long protectionDomainId) {
    this.protectionDomainId = protectionDomainId;
  }

  public AccessPathCreateReqAccessPath targets(List<TargetReq> targets) {
    this.targets = targets;
    return this;
  }

  public AccessPathCreateReqAccessPath addTargetsItem(TargetReq targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<TargetReq>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @Schema(description = "")
  public List<TargetReq> getTargets() {
    return targets;
  }

  public void setTargets(List<TargetReq> targets) {
    this.targets = targets;
  }

  public AccessPathCreateReqAccessPath tname(String tname) {
    this.tname = tname;
    return this;
  }

   /**
   * Get tname
   * @return tname
  **/
  @Schema(description = "")
  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }

  public AccessPathCreateReqAccessPath tsecret(String tsecret) {
    this.tsecret = tsecret;
    return this;
  }

   /**
   * Get tsecret
   * @return tsecret
  **/
  @Schema(description = "")
  public String getTsecret() {
    return tsecret;
  }

  public void setTsecret(String tsecret) {
    this.tsecret = tsecret;
  }

  public AccessPathCreateReqAccessPath type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AccessPathCreateReqAccessPath uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(description = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessPathCreateReqAccessPath accessPathCreateReqAccessPath = (AccessPathCreateReqAccessPath) o;
    return Objects.equals(this.chap, accessPathCreateReqAccessPath.chap) &&
        Objects.equals(this.description, accessPathCreateReqAccessPath.description) &&
        Objects.equals(this.hostIds, accessPathCreateReqAccessPath.hostIds) &&
        Objects.equals(this.mappingGroups, accessPathCreateReqAccessPath.mappingGroups) &&
        Objects.equals(this.name, accessPathCreateReqAccessPath.name) &&
        Objects.equals(this.nvmfType, accessPathCreateReqAccessPath.nvmfType) &&
        Objects.equals(this.protectionDomainId, accessPathCreateReqAccessPath.protectionDomainId) &&
        Objects.equals(this.targets, accessPathCreateReqAccessPath.targets) &&
        Objects.equals(this.tname, accessPathCreateReqAccessPath.tname) &&
        Objects.equals(this.tsecret, accessPathCreateReqAccessPath.tsecret) &&
        Objects.equals(this.type, accessPathCreateReqAccessPath.type) &&
        Objects.equals(this.uid, accessPathCreateReqAccessPath.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chap, description, hostIds, mappingGroups, name, nvmfType, protectionDomainId, targets, tname, tsecret, type, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessPathCreateReqAccessPath {\n");
    
    sb.append("    chap: ").append(toIndentedString(chap)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
    sb.append("    mappingGroups: ").append(toIndentedString(mappingGroups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nvmfType: ").append(toIndentedString(nvmfType)).append("\n");
    sb.append("    protectionDomainId: ").append(toIndentedString(protectionDomainId)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    tname: ").append(toIndentedString(tname)).append("\n");
    sb.append("    tsecret: ").append(toIndentedString(tsecret)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
