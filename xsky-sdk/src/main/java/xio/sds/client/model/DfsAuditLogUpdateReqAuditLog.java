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
/**
 * DfsAuditLogUpdateReqAuditLog
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsAuditLogUpdateReqAuditLog {
  @SerializedName("actions")
  private List<String> actions = null;

  @SerializedName("dfs_rootfs_id")
  private Long dfsRootfsId = null;

  @SerializedName("log_path")
  private String logPath = null;

  @SerializedName("size")
  private Long size = null;

  public DfsAuditLogUpdateReqAuditLog actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public DfsAuditLogUpdateReqAuditLog addActionsItem(String actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<String>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * actions need to audit
   * @return actions
  **/
  @Schema(description = "actions need to audit")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public DfsAuditLogUpdateReqAuditLog dfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
    return this;
  }

   /**
   * rootfs id
   * @return dfsRootfsId
  **/
  @Schema(required = true, description = "rootfs id")
  public Long getDfsRootfsId() {
    return dfsRootfsId;
  }

  public void setDfsRootfsId(Long dfsRootfsId) {
    this.dfsRootfsId = dfsRootfsId;
  }

  public DfsAuditLogUpdateReqAuditLog logPath(String logPath) {
    this.logPath = logPath;
    return this;
  }

   /**
   * audit log path
   * @return logPath
  **/
  @Schema(description = "audit log path")
  public String getLogPath() {
    return logPath;
  }

  public void setLogPath(String logPath) {
    this.logPath = logPath;
  }

  public DfsAuditLogUpdateReqAuditLog size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * max size of audit log
   * @return size
  **/
  @Schema(description = "max size of audit log")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsAuditLogUpdateReqAuditLog dfsAuditLogUpdateReqAuditLog = (DfsAuditLogUpdateReqAuditLog) o;
    return Objects.equals(this.actions, dfsAuditLogUpdateReqAuditLog.actions) &&
        Objects.equals(this.dfsRootfsId, dfsAuditLogUpdateReqAuditLog.dfsRootfsId) &&
        Objects.equals(this.logPath, dfsAuditLogUpdateReqAuditLog.logPath) &&
        Objects.equals(this.size, dfsAuditLogUpdateReqAuditLog.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, dfsRootfsId, logPath, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsAuditLogUpdateReqAuditLog {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    dfsRootfsId: ").append(toIndentedString(dfsRootfsId)).append("\n");
    sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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