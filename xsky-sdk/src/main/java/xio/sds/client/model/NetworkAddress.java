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
import xio.sds.client.model.Cluster;
import xio.sds.client.model.HostNestview;
import xio.sds.client.model.NetworkInterfaceNestview;
/**
 * NetworkAddress defines model of network address +X:model:generate;plur&#x3D;NetworkAddresses;related_depth&#x3D;2; +X:benchmark:
 */
@Schema(description = "NetworkAddress defines model of network address +X:model:generate;plur=NetworkAddresses;related_depth=2; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class NetworkAddress {
  @SerializedName("available")
  private Boolean available = null;

  @SerializedName("cluster")
  private Cluster cluster = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("host")
  private HostNestview host = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("mask")
  private Long mask = null;

  @SerializedName("network_interface")
  private NetworkInterfaceNestview networkInterface = null;

  @SerializedName("osp_cluster")
  private Cluster ospCluster = null;

  @SerializedName("roles")
  private List<String> roles = null;

  @SerializedName("slave_switch_time")
  private OffsetDateTime slaveSwitchTime = null;

  @SerializedName("slave_switched")
  private Boolean slaveSwitched = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public NetworkAddress available(Boolean available) {
    this.available = available;
    return this;
  }

   /**
   * Get available
   * @return available
  **/
  @Schema(description = "")
  public Boolean isAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }

  public NetworkAddress cluster(Cluster cluster) {
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @Schema(description = "")
  public Cluster getCluster() {
    return cluster;
  }

  public void setCluster(Cluster cluster) {
    this.cluster = cluster;
  }

  public NetworkAddress create(OffsetDateTime create) {
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

  public NetworkAddress host(HostNestview host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(description = "")
  public HostNestview getHost() {
    return host;
  }

  public void setHost(HostNestview host) {
    this.host = host;
  }

  public NetworkAddress id(Long id) {
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

  public NetworkAddress ip(String ip) {
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

  public NetworkAddress mask(Long mask) {
    this.mask = mask;
    return this;
  }

   /**
   * Get mask
   * @return mask
  **/
  @Schema(description = "")
  public Long getMask() {
    return mask;
  }

  public void setMask(Long mask) {
    this.mask = mask;
  }

  public NetworkAddress networkInterface(NetworkInterfaceNestview networkInterface) {
    this.networkInterface = networkInterface;
    return this;
  }

   /**
   * Get networkInterface
   * @return networkInterface
  **/
  @Schema(description = "")
  public NetworkInterfaceNestview getNetworkInterface() {
    return networkInterface;
  }

  public void setNetworkInterface(NetworkInterfaceNestview networkInterface) {
    this.networkInterface = networkInterface;
  }

  public NetworkAddress ospCluster(Cluster ospCluster) {
    this.ospCluster = ospCluster;
    return this;
  }

   /**
   * Get ospCluster
   * @return ospCluster
  **/
  @Schema(description = "")
  public Cluster getOspCluster() {
    return ospCluster;
  }

  public void setOspCluster(Cluster ospCluster) {
    this.ospCluster = ospCluster;
  }

  public NetworkAddress roles(List<String> roles) {
    this.roles = roles;
    return this;
  }

  public NetworkAddress addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<String>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @Schema(description = "")
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
    this.roles = roles;
  }

  public NetworkAddress slaveSwitchTime(OffsetDateTime slaveSwitchTime) {
    this.slaveSwitchTime = slaveSwitchTime;
    return this;
  }

   /**
   * Get slaveSwitchTime
   * @return slaveSwitchTime
  **/
  @Schema(description = "")
  public OffsetDateTime getSlaveSwitchTime() {
    return slaveSwitchTime;
  }

  public void setSlaveSwitchTime(OffsetDateTime slaveSwitchTime) {
    this.slaveSwitchTime = slaveSwitchTime;
  }

  public NetworkAddress slaveSwitched(Boolean slaveSwitched) {
    this.slaveSwitched = slaveSwitched;
    return this;
  }

   /**
   * Get slaveSwitched
   * @return slaveSwitched
  **/
  @Schema(description = "")
  public Boolean isSlaveSwitched() {
    return slaveSwitched;
  }

  public void setSlaveSwitched(Boolean slaveSwitched) {
    this.slaveSwitched = slaveSwitched;
  }

  public NetworkAddress update(OffsetDateTime update) {
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
    NetworkAddress networkAddress = (NetworkAddress) o;
    return Objects.equals(this.available, networkAddress.available) &&
        Objects.equals(this.cluster, networkAddress.cluster) &&
        Objects.equals(this.create, networkAddress.create) &&
        Objects.equals(this.host, networkAddress.host) &&
        Objects.equals(this.id, networkAddress.id) &&
        Objects.equals(this.ip, networkAddress.ip) &&
        Objects.equals(this.mask, networkAddress.mask) &&
        Objects.equals(this.networkInterface, networkAddress.networkInterface) &&
        Objects.equals(this.ospCluster, networkAddress.ospCluster) &&
        Objects.equals(this.roles, networkAddress.roles) &&
        Objects.equals(this.slaveSwitchTime, networkAddress.slaveSwitchTime) &&
        Objects.equals(this.slaveSwitched, networkAddress.slaveSwitched) &&
        Objects.equals(this.update, networkAddress.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, cluster, create, host, id, ip, mask, networkInterface, ospCluster, roles, slaveSwitchTime, slaveSwitched, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkAddress {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    networkInterface: ").append(toIndentedString(networkInterface)).append("\n");
    sb.append("    ospCluster: ").append(toIndentedString(ospCluster)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    slaveSwitchTime: ").append(toIndentedString(slaveSwitchTime)).append("\n");
    sb.append("    slaveSwitched: ").append(toIndentedString(slaveSwitched)).append("\n");
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
