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
 * EmailGlobalUnsubscribeResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class EmailGlobalUnsubscribeResponse {
  public static final String SERIALIZED_NAME_LISTS_UNSUBSCRIBED = "listsUnsubscribed";
  @SerializedName(SERIALIZED_NAME_LISTS_UNSUBSCRIBED)
  private Integer listsUnsubscribed;

  public EmailGlobalUnsubscribeResponse() { 
  }

  public EmailGlobalUnsubscribeResponse listsUnsubscribed(Integer listsUnsubscribed) {
    
    this.listsUnsubscribed = listsUnsubscribed;
    return this;
  }

   /**
   * Get listsUnsubscribed
   * @return listsUnsubscribed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getListsUnsubscribed() {
    return listsUnsubscribed;
  }


  public void setListsUnsubscribed(Integer listsUnsubscribed) {
    this.listsUnsubscribed = listsUnsubscribed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailGlobalUnsubscribeResponse emailGlobalUnsubscribeResponse = (EmailGlobalUnsubscribeResponse) o;
    return Objects.equals(this.listsUnsubscribed, emailGlobalUnsubscribeResponse.listsUnsubscribed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listsUnsubscribed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailGlobalUnsubscribeResponse {\n");
    sb.append("    listsUnsubscribed: ").append(toIndentedString(listsUnsubscribed)).append("\n");
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
    openapiFields.add("listsUnsubscribed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailGlobalUnsubscribeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmailGlobalUnsubscribeResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailGlobalUnsubscribeResponse is not found in the empty JSON string", EmailGlobalUnsubscribeResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmailGlobalUnsubscribeResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailGlobalUnsubscribeResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailGlobalUnsubscribeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailGlobalUnsubscribeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailGlobalUnsubscribeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailGlobalUnsubscribeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailGlobalUnsubscribeResponse>() {
           @Override
           public void write(JsonWriter out, EmailGlobalUnsubscribeResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailGlobalUnsubscribeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailGlobalUnsubscribeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailGlobalUnsubscribeResponse
  * @throws IOException if the JSON string is invalid with respect to EmailGlobalUnsubscribeResponse
  */
  public static EmailGlobalUnsubscribeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailGlobalUnsubscribeResponse.class);
  }

 /**
  * Convert an instance of EmailGlobalUnsubscribeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

