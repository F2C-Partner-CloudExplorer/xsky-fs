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
/**
 * DomainUserGroupNestviewLdap
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DomainUserGroupNestviewLdap {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("admin_dn")
  private String adminDn = null;

  @SerializedName("cluster")
  private ClusterNestview cluster = null;

  @SerializedName("connection_timeout")
  private Long connectionTimeout = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("dfs_gateway_group_num")
  private Long dfsGatewayGroupNum = null;

  @SerializedName("group_suffix")
  private String groupSuffix = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("ips")
  private List<String> ips = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("netbios_name")
  private String netbiosName = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("samba_sid")
  private String sambaSid = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("timeout")
  private Long timeout = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("user_suffix")
  private String userSuffix = null;

  @SerializedName("verify_time")
  private OffsetDateTime verifyTime = null;

  public DomainUserGroupNestviewLdap actionStatus(String actionStatus) {
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

  public DomainUserGroupNestviewLdap adminDn(String adminDn) {
    this.adminDn = adminDn;
    return this;
  }

   /**
   * Get adminDn
   * @return adminDn
  **/
  @Schema(description = "")
  public String getAdminDn() {
    return adminDn;
  }

  public void setAdminDn(String adminDn) {
    this.adminDn = adminDn;
  }

  public DomainUserGroupNestviewLdap cluster(ClusterNestview cluster) {
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

  public DomainUserGroupNestviewLdap connectionTimeout(Long connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
    return this;
  }

   /**
   * Get connectionTimeout
   * @return connectionTimeout
  **/
  @Schema(description = "")
  public Long getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(Long connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public DomainUserGroupNestviewLdap create(OffsetDateTime create) {
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

  public DomainUserGroupNestviewLdap dfsGatewayGroupNum(Long dfsGatewayGroupNum) {
    this.dfsGatewayGroupNum = dfsGatewayGroupNum;
    return this;
  }

   /**
   * Get dfsGatewayGroupNum
   * @return dfsGatewayGroupNum
  **/
  @Schema(description = "")
  public Long getDfsGatewayGroupNum() {
    return dfsGatewayGroupNum;
  }

  public void setDfsGatewayGroupNum(Long dfsGatewayGroupNum) {
    this.dfsGatewayGroupNum = dfsGatewayGroupNum;
  }

  public DomainUserGroupNestviewLdap groupSuffix(String groupSuffix) {
    this.groupSuffix = groupSuffix;
    return this;
  }

   /**
   * Get groupSuffix
   * @return groupSuffix
  **/
  @Schema(description = "")
  public String getGroupSuffix() {
    return groupSuffix;
  }

  public void setGroupSuffix(String groupSuffix) {
    this.groupSuffix = groupSuffix;
  }

  public DomainUserGroupNestviewLdap id(Long id) {
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

  public DomainUserGroupNestviewLdap ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public DomainUserGroupNestviewLdap ips(List<String> ips) {
    this.ips = ips;
    return this;
  }

  public DomainUserGroupNestviewLdap addIpsItem(String ipsItem) {
    if (this.ips == null) {
      this.ips = new ArrayList<String>();
    }
    this.ips.add(ipsItem);
    return this;
  }

   /**
   * Get ips
   * @return ips
  **/
  @Schema(description = "")
  public List<String> getIps() {
    return ips;
  }

  public void setIps(List<String> ips) {
    this.ips = ips;
  }

  public DomainUserGroupNestviewLdap name(String name) {
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

  public DomainUserGroupNestviewLdap netbiosName(String netbiosName) {
    this.netbiosName = netbiosName;
    return this;
  }

   /**
   * Get netbiosName
   * @return netbiosName
  **/
  @Schema(description = "")
  public String getNetbiosName() {
    return netbiosName;
  }

  public void setNetbiosName(String netbiosName) {
    this.netbiosName = netbiosName;
  }

  public DomainUserGroupNestviewLdap port(Long port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(description = "")
  public Long getPort() {
    return port;
  }

  public void setPort(Long port) {
    this.port = port;
  }

  public DomainUserGroupNestviewLdap sambaSid(String sambaSid) {
    this.sambaSid = sambaSid;
    return this;
  }

   /**
   * Get sambaSid
   * @return sambaSid
  **/
  @Schema(description = "")
  public String getSambaSid() {
    return sambaSid;
  }

  public void setSambaSid(String sambaSid) {
    this.sambaSid = sambaSid;
  }

  public DomainUserGroupNestviewLdap status(String status) {
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

  public DomainUserGroupNestviewLdap suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  @Schema(description = "")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public DomainUserGroupNestviewLdap timeout(Long timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * Get timeout
   * @return timeout
  **/
  @Schema(description = "")
  public Long getTimeout() {
    return timeout;
  }

  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

  public DomainUserGroupNestviewLdap update(OffsetDateTime update) {
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

  public DomainUserGroupNestviewLdap userSuffix(String userSuffix) {
    this.userSuffix = userSuffix;
    return this;
  }

   /**
   * Get userSuffix
   * @return userSuffix
  **/
  @Schema(description = "")
  public String getUserSuffix() {
    return userSuffix;
  }

  public void setUserSuffix(String userSuffix) {
    this.userSuffix = userSuffix;
  }

  public DomainUserGroupNestviewLdap verifyTime(OffsetDateTime verifyTime) {
    this.verifyTime = verifyTime;
    return this;
  }

   /**
   * Get verifyTime
   * @return verifyTime
  **/
  @Schema(description = "")
  public OffsetDateTime getVerifyTime() {
    return verifyTime;
  }

  public void setVerifyTime(OffsetDateTime verifyTime) {
    this.verifyTime = verifyTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainUserGroupNestviewLdap domainUserGroupNestviewLdap = (DomainUserGroupNestviewLdap) o;
    return Objects.equals(this.actionStatus, domainUserGroupNestviewLdap.actionStatus) &&
        Objects.equals(this.adminDn, domainUserGroupNestviewLdap.adminDn) &&
        Objects.equals(this.cluster, domainUserGroupNestviewLdap.cluster) &&
        Objects.equals(this.connectionTimeout, domainUserGroupNestviewLdap.connectionTimeout) &&
        Objects.equals(this.create, domainUserGroupNestviewLdap.create) &&
        Objects.equals(this.dfsGatewayGroupNum, domainUserGroupNestviewLdap.dfsGatewayGroupNum) &&
        Objects.equals(this.groupSuffix, domainUserGroupNestviewLdap.groupSuffix) &&
        Objects.equals(this.id, domainUserGroupNestviewLdap.id) &&
        Objects.equals(this.ip, domainUserGroupNestviewLdap.ip) &&
        Objects.equals(this.ips, domainUserGroupNestviewLdap.ips) &&
        Objects.equals(this.name, domainUserGroupNestviewLdap.name) &&
        Objects.equals(this.netbiosName, domainUserGroupNestviewLdap.netbiosName) &&
        Objects.equals(this.port, domainUserGroupNestviewLdap.port) &&
        Objects.equals(this.sambaSid, domainUserGroupNestviewLdap.sambaSid) &&
        Objects.equals(this.status, domainUserGroupNestviewLdap.status) &&
        Objects.equals(this.suffix, domainUserGroupNestviewLdap.suffix) &&
        Objects.equals(this.timeout, domainUserGroupNestviewLdap.timeout) &&
        Objects.equals(this.update, domainUserGroupNestviewLdap.update) &&
        Objects.equals(this.userSuffix, domainUserGroupNestviewLdap.userSuffix) &&
        Objects.equals(this.verifyTime, domainUserGroupNestviewLdap.verifyTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, adminDn, cluster, connectionTimeout, create, dfsGatewayGroupNum, groupSuffix, id, ip, ips, name, netbiosName, port, sambaSid, status, suffix, timeout, update, userSuffix, verifyTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainUserGroupNestviewLdap {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    adminDn: ").append(toIndentedString(adminDn)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    connectionTimeout: ").append(toIndentedString(connectionTimeout)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dfsGatewayGroupNum: ").append(toIndentedString(dfsGatewayGroupNum)).append("\n");
    sb.append("    groupSuffix: ").append(toIndentedString(groupSuffix)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    netbiosName: ").append(toIndentedString(netbiosName)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    sambaSid: ").append(toIndentedString(sambaSid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    userSuffix: ").append(toIndentedString(userSuffix)).append("\n");
    sb.append("    verifyTime: ").append(toIndentedString(verifyTime)).append("\n");
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
