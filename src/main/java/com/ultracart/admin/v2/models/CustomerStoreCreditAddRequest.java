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
 * CustomerStoreCreditAddRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class CustomerStoreCreditAddRequest {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXPIRATION_DAYS = "expiration_days";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DAYS)
  private Integer expirationDays;

  public static final String SERIALIZED_NAME_VESTING_DAYS = "vesting_days";
  @SerializedName(SERIALIZED_NAME_VESTING_DAYS)
  private Integer vestingDays;

  public CustomerStoreCreditAddRequest() { 
  }

  public CustomerStoreCreditAddRequest amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Amount of store credit
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of store credit")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public CustomerStoreCreditAddRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description or reason for the store credit
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description or reason for the store credit")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomerStoreCreditAddRequest expirationDays(Integer expirationDays) {
    
    this.expirationDays = expirationDays;
    return this;
  }

   /**
   * Optional days for store credit to expire or zero for no expiration
   * @return expirationDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional days for store credit to expire or zero for no expiration")

  public Integer getExpirationDays() {
    return expirationDays;
  }


  public void setExpirationDays(Integer expirationDays) {
    this.expirationDays = expirationDays;
  }


  public CustomerStoreCreditAddRequest vestingDays(Integer vestingDays) {
    
    this.vestingDays = vestingDays;
    return this;
  }

   /**
   * Optional days for store credit to vesting or zero for immediately available
   * @return vestingDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional days for store credit to vesting or zero for immediately available")

  public Integer getVestingDays() {
    return vestingDays;
  }


  public void setVestingDays(Integer vestingDays) {
    this.vestingDays = vestingDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerStoreCreditAddRequest customerStoreCreditAddRequest = (CustomerStoreCreditAddRequest) o;
    return Objects.equals(this.amount, customerStoreCreditAddRequest.amount) &&
        Objects.equals(this.description, customerStoreCreditAddRequest.description) &&
        Objects.equals(this.expirationDays, customerStoreCreditAddRequest.expirationDays) &&
        Objects.equals(this.vestingDays, customerStoreCreditAddRequest.vestingDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, description, expirationDays, vestingDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerStoreCreditAddRequest {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationDays: ").append(toIndentedString(expirationDays)).append("\n");
    sb.append("    vestingDays: ").append(toIndentedString(vestingDays)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("expiration_days");
    openapiFields.add("vesting_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerStoreCreditAddRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerStoreCreditAddRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerStoreCreditAddRequest is not found in the empty JSON string", CustomerStoreCreditAddRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerStoreCreditAddRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerStoreCreditAddRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerStoreCreditAddRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerStoreCreditAddRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerStoreCreditAddRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerStoreCreditAddRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerStoreCreditAddRequest>() {
           @Override
           public void write(JsonWriter out, CustomerStoreCreditAddRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerStoreCreditAddRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerStoreCreditAddRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerStoreCreditAddRequest
  * @throws IOException if the JSON string is invalid with respect to CustomerStoreCreditAddRequest
  */
  public static CustomerStoreCreditAddRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerStoreCreditAddRequest.class);
  }

 /**
  * Convert an instance of CustomerStoreCreditAddRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

