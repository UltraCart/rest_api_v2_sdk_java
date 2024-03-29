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
 * CouponRestriction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CouponRestriction {
  @SerializedName("invalidForThis")
  private Boolean invalidForThis = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("validForThis")
  private Boolean validForThis = null;

  @SerializedName("validOnlyForThis")
  private Boolean validOnlyForThis = null;

  public CouponRestriction invalidForThis(Boolean invalidForThis) {
    this.invalidForThis = invalidForThis;
    return this;
  }

   /**
   * Get invalidForThis
   * @return invalidForThis
  **/
  @ApiModelProperty(value = "")
  public Boolean isInvalidForThis() {
    return invalidForThis;
  }

  public void setInvalidForThis(Boolean invalidForThis) {
    this.invalidForThis = invalidForThis;
  }

  public CouponRestriction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CouponRestriction validForThis(Boolean validForThis) {
    this.validForThis = validForThis;
    return this;
  }

   /**
   * Get validForThis
   * @return validForThis
  **/
  @ApiModelProperty(value = "")
  public Boolean isValidForThis() {
    return validForThis;
  }

  public void setValidForThis(Boolean validForThis) {
    this.validForThis = validForThis;
  }

  public CouponRestriction validOnlyForThis(Boolean validOnlyForThis) {
    this.validOnlyForThis = validOnlyForThis;
    return this;
  }

   /**
   * Get validOnlyForThis
   * @return validOnlyForThis
  **/
  @ApiModelProperty(value = "")
  public Boolean isValidOnlyForThis() {
    return validOnlyForThis;
  }

  public void setValidOnlyForThis(Boolean validOnlyForThis) {
    this.validOnlyForThis = validOnlyForThis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponRestriction couponRestriction = (CouponRestriction) o;
    return Objects.equals(this.invalidForThis, couponRestriction.invalidForThis) &&
        Objects.equals(this.name, couponRestriction.name) &&
        Objects.equals(this.validForThis, couponRestriction.validForThis) &&
        Objects.equals(this.validOnlyForThis, couponRestriction.validOnlyForThis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidForThis, name, validForThis, validOnlyForThis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponRestriction {\n");
    
    sb.append("    invalidForThis: ").append(toIndentedString(invalidForThis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    validForThis: ").append(toIndentedString(validForThis)).append("\n");
    sb.append("    validOnlyForThis: ").append(toIndentedString(validOnlyForThis)).append("\n");
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

