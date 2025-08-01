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
 * CouponBuyOneGetOneLimit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class CouponBuyOneGetOneLimit {
  public static final String SERIALIZED_NAME_ITEM_TAGS = "item_tags";
  @SerializedName(SERIALIZED_NAME_ITEM_TAGS)
  private List<String> itemTags = null;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<String> items = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public CouponBuyOneGetOneLimit() { 
  }

  public CouponBuyOneGetOneLimit itemTags(List<String> itemTags) {
    
    this.itemTags = itemTags;
    return this;
  }

  public CouponBuyOneGetOneLimit addItemTagsItem(String itemTagsItem) {
    if (this.itemTags == null) {
      this.itemTags = new ArrayList<>();
    }
    this.itemTags.add(itemTagsItem);
    return this;
  }

   /**
   * An optional list of item tags which will receive a discount.
   * @return itemTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional list of item tags which will receive a discount.")

  public List<String> getItemTags() {
    return itemTags;
  }


  public void setItemTags(List<String> itemTags) {
    this.itemTags = itemTags;
  }


  public CouponBuyOneGetOneLimit items(List<String> items) {
    
    this.items = items;
    return this;
  }

  public CouponBuyOneGetOneLimit addItemsItem(String itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * An optional list of items of which one must be purchased to receive free quantity of the same item.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An optional list of items of which one must be purchased to receive free quantity of the same item.")

  public List<String> getItems() {
    return items;
  }


  public void setItems(List<String> items) {
    this.items = items;
  }


  public CouponBuyOneGetOneLimit limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The limit of free items that may be received when purchasing multiple items
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The limit of free items that may be received when purchasing multiple items")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponBuyOneGetOneLimit couponBuyOneGetOneLimit = (CouponBuyOneGetOneLimit) o;
    return Objects.equals(this.itemTags, couponBuyOneGetOneLimit.itemTags) &&
        Objects.equals(this.items, couponBuyOneGetOneLimit.items) &&
        Objects.equals(this.limit, couponBuyOneGetOneLimit.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemTags, items, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponBuyOneGetOneLimit {\n");
    sb.append("    itemTags: ").append(toIndentedString(itemTags)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("item_tags");
    openapiFields.add("items");
    openapiFields.add("limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CouponBuyOneGetOneLimit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CouponBuyOneGetOneLimit.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CouponBuyOneGetOneLimit is not found in the empty JSON string", CouponBuyOneGetOneLimit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CouponBuyOneGetOneLimit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CouponBuyOneGetOneLimit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("item_tags") != null && !jsonObj.get("item_tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_tags` to be an array in the JSON string but got `%s`", jsonObj.get("item_tags").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CouponBuyOneGetOneLimit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CouponBuyOneGetOneLimit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CouponBuyOneGetOneLimit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CouponBuyOneGetOneLimit.class));

       return (TypeAdapter<T>) new TypeAdapter<CouponBuyOneGetOneLimit>() {
           @Override
           public void write(JsonWriter out, CouponBuyOneGetOneLimit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CouponBuyOneGetOneLimit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CouponBuyOneGetOneLimit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CouponBuyOneGetOneLimit
  * @throws IOException if the JSON string is invalid with respect to CouponBuyOneGetOneLimit
  */
  public static CouponBuyOneGetOneLimit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CouponBuyOneGetOneLimit.class);
  }

 /**
  * Convert an instance of CouponBuyOneGetOneLimit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

