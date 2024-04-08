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
 * TrapReceiver defines the snmp trap receiver
 */
@Schema(description = "TrapReceiver defines the snmp trap receiver")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class TrapReceiver {
  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("msg_level")
  private String msgLevel = null;

  @SerializedName("port")
  private Long port = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public TrapReceiver create(OffsetDateTime create) {
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

  public TrapReceiver id(Long id) {
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

  public TrapReceiver ip(String ip) {
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

  public TrapReceiver msgLevel(String msgLevel) {
    this.msgLevel = msgLevel;
    return this;
  }

   /**
   * Get msgLevel
   * @return msgLevel
  **/
  @Schema(description = "")
  public String getMsgLevel() {
    return msgLevel;
  }

  public void setMsgLevel(String msgLevel) {
    this.msgLevel = msgLevel;
  }

  public TrapReceiver port(Long port) {
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

  public TrapReceiver update(OffsetDateTime update) {
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
    TrapReceiver trapReceiver = (TrapReceiver) o;
    return Objects.equals(this.create, trapReceiver.create) &&
        Objects.equals(this.id, trapReceiver.id) &&
        Objects.equals(this.ip, trapReceiver.ip) &&
        Objects.equals(this.msgLevel, trapReceiver.msgLevel) &&
        Objects.equals(this.port, trapReceiver.port) &&
        Objects.equals(this.update, trapReceiver.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, id, ip, msgLevel, port, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrapReceiver {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    msgLevel: ").append(toIndentedString(msgLevel)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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