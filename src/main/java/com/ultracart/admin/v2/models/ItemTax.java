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
import com.ultracart.admin.v2.models.ItemTaxExemption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemTax
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-13T10:52:10.135-04:00")



public class ItemTax {
  @SerializedName("exemptions")
  private List<ItemTaxExemption> exemptions = null;

  @SerializedName("tax_free")
  private Boolean taxFree = null;

  @SerializedName("taxable_cost")
  private BigDecimal taxableCost = null;

  public ItemTax exemptions(List<ItemTaxExemption> exemptions) {
    this.exemptions = exemptions;
    return this;
  }

  public ItemTax addExemptionsItem(ItemTaxExemption exemptionsItem) {
    if (this.exemptions == null) {
      this.exemptions = new ArrayList<ItemTaxExemption>();
    }
    this.exemptions.add(exemptionsItem);
    return this;
  }

   /**
   * Exemptions
   * @return exemptions
  **/
  @ApiModelProperty(value = "Exemptions")
  public List<ItemTaxExemption> getExemptions() {
    return exemptions;
  }

  public void setExemptions(List<ItemTaxExemption> exemptions) {
    this.exemptions = exemptions;
  }

  public ItemTax taxFree(Boolean taxFree) {
    this.taxFree = taxFree;
    return this;
  }

   /**
   * True if tax free
   * @return taxFree
  **/
  @ApiModelProperty(value = "True if tax free")
  public Boolean isTaxFree() {
    return taxFree;
  }

  public void setTaxFree(Boolean taxFree) {
    this.taxFree = taxFree;
  }

  public ItemTax taxableCost(BigDecimal taxableCost) {
    this.taxableCost = taxableCost;
    return this;
  }

   /**
   * Taxable cost if different than regular cost
   * @return taxableCost
  **/
  @ApiModelProperty(value = "Taxable cost if different than regular cost")
  public BigDecimal getTaxableCost() {
    return taxableCost;
  }

  public void setTaxableCost(BigDecimal taxableCost) {
    this.taxableCost = taxableCost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemTax itemTax = (ItemTax) o;
    return Objects.equals(this.exemptions, itemTax.exemptions) &&
        Objects.equals(this.taxFree, itemTax.taxFree) &&
        Objects.equals(this.taxableCost, itemTax.taxableCost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exemptions, taxFree, taxableCost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTax {\n");
    
    sb.append("    exemptions: ").append(toIndentedString(exemptions)).append("\n");
    sb.append("    taxFree: ").append(toIndentedString(taxFree)).append("\n");
    sb.append("    taxableCost: ").append(toIndentedString(taxableCost)).append("\n");
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

