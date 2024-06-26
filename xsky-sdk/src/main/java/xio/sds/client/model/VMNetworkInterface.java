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
import xio.sds.client.model.PortMapPair;
import xio.sds.client.model.VMNetworkInterfaceNestview;
import xio.sds.client.model.VirtualMachineNestview;
/**
 * VMNetworkInterface defines the nic of vm
 */
@Schema(description = "VMNetworkInterface defines the nic of vm")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VMNetworkInterface {
  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("gateway")
  private String gateway = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("mac_address")
  private String macAddress = null;

  @SerializedName("mask")
  private Long mask = null;

  @SerializedName("master")
  private VMNetworkInterfaceNestview master = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nat_config")
  private List<PortMapPair> natConfig = null;

  @SerializedName("network_type")
  private String networkType = null;

  @SerializedName("pci_address")
  private String pciAddress = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("vm")
  private VirtualMachineNestview vm = null;

  public VMNetworkInterface create(OffsetDateTime create) {
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

  public VMNetworkInterface gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @Schema(description = "")
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public VMNetworkInterface id(Long id) {
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

  public VMNetworkInterface ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @Schema(description = "")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public VMNetworkInterface macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @Schema(description = "")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public VMNetworkInterface mask(Long mask) {
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

  public VMNetworkInterface master(VMNetworkInterfaceNestview master) {
    this.master = master;
    return this;
  }

   /**
   * Get master
   * @return master
  **/
  @Schema(description = "")
  public VMNetworkInterfaceNestview getMaster() {
    return master;
  }

  public void setMaster(VMNetworkInterfaceNestview master) {
    this.master = master;
  }

  public VMNetworkInterface name(String name) {
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

  public VMNetworkInterface natConfig(List<PortMapPair> natConfig) {
    this.natConfig = natConfig;
    return this;
  }

  public VMNetworkInterface addNatConfigItem(PortMapPair natConfigItem) {
    if (this.natConfig == null) {
      this.natConfig = new ArrayList<PortMapPair>();
    }
    this.natConfig.add(natConfigItem);
    return this;
  }

   /**
   * Get natConfig
   * @return natConfig
  **/
  @Schema(description = "")
  public List<PortMapPair> getNatConfig() {
    return natConfig;
  }

  public void setNatConfig(List<PortMapPair> natConfig) {
    this.natConfig = natConfig;
  }

  public VMNetworkInterface networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

   /**
   * Get networkType
   * @return networkType
  **/
  @Schema(description = "")
  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public VMNetworkInterface pciAddress(String pciAddress) {
    this.pciAddress = pciAddress;
    return this;
  }

   /**
   * Get pciAddress
   * @return pciAddress
  **/
  @Schema(description = "")
  public String getPciAddress() {
    return pciAddress;
  }

  public void setPciAddress(String pciAddress) {
    this.pciAddress = pciAddress;
  }

  public VMNetworkInterface type(String type) {
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

  public VMNetworkInterface update(OffsetDateTime update) {
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

  public VMNetworkInterface vm(VirtualMachineNestview vm) {
    this.vm = vm;
    return this;
  }

   /**
   * Get vm
   * @return vm
  **/
  @Schema(description = "")
  public VirtualMachineNestview getVm() {
    return vm;
  }

  public void setVm(VirtualMachineNestview vm) {
    this.vm = vm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMNetworkInterface vmNetworkInterface = (VMNetworkInterface) o;
    return Objects.equals(this.create, vmNetworkInterface.create) &&
        Objects.equals(this.gateway, vmNetworkInterface.gateway) &&
        Objects.equals(this.id, vmNetworkInterface.id) &&
        Objects.equals(this.ipAddress, vmNetworkInterface.ipAddress) &&
        Objects.equals(this.macAddress, vmNetworkInterface.macAddress) &&
        Objects.equals(this.mask, vmNetworkInterface.mask) &&
        Objects.equals(this.master, vmNetworkInterface.master) &&
        Objects.equals(this.name, vmNetworkInterface.name) &&
        Objects.equals(this.natConfig, vmNetworkInterface.natConfig) &&
        Objects.equals(this.networkType, vmNetworkInterface.networkType) &&
        Objects.equals(this.pciAddress, vmNetworkInterface.pciAddress) &&
        Objects.equals(this.type, vmNetworkInterface.type) &&
        Objects.equals(this.update, vmNetworkInterface.update) &&
        Objects.equals(this.vm, vmNetworkInterface.vm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, gateway, id, ipAddress, macAddress, mask, master, name, natConfig, networkType, pciAddress, type, update, vm);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VMNetworkInterface {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    master: ").append(toIndentedString(master)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    natConfig: ").append(toIndentedString(natConfig)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    pciAddress: ").append(toIndentedString(pciAddress)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
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
