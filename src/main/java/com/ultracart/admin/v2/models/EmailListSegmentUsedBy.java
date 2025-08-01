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
 * EmailListSegmentUsedBy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class EmailListSegmentUsedBy {
  public static final String SERIALIZED_NAME_EMAIL_CAMPAIGN_UUID = "email_campaign_uuid";
  @SerializedName(SERIALIZED_NAME_EMAIL_CAMPAIGN_UUID)
  private String emailCampaignUuid;

  public static final String SERIALIZED_NAME_EMAIL_FLOW_UUID = "email_flow_uuid";
  @SerializedName(SERIALIZED_NAME_EMAIL_FLOW_UUID)
  private String emailFlowUuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public EmailListSegmentUsedBy() { 
  }

  public EmailListSegmentUsedBy emailCampaignUuid(String emailCampaignUuid) {
    
    this.emailCampaignUuid = emailCampaignUuid;
    return this;
  }

   /**
   * Email campaign UUID
   * @return emailCampaignUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email campaign UUID")

  public String getEmailCampaignUuid() {
    return emailCampaignUuid;
  }


  public void setEmailCampaignUuid(String emailCampaignUuid) {
    this.emailCampaignUuid = emailCampaignUuid;
  }


  public EmailListSegmentUsedBy emailFlowUuid(String emailFlowUuid) {
    
    this.emailFlowUuid = emailFlowUuid;
    return this;
  }

   /**
   * Email flow UUID
   * @return emailFlowUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email flow UUID")

  public String getEmailFlowUuid() {
    return emailFlowUuid;
  }


  public void setEmailFlowUuid(String emailFlowUuid) {
    this.emailFlowUuid = emailFlowUuid;
  }


  public EmailListSegmentUsedBy name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the list or segment.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the list or segment.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailListSegmentUsedBy emailListSegmentUsedBy = (EmailListSegmentUsedBy) o;
    return Objects.equals(this.emailCampaignUuid, emailListSegmentUsedBy.emailCampaignUuid) &&
        Objects.equals(this.emailFlowUuid, emailListSegmentUsedBy.emailFlowUuid) &&
        Objects.equals(this.name, emailListSegmentUsedBy.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailCampaignUuid, emailFlowUuid, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailListSegmentUsedBy {\n");
    sb.append("    emailCampaignUuid: ").append(toIndentedString(emailCampaignUuid)).append("\n");
    sb.append("    emailFlowUuid: ").append(toIndentedString(emailFlowUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("email_campaign_uuid");
    openapiFields.add("email_flow_uuid");
    openapiFields.add("name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailListSegmentUsedBy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmailListSegmentUsedBy.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailListSegmentUsedBy is not found in the empty JSON string", EmailListSegmentUsedBy.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmailListSegmentUsedBy.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailListSegmentUsedBy` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("email_campaign_uuid") != null && !jsonObj.get("email_campaign_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_campaign_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_campaign_uuid").toString()));
      }
      if (jsonObj.get("email_flow_uuid") != null && !jsonObj.get("email_flow_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_flow_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_flow_uuid").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailListSegmentUsedBy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailListSegmentUsedBy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailListSegmentUsedBy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailListSegmentUsedBy.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailListSegmentUsedBy>() {
           @Override
           public void write(JsonWriter out, EmailListSegmentUsedBy value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailListSegmentUsedBy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailListSegmentUsedBy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailListSegmentUsedBy
  * @throws IOException if the JSON string is invalid with respect to EmailListSegmentUsedBy
  */
  public static EmailListSegmentUsedBy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailListSegmentUsedBy.class);
  }

 /**
  * Convert an instance of EmailListSegmentUsedBy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

