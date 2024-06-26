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
import xio.sds.client.model.OSZonePeriod;
/**
 * OSZonePeriodsResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OSZonePeriodsResp {
  @SerializedName("os_zone_periods")
  private List<OSZonePeriod> osZonePeriods = new ArrayList<OSZonePeriod>();

  public OSZonePeriodsResp osZonePeriods(List<OSZonePeriod> osZonePeriods) {
    this.osZonePeriods = osZonePeriods;
    return this;
  }

  public OSZonePeriodsResp addOsZonePeriodsItem(OSZonePeriod osZonePeriodsItem) {
    this.osZonePeriods.add(osZonePeriodsItem);
    return this;
  }

   /**
   * Get osZonePeriods
   * @return osZonePeriods
  **/
  @Schema(required = true, description = "")
  public List<OSZonePeriod> getOsZonePeriods() {
    return osZonePeriods;
  }

  public void setOsZonePeriods(List<OSZonePeriod> osZonePeriods) {
    this.osZonePeriods = osZonePeriods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSZonePeriodsResp osZonePeriodsResp = (OSZonePeriodsResp) o;
    return Objects.equals(this.osZonePeriods, osZonePeriodsResp.osZonePeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osZonePeriods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSZonePeriodsResp {\n");
    
    sb.append("    osZonePeriods: ").append(toIndentedString(osZonePeriods)).append("\n");
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
