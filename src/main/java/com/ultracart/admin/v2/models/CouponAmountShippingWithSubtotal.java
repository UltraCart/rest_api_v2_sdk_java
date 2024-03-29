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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * CouponAmountShippingWithSubtotal
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CouponAmountShippingWithSubtotal {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("purchase_amount")
  private BigDecimal purchaseAmount = null;

  @SerializedName("shipping_amount")
  private BigDecimal shippingAmount = null;

  @SerializedName("shipping_methods")
  private List<String> shippingMethods = null;

  public CouponAmountShippingWithSubtotal currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The ISO-4217 three letter currency code the customer is viewing prices in
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The ISO-4217 three letter currency code the customer is viewing prices in")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CouponAmountShippingWithSubtotal purchaseAmount(BigDecimal purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
    return this;
  }

   /**
   * The purchase amount to qualify for subtotal discount and free shipping
   * @return purchaseAmount
  **/
  @ApiModelProperty(value = "The purchase amount to qualify for subtotal discount and free shipping")
  public BigDecimal getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(BigDecimal purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }

  public CouponAmountShippingWithSubtotal shippingAmount(BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
    return this;
  }

   /**
   * The amount of the shipping cost (this is not a discount, this is the actual cost of shipping)
   * @return shippingAmount
  **/
  @ApiModelProperty(value = "The amount of the shipping cost (this is not a discount, this is the actual cost of shipping)")
  public BigDecimal getShippingAmount() {
    return shippingAmount;
  }

  public void setShippingAmount(BigDecimal shippingAmount) {
    this.shippingAmount = shippingAmount;
  }

  public CouponAmountShippingWithSubtotal shippingMethods(List<String> shippingMethods) {
    this.shippingMethods = shippingMethods;
    return this;
  }

  public CouponAmountShippingWithSubtotal addShippingMethodsItem(String shippingMethodsItem) {
    if (this.shippingMethods == null) {
      this.shippingMethods = new ArrayList<String>();
    }
    this.shippingMethods.add(shippingMethodsItem);
    return this;
  }

   /**
   * One or more shipping methods that may be used with this coupon
   * @return shippingMethods
  **/
  @ApiModelProperty(value = "One or more shipping methods that may be used with this coupon")
  public List<String> getShippingMethods() {
    return shippingMethods;
  }

  public void setShippingMethods(List<String> shippingMethods) {
    this.shippingMethods = shippingMethods;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponAmountShippingWithSubtotal couponAmountShippingWithSubtotal = (CouponAmountShippingWithSubtotal) o;
    return Objects.equals(this.currencyCode, couponAmountShippingWithSubtotal.currencyCode) &&
        Objects.equals(this.purchaseAmount, couponAmountShippingWithSubtotal.purchaseAmount) &&
        Objects.equals(this.shippingAmount, couponAmountShippingWithSubtotal.shippingAmount) &&
        Objects.equals(this.shippingMethods, couponAmountShippingWithSubtotal.shippingMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, purchaseAmount, shippingAmount, shippingMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponAmountShippingWithSubtotal {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
    sb.append("    shippingAmount: ").append(toIndentedString(shippingAmount)).append("\n");
    sb.append("    shippingMethods: ").append(toIndentedString(shippingMethods)).append("\n");
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

