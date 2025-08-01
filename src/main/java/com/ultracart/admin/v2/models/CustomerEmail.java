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
 * CustomerEmail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class CustomerEmail {
  public static final String SERIALIZED_NAME_CUSTOMER_PROFILE_EMAIL_OID = "customer_profile_email_oid";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_PROFILE_EMAIL_OID)
  private Integer customerProfileEmailOid;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_RECEIPT_NOTIFICATION = "receipt_notification";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NOTIFICATION)
  private Boolean receiptNotification;

  public static final String SERIALIZED_NAME_REFUND_NOTIFICATION = "refund_notification";
  @SerializedName(SERIALIZED_NAME_REFUND_NOTIFICATION)
  private Boolean refundNotification;

  public static final String SERIALIZED_NAME_SHIPMENT_NOTIFICATION = "shipment_notification";
  @SerializedName(SERIALIZED_NAME_SHIPMENT_NOTIFICATION)
  private Boolean shipmentNotification;

  public CustomerEmail() { 
  }

  public CustomerEmail customerProfileEmailOid(Integer customerProfileEmailOid) {
    
    this.customerProfileEmailOid = customerProfileEmailOid;
    return this;
  }

   /**
   * ID of the email
   * @return customerProfileEmailOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the email")

  public Integer getCustomerProfileEmailOid() {
    return customerProfileEmailOid;
  }


  public void setCustomerProfileEmailOid(Integer customerProfileEmailOid) {
    this.customerProfileEmailOid = customerProfileEmailOid;
  }


  public CustomerEmail email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public CustomerEmail label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * Label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Label")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public CustomerEmail receiptNotification(Boolean receiptNotification) {
    
    this.receiptNotification = receiptNotification;
    return this;
  }

   /**
   * CC this email on receipt notifications
   * @return receiptNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CC this email on receipt notifications")

  public Boolean getReceiptNotification() {
    return receiptNotification;
  }


  public void setReceiptNotification(Boolean receiptNotification) {
    this.receiptNotification = receiptNotification;
  }


  public CustomerEmail refundNotification(Boolean refundNotification) {
    
    this.refundNotification = refundNotification;
    return this;
  }

   /**
   * CC this email on refund notifications
   * @return refundNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CC this email on refund notifications")

  public Boolean getRefundNotification() {
    return refundNotification;
  }


  public void setRefundNotification(Boolean refundNotification) {
    this.refundNotification = refundNotification;
  }


  public CustomerEmail shipmentNotification(Boolean shipmentNotification) {
    
    this.shipmentNotification = shipmentNotification;
    return this;
  }

   /**
   * CC this email on shipment notifications
   * @return shipmentNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CC this email on shipment notifications")

  public Boolean getShipmentNotification() {
    return shipmentNotification;
  }


  public void setShipmentNotification(Boolean shipmentNotification) {
    this.shipmentNotification = shipmentNotification;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerEmail customerEmail = (CustomerEmail) o;
    return Objects.equals(this.customerProfileEmailOid, customerEmail.customerProfileEmailOid) &&
        Objects.equals(this.email, customerEmail.email) &&
        Objects.equals(this.label, customerEmail.label) &&
        Objects.equals(this.receiptNotification, customerEmail.receiptNotification) &&
        Objects.equals(this.refundNotification, customerEmail.refundNotification) &&
        Objects.equals(this.shipmentNotification, customerEmail.shipmentNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerProfileEmailOid, email, label, receiptNotification, refundNotification, shipmentNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerEmail {\n");
    sb.append("    customerProfileEmailOid: ").append(toIndentedString(customerProfileEmailOid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    receiptNotification: ").append(toIndentedString(receiptNotification)).append("\n");
    sb.append("    refundNotification: ").append(toIndentedString(refundNotification)).append("\n");
    sb.append("    shipmentNotification: ").append(toIndentedString(shipmentNotification)).append("\n");
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
    openapiFields.add("customer_profile_email_oid");
    openapiFields.add("email");
    openapiFields.add("label");
    openapiFields.add("receipt_notification");
    openapiFields.add("refund_notification");
    openapiFields.add("shipment_notification");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerEmail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerEmail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerEmail is not found in the empty JSON string", CustomerEmail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerEmail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerEmail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("label") != null && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerEmail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerEmail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerEmail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerEmail.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerEmail>() {
           @Override
           public void write(JsonWriter out, CustomerEmail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerEmail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerEmail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerEmail
  * @throws IOException if the JSON string is invalid with respect to CustomerEmail
  */
  public static CustomerEmail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerEmail.class);
  }

 /**
  * Convert an instance of CustomerEmail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

