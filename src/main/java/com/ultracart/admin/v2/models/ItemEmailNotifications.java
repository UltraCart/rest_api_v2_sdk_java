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
 * ItemEmailNotifications
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemEmailNotifications {
  @SerializedName("skip_receipt")
  private Boolean skipReceipt = null;

  @SerializedName("skip_shipment_notification")
  private Boolean skipShipmentNotification = null;

  public ItemEmailNotifications skipReceipt(Boolean skipReceipt) {
    this.skipReceipt = skipReceipt;
    return this;
  }

   /**
   * Skip receipt email to customer
   * @return skipReceipt
  **/
  @ApiModelProperty(value = "Skip receipt email to customer")
  public Boolean isSkipReceipt() {
    return skipReceipt;
  }

  public void setSkipReceipt(Boolean skipReceipt) {
    this.skipReceipt = skipReceipt;
  }

  public ItemEmailNotifications skipShipmentNotification(Boolean skipShipmentNotification) {
    this.skipShipmentNotification = skipShipmentNotification;
    return this;
  }

   /**
   * Skip shipment notification to customer
   * @return skipShipmentNotification
  **/
  @ApiModelProperty(value = "Skip shipment notification to customer")
  public Boolean isSkipShipmentNotification() {
    return skipShipmentNotification;
  }

  public void setSkipShipmentNotification(Boolean skipShipmentNotification) {
    this.skipShipmentNotification = skipShipmentNotification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemEmailNotifications itemEmailNotifications = (ItemEmailNotifications) o;
    return Objects.equals(this.skipReceipt, itemEmailNotifications.skipReceipt) &&
        Objects.equals(this.skipShipmentNotification, itemEmailNotifications.skipShipmentNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipReceipt, skipShipmentNotification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemEmailNotifications {\n");
    
    sb.append("    skipReceipt: ").append(toIndentedString(skipReceipt)).append("\n");
    sb.append("    skipShipmentNotification: ").append(toIndentedString(skipShipmentNotification)).append("\n");
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

