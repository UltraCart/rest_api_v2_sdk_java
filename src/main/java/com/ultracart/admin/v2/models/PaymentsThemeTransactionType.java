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
 * PaymentsThemeTransactionType
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-29T10:39:55.223-04:00")



public class PaymentsThemeTransactionType {
  @SerializedName("code")
  private String code = null;

  /**
   * The credit card transaction type for this theme
   */
  @JsonAdapter(CreditCardTransactionTypeEnum.Adapter.class)
  public enum CreditCardTransactionTypeEnum {
    AND_CAPTURE("auth and capture"),
    
    THEN_CAPTURE("auth then capture"),
    
    ONLY("auth only");

    private String value;

    CreditCardTransactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreditCardTransactionTypeEnum fromValue(String text) {
      for (CreditCardTransactionTypeEnum b : CreditCardTransactionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CreditCardTransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreditCardTransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreditCardTransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CreditCardTransactionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("credit_card_transaction_type")
  private CreditCardTransactionTypeEnum creditCardTransactionType = null;

  @SerializedName("screen_branding_theme_oid")
  private Integer screenBrandingThemeOid = null;

  public PaymentsThemeTransactionType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * External human readable identifier for a theme
   * @return code
  **/
  @ApiModelProperty(value = "External human readable identifier for a theme")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PaymentsThemeTransactionType creditCardTransactionType(CreditCardTransactionTypeEnum creditCardTransactionType) {
    this.creditCardTransactionType = creditCardTransactionType;
    return this;
  }

   /**
   * The credit card transaction type for this theme
   * @return creditCardTransactionType
  **/
  @ApiModelProperty(value = "The credit card transaction type for this theme")
  public CreditCardTransactionTypeEnum getCreditCardTransactionType() {
    return creditCardTransactionType;
  }

  public void setCreditCardTransactionType(CreditCardTransactionTypeEnum creditCardTransactionType) {
    this.creditCardTransactionType = creditCardTransactionType;
  }

  public PaymentsThemeTransactionType screenBrandingThemeOid(Integer screenBrandingThemeOid) {
    this.screenBrandingThemeOid = screenBrandingThemeOid;
    return this;
  }

   /**
   * Internal identifier for a theme
   * @return screenBrandingThemeOid
  **/
  @ApiModelProperty(value = "Internal identifier for a theme")
  public Integer getScreenBrandingThemeOid() {
    return screenBrandingThemeOid;
  }

  public void setScreenBrandingThemeOid(Integer screenBrandingThemeOid) {
    this.screenBrandingThemeOid = screenBrandingThemeOid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsThemeTransactionType paymentsThemeTransactionType = (PaymentsThemeTransactionType) o;
    return Objects.equals(this.code, paymentsThemeTransactionType.code) &&
        Objects.equals(this.creditCardTransactionType, paymentsThemeTransactionType.creditCardTransactionType) &&
        Objects.equals(this.screenBrandingThemeOid, paymentsThemeTransactionType.screenBrandingThemeOid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, creditCardTransactionType, screenBrandingThemeOid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsThemeTransactionType {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    creditCardTransactionType: ").append(toIndentedString(creditCardTransactionType)).append("\n");
    sb.append("    screenBrandingThemeOid: ").append(toIndentedString(screenBrandingThemeOid)).append("\n");
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
