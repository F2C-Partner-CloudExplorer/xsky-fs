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
import xio.sds.client.model.VIP;
import xio.sds.client.model.VIPGroupNestview;
import xio.sds.client.model.VIPInstanceNestview;
/**
 * VIPRecord represents doc returned by API.
 */
@Schema(description = "VIPRecord represents doc returned by API.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VIPRecord extends VIP {
  @SerializedName("current_vip_instance")
  private VIPInstanceNestview currentVipInstance = null;

  @SerializedName("default_vip_instance")
  private VIPInstanceNestview defaultVipInstance = null;

  public VIPRecord currentVipInstance(VIPInstanceNestview currentVipInstance) {
    this.currentVipInstance = currentVipInstance;
    return this;
  }

   /**
   * Get currentVipInstance
   * @return currentVipInstance
  **/
  @Schema(description = "")
  public VIPInstanceNestview getCurrentVipInstance() {
    return currentVipInstance;
  }

  public void setCurrentVipInstance(VIPInstanceNestview currentVipInstance) {
    this.currentVipInstance = currentVipInstance;
  }

  public VIPRecord defaultVipInstance(VIPInstanceNestview defaultVipInstance) {
    this.defaultVipInstance = defaultVipInstance;
    return this;
  }

   /**
   * Get defaultVipInstance
   * @return defaultVipInstance
  **/
  @Schema(description = "")
  public VIPInstanceNestview getDefaultVipInstance() {
    return defaultVipInstance;
  }

  public void setDefaultVipInstance(VIPInstanceNestview defaultVipInstance) {
    this.defaultVipInstance = defaultVipInstance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIPRecord viPRecord = (VIPRecord) o;
    return Objects.equals(this.currentVipInstance, viPRecord.currentVipInstance) &&
        Objects.equals(this.defaultVipInstance, viPRecord.defaultVipInstance) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentVipInstance, defaultVipInstance, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIPRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    currentVipInstance: ").append(toIndentedString(currentVipInstance)).append("\n");
    sb.append("    defaultVipInstance: ").append(toIndentedString(defaultVipInstance)).append("\n");
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
