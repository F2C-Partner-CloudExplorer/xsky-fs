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
 * LunInfo defines lun info output by xdc
 */
@Schema(description = "LunInfo defines lun info output by xdc")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class LunInfo {
  @SerializedName("alua_value")
  private Integer aluaValue = null;

  @SerializedName("dc_name")
  private String dcName = null;

  @SerializedName("lun_cfg")
  private String lunCfg = null;

  @SerializedName("lun_id")
  private Integer lunId = null;

  @SerializedName("lun_name")
  private String lunName = null;

  @SerializedName("lun_size")
  private Long lunSize = null;

  @SerializedName("lun_sn")
  private String lunSn = null;

  public LunInfo aluaValue(Integer aluaValue) {
    this.aluaValue = aluaValue;
    return this;
  }

   /**
   * Get aluaValue
   * @return aluaValue
  **/
  @Schema(description = "")
  public Integer getAluaValue() {
    return aluaValue;
  }

  public void setAluaValue(Integer aluaValue) {
    this.aluaValue = aluaValue;
  }

  public LunInfo dcName(String dcName) {
    this.dcName = dcName;
    return this;
  }

   /**
   * Get dcName
   * @return dcName
  **/
  @Schema(description = "")
  public String getDcName() {
    return dcName;
  }

  public void setDcName(String dcName) {
    this.dcName = dcName;
  }

  public LunInfo lunCfg(String lunCfg) {
    this.lunCfg = lunCfg;
    return this;
  }

   /**
   * Get lunCfg
   * @return lunCfg
  **/
  @Schema(description = "")
  public String getLunCfg() {
    return lunCfg;
  }

  public void setLunCfg(String lunCfg) {
    this.lunCfg = lunCfg;
  }

  public LunInfo lunId(Integer lunId) {
    this.lunId = lunId;
    return this;
  }

   /**
   * Get lunId
   * @return lunId
  **/
  @Schema(description = "")
  public Integer getLunId() {
    return lunId;
  }

  public void setLunId(Integer lunId) {
    this.lunId = lunId;
  }

  public LunInfo lunName(String lunName) {
    this.lunName = lunName;
    return this;
  }

   /**
   * Get lunName
   * @return lunName
  **/
  @Schema(description = "")
  public String getLunName() {
    return lunName;
  }

  public void setLunName(String lunName) {
    this.lunName = lunName;
  }

  public LunInfo lunSize(Long lunSize) {
    this.lunSize = lunSize;
    return this;
  }

   /**
   * Get lunSize
   * @return lunSize
  **/
  @Schema(description = "")
  public Long getLunSize() {
    return lunSize;
  }

  public void setLunSize(Long lunSize) {
    this.lunSize = lunSize;
  }

  public LunInfo lunSn(String lunSn) {
    this.lunSn = lunSn;
    return this;
  }

   /**
   * Get lunSn
   * @return lunSn
  **/
  @Schema(description = "")
  public String getLunSn() {
    return lunSn;
  }

  public void setLunSn(String lunSn) {
    this.lunSn = lunSn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LunInfo lunInfo = (LunInfo) o;
    return Objects.equals(this.aluaValue, lunInfo.aluaValue) &&
        Objects.equals(this.dcName, lunInfo.dcName) &&
        Objects.equals(this.lunCfg, lunInfo.lunCfg) &&
        Objects.equals(this.lunId, lunInfo.lunId) &&
        Objects.equals(this.lunName, lunInfo.lunName) &&
        Objects.equals(this.lunSize, lunInfo.lunSize) &&
        Objects.equals(this.lunSn, lunInfo.lunSn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aluaValue, dcName, lunCfg, lunId, lunName, lunSize, lunSn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LunInfo {\n");
    
    sb.append("    aluaValue: ").append(toIndentedString(aluaValue)).append("\n");
    sb.append("    dcName: ").append(toIndentedString(dcName)).append("\n");
    sb.append("    lunCfg: ").append(toIndentedString(lunCfg)).append("\n");
    sb.append("    lunId: ").append(toIndentedString(lunId)).append("\n");
    sb.append("    lunName: ").append(toIndentedString(lunName)).append("\n");
    sb.append("    lunSize: ").append(toIndentedString(lunSize)).append("\n");
    sb.append("    lunSn: ").append(toIndentedString(lunSn)).append("\n");
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
