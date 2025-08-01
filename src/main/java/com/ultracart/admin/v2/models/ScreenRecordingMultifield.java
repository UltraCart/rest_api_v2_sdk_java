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
 * ScreenRecordingMultifield
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ScreenRecordingMultifield {
  public static final String SERIALIZED_NAME_BD = "bd";
  @SerializedName(SERIALIZED_NAME_BD)
  private BigDecimal bd;

  public static final String SERIALIZED_NAME_BOOL = "bool";
  @SerializedName(SERIALIZED_NAME_BOOL)
  private Boolean bool;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private String json;

  public static final String SERIALIZED_NAME_NUM = "num";
  @SerializedName(SERIALIZED_NAME_NUM)
  private Long num;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public ScreenRecordingMultifield() { 
  }

  public ScreenRecordingMultifield bd(BigDecimal bd) {
    
    this.bd = bd;
    return this;
  }

   /**
   * Get bd
   * @return bd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBd() {
    return bd;
  }


  public void setBd(BigDecimal bd) {
    this.bd = bd;
  }


  public ScreenRecordingMultifield bool(Boolean bool) {
    
    this.bool = bool;
    return this;
  }

   /**
   * Get bool
   * @return bool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBool() {
    return bool;
  }


  public void setBool(Boolean bool) {
    this.bool = bool;
  }


  public ScreenRecordingMultifield json(String json) {
    
    this.json = json;
    return this;
  }

   /**
   * Get json
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJson() {
    return json;
  }


  public void setJson(String json) {
    this.json = json;
  }


  public ScreenRecordingMultifield num(Long num) {
    
    this.num = num;
    return this;
  }

   /**
   * Get num
   * @return num
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getNum() {
    return num;
  }


  public void setNum(Long num) {
    this.num = num;
  }


  public ScreenRecordingMultifield text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingMultifield screenRecordingMultifield = (ScreenRecordingMultifield) o;
    return Objects.equals(this.bd, screenRecordingMultifield.bd) &&
        Objects.equals(this.bool, screenRecordingMultifield.bool) &&
        Objects.equals(this.json, screenRecordingMultifield.json) &&
        Objects.equals(this.num, screenRecordingMultifield.num) &&
        Objects.equals(this.text, screenRecordingMultifield.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bd, bool, json, num, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingMultifield {\n");
    sb.append("    bd: ").append(toIndentedString(bd)).append("\n");
    sb.append("    bool: ").append(toIndentedString(bool)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    num: ").append(toIndentedString(num)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("bd");
    openapiFields.add("bool");
    openapiFields.add("json");
    openapiFields.add("num");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScreenRecordingMultifield
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ScreenRecordingMultifield.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScreenRecordingMultifield is not found in the empty JSON string", ScreenRecordingMultifield.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ScreenRecordingMultifield.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScreenRecordingMultifield` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("json") != null && !jsonObj.get("json").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `json` to be a primitive type in the JSON string but got `%s`", jsonObj.get("json").toString()));
      }
      if (jsonObj.get("text") != null && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScreenRecordingMultifield.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScreenRecordingMultifield' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScreenRecordingMultifield> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScreenRecordingMultifield.class));

       return (TypeAdapter<T>) new TypeAdapter<ScreenRecordingMultifield>() {
           @Override
           public void write(JsonWriter out, ScreenRecordingMultifield value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScreenRecordingMultifield read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScreenRecordingMultifield given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScreenRecordingMultifield
  * @throws IOException if the JSON string is invalid with respect to ScreenRecordingMultifield
  */
  public static ScreenRecordingMultifield fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScreenRecordingMultifield.class);
  }

 /**
  * Convert an instance of ScreenRecordingMultifield to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

