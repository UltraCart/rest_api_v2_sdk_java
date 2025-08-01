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
import com.ultracart.admin.v2.models.Currency;
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
 * CartSettingsShippingEstimate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class CartSettingsShippingEstimate {
  public static final String SERIALIZED_NAME_ALLOW3RD_PARTY_BILLING = "allow_3rd_party_billing";
  @SerializedName(SERIALIZED_NAME_ALLOW3RD_PARTY_BILLING)
  private Boolean allow3rdPartyBilling;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Currency cost;

  public static final String SERIALIZED_NAME_COST_BEFORE_DISCOUNT = "cost_before_discount";
  @SerializedName(SERIALIZED_NAME_COST_BEFORE_DISCOUNT)
  private Currency costBeforeDiscount;

  public static final String SERIALIZED_NAME_DEFAULT_METHOD = "default_method";
  @SerializedName(SERIALIZED_NAME_DEFAULT_METHOD)
  private Boolean defaultMethod;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Currency discount;

  public static final String SERIALIZED_NAME_DISCOUNTED = "discounted";
  @SerializedName(SERIALIZED_NAME_DISCOUNTED)
  private Boolean discounted;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ESTIMATED_DELIVERY = "estimated_delivery";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_DELIVERY)
  private String estimatedDelivery;

  public static final String SERIALIZED_NAME_LIFT_GATE_OPTION = "lift_gate_option";
  @SerializedName(SERIALIZED_NAME_LIFT_GATE_OPTION)
  private Boolean liftGateOption;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PICKUP = "pickup";
  @SerializedName(SERIALIZED_NAME_PICKUP)
  private Boolean pickup;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private Currency tax;

  public static final String SERIALIZED_NAME_TOTAL_TAX = "total_tax";
  @SerializedName(SERIALIZED_NAME_TOTAL_TAX)
  private Currency totalTax;

  public CartSettingsShippingEstimate() { 
  }

  public CartSettingsShippingEstimate allow3rdPartyBilling(Boolean allow3rdPartyBilling) {
    
    this.allow3rdPartyBilling = allow3rdPartyBilling;
    return this;
  }

   /**
   * True if this method allows the customer to use their own shipper account number
   * @return allow3rdPartyBilling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this method allows the customer to use their own shipper account number")

  public Boolean getAllow3rdPartyBilling() {
    return allow3rdPartyBilling;
  }


  public void setAllow3rdPartyBilling(Boolean allow3rdPartyBilling) {
    this.allow3rdPartyBilling = allow3rdPartyBilling;
  }


  public CartSettingsShippingEstimate comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment to display to the customer about this method
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment to display to the customer about this method")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public CartSettingsShippingEstimate cost(Currency cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getCost() {
    return cost;
  }


  public void setCost(Currency cost) {
    this.cost = cost;
  }


  public CartSettingsShippingEstimate costBeforeDiscount(Currency costBeforeDiscount) {
    
    this.costBeforeDiscount = costBeforeDiscount;
    return this;
  }

   /**
   * Get costBeforeDiscount
   * @return costBeforeDiscount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getCostBeforeDiscount() {
    return costBeforeDiscount;
  }


  public void setCostBeforeDiscount(Currency costBeforeDiscount) {
    this.costBeforeDiscount = costBeforeDiscount;
  }


  public CartSettingsShippingEstimate defaultMethod(Boolean defaultMethod) {
    
    this.defaultMethod = defaultMethod;
    return this;
  }

   /**
   * True if this is the default method
   * @return defaultMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this is the default method")

  public Boolean getDefaultMethod() {
    return defaultMethod;
  }


  public void setDefaultMethod(Boolean defaultMethod) {
    this.defaultMethod = defaultMethod;
  }


  public CartSettingsShippingEstimate discount(Currency discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getDiscount() {
    return discount;
  }


  public void setDiscount(Currency discount) {
    this.discount = discount;
  }


  public CartSettingsShippingEstimate discounted(Boolean discounted) {
    
    this.discounted = discounted;
    return this;
  }

   /**
   * True if this method is discounted because of a coupon
   * @return discounted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this method is discounted because of a coupon")

  public Boolean getDiscounted() {
    return discounted;
  }


  public void setDiscounted(Boolean discounted) {
    this.discounted = discounted;
  }


  public CartSettingsShippingEstimate displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name to display to the customer
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name to display to the customer")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CartSettingsShippingEstimate estimatedDelivery(String estimatedDelivery) {
    
    this.estimatedDelivery = estimatedDelivery;
    return this;
  }

   /**
   * Date of the estimated delivery (or range)
   * @return estimatedDelivery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the estimated delivery (or range)")

  public String getEstimatedDelivery() {
    return estimatedDelivery;
  }


  public void setEstimatedDelivery(String estimatedDelivery) {
    this.estimatedDelivery = estimatedDelivery;
  }


  public CartSettingsShippingEstimate liftGateOption(Boolean liftGateOption) {
    
    this.liftGateOption = liftGateOption;
    return this;
  }

   /**
   * True if a lift gate option for this method should be offered to the customer
   * @return liftGateOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if a lift gate option for this method should be offered to the customer")

  public Boolean getLiftGateOption() {
    return liftGateOption;
  }


  public void setLiftGateOption(Boolean liftGateOption) {
    this.liftGateOption = liftGateOption;
  }


  public CartSettingsShippingEstimate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Shipping method name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shipping method name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CartSettingsShippingEstimate pickup(Boolean pickup) {
    
    this.pickup = pickup;
    return this;
  }

   /**
   * True if this shipping method requires customers to physically pickup product themselves
   * @return pickup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this shipping method requires customers to physically pickup product themselves")

  public Boolean getPickup() {
    return pickup;
  }


  public void setPickup(Boolean pickup) {
    this.pickup = pickup;
  }


  public CartSettingsShippingEstimate tax(Currency tax) {
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getTax() {
    return tax;
  }


  public void setTax(Currency tax) {
    this.tax = tax;
  }


  public CartSettingsShippingEstimate totalTax(Currency totalTax) {
    
    this.totalTax = totalTax;
    return this;
  }

   /**
   * Get totalTax
   * @return totalTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getTotalTax() {
    return totalTax;
  }


  public void setTotalTax(Currency totalTax) {
    this.totalTax = totalTax;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartSettingsShippingEstimate cartSettingsShippingEstimate = (CartSettingsShippingEstimate) o;
    return Objects.equals(this.allow3rdPartyBilling, cartSettingsShippingEstimate.allow3rdPartyBilling) &&
        Objects.equals(this.comment, cartSettingsShippingEstimate.comment) &&
        Objects.equals(this.cost, cartSettingsShippingEstimate.cost) &&
        Objects.equals(this.costBeforeDiscount, cartSettingsShippingEstimate.costBeforeDiscount) &&
        Objects.equals(this.defaultMethod, cartSettingsShippingEstimate.defaultMethod) &&
        Objects.equals(this.discount, cartSettingsShippingEstimate.discount) &&
        Objects.equals(this.discounted, cartSettingsShippingEstimate.discounted) &&
        Objects.equals(this.displayName, cartSettingsShippingEstimate.displayName) &&
        Objects.equals(this.estimatedDelivery, cartSettingsShippingEstimate.estimatedDelivery) &&
        Objects.equals(this.liftGateOption, cartSettingsShippingEstimate.liftGateOption) &&
        Objects.equals(this.name, cartSettingsShippingEstimate.name) &&
        Objects.equals(this.pickup, cartSettingsShippingEstimate.pickup) &&
        Objects.equals(this.tax, cartSettingsShippingEstimate.tax) &&
        Objects.equals(this.totalTax, cartSettingsShippingEstimate.totalTax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow3rdPartyBilling, comment, cost, costBeforeDiscount, defaultMethod, discount, discounted, displayName, estimatedDelivery, liftGateOption, name, pickup, tax, totalTax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartSettingsShippingEstimate {\n");
    sb.append("    allow3rdPartyBilling: ").append(toIndentedString(allow3rdPartyBilling)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    costBeforeDiscount: ").append(toIndentedString(costBeforeDiscount)).append("\n");
    sb.append("    defaultMethod: ").append(toIndentedString(defaultMethod)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    discounted: ").append(toIndentedString(discounted)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    estimatedDelivery: ").append(toIndentedString(estimatedDelivery)).append("\n");
    sb.append("    liftGateOption: ").append(toIndentedString(liftGateOption)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pickup: ").append(toIndentedString(pickup)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    totalTax: ").append(toIndentedString(totalTax)).append("\n");
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
    openapiFields.add("allow_3rd_party_billing");
    openapiFields.add("comment");
    openapiFields.add("cost");
    openapiFields.add("cost_before_discount");
    openapiFields.add("default_method");
    openapiFields.add("discount");
    openapiFields.add("discounted");
    openapiFields.add("display_name");
    openapiFields.add("estimated_delivery");
    openapiFields.add("lift_gate_option");
    openapiFields.add("name");
    openapiFields.add("pickup");
    openapiFields.add("tax");
    openapiFields.add("total_tax");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CartSettingsShippingEstimate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CartSettingsShippingEstimate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CartSettingsShippingEstimate is not found in the empty JSON string", CartSettingsShippingEstimate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CartSettingsShippingEstimate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CartSettingsShippingEstimate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      // validate the optional field `cost`
      if (jsonObj.getAsJsonObject("cost") != null) {
        Currency.validateJsonObject(jsonObj.getAsJsonObject("cost"));
      }
      // validate the optional field `cost_before_discount`
      if (jsonObj.getAsJsonObject("cost_before_discount") != null) {
        Currency.validateJsonObject(jsonObj.getAsJsonObject("cost_before_discount"));
      }
      // validate the optional field `discount`
      if (jsonObj.getAsJsonObject("discount") != null) {
        Currency.validateJsonObject(jsonObj.getAsJsonObject("discount"));
      }
      if (jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
      if (jsonObj.get("estimated_delivery") != null && !jsonObj.get("estimated_delivery").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `estimated_delivery` to be a primitive type in the JSON string but got `%s`", jsonObj.get("estimated_delivery").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `tax`
      if (jsonObj.getAsJsonObject("tax") != null) {
        Currency.validateJsonObject(jsonObj.getAsJsonObject("tax"));
      }
      // validate the optional field `total_tax`
      if (jsonObj.getAsJsonObject("total_tax") != null) {
        Currency.validateJsonObject(jsonObj.getAsJsonObject("total_tax"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CartSettingsShippingEstimate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CartSettingsShippingEstimate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CartSettingsShippingEstimate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CartSettingsShippingEstimate.class));

       return (TypeAdapter<T>) new TypeAdapter<CartSettingsShippingEstimate>() {
           @Override
           public void write(JsonWriter out, CartSettingsShippingEstimate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CartSettingsShippingEstimate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CartSettingsShippingEstimate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CartSettingsShippingEstimate
  * @throws IOException if the JSON string is invalid with respect to CartSettingsShippingEstimate
  */
  public static CartSettingsShippingEstimate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CartSettingsShippingEstimate.class);
  }

 /**
  * Convert an instance of CartSettingsShippingEstimate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

