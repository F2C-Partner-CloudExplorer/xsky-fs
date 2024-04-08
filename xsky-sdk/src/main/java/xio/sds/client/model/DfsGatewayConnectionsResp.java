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
import xio.sds.client.model.DfsFTPSession;
import xio.sds.client.model.DfsHdfsConnection;
import xio.sds.client.model.DfsNFSConnection;
import xio.sds.client.model.DfsS3BucketConnection;
import xio.sds.client.model.DfsSMBSession;
/**
 * DfsGatewayConnectionsResp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class DfsGatewayConnectionsResp {
  @SerializedName("ftp_sessions")
  private List<DfsFTPSession> ftpSessions = null;

  @SerializedName("hdfs_connections")
  private List<DfsHdfsConnection> hdfsConnections = null;

  @SerializedName("nfs_connections")
  private List<DfsNFSConnection> nfsConnections = null;

  @SerializedName("s3_connections")
  private List<DfsS3BucketConnection> s3Connections = null;

  @SerializedName("smb_sessions")
  private List<DfsSMBSession> smbSessions = null;

  public DfsGatewayConnectionsResp ftpSessions(List<DfsFTPSession> ftpSessions) {
    this.ftpSessions = ftpSessions;
    return this;
  }

  public DfsGatewayConnectionsResp addFtpSessionsItem(DfsFTPSession ftpSessionsItem) {
    if (this.ftpSessions == null) {
      this.ftpSessions = new ArrayList<DfsFTPSession>();
    }
    this.ftpSessions.add(ftpSessionsItem);
    return this;
  }

   /**
   * dfs ftp sessions
   * @return ftpSessions
  **/
  @Schema(description = "dfs ftp sessions")
  public List<DfsFTPSession> getFtpSessions() {
    return ftpSessions;
  }

  public void setFtpSessions(List<DfsFTPSession> ftpSessions) {
    this.ftpSessions = ftpSessions;
  }

  public DfsGatewayConnectionsResp hdfsConnections(List<DfsHdfsConnection> hdfsConnections) {
    this.hdfsConnections = hdfsConnections;
    return this;
  }

  public DfsGatewayConnectionsResp addHdfsConnectionsItem(DfsHdfsConnection hdfsConnectionsItem) {
    if (this.hdfsConnections == null) {
      this.hdfsConnections = new ArrayList<DfsHdfsConnection>();
    }
    this.hdfsConnections.add(hdfsConnectionsItem);
    return this;
  }

   /**
   * dfs hdfs connections
   * @return hdfsConnections
  **/
  @Schema(description = "dfs hdfs connections")
  public List<DfsHdfsConnection> getHdfsConnections() {
    return hdfsConnections;
  }

  public void setHdfsConnections(List<DfsHdfsConnection> hdfsConnections) {
    this.hdfsConnections = hdfsConnections;
  }

  public DfsGatewayConnectionsResp nfsConnections(List<DfsNFSConnection> nfsConnections) {
    this.nfsConnections = nfsConnections;
    return this;
  }

  public DfsGatewayConnectionsResp addNfsConnectionsItem(DfsNFSConnection nfsConnectionsItem) {
    if (this.nfsConnections == null) {
      this.nfsConnections = new ArrayList<DfsNFSConnection>();
    }
    this.nfsConnections.add(nfsConnectionsItem);
    return this;
  }

   /**
   * dfs nfs connections
   * @return nfsConnections
  **/
  @Schema(description = "dfs nfs connections")
  public List<DfsNFSConnection> getNfsConnections() {
    return nfsConnections;
  }

  public void setNfsConnections(List<DfsNFSConnection> nfsConnections) {
    this.nfsConnections = nfsConnections;
  }

  public DfsGatewayConnectionsResp s3Connections(List<DfsS3BucketConnection> s3Connections) {
    this.s3Connections = s3Connections;
    return this;
  }

  public DfsGatewayConnectionsResp addS3ConnectionsItem(DfsS3BucketConnection s3ConnectionsItem) {
    if (this.s3Connections == null) {
      this.s3Connections = new ArrayList<DfsS3BucketConnection>();
    }
    this.s3Connections.add(s3ConnectionsItem);
    return this;
  }

   /**
   * dfs s3 bucket connections
   * @return s3Connections
  **/
  @Schema(description = "dfs s3 bucket connections")
  public List<DfsS3BucketConnection> getS3Connections() {
    return s3Connections;
  }

  public void setS3Connections(List<DfsS3BucketConnection> s3Connections) {
    this.s3Connections = s3Connections;
  }

  public DfsGatewayConnectionsResp smbSessions(List<DfsSMBSession> smbSessions) {
    this.smbSessions = smbSessions;
    return this;
  }

  public DfsGatewayConnectionsResp addSmbSessionsItem(DfsSMBSession smbSessionsItem) {
    if (this.smbSessions == null) {
      this.smbSessions = new ArrayList<DfsSMBSession>();
    }
    this.smbSessions.add(smbSessionsItem);
    return this;
  }

   /**
   * dfs smb sessions
   * @return smbSessions
  **/
  @Schema(description = "dfs smb sessions")
  public List<DfsSMBSession> getSmbSessions() {
    return smbSessions;
  }

  public void setSmbSessions(List<DfsSMBSession> smbSessions) {
    this.smbSessions = smbSessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DfsGatewayConnectionsResp dfsGatewayConnectionsResp = (DfsGatewayConnectionsResp) o;
    return Objects.equals(this.ftpSessions, dfsGatewayConnectionsResp.ftpSessions) &&
        Objects.equals(this.hdfsConnections, dfsGatewayConnectionsResp.hdfsConnections) &&
        Objects.equals(this.nfsConnections, dfsGatewayConnectionsResp.nfsConnections) &&
        Objects.equals(this.s3Connections, dfsGatewayConnectionsResp.s3Connections) &&
        Objects.equals(this.smbSessions, dfsGatewayConnectionsResp.smbSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ftpSessions, hdfsConnections, nfsConnections, s3Connections, smbSessions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DfsGatewayConnectionsResp {\n");
    
    sb.append("    ftpSessions: ").append(toIndentedString(ftpSessions)).append("\n");
    sb.append("    hdfsConnections: ").append(toIndentedString(hdfsConnections)).append("\n");
    sb.append("    nfsConnections: ").append(toIndentedString(nfsConnections)).append("\n");
    sb.append("    s3Connections: ").append(toIndentedString(s3Connections)).append("\n");
    sb.append("    smbSessions: ").append(toIndentedString(smbSessions)).append("\n");
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