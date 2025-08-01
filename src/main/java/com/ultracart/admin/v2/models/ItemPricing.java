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
import com.ultracart.admin.v2.models.ItemPricingTier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
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
 * ItemPricing
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ItemPricing {
  public static final String SERIALIZED_NAME_ALLOW_ARBITRARY_COST = "allow_arbitrary_cost";
  @SerializedName(SERIALIZED_NAME_ALLOW_ARBITRARY_COST)
  private Boolean allowArbitraryCost;

  public static final String SERIALIZED_NAME_ARBITRARY_COST_VELOCITY_CODE = "arbitrary_cost_velocity_code";
  @SerializedName(SERIALIZED_NAME_ARBITRARY_COST_VELOCITY_CODE)
  private String arbitraryCostVelocityCode;

  public static final String SERIALIZED_NAME_AUTO_ORDER_COST = "auto_order_cost";
  @SerializedName(SERIALIZED_NAME_AUTO_ORDER_COST)
  private BigDecimal autoOrderCost;

  public static final String SERIALIZED_NAME_AUTOMATIC_PRICING_TIER_NAME = "automatic_pricing_tier_name";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_PRICING_TIER_NAME)
  private String automaticPricingTierName;

  public static final String SERIALIZED_NAME_AUTOMATIC_PRICING_TIER_OID = "automatic_pricing_tier_oid";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_PRICING_TIER_OID)
  private Integer automaticPricingTierOid;

  public static final String SERIALIZED_NAME_COGS = "cogs";
  @SerializedName(SERIALIZED_NAME_COGS)
  private BigDecimal cogs;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private BigDecimal cost;

  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currency_code";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_MANUFACTURER_SUGGESTED_RETAIL_PRICE = "manufacturer_suggested_retail_price";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER_SUGGESTED_RETAIL_PRICE)
  private BigDecimal manufacturerSuggestedRetailPrice;

  public static final String SERIALIZED_NAME_MAXIMUM_ARBITRARY_COST = "maximum_arbitrary_cost";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_ARBITRARY_COST)
  private BigDecimal maximumArbitraryCost;

  public static final String SERIALIZED_NAME_MINIMUM_ADVERTISED_PRICE = "minimum_advertised_price";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ADVERTISED_PRICE)
  private BigDecimal minimumAdvertisedPrice;

  public static final String SERIALIZED_NAME_MINIMUM_ARBITRARY_COST = "minimum_arbitrary_cost";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ARBITRARY_COST)
  private BigDecimal minimumArbitraryCost;

  public static final String SERIALIZED_NAME_MIX_AND_MATCH_GROUP = "mix_and_match_group";
  @SerializedName(SERIALIZED_NAME_MIX_AND_MATCH_GROUP)
  private String mixAndMatchGroup;

  public static final String SERIALIZED_NAME_MIX_AND_MATCH_GROUP_OID = "mix_and_match_group_oid";
  @SerializedName(SERIALIZED_NAME_MIX_AND_MATCH_GROUP_OID)
  private Integer mixAndMatchGroupOid;

  public static final String SERIALIZED_NAME_SALE_COST = "sale_cost";
  @SerializedName(SERIALIZED_NAME_SALE_COST)
  private BigDecimal saleCost;

  public static final String SERIALIZED_NAME_SALE_END = "sale_end";
  @SerializedName(SERIALIZED_NAME_SALE_END)
  private String saleEnd;

  public static final String SERIALIZED_NAME_SALE_START = "sale_start";
  @SerializedName(SERIALIZED_NAME_SALE_START)
  private String saleStart;

  public static final String SERIALIZED_NAME_TIERS = "tiers";
  @SerializedName(SERIALIZED_NAME_TIERS)
  private List<ItemPricingTier> tiers = null;

  public ItemPricing() { 
  }

  public ItemPricing allowArbitraryCost(Boolean allowArbitraryCost) {
    
    this.allowArbitraryCost = allowArbitraryCost;
    return this;
  }

   /**
   * Allow arbitrary cost
   * @return allowArbitraryCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow arbitrary cost")

  public Boolean getAllowArbitraryCost() {
    return allowArbitraryCost;
  }


  public void setAllowArbitraryCost(Boolean allowArbitraryCost) {
    this.allowArbitraryCost = allowArbitraryCost;
  }


  public ItemPricing arbitraryCostVelocityCode(String arbitraryCostVelocityCode) {
    
    this.arbitraryCostVelocityCode = arbitraryCostVelocityCode;
    return this;
  }

   /**
   * Arbitrary cost velocity code
   * @return arbitraryCostVelocityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary cost velocity code")

  public String getArbitraryCostVelocityCode() {
    return arbitraryCostVelocityCode;
  }


  public void setArbitraryCostVelocityCode(String arbitraryCostVelocityCode) {
    this.arbitraryCostVelocityCode = arbitraryCostVelocityCode;
  }


  public ItemPricing autoOrderCost(BigDecimal autoOrderCost) {
    
    this.autoOrderCost = autoOrderCost;
    return this;
  }

   /**
   * Cost if customer selects to receive item on auto order.  Set to zero to delete.
   * @return autoOrderCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cost if customer selects to receive item on auto order.  Set to zero to delete.")

  public BigDecimal getAutoOrderCost() {
    return autoOrderCost;
  }


  public void setAutoOrderCost(BigDecimal autoOrderCost) {
    this.autoOrderCost = autoOrderCost;
  }


  public ItemPricing automaticPricingTierName(String automaticPricingTierName) {
    
    this.automaticPricingTierName = automaticPricingTierName;
    return this;
  }

   /**
   * Automatic pricing tier name
   * @return automaticPricingTierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Automatic pricing tier name")

  public String getAutomaticPricingTierName() {
    return automaticPricingTierName;
  }


  public void setAutomaticPricingTierName(String automaticPricingTierName) {
    this.automaticPricingTierName = automaticPricingTierName;
  }


  public ItemPricing automaticPricingTierOid(Integer automaticPricingTierOid) {
    
    this.automaticPricingTierOid = automaticPricingTierOid;
    return this;
  }

   /**
   * Automatic pricing tier object identifier
   * @return automaticPricingTierOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Automatic pricing tier object identifier")

  public Integer getAutomaticPricingTierOid() {
    return automaticPricingTierOid;
  }


  public void setAutomaticPricingTierOid(Integer automaticPricingTierOid) {
    this.automaticPricingTierOid = automaticPricingTierOid;
  }


  public ItemPricing cogs(BigDecimal cogs) {
    
    this.cogs = cogs;
    return this;
  }

   /**
   * Cost of goods sold
   * @return cogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cost of goods sold")

  public BigDecimal getCogs() {
    return cogs;
  }


  public void setCogs(BigDecimal cogs) {
    this.cogs = cogs;
  }


  public ItemPricing cost(BigDecimal cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cost")

  public BigDecimal getCost() {
    return cost;
  }


  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }


  public ItemPricing currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Currency code
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency code")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public ItemPricing manufacturerSuggestedRetailPrice(BigDecimal manufacturerSuggestedRetailPrice) {
    
    this.manufacturerSuggestedRetailPrice = manufacturerSuggestedRetailPrice;
    return this;
  }

   /**
   * Manufacturer suggested retail price
   * @return manufacturerSuggestedRetailPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manufacturer suggested retail price")

  public BigDecimal getManufacturerSuggestedRetailPrice() {
    return manufacturerSuggestedRetailPrice;
  }


  public void setManufacturerSuggestedRetailPrice(BigDecimal manufacturerSuggestedRetailPrice) {
    this.manufacturerSuggestedRetailPrice = manufacturerSuggestedRetailPrice;
  }


  public ItemPricing maximumArbitraryCost(BigDecimal maximumArbitraryCost) {
    
    this.maximumArbitraryCost = maximumArbitraryCost;
    return this;
  }

   /**
   * Maximum arbitrary cost
   * @return maximumArbitraryCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum arbitrary cost")

  public BigDecimal getMaximumArbitraryCost() {
    return maximumArbitraryCost;
  }


  public void setMaximumArbitraryCost(BigDecimal maximumArbitraryCost) {
    this.maximumArbitraryCost = maximumArbitraryCost;
  }


  public ItemPricing minimumAdvertisedPrice(BigDecimal minimumAdvertisedPrice) {
    
    this.minimumAdvertisedPrice = minimumAdvertisedPrice;
    return this;
  }

   /**
   * Minimum advertised price
   * @return minimumAdvertisedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum advertised price")

  public BigDecimal getMinimumAdvertisedPrice() {
    return minimumAdvertisedPrice;
  }


  public void setMinimumAdvertisedPrice(BigDecimal minimumAdvertisedPrice) {
    this.minimumAdvertisedPrice = minimumAdvertisedPrice;
  }


  public ItemPricing minimumArbitraryCost(BigDecimal minimumArbitraryCost) {
    
    this.minimumArbitraryCost = minimumArbitraryCost;
    return this;
  }

   /**
   * Minimum arbitrary cost
   * @return minimumArbitraryCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum arbitrary cost")

  public BigDecimal getMinimumArbitraryCost() {
    return minimumArbitraryCost;
  }


  public void setMinimumArbitraryCost(BigDecimal minimumArbitraryCost) {
    this.minimumArbitraryCost = minimumArbitraryCost;
  }


  public ItemPricing mixAndMatchGroup(String mixAndMatchGroup) {
    
    this.mixAndMatchGroup = mixAndMatchGroup;
    return this;
  }

   /**
   * Mix and match group
   * @return mixAndMatchGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mix and match group")

  public String getMixAndMatchGroup() {
    return mixAndMatchGroup;
  }


  public void setMixAndMatchGroup(String mixAndMatchGroup) {
    this.mixAndMatchGroup = mixAndMatchGroup;
  }


  public ItemPricing mixAndMatchGroupOid(Integer mixAndMatchGroupOid) {
    
    this.mixAndMatchGroupOid = mixAndMatchGroupOid;
    return this;
  }

   /**
   * Mix and match group object identifier
   * @return mixAndMatchGroupOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mix and match group object identifier")

  public Integer getMixAndMatchGroupOid() {
    return mixAndMatchGroupOid;
  }


  public void setMixAndMatchGroupOid(Integer mixAndMatchGroupOid) {
    this.mixAndMatchGroupOid = mixAndMatchGroupOid;
  }


  public ItemPricing saleCost(BigDecimal saleCost) {
    
    this.saleCost = saleCost;
    return this;
  }

   /**
   * Sale cost
   * @return saleCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sale cost")

  public BigDecimal getSaleCost() {
    return saleCost;
  }


  public void setSaleCost(BigDecimal saleCost) {
    this.saleCost = saleCost;
  }


  public ItemPricing saleEnd(String saleEnd) {
    
    this.saleEnd = saleEnd;
    return this;
  }

   /**
   * Sale end
   * @return saleEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sale end")

  public String getSaleEnd() {
    return saleEnd;
  }


  public void setSaleEnd(String saleEnd) {
    this.saleEnd = saleEnd;
  }


  public ItemPricing saleStart(String saleStart) {
    
    this.saleStart = saleStart;
    return this;
  }

   /**
   * Sale start
   * @return saleStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sale start")

  public String getSaleStart() {
    return saleStart;
  }


  public void setSaleStart(String saleStart) {
    this.saleStart = saleStart;
  }


  public ItemPricing tiers(List<ItemPricingTier> tiers) {
    
    this.tiers = tiers;
    return this;
  }

  public ItemPricing addTiersItem(ItemPricingTier tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<>();
    }
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * Tiers
   * @return tiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tiers")

  public List<ItemPricingTier> getTiers() {
    return tiers;
  }


  public void setTiers(List<ItemPricingTier> tiers) {
    this.tiers = tiers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPricing itemPricing = (ItemPricing) o;
    return Objects.equals(this.allowArbitraryCost, itemPricing.allowArbitraryCost) &&
        Objects.equals(this.arbitraryCostVelocityCode, itemPricing.arbitraryCostVelocityCode) &&
        Objects.equals(this.autoOrderCost, itemPricing.autoOrderCost) &&
        Objects.equals(this.automaticPricingTierName, itemPricing.automaticPricingTierName) &&
        Objects.equals(this.automaticPricingTierOid, itemPricing.automaticPricingTierOid) &&
        Objects.equals(this.cogs, itemPricing.cogs) &&
        Objects.equals(this.cost, itemPricing.cost) &&
        Objects.equals(this.currencyCode, itemPricing.currencyCode) &&
        Objects.equals(this.manufacturerSuggestedRetailPrice, itemPricing.manufacturerSuggestedRetailPrice) &&
        Objects.equals(this.maximumArbitraryCost, itemPricing.maximumArbitraryCost) &&
        Objects.equals(this.minimumAdvertisedPrice, itemPricing.minimumAdvertisedPrice) &&
        Objects.equals(this.minimumArbitraryCost, itemPricing.minimumArbitraryCost) &&
        Objects.equals(this.mixAndMatchGroup, itemPricing.mixAndMatchGroup) &&
        Objects.equals(this.mixAndMatchGroupOid, itemPricing.mixAndMatchGroupOid) &&
        Objects.equals(this.saleCost, itemPricing.saleCost) &&
        Objects.equals(this.saleEnd, itemPricing.saleEnd) &&
        Objects.equals(this.saleStart, itemPricing.saleStart) &&
        Objects.equals(this.tiers, itemPricing.tiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowArbitraryCost, arbitraryCostVelocityCode, autoOrderCost, automaticPricingTierName, automaticPricingTierOid, cogs, cost, currencyCode, manufacturerSuggestedRetailPrice, maximumArbitraryCost, minimumAdvertisedPrice, minimumArbitraryCost, mixAndMatchGroup, mixAndMatchGroupOid, saleCost, saleEnd, saleStart, tiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPricing {\n");
    sb.append("    allowArbitraryCost: ").append(toIndentedString(allowArbitraryCost)).append("\n");
    sb.append("    arbitraryCostVelocityCode: ").append(toIndentedString(arbitraryCostVelocityCode)).append("\n");
    sb.append("    autoOrderCost: ").append(toIndentedString(autoOrderCost)).append("\n");
    sb.append("    automaticPricingTierName: ").append(toIndentedString(automaticPricingTierName)).append("\n");
    sb.append("    automaticPricingTierOid: ").append(toIndentedString(automaticPricingTierOid)).append("\n");
    sb.append("    cogs: ").append(toIndentedString(cogs)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    manufacturerSuggestedRetailPrice: ").append(toIndentedString(manufacturerSuggestedRetailPrice)).append("\n");
    sb.append("    maximumArbitraryCost: ").append(toIndentedString(maximumArbitraryCost)).append("\n");
    sb.append("    minimumAdvertisedPrice: ").append(toIndentedString(minimumAdvertisedPrice)).append("\n");
    sb.append("    minimumArbitraryCost: ").append(toIndentedString(minimumArbitraryCost)).append("\n");
    sb.append("    mixAndMatchGroup: ").append(toIndentedString(mixAndMatchGroup)).append("\n");
    sb.append("    mixAndMatchGroupOid: ").append(toIndentedString(mixAndMatchGroupOid)).append("\n");
    sb.append("    saleCost: ").append(toIndentedString(saleCost)).append("\n");
    sb.append("    saleEnd: ").append(toIndentedString(saleEnd)).append("\n");
    sb.append("    saleStart: ").append(toIndentedString(saleStart)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
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
    openapiFields.add("allow_arbitrary_cost");
    openapiFields.add("arbitrary_cost_velocity_code");
    openapiFields.add("auto_order_cost");
    openapiFields.add("automatic_pricing_tier_name");
    openapiFields.add("automatic_pricing_tier_oid");
    openapiFields.add("cogs");
    openapiFields.add("cost");
    openapiFields.add("currency_code");
    openapiFields.add("manufacturer_suggested_retail_price");
    openapiFields.add("maximum_arbitrary_cost");
    openapiFields.add("minimum_advertised_price");
    openapiFields.add("minimum_arbitrary_cost");
    openapiFields.add("mix_and_match_group");
    openapiFields.add("mix_and_match_group_oid");
    openapiFields.add("sale_cost");
    openapiFields.add("sale_end");
    openapiFields.add("sale_start");
    openapiFields.add("tiers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemPricing
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemPricing.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemPricing is not found in the empty JSON string", ItemPricing.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemPricing.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemPricing` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("arbitrary_cost_velocity_code") != null && !jsonObj.get("arbitrary_cost_velocity_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arbitrary_cost_velocity_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arbitrary_cost_velocity_code").toString()));
      }
      if (jsonObj.get("automatic_pricing_tier_name") != null && !jsonObj.get("automatic_pricing_tier_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `automatic_pricing_tier_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("automatic_pricing_tier_name").toString()));
      }
      if (jsonObj.get("currency_code") != null && !jsonObj.get("currency_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_code").toString()));
      }
      if (jsonObj.get("mix_and_match_group") != null && !jsonObj.get("mix_and_match_group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mix_and_match_group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mix_and_match_group").toString()));
      }
      if (jsonObj.get("sale_end") != null && !jsonObj.get("sale_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_end").toString()));
      }
      if (jsonObj.get("sale_start") != null && !jsonObj.get("sale_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_start").toString()));
      }
      JsonArray jsonArraytiers = jsonObj.getAsJsonArray("tiers");
      if (jsonArraytiers != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tiers").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tiers` to be an array in the JSON string but got `%s`", jsonObj.get("tiers").toString()));
        }

        // validate the optional field `tiers` (array)
        for (int i = 0; i < jsonArraytiers.size(); i++) {
          ItemPricingTier.validateJsonObject(jsonArraytiers.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemPricing.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemPricing' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemPricing> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemPricing.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemPricing>() {
           @Override
           public void write(JsonWriter out, ItemPricing value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemPricing read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemPricing given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemPricing
  * @throws IOException if the JSON string is invalid with respect to ItemPricing
  */
  public static ItemPricing fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemPricing.class);
  }

 /**
  * Convert an instance of ItemPricing to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

