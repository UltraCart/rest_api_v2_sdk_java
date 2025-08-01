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
import com.ultracart.admin.v2.models.ReportDataSetColumn;
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
 * ReportDataSetRow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ReportDataSetRow {
  public static final String SERIALIZED_NAME_C = "c";
  @SerializedName(SERIALIZED_NAME_C)
  private List<ReportDataSetColumn> c = null;

  public ReportDataSetRow() { 
  }

  public ReportDataSetRow c(List<ReportDataSetColumn> c) {
    
    this.c = c;
    return this;
  }

  public ReportDataSetRow addCItem(ReportDataSetColumn cItem) {
    if (this.c == null) {
      this.c = new ArrayList<>();
    }
    this.c.add(cItem);
    return this;
  }

   /**
   * Get c
   * @return c
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReportDataSetColumn> getC() {
    return c;
  }


  public void setC(List<ReportDataSetColumn> c) {
    this.c = c;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDataSetRow reportDataSetRow = (ReportDataSetRow) o;
    return Objects.equals(this.c, reportDataSetRow.c);
  }

  @Override
  public int hashCode() {
    return Objects.hash(c);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDataSetRow {\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
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
    openapiFields.add("c");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportDataSetRow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportDataSetRow.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportDataSetRow is not found in the empty JSON string", ReportDataSetRow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportDataSetRow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportDataSetRow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayc = jsonObj.getAsJsonArray("c");
      if (jsonArrayc != null) {
        // ensure the json data is an array
        if (!jsonObj.get("c").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `c` to be an array in the JSON string but got `%s`", jsonObj.get("c").toString()));
        }

        // validate the optional field `c` (array)
        for (int i = 0; i < jsonArrayc.size(); i++) {
          ReportDataSetColumn.validateJsonObject(jsonArrayc.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportDataSetRow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportDataSetRow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportDataSetRow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportDataSetRow.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportDataSetRow>() {
           @Override
           public void write(JsonWriter out, ReportDataSetRow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportDataSetRow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportDataSetRow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportDataSetRow
  * @throws IOException if the JSON string is invalid with respect to ReportDataSetRow
  */
  public static ReportDataSetRow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportDataSetRow.class);
  }

 /**
  * Convert an instance of ReportDataSetRow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

