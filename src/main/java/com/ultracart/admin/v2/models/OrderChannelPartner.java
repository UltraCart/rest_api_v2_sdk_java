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
 * OrderChannelPartner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class OrderChannelPartner {
  @SerializedName("auto_approve_purchase_order")
  private Boolean autoApprovePurchaseOrder = null;

  @SerializedName("channel_partner_code")
  private String channelPartnerCode = null;

  @SerializedName("channel_partner_data")
  private String channelPartnerData = null;

  @SerializedName("channel_partner_oid")
  private Integer channelPartnerOid = null;

  @SerializedName("channel_partner_order_id")
  private String channelPartnerOrderId = null;

  @SerializedName("ignore_invalid_shipping_method")
  private Boolean ignoreInvalidShippingMethod = null;

  @SerializedName("no_realtime_payment_processing")
  private Boolean noRealtimePaymentProcessing = null;

  @SerializedName("skip_payment_processing")
  private Boolean skipPaymentProcessing = null;

  @SerializedName("store_completed")
  private Boolean storeCompleted = null;

  @SerializedName("store_if_payment_declines")
  private Boolean storeIfPaymentDeclines = null;

  @SerializedName("treat_warnings_as_errors")
  private Boolean treatWarningsAsErrors = null;

  public OrderChannelPartner autoApprovePurchaseOrder(Boolean autoApprovePurchaseOrder) {
    this.autoApprovePurchaseOrder = autoApprovePurchaseOrder;
    return this;
  }

   /**
   * If true, any purchase order submitted is automatically approved
   * @return autoApprovePurchaseOrder
  **/
  @ApiModelProperty(value = "If true, any purchase order submitted is automatically approved")
  public Boolean isAutoApprovePurchaseOrder() {
    return autoApprovePurchaseOrder;
  }

  public void setAutoApprovePurchaseOrder(Boolean autoApprovePurchaseOrder) {
    this.autoApprovePurchaseOrder = autoApprovePurchaseOrder;
  }

  public OrderChannelPartner channelPartnerCode(String channelPartnerCode) {
    this.channelPartnerCode = channelPartnerCode;
    return this;
  }

   /**
   * The code of the channel partner
   * @return channelPartnerCode
  **/
  @ApiModelProperty(value = "The code of the channel partner")
  public String getChannelPartnerCode() {
    return channelPartnerCode;
  }

  public void setChannelPartnerCode(String channelPartnerCode) {
    this.channelPartnerCode = channelPartnerCode;
  }

  public OrderChannelPartner channelPartnerData(String channelPartnerData) {
    this.channelPartnerData = channelPartnerData;
    return this;
  }

   /**
   * Additional data provided by the channel partner, read-only
   * @return channelPartnerData
  **/
  @ApiModelProperty(value = "Additional data provided by the channel partner, read-only")
  public String getChannelPartnerData() {
    return channelPartnerData;
  }

  public void setChannelPartnerData(String channelPartnerData) {
    this.channelPartnerData = channelPartnerData;
  }

  public OrderChannelPartner channelPartnerOid(Integer channelPartnerOid) {
    this.channelPartnerOid = channelPartnerOid;
    return this;
  }

   /**
   * Channel partner object identifier, read-only and available on existing channel orders only.
   * @return channelPartnerOid
  **/
  @ApiModelProperty(value = "Channel partner object identifier, read-only and available on existing channel orders only.")
  public Integer getChannelPartnerOid() {
    return channelPartnerOid;
  }

  public void setChannelPartnerOid(Integer channelPartnerOid) {
    this.channelPartnerOid = channelPartnerOid;
  }

  public OrderChannelPartner channelPartnerOrderId(String channelPartnerOrderId) {
    this.channelPartnerOrderId = channelPartnerOrderId;
    return this;
  }

   /**
   * The order ID assigned by the channel partner for this order.
   * @return channelPartnerOrderId
  **/
  @ApiModelProperty(value = "The order ID assigned by the channel partner for this order.")
  public String getChannelPartnerOrderId() {
    return channelPartnerOrderId;
  }

  public void setChannelPartnerOrderId(String channelPartnerOrderId) {
    this.channelPartnerOrderId = channelPartnerOrderId;
  }

  public OrderChannelPartner ignoreInvalidShippingMethod(Boolean ignoreInvalidShippingMethod) {
    this.ignoreInvalidShippingMethod = ignoreInvalidShippingMethod;
    return this;
  }

   /**
   * Set to true to ignore invalid shipping method being specified.  Only applicable on inserting orders.
   * @return ignoreInvalidShippingMethod
  **/
  @ApiModelProperty(value = "Set to true to ignore invalid shipping method being specified.  Only applicable on inserting orders.")
  public Boolean isIgnoreInvalidShippingMethod() {
    return ignoreInvalidShippingMethod;
  }

  public void setIgnoreInvalidShippingMethod(Boolean ignoreInvalidShippingMethod) {
    this.ignoreInvalidShippingMethod = ignoreInvalidShippingMethod;
  }

  public OrderChannelPartner noRealtimePaymentProcessing(Boolean noRealtimePaymentProcessing) {
    this.noRealtimePaymentProcessing = noRealtimePaymentProcessing;
    return this;
  }

   /**
   * Indicates this order should be placed in Account Receivable for later payment processing
   * @return noRealtimePaymentProcessing
  **/
  @ApiModelProperty(value = "Indicates this order should be placed in Account Receivable for later payment processing")
  public Boolean isNoRealtimePaymentProcessing() {
    return noRealtimePaymentProcessing;
  }

  public void setNoRealtimePaymentProcessing(Boolean noRealtimePaymentProcessing) {
    this.noRealtimePaymentProcessing = noRealtimePaymentProcessing;
  }

  public OrderChannelPartner skipPaymentProcessing(Boolean skipPaymentProcessing) {
    this.skipPaymentProcessing = skipPaymentProcessing;
    return this;
  }

   /**
   * Indicates this order was already paid for via a channel purchase and no payment collection should be attempted
   * @return skipPaymentProcessing
  **/
  @ApiModelProperty(value = "Indicates this order was already paid for via a channel purchase and no payment collection should be attempted")
  public Boolean isSkipPaymentProcessing() {
    return skipPaymentProcessing;
  }

  public void setSkipPaymentProcessing(Boolean skipPaymentProcessing) {
    this.skipPaymentProcessing = skipPaymentProcessing;
  }

  public OrderChannelPartner storeCompleted(Boolean storeCompleted) {
    this.storeCompleted = storeCompleted;
    return this;
  }

   /**
   * Instructs UltraCart to skip shipping department and mark this order as fully complete.  This flag defaults to true.  Set this flag to false to shipped product for this order.
   * @return storeCompleted
  **/
  @ApiModelProperty(value = "Instructs UltraCart to skip shipping department and mark this order as fully complete.  This flag defaults to true.  Set this flag to false to shipped product for this order.")
  public Boolean isStoreCompleted() {
    return storeCompleted;
  }

  public void setStoreCompleted(Boolean storeCompleted) {
    this.storeCompleted = storeCompleted;
  }

  public OrderChannelPartner storeIfPaymentDeclines(Boolean storeIfPaymentDeclines) {
    this.storeIfPaymentDeclines = storeIfPaymentDeclines;
    return this;
  }

   /**
   * If true, any failed payment will place the order in Accounts Receivable rather than rejecting it.
   * @return storeIfPaymentDeclines
  **/
  @ApiModelProperty(value = "If true, any failed payment will place the order in Accounts Receivable rather than rejecting it.")
  public Boolean isStoreIfPaymentDeclines() {
    return storeIfPaymentDeclines;
  }

  public void setStoreIfPaymentDeclines(Boolean storeIfPaymentDeclines) {
    this.storeIfPaymentDeclines = storeIfPaymentDeclines;
  }

  public OrderChannelPartner treatWarningsAsErrors(Boolean treatWarningsAsErrors) {
    this.treatWarningsAsErrors = treatWarningsAsErrors;
    return this;
  }

   /**
   * Any warnings are raised as errors and halt the import of the order
   * @return treatWarningsAsErrors
  **/
  @ApiModelProperty(value = "Any warnings are raised as errors and halt the import of the order")
  public Boolean isTreatWarningsAsErrors() {
    return treatWarningsAsErrors;
  }

  public void setTreatWarningsAsErrors(Boolean treatWarningsAsErrors) {
    this.treatWarningsAsErrors = treatWarningsAsErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderChannelPartner orderChannelPartner = (OrderChannelPartner) o;
    return Objects.equals(this.autoApprovePurchaseOrder, orderChannelPartner.autoApprovePurchaseOrder) &&
        Objects.equals(this.channelPartnerCode, orderChannelPartner.channelPartnerCode) &&
        Objects.equals(this.channelPartnerData, orderChannelPartner.channelPartnerData) &&
        Objects.equals(this.channelPartnerOid, orderChannelPartner.channelPartnerOid) &&
        Objects.equals(this.channelPartnerOrderId, orderChannelPartner.channelPartnerOrderId) &&
        Objects.equals(this.ignoreInvalidShippingMethod, orderChannelPartner.ignoreInvalidShippingMethod) &&
        Objects.equals(this.noRealtimePaymentProcessing, orderChannelPartner.noRealtimePaymentProcessing) &&
        Objects.equals(this.skipPaymentProcessing, orderChannelPartner.skipPaymentProcessing) &&
        Objects.equals(this.storeCompleted, orderChannelPartner.storeCompleted) &&
        Objects.equals(this.storeIfPaymentDeclines, orderChannelPartner.storeIfPaymentDeclines) &&
        Objects.equals(this.treatWarningsAsErrors, orderChannelPartner.treatWarningsAsErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoApprovePurchaseOrder, channelPartnerCode, channelPartnerData, channelPartnerOid, channelPartnerOrderId, ignoreInvalidShippingMethod, noRealtimePaymentProcessing, skipPaymentProcessing, storeCompleted, storeIfPaymentDeclines, treatWarningsAsErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderChannelPartner {\n");
    
    sb.append("    autoApprovePurchaseOrder: ").append(toIndentedString(autoApprovePurchaseOrder)).append("\n");
    sb.append("    channelPartnerCode: ").append(toIndentedString(channelPartnerCode)).append("\n");
    sb.append("    channelPartnerData: ").append(toIndentedString(channelPartnerData)).append("\n");
    sb.append("    channelPartnerOid: ").append(toIndentedString(channelPartnerOid)).append("\n");
    sb.append("    channelPartnerOrderId: ").append(toIndentedString(channelPartnerOrderId)).append("\n");
    sb.append("    ignoreInvalidShippingMethod: ").append(toIndentedString(ignoreInvalidShippingMethod)).append("\n");
    sb.append("    noRealtimePaymentProcessing: ").append(toIndentedString(noRealtimePaymentProcessing)).append("\n");
    sb.append("    skipPaymentProcessing: ").append(toIndentedString(skipPaymentProcessing)).append("\n");
    sb.append("    storeCompleted: ").append(toIndentedString(storeCompleted)).append("\n");
    sb.append("    storeIfPaymentDeclines: ").append(toIndentedString(storeIfPaymentDeclines)).append("\n");
    sb.append("    treatWarningsAsErrors: ").append(toIndentedString(treatWarningsAsErrors)).append("\n");
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

