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
 * TaxProviderUltraCartState
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class TaxProviderUltraCartState {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_EXEMPT_DIGITAL_ITEMS = "exempt_digital_items";
  @SerializedName(SERIALIZED_NAME_EXEMPT_DIGITAL_ITEMS)
  private Boolean exemptDigitalItems;

  public static final String SERIALIZED_NAME_EXEMPT_PHYSICAL_ITEMS = "exempt_physical_items";
  @SerializedName(SERIALIZED_NAME_EXEMPT_PHYSICAL_ITEMS)
  private Boolean exemptPhysicalItems;

  public static final String SERIALIZED_NAME_EXEMPT_SERVICE_ITEMS = "exempt_service_items";
  @SerializedName(SERIALIZED_NAME_EXEMPT_SERVICE_ITEMS)
  private Boolean exemptServiceItems;

  public static final String SERIALIZED_NAME_STATE_CODE = "state_code";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_STATE_NAME = "state_name";
  @SerializedName(SERIALIZED_NAME_STATE_NAME)
  private String stateName;

  public static final String SERIALIZED_NAME_TAX_GIFT_CHARGE = "tax_gift_charge";
  @SerializedName(SERIALIZED_NAME_TAX_GIFT_CHARGE)
  private Boolean taxGiftCharge;

  public static final String SERIALIZED_NAME_TAX_GIFT_WRAP = "tax_gift_wrap";
  @SerializedName(SERIALIZED_NAME_TAX_GIFT_WRAP)
  private Boolean taxGiftWrap;

  public static final String SERIALIZED_NAME_TAX_RATE_FORMATTED = "tax_rate_formatted";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_FORMATTED)
  private String taxRateFormatted;

  public static final String SERIALIZED_NAME_TAX_SHIPPING = "tax_shipping";
  @SerializedName(SERIALIZED_NAME_TAX_SHIPPING)
  private Boolean taxShipping;

  public TaxProviderUltraCartState() { 
  }

  public TaxProviderUltraCartState enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * True if this state taxes are managed by UltraCart
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this state taxes are managed by UltraCart")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public TaxProviderUltraCartState exemptDigitalItems(Boolean exemptDigitalItems) {
    
    this.exemptDigitalItems = exemptDigitalItems;
    return this;
  }

   /**
   * True if digital items are exempt from sales tax in this state.
   * @return exemptDigitalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if digital items are exempt from sales tax in this state.")

  public Boolean getExemptDigitalItems() {
    return exemptDigitalItems;
  }


  public void setExemptDigitalItems(Boolean exemptDigitalItems) {
    this.exemptDigitalItems = exemptDigitalItems;
  }


  public TaxProviderUltraCartState exemptPhysicalItems(Boolean exemptPhysicalItems) {
    
    this.exemptPhysicalItems = exemptPhysicalItems;
    return this;
  }

   /**
   * True if physical items are exempt from sales tax in this state.
   * @return exemptPhysicalItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if physical items are exempt from sales tax in this state.")

  public Boolean getExemptPhysicalItems() {
    return exemptPhysicalItems;
  }


  public void setExemptPhysicalItems(Boolean exemptPhysicalItems) {
    this.exemptPhysicalItems = exemptPhysicalItems;
  }


  public TaxProviderUltraCartState exemptServiceItems(Boolean exemptServiceItems) {
    
    this.exemptServiceItems = exemptServiceItems;
    return this;
  }

   /**
   * True if service items are exempt from sales tax in this state.
   * @return exemptServiceItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if service items are exempt from sales tax in this state.")

  public Boolean getExemptServiceItems() {
    return exemptServiceItems;
  }


  public void setExemptServiceItems(Boolean exemptServiceItems) {
    this.exemptServiceItems = exemptServiceItems;
  }


  public TaxProviderUltraCartState stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * State Code (2 digits)
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State Code (2 digits)")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  public TaxProviderUltraCartState stateName(String stateName) {
    
    this.stateName = stateName;
    return this;
  }

   /**
   * Fully spelled out state name
   * @return stateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fully spelled out state name")

  public String getStateName() {
    return stateName;
  }


  public void setStateName(String stateName) {
    this.stateName = stateName;
  }


  public TaxProviderUltraCartState taxGiftCharge(Boolean taxGiftCharge) {
    
    this.taxGiftCharge = taxGiftCharge;
    return this;
  }

   /**
   * True if gift charges should be taxed in this state.
   * @return taxGiftCharge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if gift charges should be taxed in this state.")

  public Boolean getTaxGiftCharge() {
    return taxGiftCharge;
  }


  public void setTaxGiftCharge(Boolean taxGiftCharge) {
    this.taxGiftCharge = taxGiftCharge;
  }


  public TaxProviderUltraCartState taxGiftWrap(Boolean taxGiftWrap) {
    
    this.taxGiftWrap = taxGiftWrap;
    return this;
  }

   /**
   * True if gift wrap should be taxed in this state.
   * @return taxGiftWrap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if gift wrap should be taxed in this state.")

  public Boolean getTaxGiftWrap() {
    return taxGiftWrap;
  }


  public void setTaxGiftWrap(Boolean taxGiftWrap) {
    this.taxGiftWrap = taxGiftWrap;
  }


  public TaxProviderUltraCartState taxRateFormatted(String taxRateFormatted) {
    
    this.taxRateFormatted = taxRateFormatted;
    return this;
  }

   /**
   * State tax rate formatted for display
   * @return taxRateFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State tax rate formatted for display")

  public String getTaxRateFormatted() {
    return taxRateFormatted;
  }


  public void setTaxRateFormatted(String taxRateFormatted) {
    this.taxRateFormatted = taxRateFormatted;
  }


  public TaxProviderUltraCartState taxShipping(Boolean taxShipping) {
    
    this.taxShipping = taxShipping;
    return this;
  }

   /**
   * True if shipping should be taxed in this state.
   * @return taxShipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if shipping should be taxed in this state.")

  public Boolean getTaxShipping() {
    return taxShipping;
  }


  public void setTaxShipping(Boolean taxShipping) {
    this.taxShipping = taxShipping;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxProviderUltraCartState taxProviderUltraCartState = (TaxProviderUltraCartState) o;
    return Objects.equals(this.enabled, taxProviderUltraCartState.enabled) &&
        Objects.equals(this.exemptDigitalItems, taxProviderUltraCartState.exemptDigitalItems) &&
        Objects.equals(this.exemptPhysicalItems, taxProviderUltraCartState.exemptPhysicalItems) &&
        Objects.equals(this.exemptServiceItems, taxProviderUltraCartState.exemptServiceItems) &&
        Objects.equals(this.stateCode, taxProviderUltraCartState.stateCode) &&
        Objects.equals(this.stateName, taxProviderUltraCartState.stateName) &&
        Objects.equals(this.taxGiftCharge, taxProviderUltraCartState.taxGiftCharge) &&
        Objects.equals(this.taxGiftWrap, taxProviderUltraCartState.taxGiftWrap) &&
        Objects.equals(this.taxRateFormatted, taxProviderUltraCartState.taxRateFormatted) &&
        Objects.equals(this.taxShipping, taxProviderUltraCartState.taxShipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, exemptDigitalItems, exemptPhysicalItems, exemptServiceItems, stateCode, stateName, taxGiftCharge, taxGiftWrap, taxRateFormatted, taxShipping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxProviderUltraCartState {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    exemptDigitalItems: ").append(toIndentedString(exemptDigitalItems)).append("\n");
    sb.append("    exemptPhysicalItems: ").append(toIndentedString(exemptPhysicalItems)).append("\n");
    sb.append("    exemptServiceItems: ").append(toIndentedString(exemptServiceItems)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    stateName: ").append(toIndentedString(stateName)).append("\n");
    sb.append("    taxGiftCharge: ").append(toIndentedString(taxGiftCharge)).append("\n");
    sb.append("    taxGiftWrap: ").append(toIndentedString(taxGiftWrap)).append("\n");
    sb.append("    taxRateFormatted: ").append(toIndentedString(taxRateFormatted)).append("\n");
    sb.append("    taxShipping: ").append(toIndentedString(taxShipping)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("exempt_digital_items");
    openapiFields.add("exempt_physical_items");
    openapiFields.add("exempt_service_items");
    openapiFields.add("state_code");
    openapiFields.add("state_name");
    openapiFields.add("tax_gift_charge");
    openapiFields.add("tax_gift_wrap");
    openapiFields.add("tax_rate_formatted");
    openapiFields.add("tax_shipping");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxProviderUltraCartState
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TaxProviderUltraCartState.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxProviderUltraCartState is not found in the empty JSON string", TaxProviderUltraCartState.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TaxProviderUltraCartState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxProviderUltraCartState` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("state_code") != null && !jsonObj.get("state_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_code").toString()));
      }
      if (jsonObj.get("state_name") != null && !jsonObj.get("state_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state_name").toString()));
      }
      if (jsonObj.get("tax_rate_formatted") != null && !jsonObj.get("tax_rate_formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_rate_formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_rate_formatted").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxProviderUltraCartState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxProviderUltraCartState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxProviderUltraCartState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxProviderUltraCartState.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxProviderUltraCartState>() {
           @Override
           public void write(JsonWriter out, TaxProviderUltraCartState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxProviderUltraCartState read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TaxProviderUltraCartState given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxProviderUltraCartState
  * @throws IOException if the JSON string is invalid with respect to TaxProviderUltraCartState
  */
  public static TaxProviderUltraCartState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxProviderUltraCartState.class);
  }

 /**
  * Convert an instance of TaxProviderUltraCartState to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

