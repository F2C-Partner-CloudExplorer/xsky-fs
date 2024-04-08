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
import xio.sds.client.model.DfsSMBShareACLReq;
/**
 * DfsSMBShareAddACLsReqShare
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsSMBShareAddACLsReqShare {
  @SerializedName("dfs_smb_share_acls")
  private List<DfsSMBShareACLReq> dfsSmbShareAcls = new ArrayList<DfsSMBShareACLReq>();

  public DfsSMBShareAddACLsReqShare dfsSmbShareAcls(List<DfsSMBShareACLReq> dfsSmbShareAcls) {
    this.dfsSmbShareAcls = dfsSmbShareAcls;
    return this;
  }

  public DfsSMBShareAddACLsReqShare addDfsSmbShareAclsItem(DfsSMBShareACLReq dfsSmbShareAclsItem) {
    this.dfsSmbShareAcls.add(dfsSmbShareAclsItem);
    return this;
  }

   /**
   * access control array
   * @return dfsSmbShareAcls
  **/
  @Schema(required = true, description = "access control array")
  public List<DfsSMBShareACLReq> getDfsSmbShareAcls() {
    return dfsSmbShareAcls;
  }

  public void setDfsSmbShareAcls(List<DfsSMBShareACLReq> dfsSmbShareAcls) {
    this.dfsSmbShareAcls = dfsSmbShareAcls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsSMBShareAddACLsReqShare dfsSMBShareAddACLsReqShare = (DfsSMBShareAddACLsReqShare) o;
    return Objects.equals(this.dfsSmbShareAcls, dfsSMBShareAddACLsReqShare.dfsSmbShareAcls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dfsSmbShareAcls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsSMBShareAddACLsReqShare {\n");
    
    sb.append("    dfsSmbShareAcls: ").append(toIndentedString(dfsSmbShareAcls)).append("\n");
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
