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
import xio.sds.client.model.ExtCompatConf;
/**
 * SetExtCompatConfResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class SetExtCompatConfResp {
  @SerializedName("ext_compat_conf")
  private ExtCompatConf extCompatConf = null;

  public SetExtCompatConfResp extCompatConf(ExtCompatConf extCompatConf) {
    this.extCompatConf = extCompatConf;
    return this;
  }

   /**
   * Get extCompatConf
   * @return extCompatConf
  **/
  @Schema(required = true, description = "")
  public ExtCompatConf getExtCompatConf() {
    return extCompatConf;
  }

  public void setExtCompatConf(ExtCompatConf extCompatConf) {
    this.extCompatConf = extCompatConf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetExtCompatConfResp setExtCompatConfResp = (SetExtCompatConfResp) o;
    return Objects.equals(this.extCompatConf, setExtCompatConfResp.extCompatConf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extCompatConf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetExtCompatConfResp {\n");
    
    sb.append("    extCompatConf: ").append(toIndentedString(extCompatConf)).append("\n");
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
