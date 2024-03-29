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

/**
 * CouponAmountOffSubtotalWithPurchase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CouponAmountOffSubtotalWithPurchase {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("discount_amount")
  private BigDecimal discountAmount = null;

  @SerializedName("purchase_amount")
  private BigDecimal purchaseAmount = null;

  public CouponAmountOffSubtotalWithPurchase currencyCode(String currencyCode) {
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

  public CouponAmountOffSubtotalWithPurchase discountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * The amount of subtotal discount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "The amount of subtotal discount")
  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public CouponAmountOffSubtotalWithPurchase purchaseAmount(BigDecimal purchaseAmount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponAmountOffSubtotalWithPurchase couponAmountOffSubtotalWithPurchase = (CouponAmountOffSubtotalWithPurchase) o;
    return Objects.equals(this.currencyCode, couponAmountOffSubtotalWithPurchase.currencyCode) &&
        Objects.equals(this.discountAmount, couponAmountOffSubtotalWithPurchase.discountAmount) &&
        Objects.equals(this.purchaseAmount, couponAmountOffSubtotalWithPurchase.purchaseAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, discountAmount, purchaseAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponAmountOffSubtotalWithPurchase {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
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

