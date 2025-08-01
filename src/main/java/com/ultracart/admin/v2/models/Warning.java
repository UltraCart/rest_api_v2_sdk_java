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
 * Warning
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class Warning {
  public static final String SERIALIZED_NAME_MORE_INFO = "more_info";
  @SerializedName(SERIALIZED_NAME_MORE_INFO)
  private String moreInfo;

  public static final String SERIALIZED_NAME_WARNING_MESSAGE = "warning_message";
  @SerializedName(SERIALIZED_NAME_WARNING_MESSAGE)
  private String warningMessage;

  public Warning() { 
  }

  public Warning moreInfo(String moreInfo) {
    
    this.moreInfo = moreInfo;
    return this;
  }

   /**
   * Additional information often a link to additional documentation
   * @return moreInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information often a link to additional documentation")

  public String getMoreInfo() {
    return moreInfo;
  }


  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }


  public Warning warningMessage(String warningMessage) {
    
    this.warningMessage = warningMessage;
    return this;
  }

   /**
   * A technical message meant to be read by a developer
   * @return warningMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A technical message meant to be read by a developer")

  public String getWarningMessage() {
    return warningMessage;
  }


  public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warning warning = (Warning) o;
    return Objects.equals(this.moreInfo, warning.moreInfo) &&
        Objects.equals(this.warningMessage, warning.warningMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moreInfo, warningMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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
    openapiFields.add("more_info");
    openapiFields.add("warning_message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Warning
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Warning.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Warning is not found in the empty JSON string", Warning.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Warning.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Warning` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("more_info") != null && !jsonObj.get("more_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `more_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("more_info").toString()));
      }
      if (jsonObj.get("warning_message") != null && !jsonObj.get("warning_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `warning_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("warning_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Warning.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Warning' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Warning> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Warning.class));

       return (TypeAdapter<T>) new TypeAdapter<Warning>() {
           @Override
           public void write(JsonWriter out, Warning value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Warning read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Warning given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Warning
  * @throws IOException if the JSON string is invalid with respect to Warning
  */
  public static Warning fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Warning.class);
  }

 /**
  * Convert an instance of Warning to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

