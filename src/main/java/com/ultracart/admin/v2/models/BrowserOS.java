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
 * BrowserOS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class BrowserOS {
  public static final String SERIALIZED_NAME_FAMILY = "family";
  @SerializedName(SERIALIZED_NAME_FAMILY)
  private String family;

  public static final String SERIALIZED_NAME_MAJOR = "major";
  @SerializedName(SERIALIZED_NAME_MAJOR)
  private String major;

  public static final String SERIALIZED_NAME_MINOR = "minor";
  @SerializedName(SERIALIZED_NAME_MINOR)
  private String minor;

  public static final String SERIALIZED_NAME_PATCH = "patch";
  @SerializedName(SERIALIZED_NAME_PATCH)
  private String patch;

  public static final String SERIALIZED_NAME_PATCH_MINOR = "patch_minor";
  @SerializedName(SERIALIZED_NAME_PATCH_MINOR)
  private String patchMinor;

  public BrowserOS() { 
  }

  public BrowserOS family(String family) {
    
    this.family = family;
    return this;
  }

   /**
   * Get family
   * @return family
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFamily() {
    return family;
  }


  public void setFamily(String family) {
    this.family = family;
  }


  public BrowserOS major(String major) {
    
    this.major = major;
    return this;
  }

   /**
   * Get major
   * @return major
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMajor() {
    return major;
  }


  public void setMajor(String major) {
    this.major = major;
  }


  public BrowserOS minor(String minor) {
    
    this.minor = minor;
    return this;
  }

   /**
   * Get minor
   * @return minor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMinor() {
    return minor;
  }


  public void setMinor(String minor) {
    this.minor = minor;
  }


  public BrowserOS patch(String patch) {
    
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPatch() {
    return patch;
  }


  public void setPatch(String patch) {
    this.patch = patch;
  }


  public BrowserOS patchMinor(String patchMinor) {
    
    this.patchMinor = patchMinor;
    return this;
  }

   /**
   * Get patchMinor
   * @return patchMinor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPatchMinor() {
    return patchMinor;
  }


  public void setPatchMinor(String patchMinor) {
    this.patchMinor = patchMinor;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrowserOS browserOS = (BrowserOS) o;
    return Objects.equals(this.family, browserOS.family) &&
        Objects.equals(this.major, browserOS.major) &&
        Objects.equals(this.minor, browserOS.minor) &&
        Objects.equals(this.patch, browserOS.patch) &&
        Objects.equals(this.patchMinor, browserOS.patchMinor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, major, minor, patch, patchMinor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrowserOS {\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    major: ").append(toIndentedString(major)).append("\n");
    sb.append("    minor: ").append(toIndentedString(minor)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    patchMinor: ").append(toIndentedString(patchMinor)).append("\n");
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
    openapiFields.add("family");
    openapiFields.add("major");
    openapiFields.add("minor");
    openapiFields.add("patch");
    openapiFields.add("patch_minor");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BrowserOS
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BrowserOS.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BrowserOS is not found in the empty JSON string", BrowserOS.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BrowserOS.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BrowserOS` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("family") != null && !jsonObj.get("family").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family").toString()));
      }
      if (jsonObj.get("major") != null && !jsonObj.get("major").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `major` to be a primitive type in the JSON string but got `%s`", jsonObj.get("major").toString()));
      }
      if (jsonObj.get("minor") != null && !jsonObj.get("minor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `minor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("minor").toString()));
      }
      if (jsonObj.get("patch") != null && !jsonObj.get("patch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patch").toString()));
      }
      if (jsonObj.get("patch_minor") != null && !jsonObj.get("patch_minor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patch_minor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patch_minor").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrowserOS.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrowserOS' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrowserOS> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrowserOS.class));

       return (TypeAdapter<T>) new TypeAdapter<BrowserOS>() {
           @Override
           public void write(JsonWriter out, BrowserOS value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrowserOS read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrowserOS given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrowserOS
  * @throws IOException if the JSON string is invalid with respect to BrowserOS
  */
  public static BrowserOS fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrowserOS.class);
  }

 /**
  * Convert an instance of BrowserOS to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

