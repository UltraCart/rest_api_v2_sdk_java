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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ultracart.admin.v2.models.OrderReplacementItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderReplacement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-23T03:23:57.585-04:00")
public class OrderReplacement {
  @SerializedName("additional_merchant_notes_new_order")
  private String additionalMerchantNotesNewOrder = null;

  @SerializedName("additional_merchant_notes_original_order")
  private String additionalMerchantNotesOriginalOrder = null;

  @SerializedName("custom_field1")
  private String customField1 = null;

  @SerializedName("custom_field2")
  private String customField2 = null;

  @SerializedName("custom_field3")
  private String customField3 = null;

  @SerializedName("custom_field4")
  private String customField4 = null;

  @SerializedName("custom_field5")
  private String customField5 = null;

  @SerializedName("custom_field6")
  private String customField6 = null;

  @SerializedName("custom_field7")
  private String customField7 = null;

  @SerializedName("free")
  private Boolean free = null;

  @SerializedName("immediate_charge")
  private Boolean immediateCharge = null;

  @SerializedName("items")
  private List<OrderReplacementItem> items = null;

  @SerializedName("original_order_id")
  private String originalOrderId = null;

  @SerializedName("shipping_method")
  private String shippingMethod = null;

  @SerializedName("skip_payment")
  private Boolean skipPayment = null;

  public OrderReplacement additionalMerchantNotesNewOrder(String additionalMerchantNotesNewOrder) {
    this.additionalMerchantNotesNewOrder = additionalMerchantNotesNewOrder;
    return this;
  }

   /**
   * Additional merchant notes to append to the new order
   * @return additionalMerchantNotesNewOrder
  **/
  @ApiModelProperty(value = "Additional merchant notes to append to the new order")
  public String getAdditionalMerchantNotesNewOrder() {
    return additionalMerchantNotesNewOrder;
  }

  public void setAdditionalMerchantNotesNewOrder(String additionalMerchantNotesNewOrder) {
    this.additionalMerchantNotesNewOrder = additionalMerchantNotesNewOrder;
  }

  public OrderReplacement additionalMerchantNotesOriginalOrder(String additionalMerchantNotesOriginalOrder) {
    this.additionalMerchantNotesOriginalOrder = additionalMerchantNotesOriginalOrder;
    return this;
  }

   /**
   * Additional merchant notes to append to the original order
   * @return additionalMerchantNotesOriginalOrder
  **/
  @ApiModelProperty(value = "Additional merchant notes to append to the original order")
  public String getAdditionalMerchantNotesOriginalOrder() {
    return additionalMerchantNotesOriginalOrder;
  }

  public void setAdditionalMerchantNotesOriginalOrder(String additionalMerchantNotesOriginalOrder) {
    this.additionalMerchantNotesOriginalOrder = additionalMerchantNotesOriginalOrder;
  }

  public OrderReplacement customField1(String customField1) {
    this.customField1 = customField1;
    return this;
  }

   /**
   * Custom field 1
   * @return customField1
  **/
  @ApiModelProperty(value = "Custom field 1")
  public String getCustomField1() {
    return customField1;
  }

  public void setCustomField1(String customField1) {
    this.customField1 = customField1;
  }

  public OrderReplacement customField2(String customField2) {
    this.customField2 = customField2;
    return this;
  }

   /**
   * Custom field 2
   * @return customField2
  **/
  @ApiModelProperty(value = "Custom field 2")
  public String getCustomField2() {
    return customField2;
  }

  public void setCustomField2(String customField2) {
    this.customField2 = customField2;
  }

  public OrderReplacement customField3(String customField3) {
    this.customField3 = customField3;
    return this;
  }

   /**
   * Custom field 3
   * @return customField3
  **/
  @ApiModelProperty(value = "Custom field 3")
  public String getCustomField3() {
    return customField3;
  }

  public void setCustomField3(String customField3) {
    this.customField3 = customField3;
  }

  public OrderReplacement customField4(String customField4) {
    this.customField4 = customField4;
    return this;
  }

   /**
   * Custom field 4
   * @return customField4
  **/
  @ApiModelProperty(value = "Custom field 4")
  public String getCustomField4() {
    return customField4;
  }

  public void setCustomField4(String customField4) {
    this.customField4 = customField4;
  }

  public OrderReplacement customField5(String customField5) {
    this.customField5 = customField5;
    return this;
  }

   /**
   * Custom field 5
   * @return customField5
  **/
  @ApiModelProperty(value = "Custom field 5")
  public String getCustomField5() {
    return customField5;
  }

  public void setCustomField5(String customField5) {
    this.customField5 = customField5;
  }

  public OrderReplacement customField6(String customField6) {
    this.customField6 = customField6;
    return this;
  }

   /**
   * Custom field 6
   * @return customField6
  **/
  @ApiModelProperty(value = "Custom field 6")
  public String getCustomField6() {
    return customField6;
  }

  public void setCustomField6(String customField6) {
    this.customField6 = customField6;
  }

  public OrderReplacement customField7(String customField7) {
    this.customField7 = customField7;
    return this;
  }

   /**
   * Custom field 7
   * @return customField7
  **/
  @ApiModelProperty(value = "Custom field 7")
  public String getCustomField7() {
    return customField7;
  }

  public void setCustomField7(String customField7) {
    this.customField7 = customField7;
  }

  public OrderReplacement free(Boolean free) {
    this.free = free;
    return this;
  }

   /**
   * Set to true if this replacement shipment should be free for the customer.
   * @return free
  **/
  @ApiModelProperty(value = "Set to true if this replacement shipment should be free for the customer.")
  public Boolean isFree() {
    return free;
  }

  public void setFree(Boolean free) {
    this.free = free;
  }

  public OrderReplacement immediateCharge(Boolean immediateCharge) {
    this.immediateCharge = immediateCharge;
    return this;
  }

   /**
   * Set to true if you want to immediately charge the payment on this order, otherwise it will go to Accounts Receivable.
   * @return immediateCharge
  **/
  @ApiModelProperty(value = "Set to true if you want to immediately charge the payment on this order, otherwise it will go to Accounts Receivable.")
  public Boolean isImmediateCharge() {
    return immediateCharge;
  }

  public void setImmediateCharge(Boolean immediateCharge) {
    this.immediateCharge = immediateCharge;
  }

  public OrderReplacement items(List<OrderReplacementItem> items) {
    this.items = items;
    return this;
  }

  public OrderReplacement addItemsItem(OrderReplacementItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<OrderReplacementItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items to include in the replacement order
   * @return items
  **/
  @ApiModelProperty(value = "Items to include in the replacement order")
  public List<OrderReplacementItem> getItems() {
    return items;
  }

  public void setItems(List<OrderReplacementItem> items) {
    this.items = items;
  }

  public OrderReplacement originalOrderId(String originalOrderId) {
    this.originalOrderId = originalOrderId;
    return this;
  }

   /**
   * Original order id
   * @return originalOrderId
  **/
  @ApiModelProperty(value = "Original order id")
  public String getOriginalOrderId() {
    return originalOrderId;
  }

  public void setOriginalOrderId(String originalOrderId) {
    this.originalOrderId = originalOrderId;
  }

  public OrderReplacement shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Shipping method to use.  If not specified or invalid then least cost shipping will take place.
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "Shipping method to use.  If not specified or invalid then least cost shipping will take place.")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public OrderReplacement skipPayment(Boolean skipPayment) {
    this.skipPayment = skipPayment;
    return this;
  }

   /**
   * Set to true if you want to skip the payment as if it was successful.
   * @return skipPayment
  **/
  @ApiModelProperty(value = "Set to true if you want to skip the payment as if it was successful.")
  public Boolean isSkipPayment() {
    return skipPayment;
  }

  public void setSkipPayment(Boolean skipPayment) {
    this.skipPayment = skipPayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReplacement orderReplacement = (OrderReplacement) o;
    return Objects.equals(this.additionalMerchantNotesNewOrder, orderReplacement.additionalMerchantNotesNewOrder) &&
        Objects.equals(this.additionalMerchantNotesOriginalOrder, orderReplacement.additionalMerchantNotesOriginalOrder) &&
        Objects.equals(this.customField1, orderReplacement.customField1) &&
        Objects.equals(this.customField2, orderReplacement.customField2) &&
        Objects.equals(this.customField3, orderReplacement.customField3) &&
        Objects.equals(this.customField4, orderReplacement.customField4) &&
        Objects.equals(this.customField5, orderReplacement.customField5) &&
        Objects.equals(this.customField6, orderReplacement.customField6) &&
        Objects.equals(this.customField7, orderReplacement.customField7) &&
        Objects.equals(this.free, orderReplacement.free) &&
        Objects.equals(this.immediateCharge, orderReplacement.immediateCharge) &&
        Objects.equals(this.items, orderReplacement.items) &&
        Objects.equals(this.originalOrderId, orderReplacement.originalOrderId) &&
        Objects.equals(this.shippingMethod, orderReplacement.shippingMethod) &&
        Objects.equals(this.skipPayment, orderReplacement.skipPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMerchantNotesNewOrder, additionalMerchantNotesOriginalOrder, customField1, customField2, customField3, customField4, customField5, customField6, customField7, free, immediateCharge, items, originalOrderId, shippingMethod, skipPayment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReplacement {\n");
    
    sb.append("    additionalMerchantNotesNewOrder: ").append(toIndentedString(additionalMerchantNotesNewOrder)).append("\n");
    sb.append("    additionalMerchantNotesOriginalOrder: ").append(toIndentedString(additionalMerchantNotesOriginalOrder)).append("\n");
    sb.append("    customField1: ").append(toIndentedString(customField1)).append("\n");
    sb.append("    customField2: ").append(toIndentedString(customField2)).append("\n");
    sb.append("    customField3: ").append(toIndentedString(customField3)).append("\n");
    sb.append("    customField4: ").append(toIndentedString(customField4)).append("\n");
    sb.append("    customField5: ").append(toIndentedString(customField5)).append("\n");
    sb.append("    customField6: ").append(toIndentedString(customField6)).append("\n");
    sb.append("    customField7: ").append(toIndentedString(customField7)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    immediateCharge: ").append(toIndentedString(immediateCharge)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    originalOrderId: ").append(toIndentedString(originalOrderId)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    skipPayment: ").append(toIndentedString(skipPayment)).append("\n");
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
