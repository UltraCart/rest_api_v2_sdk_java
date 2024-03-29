/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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

/**
 * ConversationWebchatContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ConversationWebchatContext {
  @SerializedName("auto_orders")
  private List<AutoOrder> autoOrders = null;

  @SerializedName("cart")
  private Cart cart = null;

  @SerializedName("current_url")
  private String currentUrl = null;

  @SerializedName("orders")
  private List<Order> orders = null;

  @SerializedName("page_view")
  private List<HitPageView> pageView = null;

  @SerializedName("session_start")
  private HitSessionStart sessionStart = null;

  @SerializedName("session_start_dts")
  private String sessionStartDts = null;

  @SerializedName("session_utm")
  private HitSessionUtm sessionUtm = null;

  public ConversationWebchatContext autoOrders(List<AutoOrder> autoOrders) {
    this.autoOrders = autoOrders;
    return this;
  }

  public ConversationWebchatContext addAutoOrdersItem(AutoOrder autoOrdersItem) {
    if (this.autoOrders == null) {
      this.autoOrders = new ArrayList<AutoOrder>();
    }
    this.autoOrders.add(autoOrdersItem);
    return this;
  }

   /**
   * Get autoOrders
   * @return autoOrders
  **/
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
      this.orders = new ArrayList<Order>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
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
      this.pageView = new ArrayList<HitPageView>();
    }
    this.pageView.add(pageViewItem);
    return this;
  }

   /**
   * Get pageView
   * @return pageView
  **/
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
  @ApiModelProperty(value = "")
  public HitSessionUtm getSessionUtm() {
    return sessionUtm;
  }

  public void setSessionUtm(HitSessionUtm sessionUtm) {
    this.sessionUtm = sessionUtm;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

