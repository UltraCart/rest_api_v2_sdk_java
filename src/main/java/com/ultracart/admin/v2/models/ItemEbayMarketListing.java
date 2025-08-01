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
import java.math.BigDecimal;

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
 * ItemEbayMarketListing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ItemEbayMarketListing {
  public static final String SERIALIZED_NAME_AUCTION_ID = "auction_id";
  @SerializedName(SERIALIZED_NAME_AUCTION_ID)
  private String auctionId;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private BigDecimal price;

  public static final String SERIALIZED_NAME_SELLER = "seller";
  @SerializedName(SERIALIZED_NAME_SELLER)
  private String seller;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  private BigDecimal shipping;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public ItemEbayMarketListing() { 
  }

  public ItemEbayMarketListing auctionId(String auctionId) {
    
    this.auctionId = auctionId;
    return this;
  }

   /**
   * Auction ID
   * @return auctionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auction ID")

  public String getAuctionId() {
    return auctionId;
  }


  public void setAuctionId(String auctionId) {
    this.auctionId = auctionId;
  }


  public ItemEbayMarketListing price(BigDecimal price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price")

  public BigDecimal getPrice() {
    return price;
  }


  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public ItemEbayMarketListing seller(String seller) {
    
    this.seller = seller;
    return this;
  }

   /**
   * Seller
   * @return seller
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seller")

  public String getSeller() {
    return seller;
  }


  public void setSeller(String seller) {
    this.seller = seller;
  }


  public ItemEbayMarketListing shipping(BigDecimal shipping) {
    
    this.shipping = shipping;
    return this;
  }

   /**
   * Shipping
   * @return shipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipping")

  public BigDecimal getShipping() {
    return shipping;
  }


  public void setShipping(BigDecimal shipping) {
    this.shipping = shipping;
  }


  public ItemEbayMarketListing total(BigDecimal total) {
    
    this.total = total;
    return this;
  }

   /**
   * Total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total")

  public BigDecimal getTotal() {
    return total;
  }


  public void setTotal(BigDecimal total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemEbayMarketListing itemEbayMarketListing = (ItemEbayMarketListing) o;
    return Objects.equals(this.auctionId, itemEbayMarketListing.auctionId) &&
        Objects.equals(this.price, itemEbayMarketListing.price) &&
        Objects.equals(this.seller, itemEbayMarketListing.seller) &&
        Objects.equals(this.shipping, itemEbayMarketListing.shipping) &&
        Objects.equals(this.total, itemEbayMarketListing.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auctionId, price, seller, shipping, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemEbayMarketListing {\n");
    sb.append("    auctionId: ").append(toIndentedString(auctionId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("auction_id");
    openapiFields.add("price");
    openapiFields.add("seller");
    openapiFields.add("shipping");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemEbayMarketListing
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemEbayMarketListing.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemEbayMarketListing is not found in the empty JSON string", ItemEbayMarketListing.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemEbayMarketListing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemEbayMarketListing` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("auction_id") != null && !jsonObj.get("auction_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auction_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auction_id").toString()));
      }
      if (jsonObj.get("seller") != null && !jsonObj.get("seller").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `seller` to be a primitive type in the JSON string but got `%s`", jsonObj.get("seller").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemEbayMarketListing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemEbayMarketListing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemEbayMarketListing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemEbayMarketListing.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemEbayMarketListing>() {
           @Override
           public void write(JsonWriter out, ItemEbayMarketListing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemEbayMarketListing read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemEbayMarketListing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemEbayMarketListing
  * @throws IOException if the JSON string is invalid with respect to ItemEbayMarketListing
  */
  public static ItemEbayMarketListing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemEbayMarketListing.class);
  }

 /**
  * Convert an instance of ItemEbayMarketListing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

