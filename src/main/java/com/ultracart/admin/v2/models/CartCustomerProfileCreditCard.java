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
 * CartCustomerProfileCreditCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CartCustomerProfileCreditCard {
  @SerializedName("card_expiration_month")
  private Integer cardExpirationMonth = null;

  @SerializedName("card_expiration_year")
  private Integer cardExpirationYear = null;

  @SerializedName("card_number")
  private String cardNumber = null;

  /**
   * Card type
   */
  @JsonAdapter(CardTypeEnum.Adapter.class)
  public enum CardTypeEnum {
    AMEX("AMEX"),
    
    DINERS_CLUB("Diners Club"),
    
    DISCOVER("Discover"),
    
    MASTERCARD("MasterCard"),
    
    JCB("JCB"),
    
    VISA("VISA");

    private String value;

    CardTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardTypeEnum fromValue(String text) {
      for (CardTypeEnum b : CardTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CardTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CardTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("card_type")
  private CardTypeEnum cardType = null;

  @SerializedName("customer_profile_credit_card_id")
  private Integer customerProfileCreditCardId = null;

  @SerializedName("last_used_date")
  private String lastUsedDate = null;

  public CartCustomerProfileCreditCard cardExpirationMonth(Integer cardExpirationMonth) {
    this.cardExpirationMonth = cardExpirationMonth;
    return this;
  }

   /**
   * Card expiration month (1-12)
   * @return cardExpirationMonth
  **/
  @ApiModelProperty(value = "Card expiration month (1-12)")
  public Integer getCardExpirationMonth() {
    return cardExpirationMonth;
  }

  public void setCardExpirationMonth(Integer cardExpirationMonth) {
    this.cardExpirationMonth = cardExpirationMonth;
  }

  public CartCustomerProfileCreditCard cardExpirationYear(Integer cardExpirationYear) {
    this.cardExpirationYear = cardExpirationYear;
    return this;
  }

   /**
   * Card expiration year (four digit)
   * @return cardExpirationYear
  **/
  @ApiModelProperty(value = "Card expiration year (four digit)")
  public Integer getCardExpirationYear() {
    return cardExpirationYear;
  }

  public void setCardExpirationYear(Integer cardExpirationYear) {
    this.cardExpirationYear = cardExpirationYear;
  }

  public CartCustomerProfileCreditCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Card number (masked last 4 digits)
   * @return cardNumber
  **/
  @ApiModelProperty(value = "Card number (masked last 4 digits)")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public CartCustomerProfileCreditCard cardType(CardTypeEnum cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Card type
   * @return cardType
  **/
  @ApiModelProperty(value = "Card type")
  public CardTypeEnum getCardType() {
    return cardType;
  }

  public void setCardType(CardTypeEnum cardType) {
    this.cardType = cardType;
  }

  public CartCustomerProfileCreditCard customerProfileCreditCardId(Integer customerProfileCreditCardId) {
    this.customerProfileCreditCardId = customerProfileCreditCardId;
    return this;
  }

   /**
   * Unique identifier for this stored card
   * @return customerProfileCreditCardId
  **/
  @ApiModelProperty(value = "Unique identifier for this stored card")
  public Integer getCustomerProfileCreditCardId() {
    return customerProfileCreditCardId;
  }

  public void setCustomerProfileCreditCardId(Integer customerProfileCreditCardId) {
    this.customerProfileCreditCardId = customerProfileCreditCardId;
  }

  public CartCustomerProfileCreditCard lastUsedDate(String lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
    return this;
  }

   /**
   * Last used
   * @return lastUsedDate
  **/
  @ApiModelProperty(value = "Last used")
  public String getLastUsedDate() {
    return lastUsedDate;
  }

  public void setLastUsedDate(String lastUsedDate) {
    this.lastUsedDate = lastUsedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartCustomerProfileCreditCard cartCustomerProfileCreditCard = (CartCustomerProfileCreditCard) o;
    return Objects.equals(this.cardExpirationMonth, cartCustomerProfileCreditCard.cardExpirationMonth) &&
        Objects.equals(this.cardExpirationYear, cartCustomerProfileCreditCard.cardExpirationYear) &&
        Objects.equals(this.cardNumber, cartCustomerProfileCreditCard.cardNumber) &&
        Objects.equals(this.cardType, cartCustomerProfileCreditCard.cardType) &&
        Objects.equals(this.customerProfileCreditCardId, cartCustomerProfileCreditCard.customerProfileCreditCardId) &&
        Objects.equals(this.lastUsedDate, cartCustomerProfileCreditCard.lastUsedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardExpirationMonth, cardExpirationYear, cardNumber, cardType, customerProfileCreditCardId, lastUsedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartCustomerProfileCreditCard {\n");
    
    sb.append("    cardExpirationMonth: ").append(toIndentedString(cardExpirationMonth)).append("\n");
    sb.append("    cardExpirationYear: ").append(toIndentedString(cardExpirationYear)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    customerProfileCreditCardId: ").append(toIndentedString(customerProfileCreditCardId)).append("\n");
    sb.append("    lastUsedDate: ").append(toIndentedString(lastUsedDate)).append("\n");
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

