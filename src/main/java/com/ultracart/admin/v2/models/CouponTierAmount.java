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
 * CouponTierAmount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CouponTierAmount {
  @SerializedName("discount_amount")
  private BigDecimal discountAmount = null;

  @SerializedName("quickbooks_code")
  private String quickbooksCode = null;

  @SerializedName("subtotal_amount")
  private BigDecimal subtotalAmount = null;

  public CouponTierAmount discountAmount(BigDecimal discountAmount) {
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

  public CouponTierAmount quickbooksCode(String quickbooksCode) {
    this.quickbooksCode = quickbooksCode;
    return this;
  }

   /**
   * Quickbooks accounting code.
   * @return quickbooksCode
  **/
  @ApiModelProperty(value = "Quickbooks accounting code.")
  public String getQuickbooksCode() {
    return quickbooksCode;
  }

  public void setQuickbooksCode(String quickbooksCode) {
    this.quickbooksCode = quickbooksCode;
  }

  public CouponTierAmount subtotalAmount(BigDecimal subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
    return this;
  }

   /**
   * The amount of subtotal required to receive the discount amount
   * @return subtotalAmount
  **/
  @ApiModelProperty(value = "The amount of subtotal required to receive the discount amount")
  public BigDecimal getSubtotalAmount() {
    return subtotalAmount;
  }

  public void setSubtotalAmount(BigDecimal subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponTierAmount couponTierAmount = (CouponTierAmount) o;
    return Objects.equals(this.discountAmount, couponTierAmount.discountAmount) &&
        Objects.equals(this.quickbooksCode, couponTierAmount.quickbooksCode) &&
        Objects.equals(this.subtotalAmount, couponTierAmount.subtotalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, quickbooksCode, subtotalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponTierAmount {\n");
    
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    quickbooksCode: ").append(toIndentedString(quickbooksCode)).append("\n");
    sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
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

