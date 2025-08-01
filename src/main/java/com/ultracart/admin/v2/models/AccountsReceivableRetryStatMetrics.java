/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ultracart.admin.v2.util.JSON;

/**
 * AccountsReceivableRetryStatMetrics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class AccountsReceivableRetryStatMetrics {
  public static final String SERIALIZED_NAME_ATTEMPTS = "attempts";
  @SerializedName(SERIALIZED_NAME_ATTEMPTS)
  private Integer attempts;

  public static final String SERIALIZED_NAME_ATTEMPTS_FORMATTED = "attempts_formatted";
  @SerializedName(SERIALIZED_NAME_ATTEMPTS_FORMATTED)
  private String attemptsFormatted;

  public static final String SERIALIZED_NAME_CONVERSION_RATE = "conversion_rate";
  @SerializedName(SERIALIZED_NAME_CONVERSION_RATE)
  private BigDecimal conversionRate;

  public static final String SERIALIZED_NAME_CONVERSION_RATE_FORMATTED = "conversion_rate_formatted";
  @SerializedName(SERIALIZED_NAME_CONVERSION_RATE_FORMATTED)
  private String conversionRateFormatted;

  public static final String SERIALIZED_NAME_DAY = "day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private Integer day;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private BigDecimal discounts;

  public static final String SERIALIZED_NAME_DISCOUNTS_FORMATTED = "discounts_formatted";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS_FORMATTED)
  private String discountsFormatted;

  public static final String SERIALIZED_NAME_REVENUE = "revenue";
  @SerializedName(SERIALIZED_NAME_REVENUE)
  private BigDecimal revenue;

  public static final String SERIALIZED_NAME_REVENUE_FORMATTED = "revenue_formatted";
  @SerializedName(SERIALIZED_NAME_REVENUE_FORMATTED)
  private String revenueFormatted;

  public static final String SERIALIZED_NAME_SUCCESSES = "successes";
  @SerializedName(SERIALIZED_NAME_SUCCESSES)
  private Integer successes;

  public static final String SERIALIZED_NAME_SUCCESSES_FORMATTED = "successes_formatted";
  @SerializedName(SERIALIZED_NAME_SUCCESSES_FORMATTED)
  private String successesFormatted;

  public AccountsReceivableRetryStatMetrics() { 
  }

  public AccountsReceivableRetryStatMetrics attempts(Integer attempts) {
    
    this.attempts = attempts;
    return this;
  }

   /**
   * Get attempts
   * @return attempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAttempts() {
    return attempts;
  }


  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }


  public AccountsReceivableRetryStatMetrics attemptsFormatted(String attemptsFormatted) {
    
    this.attemptsFormatted = attemptsFormatted;
    return this;
  }

   /**
   * Get attemptsFormatted
   * @return attemptsFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttemptsFormatted() {
    return attemptsFormatted;
  }


  public void setAttemptsFormatted(String attemptsFormatted) {
    this.attemptsFormatted = attemptsFormatted;
  }


  public AccountsReceivableRetryStatMetrics conversionRate(BigDecimal conversionRate) {
    
    this.conversionRate = conversionRate;
    return this;
  }

   /**
   * Get conversionRate
   * @return conversionRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getConversionRate() {
    return conversionRate;
  }


  public void setConversionRate(BigDecimal conversionRate) {
    this.conversionRate = conversionRate;
  }


  public AccountsReceivableRetryStatMetrics conversionRateFormatted(String conversionRateFormatted) {
    
    this.conversionRateFormatted = conversionRateFormatted;
    return this;
  }

   /**
   * Get conversionRateFormatted
   * @return conversionRateFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConversionRateFormatted() {
    return conversionRateFormatted;
  }


  public void setConversionRateFormatted(String conversionRateFormatted) {
    this.conversionRateFormatted = conversionRateFormatted;
  }


  public AccountsReceivableRetryStatMetrics day(Integer day) {
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDay() {
    return day;
  }


  public void setDay(Integer day) {
    this.day = day;
  }


  public AccountsReceivableRetryStatMetrics discounts(BigDecimal discounts) {
    
    this.discounts = discounts;
    return this;
  }

   /**
   * Get discounts
   * @return discounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDiscounts() {
    return discounts;
  }


  public void setDiscounts(BigDecimal discounts) {
    this.discounts = discounts;
  }


  public AccountsReceivableRetryStatMetrics discountsFormatted(String discountsFormatted) {
    
    this.discountsFormatted = discountsFormatted;
    return this;
  }

   /**
   * Get discountsFormatted
   * @return discountsFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDiscountsFormatted() {
    return discountsFormatted;
  }


  public void setDiscountsFormatted(String discountsFormatted) {
    this.discountsFormatted = discountsFormatted;
  }


  public AccountsReceivableRetryStatMetrics revenue(BigDecimal revenue) {
    
    this.revenue = revenue;
    return this;
  }

   /**
   * Get revenue
   * @return revenue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRevenue() {
    return revenue;
  }


  public void setRevenue(BigDecimal revenue) {
    this.revenue = revenue;
  }


  public AccountsReceivableRetryStatMetrics revenueFormatted(String revenueFormatted) {
    
    this.revenueFormatted = revenueFormatted;
    return this;
  }

   /**
   * Get revenueFormatted
   * @return revenueFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRevenueFormatted() {
    return revenueFormatted;
  }


  public void setRevenueFormatted(String revenueFormatted) {
    this.revenueFormatted = revenueFormatted;
  }


  public AccountsReceivableRetryStatMetrics successes(Integer successes) {
    
    this.successes = successes;
    return this;
  }

   /**
   * Get successes
   * @return successes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSuccesses() {
    return successes;
  }


  public void setSuccesses(Integer successes) {
    this.successes = successes;
  }


  public AccountsReceivableRetryStatMetrics successesFormatted(String successesFormatted) {
    
    this.successesFormatted = successesFormatted;
    return this;
  }

   /**
   * Get successesFormatted
   * @return successesFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSuccessesFormatted() {
    return successesFormatted;
  }


  public void setSuccessesFormatted(String successesFormatted) {
    this.successesFormatted = successesFormatted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsReceivableRetryStatMetrics accountsReceivableRetryStatMetrics = (AccountsReceivableRetryStatMetrics) o;
    return Objects.equals(this.attempts, accountsReceivableRetryStatMetrics.attempts) &&
        Objects.equals(this.attemptsFormatted, accountsReceivableRetryStatMetrics.attemptsFormatted) &&
        Objects.equals(this.conversionRate, accountsReceivableRetryStatMetrics.conversionRate) &&
        Objects.equals(this.conversionRateFormatted, accountsReceivableRetryStatMetrics.conversionRateFormatted) &&
        Objects.equals(this.day, accountsReceivableRetryStatMetrics.day) &&
        Objects.equals(this.discounts, accountsReceivableRetryStatMetrics.discounts) &&
        Objects.equals(this.discountsFormatted, accountsReceivableRetryStatMetrics.discountsFormatted) &&
        Objects.equals(this.revenue, accountsReceivableRetryStatMetrics.revenue) &&
        Objects.equals(this.revenueFormatted, accountsReceivableRetryStatMetrics.revenueFormatted) &&
        Objects.equals(this.successes, accountsReceivableRetryStatMetrics.successes) &&
        Objects.equals(this.successesFormatted, accountsReceivableRetryStatMetrics.successesFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attempts, attemptsFormatted, conversionRate, conversionRateFormatted, day, discounts, discountsFormatted, revenue, revenueFormatted, successes, successesFormatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsReceivableRetryStatMetrics {\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
    sb.append("    attemptsFormatted: ").append(toIndentedString(attemptsFormatted)).append("\n");
    sb.append("    conversionRate: ").append(toIndentedString(conversionRate)).append("\n");
    sb.append("    conversionRateFormatted: ").append(toIndentedString(conversionRateFormatted)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    discountsFormatted: ").append(toIndentedString(discountsFormatted)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    revenueFormatted: ").append(toIndentedString(revenueFormatted)).append("\n");
    sb.append("    successes: ").append(toIndentedString(successes)).append("\n");
    sb.append("    successesFormatted: ").append(toIndentedString(successesFormatted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("attempts");
    openapiFields.add("attempts_formatted");
    openapiFields.add("conversion_rate");
    openapiFields.add("conversion_rate_formatted");
    openapiFields.add("day");
    openapiFields.add("discounts");
    openapiFields.add("discounts_formatted");
    openapiFields.add("revenue");
    openapiFields.add("revenue_formatted");
    openapiFields.add("successes");
    openapiFields.add("successes_formatted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccountsReceivableRetryStatMetrics
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccountsReceivableRetryStatMetrics.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccountsReceivableRetryStatMetrics is not found in the empty JSON string", AccountsReceivableRetryStatMetrics.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccountsReceivableRetryStatMetrics.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccountsReceivableRetryStatMetrics` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("attempts_formatted") != null && !jsonObj.get("attempts_formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attempts_formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attempts_formatted").toString()));
      }
      if (jsonObj.get("conversion_rate_formatted") != null && !jsonObj.get("conversion_rate_formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `conversion_rate_formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("conversion_rate_formatted").toString()));
      }
      if (jsonObj.get("discounts_formatted") != null && !jsonObj.get("discounts_formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discounts_formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discounts_formatted").toString()));
      }
      if (jsonObj.get("revenue_formatted") != null && !jsonObj.get("revenue_formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revenue_formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revenue_formatted").toString()));
      }
      if (jsonObj.get("successes_formatted") != null && !jsonObj.get("successes_formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `successes_formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("successes_formatted").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountsReceivableRetryStatMetrics.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountsReceivableRetryStatMetrics' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountsReceivableRetryStatMetrics> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountsReceivableRetryStatMetrics.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountsReceivableRetryStatMetrics>() {
           @Override
           public void write(JsonWriter out, AccountsReceivableRetryStatMetrics value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountsReceivableRetryStatMetrics read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountsReceivableRetryStatMetrics given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountsReceivableRetryStatMetrics
  * @throws IOException if the JSON string is invalid with respect to AccountsReceivableRetryStatMetrics
  */
  public static AccountsReceivableRetryStatMetrics fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountsReceivableRetryStatMetrics.class);
  }

 /**
  * Convert an instance of AccountsReceivableRetryStatMetrics to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

