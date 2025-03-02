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
 * UltraCartConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:16:56.926-05:00")



public class UltraCartConfig {
  @SerializedName("exempt_from_colorado_retail_delivery_fee")
  private Boolean exemptFromColoradoRetailDeliveryFee = null;

  @SerializedName("exempt_from_minnesota_retail_delivery_fee")
  private Boolean exemptFromMinnesotaRetailDeliveryFee = null;

  @SerializedName("tax_billing")
  private Boolean taxBilling = null;

  public UltraCartConfig exemptFromColoradoRetailDeliveryFee(Boolean exemptFromColoradoRetailDeliveryFee) {
    this.exemptFromColoradoRetailDeliveryFee = exemptFromColoradoRetailDeliveryFee;
    return this;
  }

   /**
   * True if the Colorado Retail Delivery Fee should not be collected
   * @return exemptFromColoradoRetailDeliveryFee
  **/
  @ApiModelProperty(value = "True if the Colorado Retail Delivery Fee should not be collected")
  public Boolean isExemptFromColoradoRetailDeliveryFee() {
    return exemptFromColoradoRetailDeliveryFee;
  }

  public void setExemptFromColoradoRetailDeliveryFee(Boolean exemptFromColoradoRetailDeliveryFee) {
    this.exemptFromColoradoRetailDeliveryFee = exemptFromColoradoRetailDeliveryFee;
  }

  public UltraCartConfig exemptFromMinnesotaRetailDeliveryFee(Boolean exemptFromMinnesotaRetailDeliveryFee) {
    this.exemptFromMinnesotaRetailDeliveryFee = exemptFromMinnesotaRetailDeliveryFee;
    return this;
  }

   /**
   * True if the Minnesota Retail Delivery Fee should not be collected
   * @return exemptFromMinnesotaRetailDeliveryFee
  **/
  @ApiModelProperty(value = "True if the Minnesota Retail Delivery Fee should not be collected")
  public Boolean isExemptFromMinnesotaRetailDeliveryFee() {
    return exemptFromMinnesotaRetailDeliveryFee;
  }

  public void setExemptFromMinnesotaRetailDeliveryFee(Boolean exemptFromMinnesotaRetailDeliveryFee) {
    this.exemptFromMinnesotaRetailDeliveryFee = exemptFromMinnesotaRetailDeliveryFee;
  }

  public UltraCartConfig taxBilling(Boolean taxBilling) {
    this.taxBilling = taxBilling;
    return this;
  }

   /**
   * True if sales tax should be collected based on billing address instead of shipping address
   * @return taxBilling
  **/
  @ApiModelProperty(value = "True if sales tax should be collected based on billing address instead of shipping address")
  public Boolean isTaxBilling() {
    return taxBilling;
  }

  public void setTaxBilling(Boolean taxBilling) {
    this.taxBilling = taxBilling;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UltraCartConfig ultraCartConfig = (UltraCartConfig) o;
    return Objects.equals(this.exemptFromColoradoRetailDeliveryFee, ultraCartConfig.exemptFromColoradoRetailDeliveryFee) &&
        Objects.equals(this.exemptFromMinnesotaRetailDeliveryFee, ultraCartConfig.exemptFromMinnesotaRetailDeliveryFee) &&
        Objects.equals(this.taxBilling, ultraCartConfig.taxBilling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exemptFromColoradoRetailDeliveryFee, exemptFromMinnesotaRetailDeliveryFee, taxBilling);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UltraCartConfig {\n");
    
    sb.append("    exemptFromColoradoRetailDeliveryFee: ").append(toIndentedString(exemptFromColoradoRetailDeliveryFee)).append("\n");
    sb.append("    exemptFromMinnesotaRetailDeliveryFee: ").append(toIndentedString(exemptFromMinnesotaRetailDeliveryFee)).append("\n");
    sb.append("    taxBilling: ").append(toIndentedString(taxBilling)).append("\n");
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

