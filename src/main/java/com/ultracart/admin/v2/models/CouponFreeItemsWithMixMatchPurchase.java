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
 * CouponFreeItemsWithMixMatchPurchase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class CouponFreeItemsWithMixMatchPurchase {
  public static final String SERIALIZED_NAME_FREE_ITEM = "free_item";
  @SerializedName(SERIALIZED_NAME_FREE_ITEM)
  private String freeItem;

  public static final String SERIALIZED_NAME_FREE_QUANTITY = "free_quantity";
  @SerializedName(SERIALIZED_NAME_FREE_QUANTITY)
  private Integer freeQuantity;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_REQUIRED_PURCHASE_MIX_AND_MATCH_GROUP = "required_purchase_mix_and_match_group";
  @SerializedName(SERIALIZED_NAME_REQUIRED_PURCHASE_MIX_AND_MATCH_GROUP)
  private String requiredPurchaseMixAndMatchGroup;

  public static final String SERIALIZED_NAME_REQUIRED_PURCHASE_QUANTITY = "required_purchase_quantity";
  @SerializedName(SERIALIZED_NAME_REQUIRED_PURCHASE_QUANTITY)
  private Integer requiredPurchaseQuantity;

  public CouponFreeItemsWithMixMatchPurchase() { 
  }

  public CouponFreeItemsWithMixMatchPurchase freeItem(String freeItem) {
    
    this.freeItem = freeItem;
    return this;
  }

   /**
   * The item id of the free item that will be received when the required mix and match group quantity is purchased.
   * @return freeItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item id of the free item that will be received when the required mix and match group quantity is purchased.")

  public String getFreeItem() {
    return freeItem;
  }


  public void setFreeItem(String freeItem) {
    this.freeItem = freeItem;
  }


  public CouponFreeItemsWithMixMatchPurchase freeQuantity(Integer freeQuantity) {
    
    this.freeQuantity = freeQuantity;
    return this;
  }

   /**
   * The quantity of free item that will be received.
   * @return freeQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quantity of free item that will be received.")

  public Integer getFreeQuantity() {
    return freeQuantity;
  }


  public void setFreeQuantity(Integer freeQuantity) {
    this.freeQuantity = freeQuantity;
  }


  public CouponFreeItemsWithMixMatchPurchase limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit of free items that may be received when purchasing multiple mix and match group items
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The limit of free items that may be received when purchasing multiple mix and match group items")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public CouponFreeItemsWithMixMatchPurchase requiredPurchaseMixAndMatchGroup(String requiredPurchaseMixAndMatchGroup) {
    
    this.requiredPurchaseMixAndMatchGroup = requiredPurchaseMixAndMatchGroup;
    return this;
  }

   /**
   * Required mix and match group that must be purchased for coupon to be valid
   * @return requiredPurchaseMixAndMatchGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required mix and match group that must be purchased for coupon to be valid")

  public String getRequiredPurchaseMixAndMatchGroup() {
    return requiredPurchaseMixAndMatchGroup;
  }


  public void setRequiredPurchaseMixAndMatchGroup(String requiredPurchaseMixAndMatchGroup) {
    this.requiredPurchaseMixAndMatchGroup = requiredPurchaseMixAndMatchGroup;
  }


  public CouponFreeItemsWithMixMatchPurchase requiredPurchaseQuantity(Integer requiredPurchaseQuantity) {
    
    this.requiredPurchaseQuantity = requiredPurchaseQuantity;
    return this;
  }

   /**
   * Required quantity of mix and match group items that must be purchased for coupon to be valid
   * @return requiredPurchaseQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required quantity of mix and match group items that must be purchased for coupon to be valid")

  public Integer getRequiredPurchaseQuantity() {
    return requiredPurchaseQuantity;
  }


  public void setRequiredPurchaseQuantity(Integer requiredPurchaseQuantity) {
    this.requiredPurchaseQuantity = requiredPurchaseQuantity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponFreeItemsWithMixMatchPurchase couponFreeItemsWithMixMatchPurchase = (CouponFreeItemsWithMixMatchPurchase) o;
    return Objects.equals(this.freeItem, couponFreeItemsWithMixMatchPurchase.freeItem) &&
        Objects.equals(this.freeQuantity, couponFreeItemsWithMixMatchPurchase.freeQuantity) &&
        Objects.equals(this.limit, couponFreeItemsWithMixMatchPurchase.limit) &&
        Objects.equals(this.requiredPurchaseMixAndMatchGroup, couponFreeItemsWithMixMatchPurchase.requiredPurchaseMixAndMatchGroup) &&
        Objects.equals(this.requiredPurchaseQuantity, couponFreeItemsWithMixMatchPurchase.requiredPurchaseQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeItem, freeQuantity, limit, requiredPurchaseMixAndMatchGroup, requiredPurchaseQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponFreeItemsWithMixMatchPurchase {\n");
    sb.append("    freeItem: ").append(toIndentedString(freeItem)).append("\n");
    sb.append("    freeQuantity: ").append(toIndentedString(freeQuantity)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    requiredPurchaseMixAndMatchGroup: ").append(toIndentedString(requiredPurchaseMixAndMatchGroup)).append("\n");
    sb.append("    requiredPurchaseQuantity: ").append(toIndentedString(requiredPurchaseQuantity)).append("\n");
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
    openapiFields.add("free_item");
    openapiFields.add("free_quantity");
    openapiFields.add("limit");
    openapiFields.add("required_purchase_mix_and_match_group");
    openapiFields.add("required_purchase_quantity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CouponFreeItemsWithMixMatchPurchase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CouponFreeItemsWithMixMatchPurchase.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CouponFreeItemsWithMixMatchPurchase is not found in the empty JSON string", CouponFreeItemsWithMixMatchPurchase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CouponFreeItemsWithMixMatchPurchase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CouponFreeItemsWithMixMatchPurchase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("free_item") != null && !jsonObj.get("free_item").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `free_item` to be a primitive type in the JSON string but got `%s`", jsonObj.get("free_item").toString()));
      }
      if (jsonObj.get("required_purchase_mix_and_match_group") != null && !jsonObj.get("required_purchase_mix_and_match_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_purchase_mix_and_match_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("required_purchase_mix_and_match_group").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CouponFreeItemsWithMixMatchPurchase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CouponFreeItemsWithMixMatchPurchase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CouponFreeItemsWithMixMatchPurchase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CouponFreeItemsWithMixMatchPurchase.class));

       return (TypeAdapter<T>) new TypeAdapter<CouponFreeItemsWithMixMatchPurchase>() {
           @Override
           public void write(JsonWriter out, CouponFreeItemsWithMixMatchPurchase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CouponFreeItemsWithMixMatchPurchase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CouponFreeItemsWithMixMatchPurchase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CouponFreeItemsWithMixMatchPurchase
  * @throws IOException if the JSON string is invalid with respect to CouponFreeItemsWithMixMatchPurchase
  */
  public static CouponFreeItemsWithMixMatchPurchase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CouponFreeItemsWithMixMatchPurchase.class);
  }

 /**
  * Convert an instance of CouponFreeItemsWithMixMatchPurchase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

