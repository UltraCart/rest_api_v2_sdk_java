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
 * ItemAmember
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemAmember {
  @SerializedName("amember_payment_duration_days")
  private Integer amemberPaymentDurationDays = null;

  @SerializedName("amember_product_id")
  private String amemberProductId = null;

  public ItemAmember amemberPaymentDurationDays(Integer amemberPaymentDurationDays) {
    this.amemberPaymentDurationDays = amemberPaymentDurationDays;
    return this;
  }

   /**
   * The number of days that the customer should be given access to the item
   * @return amemberPaymentDurationDays
  **/
  @ApiModelProperty(value = "The number of days that the customer should be given access to the item")
  public Integer getAmemberPaymentDurationDays() {
    return amemberPaymentDurationDays;
  }

  public void setAmemberPaymentDurationDays(Integer amemberPaymentDurationDays) {
    this.amemberPaymentDurationDays = amemberPaymentDurationDays;
  }

  public ItemAmember amemberProductId(String amemberProductId) {
    this.amemberProductId = amemberProductId;
    return this;
  }

   /**
   * A-member product id give customer access to when they purchase this item
   * @return amemberProductId
  **/
  @ApiModelProperty(value = "A-member product id give customer access to when they purchase this item")
  public String getAmemberProductId() {
    return amemberProductId;
  }

  public void setAmemberProductId(String amemberProductId) {
    this.amemberProductId = amemberProductId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemAmember itemAmember = (ItemAmember) o;
    return Objects.equals(this.amemberPaymentDurationDays, itemAmember.amemberPaymentDurationDays) &&
        Objects.equals(this.amemberProductId, itemAmember.amemberProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amemberPaymentDurationDays, amemberProductId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAmember {\n");
    
    sb.append("    amemberPaymentDurationDays: ").append(toIndentedString(amemberPaymentDurationDays)).append("\n");
    sb.append("    amemberProductId: ").append(toIndentedString(amemberProductId)).append("\n");
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

