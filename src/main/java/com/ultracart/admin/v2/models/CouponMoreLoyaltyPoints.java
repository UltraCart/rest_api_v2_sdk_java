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
 * CouponMoreLoyaltyPoints
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CouponMoreLoyaltyPoints {
  @SerializedName("loyalty_points")
  private BigDecimal loyaltyPoints = null;

  public CouponMoreLoyaltyPoints loyaltyPoints(BigDecimal loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
    return this;
  }

   /**
   * The additional loyalty points
   * @return loyaltyPoints
  **/
  @ApiModelProperty(value = "The additional loyalty points")
  public BigDecimal getLoyaltyPoints() {
    return loyaltyPoints;
  }

  public void setLoyaltyPoints(BigDecimal loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponMoreLoyaltyPoints couponMoreLoyaltyPoints = (CouponMoreLoyaltyPoints) o;
    return Objects.equals(this.loyaltyPoints, couponMoreLoyaltyPoints.loyaltyPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyaltyPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponMoreLoyaltyPoints {\n");
    
    sb.append("    loyaltyPoints: ").append(toIndentedString(loyaltyPoints)).append("\n");
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

