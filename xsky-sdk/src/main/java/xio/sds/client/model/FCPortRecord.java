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
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import xio.sds.client.model.ClusterNestview;
import xio.sds.client.model.FCPort;
import xio.sds.client.model.FCPortErrCode;
import xio.sds.client.model.HostNestview;
/**
 * FCPortRecord consists FCPort, FCPortErrCode models data
 */
@Schema(description = "FCPortRecord consists FCPort, FCPortErrCode models data")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class FCPortRecord extends FCPort {
  @SerializedName("fc_port_errcode")
  private FCPortErrCode fcPortErrcode = null;

  public FCPortRecord fcPortErrcode(FCPortErrCode fcPortErrcode) {
    this.fcPortErrcode = fcPortErrcode;
    return this;
  }

   /**
   * Get fcPortErrcode
   * @return fcPortErrcode
  **/
  @Schema(description = "")
  public FCPortErrCode getFcPortErrcode() {
    return fcPortErrcode;
  }

  public void setFcPortErrcode(FCPortErrCode fcPortErrcode) {
    this.fcPortErrcode = fcPortErrcode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FCPortRecord fcPortRecord = (FCPortRecord) o;
    return Objects.equals(this.fcPortErrcode, fcPortRecord.fcPortErrcode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fcPortErrcode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FCPortRecord {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fcPortErrcode: ").append(toIndentedString(fcPortErrcode)).append("\n");
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
