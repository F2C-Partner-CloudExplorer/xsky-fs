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
import xio.sds.client.model.AlertContactNestview;
import xio.sds.client.model.AlertRuleNestview;
/**
 * AlertStrategy defines strategy for alert +X:model:generate;with_detailed;etcd_lock&#x3D;with_get;check_get&#x3D;detailed; +X:benchmark:
 */
@Schema(description = "AlertStrategy defines strategy for alert +X:model:generate;with_detailed;etcd_lock=with_get;check_get=detailed; +X:benchmark:")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class AlertStrategy {
  @SerializedName("action_status")
  private String actionStatus = null;

  @SerializedName("alert_contacts")
  private List<AlertContactNestview> alertContacts = null;

  @SerializedName("alert_rules")
  private List<AlertRuleNestview> alertRules = null;

  @SerializedName("create")
  private OffsetDateTime create = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enable")
  private Boolean enable = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("notify_methods")
  private String notifyMethods = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("update")
  private OffsetDateTime update = null;

  public AlertStrategy actionStatus(String actionStatus) {
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

  public AlertStrategy alertContacts(List<AlertContactNestview> alertContacts) {
    this.alertContacts = alertContacts;
    return this;
  }

  public AlertStrategy addAlertContactsItem(AlertContactNestview alertContactsItem) {
    if (this.alertContacts == null) {
      this.alertContacts = new ArrayList<AlertContactNestview>();
    }
    this.alertContacts.add(alertContactsItem);
    return this;
  }

   /**
   * Get alertContacts
   * @return alertContacts
  **/
  @Schema(description = "")
  public List<AlertContactNestview> getAlertContacts() {
    return alertContacts;
  }

  public void setAlertContacts(List<AlertContactNestview> alertContacts) {
    this.alertContacts = alertContacts;
  }

  public AlertStrategy alertRules(List<AlertRuleNestview> alertRules) {
    this.alertRules = alertRules;
    return this;
  }

  public AlertStrategy addAlertRulesItem(AlertRuleNestview alertRulesItem) {
    if (this.alertRules == null) {
      this.alertRules = new ArrayList<AlertRuleNestview>();
    }
    this.alertRules.add(alertRulesItem);
    return this;
  }

   /**
   * Get alertRules
   * @return alertRules
  **/
  @Schema(description = "")
  public List<AlertRuleNestview> getAlertRules() {
    return alertRules;
  }

  public void setAlertRules(List<AlertRuleNestview> alertRules) {
    this.alertRules = alertRules;
  }

  public AlertStrategy create(OffsetDateTime create) {
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

  public AlertStrategy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AlertStrategy enable(Boolean enable) {
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @Schema(description = "")
  public Boolean isEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public AlertStrategy id(Long id) {
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

  public AlertStrategy name(String name) {
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

  public AlertStrategy notifyMethods(String notifyMethods) {
    this.notifyMethods = notifyMethods;
    return this;
  }

   /**
   * Get notifyMethods
   * @return notifyMethods
  **/
  @Schema(description = "")
  public String getNotifyMethods() {
    return notifyMethods;
  }

  public void setNotifyMethods(String notifyMethods) {
    this.notifyMethods = notifyMethods;
  }

  public AlertStrategy status(String status) {
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

  public AlertStrategy update(OffsetDateTime update) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertStrategy alertStrategy = (AlertStrategy) o;
    return Objects.equals(this.actionStatus, alertStrategy.actionStatus) &&
        Objects.equals(this.alertContacts, alertStrategy.alertContacts) &&
        Objects.equals(this.alertRules, alertStrategy.alertRules) &&
        Objects.equals(this.create, alertStrategy.create) &&
        Objects.equals(this.description, alertStrategy.description) &&
        Objects.equals(this.enable, alertStrategy.enable) &&
        Objects.equals(this.id, alertStrategy.id) &&
        Objects.equals(this.name, alertStrategy.name) &&
        Objects.equals(this.notifyMethods, alertStrategy.notifyMethods) &&
        Objects.equals(this.status, alertStrategy.status) &&
        Objects.equals(this.update, alertStrategy.update);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionStatus, alertContacts, alertRules, create, description, enable, id, name, notifyMethods, status, update);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertStrategy {\n");
    
    sb.append("    actionStatus: ").append(toIndentedString(actionStatus)).append("\n");
    sb.append("    alertContacts: ").append(toIndentedString(alertContacts)).append("\n");
    sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifyMethods: ").append(toIndentedString(notifyMethods)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
