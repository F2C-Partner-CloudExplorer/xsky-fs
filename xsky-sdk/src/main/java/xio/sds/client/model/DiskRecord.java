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
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.Disk;
import xio.sds.client.model.DiskStat;
import xio.sds.client.model.Host;
import xio.sds.client.model.Partition;
import xio.sds.client.model.SmartAttr;
/**
 * DiskRecord contains information of a disk
 */
@Schema(description = "DiskRecord contains information of a disk")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DiskRecord extends Disk {
  @SerializedName("samples")
  private List<DiskStat> samples = null;

  public DiskRecord samples(List<DiskStat> samples) {
    this.samples = samples;
    return this;
  }

  public DiskRecord addSamplesItem(DiskStat samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<DiskStat>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @Schema(description = "")
  public List<DiskStat> getSamples() {
    return samples;
  }

  public void setSamples(List<DiskStat> samples) {
    this.samples = samples;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskRecord diskRecord = (DiskRecord) o;
    return Objects.equals(this.samples, diskRecord.samples) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samples, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    samples: ").append(toIndentedString(samples)).append("\n");
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
