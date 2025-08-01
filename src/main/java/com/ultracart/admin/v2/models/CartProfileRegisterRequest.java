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
import com.ultracart.admin.v2.models.Cart;
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
 * CartProfileRegisterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class CartProfileRegisterRequest {
  public static final String SERIALIZED_NAME_CART = "cart";
  @SerializedName(SERIALIZED_NAME_CART)
  private Cart cart;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public CartProfileRegisterRequest() { 
  }

  public CartProfileRegisterRequest cart(Cart cart) {
    
    this.cart = cart;
    return this;
  }

   /**
   * Get cart
   * @return cart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cart getCart() {
    return cart;
  }


  public void setCart(Cart cart) {
    this.cart = cart;
  }


  public CartProfileRegisterRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password for the profile
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password for the profile")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartProfileRegisterRequest cartProfileRegisterRequest = (CartProfileRegisterRequest) o;
    return Objects.equals(this.cart, cartProfileRegisterRequest.cart) &&
        Objects.equals(this.password, cartProfileRegisterRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cart, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartProfileRegisterRequest {\n");
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("cart");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CartProfileRegisterRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CartProfileRegisterRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartProfileRegisterRequest is not found in the empty JSON string", CartProfileRegisterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CartProfileRegisterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartProfileRegisterRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `cart`
      if (jsonObj.getAsJsonObject("cart") != null) {
        Cart.validateJsonObject(jsonObj.getAsJsonObject("cart"));
      }
      if (jsonObj.get("password") != null && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartProfileRegisterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartProfileRegisterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartProfileRegisterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartProfileRegisterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CartProfileRegisterRequest>() {
           @Override
           public void write(JsonWriter out, CartProfileRegisterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartProfileRegisterRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartProfileRegisterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartProfileRegisterRequest
  * @throws IOException if the JSON string is invalid with respect to CartProfileRegisterRequest
  */
  public static CartProfileRegisterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartProfileRegisterRequest.class);
  }

 /**
  * Convert an instance of CartProfileRegisterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

