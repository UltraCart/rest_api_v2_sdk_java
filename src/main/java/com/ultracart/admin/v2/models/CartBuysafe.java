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
 * CartBuysafe
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class CartBuysafe {
  @SerializedName("bond_available")
  private Boolean bondAvailable = null;

  @SerializedName("bond_cost")
  private Currency bondCost = null;

  @SerializedName("bond_free")
  private Boolean bondFree = null;

  @SerializedName("bond_wanted")
  private Boolean bondWanted = null;

  @SerializedName("cart_display_text")
  private String cartDisplayText = null;

  @SerializedName("cart_display_url")
  private String cartDisplayUrl = null;

  public CartBuysafe bondAvailable(Boolean bondAvailable) {
    this.bondAvailable = bondAvailable;
    return this;
  }

   /**
   * True if buySAFE is willing to bond the order
   * @return bondAvailable
  **/
  @ApiModelProperty(value = "True if buySAFE is willing to bond the order")
  public Boolean isBondAvailable() {
    return bondAvailable;
  }

  public void setBondAvailable(Boolean bondAvailable) {
    this.bondAvailable = bondAvailable;
  }

  public CartBuysafe bondCost(Currency bondCost) {
    this.bondCost = bondCost;
    return this;
  }

   /**
   * Get bondCost
   * @return bondCost
  **/
  @ApiModelProperty(value = "")
  public Currency getBondCost() {
    return bondCost;
  }

  public void setBondCost(Currency bondCost) {
    this.bondCost = bondCost;
  }

  public CartBuysafe bondFree(Boolean bondFree) {
    this.bondFree = bondFree;
    return this;
  }

   /**
   * True if the bond is free (merchant paying for it)
   * @return bondFree
  **/
  @ApiModelProperty(value = "True if the bond is free (merchant paying for it)")
  public Boolean isBondFree() {
    return bondFree;
  }

  public void setBondFree(Boolean bondFree) {
    this.bondFree = bondFree;
  }

  public CartBuysafe bondWanted(Boolean bondWanted) {
    this.bondWanted = bondWanted;
    return this;
  }

   /**
   * True if the customer wants the bond
   * @return bondWanted
  **/
  @ApiModelProperty(value = "True if the customer wants the bond")
  public Boolean isBondWanted() {
    return bondWanted;
  }

  public void setBondWanted(Boolean bondWanted) {
    this.bondWanted = bondWanted;
  }

  public CartBuysafe cartDisplayText(String cartDisplayText) {
    this.cartDisplayText = cartDisplayText;
    return this;
  }

   /**
   * Recommend text to display to the customer
   * @return cartDisplayText
  **/
  @ApiModelProperty(value = "Recommend text to display to the customer")
  public String getCartDisplayText() {
    return cartDisplayText;
  }

  public void setCartDisplayText(String cartDisplayText) {
    this.cartDisplayText = cartDisplayText;
  }

  public CartBuysafe cartDisplayUrl(String cartDisplayUrl) {
    this.cartDisplayUrl = cartDisplayUrl;
    return this;
  }

   /**
   * URL associated with the recommended text
   * @return cartDisplayUrl
  **/
  @ApiModelProperty(value = "URL associated with the recommended text")
  public String getCartDisplayUrl() {
    return cartDisplayUrl;
  }

  public void setCartDisplayUrl(String cartDisplayUrl) {
    this.cartDisplayUrl = cartDisplayUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartBuysafe cartBuysafe = (CartBuysafe) o;
    return Objects.equals(this.bondAvailable, cartBuysafe.bondAvailable) &&
        Objects.equals(this.bondCost, cartBuysafe.bondCost) &&
        Objects.equals(this.bondFree, cartBuysafe.bondFree) &&
        Objects.equals(this.bondWanted, cartBuysafe.bondWanted) &&
        Objects.equals(this.cartDisplayText, cartBuysafe.cartDisplayText) &&
        Objects.equals(this.cartDisplayUrl, cartBuysafe.cartDisplayUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bondAvailable, bondCost, bondFree, bondWanted, cartDisplayText, cartDisplayUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartBuysafe {\n");
    
    sb.append("    bondAvailable: ").append(toIndentedString(bondAvailable)).append("\n");
    sb.append("    bondCost: ").append(toIndentedString(bondCost)).append("\n");
    sb.append("    bondFree: ").append(toIndentedString(bondFree)).append("\n");
    sb.append("    bondWanted: ").append(toIndentedString(bondWanted)).append("\n");
    sb.append("    cartDisplayText: ").append(toIndentedString(cartDisplayText)).append("\n");
    sb.append("    cartDisplayUrl: ").append(toIndentedString(cartDisplayUrl)).append("\n");
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
