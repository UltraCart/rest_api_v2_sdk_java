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
import com.ultracart.admin.v2.models.ItemRestrictionItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemRestriction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemRestriction {
  @SerializedName("exclude_coupon")
  private Boolean excludeCoupon = null;

  @SerializedName("exclude_from_free_promotion")
  private Boolean excludeFromFreePromotion = null;

  @SerializedName("items")
  private List<ItemRestrictionItem> items = null;

  @SerializedName("maximum_quantity")
  private Integer maximumQuantity = null;

  @SerializedName("minimum_quantity")
  private Integer minimumQuantity = null;

  @SerializedName("multiple_quantity")
  private Integer multipleQuantity = null;

  @SerializedName("one_per_customer")
  private Boolean onePerCustomer = null;

  @SerializedName("purchase_separately")
  private Boolean purchaseSeparately = null;

  public ItemRestriction excludeCoupon(Boolean excludeCoupon) {
    this.excludeCoupon = excludeCoupon;
    return this;
  }

   /**
   * Exclude coupons
   * @return excludeCoupon
  **/
  @ApiModelProperty(value = "Exclude coupons")
  public Boolean isExcludeCoupon() {
    return excludeCoupon;
  }

  public void setExcludeCoupon(Boolean excludeCoupon) {
    this.excludeCoupon = excludeCoupon;
  }

  public ItemRestriction excludeFromFreePromotion(Boolean excludeFromFreePromotion) {
    this.excludeFromFreePromotion = excludeFromFreePromotion;
    return this;
  }

   /**
   * Exclude from free promotion
   * @return excludeFromFreePromotion
  **/
  @ApiModelProperty(value = "Exclude from free promotion")
  public Boolean isExcludeFromFreePromotion() {
    return excludeFromFreePromotion;
  }

  public void setExcludeFromFreePromotion(Boolean excludeFromFreePromotion) {
    this.excludeFromFreePromotion = excludeFromFreePromotion;
  }

  public ItemRestriction items(List<ItemRestrictionItem> items) {
    this.items = items;
    return this;
  }

  public ItemRestriction addItemsItem(ItemRestrictionItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ItemRestrictionItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items
   * @return items
  **/
  @ApiModelProperty(value = "Items")
  public List<ItemRestrictionItem> getItems() {
    return items;
  }

  public void setItems(List<ItemRestrictionItem> items) {
    this.items = items;
  }

  public ItemRestriction maximumQuantity(Integer maximumQuantity) {
    this.maximumQuantity = maximumQuantity;
    return this;
  }

   /**
   * Maximum quantity
   * @return maximumQuantity
  **/
  @ApiModelProperty(value = "Maximum quantity")
  public Integer getMaximumQuantity() {
    return maximumQuantity;
  }

  public void setMaximumQuantity(Integer maximumQuantity) {
    this.maximumQuantity = maximumQuantity;
  }

  public ItemRestriction minimumQuantity(Integer minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
    return this;
  }

   /**
   * Minimum quantity (defaults to 1)
   * @return minimumQuantity
  **/
  @ApiModelProperty(value = "Minimum quantity (defaults to 1)")
  public Integer getMinimumQuantity() {
    return minimumQuantity;
  }

  public void setMinimumQuantity(Integer minimumQuantity) {
    this.minimumQuantity = minimumQuantity;
  }

  public ItemRestriction multipleQuantity(Integer multipleQuantity) {
    this.multipleQuantity = multipleQuantity;
    return this;
  }

   /**
   * Multiple of quantity
   * @return multipleQuantity
  **/
  @ApiModelProperty(value = "Multiple of quantity")
  public Integer getMultipleQuantity() {
    return multipleQuantity;
  }

  public void setMultipleQuantity(Integer multipleQuantity) {
    this.multipleQuantity = multipleQuantity;
  }

  public ItemRestriction onePerCustomer(Boolean onePerCustomer) {
    this.onePerCustomer = onePerCustomer;
    return this;
  }

   /**
   * One per customer
   * @return onePerCustomer
  **/
  @ApiModelProperty(value = "One per customer")
  public Boolean isOnePerCustomer() {
    return onePerCustomer;
  }

  public void setOnePerCustomer(Boolean onePerCustomer) {
    this.onePerCustomer = onePerCustomer;
  }

  public ItemRestriction purchaseSeparately(Boolean purchaseSeparately) {
    this.purchaseSeparately = purchaseSeparately;
    return this;
  }

   /**
   * Purchase separately
   * @return purchaseSeparately
  **/
  @ApiModelProperty(value = "Purchase separately")
  public Boolean isPurchaseSeparately() {
    return purchaseSeparately;
  }

  public void setPurchaseSeparately(Boolean purchaseSeparately) {
    this.purchaseSeparately = purchaseSeparately;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemRestriction itemRestriction = (ItemRestriction) o;
    return Objects.equals(this.excludeCoupon, itemRestriction.excludeCoupon) &&
        Objects.equals(this.excludeFromFreePromotion, itemRestriction.excludeFromFreePromotion) &&
        Objects.equals(this.items, itemRestriction.items) &&
        Objects.equals(this.maximumQuantity, itemRestriction.maximumQuantity) &&
        Objects.equals(this.minimumQuantity, itemRestriction.minimumQuantity) &&
        Objects.equals(this.multipleQuantity, itemRestriction.multipleQuantity) &&
        Objects.equals(this.onePerCustomer, itemRestriction.onePerCustomer) &&
        Objects.equals(this.purchaseSeparately, itemRestriction.purchaseSeparately);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeCoupon, excludeFromFreePromotion, items, maximumQuantity, minimumQuantity, multipleQuantity, onePerCustomer, purchaseSeparately);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemRestriction {\n");
    
    sb.append("    excludeCoupon: ").append(toIndentedString(excludeCoupon)).append("\n");
    sb.append("    excludeFromFreePromotion: ").append(toIndentedString(excludeFromFreePromotion)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maximumQuantity: ").append(toIndentedString(maximumQuantity)).append("\n");
    sb.append("    minimumQuantity: ").append(toIndentedString(minimumQuantity)).append("\n");
    sb.append("    multipleQuantity: ").append(toIndentedString(multipleQuantity)).append("\n");
    sb.append("    onePerCustomer: ").append(toIndentedString(onePerCustomer)).append("\n");
    sb.append("    purchaseSeparately: ").append(toIndentedString(purchaseSeparately)).append("\n");
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

