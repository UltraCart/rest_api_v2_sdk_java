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
 * ConversationCannedMessagesSearch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-13T10:18:15.535-05:00[America/Indianapolis]")
public class ConversationCannedMessagesSearch {
  public static final String SERIALIZED_NAME_MAX_RESULTS = "max_results";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_SHORT_CODE = "short_code";
  @SerializedName(SERIALIZED_NAME_SHORT_CODE)
  private String shortCode;

  public ConversationCannedMessagesSearch() { 
  }

  public ConversationCannedMessagesSearch maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public ConversationCannedMessagesSearch shortCode(String shortCode) {
    
    this.shortCode = shortCode;
    return this;
  }

   /**
   * Get shortCode
   * @return shortCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getShortCode() {
    return shortCode;
  }


  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCannedMessagesSearch conversationCannedMessagesSearch = (ConversationCannedMessagesSearch) o;
    return Objects.equals(this.maxResults, conversationCannedMessagesSearch.maxResults) &&
        Objects.equals(this.shortCode, conversationCannedMessagesSearch.shortCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, shortCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCannedMessagesSearch {\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
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
    openapiFields.add("max_results");
    openapiFields.add("short_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationCannedMessagesSearch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConversationCannedMessagesSearch.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationCannedMessagesSearch is not found in the empty JSON string", ConversationCannedMessagesSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConversationCannedMessagesSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationCannedMessagesSearch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("short_code") != null && !jsonObj.get("short_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `short_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("short_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationCannedMessagesSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationCannedMessagesSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationCannedMessagesSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationCannedMessagesSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationCannedMessagesSearch>() {
           @Override
           public void write(JsonWriter out, ConversationCannedMessagesSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationCannedMessagesSearch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConversationCannedMessagesSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationCannedMessagesSearch
  * @throws IOException if the JSON string is invalid with respect to ConversationCannedMessagesSearch
  */
  public static ConversationCannedMessagesSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationCannedMessagesSearch.class);
  }

 /**
  * Convert an instance of ConversationCannedMessagesSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
