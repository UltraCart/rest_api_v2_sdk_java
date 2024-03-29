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
import com.ultracart.admin.v2.models.OrderTrackingNumberDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderTrackingNumberDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class OrderTrackingNumberDetails {
  @SerializedName("actual_delivery_date")
  private String actualDeliveryDate = null;

  @SerializedName("actual_delivery_date_formatted")
  private String actualDeliveryDateFormatted = null;

  @SerializedName("details")
  private List<OrderTrackingNumberDetail> details = null;

  @SerializedName("easypost_tracker_id")
  private String easypostTrackerId = null;

  @SerializedName("expected_delivery_date")
  private String expectedDeliveryDate = null;

  @SerializedName("expected_delivery_date_formatted")
  private String expectedDeliveryDateFormatted = null;

  @SerializedName("map_url")
  private String mapUrl = null;

  @SerializedName("order_placed_date")
  private String orderPlacedDate = null;

  @SerializedName("order_placed_date_formatted")
  private String orderPlacedDateFormatted = null;

  @SerializedName("payment_processed_date")
  private String paymentProcessedDate = null;

  @SerializedName("payment_processed_date_formatted")
  private String paymentProcessedDateFormatted = null;

  @SerializedName("shipped_date")
  private String shippedDate = null;

  @SerializedName("shipped_date_formatted")
  private String shippedDateFormatted = null;

  @SerializedName("shipping_method")
  private String shippingMethod = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("status_description")
  private String statusDescription = null;

  @SerializedName("tracking_number")
  private String trackingNumber = null;

  @SerializedName("tracking_url")
  private String trackingUrl = null;

  public OrderTrackingNumberDetails actualDeliveryDate(String actualDeliveryDate) {
    this.actualDeliveryDate = actualDeliveryDate;
    return this;
  }

   /**
   * Get actualDeliveryDate
   * @return actualDeliveryDate
  **/
  @ApiModelProperty(value = "")
  public String getActualDeliveryDate() {
    return actualDeliveryDate;
  }

  public void setActualDeliveryDate(String actualDeliveryDate) {
    this.actualDeliveryDate = actualDeliveryDate;
  }

  public OrderTrackingNumberDetails actualDeliveryDateFormatted(String actualDeliveryDateFormatted) {
    this.actualDeliveryDateFormatted = actualDeliveryDateFormatted;
    return this;
  }

   /**
   * Get actualDeliveryDateFormatted
   * @return actualDeliveryDateFormatted
  **/
  @ApiModelProperty(value = "")
  public String getActualDeliveryDateFormatted() {
    return actualDeliveryDateFormatted;
  }

  public void setActualDeliveryDateFormatted(String actualDeliveryDateFormatted) {
    this.actualDeliveryDateFormatted = actualDeliveryDateFormatted;
  }

  public OrderTrackingNumberDetails details(List<OrderTrackingNumberDetail> details) {
    this.details = details;
    return this;
  }

  public OrderTrackingNumberDetails addDetailsItem(OrderTrackingNumberDetail detailsItem) {
    if (this.details == null) {
      this.details = new ArrayList<OrderTrackingNumberDetail>();
    }
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public List<OrderTrackingNumberDetail> getDetails() {
    return details;
  }

  public void setDetails(List<OrderTrackingNumberDetail> details) {
    this.details = details;
  }

  public OrderTrackingNumberDetails easypostTrackerId(String easypostTrackerId) {
    this.easypostTrackerId = easypostTrackerId;
    return this;
  }

   /**
   * Get easypostTrackerId
   * @return easypostTrackerId
  **/
  @ApiModelProperty(value = "")
  public String getEasypostTrackerId() {
    return easypostTrackerId;
  }

  public void setEasypostTrackerId(String easypostTrackerId) {
    this.easypostTrackerId = easypostTrackerId;
  }

  public OrderTrackingNumberDetails expectedDeliveryDate(String expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
    return this;
  }

   /**
   * Get expectedDeliveryDate
   * @return expectedDeliveryDate
  **/
  @ApiModelProperty(value = "")
  public String getExpectedDeliveryDate() {
    return expectedDeliveryDate;
  }

  public void setExpectedDeliveryDate(String expectedDeliveryDate) {
    this.expectedDeliveryDate = expectedDeliveryDate;
  }

  public OrderTrackingNumberDetails expectedDeliveryDateFormatted(String expectedDeliveryDateFormatted) {
    this.expectedDeliveryDateFormatted = expectedDeliveryDateFormatted;
    return this;
  }

   /**
   * Get expectedDeliveryDateFormatted
   * @return expectedDeliveryDateFormatted
  **/
  @ApiModelProperty(value = "")
  public String getExpectedDeliveryDateFormatted() {
    return expectedDeliveryDateFormatted;
  }

  public void setExpectedDeliveryDateFormatted(String expectedDeliveryDateFormatted) {
    this.expectedDeliveryDateFormatted = expectedDeliveryDateFormatted;
  }

  public OrderTrackingNumberDetails mapUrl(String mapUrl) {
    this.mapUrl = mapUrl;
    return this;
  }

   /**
   * Get mapUrl
   * @return mapUrl
  **/
  @ApiModelProperty(value = "")
  public String getMapUrl() {
    return mapUrl;
  }

  public void setMapUrl(String mapUrl) {
    this.mapUrl = mapUrl;
  }

  public OrderTrackingNumberDetails orderPlacedDate(String orderPlacedDate) {
    this.orderPlacedDate = orderPlacedDate;
    return this;
  }

   /**
   * Get orderPlacedDate
   * @return orderPlacedDate
  **/
  @ApiModelProperty(value = "")
  public String getOrderPlacedDate() {
    return orderPlacedDate;
  }

  public void setOrderPlacedDate(String orderPlacedDate) {
    this.orderPlacedDate = orderPlacedDate;
  }

  public OrderTrackingNumberDetails orderPlacedDateFormatted(String orderPlacedDateFormatted) {
    this.orderPlacedDateFormatted = orderPlacedDateFormatted;
    return this;
  }

   /**
   * Get orderPlacedDateFormatted
   * @return orderPlacedDateFormatted
  **/
  @ApiModelProperty(value = "")
  public String getOrderPlacedDateFormatted() {
    return orderPlacedDateFormatted;
  }

  public void setOrderPlacedDateFormatted(String orderPlacedDateFormatted) {
    this.orderPlacedDateFormatted = orderPlacedDateFormatted;
  }

  public OrderTrackingNumberDetails paymentProcessedDate(String paymentProcessedDate) {
    this.paymentProcessedDate = paymentProcessedDate;
    return this;
  }

   /**
   * Get paymentProcessedDate
   * @return paymentProcessedDate
  **/
  @ApiModelProperty(value = "")
  public String getPaymentProcessedDate() {
    return paymentProcessedDate;
  }

  public void setPaymentProcessedDate(String paymentProcessedDate) {
    this.paymentProcessedDate = paymentProcessedDate;
  }

  public OrderTrackingNumberDetails paymentProcessedDateFormatted(String paymentProcessedDateFormatted) {
    this.paymentProcessedDateFormatted = paymentProcessedDateFormatted;
    return this;
  }

   /**
   * Get paymentProcessedDateFormatted
   * @return paymentProcessedDateFormatted
  **/
  @ApiModelProperty(value = "")
  public String getPaymentProcessedDateFormatted() {
    return paymentProcessedDateFormatted;
  }

  public void setPaymentProcessedDateFormatted(String paymentProcessedDateFormatted) {
    this.paymentProcessedDateFormatted = paymentProcessedDateFormatted;
  }

  public OrderTrackingNumberDetails shippedDate(String shippedDate) {
    this.shippedDate = shippedDate;
    return this;
  }

   /**
   * Get shippedDate
   * @return shippedDate
  **/
  @ApiModelProperty(value = "")
  public String getShippedDate() {
    return shippedDate;
  }

  public void setShippedDate(String shippedDate) {
    this.shippedDate = shippedDate;
  }

  public OrderTrackingNumberDetails shippedDateFormatted(String shippedDateFormatted) {
    this.shippedDateFormatted = shippedDateFormatted;
    return this;
  }

   /**
   * Get shippedDateFormatted
   * @return shippedDateFormatted
  **/
  @ApiModelProperty(value = "")
  public String getShippedDateFormatted() {
    return shippedDateFormatted;
  }

  public void setShippedDateFormatted(String shippedDateFormatted) {
    this.shippedDateFormatted = shippedDateFormatted;
  }

  public OrderTrackingNumberDetails shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Get shippingMethod
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public OrderTrackingNumberDetails status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrderTrackingNumberDetails statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @ApiModelProperty(value = "")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public OrderTrackingNumberDetails trackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

   /**
   * Get trackingNumber
   * @return trackingNumber
  **/
  @ApiModelProperty(value = "")
  public String getTrackingNumber() {
    return trackingNumber;
  }

  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  public OrderTrackingNumberDetails trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * Get trackingUrl
   * @return trackingUrl
  **/
  @ApiModelProperty(value = "")
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderTrackingNumberDetails orderTrackingNumberDetails = (OrderTrackingNumberDetails) o;
    return Objects.equals(this.actualDeliveryDate, orderTrackingNumberDetails.actualDeliveryDate) &&
        Objects.equals(this.actualDeliveryDateFormatted, orderTrackingNumberDetails.actualDeliveryDateFormatted) &&
        Objects.equals(this.details, orderTrackingNumberDetails.details) &&
        Objects.equals(this.easypostTrackerId, orderTrackingNumberDetails.easypostTrackerId) &&
        Objects.equals(this.expectedDeliveryDate, orderTrackingNumberDetails.expectedDeliveryDate) &&
        Objects.equals(this.expectedDeliveryDateFormatted, orderTrackingNumberDetails.expectedDeliveryDateFormatted) &&
        Objects.equals(this.mapUrl, orderTrackingNumberDetails.mapUrl) &&
        Objects.equals(this.orderPlacedDate, orderTrackingNumberDetails.orderPlacedDate) &&
        Objects.equals(this.orderPlacedDateFormatted, orderTrackingNumberDetails.orderPlacedDateFormatted) &&
        Objects.equals(this.paymentProcessedDate, orderTrackingNumberDetails.paymentProcessedDate) &&
        Objects.equals(this.paymentProcessedDateFormatted, orderTrackingNumberDetails.paymentProcessedDateFormatted) &&
        Objects.equals(this.shippedDate, orderTrackingNumberDetails.shippedDate) &&
        Objects.equals(this.shippedDateFormatted, orderTrackingNumberDetails.shippedDateFormatted) &&
        Objects.equals(this.shippingMethod, orderTrackingNumberDetails.shippingMethod) &&
        Objects.equals(this.status, orderTrackingNumberDetails.status) &&
        Objects.equals(this.statusDescription, orderTrackingNumberDetails.statusDescription) &&
        Objects.equals(this.trackingNumber, orderTrackingNumberDetails.trackingNumber) &&
        Objects.equals(this.trackingUrl, orderTrackingNumberDetails.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualDeliveryDate, actualDeliveryDateFormatted, details, easypostTrackerId, expectedDeliveryDate, expectedDeliveryDateFormatted, mapUrl, orderPlacedDate, orderPlacedDateFormatted, paymentProcessedDate, paymentProcessedDateFormatted, shippedDate, shippedDateFormatted, shippingMethod, status, statusDescription, trackingNumber, trackingUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderTrackingNumberDetails {\n");
    
    sb.append("    actualDeliveryDate: ").append(toIndentedString(actualDeliveryDate)).append("\n");
    sb.append("    actualDeliveryDateFormatted: ").append(toIndentedString(actualDeliveryDateFormatted)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    easypostTrackerId: ").append(toIndentedString(easypostTrackerId)).append("\n");
    sb.append("    expectedDeliveryDate: ").append(toIndentedString(expectedDeliveryDate)).append("\n");
    sb.append("    expectedDeliveryDateFormatted: ").append(toIndentedString(expectedDeliveryDateFormatted)).append("\n");
    sb.append("    mapUrl: ").append(toIndentedString(mapUrl)).append("\n");
    sb.append("    orderPlacedDate: ").append(toIndentedString(orderPlacedDate)).append("\n");
    sb.append("    orderPlacedDateFormatted: ").append(toIndentedString(orderPlacedDateFormatted)).append("\n");
    sb.append("    paymentProcessedDate: ").append(toIndentedString(paymentProcessedDate)).append("\n");
    sb.append("    paymentProcessedDateFormatted: ").append(toIndentedString(paymentProcessedDateFormatted)).append("\n");
    sb.append("    shippedDate: ").append(toIndentedString(shippedDate)).append("\n");
    sb.append("    shippedDateFormatted: ").append(toIndentedString(shippedDateFormatted)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    trackingNumber: ").append(toIndentedString(trackingNumber)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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

