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
 * CouponTierItemDiscount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class CouponTierItemDiscount {
  @SerializedName("discount_amount")
  private BigDecimal discountAmount = null;

  @SerializedName("items")
  private List<String> items = null;

  public CouponTierItemDiscount discountAmount(BigDecimal discountAmount) {
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

  public CouponTierItemDiscount items(List<String> items) {
    this.items = items;
    return this;
  }

  public CouponTierItemDiscount addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<String>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * A list of items which will receive this discount.
   * @return items
  **/
  @ApiModelProperty(value = "A list of items which will receive this discount.")
  public List<String> getItems() {
    return items;
  }

  public void setItems(List<String> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponTierItemDiscount couponTierItemDiscount = (CouponTierItemDiscount) o;
    return Objects.equals(this.discountAmount, couponTierItemDiscount.discountAmount) &&
        Objects.equals(this.items, couponTierItemDiscount.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponTierItemDiscount {\n");
    
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
