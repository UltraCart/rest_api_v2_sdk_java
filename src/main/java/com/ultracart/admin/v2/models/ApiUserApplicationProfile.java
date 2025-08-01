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
 * ApiUserApplicationProfile
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ApiUserApplicationProfile {
  public static final String SERIALIZED_NAME_API_APPLICATION_LOGO_URL = "api_application_logo_url";
  @SerializedName(SERIALIZED_NAME_API_APPLICATION_LOGO_URL)
  private String apiApplicationLogoUrl;

  public static final String SERIALIZED_NAME_APPLICATION_DESCRIPTION = "application_description";
  @SerializedName(SERIALIZED_NAME_APPLICATION_DESCRIPTION)
  private String applicationDescription;

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "application_name";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_DEVELOPER_NAME = "developer_name";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_NAME)
  private String developerName;

  public static final String SERIALIZED_NAME_DEVELOPER_WEBSITE = "developer_website";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_WEBSITE)
  private String developerWebsite;

  public ApiUserApplicationProfile() { 
  }

  public ApiUserApplicationProfile apiApplicationLogoUrl(String apiApplicationLogoUrl) {
    
    this.apiApplicationLogoUrl = apiApplicationLogoUrl;
    return this;
  }

   /**
   * Application logo URL
   * @return apiApplicationLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application logo URL")

  public String getApiApplicationLogoUrl() {
    return apiApplicationLogoUrl;
  }


  public void setApiApplicationLogoUrl(String apiApplicationLogoUrl) {
    this.apiApplicationLogoUrl = apiApplicationLogoUrl;
  }


  public ApiUserApplicationProfile applicationDescription(String applicationDescription) {
    
    this.applicationDescription = applicationDescription;
    return this;
  }

   /**
   * Application description
   * @return applicationDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application description")

  public String getApplicationDescription() {
    return applicationDescription;
  }


  public void setApplicationDescription(String applicationDescription) {
    this.applicationDescription = applicationDescription;
  }


  public ApiUserApplicationProfile applicationName(String applicationName) {
    
    this.applicationName = applicationName;
    return this;
  }

   /**
   * Application name
   * @return applicationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application name")

  public String getApplicationName() {
    return applicationName;
  }


  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public ApiUserApplicationProfile developerName(String developerName) {
    
    this.developerName = developerName;
    return this;
  }

   /**
   * Developer name
   * @return developerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Developer name")

  public String getDeveloperName() {
    return developerName;
  }


  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }


  public ApiUserApplicationProfile developerWebsite(String developerWebsite) {
    
    this.developerWebsite = developerWebsite;
    return this;
  }

   /**
   * Developer website
   * @return developerWebsite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Developer website")

  public String getDeveloperWebsite() {
    return developerWebsite;
  }


  public void setDeveloperWebsite(String developerWebsite) {
    this.developerWebsite = developerWebsite;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUserApplicationProfile apiUserApplicationProfile = (ApiUserApplicationProfile) o;
    return Objects.equals(this.apiApplicationLogoUrl, apiUserApplicationProfile.apiApplicationLogoUrl) &&
        Objects.equals(this.applicationDescription, apiUserApplicationProfile.applicationDescription) &&
        Objects.equals(this.applicationName, apiUserApplicationProfile.applicationName) &&
        Objects.equals(this.developerName, apiUserApplicationProfile.developerName) &&
        Objects.equals(this.developerWebsite, apiUserApplicationProfile.developerWebsite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiApplicationLogoUrl, applicationDescription, applicationName, developerName, developerWebsite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUserApplicationProfile {\n");
    sb.append("    apiApplicationLogoUrl: ").append(toIndentedString(apiApplicationLogoUrl)).append("\n");
    sb.append("    applicationDescription: ").append(toIndentedString(applicationDescription)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    developerName: ").append(toIndentedString(developerName)).append("\n");
    sb.append("    developerWebsite: ").append(toIndentedString(developerWebsite)).append("\n");
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
    openapiFields.add("api_application_logo_url");
    openapiFields.add("application_description");
    openapiFields.add("application_name");
    openapiFields.add("developer_name");
    openapiFields.add("developer_website");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiUserApplicationProfile
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApiUserApplicationProfile.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiUserApplicationProfile is not found in the empty JSON string", ApiUserApplicationProfile.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiUserApplicationProfile.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiUserApplicationProfile` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("api_application_logo_url") != null && !jsonObj.get("api_application_logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_application_logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_application_logo_url").toString()));
      }
      if (jsonObj.get("application_description") != null && !jsonObj.get("application_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_description").toString()));
      }
      if (jsonObj.get("application_name") != null && !jsonObj.get("application_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application_name").toString()));
      }
      if (jsonObj.get("developer_name") != null && !jsonObj.get("developer_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `developer_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("developer_name").toString()));
      }
      if (jsonObj.get("developer_website") != null && !jsonObj.get("developer_website").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `developer_website` to be a primitive type in the JSON string but got `%s`", jsonObj.get("developer_website").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiUserApplicationProfile.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiUserApplicationProfile' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiUserApplicationProfile> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiUserApplicationProfile.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiUserApplicationProfile>() {
           @Override
           public void write(JsonWriter out, ApiUserApplicationProfile value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiUserApplicationProfile read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiUserApplicationProfile given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiUserApplicationProfile
  * @throws IOException if the JSON string is invalid with respect to ApiUserApplicationProfile
  */
  public static ApiUserApplicationProfile fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiUserApplicationProfile.class);
  }

 /**
  * Convert an instance of ApiUserApplicationProfile to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

