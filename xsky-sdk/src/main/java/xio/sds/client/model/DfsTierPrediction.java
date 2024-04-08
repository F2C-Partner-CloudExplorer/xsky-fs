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
import xio.sds.client.model.DataKbytePredictionPoint;
import xio.sds.client.model.PredictionPoint;
/**
 * DfsTierPrediction contains tier prediction data
 */
@Schema(description = "DfsTierPrediction contains tier prediction data")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsTierPrediction {
  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("data_kbyte_1day")
  private Long dataKbyte1day = null;

  @SerializedName("data_kbyte_30days")
  private Long dataKbyte30days = null;

  @SerializedName("data_kbyte_7days")
  private Long dataKbyte7days = null;

  @SerializedName("data_kbyte_points")
  private List<DataKbytePredictionPoint> dataKbytePoints = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("used_kbyte_1day")
  private Long usedKbyte1day = null;

  @SerializedName("used_kbyte_30days")
  private Long usedKbyte30days = null;

  @SerializedName("used_kbyte_7days")
  private Long usedKbyte7days = null;

  @SerializedName("used_kbyte_points")
  private List<PredictionPoint> usedKbytePoints = null;

  public DfsTierPrediction create(OffsetDateTime create) {
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

  public DfsTierPrediction dataKbyte1day(Long dataKbyte1day) {
    this.dataKbyte1day = dataKbyte1day;
    return this;
  }

   /**
   * Get dataKbyte1day
   * @return dataKbyte1day
  **/
  @Schema(description = "")
  public Long getDataKbyte1day() {
    return dataKbyte1day;
  }

  public void setDataKbyte1day(Long dataKbyte1day) {
    this.dataKbyte1day = dataKbyte1day;
  }

  public DfsTierPrediction dataKbyte30days(Long dataKbyte30days) {
    this.dataKbyte30days = dataKbyte30days;
    return this;
  }

   /**
   * Get dataKbyte30days
   * @return dataKbyte30days
  **/
  @Schema(description = "")
  public Long getDataKbyte30days() {
    return dataKbyte30days;
  }

  public void setDataKbyte30days(Long dataKbyte30days) {
    this.dataKbyte30days = dataKbyte30days;
  }

  public DfsTierPrediction dataKbyte7days(Long dataKbyte7days) {
    this.dataKbyte7days = dataKbyte7days;
    return this;
  }

   /**
   * Get dataKbyte7days
   * @return dataKbyte7days
  **/
  @Schema(description = "")
  public Long getDataKbyte7days() {
    return dataKbyte7days;
  }

  public void setDataKbyte7days(Long dataKbyte7days) {
    this.dataKbyte7days = dataKbyte7days;
  }

  public DfsTierPrediction dataKbytePoints(List<DataKbytePredictionPoint> dataKbytePoints) {
    this.dataKbytePoints = dataKbytePoints;
    return this;
  }

  public DfsTierPrediction addDataKbytePointsItem(DataKbytePredictionPoint dataKbytePointsItem) {
    if (this.dataKbytePoints == null) {
      this.dataKbytePoints = new ArrayList<DataKbytePredictionPoint>();
    }
    this.dataKbytePoints.add(dataKbytePointsItem);
    return this;
  }

   /**
   * Get dataKbytePoints
   * @return dataKbytePoints
  **/
  @Schema(description = "")
  public List<DataKbytePredictionPoint> getDataKbytePoints() {
    return dataKbytePoints;
  }

  public void setDataKbytePoints(List<DataKbytePredictionPoint> dataKbytePoints) {
    this.dataKbytePoints = dataKbytePoints;
  }

  public DfsTierPrediction id(Long id) {
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

  public DfsTierPrediction usedKbyte1day(Long usedKbyte1day) {
    this.usedKbyte1day = usedKbyte1day;
    return this;
  }

   /**
   * Get usedKbyte1day
   * @return usedKbyte1day
  **/
  @Schema(description = "")
  public Long getUsedKbyte1day() {
    return usedKbyte1day;
  }

  public void setUsedKbyte1day(Long usedKbyte1day) {
    this.usedKbyte1day = usedKbyte1day;
  }

  public DfsTierPrediction usedKbyte30days(Long usedKbyte30days) {
    this.usedKbyte30days = usedKbyte30days;
    return this;
  }

   /**
   * Get usedKbyte30days
   * @return usedKbyte30days
  **/
  @Schema(description = "")
  public Long getUsedKbyte30days() {
    return usedKbyte30days;
  }

  public void setUsedKbyte30days(Long usedKbyte30days) {
    this.usedKbyte30days = usedKbyte30days;
  }

  public DfsTierPrediction usedKbyte7days(Long usedKbyte7days) {
    this.usedKbyte7days = usedKbyte7days;
    return this;
  }

   /**
   * Get usedKbyte7days
   * @return usedKbyte7days
  **/
  @Schema(description = "")
  public Long getUsedKbyte7days() {
    return usedKbyte7days;
  }

  public void setUsedKbyte7days(Long usedKbyte7days) {
    this.usedKbyte7days = usedKbyte7days;
  }

  public DfsTierPrediction usedKbytePoints(List<PredictionPoint> usedKbytePoints) {
    this.usedKbytePoints = usedKbytePoints;
    return this;
  }

  public DfsTierPrediction addUsedKbytePointsItem(PredictionPoint usedKbytePointsItem) {
    if (this.usedKbytePoints == null) {
      this.usedKbytePoints = new ArrayList<PredictionPoint>();
    }
    this.usedKbytePoints.add(usedKbytePointsItem);
    return this;
  }

   /**
   * Get usedKbytePoints
   * @return usedKbytePoints
  **/
  @Schema(description = "")
  public List<PredictionPoint> getUsedKbytePoints() {
    return usedKbytePoints;
  }

  public void setUsedKbytePoints(List<PredictionPoint> usedKbytePoints) {
    this.usedKbytePoints = usedKbytePoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsTierPrediction dfsTierPrediction = (DfsTierPrediction) o;
    return Objects.equals(this.create, dfsTierPrediction.create) &&
        Objects.equals(this.dataKbyte1day, dfsTierPrediction.dataKbyte1day) &&
        Objects.equals(this.dataKbyte30days, dfsTierPrediction.dataKbyte30days) &&
        Objects.equals(this.dataKbyte7days, dfsTierPrediction.dataKbyte7days) &&
        Objects.equals(this.dataKbytePoints, dfsTierPrediction.dataKbytePoints) &&
        Objects.equals(this.id, dfsTierPrediction.id) &&
        Objects.equals(this.usedKbyte1day, dfsTierPrediction.usedKbyte1day) &&
        Objects.equals(this.usedKbyte30days, dfsTierPrediction.usedKbyte30days) &&
        Objects.equals(this.usedKbyte7days, dfsTierPrediction.usedKbyte7days) &&
        Objects.equals(this.usedKbytePoints, dfsTierPrediction.usedKbytePoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, dataKbyte1day, dataKbyte30days, dataKbyte7days, dataKbytePoints, id, usedKbyte1day, usedKbyte30days, usedKbyte7days, usedKbytePoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsTierPrediction {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    dataKbyte1day: ").append(toIndentedString(dataKbyte1day)).append("\n");
    sb.append("    dataKbyte30days: ").append(toIndentedString(dataKbyte30days)).append("\n");
    sb.append("    dataKbyte7days: ").append(toIndentedString(dataKbyte7days)).append("\n");
    sb.append("    dataKbytePoints: ").append(toIndentedString(dataKbytePoints)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usedKbyte1day: ").append(toIndentedString(usedKbyte1day)).append("\n");
    sb.append("    usedKbyte30days: ").append(toIndentedString(usedKbyte30days)).append("\n");
    sb.append("    usedKbyte7days: ").append(toIndentedString(usedKbyte7days)).append("\n");
    sb.append("    usedKbytePoints: ").append(toIndentedString(usedKbytePoints)).append("\n");
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
