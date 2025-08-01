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
import com.ultracart.admin.v2.models.ItemPricingTierDiscount;
import com.ultracart.admin.v2.models.ItemPricingTierLimit;
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
 * ItemPricingTier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ItemPricingTier {
  public static final String SERIALIZED_NAME_DEFAULT_TIER = "default_tier";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TIER)
  private Boolean defaultTier;

  public static final String SERIALIZED_NAME_DISCOUNTS = "discounts";
  @SerializedName(SERIALIZED_NAME_DISCOUNTS)
  private List<ItemPricingTierDiscount> discounts = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private ItemPricingTierLimit limit;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRICING_TIER_OID = "pricing_tier_oid";
  @SerializedName(SERIALIZED_NAME_PRICING_TIER_OID)
  private Integer pricingTierOid;

  public ItemPricingTier() { 
  }

  public ItemPricingTier defaultTier(Boolean defaultTier) {
    
    this.defaultTier = defaultTier;
    return this;
  }

   /**
   * True if this is the default tier
   * @return defaultTier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this is the default tier")

  public Boolean getDefaultTier() {
    return defaultTier;
  }


  public void setDefaultTier(Boolean defaultTier) {
    this.defaultTier = defaultTier;
  }


  public ItemPricingTier discounts(List<ItemPricingTierDiscount> discounts) {
    
    this.discounts = discounts;
    return this;
  }

  public ItemPricingTier addDiscountsItem(ItemPricingTierDiscount discountsItem) {
    if (this.discounts == null) {
      this.discounts = new ArrayList<>();
    }
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * Discounts
   * @return discounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Discounts")

  public List<ItemPricingTierDiscount> getDiscounts() {
    return discounts;
  }


  public void setDiscounts(List<ItemPricingTierDiscount> discounts) {
    this.discounts = discounts;
  }


  public ItemPricingTier limit(ItemPricingTierLimit limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemPricingTierLimit getLimit() {
    return limit;
  }


  public void setLimit(ItemPricingTierLimit limit) {
    this.limit = limit;
  }


  public ItemPricingTier name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Pricing tier name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pricing tier name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ItemPricingTier pricingTierOid(Integer pricingTierOid) {
    
    this.pricingTierOid = pricingTierOid;
    return this;
  }

   /**
   * Pricing tier object identifier
   * @return pricingTierOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pricing tier object identifier")

  public Integer getPricingTierOid() {
    return pricingTierOid;
  }


  public void setPricingTierOid(Integer pricingTierOid) {
    this.pricingTierOid = pricingTierOid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPricingTier itemPricingTier = (ItemPricingTier) o;
    return Objects.equals(this.defaultTier, itemPricingTier.defaultTier) &&
        Objects.equals(this.discounts, itemPricingTier.discounts) &&
        Objects.equals(this.limit, itemPricingTier.limit) &&
        Objects.equals(this.name, itemPricingTier.name) &&
        Objects.equals(this.pricingTierOid, itemPricingTier.pricingTierOid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultTier, discounts, limit, name, pricingTierOid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPricingTier {\n");
    sb.append("    defaultTier: ").append(toIndentedString(defaultTier)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pricingTierOid: ").append(toIndentedString(pricingTierOid)).append("\n");
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
    openapiFields.add("default_tier");
    openapiFields.add("discounts");
    openapiFields.add("limit");
    openapiFields.add("name");
    openapiFields.add("pricing_tier_oid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemPricingTier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemPricingTier.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemPricingTier is not found in the empty JSON string", ItemPricingTier.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemPricingTier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemPricingTier` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraydiscounts = jsonObj.getAsJsonArray("discounts");
      if (jsonArraydiscounts != null) {
        // ensure the json data is an array
        if (!jsonObj.get("discounts").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `discounts` to be an array in the JSON string but got `%s`", jsonObj.get("discounts").toString()));
        }

        // validate the optional field `discounts` (array)
        for (int i = 0; i < jsonArraydiscounts.size(); i++) {
          ItemPricingTierDiscount.validateJsonObject(jsonArraydiscounts.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `limit`
      if (jsonObj.getAsJsonObject("limit") != null) {
        ItemPricingTierLimit.validateJsonObject(jsonObj.getAsJsonObject("limit"));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemPricingTier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemPricingTier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemPricingTier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemPricingTier.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemPricingTier>() {
           @Override
           public void write(JsonWriter out, ItemPricingTier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemPricingTier read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemPricingTier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemPricingTier
  * @throws IOException if the JSON string is invalid with respect to ItemPricingTier
  */
  public static ItemPricingTier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemPricingTier.class);
  }

 /**
  * Convert an instance of ItemPricingTier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

