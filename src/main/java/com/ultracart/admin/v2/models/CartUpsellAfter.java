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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CartUpsellAfter
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class CartUpsellAfter {
  @SerializedName("finalize_after_dts")
  private String finalizeAfterDts = null;

  @SerializedName("finalize_after_minutes")
  private Integer finalizeAfterMinutes = null;

  @SerializedName("upsell_path_code")
  private String upsellPathCode = null;

  public CartUpsellAfter finalizeAfterDts(String finalizeAfterDts) {
    this.finalizeAfterDts = finalizeAfterDts;
    return this;
  }

   /**
   * The date/time after which the cart will finalize into an order.
   * @return finalizeAfterDts
  **/
  @ApiModelProperty(value = "The date/time after which the cart will finalize into an order.")
  public String getFinalizeAfterDts() {
    return finalizeAfterDts;
  }

  public void setFinalizeAfterDts(String finalizeAfterDts) {
    this.finalizeAfterDts = finalizeAfterDts;
  }

  public CartUpsellAfter finalizeAfterMinutes(Integer finalizeAfterMinutes) {
    this.finalizeAfterMinutes = finalizeAfterMinutes;
    return this;
  }

   /**
   * The amount of inactivity in minutes after which the cart should be finalized into an order.  This will calculate the finalize_after_dts field.
   * @return finalizeAfterMinutes
  **/
  @ApiModelProperty(value = "The amount of inactivity in minutes after which the cart should be finalized into an order.  This will calculate the finalize_after_dts field.")
  public Integer getFinalizeAfterMinutes() {
    return finalizeAfterMinutes;
  }

  public void setFinalizeAfterMinutes(Integer finalizeAfterMinutes) {
    this.finalizeAfterMinutes = finalizeAfterMinutes;
  }

  public CartUpsellAfter upsellPathCode(String upsellPathCode) {
    this.upsellPathCode = upsellPathCode;
    return this;
  }

   /**
   * Upsell path code
   * @return upsellPathCode
  **/
  @ApiModelProperty(value = "Upsell path code")
  public String getUpsellPathCode() {
    return upsellPathCode;
  }

  public void setUpsellPathCode(String upsellPathCode) {
    this.upsellPathCode = upsellPathCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartUpsellAfter cartUpsellAfter = (CartUpsellAfter) o;
    return Objects.equals(this.finalizeAfterDts, cartUpsellAfter.finalizeAfterDts) &&
        Objects.equals(this.finalizeAfterMinutes, cartUpsellAfter.finalizeAfterMinutes) &&
        Objects.equals(this.upsellPathCode, cartUpsellAfter.upsellPathCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalizeAfterDts, finalizeAfterMinutes, upsellPathCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartUpsellAfter {\n");
    
    sb.append("    finalizeAfterDts: ").append(toIndentedString(finalizeAfterDts)).append("\n");
    sb.append("    finalizeAfterMinutes: ").append(toIndentedString(finalizeAfterMinutes)).append("\n");
    sb.append("    upsellPathCode: ").append(toIndentedString(upsellPathCode)).append("\n");
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
