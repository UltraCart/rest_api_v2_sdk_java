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
import com.ultracart.admin.v2.models.Currency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrderBuysafe
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class OrderBuysafe {
  @SerializedName("buysafe_bond_available")
  private Boolean buysafeBondAvailable = null;

  @SerializedName("buysafe_bond_cost")
  private Currency buysafeBondCost = null;

  @SerializedName("buysafe_bond_free")
  private Boolean buysafeBondFree = null;

  @SerializedName("buysafe_bond_refunded")
  private Currency buysafeBondRefunded = null;

  @SerializedName("buysafe_bond_wanted")
  private Boolean buysafeBondWanted = null;

  @SerializedName("buysafe_shopping_cart_id")
  private String buysafeShoppingCartId = null;

  public OrderBuysafe buysafeBondAvailable(Boolean buysafeBondAvailable) {
    this.buysafeBondAvailable = buysafeBondAvailable;
    return this;
  }

   /**
   * True if a buySAFE bond was available for purchase on this order
   * @return buysafeBondAvailable
  **/
  @ApiModelProperty(value = "True if a buySAFE bond was available for purchase on this order")
  public Boolean isBuysafeBondAvailable() {
    return buysafeBondAvailable;
  }

  public void setBuysafeBondAvailable(Boolean buysafeBondAvailable) {
    this.buysafeBondAvailable = buysafeBondAvailable;
  }

  public OrderBuysafe buysafeBondCost(Currency buysafeBondCost) {
    this.buysafeBondCost = buysafeBondCost;
    return this;
  }

   /**
   * Get buysafeBondCost
   * @return buysafeBondCost
  **/
  @ApiModelProperty(value = "")
  public Currency getBuysafeBondCost() {
    return buysafeBondCost;
  }

  public void setBuysafeBondCost(Currency buysafeBondCost) {
    this.buysafeBondCost = buysafeBondCost;
  }

  public OrderBuysafe buysafeBondFree(Boolean buysafeBondFree) {
    this.buysafeBondFree = buysafeBondFree;
    return this;
  }

   /**
   * True if the buySAFE bond was free for this order
   * @return buysafeBondFree
  **/
  @ApiModelProperty(value = "True if the buySAFE bond was free for this order")
  public Boolean isBuysafeBondFree() {
    return buysafeBondFree;
  }

  public void setBuysafeBondFree(Boolean buysafeBondFree) {
    this.buysafeBondFree = buysafeBondFree;
  }

  public OrderBuysafe buysafeBondRefunded(Currency buysafeBondRefunded) {
    this.buysafeBondRefunded = buysafeBondRefunded;
    return this;
  }

   /**
   * Get buysafeBondRefunded
   * @return buysafeBondRefunded
  **/
  @ApiModelProperty(value = "")
  public Currency getBuysafeBondRefunded() {
    return buysafeBondRefunded;
  }

  public void setBuysafeBondRefunded(Currency buysafeBondRefunded) {
    this.buysafeBondRefunded = buysafeBondRefunded;
  }

  public OrderBuysafe buysafeBondWanted(Boolean buysafeBondWanted) {
    this.buysafeBondWanted = buysafeBondWanted;
    return this;
  }

   /**
   * True if the buySAFE bond was wanted by the customer
   * @return buysafeBondWanted
  **/
  @ApiModelProperty(value = "True if the buySAFE bond was wanted by the customer")
  public Boolean isBuysafeBondWanted() {
    return buysafeBondWanted;
  }

  public void setBuysafeBondWanted(Boolean buysafeBondWanted) {
    this.buysafeBondWanted = buysafeBondWanted;
  }

  public OrderBuysafe buysafeShoppingCartId(String buysafeShoppingCartId) {
    this.buysafeShoppingCartId = buysafeShoppingCartId;
    return this;
  }

   /**
   * Shopping cart ID associated with the buySAFE bond
   * @return buysafeShoppingCartId
  **/
  @ApiModelProperty(value = "Shopping cart ID associated with the buySAFE bond")
  public String getBuysafeShoppingCartId() {
    return buysafeShoppingCartId;
  }

  public void setBuysafeShoppingCartId(String buysafeShoppingCartId) {
    this.buysafeShoppingCartId = buysafeShoppingCartId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBuysafe orderBuysafe = (OrderBuysafe) o;
    return Objects.equals(this.buysafeBondAvailable, orderBuysafe.buysafeBondAvailable) &&
        Objects.equals(this.buysafeBondCost, orderBuysafe.buysafeBondCost) &&
        Objects.equals(this.buysafeBondFree, orderBuysafe.buysafeBondFree) &&
        Objects.equals(this.buysafeBondRefunded, orderBuysafe.buysafeBondRefunded) &&
        Objects.equals(this.buysafeBondWanted, orderBuysafe.buysafeBondWanted) &&
        Objects.equals(this.buysafeShoppingCartId, orderBuysafe.buysafeShoppingCartId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buysafeBondAvailable, buysafeBondCost, buysafeBondFree, buysafeBondRefunded, buysafeBondWanted, buysafeShoppingCartId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBuysafe {\n");
    
    sb.append("    buysafeBondAvailable: ").append(toIndentedString(buysafeBondAvailable)).append("\n");
    sb.append("    buysafeBondCost: ").append(toIndentedString(buysafeBondCost)).append("\n");
    sb.append("    buysafeBondFree: ").append(toIndentedString(buysafeBondFree)).append("\n");
    sb.append("    buysafeBondRefunded: ").append(toIndentedString(buysafeBondRefunded)).append("\n");
    sb.append("    buysafeBondWanted: ").append(toIndentedString(buysafeBondWanted)).append("\n");
    sb.append("    buysafeShoppingCartId: ").append(toIndentedString(buysafeShoppingCartId)).append("\n");
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
