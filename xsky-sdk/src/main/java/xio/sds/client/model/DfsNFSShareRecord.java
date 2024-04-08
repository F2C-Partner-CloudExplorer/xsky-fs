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
import xio.sds.client.model.DfsGatewayGroupNestview;
import xio.sds.client.model.DfsNFSShare;
import xio.sds.client.model.DfsNFSShareStat;
import xio.sds.client.model.DfsPathNestview;
import xio.sds.client.model.DfsRootfsNestview;
/**
 * DfsNFSShareRecord combine DfsNFSShare and DfsPathPerformanceStat as API response
 */
@Schema(description = "DfsNFSShareRecord combine DfsNFSShare and DfsPathPerformanceStat as API response")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsNFSShareRecord extends DfsNFSShare {
  @SerializedName("samples")
  private List<DfsNFSShareStat> samples = null;

  public DfsNFSShareRecord samples(List<DfsNFSShareStat> samples) {
    this.samples = samples;
    return this;
  }

  public DfsNFSShareRecord addSamplesItem(DfsNFSShareStat samplesItem) {
    if (this.samples == null) {
      this.samples = new ArrayList<DfsNFSShareStat>();
    }
    this.samples.add(samplesItem);
    return this;
  }

   /**
   * Get samples
   * @return samples
  **/
  @Schema(description = "")
  public List<DfsNFSShareStat> getSamples() {
    return samples;
  }

  public void setSamples(List<DfsNFSShareStat> samples) {
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
    DfsNFSShareRecord dfsNFSShareRecord = (DfsNFSShareRecord) o;
    return Objects.equals(this.samples, dfsNFSShareRecord.samples) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samples, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsNFSShareRecord {\n");
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
