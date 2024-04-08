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
/**
 * BlockReplicationConfig contains config for block replication
 */
@Schema(description = "BlockReplicationConfig contains config for block replication")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class BlockReplicationConfig {
  @SerializedName("destination")
  private String destination = null;

  @SerializedName("local_gateways")
  private List<String> localGateways = null;

  @SerializedName("remote_gateways")
  private List<String> remoteGateways = null;

  public BlockReplicationConfig destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @Schema(description = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public BlockReplicationConfig localGateways(List<String> localGateways) {
    this.localGateways = localGateways;
    return this;
  }

  public BlockReplicationConfig addLocalGatewaysItem(String localGatewaysItem) {
    if (this.localGateways == null) {
      this.localGateways = new ArrayList<String>();
    }
    this.localGateways.add(localGatewaysItem);
    return this;
  }

   /**
   * Get localGateways
   * @return localGateways
  **/
  @Schema(description = "")
  public List<String> getLocalGateways() {
    return localGateways;
  }

  public void setLocalGateways(List<String> localGateways) {
    this.localGateways = localGateways;
  }

  public BlockReplicationConfig remoteGateways(List<String> remoteGateways) {
    this.remoteGateways = remoteGateways;
    return this;
  }

  public BlockReplicationConfig addRemoteGatewaysItem(String remoteGatewaysItem) {
    if (this.remoteGateways == null) {
      this.remoteGateways = new ArrayList<String>();
    }
    this.remoteGateways.add(remoteGatewaysItem);
    return this;
  }

   /**
   * Get remoteGateways
   * @return remoteGateways
  **/
  @Schema(description = "")
  public List<String> getRemoteGateways() {
    return remoteGateways;
  }

  public void setRemoteGateways(List<String> remoteGateways) {
    this.remoteGateways = remoteGateways;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockReplicationConfig blockReplicationConfig = (BlockReplicationConfig) o;
    return Objects.equals(this.destination, blockReplicationConfig.destination) &&
        Objects.equals(this.localGateways, blockReplicationConfig.localGateways) &&
        Objects.equals(this.remoteGateways, blockReplicationConfig.remoteGateways);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, localGateways, remoteGateways);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockReplicationConfig {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    localGateways: ").append(toIndentedString(localGateways)).append("\n");
    sb.append("    remoteGateways: ").append(toIndentedString(remoteGateways)).append("\n");
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