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
import com.ultracart.admin.v2.models.PaymentsConfigurationRestrictions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentsConfigurationCOD
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-29T10:39:55.223-04:00")



public class PaymentsConfigurationCOD {
  @SerializedName("acceptCod")
  private Boolean acceptCod = null;

  @SerializedName("codApprovedCustomersOnly")
  private Boolean codApprovedCustomersOnly = null;

  @SerializedName("codSurchargeAccountingCode")
  private String codSurchargeAccountingCode = null;

  @SerializedName("codSurchargeFee")
  private String codSurchargeFee = null;

  @SerializedName("codSurchargePerc")
  private String codSurchargePerc = null;

  @SerializedName("restrictions")
  private PaymentsConfigurationRestrictions restrictions = null;

  public PaymentsConfigurationCOD acceptCod(Boolean acceptCod) {
    this.acceptCod = acceptCod;
    return this;
  }

   /**
   * Get acceptCod
   * @return acceptCod
  **/
  @ApiModelProperty(value = "")
  public Boolean isAcceptCod() {
    return acceptCod;
  }

  public void setAcceptCod(Boolean acceptCod) {
    this.acceptCod = acceptCod;
  }

  public PaymentsConfigurationCOD codApprovedCustomersOnly(Boolean codApprovedCustomersOnly) {
    this.codApprovedCustomersOnly = codApprovedCustomersOnly;
    return this;
  }

   /**
   * Get codApprovedCustomersOnly
   * @return codApprovedCustomersOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isCodApprovedCustomersOnly() {
    return codApprovedCustomersOnly;
  }

  public void setCodApprovedCustomersOnly(Boolean codApprovedCustomersOnly) {
    this.codApprovedCustomersOnly = codApprovedCustomersOnly;
  }

  public PaymentsConfigurationCOD codSurchargeAccountingCode(String codSurchargeAccountingCode) {
    this.codSurchargeAccountingCode = codSurchargeAccountingCode;
    return this;
  }

   /**
   * Get codSurchargeAccountingCode
   * @return codSurchargeAccountingCode
  **/
  @ApiModelProperty(value = "")
  public String getCodSurchargeAccountingCode() {
    return codSurchargeAccountingCode;
  }

  public void setCodSurchargeAccountingCode(String codSurchargeAccountingCode) {
    this.codSurchargeAccountingCode = codSurchargeAccountingCode;
  }

  public PaymentsConfigurationCOD codSurchargeFee(String codSurchargeFee) {
    this.codSurchargeFee = codSurchargeFee;
    return this;
  }

   /**
   * Get codSurchargeFee
   * @return codSurchargeFee
  **/
  @ApiModelProperty(value = "")
  public String getCodSurchargeFee() {
    return codSurchargeFee;
  }

  public void setCodSurchargeFee(String codSurchargeFee) {
    this.codSurchargeFee = codSurchargeFee;
  }

  public PaymentsConfigurationCOD codSurchargePerc(String codSurchargePerc) {
    this.codSurchargePerc = codSurchargePerc;
    return this;
  }

   /**
   * Get codSurchargePerc
   * @return codSurchargePerc
  **/
  @ApiModelProperty(value = "")
  public String getCodSurchargePerc() {
    return codSurchargePerc;
  }

  public void setCodSurchargePerc(String codSurchargePerc) {
    this.codSurchargePerc = codSurchargePerc;
  }

  public PaymentsConfigurationCOD restrictions(PaymentsConfigurationRestrictions restrictions) {
    this.restrictions = restrictions;
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @ApiModelProperty(value = "")
  public PaymentsConfigurationRestrictions getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(PaymentsConfigurationRestrictions restrictions) {
    this.restrictions = restrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsConfigurationCOD paymentsConfigurationCOD = (PaymentsConfigurationCOD) o;
    return Objects.equals(this.acceptCod, paymentsConfigurationCOD.acceptCod) &&
        Objects.equals(this.codApprovedCustomersOnly, paymentsConfigurationCOD.codApprovedCustomersOnly) &&
        Objects.equals(this.codSurchargeAccountingCode, paymentsConfigurationCOD.codSurchargeAccountingCode) &&
        Objects.equals(this.codSurchargeFee, paymentsConfigurationCOD.codSurchargeFee) &&
        Objects.equals(this.codSurchargePerc, paymentsConfigurationCOD.codSurchargePerc) &&
        Objects.equals(this.restrictions, paymentsConfigurationCOD.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptCod, codApprovedCustomersOnly, codSurchargeAccountingCode, codSurchargeFee, codSurchargePerc, restrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsConfigurationCOD {\n");
    
    sb.append("    acceptCod: ").append(toIndentedString(acceptCod)).append("\n");
    sb.append("    codApprovedCustomersOnly: ").append(toIndentedString(codApprovedCustomersOnly)).append("\n");
    sb.append("    codSurchargeAccountingCode: ").append(toIndentedString(codSurchargeAccountingCode)).append("\n");
    sb.append("    codSurchargeFee: ").append(toIndentedString(codSurchargeFee)).append("\n");
    sb.append("    codSurchargePerc: ").append(toIndentedString(codSurchargePerc)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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
