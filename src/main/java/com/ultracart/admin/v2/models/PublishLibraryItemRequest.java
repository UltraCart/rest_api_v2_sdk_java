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
 * PublishLibraryItemRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class PublishLibraryItemRequest {
  public static final String SERIALIZED_NAME_RELEASE_NOTES = "release_notes";
  @SerializedName(SERIALIZED_NAME_RELEASE_NOTES)
  private String releaseNotes;

  public PublishLibraryItemRequest() { 
  }

  public PublishLibraryItemRequest releaseNotes(String releaseNotes) {
    
    this.releaseNotes = releaseNotes;
    return this;
  }

   /**
   * Release notes for this release version.
   * @return releaseNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Release notes for this release version.")

  public String getReleaseNotes() {
    return releaseNotes;
  }


  public void setReleaseNotes(String releaseNotes) {
    this.releaseNotes = releaseNotes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishLibraryItemRequest publishLibraryItemRequest = (PublishLibraryItemRequest) o;
    return Objects.equals(this.releaseNotes, publishLibraryItemRequest.releaseNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(releaseNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishLibraryItemRequest {\n");
    sb.append("    releaseNotes: ").append(toIndentedString(releaseNotes)).append("\n");
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
    openapiFields.add("release_notes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PublishLibraryItemRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PublishLibraryItemRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublishLibraryItemRequest is not found in the empty JSON string", PublishLibraryItemRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PublishLibraryItemRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublishLibraryItemRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("release_notes") != null && !jsonObj.get("release_notes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_notes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_notes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublishLibraryItemRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublishLibraryItemRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublishLibraryItemRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublishLibraryItemRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PublishLibraryItemRequest>() {
           @Override
           public void write(JsonWriter out, PublishLibraryItemRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublishLibraryItemRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PublishLibraryItemRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublishLibraryItemRequest
  * @throws IOException if the JSON string is invalid with respect to PublishLibraryItemRequest
  */
  public static PublishLibraryItemRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublishLibraryItemRequest.class);
  }

 /**
  * Convert an instance of PublishLibraryItemRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

