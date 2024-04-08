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
 * DfsSnapshotsOverviewPage define dfs snapshots overview info
 */
@Schema(description = "DfsSnapshotsOverviewPage define dfs snapshots overview info")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsSnapshotsOverviewPage {
  @SerializedName("dp_snapshot_num")
  private Long dpSnapshotNum = null;

  @SerializedName("manual_snapshot_num")
  private Long manualSnapshotNum = null;

  @SerializedName("path_dp_snapshot_num")
  private Long pathDpSnapshotNum = null;

  @SerializedName("path_manual_num")
  private Long pathManualNum = null;

  @SerializedName("path_total_num")
  private Long pathTotalNum = null;

  @SerializedName("snapshot_total_num")
  private Long snapshotTotalNum = null;

  public DfsSnapshotsOverviewPage dpSnapshotNum(Long dpSnapshotNum) {
    this.dpSnapshotNum = dpSnapshotNum;
    return this;
  }

   /**
   * Get dpSnapshotNum
   * @return dpSnapshotNum
  **/
  @Schema(description = "")
  public Long getDpSnapshotNum() {
    return dpSnapshotNum;
  }

  public void setDpSnapshotNum(Long dpSnapshotNum) {
    this.dpSnapshotNum = dpSnapshotNum;
  }

  public DfsSnapshotsOverviewPage manualSnapshotNum(Long manualSnapshotNum) {
    this.manualSnapshotNum = manualSnapshotNum;
    return this;
  }

   /**
   * Get manualSnapshotNum
   * @return manualSnapshotNum
  **/
  @Schema(description = "")
  public Long getManualSnapshotNum() {
    return manualSnapshotNum;
  }

  public void setManualSnapshotNum(Long manualSnapshotNum) {
    this.manualSnapshotNum = manualSnapshotNum;
  }

  public DfsSnapshotsOverviewPage pathDpSnapshotNum(Long pathDpSnapshotNum) {
    this.pathDpSnapshotNum = pathDpSnapshotNum;
    return this;
  }

   /**
   * Get pathDpSnapshotNum
   * @return pathDpSnapshotNum
  **/
  @Schema(description = "")
  public Long getPathDpSnapshotNum() {
    return pathDpSnapshotNum;
  }

  public void setPathDpSnapshotNum(Long pathDpSnapshotNum) {
    this.pathDpSnapshotNum = pathDpSnapshotNum;
  }

  public DfsSnapshotsOverviewPage pathManualNum(Long pathManualNum) {
    this.pathManualNum = pathManualNum;
    return this;
  }

   /**
   * Get pathManualNum
   * @return pathManualNum
  **/
  @Schema(description = "")
  public Long getPathManualNum() {
    return pathManualNum;
  }

  public void setPathManualNum(Long pathManualNum) {
    this.pathManualNum = pathManualNum;
  }

  public DfsSnapshotsOverviewPage pathTotalNum(Long pathTotalNum) {
    this.pathTotalNum = pathTotalNum;
    return this;
  }

   /**
   * Get pathTotalNum
   * @return pathTotalNum
  **/
  @Schema(description = "")
  public Long getPathTotalNum() {
    return pathTotalNum;
  }

  public void setPathTotalNum(Long pathTotalNum) {
    this.pathTotalNum = pathTotalNum;
  }

  public DfsSnapshotsOverviewPage snapshotTotalNum(Long snapshotTotalNum) {
    this.snapshotTotalNum = snapshotTotalNum;
    return this;
  }

   /**
   * Get snapshotTotalNum
   * @return snapshotTotalNum
  **/
  @Schema(description = "")
  public Long getSnapshotTotalNum() {
    return snapshotTotalNum;
  }

  public void setSnapshotTotalNum(Long snapshotTotalNum) {
    this.snapshotTotalNum = snapshotTotalNum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsSnapshotsOverviewPage dfsSnapshotsOverviewPage = (DfsSnapshotsOverviewPage) o;
    return Objects.equals(this.dpSnapshotNum, dfsSnapshotsOverviewPage.dpSnapshotNum) &&
        Objects.equals(this.manualSnapshotNum, dfsSnapshotsOverviewPage.manualSnapshotNum) &&
        Objects.equals(this.pathDpSnapshotNum, dfsSnapshotsOverviewPage.pathDpSnapshotNum) &&
        Objects.equals(this.pathManualNum, dfsSnapshotsOverviewPage.pathManualNum) &&
        Objects.equals(this.pathTotalNum, dfsSnapshotsOverviewPage.pathTotalNum) &&
        Objects.equals(this.snapshotTotalNum, dfsSnapshotsOverviewPage.snapshotTotalNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dpSnapshotNum, manualSnapshotNum, pathDpSnapshotNum, pathManualNum, pathTotalNum, snapshotTotalNum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsSnapshotsOverviewPage {\n");
    
    sb.append("    dpSnapshotNum: ").append(toIndentedString(dpSnapshotNum)).append("\n");
    sb.append("    manualSnapshotNum: ").append(toIndentedString(manualSnapshotNum)).append("\n");
    sb.append("    pathDpSnapshotNum: ").append(toIndentedString(pathDpSnapshotNum)).append("\n");
    sb.append("    pathManualNum: ").append(toIndentedString(pathManualNum)).append("\n");
    sb.append("    pathTotalNum: ").append(toIndentedString(pathTotalNum)).append("\n");
    sb.append("    snapshotTotalNum: ").append(toIndentedString(snapshotTotalNum)).append("\n");
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
