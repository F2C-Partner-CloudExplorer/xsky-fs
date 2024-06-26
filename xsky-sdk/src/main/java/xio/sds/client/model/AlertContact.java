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
import xio.sds.client.model.AlertStrategyNestview;
/**
 * AlertContact defines contact for alert +X:model:generate;with_detailed;etcd_lock&#x3D;with_get;check_get; +X:benchmark:
 */
@Schema(description = "AlertContact defines contact for alert +X:model:generate;with_detailed;etcd_lock=with_get;check_get; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AlertContact {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("alert_strategies")
  private List<AlertStrategyNestview> alertStrategies = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("email_addr")
  private String emailAddr = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  @SerializedName("wechat_contact_type")
  private String wechatContactType = null;

  @SerializedName("wechat_id")
  private String wechatId = null;

  public AlertContact actionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
    return this;
  }

   /**
   * Get actionStatus
   * @return actionStatus
  **/
  @Schema(description = "")
  public String getActionStatus() {
    return actionStatus;
  }

  public void setActionStatus(String actionStatus) {
    this.actionStatus = actionStatus;
  }

  public AlertContact alertStrategies(List<AlertStrategyNestview> alertStrategies) {
    this.alertStrategies = alertStrategies;
    return this;
  }

  public AlertContact addAlertStrategiesItem(AlertStrategyNestview alertStrategiesItem) {
    if (this.alertStrategies == null) {
      this.alertStrategies = new ArrayList<AlertStrategyNestview>();
    }
    this.alertStrategies.add(alertStrategiesItem);
    return this;
  }

   /**
   * Get alertStrategies
   * @return alertStrategies
  **/
  @Schema(description = "")
  public List<AlertStrategyNestview> getAlertStrategies() {
    return alertStrategies;
  }

  public void setAlertStrategies(List<AlertStrategyNestview> alertStrategies) {
    this.alertStrategies = alertStrategies;
  }

  public AlertContact create(OffsetDateTime create) {
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @Schema(description = "")
  public OffsetDateTime getCreate() {
    return create;
  }

  public void setCreate(OffsetDateTime create) {
    this.create = create;
  }

  public AlertContact emailAddr(String emailAddr) {
    this.emailAddr = emailAddr;
    return this;
  }

   /**
   * Get emailAddr
   * @return emailAddr
  **/
  @Schema(description = "")
  public String getEmailAddr() {
    return emailAddr;
  }

  public void setEmailAddr(String emailAddr) {
    this.emailAddr = emailAddr;
  }

  public AlertContact id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AlertContact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AlertContact status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AlertContact update(OffsetDateTime update) {
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdate() {
    return update;
  }

  public void setUpdate(OffsetDateTime update) {
    this.update = update;
  }

  public AlertContact wechatContactType(String wechatContactType) {
    this.wechatContactType = wechatContactType;
    return this;
  }

   /**
   * Get wechatContactType
   * @return wechatContactType
  **/
  @Schema(description = "")
  public String getWechatContactType() {
    return wechatContactType;
  }

  public void setWechatContactType(String wechatContactType) {
    this.wechatContactType = wechatContactType;
  }

  public AlertContact wechatId(String wechatId) {
    this.wechatId = wechatId;
    return this;
  }

   /**
   * Get wechatId
   * @return wechatId
  **/
  @Schema(description = "")
  public String getWechatId() {
    return wechatId;
  }

  public void setWechatId(String wechatId) {
    this.wechatId = wechatId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertContact alertContact = (AlertContact) o;
    return Objects.equals(this.actionStatus, alertContact.actionStatus) &&
        Objects.equals(this.alertStrategies, alertContact.alertStrategies) &&
        Objects.equals(this.create, alertContact.create) &&
        Objects.equals(this.emailAddr, alertContact.emailAddr) &&
        Objects.equals(this.id, alertContact.id) &&
        Objects.equals(this.name, alertContact.name) &&
        Objects.equals(this.status, alertContact.status) &&
        Objects.equals(this.update, alertContact.update) &&
        Objects.equals(this.wechatContactType, alertContact.wechatContactType) &&
        Objects.equals(this.wechatId, alertContact.wechatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, alertStrategies, create, emailAddr, id, name, status, update, wechatContactType, wechatId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertContact {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    alertStrategies: ").append(toIndentedString(alertStrategies)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    emailAddr: ").append(toIndentedString(emailAddr)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    wechatContactType: ").append(toIndentedString(wechatContactType)).append("\n");
    sb.append("    wechatId: ").append(toIndentedString(wechatId)).append("\n");
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
