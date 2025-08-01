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
 * AutoOrderQueryBatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class AutoOrderQueryBatch {
  public static final String SERIALIZED_NAME_AUTO_ORDER_OIDS = "auto_order_oids";
  @SerializedName(SERIALIZED_NAME_AUTO_ORDER_OIDS)
  private List<Integer> autoOrderOids = null;

  public AutoOrderQueryBatch() { 
  }

  public AutoOrderQueryBatch autoOrderOids(List<Integer> autoOrderOids) {
    
    this.autoOrderOids = autoOrderOids;
    return this;
  }

  public AutoOrderQueryBatch addAutoOrderOidsItem(Integer autoOrderOidsItem) {
    if (this.autoOrderOids == null) {
      this.autoOrderOids = new ArrayList<>();
    }
    this.autoOrderOids.add(autoOrderOidsItem);
    return this;
  }

   /**
   * Auto order oids
   * @return autoOrderOids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auto order oids")

  public List<Integer> getAutoOrderOids() {
    return autoOrderOids;
  }


  public void setAutoOrderOids(List<Integer> autoOrderOids) {
    this.autoOrderOids = autoOrderOids;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoOrderQueryBatch autoOrderQueryBatch = (AutoOrderQueryBatch) o;
    return Objects.equals(this.autoOrderOids, autoOrderQueryBatch.autoOrderOids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoOrderOids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoOrderQueryBatch {\n");
    sb.append("    autoOrderOids: ").append(toIndentedString(autoOrderOids)).append("\n");
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
    openapiFields.add("auto_order_oids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutoOrderQueryBatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AutoOrderQueryBatch.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoOrderQueryBatch is not found in the empty JSON string", AutoOrderQueryBatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutoOrderQueryBatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoOrderQueryBatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("auto_order_oids") != null && !jsonObj.get("auto_order_oids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `auto_order_oids` to be an array in the JSON string but got `%s`", jsonObj.get("auto_order_oids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoOrderQueryBatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoOrderQueryBatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoOrderQueryBatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoOrderQueryBatch.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoOrderQueryBatch>() {
           @Override
           public void write(JsonWriter out, AutoOrderQueryBatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoOrderQueryBatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoOrderQueryBatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoOrderQueryBatch
  * @throws IOException if the JSON string is invalid with respect to AutoOrderQueryBatch
  */
  public static AutoOrderQueryBatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoOrderQueryBatch.class);
  }

 /**
  * Convert an instance of AutoOrderQueryBatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

