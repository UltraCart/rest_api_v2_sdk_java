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

/**
 * ItemFulfillmentAddon
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-23T14:49:10.477-05:00")



public class ItemFulfillmentAddon {
  @SerializedName("add_item_id")
  private String addItemId = null;

  @SerializedName("add_item_oid")
  private Integer addItemOid = null;

  @SerializedName("once_per_order")
  private Boolean oncePerOrder = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  public ItemFulfillmentAddon addItemId(String addItemId) {
    this.addItemId = addItemId;
    return this;
  }

   /**
   * Add Item Id
   * @return addItemId
  **/
  @ApiModelProperty(value = "Add Item Id")
  public String getAddItemId() {
    return addItemId;
  }

  public void setAddItemId(String addItemId) {
    this.addItemId = addItemId;
  }

  public ItemFulfillmentAddon addItemOid(Integer addItemOid) {
    this.addItemOid = addItemOid;
    return this;
  }

   /**
   * Add Item object identifier
   * @return addItemOid
  **/
  @ApiModelProperty(value = "Add Item object identifier")
  public Integer getAddItemOid() {
    return addItemOid;
  }

  public void setAddItemOid(Integer addItemOid) {
    this.addItemOid = addItemOid;
  }

  public ItemFulfillmentAddon oncePerOrder(Boolean oncePerOrder) {
    this.oncePerOrder = oncePerOrder;
    return this;
  }

   /**
   * Quantity
   * @return oncePerOrder
  **/
  @ApiModelProperty(value = "Quantity")
  public Boolean isOncePerOrder() {
    return oncePerOrder;
  }

  public void setOncePerOrder(Boolean oncePerOrder) {
    this.oncePerOrder = oncePerOrder;
  }

  public ItemFulfillmentAddon quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemFulfillmentAddon itemFulfillmentAddon = (ItemFulfillmentAddon) o;
    return Objects.equals(this.addItemId, itemFulfillmentAddon.addItemId) &&
        Objects.equals(this.addItemOid, itemFulfillmentAddon.addItemOid) &&
        Objects.equals(this.oncePerOrder, itemFulfillmentAddon.oncePerOrder) &&
        Objects.equals(this.quantity, itemFulfillmentAddon.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addItemId, addItemOid, oncePerOrder, quantity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemFulfillmentAddon {\n");
    
    sb.append("    addItemId: ").append(toIndentedString(addItemId)).append("\n");
    sb.append("    addItemOid: ").append(toIndentedString(addItemOid)).append("\n");
    sb.append("    oncePerOrder: ").append(toIndentedString(oncePerOrder)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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
