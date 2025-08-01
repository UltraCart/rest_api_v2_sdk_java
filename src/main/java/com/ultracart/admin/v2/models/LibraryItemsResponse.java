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
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.LibraryItem;
import com.ultracart.admin.v2.models.ResponseMetadata;
import com.ultracart.admin.v2.models.Warning;
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
 * LibraryItemsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class LibraryItemsResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<LibraryItem> items = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private ResponseMetadata metadata;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  private Warning warning;

  public LibraryItemsResponse() { 
  }

  public LibraryItemsResponse error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  public LibraryItemsResponse items(List<LibraryItem> items) {
    
    this.items = items;
    return this;
  }

  public LibraryItemsResponse addItemsItem(LibraryItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Library items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Library items")

  public List<LibraryItem> getItems() {
    return items;
  }


  public void setItems(List<LibraryItem> items) {
    this.items = items;
  }


  public LibraryItemsResponse metadata(ResponseMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
  }


  public LibraryItemsResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Indicates if API call was successful
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if API call was successful")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public LibraryItemsResponse warning(Warning warning) {
    
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Warning getWarning() {
    return warning;
  }


  public void setWarning(Warning warning) {
    this.warning = warning;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryItemsResponse libraryItemsResponse = (LibraryItemsResponse) o;
    return Objects.equals(this.error, libraryItemsResponse.error) &&
        Objects.equals(this.items, libraryItemsResponse.items) &&
        Objects.equals(this.metadata, libraryItemsResponse.metadata) &&
        Objects.equals(this.success, libraryItemsResponse.success) &&
        Objects.equals(this.warning, libraryItemsResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, items, metadata, success, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryItemsResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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
    openapiFields.add("error");
    openapiFields.add("items");
    openapiFields.add("metadata");
    openapiFields.add("success");
    openapiFields.add("warning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LibraryItemsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LibraryItemsResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LibraryItemsResponse is not found in the empty JSON string", LibraryItemsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LibraryItemsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LibraryItemsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `error`
      if (jsonObj.getAsJsonObject("error") != null) {
        Error.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      if (jsonArrayitems != null) {
        // ensure the json data is an array
        if (!jsonObj.get("items").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
        }

        // validate the optional field `items` (array)
        for (int i = 0; i < jsonArrayitems.size(); i++) {
          LibraryItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `metadata`
      if (jsonObj.getAsJsonObject("metadata") != null) {
        ResponseMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      // validate the optional field `warning`
      if (jsonObj.getAsJsonObject("warning") != null) {
        Warning.validateJsonObject(jsonObj.getAsJsonObject("warning"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LibraryItemsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LibraryItemsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LibraryItemsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LibraryItemsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<LibraryItemsResponse>() {
           @Override
           public void write(JsonWriter out, LibraryItemsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LibraryItemsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LibraryItemsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LibraryItemsResponse
  * @throws IOException if the JSON string is invalid with respect to LibraryItemsResponse
  */
  public static LibraryItemsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LibraryItemsResponse.class);
  }

 /**
  * Convert an instance of LibraryItemsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

