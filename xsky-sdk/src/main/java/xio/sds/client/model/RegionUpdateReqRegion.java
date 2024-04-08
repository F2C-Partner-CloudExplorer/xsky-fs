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
 * RegionUpdateReqRegion
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class RegionUpdateReqRegion {
  @SerializedName("name")
  private String name = null;

  @SerializedName("stats_reserved_days")
  private Long statsReservedDays = null;

  public RegionUpdateReqRegion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * retion name
   * @return name
  **/
  @Schema(required = true, description = "retion name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RegionUpdateReqRegion statsReservedDays(Long statsReservedDays) {
    this.statsReservedDays = statsReservedDays;
    return this;
  }

   /**
   * region stats reserved day
   * @return statsReservedDays
  **/
  @Schema(description = "region stats reserved day")
  public Long getStatsReservedDays() {
    return statsReservedDays;
  }

  public void setStatsReservedDays(Long statsReservedDays) {
    this.statsReservedDays = statsReservedDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionUpdateReqRegion regionUpdateReqRegion = (RegionUpdateReqRegion) o;
    return Objects.equals(this.name, regionUpdateReqRegion.name) &&
        Objects.equals(this.statsReservedDays, regionUpdateReqRegion.statsReservedDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, statsReservedDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionUpdateReqRegion {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statsReservedDays: ").append(toIndentedString(statsReservedDays)).append("\n");
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
