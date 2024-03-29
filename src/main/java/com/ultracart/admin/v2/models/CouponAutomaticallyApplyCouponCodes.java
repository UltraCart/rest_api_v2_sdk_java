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
import java.util.ArrayList;
import java.util.List;

/**
 * CouponAutomaticallyApplyCouponCodes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CouponAutomaticallyApplyCouponCodes {
  @SerializedName("coupon_codes")
  private List<String> couponCodes = null;

  public CouponAutomaticallyApplyCouponCodes couponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
    return this;
  }

  public CouponAutomaticallyApplyCouponCodes addCouponCodesItem(String couponCodesItem) {
    if (this.couponCodes == null) {
      this.couponCodes = new ArrayList<String>();
    }
    this.couponCodes.add(couponCodesItem);
    return this;
  }

   /**
   * The coupon codes to automatically apply if this coupon is applied
   * @return couponCodes
  **/
  @ApiModelProperty(value = "The coupon codes to automatically apply if this coupon is applied")
  public List<String> getCouponCodes() {
    return couponCodes;
  }

  public void setCouponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponAutomaticallyApplyCouponCodes couponAutomaticallyApplyCouponCodes = (CouponAutomaticallyApplyCouponCodes) o;
    return Objects.equals(this.couponCodes, couponAutomaticallyApplyCouponCodes.couponCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponCodes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponAutomaticallyApplyCouponCodes {\n");
    
    sb.append("    couponCodes: ").append(toIndentedString(couponCodes)).append("\n");
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

