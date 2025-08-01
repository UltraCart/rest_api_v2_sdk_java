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
 * OrderReplacementResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class OrderReplacementResponse {
  public static final String SERIALIZED_NAME_CHARGE_SUCCESSFUL = "chargeSuccessful";
  @SerializedName(SERIALIZED_NAME_CHARGE_SUCCESSFUL)
  private Boolean chargeSuccessful;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private String feedback;

  public static final String SERIALIZED_NAME_FREE = "free";
  @SerializedName(SERIALIZED_NAME_FREE)
  private Boolean free;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_SUCCESSFUL = "successful";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL)
  private Boolean successful;

  public OrderReplacementResponse() { 
  }

  public OrderReplacementResponse chargeSuccessful(Boolean chargeSuccessful) {
    
    this.chargeSuccessful = chargeSuccessful;
    return this;
  }

   /**
   * Get chargeSuccessful
   * @return chargeSuccessful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getChargeSuccessful() {
    return chargeSuccessful;
  }


  public void setChargeSuccessful(Boolean chargeSuccessful) {
    this.chargeSuccessful = chargeSuccessful;
  }


  public OrderReplacementResponse errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public OrderReplacementResponse feedback(String feedback) {
    
    this.feedback = feedback;
    return this;
  }

   /**
   * Get feedback
   * @return feedback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeedback() {
    return feedback;
  }


  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }


  public OrderReplacementResponse free(Boolean free) {
    
    this.free = free;
    return this;
  }

   /**
   * Get free
   * @return free
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFree() {
    return free;
  }


  public void setFree(Boolean free) {
    this.free = free;
  }


  public OrderReplacementResponse orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public OrderReplacementResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderReplacementResponse orderReplacementResponse = (OrderReplacementResponse) o;
    return Objects.equals(this.chargeSuccessful, orderReplacementResponse.chargeSuccessful) &&
        Objects.equals(this.errorMessage, orderReplacementResponse.errorMessage) &&
        Objects.equals(this.feedback, orderReplacementResponse.feedback) &&
        Objects.equals(this.free, orderReplacementResponse.free) &&
        Objects.equals(this.orderId, orderReplacementResponse.orderId) &&
        Objects.equals(this.successful, orderReplacementResponse.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeSuccessful, errorMessage, feedback, free, orderId, successful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderReplacementResponse {\n");
    sb.append("    chargeSuccessful: ").append(toIndentedString(chargeSuccessful)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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
    openapiFields.add("chargeSuccessful");
    openapiFields.add("errorMessage");
    openapiFields.add("feedback");
    openapiFields.add("free");
    openapiFields.add("orderId");
    openapiFields.add("successful");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderReplacementResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderReplacementResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderReplacementResponse is not found in the empty JSON string", OrderReplacementResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderReplacementResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderReplacementResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
      if (jsonObj.get("feedback") != null && !jsonObj.get("feedback").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedback` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedback").toString()));
      }
      if (jsonObj.get("orderId") != null && !jsonObj.get("orderId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderReplacementResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderReplacementResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderReplacementResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderReplacementResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderReplacementResponse>() {
           @Override
           public void write(JsonWriter out, OrderReplacementResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderReplacementResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderReplacementResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderReplacementResponse
  * @throws IOException if the JSON string is invalid with respect to OrderReplacementResponse
  */
  public static OrderReplacementResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderReplacementResponse.class);
  }

 /**
  * Convert an instance of OrderReplacementResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

