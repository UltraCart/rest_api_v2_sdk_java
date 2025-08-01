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
import com.ultracart.admin.v2.models.OrderReason;
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
 * ChanelPartnerReasonCodesResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ChanelPartnerReasonCodesResponse {
  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_ITEM_LEVEL_REFUND_REASON_REQUIRED = "item_level_refund_reason_required";
  @SerializedName(SERIALIZED_NAME_ITEM_LEVEL_REFUND_REASON_REQUIRED)
  private Boolean itemLevelRefundReasonRequired;

  public static final String SERIALIZED_NAME_ITEM_LEVEL_REFUND_REASONS = "item_level_refund_reasons";
  @SerializedName(SERIALIZED_NAME_ITEM_LEVEL_REFUND_REASONS)
  private List<OrderReason> itemLevelRefundReasons = null;

  public static final String SERIALIZED_NAME_ITEM_LEVEL_RETURN_REASONS = "item_level_return_reasons";
  @SerializedName(SERIALIZED_NAME_ITEM_LEVEL_RETURN_REASONS)
  private List<OrderReason> itemLevelReturnReasons = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private ResponseMetadata metadata;

  public static final String SERIALIZED_NAME_ORDER_LEVEL_REFUND_REASON_REQUIRED = "order_level_refund_reason_required";
  @SerializedName(SERIALIZED_NAME_ORDER_LEVEL_REFUND_REASON_REQUIRED)
  private Boolean orderLevelRefundReasonRequired;

  public static final String SERIALIZED_NAME_ORDER_LEVEL_REFUND_REASONS = "order_level_refund_reasons";
  @SerializedName(SERIALIZED_NAME_ORDER_LEVEL_REFUND_REASONS)
  private List<OrderReason> orderLevelRefundReasons = null;

  public static final String SERIALIZED_NAME_ORDER_LEVEL_REJECT_REASON_REQUIRED = "order_level_reject_reason_required";
  @SerializedName(SERIALIZED_NAME_ORDER_LEVEL_REJECT_REASON_REQUIRED)
  private Boolean orderLevelRejectReasonRequired;

  public static final String SERIALIZED_NAME_ORDER_LEVEL_REJECT_REASONS = "order_level_reject_reasons";
  @SerializedName(SERIALIZED_NAME_ORDER_LEVEL_REJECT_REASONS)
  private List<OrderReason> orderLevelRejectReasons = null;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  private Warning warning;

  public ChanelPartnerReasonCodesResponse() { 
  }

  public ChanelPartnerReasonCodesResponse error(Error error) {
    
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


  public ChanelPartnerReasonCodesResponse itemLevelRefundReasonRequired(Boolean itemLevelRefundReasonRequired) {
    
    this.itemLevelRefundReasonRequired = itemLevelRefundReasonRequired;
    return this;
  }

   /**
   * True if the item level refund reason is required
   * @return itemLevelRefundReasonRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the item level refund reason is required")

  public Boolean getItemLevelRefundReasonRequired() {
    return itemLevelRefundReasonRequired;
  }


  public void setItemLevelRefundReasonRequired(Boolean itemLevelRefundReasonRequired) {
    this.itemLevelRefundReasonRequired = itemLevelRefundReasonRequired;
  }


  public ChanelPartnerReasonCodesResponse itemLevelRefundReasons(List<OrderReason> itemLevelRefundReasons) {
    
    this.itemLevelRefundReasons = itemLevelRefundReasons;
    return this;
  }

  public ChanelPartnerReasonCodesResponse addItemLevelRefundReasonsItem(OrderReason itemLevelRefundReasonsItem) {
    if (this.itemLevelRefundReasons == null) {
      this.itemLevelRefundReasons = new ArrayList<>();
    }
    this.itemLevelRefundReasons.add(itemLevelRefundReasonsItem);
    return this;
  }

   /**
   * Reason codes available at the item level.
   * @return itemLevelRefundReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason codes available at the item level.")

  public List<OrderReason> getItemLevelRefundReasons() {
    return itemLevelRefundReasons;
  }


  public void setItemLevelRefundReasons(List<OrderReason> itemLevelRefundReasons) {
    this.itemLevelRefundReasons = itemLevelRefundReasons;
  }


  public ChanelPartnerReasonCodesResponse itemLevelReturnReasons(List<OrderReason> itemLevelReturnReasons) {
    
    this.itemLevelReturnReasons = itemLevelReturnReasons;
    return this;
  }

  public ChanelPartnerReasonCodesResponse addItemLevelReturnReasonsItem(OrderReason itemLevelReturnReasonsItem) {
    if (this.itemLevelReturnReasons == null) {
      this.itemLevelReturnReasons = new ArrayList<>();
    }
    this.itemLevelReturnReasons.add(itemLevelReturnReasonsItem);
    return this;
  }

   /**
   * Return codes available at the item level.
   * @return itemLevelReturnReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return codes available at the item level.")

  public List<OrderReason> getItemLevelReturnReasons() {
    return itemLevelReturnReasons;
  }


  public void setItemLevelReturnReasons(List<OrderReason> itemLevelReturnReasons) {
    this.itemLevelReturnReasons = itemLevelReturnReasons;
  }


  public ChanelPartnerReasonCodesResponse metadata(ResponseMetadata metadata) {
    
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


  public ChanelPartnerReasonCodesResponse orderLevelRefundReasonRequired(Boolean orderLevelRefundReasonRequired) {
    
    this.orderLevelRefundReasonRequired = orderLevelRefundReasonRequired;
    return this;
  }

   /**
   * True if the order level refund reason is required
   * @return orderLevelRefundReasonRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the order level refund reason is required")

  public Boolean getOrderLevelRefundReasonRequired() {
    return orderLevelRefundReasonRequired;
  }


  public void setOrderLevelRefundReasonRequired(Boolean orderLevelRefundReasonRequired) {
    this.orderLevelRefundReasonRequired = orderLevelRefundReasonRequired;
  }


  public ChanelPartnerReasonCodesResponse orderLevelRefundReasons(List<OrderReason> orderLevelRefundReasons) {
    
    this.orderLevelRefundReasons = orderLevelRefundReasons;
    return this;
  }

  public ChanelPartnerReasonCodesResponse addOrderLevelRefundReasonsItem(OrderReason orderLevelRefundReasonsItem) {
    if (this.orderLevelRefundReasons == null) {
      this.orderLevelRefundReasons = new ArrayList<>();
    }
    this.orderLevelRefundReasons.add(orderLevelRefundReasonsItem);
    return this;
  }

   /**
   * Reason codes available at the order level.
   * @return orderLevelRefundReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason codes available at the order level.")

  public List<OrderReason> getOrderLevelRefundReasons() {
    return orderLevelRefundReasons;
  }


  public void setOrderLevelRefundReasons(List<OrderReason> orderLevelRefundReasons) {
    this.orderLevelRefundReasons = orderLevelRefundReasons;
  }


  public ChanelPartnerReasonCodesResponse orderLevelRejectReasonRequired(Boolean orderLevelRejectReasonRequired) {
    
    this.orderLevelRejectReasonRequired = orderLevelRejectReasonRequired;
    return this;
  }

   /**
   * True if the order level reject reason is required
   * @return orderLevelRejectReasonRequired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the order level reject reason is required")

  public Boolean getOrderLevelRejectReasonRequired() {
    return orderLevelRejectReasonRequired;
  }


  public void setOrderLevelRejectReasonRequired(Boolean orderLevelRejectReasonRequired) {
    this.orderLevelRejectReasonRequired = orderLevelRejectReasonRequired;
  }


  public ChanelPartnerReasonCodesResponse orderLevelRejectReasons(List<OrderReason> orderLevelRejectReasons) {
    
    this.orderLevelRejectReasons = orderLevelRejectReasons;
    return this;
  }

  public ChanelPartnerReasonCodesResponse addOrderLevelRejectReasonsItem(OrderReason orderLevelRejectReasonsItem) {
    if (this.orderLevelRejectReasons == null) {
      this.orderLevelRejectReasons = new ArrayList<>();
    }
    this.orderLevelRejectReasons.add(orderLevelRejectReasonsItem);
    return this;
  }

   /**
   * Reject codes available at the order level.
   * @return orderLevelRejectReasons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reject codes available at the order level.")

  public List<OrderReason> getOrderLevelRejectReasons() {
    return orderLevelRejectReasons;
  }


  public void setOrderLevelRejectReasons(List<OrderReason> orderLevelRejectReasons) {
    this.orderLevelRejectReasons = orderLevelRejectReasons;
  }


  public ChanelPartnerReasonCodesResponse success(Boolean success) {
    
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


  public ChanelPartnerReasonCodesResponse warning(Warning warning) {
    
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
    ChanelPartnerReasonCodesResponse chanelPartnerReasonCodesResponse = (ChanelPartnerReasonCodesResponse) o;
    return Objects.equals(this.error, chanelPartnerReasonCodesResponse.error) &&
        Objects.equals(this.itemLevelRefundReasonRequired, chanelPartnerReasonCodesResponse.itemLevelRefundReasonRequired) &&
        Objects.equals(this.itemLevelRefundReasons, chanelPartnerReasonCodesResponse.itemLevelRefundReasons) &&
        Objects.equals(this.itemLevelReturnReasons, chanelPartnerReasonCodesResponse.itemLevelReturnReasons) &&
        Objects.equals(this.metadata, chanelPartnerReasonCodesResponse.metadata) &&
        Objects.equals(this.orderLevelRefundReasonRequired, chanelPartnerReasonCodesResponse.orderLevelRefundReasonRequired) &&
        Objects.equals(this.orderLevelRefundReasons, chanelPartnerReasonCodesResponse.orderLevelRefundReasons) &&
        Objects.equals(this.orderLevelRejectReasonRequired, chanelPartnerReasonCodesResponse.orderLevelRejectReasonRequired) &&
        Objects.equals(this.orderLevelRejectReasons, chanelPartnerReasonCodesResponse.orderLevelRejectReasons) &&
        Objects.equals(this.success, chanelPartnerReasonCodesResponse.success) &&
        Objects.equals(this.warning, chanelPartnerReasonCodesResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, itemLevelRefundReasonRequired, itemLevelRefundReasons, itemLevelReturnReasons, metadata, orderLevelRefundReasonRequired, orderLevelRefundReasons, orderLevelRejectReasonRequired, orderLevelRejectReasons, success, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChanelPartnerReasonCodesResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    itemLevelRefundReasonRequired: ").append(toIndentedString(itemLevelRefundReasonRequired)).append("\n");
    sb.append("    itemLevelRefundReasons: ").append(toIndentedString(itemLevelRefundReasons)).append("\n");
    sb.append("    itemLevelReturnReasons: ").append(toIndentedString(itemLevelReturnReasons)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    orderLevelRefundReasonRequired: ").append(toIndentedString(orderLevelRefundReasonRequired)).append("\n");
    sb.append("    orderLevelRefundReasons: ").append(toIndentedString(orderLevelRefundReasons)).append("\n");
    sb.append("    orderLevelRejectReasonRequired: ").append(toIndentedString(orderLevelRejectReasonRequired)).append("\n");
    sb.append("    orderLevelRejectReasons: ").append(toIndentedString(orderLevelRejectReasons)).append("\n");
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
    openapiFields.add("item_level_refund_reason_required");
    openapiFields.add("item_level_refund_reasons");
    openapiFields.add("item_level_return_reasons");
    openapiFields.add("metadata");
    openapiFields.add("order_level_refund_reason_required");
    openapiFields.add("order_level_refund_reasons");
    openapiFields.add("order_level_reject_reason_required");
    openapiFields.add("order_level_reject_reasons");
    openapiFields.add("success");
    openapiFields.add("warning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChanelPartnerReasonCodesResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChanelPartnerReasonCodesResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChanelPartnerReasonCodesResponse is not found in the empty JSON string", ChanelPartnerReasonCodesResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChanelPartnerReasonCodesResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChanelPartnerReasonCodesResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `error`
      if (jsonObj.getAsJsonObject("error") != null) {
        Error.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      JsonArray jsonArrayitemLevelRefundReasons = jsonObj.getAsJsonArray("item_level_refund_reasons");
      if (jsonArrayitemLevelRefundReasons != null) {
        // ensure the json data is an array
        if (!jsonObj.get("item_level_refund_reasons").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `item_level_refund_reasons` to be an array in the JSON string but got `%s`", jsonObj.get("item_level_refund_reasons").toString()));
        }

        // validate the optional field `item_level_refund_reasons` (array)
        for (int i = 0; i < jsonArrayitemLevelRefundReasons.size(); i++) {
          OrderReason.validateJsonObject(jsonArrayitemLevelRefundReasons.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayitemLevelReturnReasons = jsonObj.getAsJsonArray("item_level_return_reasons");
      if (jsonArrayitemLevelReturnReasons != null) {
        // ensure the json data is an array
        if (!jsonObj.get("item_level_return_reasons").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `item_level_return_reasons` to be an array in the JSON string but got `%s`", jsonObj.get("item_level_return_reasons").toString()));
        }

        // validate the optional field `item_level_return_reasons` (array)
        for (int i = 0; i < jsonArrayitemLevelReturnReasons.size(); i++) {
          OrderReason.validateJsonObject(jsonArrayitemLevelReturnReasons.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `metadata`
      if (jsonObj.getAsJsonObject("metadata") != null) {
        ResponseMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      JsonArray jsonArrayorderLevelRefundReasons = jsonObj.getAsJsonArray("order_level_refund_reasons");
      if (jsonArrayorderLevelRefundReasons != null) {
        // ensure the json data is an array
        if (!jsonObj.get("order_level_refund_reasons").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `order_level_refund_reasons` to be an array in the JSON string but got `%s`", jsonObj.get("order_level_refund_reasons").toString()));
        }

        // validate the optional field `order_level_refund_reasons` (array)
        for (int i = 0; i < jsonArrayorderLevelRefundReasons.size(); i++) {
          OrderReason.validateJsonObject(jsonArrayorderLevelRefundReasons.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayorderLevelRejectReasons = jsonObj.getAsJsonArray("order_level_reject_reasons");
      if (jsonArrayorderLevelRejectReasons != null) {
        // ensure the json data is an array
        if (!jsonObj.get("order_level_reject_reasons").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `order_level_reject_reasons` to be an array in the JSON string but got `%s`", jsonObj.get("order_level_reject_reasons").toString()));
        }

        // validate the optional field `order_level_reject_reasons` (array)
        for (int i = 0; i < jsonArrayorderLevelRejectReasons.size(); i++) {
          OrderReason.validateJsonObject(jsonArrayorderLevelRejectReasons.get(i).getAsJsonObject());
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
       if (!ChanelPartnerReasonCodesResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChanelPartnerReasonCodesResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChanelPartnerReasonCodesResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChanelPartnerReasonCodesResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ChanelPartnerReasonCodesResponse>() {
           @Override
           public void write(JsonWriter out, ChanelPartnerReasonCodesResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChanelPartnerReasonCodesResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChanelPartnerReasonCodesResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChanelPartnerReasonCodesResponse
  * @throws IOException if the JSON string is invalid with respect to ChanelPartnerReasonCodesResponse
  */
  public static ChanelPartnerReasonCodesResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChanelPartnerReasonCodesResponse.class);
  }

 /**
  * Convert an instance of ChanelPartnerReasonCodesResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

