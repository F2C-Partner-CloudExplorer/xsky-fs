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
import xio.sds.client.model.AlertInfo;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.ErrorRecord;
import xio.sds.client.model.HostNestview;
import xio.sds.client.model.ObjectInfo;
/**
 * AlertInfoRecord defines the response of alert info
 */
@Schema(description = "AlertInfoRecord defines the response of alert info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AlertInfoRecord extends AlertInfo {
  @SerializedName("error_records")
  private List<ErrorRecord> errorRecords = null;

  public AlertInfoRecord errorRecords(List<ErrorRecord> errorRecords) {
    this.errorRecords = errorRecords;
    return this;
  }

  public AlertInfoRecord addErrorRecordsItem(ErrorRecord errorRecordsItem) {
    if (this.errorRecords == null) {
      this.errorRecords = new ArrayList<ErrorRecord>();
    }
    this.errorRecords.add(errorRecordsItem);
    return this;
  }

   /**
   * Get errorRecords
   * @return errorRecords
  **/
  @Schema(description = "")
  public List<ErrorRecord> getErrorRecords() {
    return errorRecords;
  }

  public void setErrorRecords(List<ErrorRecord> errorRecords) {
    this.errorRecords = errorRecords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertInfoRecord alertInfoRecord = (AlertInfoRecord) o;
    return Objects.equals(this.errorRecords, alertInfoRecord.errorRecords) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorRecords, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertInfoRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    errorRecords: ").append(toIndentedString(errorRecords)).append("\n");
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
