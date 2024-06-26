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
import org.threeten.bp.OffsetDateTime;
/**
 * NetworkInterfaceStat define the statistics of network interface
 */
@Schema(description = "NetworkInterfaceStat define the statistics of network interface")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class NetworkInterfaceStat {
  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("drop_pps")
  private Double dropPps = null;

  @SerializedName("error_pps")
  private Double errorPps = null;

  @SerializedName("rx_bandwidth_kbyte")
  private Double rxBandwidthKbyte = null;

  @SerializedName("rx_drop_pps")
  private Double rxDropPps = null;

  @SerializedName("rx_error_pps")
  private Double rxErrorPps = null;

  @SerializedName("rx_pps")
  private Double rxPps = null;

  @SerializedName("tx_bandwidth_kbyte")
  private Double txBandwidthKbyte = null;

  @SerializedName("tx_drop_pps")
  private Double txDropPps = null;

  @SerializedName("tx_error_pps")
  private Double txErrorPps = null;

  @SerializedName("tx_pps")
  private Double txPps = null;

  public NetworkInterfaceStat create(OffsetDateTime create) {
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

  public NetworkInterfaceStat dropPps(Double dropPps) {
    this.dropPps = dropPps;
    return this;
  }

   /**
   * Get dropPps
   * @return dropPps
  **/
  @Schema(description = "")
  public Double getDropPps() {
    return dropPps;
  }

  public void setDropPps(Double dropPps) {
    this.dropPps = dropPps;
  }

  public NetworkInterfaceStat errorPps(Double errorPps) {
    this.errorPps = errorPps;
    return this;
  }

   /**
   * Get errorPps
   * @return errorPps
  **/
  @Schema(description = "")
  public Double getErrorPps() {
    return errorPps;
  }

  public void setErrorPps(Double errorPps) {
    this.errorPps = errorPps;
  }

  public NetworkInterfaceStat rxBandwidthKbyte(Double rxBandwidthKbyte) {
    this.rxBandwidthKbyte = rxBandwidthKbyte;
    return this;
  }

   /**
   * Get rxBandwidthKbyte
   * @return rxBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getRxBandwidthKbyte() {
    return rxBandwidthKbyte;
  }

  public void setRxBandwidthKbyte(Double rxBandwidthKbyte) {
    this.rxBandwidthKbyte = rxBandwidthKbyte;
  }

  public NetworkInterfaceStat rxDropPps(Double rxDropPps) {
    this.rxDropPps = rxDropPps;
    return this;
  }

   /**
   * Get rxDropPps
   * @return rxDropPps
  **/
  @Schema(description = "")
  public Double getRxDropPps() {
    return rxDropPps;
  }

  public void setRxDropPps(Double rxDropPps) {
    this.rxDropPps = rxDropPps;
  }

  public NetworkInterfaceStat rxErrorPps(Double rxErrorPps) {
    this.rxErrorPps = rxErrorPps;
    return this;
  }

   /**
   * Get rxErrorPps
   * @return rxErrorPps
  **/
  @Schema(description = "")
  public Double getRxErrorPps() {
    return rxErrorPps;
  }

  public void setRxErrorPps(Double rxErrorPps) {
    this.rxErrorPps = rxErrorPps;
  }

  public NetworkInterfaceStat rxPps(Double rxPps) {
    this.rxPps = rxPps;
    return this;
  }

   /**
   * Get rxPps
   * @return rxPps
  **/
  @Schema(description = "")
  public Double getRxPps() {
    return rxPps;
  }

  public void setRxPps(Double rxPps) {
    this.rxPps = rxPps;
  }

  public NetworkInterfaceStat txBandwidthKbyte(Double txBandwidthKbyte) {
    this.txBandwidthKbyte = txBandwidthKbyte;
    return this;
  }

   /**
   * Get txBandwidthKbyte
   * @return txBandwidthKbyte
  **/
  @Schema(description = "")
  public Double getTxBandwidthKbyte() {
    return txBandwidthKbyte;
  }

  public void setTxBandwidthKbyte(Double txBandwidthKbyte) {
    this.txBandwidthKbyte = txBandwidthKbyte;
  }

  public NetworkInterfaceStat txDropPps(Double txDropPps) {
    this.txDropPps = txDropPps;
    return this;
  }

   /**
   * Get txDropPps
   * @return txDropPps
  **/
  @Schema(description = "")
  public Double getTxDropPps() {
    return txDropPps;
  }

  public void setTxDropPps(Double txDropPps) {
    this.txDropPps = txDropPps;
  }

  public NetworkInterfaceStat txErrorPps(Double txErrorPps) {
    this.txErrorPps = txErrorPps;
    return this;
  }

   /**
   * Get txErrorPps
   * @return txErrorPps
  **/
  @Schema(description = "")
  public Double getTxErrorPps() {
    return txErrorPps;
  }

  public void setTxErrorPps(Double txErrorPps) {
    this.txErrorPps = txErrorPps;
  }

  public NetworkInterfaceStat txPps(Double txPps) {
    this.txPps = txPps;
    return this;
  }

   /**
   * Get txPps
   * @return txPps
  **/
  @Schema(description = "")
  public Double getTxPps() {
    return txPps;
  }

  public void setTxPps(Double txPps) {
    this.txPps = txPps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkInterfaceStat networkInterfaceStat = (NetworkInterfaceStat) o;
    return Objects.equals(this.create, networkInterfaceStat.create) &&
        Objects.equals(this.dropPps, networkInterfaceStat.dropPps) &&
        Objects.equals(this.errorPps, networkInterfaceStat.errorPps) &&
        Objects.equals(this.rxBandwidthKbyte, networkInterfaceStat.rxBandwidthKbyte) &&
        Objects.equals(this.rxDropPps, networkInterfaceStat.rxDropPps) &&
        Objects.equals(this.rxErrorPps, networkInterfaceStat.rxErrorPps) &&
        Objects.equals(this.rxPps, networkInterfaceStat.rxPps) &&
        Objects.equals(this.txBandwidthKbyte, networkInterfaceStat.txBandwidthKbyte) &&
        Objects.equals(this.txDropPps, networkInterfaceStat.txDropPps) &&
        Objects.equals(this.txErrorPps, networkInterfaceStat.txErrorPps) &&
        Objects.equals(this.txPps, networkInterfaceStat.txPps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, dropPps, errorPps, rxBandwidthKbyte, rxDropPps, rxErrorPps, rxPps, txBandwidthKbyte, txDropPps, txErrorPps, txPps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterfaceStat {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dropPps: ").append(toIndentedString(dropPps)).append("\n");
    sb.append("    errorPps: ").append(toIndentedString(errorPps)).append("\n");
    sb.append("    rxBandwidthKbyte: ").append(toIndentedString(rxBandwidthKbyte)).append("\n");
    sb.append("    rxDropPps: ").append(toIndentedString(rxDropPps)).append("\n");
    sb.append("    rxErrorPps: ").append(toIndentedString(rxErrorPps)).append("\n");
    sb.append("    rxPps: ").append(toIndentedString(rxPps)).append("\n");
    sb.append("    txBandwidthKbyte: ").append(toIndentedString(txBandwidthKbyte)).append("\n");
    sb.append("    txDropPps: ").append(toIndentedString(txDropPps)).append("\n");
    sb.append("    txErrorPps: ").append(toIndentedString(txErrorPps)).append("\n");
    sb.append("    txPps: ").append(toIndentedString(txPps)).append("\n");
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
