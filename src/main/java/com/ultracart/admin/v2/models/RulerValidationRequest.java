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
 * RulerValidationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-07T11:40:07.280-04:00[America/Indianapolis]")
public class RulerValidationRequest {
  public static final String SERIALIZED_NAME_RULER = "ruler";
  @SerializedName(SERIALIZED_NAME_RULER)
  private String ruler;

  public RulerValidationRequest() { 
  }

  public RulerValidationRequest ruler(String ruler) {
    
    this.ruler = ruler;
    return this;
  }

   /**
   * Get ruler
   * @return ruler
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRuler() {
    return ruler;
  }


  public void setRuler(String ruler) {
    this.ruler = ruler;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulerValidationRequest rulerValidationRequest = (RulerValidationRequest) o;
    return Objects.equals(this.ruler, rulerValidationRequest.ruler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruler);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulerValidationRequest {\n");
    sb.append("    ruler: ").append(toIndentedString(ruler)).append("\n");
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
    openapiFields.add("ruler");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RulerValidationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RulerValidationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RulerValidationRequest is not found in the empty JSON string", RulerValidationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RulerValidationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RulerValidationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("ruler") != null && !jsonObj.get("ruler").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruler` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruler").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RulerValidationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RulerValidationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RulerValidationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RulerValidationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RulerValidationRequest>() {
           @Override
           public void write(JsonWriter out, RulerValidationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RulerValidationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RulerValidationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RulerValidationRequest
  * @throws IOException if the JSON string is invalid with respect to RulerValidationRequest
  */
  public static RulerValidationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RulerValidationRequest.class);
  }

 /**
  * Convert an instance of RulerValidationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
