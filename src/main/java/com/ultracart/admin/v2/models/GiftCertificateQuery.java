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
 * GiftCertificateQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class GiftCertificateQuery {
  @SerializedName("code")
  private String code = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("expiration_dts_end")
  private String expirationDtsEnd = null;

  @SerializedName("expiration_dts_start")
  private String expirationDtsStart = null;

  @SerializedName("original_balance_end")
  private BigDecimal originalBalanceEnd = null;

  @SerializedName("original_balance_start")
  private BigDecimal originalBalanceStart = null;

  @SerializedName("reference_order_id")
  private String referenceOrderId = null;

  @SerializedName("remaining_balance_end")
  private BigDecimal remainingBalanceEnd = null;

  @SerializedName("remaining_balance_start")
  private BigDecimal remainingBalanceStart = null;

  public GiftCertificateQuery code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Gift certificate code
   * @return code
  **/
  @ApiModelProperty(value = "Gift certificate code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GiftCertificateQuery email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of this gift certificate
   * @return email
  **/
  @ApiModelProperty(value = "Email address of this gift certificate")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public GiftCertificateQuery expirationDtsEnd(String expirationDtsEnd) {
    this.expirationDtsEnd = expirationDtsEnd;
    return this;
  }

   /**
   * Expiration date end
   * @return expirationDtsEnd
  **/
  @ApiModelProperty(value = "Expiration date end")
  public String getExpirationDtsEnd() {
    return expirationDtsEnd;
  }

  public void setExpirationDtsEnd(String expirationDtsEnd) {
    this.expirationDtsEnd = expirationDtsEnd;
  }

  public GiftCertificateQuery expirationDtsStart(String expirationDtsStart) {
    this.expirationDtsStart = expirationDtsStart;
    return this;
  }

   /**
   * Expiration date start
   * @return expirationDtsStart
  **/
  @ApiModelProperty(value = "Expiration date start")
  public String getExpirationDtsStart() {
    return expirationDtsStart;
  }

  public void setExpirationDtsStart(String expirationDtsStart) {
    this.expirationDtsStart = expirationDtsStart;
  }

  public GiftCertificateQuery originalBalanceEnd(BigDecimal originalBalanceEnd) {
    this.originalBalanceEnd = originalBalanceEnd;
    return this;
  }

   /**
   * Original balance end
   * @return originalBalanceEnd
  **/
  @ApiModelProperty(value = "Original balance end")
  public BigDecimal getOriginalBalanceEnd() {
    return originalBalanceEnd;
  }

  public void setOriginalBalanceEnd(BigDecimal originalBalanceEnd) {
    this.originalBalanceEnd = originalBalanceEnd;
  }

  public GiftCertificateQuery originalBalanceStart(BigDecimal originalBalanceStart) {
    this.originalBalanceStart = originalBalanceStart;
    return this;
  }

   /**
   * Original balance start
   * @return originalBalanceStart
  **/
  @ApiModelProperty(value = "Original balance start")
  public BigDecimal getOriginalBalanceStart() {
    return originalBalanceStart;
  }

  public void setOriginalBalanceStart(BigDecimal originalBalanceStart) {
    this.originalBalanceStart = originalBalanceStart;
  }

  public GiftCertificateQuery referenceOrderId(String referenceOrderId) {
    this.referenceOrderId = referenceOrderId;
    return this;
  }

   /**
   * Gift certificate reference order id
   * @return referenceOrderId
  **/
  @ApiModelProperty(value = "Gift certificate reference order id")
  public String getReferenceOrderId() {
    return referenceOrderId;
  }

  public void setReferenceOrderId(String referenceOrderId) {
    this.referenceOrderId = referenceOrderId;
  }

  public GiftCertificateQuery remainingBalanceEnd(BigDecimal remainingBalanceEnd) {
    this.remainingBalanceEnd = remainingBalanceEnd;
    return this;
  }

   /**
   * Remaining balance end
   * @return remainingBalanceEnd
  **/
  @ApiModelProperty(value = "Remaining balance end")
  public BigDecimal getRemainingBalanceEnd() {
    return remainingBalanceEnd;
  }

  public void setRemainingBalanceEnd(BigDecimal remainingBalanceEnd) {
    this.remainingBalanceEnd = remainingBalanceEnd;
  }

  public GiftCertificateQuery remainingBalanceStart(BigDecimal remainingBalanceStart) {
    this.remainingBalanceStart = remainingBalanceStart;
    return this;
  }

   /**
   * Remaining balance start
   * @return remainingBalanceStart
  **/
  @ApiModelProperty(value = "Remaining balance start")
  public BigDecimal getRemainingBalanceStart() {
    return remainingBalanceStart;
  }

  public void setRemainingBalanceStart(BigDecimal remainingBalanceStart) {
    this.remainingBalanceStart = remainingBalanceStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GiftCertificateQuery giftCertificateQuery = (GiftCertificateQuery) o;
    return Objects.equals(this.code, giftCertificateQuery.code) &&
        Objects.equals(this.email, giftCertificateQuery.email) &&
        Objects.equals(this.expirationDtsEnd, giftCertificateQuery.expirationDtsEnd) &&
        Objects.equals(this.expirationDtsStart, giftCertificateQuery.expirationDtsStart) &&
        Objects.equals(this.originalBalanceEnd, giftCertificateQuery.originalBalanceEnd) &&
        Objects.equals(this.originalBalanceStart, giftCertificateQuery.originalBalanceStart) &&
        Objects.equals(this.referenceOrderId, giftCertificateQuery.referenceOrderId) &&
        Objects.equals(this.remainingBalanceEnd, giftCertificateQuery.remainingBalanceEnd) &&
        Objects.equals(this.remainingBalanceStart, giftCertificateQuery.remainingBalanceStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, email, expirationDtsEnd, expirationDtsStart, originalBalanceEnd, originalBalanceStart, referenceOrderId, remainingBalanceEnd, remainingBalanceStart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GiftCertificateQuery {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    expirationDtsEnd: ").append(toIndentedString(expirationDtsEnd)).append("\n");
    sb.append("    expirationDtsStart: ").append(toIndentedString(expirationDtsStart)).append("\n");
    sb.append("    originalBalanceEnd: ").append(toIndentedString(originalBalanceEnd)).append("\n");
    sb.append("    originalBalanceStart: ").append(toIndentedString(originalBalanceStart)).append("\n");
    sb.append("    referenceOrderId: ").append(toIndentedString(referenceOrderId)).append("\n");
    sb.append("    remainingBalanceEnd: ").append(toIndentedString(remainingBalanceEnd)).append("\n");
    sb.append("    remainingBalanceStart: ").append(toIndentedString(remainingBalanceStart)).append("\n");
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

