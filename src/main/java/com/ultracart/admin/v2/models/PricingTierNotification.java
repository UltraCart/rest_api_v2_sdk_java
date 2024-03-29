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
 * PricingTierNotification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class PricingTierNotification {
  @SerializedName("format")
  private String format = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("text")
  private String text = null;

  public PricingTierNotification format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Notification format
   * @return format
  **/
  @ApiModelProperty(value = "Notification format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public PricingTierNotification subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Notification subject
   * @return subject
  **/
  @ApiModelProperty(value = "Notification subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public PricingTierNotification text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Notification text
   * @return text
  **/
  @ApiModelProperty(value = "Notification text")
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
    PricingTierNotification pricingTierNotification = (PricingTierNotification) o;
    return Objects.equals(this.format, pricingTierNotification.format) &&
        Objects.equals(this.subject, pricingTierNotification.subject) &&
        Objects.equals(this.text, pricingTierNotification.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, subject, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingTierNotification {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

