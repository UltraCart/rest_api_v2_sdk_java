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
 * CouponDeletesRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-01T07:55:46.727-05:00")



public class CouponDeletesRequest {
  @SerializedName("coupon_codes")
  private List<String> couponCodes = null;

  @SerializedName("coupon_oids")
  private List<Integer> couponOids = null;

  public CouponDeletesRequest couponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
    return this;
  }

  public CouponDeletesRequest addCouponCodesItem(String couponCodesItem) {
    if (this.couponCodes == null) {
      this.couponCodes = new ArrayList<String>();
    }
    this.couponCodes.add(couponCodesItem);
    return this;
  }

   /**
   * Coupon codes
   * @return couponCodes
  **/
  @ApiModelProperty(value = "Coupon codes")
  public List<String> getCouponCodes() {
    return couponCodes;
  }

  public void setCouponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }

  public CouponDeletesRequest couponOids(List<Integer> couponOids) {
    this.couponOids = couponOids;
    return this;
  }

  public CouponDeletesRequest addCouponOidsItem(Integer couponOidsItem) {
    if (this.couponOids == null) {
      this.couponOids = new ArrayList<Integer>();
    }
    this.couponOids.add(couponOidsItem);
    return this;
  }

   /**
   * Coupon oids
   * @return couponOids
  **/
  @ApiModelProperty(value = "Coupon oids")
  public List<Integer> getCouponOids() {
    return couponOids;
  }

  public void setCouponOids(List<Integer> couponOids) {
    this.couponOids = couponOids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponDeletesRequest couponDeletesRequest = (CouponDeletesRequest) o;
    return Objects.equals(this.couponCodes, couponDeletesRequest.couponCodes) &&
        Objects.equals(this.couponOids, couponDeletesRequest.couponOids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(couponCodes, couponOids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponDeletesRequest {\n");
    
    sb.append("    couponCodes: ").append(toIndentedString(couponCodes)).append("\n");
    sb.append("    couponOids: ").append(toIndentedString(couponOids)).append("\n");
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
