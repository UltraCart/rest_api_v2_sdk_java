/*
 * UltraCart Rest API V2
 * This is the next generation UltraCart REST API...
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * CouponAmountOffShippingWithItemsPurchase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class CouponAmountOffShippingWithItemsPurchase {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("discount_amount")
  private BigDecimal discountAmount = null;

  @SerializedName("items")
  private List<String> items = null;

  @SerializedName("shipping_methods")
  private List<String> shippingMethods = null;

  public CouponAmountOffShippingWithItemsPurchase currencyCode(String currencyCode) {
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

  public CouponAmountOffShippingWithItemsPurchase discountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * The amount of shipping discount
   * @return discountAmount
  **/
  @ApiModelProperty(value = "The amount of shipping discount")
  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public CouponAmountOffShippingWithItemsPurchase items(List<String> items) {
    this.items = items;
    return this;
  }

  public CouponAmountOffShippingWithItemsPurchase addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<String>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of items of which at least one must be purchased for coupon to be valid.
   * @return items
  **/
  @ApiModelProperty(value = "A list of items of which at least one must be purchased for coupon to be valid.")
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public CouponAmountOffShippingWithItemsPurchase shippingMethods(List<String> shippingMethods) {
    this.shippingMethods = shippingMethods;
    return this;
  }

  public CouponAmountOffShippingWithItemsPurchase addShippingMethodsItem(String shippingMethodsItem) {
    if (this.shippingMethods == null) {
      this.shippingMethods = new ArrayList<String>();
    }
    this.shippingMethods.add(shippingMethodsItem);
    return this;
  }

   /**
   * One or more shipping methods that may receive this discount
   * @return shippingMethods
  **/
  @ApiModelProperty(value = "One or more shipping methods that may receive this discount")
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
    CouponAmountOffShippingWithItemsPurchase couponAmountOffShippingWithItemsPurchase = (CouponAmountOffShippingWithItemsPurchase) o;
    return Objects.equals(this.currencyCode, couponAmountOffShippingWithItemsPurchase.currencyCode) &&
        Objects.equals(this.discountAmount, couponAmountOffShippingWithItemsPurchase.discountAmount) &&
        Objects.equals(this.items, couponAmountOffShippingWithItemsPurchase.items) &&
        Objects.equals(this.shippingMethods, couponAmountOffShippingWithItemsPurchase.shippingMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, discountAmount, items, shippingMethods);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponAmountOffShippingWithItemsPurchase {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
