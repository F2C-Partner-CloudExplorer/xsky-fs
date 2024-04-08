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
 * LifecycleBase define base lc info
 */
@Schema(description = "LifecycleBase define base lc info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class LifecycleBase {
  @SerializedName("days")
  private Long days = null;

  @SerializedName("start_at")
  private String startAt = null;

  @SerializedName("stop_at")
  private String stopAt = null;

  public LifecycleBase days(Long days) {
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @Schema(description = "")
  public Long getDays() {
    return days;
  }

  public void setDays(Long days) {
    this.days = days;
  }

  public LifecycleBase startAt(String startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Get startAt
   * @return startAt
  **/
  @Schema(description = "")
  public String getStartAt() {
    return startAt;
  }

  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }

  public LifecycleBase stopAt(String stopAt) {
    this.stopAt = stopAt;
    return this;
  }

   /**
   * Get stopAt
   * @return stopAt
  **/
  @Schema(description = "")
  public String getStopAt() {
    return stopAt;
  }

  public void setStopAt(String stopAt) {
    this.stopAt = stopAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleBase lifecycleBase = (LifecycleBase) o;
    return Objects.equals(this.days, lifecycleBase.days) &&
        Objects.equals(this.startAt, lifecycleBase.startAt) &&
        Objects.equals(this.stopAt, lifecycleBase.stopAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, startAt, stopAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleBase {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    stopAt: ").append(toIndentedString(stopAt)).append("\n");
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