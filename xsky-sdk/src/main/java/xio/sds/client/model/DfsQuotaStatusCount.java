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
 * DfsQuotaStatusCount defines dfs quota status count
 */
@Schema(description = "DfsQuotaStatusCount defines dfs quota status count")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsQuotaStatusCount {
  @SerializedName("active")
  private Long active = null;

  @SerializedName("building_error")
  private Long buildingError = null;

  @SerializedName("deleting_error")
  private Long deletingError = null;

  @SerializedName("error")
  private Long error = null;

  @SerializedName("exceed_soft")
  private Long exceedSoft = null;

  @SerializedName("exceed_suggestion")
  private Long exceedSuggestion = null;

  @SerializedName("write_inhibit")
  private Long writeInhibit = null;

  public DfsQuotaStatusCount active(Long active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @Schema(description = "")
  public Long getActive() {
    return active;
  }

  public void setActive(Long active) {
    this.active = active;
  }

  public DfsQuotaStatusCount buildingError(Long buildingError) {
    this.buildingError = buildingError;
    return this;
  }

   /**
   * Get buildingError
   * @return buildingError
  **/
  @Schema(description = "")
  public Long getBuildingError() {
    return buildingError;
  }

  public void setBuildingError(Long buildingError) {
    this.buildingError = buildingError;
  }

  public DfsQuotaStatusCount deletingError(Long deletingError) {
    this.deletingError = deletingError;
    return this;
  }

   /**
   * Get deletingError
   * @return deletingError
  **/
  @Schema(description = "")
  public Long getDeletingError() {
    return deletingError;
  }

  public void setDeletingError(Long deletingError) {
    this.deletingError = deletingError;
  }

  public DfsQuotaStatusCount error(Long error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @Schema(description = "")
  public Long getError() {
    return error;
  }

  public void setError(Long error) {
    this.error = error;
  }

  public DfsQuotaStatusCount exceedSoft(Long exceedSoft) {
    this.exceedSoft = exceedSoft;
    return this;
  }

   /**
   * Get exceedSoft
   * @return exceedSoft
  **/
  @Schema(description = "")
  public Long getExceedSoft() {
    return exceedSoft;
  }

  public void setExceedSoft(Long exceedSoft) {
    this.exceedSoft = exceedSoft;
  }

  public DfsQuotaStatusCount exceedSuggestion(Long exceedSuggestion) {
    this.exceedSuggestion = exceedSuggestion;
    return this;
  }

   /**
   * Get exceedSuggestion
   * @return exceedSuggestion
  **/
  @Schema(description = "")
  public Long getExceedSuggestion() {
    return exceedSuggestion;
  }

  public void setExceedSuggestion(Long exceedSuggestion) {
    this.exceedSuggestion = exceedSuggestion;
  }

  public DfsQuotaStatusCount writeInhibit(Long writeInhibit) {
    this.writeInhibit = writeInhibit;
    return this;
  }

   /**
   * Get writeInhibit
   * @return writeInhibit
  **/
  @Schema(description = "")
  public Long getWriteInhibit() {
    return writeInhibit;
  }

  public void setWriteInhibit(Long writeInhibit) {
    this.writeInhibit = writeInhibit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsQuotaStatusCount dfsQuotaStatusCount = (DfsQuotaStatusCount) o;
    return Objects.equals(this.active, dfsQuotaStatusCount.active) &&
        Objects.equals(this.buildingError, dfsQuotaStatusCount.buildingError) &&
        Objects.equals(this.deletingError, dfsQuotaStatusCount.deletingError) &&
        Objects.equals(this.error, dfsQuotaStatusCount.error) &&
        Objects.equals(this.exceedSoft, dfsQuotaStatusCount.exceedSoft) &&
        Objects.equals(this.exceedSuggestion, dfsQuotaStatusCount.exceedSuggestion) &&
        Objects.equals(this.writeInhibit, dfsQuotaStatusCount.writeInhibit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, buildingError, deletingError, error, exceedSoft, exceedSuggestion, writeInhibit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsQuotaStatusCount {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    buildingError: ").append(toIndentedString(buildingError)).append("\n");
    sb.append("    deletingError: ").append(toIndentedString(deletingError)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    exceedSoft: ").append(toIndentedString(exceedSoft)).append("\n");
    sb.append("    exceedSuggestion: ").append(toIndentedString(exceedSuggestion)).append("\n");
    sb.append("    writeInhibit: ").append(toIndentedString(writeInhibit)).append("\n");
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
