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
import com.ultracart.admin.v2.models.ResponseMetadata;
import com.ultracart.admin.v2.models.Warning;
import com.ultracart.admin.v2.models.WebhookLogSummary;
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
 * WebhookLogSummariesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class WebhookLogSummariesResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private ResponseMetadata metadata;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  private Warning warning;

  public static final String SERIALIZED_NAME_WEBHOOK_LOG_SUMMARIES = "webhook_log_summaries";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_LOG_SUMMARIES)
  private List<WebhookLogSummary> webhookLogSummaries = null;

  public WebhookLogSummariesResponse() { 
  }

  public WebhookLogSummariesResponse error(Error error) {
    
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


  public WebhookLogSummariesResponse metadata(ResponseMetadata metadata) {
    
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


  public WebhookLogSummariesResponse success(Boolean success) {
    
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


  public WebhookLogSummariesResponse warning(Warning warning) {
    
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


  public WebhookLogSummariesResponse webhookLogSummaries(List<WebhookLogSummary> webhookLogSummaries) {
    
    this.webhookLogSummaries = webhookLogSummaries;
    return this;
  }

  public WebhookLogSummariesResponse addWebhookLogSummariesItem(WebhookLogSummary webhookLogSummariesItem) {
    if (this.webhookLogSummaries == null) {
      this.webhookLogSummaries = new ArrayList<>();
    }
    this.webhookLogSummaries.add(webhookLogSummariesItem);
    return this;
  }

   /**
   * Webhook log summaries
   * @return webhookLogSummaries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Webhook log summaries")

  public List<WebhookLogSummary> getWebhookLogSummaries() {
    return webhookLogSummaries;
  }


  public void setWebhookLogSummaries(List<WebhookLogSummary> webhookLogSummaries) {
    this.webhookLogSummaries = webhookLogSummaries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookLogSummariesResponse webhookLogSummariesResponse = (WebhookLogSummariesResponse) o;
    return Objects.equals(this.error, webhookLogSummariesResponse.error) &&
        Objects.equals(this.metadata, webhookLogSummariesResponse.metadata) &&
        Objects.equals(this.success, webhookLogSummariesResponse.success) &&
        Objects.equals(this.warning, webhookLogSummariesResponse.warning) &&
        Objects.equals(this.webhookLogSummaries, webhookLogSummariesResponse.webhookLogSummaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, metadata, success, warning, webhookLogSummaries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookLogSummariesResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    webhookLogSummaries: ").append(toIndentedString(webhookLogSummaries)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("success");
    openapiFields.add("warning");
    openapiFields.add("webhook_log_summaries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebhookLogSummariesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WebhookLogSummariesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebhookLogSummariesResponse is not found in the empty JSON string", WebhookLogSummariesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebhookLogSummariesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebhookLogSummariesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `error`
      if (jsonObj.getAsJsonObject("error") != null) {
        Error.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      // validate the optional field `metadata`
      if (jsonObj.getAsJsonObject("metadata") != null) {
        ResponseMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      // validate the optional field `warning`
      if (jsonObj.getAsJsonObject("warning") != null) {
        Warning.validateJsonObject(jsonObj.getAsJsonObject("warning"));
      }
      JsonArray jsonArraywebhookLogSummaries = jsonObj.getAsJsonArray("webhook_log_summaries");
      if (jsonArraywebhookLogSummaries != null) {
        // ensure the json data is an array
        if (!jsonObj.get("webhook_log_summaries").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `webhook_log_summaries` to be an array in the JSON string but got `%s`", jsonObj.get("webhook_log_summaries").toString()));
        }

        // validate the optional field `webhook_log_summaries` (array)
        for (int i = 0; i < jsonArraywebhookLogSummaries.size(); i++) {
          WebhookLogSummary.validateJsonObject(jsonArraywebhookLogSummaries.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebhookLogSummariesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebhookLogSummariesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebhookLogSummariesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebhookLogSummariesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WebhookLogSummariesResponse>() {
           @Override
           public void write(JsonWriter out, WebhookLogSummariesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebhookLogSummariesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebhookLogSummariesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebhookLogSummariesResponse
  * @throws IOException if the JSON string is invalid with respect to WebhookLogSummariesResponse
  */
  public static WebhookLogSummariesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebhookLogSummariesResponse.class);
  }

 /**
  * Convert an instance of WebhookLogSummariesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

