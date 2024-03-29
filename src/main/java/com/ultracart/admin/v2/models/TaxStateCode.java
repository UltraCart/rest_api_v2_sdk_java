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
 * TaxStateCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class TaxStateCode {
  @SerializedName("accounting_code")
  private String accountingCode = null;

  @SerializedName("state_code")
  private String stateCode = null;

  @SerializedName("state_name")
  private String stateName = null;

  @SerializedName("tax_rate")
  private BigDecimal taxRate = null;

  @SerializedName("tax_rate_formatted")
  private String taxRateFormatted = null;

  public TaxStateCode accountingCode(String accountingCode) {
    this.accountingCode = accountingCode;
    return this;
  }

   /**
   * Accounting code for programs such as QuickBooks
   * @return accountingCode
  **/
  @ApiModelProperty(value = "Accounting code for programs such as QuickBooks")
  public String getAccountingCode() {
    return accountingCode;
  }

  public void setAccountingCode(String accountingCode) {
    this.accountingCode = accountingCode;
  }

  public TaxStateCode stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * State code (2 characters
   * @return stateCode
  **/
  @ApiModelProperty(value = "State code (2 characters")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public TaxStateCode stateName(String stateName) {
    this.stateName = stateName;
    return this;
  }

   /**
   * State name
   * @return stateName
  **/
  @ApiModelProperty(value = "State name")
  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public TaxStateCode taxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Tax Rate
   * @return taxRate
  **/
  @ApiModelProperty(value = "Tax Rate")
  public BigDecimal getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }

  public TaxStateCode taxRateFormatted(String taxRateFormatted) {
    this.taxRateFormatted = taxRateFormatted;
    return this;
  }

   /**
   * Tax rate formatted
   * @return taxRateFormatted
  **/
  @ApiModelProperty(value = "Tax rate formatted")
  public String getTaxRateFormatted() {
    return taxRateFormatted;
  }

  public void setTaxRateFormatted(String taxRateFormatted) {
    this.taxRateFormatted = taxRateFormatted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxStateCode taxStateCode = (TaxStateCode) o;
    return Objects.equals(this.accountingCode, taxStateCode.accountingCode) &&
        Objects.equals(this.stateCode, taxStateCode.stateCode) &&
        Objects.equals(this.stateName, taxStateCode.stateName) &&
        Objects.equals(this.taxRate, taxStateCode.taxRate) &&
        Objects.equals(this.taxRateFormatted, taxStateCode.taxRateFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountingCode, stateCode, stateName, taxRate, taxRateFormatted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxStateCode {\n");
    
    sb.append("    accountingCode: ").append(toIndentedString(accountingCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxRateFormatted: ").append(toIndentedString(taxRateFormatted)).append("\n");
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

