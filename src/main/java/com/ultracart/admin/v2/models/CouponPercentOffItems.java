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
 * CouponPercentOffItems
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-13T10:52:10.135-04:00")



public class CouponPercentOffItems {
  @SerializedName("discount_percent")
  private BigDecimal discountPercent = null;

  @SerializedName("excluded_items")
  private List<String> excludedItems = null;

  @SerializedName("items")
  private List<String> items = null;

  @SerializedName("limit")
  private Integer limit = null;

  public CouponPercentOffItems discountPercent(BigDecimal discountPercent) {
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

  public CouponPercentOffItems excludedItems(List<String> excludedItems) {
    this.excludedItems = excludedItems;
    return this;
  }

  public CouponPercentOffItems addExcludedItemsItem(String excludedItemsItem) {
    if (this.excludedItems == null) {
      this.excludedItems = new ArrayList<String>();
    }
    this.excludedItems.add(excludedItemsItem);
    return this;
  }

   /**
   * A list of items which cannot be discounted.
   * @return excludedItems
  **/
  @ApiModelProperty(value = "A list of items which cannot be discounted.")
  public List<String> getExcludedItems() {
    return excludedItems;
  }

  public void setExcludedItems(List<String> excludedItems) {
    this.excludedItems = excludedItems;
  }

  public CouponPercentOffItems items(List<String> items) {
    this.items = items;
    return this;
  }

  public CouponPercentOffItems addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<String>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * An optional list of items which will receive a discount.  If blank, discount applies to all items except excluded items.
   * @return items
  **/
  @ApiModelProperty(value = "An optional list of items which will receive a discount.  If blank, discount applies to all items except excluded items.")
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }

  public CouponPercentOffItems limit(Integer limit) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponPercentOffItems couponPercentOffItems = (CouponPercentOffItems) o;
    return Objects.equals(this.discountPercent, couponPercentOffItems.discountPercent) &&
        Objects.equals(this.excludedItems, couponPercentOffItems.excludedItems) &&
        Objects.equals(this.items, couponPercentOffItems.items) &&
        Objects.equals(this.limit, couponPercentOffItems.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountPercent, excludedItems, items, limit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponPercentOffItems {\n");
    
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    excludedItems: ").append(toIndentedString(excludedItems)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

