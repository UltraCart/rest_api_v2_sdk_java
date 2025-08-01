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
 * CartItemProperty
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class CartItemProperty {
  public static final String SERIALIZED_NAME_DISPLAY = "display";
  @SerializedName(SERIALIZED_NAME_DISPLAY)
  private Boolean display;

  public static final String SERIALIZED_NAME_EXPIRATION_DTS = "expiration_dts";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DTS)
  private String expirationDts;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public CartItemProperty() { 
  }

  public CartItemProperty display(Boolean display) {
    
    this.display = display;
    return this;
  }

   /**
   * True if this property is displayed to the customer
   * @return display
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this property is displayed to the customer")

  public Boolean getDisplay() {
    return display;
  }


  public void setDisplay(Boolean display) {
    this.display = display;
  }


  public CartItemProperty expirationDts(String expirationDts) {
    
    this.expirationDts = expirationDts;
    return this;
  }

   /**
   * The date/time that the property expires and is deleted
   * @return expirationDts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date/time that the property expires and is deleted")

  public String getExpirationDts() {
    return expirationDts;
  }


  public void setExpirationDts(String expirationDts) {
    this.expirationDts = expirationDts;
  }


  public CartItemProperty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CartItemProperty value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartItemProperty cartItemProperty = (CartItemProperty) o;
    return Objects.equals(this.display, cartItemProperty.display) &&
        Objects.equals(this.expirationDts, cartItemProperty.expirationDts) &&
        Objects.equals(this.name, cartItemProperty.name) &&
        Objects.equals(this.value, cartItemProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, expirationDts, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemProperty {\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    expirationDts: ").append(toIndentedString(expirationDts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("display");
    openapiFields.add("expiration_dts");
    openapiFields.add("name");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CartItemProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CartItemProperty.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartItemProperty is not found in the empty JSON string", CartItemProperty.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CartItemProperty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartItemProperty` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("expiration_dts") != null && !jsonObj.get("expiration_dts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_dts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_dts").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartItemProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartItemProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartItemProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartItemProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<CartItemProperty>() {
           @Override
           public void write(JsonWriter out, CartItemProperty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartItemProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartItemProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartItemProperty
  * @throws IOException if the JSON string is invalid with respect to CartItemProperty
  */
  public static CartItemProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartItemProperty.class);
  }

 /**
  * Convert an instance of CartItemProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

