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
import com.ultracart.admin.v2.models.ReportDataSetQuery;
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
 * ReportExecuteQueriesRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ReportExecuteQueriesRequest {
  public static final String SERIALIZED_NAME_CLIENT_UUID = "client_uuid";
  @SerializedName(SERIALIZED_NAME_CLIENT_UUID)
  private String clientUuid;

  public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;

  public static final String SERIALIZED_NAME_DEFAULT_DATASET_ID = "default_dataset_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_DATASET_ID)
  private String defaultDatasetId;

  public static final String SERIALIZED_NAME_DEFAULT_PROJECT_ID = "default_project_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PROJECT_ID)
  private String defaultProjectId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<ReportDataSetQuery> queries = null;

  public static final String SERIALIZED_NAME_REQUEST_DTS = "request_dts";
  @SerializedName(SERIALIZED_NAME_REQUEST_DTS)
  private String requestDts;

  /**
   * Security level to execute report under
   */
  @JsonAdapter(SecurityLevelEnum.Adapter.class)
  public enum SecurityLevelEnum {
    STANDARD("standard"),
    
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    SecurityLevelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SecurityLevelEnum fromValue(String value) {
      for (SecurityLevelEnum b : SecurityLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SecurityLevelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecurityLevelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SecurityLevelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SecurityLevelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SECURITY_LEVEL = "security_level";
  @SerializedName(SERIALIZED_NAME_SECURITY_LEVEL)
  private SecurityLevelEnum securityLevel;

  public ReportExecuteQueriesRequest() { 
  }

  public ReportExecuteQueriesRequest clientUuid(String clientUuid) {
    
    this.clientUuid = clientUuid;
    return this;
  }

   /**
   * Unique UUID assigned to this client during the auth.  This will be used to locate the websocket connect id.
   * @return clientUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique UUID assigned to this client during the auth.  This will be used to locate the websocket connect id.")

  public String getClientUuid() {
    return clientUuid;
  }


  public void setClientUuid(String clientUuid) {
    this.clientUuid = clientUuid;
  }


  public ReportExecuteQueriesRequest connectionId(String connectionId) {
    
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The websocket connection id that should receive back notices of query completion.
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The websocket connection id that should receive back notices of query completion.")

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public ReportExecuteQueriesRequest defaultDatasetId(String defaultDatasetId) {
    
    this.defaultDatasetId = defaultDatasetId;
    return this;
  }

   /**
   * Get defaultDatasetId
   * @return defaultDatasetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultDatasetId() {
    return defaultDatasetId;
  }


  public void setDefaultDatasetId(String defaultDatasetId) {
    this.defaultDatasetId = defaultDatasetId;
  }


  public ReportExecuteQueriesRequest defaultProjectId(String defaultProjectId) {
    
    this.defaultProjectId = defaultProjectId;
    return this;
  }

   /**
   * Get defaultProjectId
   * @return defaultProjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultProjectId() {
    return defaultProjectId;
  }


  public void setDefaultProjectId(String defaultProjectId) {
    this.defaultProjectId = defaultProjectId;
  }


  public ReportExecuteQueriesRequest merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public ReportExecuteQueriesRequest queries(List<ReportDataSetQuery> queries) {
    
    this.queries = queries;
    return this;
  }

  public ReportExecuteQueriesRequest addQueriesItem(ReportDataSetQuery queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * An array of queries that we want the lambda function to execute.
   * @return queries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of queries that we want the lambda function to execute.")

  public List<ReportDataSetQuery> getQueries() {
    return queries;
  }


  public void setQueries(List<ReportDataSetQuery> queries) {
    this.queries = queries;
  }


  public ReportExecuteQueriesRequest requestDts(String requestDts) {
    
    this.requestDts = requestDts;
    return this;
  }

   /**
   * Date/Time of the client submitted the request.  Can be used to resolve out of order query completion results
   * @return requestDts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date/Time of the client submitted the request.  Can be used to resolve out of order query completion results")

  public String getRequestDts() {
    return requestDts;
  }


  public void setRequestDts(String requestDts) {
    this.requestDts = requestDts;
  }


  public ReportExecuteQueriesRequest securityLevel(SecurityLevelEnum securityLevel) {
    
    this.securityLevel = securityLevel;
    return this;
  }

   /**
   * Security level to execute report under
   * @return securityLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Security level to execute report under")

  public SecurityLevelEnum getSecurityLevel() {
    return securityLevel;
  }


  public void setSecurityLevel(SecurityLevelEnum securityLevel) {
    this.securityLevel = securityLevel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportExecuteQueriesRequest reportExecuteQueriesRequest = (ReportExecuteQueriesRequest) o;
    return Objects.equals(this.clientUuid, reportExecuteQueriesRequest.clientUuid) &&
        Objects.equals(this.connectionId, reportExecuteQueriesRequest.connectionId) &&
        Objects.equals(this.defaultDatasetId, reportExecuteQueriesRequest.defaultDatasetId) &&
        Objects.equals(this.defaultProjectId, reportExecuteQueriesRequest.defaultProjectId) &&
        Objects.equals(this.merchantId, reportExecuteQueriesRequest.merchantId) &&
        Objects.equals(this.queries, reportExecuteQueriesRequest.queries) &&
        Objects.equals(this.requestDts, reportExecuteQueriesRequest.requestDts) &&
        Objects.equals(this.securityLevel, reportExecuteQueriesRequest.securityLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUuid, connectionId, defaultDatasetId, defaultProjectId, merchantId, queries, requestDts, securityLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportExecuteQueriesRequest {\n");
    sb.append("    clientUuid: ").append(toIndentedString(clientUuid)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    defaultDatasetId: ").append(toIndentedString(defaultDatasetId)).append("\n");
    sb.append("    defaultProjectId: ").append(toIndentedString(defaultProjectId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    requestDts: ").append(toIndentedString(requestDts)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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
    openapiFields.add("client_uuid");
    openapiFields.add("connection_id");
    openapiFields.add("default_dataset_id");
    openapiFields.add("default_project_id");
    openapiFields.add("merchant_id");
    openapiFields.add("queries");
    openapiFields.add("request_dts");
    openapiFields.add("security_level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportExecuteQueriesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportExecuteQueriesRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportExecuteQueriesRequest is not found in the empty JSON string", ReportExecuteQueriesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportExecuteQueriesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportExecuteQueriesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("client_uuid") != null && !jsonObj.get("client_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_uuid").toString()));
      }
      if (jsonObj.get("connection_id") != null && !jsonObj.get("connection_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection_id").toString()));
      }
      if (jsonObj.get("default_dataset_id") != null && !jsonObj.get("default_dataset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_dataset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_dataset_id").toString()));
      }
      if (jsonObj.get("default_project_id") != null && !jsonObj.get("default_project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_project_id").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      JsonArray jsonArrayqueries = jsonObj.getAsJsonArray("queries");
      if (jsonArrayqueries != null) {
        // ensure the json data is an array
        if (!jsonObj.get("queries").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `queries` to be an array in the JSON string but got `%s`", jsonObj.get("queries").toString()));
        }

        // validate the optional field `queries` (array)
        for (int i = 0; i < jsonArrayqueries.size(); i++) {
          ReportDataSetQuery.validateJsonObject(jsonArrayqueries.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("request_dts") != null && !jsonObj.get("request_dts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_dts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_dts").toString()));
      }
      if (jsonObj.get("security_level") != null && !jsonObj.get("security_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `security_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("security_level").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportExecuteQueriesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportExecuteQueriesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportExecuteQueriesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportExecuteQueriesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportExecuteQueriesRequest>() {
           @Override
           public void write(JsonWriter out, ReportExecuteQueriesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportExecuteQueriesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportExecuteQueriesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportExecuteQueriesRequest
  * @throws IOException if the JSON string is invalid with respect to ReportExecuteQueriesRequest
  */
  public static ReportExecuteQueriesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportExecuteQueriesRequest.class);
  }

 /**
  * Convert an instance of ReportExecuteQueriesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

