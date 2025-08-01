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
import java.util.ArrayList;
import java.util.List;

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
 * EmailCommseqWebhookSendTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class EmailCommseqWebhookSendTestRequest {
  public static final String SERIALIZED_NAME_CART_ID = "cart_id";
  @SerializedName(SERIALIZED_NAME_CART_ID)
  private String cartId;

  public static final String SERIALIZED_NAME_CART_ITEM_IDS = "cart_item_ids";
  @SerializedName(SERIALIZED_NAME_CART_ITEM_IDS)
  private List<String> cartItemIds = null;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ESP_COMMSEQ_STEP_UUID = "esp_commseq_step_uuid";
  @SerializedName(SERIALIZED_NAME_ESP_COMMSEQ_STEP_UUID)
  private String espCommseqStepUuid;

  public static final String SERIALIZED_NAME_ESP_COMMSEQ_UUID = "esp_commseq_uuid";
  @SerializedName(SERIALIZED_NAME_ESP_COMMSEQ_UUID)
  private String espCommseqUuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public EmailCommseqWebhookSendTestRequest() { 
  }

  public EmailCommseqWebhookSendTestRequest cartId(String cartId) {
    
    this.cartId = cartId;
    return this;
  }

   /**
   * Get cartId
   * @return cartId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCartId() {
    return cartId;
  }


  public void setCartId(String cartId) {
    this.cartId = cartId;
  }


  public EmailCommseqWebhookSendTestRequest cartItemIds(List<String> cartItemIds) {
    
    this.cartItemIds = cartItemIds;
    return this;
  }

  public EmailCommseqWebhookSendTestRequest addCartItemIdsItem(String cartItemIdsItem) {
    if (this.cartItemIds == null) {
      this.cartItemIds = new ArrayList<>();
    }
    this.cartItemIds.add(cartItemIdsItem);
    return this;
  }

   /**
   * Get cartItemIds
   * @return cartItemIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCartItemIds() {
    return cartItemIds;
  }


  public void setCartItemIds(List<String> cartItemIds) {
    this.cartItemIds = cartItemIds;
  }


  public EmailCommseqWebhookSendTestRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public EmailCommseqWebhookSendTestRequest espCommseqStepUuid(String espCommseqStepUuid) {
    
    this.espCommseqStepUuid = espCommseqStepUuid;
    return this;
  }

   /**
   * Get espCommseqStepUuid
   * @return espCommseqStepUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEspCommseqStepUuid() {
    return espCommseqStepUuid;
  }


  public void setEspCommseqStepUuid(String espCommseqStepUuid) {
    this.espCommseqStepUuid = espCommseqStepUuid;
  }


  public EmailCommseqWebhookSendTestRequest espCommseqUuid(String espCommseqUuid) {
    
    this.espCommseqUuid = espCommseqUuid;
    return this;
  }

   /**
   * Get espCommseqUuid
   * @return espCommseqUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEspCommseqUuid() {
    return espCommseqUuid;
  }


  public void setEspCommseqUuid(String espCommseqUuid) {
    this.espCommseqUuid = espCommseqUuid;
  }


  public EmailCommseqWebhookSendTestRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EmailCommseqWebhookSendTestRequest orderId(String orderId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailCommseqWebhookSendTestRequest emailCommseqWebhookSendTestRequest = (EmailCommseqWebhookSendTestRequest) o;
    return Objects.equals(this.cartId, emailCommseqWebhookSendTestRequest.cartId) &&
        Objects.equals(this.cartItemIds, emailCommseqWebhookSendTestRequest.cartItemIds) &&
        Objects.equals(this.email, emailCommseqWebhookSendTestRequest.email) &&
        Objects.equals(this.espCommseqStepUuid, emailCommseqWebhookSendTestRequest.espCommseqStepUuid) &&
        Objects.equals(this.espCommseqUuid, emailCommseqWebhookSendTestRequest.espCommseqUuid) &&
        Objects.equals(this.name, emailCommseqWebhookSendTestRequest.name) &&
        Objects.equals(this.orderId, emailCommseqWebhookSendTestRequest.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartId, cartItemIds, email, espCommseqStepUuid, espCommseqUuid, name, orderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCommseqWebhookSendTestRequest {\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    cartItemIds: ").append(toIndentedString(cartItemIds)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    espCommseqStepUuid: ").append(toIndentedString(espCommseqStepUuid)).append("\n");
    sb.append("    espCommseqUuid: ").append(toIndentedString(espCommseqUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
    openapiFields.add("cart_id");
    openapiFields.add("cart_item_ids");
    openapiFields.add("email");
    openapiFields.add("esp_commseq_step_uuid");
    openapiFields.add("esp_commseq_uuid");
    openapiFields.add("name");
    openapiFields.add("order_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailCommseqWebhookSendTestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmailCommseqWebhookSendTestRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailCommseqWebhookSendTestRequest is not found in the empty JSON string", EmailCommseqWebhookSendTestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmailCommseqWebhookSendTestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailCommseqWebhookSendTestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("cart_id") != null && !jsonObj.get("cart_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cart_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cart_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("cart_item_ids") != null && !jsonObj.get("cart_item_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cart_item_ids` to be an array in the JSON string but got `%s`", jsonObj.get("cart_item_ids").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("esp_commseq_step_uuid") != null && !jsonObj.get("esp_commseq_step_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `esp_commseq_step_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("esp_commseq_step_uuid").toString()));
      }
      if (jsonObj.get("esp_commseq_uuid") != null && !jsonObj.get("esp_commseq_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `esp_commseq_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("esp_commseq_uuid").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailCommseqWebhookSendTestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailCommseqWebhookSendTestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailCommseqWebhookSendTestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailCommseqWebhookSendTestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailCommseqWebhookSendTestRequest>() {
           @Override
           public void write(JsonWriter out, EmailCommseqWebhookSendTestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailCommseqWebhookSendTestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailCommseqWebhookSendTestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailCommseqWebhookSendTestRequest
  * @throws IOException if the JSON string is invalid with respect to EmailCommseqWebhookSendTestRequest
  */
  public static EmailCommseqWebhookSendTestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailCommseqWebhookSendTestRequest.class);
  }

 /**
  * Convert an instance of EmailCommseqWebhookSendTestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

