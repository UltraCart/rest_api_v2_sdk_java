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
 * CartItemProperty
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CartItemProperty {
  @SerializedName("display")
  private Boolean display = null;

  @SerializedName("expiration_dts")
  private String expirationDts = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public CartItemProperty display(Boolean display) {
    this.display = display;
    return this;
  }

   /**
   * True if this property is displayed to the customer
   * @return display
  **/
  @ApiModelProperty(value = "True if this property is displayed to the customer")
  public Boolean isDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
  }

  public CartItemProperty expirationDts(String expirationDts) {
    this.expirationDts = expirationDts;
    return this;
  }

   /**
   * The date/time that the property expires and is deleted
   * @return expirationDts
  **/
  @ApiModelProperty(value = "The date/time that the property expires and is deleted")
  public String getExpirationDts() {
    return expirationDts;
  }

  public void setExpirationDts(String expirationDts) {
    this.expirationDts = expirationDts;
  }

  public CartItemProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CartItemProperty value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @ApiModelProperty(value = "Value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemProperty cartItemProperty = (CartItemProperty) o;
    return Objects.equals(this.display, cartItemProperty.display) &&
        Objects.equals(this.expirationDts, cartItemProperty.expirationDts) &&
        Objects.equals(this.name, cartItemProperty.name) &&
        Objects.equals(this.value, cartItemProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, expirationDts, name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemProperty {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    expirationDts: ").append(toIndentedString(expirationDts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
