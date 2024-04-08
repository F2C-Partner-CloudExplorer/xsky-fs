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
 * VolumeIOSize
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class VolumeIOSize {
  @SerializedName("0_4kbyte")
  private Double _04kbyte = null;

  @SerializedName("32_64kbyte")
  private Double _3264kbyte = null;

  @SerializedName("4_8kbyte")
  private Double _48kbyte = null;

  @SerializedName("64_512kbyte")
  private Double _64512kbyte = null;

  @SerializedName("8_32kbyte")
  private Double _832kbyte = null;

  @SerializedName("above_512kbyte")
  private Double above512kbyte = null;

  public VolumeIOSize _04kbyte(Double _04kbyte) {
    this._04kbyte = _04kbyte;
    return this;
  }

   /**
   * Get _04kbyte
   * @return _04kbyte
  **/
  @Schema(description = "")
  public Double get04kbyte() {
    return _04kbyte;
  }

  public void set04kbyte(Double _04kbyte) {
    this._04kbyte = _04kbyte;
  }

  public VolumeIOSize _3264kbyte(Double _3264kbyte) {
    this._3264kbyte = _3264kbyte;
    return this;
  }

   /**
   * Get _3264kbyte
   * @return _3264kbyte
  **/
  @Schema(description = "")
  public Double get3264kbyte() {
    return _3264kbyte;
  }

  public void set3264kbyte(Double _3264kbyte) {
    this._3264kbyte = _3264kbyte;
  }

  public VolumeIOSize _48kbyte(Double _48kbyte) {
    this._48kbyte = _48kbyte;
    return this;
  }

   /**
   * Get _48kbyte
   * @return _48kbyte
  **/
  @Schema(description = "")
  public Double get48kbyte() {
    return _48kbyte;
  }

  public void set48kbyte(Double _48kbyte) {
    this._48kbyte = _48kbyte;
  }

  public VolumeIOSize _64512kbyte(Double _64512kbyte) {
    this._64512kbyte = _64512kbyte;
    return this;
  }

   /**
   * Get _64512kbyte
   * @return _64512kbyte
  **/
  @Schema(description = "")
  public Double get64512kbyte() {
    return _64512kbyte;
  }

  public void set64512kbyte(Double _64512kbyte) {
    this._64512kbyte = _64512kbyte;
  }

  public VolumeIOSize _832kbyte(Double _832kbyte) {
    this._832kbyte = _832kbyte;
    return this;
  }

   /**
   * Get _832kbyte
   * @return _832kbyte
  **/
  @Schema(description = "")
  public Double get832kbyte() {
    return _832kbyte;
  }

  public void set832kbyte(Double _832kbyte) {
    this._832kbyte = _832kbyte;
  }

  public VolumeIOSize above512kbyte(Double above512kbyte) {
    this.above512kbyte = above512kbyte;
    return this;
  }

   /**
   * Get above512kbyte
   * @return above512kbyte
  **/
  @Schema(description = "")
  public Double getAbove512kbyte() {
    return above512kbyte;
  }

  public void setAbove512kbyte(Double above512kbyte) {
    this.above512kbyte = above512kbyte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeIOSize volumeIOSize = (VolumeIOSize) o;
    return Objects.equals(this._04kbyte, volumeIOSize._04kbyte) &&
        Objects.equals(this._3264kbyte, volumeIOSize._3264kbyte) &&
        Objects.equals(this._48kbyte, volumeIOSize._48kbyte) &&
        Objects.equals(this._64512kbyte, volumeIOSize._64512kbyte) &&
        Objects.equals(this._832kbyte, volumeIOSize._832kbyte) &&
        Objects.equals(this.above512kbyte, volumeIOSize.above512kbyte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_04kbyte, _3264kbyte, _48kbyte, _64512kbyte, _832kbyte, above512kbyte);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeIOSize {\n");
    
    sb.append("    _04kbyte: ").append(toIndentedString(_04kbyte)).append("\n");
    sb.append("    _3264kbyte: ").append(toIndentedString(_3264kbyte)).append("\n");
    sb.append("    _48kbyte: ").append(toIndentedString(_48kbyte)).append("\n");
    sb.append("    _64512kbyte: ").append(toIndentedString(_64512kbyte)).append("\n");
    sb.append("    _832kbyte: ").append(toIndentedString(_832kbyte)).append("\n");
    sb.append("    above512kbyte: ").append(toIndentedString(above512kbyte)).append("\n");
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
