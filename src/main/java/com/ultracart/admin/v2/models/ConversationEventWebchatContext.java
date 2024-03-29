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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConversationEventWebchatContext
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ConversationEventWebchatContext {
  @SerializedName("cart_id")
  private String cartId = null;

  @SerializedName("ucacid")
  private String ucacid = null;

  @SerializedName("url")
  private String url = null;

  public ConversationEventWebchatContext cartId(String cartId) {
    this.cartId = cartId;
    return this;
  }

   /**
   * Get cartId
   * @return cartId
  **/
  @ApiModelProperty(value = "")
  public String getCartId() {
    return cartId;
  }

  public void setCartId(String cartId) {
    this.cartId = cartId;
  }

  public ConversationEventWebchatContext ucacid(String ucacid) {
    this.ucacid = ucacid;
    return this;
  }

   /**
   * Get ucacid
   * @return ucacid
  **/
  @ApiModelProperty(value = "")
  public String getUcacid() {
    return ucacid;
  }

  public void setUcacid(String ucacid) {
    this.ucacid = ucacid;
  }

  public ConversationEventWebchatContext url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEventWebchatContext conversationEventWebchatContext = (ConversationEventWebchatContext) o;
    return Objects.equals(this.cartId, conversationEventWebchatContext.cartId) &&
        Objects.equals(this.ucacid, conversationEventWebchatContext.ucacid) &&
        Objects.equals(this.url, conversationEventWebchatContext.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartId, ucacid, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventWebchatContext {\n");
    
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    ucacid: ").append(toIndentedString(ucacid)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

