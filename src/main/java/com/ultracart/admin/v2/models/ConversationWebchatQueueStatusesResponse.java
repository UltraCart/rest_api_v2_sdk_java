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
import com.ultracart.admin.v2.models.ConversationWebchatQueueStatus;
import com.ultracart.admin.v2.models.Error;
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
 * ConversationWebchatQueueStatusesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ConversationWebchatQueueStatusesResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private ResponseMetadata metadata;

  public static final String SERIALIZED_NAME_QUEUE_STATUSES = "queue_statuses";
  @SerializedName(SERIALIZED_NAME_QUEUE_STATUSES)
  private List<ConversationWebchatQueueStatus> queueStatuses = null;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  private Warning warning;

  public ConversationWebchatQueueStatusesResponse() { 
  }

  public ConversationWebchatQueueStatusesResponse error(Error error) {
    
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


  public ConversationWebchatQueueStatusesResponse metadata(ResponseMetadata metadata) {
    
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


  public ConversationWebchatQueueStatusesResponse queueStatuses(List<ConversationWebchatQueueStatus> queueStatuses) {
    
    this.queueStatuses = queueStatuses;
    return this;
  }

  public ConversationWebchatQueueStatusesResponse addQueueStatusesItem(ConversationWebchatQueueStatus queueStatusesItem) {
    if (this.queueStatuses == null) {
      this.queueStatuses = new ArrayList<>();
    }
    this.queueStatuses.add(queueStatusesItem);
    return this;
  }

   /**
   * Get queueStatuses
   * @return queueStatuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ConversationWebchatQueueStatus> getQueueStatuses() {
    return queueStatuses;
  }


  public void setQueueStatuses(List<ConversationWebchatQueueStatus> queueStatuses) {
    this.queueStatuses = queueStatuses;
  }


  public ConversationWebchatQueueStatusesResponse success(Boolean success) {
    
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


  public ConversationWebchatQueueStatusesResponse warning(Warning warning) {
    
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
    ConversationWebchatQueueStatusesResponse conversationWebchatQueueStatusesResponse = (ConversationWebchatQueueStatusesResponse) o;
    return Objects.equals(this.error, conversationWebchatQueueStatusesResponse.error) &&
        Objects.equals(this.metadata, conversationWebchatQueueStatusesResponse.metadata) &&
        Objects.equals(this.queueStatuses, conversationWebchatQueueStatusesResponse.queueStatuses) &&
        Objects.equals(this.success, conversationWebchatQueueStatusesResponse.success) &&
        Objects.equals(this.warning, conversationWebchatQueueStatusesResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, metadata, queueStatuses, success, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationWebchatQueueStatusesResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    queueStatuses: ").append(toIndentedString(queueStatuses)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("queue_statuses");
    openapiFields.add("success");
    openapiFields.add("warning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationWebchatQueueStatusesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConversationWebchatQueueStatusesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationWebchatQueueStatusesResponse is not found in the empty JSON string", ConversationWebchatQueueStatusesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConversationWebchatQueueStatusesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationWebchatQueueStatusesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      JsonArray jsonArrayqueueStatuses = jsonObj.getAsJsonArray("queue_statuses");
      if (jsonArrayqueueStatuses != null) {
        // ensure the json data is an array
        if (!jsonObj.get("queue_statuses").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `queue_statuses` to be an array in the JSON string but got `%s`", jsonObj.get("queue_statuses").toString()));
        }

        // validate the optional field `queue_statuses` (array)
        for (int i = 0; i < jsonArrayqueueStatuses.size(); i++) {
          ConversationWebchatQueueStatus.validateJsonObject(jsonArrayqueueStatuses.get(i).getAsJsonObject());
        };
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
       if (!ConversationWebchatQueueStatusesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationWebchatQueueStatusesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationWebchatQueueStatusesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationWebchatQueueStatusesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationWebchatQueueStatusesResponse>() {
           @Override
           public void write(JsonWriter out, ConversationWebchatQueueStatusesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationWebchatQueueStatusesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConversationWebchatQueueStatusesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationWebchatQueueStatusesResponse
  * @throws IOException if the JSON string is invalid with respect to ConversationWebchatQueueStatusesResponse
  */
  public static ConversationWebchatQueueStatusesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationWebchatQueueStatusesResponse.class);
  }

 /**
  * Convert an instance of ConversationWebchatQueueStatusesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

