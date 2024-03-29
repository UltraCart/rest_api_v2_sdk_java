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
 * ItemShippingDestinationMarkup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemShippingDestinationMarkup {
  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("flat_fee")
  private BigDecimal flatFee = null;

  @SerializedName("per_item")
  private BigDecimal perItem = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("shipping_method")
  private String shippingMethod = null;

  @SerializedName("state")
  private String state = null;

  public ItemShippingDestinationMarkup countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code (ISO-3166 two letter)
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code (ISO-3166 two letter)")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public ItemShippingDestinationMarkup flatFee(BigDecimal flatFee) {
    this.flatFee = flatFee;
    return this;
  }

   /**
   * Flat fee
   * @return flatFee
  **/
  @ApiModelProperty(value = "Flat fee")
  public BigDecimal getFlatFee() {
    return flatFee;
  }

  public void setFlatFee(BigDecimal flatFee) {
    this.flatFee = flatFee;
  }

  public ItemShippingDestinationMarkup perItem(BigDecimal perItem) {
    this.perItem = perItem;
    return this;
  }

   /**
   * Per item
   * @return perItem
  **/
  @ApiModelProperty(value = "Per item")
  public BigDecimal getPerItem() {
    return perItem;
  }

  public void setPerItem(BigDecimal perItem) {
    this.perItem = perItem;
  }

  public ItemShippingDestinationMarkup postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public ItemShippingDestinationMarkup shippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
    return this;
  }

   /**
   * Shipping method
   * @return shippingMethod
  **/
  @ApiModelProperty(value = "Shipping method")
  public String getShippingMethod() {
    return shippingMethod;
  }

  public void setShippingMethod(String shippingMethod) {
    this.shippingMethod = shippingMethod;
  }

  public ItemShippingDestinationMarkup state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State
   * @return state
  **/
  @ApiModelProperty(value = "State")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemShippingDestinationMarkup itemShippingDestinationMarkup = (ItemShippingDestinationMarkup) o;
    return Objects.equals(this.countryCode, itemShippingDestinationMarkup.countryCode) &&
        Objects.equals(this.flatFee, itemShippingDestinationMarkup.flatFee) &&
        Objects.equals(this.perItem, itemShippingDestinationMarkup.perItem) &&
        Objects.equals(this.postalCode, itemShippingDestinationMarkup.postalCode) &&
        Objects.equals(this.shippingMethod, itemShippingDestinationMarkup.shippingMethod) &&
        Objects.equals(this.state, itemShippingDestinationMarkup.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, flatFee, perItem, postalCode, shippingMethod, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemShippingDestinationMarkup {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    flatFee: ").append(toIndentedString(flatFee)).append("\n");
    sb.append("    perItem: ").append(toIndentedString(perItem)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    shippingMethod: ").append(toIndentedString(shippingMethod)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

