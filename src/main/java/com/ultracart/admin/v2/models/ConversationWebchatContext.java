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
import com.ultracart.admin.v2.models.AutoOrder;
import com.ultracart.admin.v2.models.Cart;
import com.ultracart.admin.v2.models.HitPageView;
import com.ultracart.admin.v2.models.HitSessionStart;
import com.ultracart.admin.v2.models.HitSessionUtm;
import com.ultracart.admin.v2.models.Order;
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
 * ConversationWebchatContext
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ConversationWebchatContext {
  public static final String SERIALIZED_NAME_AUTO_ORDERS = "auto_orders";
  @SerializedName(SERIALIZED_NAME_AUTO_ORDERS)
  private List<AutoOrder> autoOrders = null;

  public static final String SERIALIZED_NAME_CART = "cart";
  @SerializedName(SERIALIZED_NAME_CART)
  private Cart cart;

  public static final String SERIALIZED_NAME_CURRENT_URL = "current_url";
  @SerializedName(SERIALIZED_NAME_CURRENT_URL)
  private String currentUrl;

  public static final String SERIALIZED_NAME_ORDERS = "orders";
  @SerializedName(SERIALIZED_NAME_ORDERS)
  private List<Order> orders = null;

  public static final String SERIALIZED_NAME_PAGE_VIEW = "page_view";
  @SerializedName(SERIALIZED_NAME_PAGE_VIEW)
  private List<HitPageView> pageView = null;

  public static final String SERIALIZED_NAME_SESSION_START = "session_start";
  @SerializedName(SERIALIZED_NAME_SESSION_START)
  private HitSessionStart sessionStart;

  public static final String SERIALIZED_NAME_SESSION_START_DTS = "session_start_dts";
  @SerializedName(SERIALIZED_NAME_SESSION_START_DTS)
  private String sessionStartDts;

  public static final String SERIALIZED_NAME_SESSION_UTM = "session_utm";
  @SerializedName(SERIALIZED_NAME_SESSION_UTM)
  private HitSessionUtm sessionUtm;

  public ConversationWebchatContext() { 
  }

  public ConversationWebchatContext autoOrders(List<AutoOrder> autoOrders) {
    
    this.autoOrders = autoOrders;
    return this;
  }

  public ConversationWebchatContext addAutoOrdersItem(AutoOrder autoOrdersItem) {
    if (this.autoOrders == null) {
      this.autoOrders = new ArrayList<>();
    }
    this.autoOrders.add(autoOrdersItem);
    return this;
  }

   /**
   * Get autoOrders
   * @return autoOrders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AutoOrder> getAutoOrders() {
    return autoOrders;
  }


  public void setAutoOrders(List<AutoOrder> autoOrders) {
    this.autoOrders = autoOrders;
  }


  public ConversationWebchatContext cart(Cart cart) {
    
    this.cart = cart;
    return this;
  }

   /**
   * Get cart
   * @return cart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cart getCart() {
    return cart;
  }


  public void setCart(Cart cart) {
    this.cart = cart;
  }


  public ConversationWebchatContext currentUrl(String currentUrl) {
    
    this.currentUrl = currentUrl;
    return this;
  }

   /**
   * Get currentUrl
   * @return currentUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentUrl() {
    return currentUrl;
  }


  public void setCurrentUrl(String currentUrl) {
    this.currentUrl = currentUrl;
  }


  public ConversationWebchatContext orders(List<Order> orders) {
    
    this.orders = orders;
    return this;
  }

  public ConversationWebchatContext addOrdersItem(Order ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Order> getOrders() {
    return orders;
  }


  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }


  public ConversationWebchatContext pageView(List<HitPageView> pageView) {
    
    this.pageView = pageView;
    return this;
  }

  public ConversationWebchatContext addPageViewItem(HitPageView pageViewItem) {
    if (this.pageView == null) {
      this.pageView = new ArrayList<>();
    }
    this.pageView.add(pageViewItem);
    return this;
  }

   /**
   * Get pageView
   * @return pageView
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HitPageView> getPageView() {
    return pageView;
  }


  public void setPageView(List<HitPageView> pageView) {
    this.pageView = pageView;
  }


  public ConversationWebchatContext sessionStart(HitSessionStart sessionStart) {
    
    this.sessionStart = sessionStart;
    return this;
  }

   /**
   * Get sessionStart
   * @return sessionStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HitSessionStart getSessionStart() {
    return sessionStart;
  }


  public void setSessionStart(HitSessionStart sessionStart) {
    this.sessionStart = sessionStart;
  }


  public ConversationWebchatContext sessionStartDts(String sessionStartDts) {
    
    this.sessionStartDts = sessionStartDts;
    return this;
  }

   /**
   * Date/time that the session was started (if known)
   * @return sessionStartDts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date/time that the session was started (if known)")

  public String getSessionStartDts() {
    return sessionStartDts;
  }


  public void setSessionStartDts(String sessionStartDts) {
    this.sessionStartDts = sessionStartDts;
  }


  public ConversationWebchatContext sessionUtm(HitSessionUtm sessionUtm) {
    
    this.sessionUtm = sessionUtm;
    return this;
  }

   /**
   * Get sessionUtm
   * @return sessionUtm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HitSessionUtm getSessionUtm() {
    return sessionUtm;
  }


  public void setSessionUtm(HitSessionUtm sessionUtm) {
    this.sessionUtm = sessionUtm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationWebchatContext conversationWebchatContext = (ConversationWebchatContext) o;
    return Objects.equals(this.autoOrders, conversationWebchatContext.autoOrders) &&
        Objects.equals(this.cart, conversationWebchatContext.cart) &&
        Objects.equals(this.currentUrl, conversationWebchatContext.currentUrl) &&
        Objects.equals(this.orders, conversationWebchatContext.orders) &&
        Objects.equals(this.pageView, conversationWebchatContext.pageView) &&
        Objects.equals(this.sessionStart, conversationWebchatContext.sessionStart) &&
        Objects.equals(this.sessionStartDts, conversationWebchatContext.sessionStartDts) &&
        Objects.equals(this.sessionUtm, conversationWebchatContext.sessionUtm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoOrders, cart, currentUrl, orders, pageView, sessionStart, sessionStartDts, sessionUtm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationWebchatContext {\n");
    sb.append("    autoOrders: ").append(toIndentedString(autoOrders)).append("\n");
    sb.append("    cart: ").append(toIndentedString(cart)).append("\n");
    sb.append("    currentUrl: ").append(toIndentedString(currentUrl)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    pageView: ").append(toIndentedString(pageView)).append("\n");
    sb.append("    sessionStart: ").append(toIndentedString(sessionStart)).append("\n");
    sb.append("    sessionStartDts: ").append(toIndentedString(sessionStartDts)).append("\n");
    sb.append("    sessionUtm: ").append(toIndentedString(sessionUtm)).append("\n");
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
    openapiFields.add("auto_orders");
    openapiFields.add("cart");
    openapiFields.add("current_url");
    openapiFields.add("orders");
    openapiFields.add("page_view");
    openapiFields.add("session_start");
    openapiFields.add("session_start_dts");
    openapiFields.add("session_utm");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationWebchatContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConversationWebchatContext.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationWebchatContext is not found in the empty JSON string", ConversationWebchatContext.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConversationWebchatContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationWebchatContext` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayautoOrders = jsonObj.getAsJsonArray("auto_orders");
      if (jsonArrayautoOrders != null) {
        // ensure the json data is an array
        if (!jsonObj.get("auto_orders").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `auto_orders` to be an array in the JSON string but got `%s`", jsonObj.get("auto_orders").toString()));
        }

        // validate the optional field `auto_orders` (array)
        for (int i = 0; i < jsonArrayautoOrders.size(); i++) {
          AutoOrder.validateJsonObject(jsonArrayautoOrders.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `cart`
      if (jsonObj.getAsJsonObject("cart") != null) {
        Cart.validateJsonObject(jsonObj.getAsJsonObject("cart"));
      }
      if (jsonObj.get("current_url") != null && !jsonObj.get("current_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_url").toString()));
      }
      JsonArray jsonArrayorders = jsonObj.getAsJsonArray("orders");
      if (jsonArrayorders != null) {
        // ensure the json data is an array
        if (!jsonObj.get("orders").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `orders` to be an array in the JSON string but got `%s`", jsonObj.get("orders").toString()));
        }

        // validate the optional field `orders` (array)
        for (int i = 0; i < jsonArrayorders.size(); i++) {
          Order.validateJsonObject(jsonArrayorders.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraypageView = jsonObj.getAsJsonArray("page_view");
      if (jsonArraypageView != null) {
        // ensure the json data is an array
        if (!jsonObj.get("page_view").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `page_view` to be an array in the JSON string but got `%s`", jsonObj.get("page_view").toString()));
        }

        // validate the optional field `page_view` (array)
        for (int i = 0; i < jsonArraypageView.size(); i++) {
          HitPageView.validateJsonObject(jsonArraypageView.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `session_start`
      if (jsonObj.getAsJsonObject("session_start") != null) {
        HitSessionStart.validateJsonObject(jsonObj.getAsJsonObject("session_start"));
      }
      if (jsonObj.get("session_start_dts") != null && !jsonObj.get("session_start_dts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `session_start_dts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("session_start_dts").toString()));
      }
      // validate the optional field `session_utm`
      if (jsonObj.getAsJsonObject("session_utm") != null) {
        HitSessionUtm.validateJsonObject(jsonObj.getAsJsonObject("session_utm"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationWebchatContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationWebchatContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationWebchatContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationWebchatContext.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationWebchatContext>() {
           @Override
           public void write(JsonWriter out, ConversationWebchatContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationWebchatContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConversationWebchatContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationWebchatContext
  * @throws IOException if the JSON string is invalid with respect to ConversationWebchatContext
  */
  public static ConversationWebchatContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationWebchatContext.class);
  }

 /**
  * Convert an instance of ConversationWebchatContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

