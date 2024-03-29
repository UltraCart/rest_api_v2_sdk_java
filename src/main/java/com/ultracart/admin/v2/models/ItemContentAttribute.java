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
 * ItemContentAttribute
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemContentAttribute {
  @SerializedName("name")
  private String name = null;

  @SerializedName("translated_text_instance_oid")
  private Integer translatedTextInstanceOid = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  public ItemContentAttribute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Attribute name
   * @return name
  **/
  @ApiModelProperty(value = "Attribute name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemContentAttribute translatedTextInstanceOid(Integer translatedTextInstanceOid) {
    this.translatedTextInstanceOid = translatedTextInstanceOid;
    return this;
  }

   /**
   * Attribute translated text instance identifier
   * @return translatedTextInstanceOid
  **/
  @ApiModelProperty(value = "Attribute translated text instance identifier")
  public Integer getTranslatedTextInstanceOid() {
    return translatedTextInstanceOid;
  }

  public void setTranslatedTextInstanceOid(Integer translatedTextInstanceOid) {
    this.translatedTextInstanceOid = translatedTextInstanceOid;
  }

  public ItemContentAttribute type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Attribute type
   * @return type
  **/
  @ApiModelProperty(value = "Attribute type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ItemContentAttribute value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Attribute value
   * @return value
  **/
  @ApiModelProperty(value = "Attribute value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemContentAttribute itemContentAttribute = (ItemContentAttribute) o;
    return Objects.equals(this.name, itemContentAttribute.name) &&
        Objects.equals(this.translatedTextInstanceOid, itemContentAttribute.translatedTextInstanceOid) &&
        Objects.equals(this.type, itemContentAttribute.type) &&
        Objects.equals(this.value, itemContentAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, translatedTextInstanceOid, type, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemContentAttribute {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    translatedTextInstanceOid: ").append(toIndentedString(translatedTextInstanceOid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

