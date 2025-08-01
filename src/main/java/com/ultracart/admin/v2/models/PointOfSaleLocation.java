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
 * PointOfSaleLocation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class PointOfSaleLocation {
  public static final String SERIALIZED_NAME_ADDDRESS2 = "adddress2";
  @SerializedName(SERIALIZED_NAME_ADDDRESS2)
  private String adddress2;

  public static final String SERIALIZED_NAME_ADDRESS1 = "address1";
  @SerializedName(SERIALIZED_NAME_ADDRESS1)
  private String address1;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_DISTRIBUTION_CENTER_CODE = "distribution_center_code";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION_CENTER_CODE)
  private String distributionCenterCode;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "external_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchant_id";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  private String merchantId;

  public static final String SERIALIZED_NAME_POS_LOCATION_OID = "pos_location_oid";
  @SerializedName(SERIALIZED_NAME_POS_LOCATION_OID)
  private Integer posLocationOid;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "state_province";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public PointOfSaleLocation() { 
  }

  public PointOfSaleLocation adddress2(String adddress2) {
    
    this.adddress2 = adddress2;
    return this;
  }

   /**
   * Address line 2
   * @return adddress2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 2")

  public String getAdddress2() {
    return adddress2;
  }


  public void setAdddress2(String adddress2) {
    this.adddress2 = adddress2;
  }


  public PointOfSaleLocation address1(String address1) {
    
    this.address1 = address1;
    return this;
  }

   /**
   * Address line 1
   * @return address1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address line 1")

  public String getAddress1() {
    return address1;
  }


  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  public PointOfSaleLocation city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public PointOfSaleLocation country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PointOfSaleLocation distributionCenterCode(String distributionCenterCode) {
    
    this.distributionCenterCode = distributionCenterCode;
    return this;
  }

   /**
   * The distribution center code where inventory is reduced from for this sale.
   * @return distributionCenterCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The distribution center code where inventory is reduced from for this sale.")

  public String getDistributionCenterCode() {
    return distributionCenterCode;
  }


  public void setDistributionCenterCode(String distributionCenterCode) {
    this.distributionCenterCode = distributionCenterCode;
  }


  public PointOfSaleLocation externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External Id useful for syncing with a remote filesystem, this may be an MD5 hash or whatever suits your needs.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External Id useful for syncing with a remote filesystem, this may be an MD5 hash or whatever suits your needs.")

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public PointOfSaleLocation merchantId(String merchantId) {
    
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant ID that owns this location
   * @return merchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Merchant ID that owns this location")

  public String getMerchantId() {
    return merchantId;
  }


  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }


  public PointOfSaleLocation posLocationOid(Integer posLocationOid) {
    
    this.posLocationOid = posLocationOid;
    return this;
  }

   /**
   * Object identifier of the point of sale location.
   * @return posLocationOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Object identifier of the point of sale location.")

  public Integer getPosLocationOid() {
    return posLocationOid;
  }


  public void setPosLocationOid(Integer posLocationOid) {
    this.posLocationOid = posLocationOid;
  }


  public PointOfSaleLocation postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal code")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PointOfSaleLocation stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * State/province
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State/province")

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointOfSaleLocation pointOfSaleLocation = (PointOfSaleLocation) o;
    return Objects.equals(this.adddress2, pointOfSaleLocation.adddress2) &&
        Objects.equals(this.address1, pointOfSaleLocation.address1) &&
        Objects.equals(this.city, pointOfSaleLocation.city) &&
        Objects.equals(this.country, pointOfSaleLocation.country) &&
        Objects.equals(this.distributionCenterCode, pointOfSaleLocation.distributionCenterCode) &&
        Objects.equals(this.externalId, pointOfSaleLocation.externalId) &&
        Objects.equals(this.merchantId, pointOfSaleLocation.merchantId) &&
        Objects.equals(this.posLocationOid, pointOfSaleLocation.posLocationOid) &&
        Objects.equals(this.postalCode, pointOfSaleLocation.postalCode) &&
        Objects.equals(this.stateProvince, pointOfSaleLocation.stateProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adddress2, address1, city, country, distributionCenterCode, externalId, merchantId, posLocationOid, postalCode, stateProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointOfSaleLocation {\n");
    sb.append("    adddress2: ").append(toIndentedString(adddress2)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    distributionCenterCode: ").append(toIndentedString(distributionCenterCode)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    posLocationOid: ").append(toIndentedString(posLocationOid)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
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
    openapiFields.add("adddress2");
    openapiFields.add("address1");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("distribution_center_code");
    openapiFields.add("external_id");
    openapiFields.add("merchant_id");
    openapiFields.add("pos_location_oid");
    openapiFields.add("postal_code");
    openapiFields.add("state_province");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PointOfSaleLocation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PointOfSaleLocation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PointOfSaleLocation is not found in the empty JSON string", PointOfSaleLocation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PointOfSaleLocation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PointOfSaleLocation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("adddress2") != null && !jsonObj.get("adddress2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `adddress2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("adddress2").toString()));
      }
      if (jsonObj.get("address1") != null && !jsonObj.get("address1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address1").toString()));
      }
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if (jsonObj.get("distribution_center_code") != null && !jsonObj.get("distribution_center_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `distribution_center_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("distribution_center_code").toString()));
      }
      if (jsonObj.get("external_id") != null && !jsonObj.get("external_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_id").toString()));
      }
      if (jsonObj.get("merchant_id") != null && !jsonObj.get("merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_id").toString()));
      }
      if (jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      if (jsonObj.get("state_province") != null && !jsonObj.get("state_province").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_province` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_province").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PointOfSaleLocation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PointOfSaleLocation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PointOfSaleLocation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PointOfSaleLocation.class));

       return (TypeAdapter<T>) new TypeAdapter<PointOfSaleLocation>() {
           @Override
           public void write(JsonWriter out, PointOfSaleLocation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PointOfSaleLocation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PointOfSaleLocation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PointOfSaleLocation
  * @throws IOException if the JSON string is invalid with respect to PointOfSaleLocation
  */
  public static PointOfSaleLocation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PointOfSaleLocation.class);
  }

 /**
  * Convert an instance of PointOfSaleLocation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

