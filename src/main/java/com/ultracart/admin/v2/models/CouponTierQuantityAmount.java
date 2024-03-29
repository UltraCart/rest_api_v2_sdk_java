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
 * CouponTierQuantityAmount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CouponTierQuantityAmount {
  @SerializedName("discount_amount")
  private BigDecimal discountAmount = null;

  @SerializedName("item_quantity")
  private Integer itemQuantity = null;

  @SerializedName("quickbooks_code")
  private String quickbooksCode = null;

  public CouponTierQuantityAmount discountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * The amount of discount per item.
   * @return discountAmount
  **/
  @ApiModelProperty(value = "The amount of discount per item.")
  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public CouponTierQuantityAmount itemQuantity(Integer itemQuantity) {
    this.itemQuantity = itemQuantity;
    return this;
  }

   /**
   * The quantity of item purchased (in units)
   * @return itemQuantity
  **/
  @ApiModelProperty(value = "The quantity of item purchased (in units)")
  public Integer getItemQuantity() {
    return itemQuantity;
  }

  public void setItemQuantity(Integer itemQuantity) {
    this.itemQuantity = itemQuantity;
  }

  public CouponTierQuantityAmount quickbooksCode(String quickbooksCode) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponTierQuantityAmount couponTierQuantityAmount = (CouponTierQuantityAmount) o;
    return Objects.equals(this.discountAmount, couponTierQuantityAmount.discountAmount) &&
        Objects.equals(this.itemQuantity, couponTierQuantityAmount.itemQuantity) &&
        Objects.equals(this.quickbooksCode, couponTierQuantityAmount.quickbooksCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, itemQuantity, quickbooksCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponTierQuantityAmount {\n");
    
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    itemQuantity: ").append(toIndentedString(itemQuantity)).append("\n");
    sb.append("    quickbooksCode: ").append(toIndentedString(quickbooksCode)).append("\n");
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

