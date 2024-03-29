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
 * CartSettingsTerms
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CartSettingsTerms {
  @SerializedName("html")
  private String html = null;

  @SerializedName("text")
  private String text = null;

  public CartSettingsTerms html(String html) {
    this.html = html;
    return this;
  }

   /**
   * HTML version of the terms
   * @return html
  **/
  @ApiModelProperty(value = "HTML version of the terms")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public CartSettingsTerms text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text version of the terms.
   * @return text
  **/
  @ApiModelProperty(value = "Text version of the terms.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartSettingsTerms cartSettingsTerms = (CartSettingsTerms) o;
    return Objects.equals(this.html, cartSettingsTerms.html) &&
        Objects.equals(this.text, cartSettingsTerms.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartSettingsTerms {\n");
    
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

