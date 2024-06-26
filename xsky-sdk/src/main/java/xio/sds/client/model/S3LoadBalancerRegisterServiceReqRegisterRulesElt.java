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
import xio.sds.client.model.S3LoadBalancerRegisterServiceReqRegisterRulesEltTargetEndpointsElt;
/**
 * S3LoadBalancerRegisterServiceReqRegisterRulesElt
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class S3LoadBalancerRegisterServiceReqRegisterRulesElt {
  @SerializedName("recognition_rules")
  private List<String> recognitionRules = new ArrayList<String>();

  @SerializedName("service_type")
  private String serviceType = null;

  @SerializedName("target_endpoints")
  private List<S3LoadBalancerRegisterServiceReqRegisterRulesEltTargetEndpointsElt> targetEndpoints = new ArrayList<S3LoadBalancerRegisterServiceReqRegisterRulesEltTargetEndpointsElt>();

  public S3LoadBalancerRegisterServiceReqRegisterRulesElt recognitionRules(List<String> recognitionRules) {
    this.recognitionRules = recognitionRules;
    return this;
  }

  public S3LoadBalancerRegisterServiceReqRegisterRulesElt addRecognitionRulesItem(String recognitionRulesItem) {
    this.recognitionRules.add(recognitionRulesItem);
    return this;
  }

   /**
   * recognition rules of service
   * @return recognitionRules
  **/
  @Schema(required = true, description = "recognition rules of service")
  public List<String> getRecognitionRules() {
    return recognitionRules;
  }

  public void setRecognitionRules(List<String> recognitionRules) {
    this.recognitionRules = recognitionRules;
  }

  public S3LoadBalancerRegisterServiceReqRegisterRulesElt serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

   /**
   * type of service
   * @return serviceType
  **/
  @Schema(description = "type of service")
  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public S3LoadBalancerRegisterServiceReqRegisterRulesElt targetEndpoints(List<S3LoadBalancerRegisterServiceReqRegisterRulesEltTargetEndpointsElt> targetEndpoints) {
    this.targetEndpoints = targetEndpoints;
    return this;
  }

  public S3LoadBalancerRegisterServiceReqRegisterRulesElt addTargetEndpointsItem(S3LoadBalancerRegisterServiceReqRegisterRulesEltTargetEndpointsElt targetEndpointsItem) {
    this.targetEndpoints.add(targetEndpointsItem);
    return this;
  }

   /**
   * target endpoints of service
   * @return targetEndpoints
  **/
  @Schema(required = true, description = "target endpoints of service")
  public List<S3LoadBalancerRegisterServiceReqRegisterRulesEltTargetEndpointsElt> getTargetEndpoints() {
    return targetEndpoints;
  }

  public void setTargetEndpoints(List<S3LoadBalancerRegisterServiceReqRegisterRulesEltTargetEndpointsElt> targetEndpoints) {
    this.targetEndpoints = targetEndpoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3LoadBalancerRegisterServiceReqRegisterRulesElt s3LoadBalancerRegisterServiceReqRegisterRulesElt = (S3LoadBalancerRegisterServiceReqRegisterRulesElt) o;
    return Objects.equals(this.recognitionRules, s3LoadBalancerRegisterServiceReqRegisterRulesElt.recognitionRules) &&
        Objects.equals(this.serviceType, s3LoadBalancerRegisterServiceReqRegisterRulesElt.serviceType) &&
        Objects.equals(this.targetEndpoints, s3LoadBalancerRegisterServiceReqRegisterRulesElt.targetEndpoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recognitionRules, serviceType, targetEndpoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3LoadBalancerRegisterServiceReqRegisterRulesElt {\n");
    
    sb.append("    recognitionRules: ").append(toIndentedString(recognitionRules)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    targetEndpoints: ").append(toIndentedString(targetEndpoints)).append("\n");
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
