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
 * CustomerEDI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-13T10:18:15.535-05:00[America/Indianapolis]")
public class CustomerEDI {
  public static final String SERIALIZED_NAME_CHANNEL_PARTNER_OID = "channel_partner_oid";
  @SerializedName(SERIALIZED_NAME_CHANNEL_PARTNER_OID)
  private Integer channelPartnerOid;

  public static final String SERIALIZED_NAME_DISTRIBUTION_CENTER_NUMBER = "distribution_center_number";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_CENTER_NUMBER)
  private String distributionCenterNumber;

  public static final String SERIALIZED_NAME_STORE_NUMBER = "store_number";
  @SerializedName(SERIALIZED_NAME_STORE_NUMBER)
  private String storeNumber;

  public CustomerEDI() { 
  }

  public CustomerEDI channelPartnerOid(Integer channelPartnerOid) {
    
    this.channelPartnerOid = channelPartnerOid;
    return this;
  }

   /**
   * EDI channel partner this customer profile is associated with
   * @return channelPartnerOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EDI channel partner this customer profile is associated with")

  public Integer getChannelPartnerOid() {
    return channelPartnerOid;
  }


  public void setChannelPartnerOid(Integer channelPartnerOid) {
    this.channelPartnerOid = channelPartnerOid;
  }


  public CustomerEDI distributionCenterNumber(String distributionCenterNumber) {
    
    this.distributionCenterNumber = distributionCenterNumber;
    return this;
  }

   /**
   * The EDI distribution center number associated with this customer profile.
   * @return distributionCenterNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EDI distribution center number associated with this customer profile.")

  public String getDistributionCenterNumber() {
    return distributionCenterNumber;
  }


  public void setDistributionCenterNumber(String distributionCenterNumber) {
    this.distributionCenterNumber = distributionCenterNumber;
  }


  public CustomerEDI storeNumber(String storeNumber) {
    
    this.storeNumber = storeNumber;
    return this;
  }

   /**
   * The EDI store number associated with this customer profile.
   * @return storeNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The EDI store number associated with this customer profile.")

  public String getStoreNumber() {
    return storeNumber;
  }


  public void setStoreNumber(String storeNumber) {
    this.storeNumber = storeNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerEDI customerEDI = (CustomerEDI) o;
    return Objects.equals(this.channelPartnerOid, customerEDI.channelPartnerOid) &&
        Objects.equals(this.distributionCenterNumber, customerEDI.distributionCenterNumber) &&
        Objects.equals(this.storeNumber, customerEDI.storeNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelPartnerOid, distributionCenterNumber, storeNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerEDI {\n");
    sb.append("    channelPartnerOid: ").append(toIndentedString(channelPartnerOid)).append("\n");
    sb.append("    distributionCenterNumber: ").append(toIndentedString(distributionCenterNumber)).append("\n");
    sb.append("    storeNumber: ").append(toIndentedString(storeNumber)).append("\n");
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
    openapiFields.add("channel_partner_oid");
    openapiFields.add("distribution_center_number");
    openapiFields.add("store_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerEDI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerEDI.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerEDI is not found in the empty JSON string", CustomerEDI.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerEDI.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerEDI` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("distribution_center_number") != null && !jsonObj.get("distribution_center_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distribution_center_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distribution_center_number").toString()));
      }
      if (jsonObj.get("store_number") != null && !jsonObj.get("store_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_number").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerEDI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerEDI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerEDI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerEDI.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerEDI>() {
           @Override
           public void write(JsonWriter out, CustomerEDI value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerEDI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerEDI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerEDI
  * @throws IOException if the JSON string is invalid with respect to CustomerEDI
  */
  public static CustomerEDI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerEDI.class);
  }

 /**
  * Convert an instance of CustomerEDI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
