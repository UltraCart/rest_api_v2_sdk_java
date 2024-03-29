/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ultracart.admin.v2.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookLogSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class WebhookLogSummary {
  @SerializedName("delivery_dts")
  private String deliveryDts = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("success")
  private Boolean success = null;

  public WebhookLogSummary deliveryDts(String deliveryDts) {
    this.deliveryDts = deliveryDts;
    return this;
  }

   /**
   * Date/time of the delivery
   * @return deliveryDts
  **/
  @ApiModelProperty(value = "Date/time of the delivery")
  public String getDeliveryDts() {
    return deliveryDts;
  }

  public void setDeliveryDts(String deliveryDts) {
    this.deliveryDts = deliveryDts;
  }

  public WebhookLogSummary requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Request id
   * @return requestId
  **/
  @ApiModelProperty(value = "Request id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public WebhookLogSummary success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * True if the notification was successful
   * @return success
  **/
  @ApiModelProperty(value = "True if the notification was successful")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLogSummary webhookLogSummary = (WebhookLogSummary) o;
    return Objects.equals(this.deliveryDts, webhookLogSummary.deliveryDts) &&
        Objects.equals(this.requestId, webhookLogSummary.requestId) &&
        Objects.equals(this.success, webhookLogSummary.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryDts, requestId, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLogSummary {\n");
    
    sb.append("    deliveryDts: ").append(toIndentedString(deliveryDts)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

