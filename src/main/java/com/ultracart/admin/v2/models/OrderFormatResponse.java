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

/**
 * OrderFormatResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-23T03:23:57.585-04:00")
public class OrderFormatResponse {
  @SerializedName("css_links")
  private List<String> cssLinks = null;

  @SerializedName("formatted_result")
  private String formattedResult = null;

  public OrderFormatResponse cssLinks(List<String> cssLinks) {
    this.cssLinks = cssLinks;
    return this;
  }

  public OrderFormatResponse addCssLinksItem(String cssLinksItem) {
    if (this.cssLinks == null) {
      this.cssLinks = new ArrayList<String>();
    }
    this.cssLinks.add(cssLinksItem);
    return this;
  }

   /**
   * The URLs to any stylesheets that need to be included to properly view the markup.
   * @return cssLinks
  **/
  @ApiModelProperty(value = "The URLs to any stylesheets that need to be included to properly view the markup.")
  public List<String> getCssLinks() {
    return cssLinks;
  }

  public void setCssLinks(List<String> cssLinks) {
    this.cssLinks = cssLinks;
  }

  public OrderFormatResponse formattedResult(String formattedResult) {
    this.formattedResult = formattedResult;
    return this;
  }

   /**
   * The formatted result of the order.  This will be HTML or text depending upon the requested format.
   * @return formattedResult
  **/
  @ApiModelProperty(value = "The formatted result of the order.  This will be HTML or text depending upon the requested format.")
  public String getFormattedResult() {
    return formattedResult;
  }

  public void setFormattedResult(String formattedResult) {
    this.formattedResult = formattedResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderFormatResponse orderFormatResponse = (OrderFormatResponse) o;
    return Objects.equals(this.cssLinks, orderFormatResponse.cssLinks) &&
        Objects.equals(this.formattedResult, orderFormatResponse.formattedResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cssLinks, formattedResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderFormatResponse {\n");
    
    sb.append("    cssLinks: ").append(toIndentedString(cssLinks)).append("\n");
    sb.append("    formattedResult: ").append(toIndentedString(formattedResult)).append("\n");
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
