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
 * CouponPercentOffItemWithItemsQuantityPurchase
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CouponPercentOffItemWithItemsQuantityPurchase {
  @SerializedName("discount_percent")
  private BigDecimal discountPercent = null;

  @SerializedName("items")
  private List<String> items = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("required_purchase_items")
  private List<String> requiredPurchaseItems = null;

  @SerializedName("required_purchase_quantity")
  private Integer requiredPurchaseQuantity = null;

  public CouponPercentOffItemWithItemsQuantityPurchase discountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

   /**
   * The percentage of subtotal discount
   * @return discountPercent
  **/
  @ApiModelProperty(value = "The percentage of subtotal discount")
  public BigDecimal getDiscountPercent() {
    return discountPercent;
  }

  public void setDiscountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public CouponPercentOffItemWithItemsQuantityPurchase items(List<String> items) {
    this.items = items;
    return this;
  }

  public CouponPercentOffItemWithItemsQuantityPurchase addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<String>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of items which will receive a discount if one of the required purchase items is purchased.
   * @return items
  **/
  @ApiModelProperty(value = "A list of items which will receive a discount if one of the required purchase items is purchased.")
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public CouponPercentOffItemWithItemsQuantityPurchase limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * The (optional) maximum quantity of discounted items.
   * @return limit
  **/
  @ApiModelProperty(value = "The (optional) maximum quantity of discounted items.")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CouponPercentOffItemWithItemsQuantityPurchase requiredPurchaseItems(List<String> requiredPurchaseItems) {
    this.requiredPurchaseItems = requiredPurchaseItems;
    return this;
  }

  public CouponPercentOffItemWithItemsQuantityPurchase addRequiredPurchaseItemsItem(String requiredPurchaseItemsItem) {
    if (this.requiredPurchaseItems == null) {
      this.requiredPurchaseItems = new ArrayList<String>();
    }
    this.requiredPurchaseItems.add(requiredPurchaseItemsItem);
    return this;
  }

   /**
   * Required items (at least one from the list) that must be purchased for coupon to be valid
   * @return requiredPurchaseItems
  **/
  @ApiModelProperty(value = "Required items (at least one from the list) that must be purchased for coupon to be valid")
  public List<String> getRequiredPurchaseItems() {
    return requiredPurchaseItems;
  }

  public void setRequiredPurchaseItems(List<String> requiredPurchaseItems) {
    this.requiredPurchaseItems = requiredPurchaseItems;
  }

  public CouponPercentOffItemWithItemsQuantityPurchase requiredPurchaseQuantity(Integer requiredPurchaseQuantity) {
    this.requiredPurchaseQuantity = requiredPurchaseQuantity;
    return this;
  }

   /**
   * The quantity of items that must be purchased for the discount to be applied.
   * @return requiredPurchaseQuantity
  **/
  @ApiModelProperty(value = "The quantity of items that must be purchased for the discount to be applied.")
  public Integer getRequiredPurchaseQuantity() {
    return requiredPurchaseQuantity;
  }

  public void setRequiredPurchaseQuantity(Integer requiredPurchaseQuantity) {
    this.requiredPurchaseQuantity = requiredPurchaseQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponPercentOffItemWithItemsQuantityPurchase couponPercentOffItemWithItemsQuantityPurchase = (CouponPercentOffItemWithItemsQuantityPurchase) o;
    return Objects.equals(this.discountPercent, couponPercentOffItemWithItemsQuantityPurchase.discountPercent) &&
        Objects.equals(this.items, couponPercentOffItemWithItemsQuantityPurchase.items) &&
        Objects.equals(this.limit, couponPercentOffItemWithItemsQuantityPurchase.limit) &&
        Objects.equals(this.requiredPurchaseItems, couponPercentOffItemWithItemsQuantityPurchase.requiredPurchaseItems) &&
        Objects.equals(this.requiredPurchaseQuantity, couponPercentOffItemWithItemsQuantityPurchase.requiredPurchaseQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountPercent, items, limit, requiredPurchaseItems, requiredPurchaseQuantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponPercentOffItemWithItemsQuantityPurchase {\n");
    
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    requiredPurchaseItems: ").append(toIndentedString(requiredPurchaseItems)).append("\n");
    sb.append("    requiredPurchaseQuantity: ").append(toIndentedString(requiredPurchaseQuantity)).append("\n");
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

