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
 * KeyValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class KeyValue {
  @SerializedName("description")
  private String description = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("value")
  private String value = null;

  public KeyValue description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Optional description of the lookup value
   * @return description
  **/
  @ApiModelProperty(value = "Optional description of the lookup value")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public KeyValue key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key or id of this lookup value
   * @return key
  **/
  @ApiModelProperty(value = "The key or id of this lookup value")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public KeyValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of this lookup value
   * @return value
  **/
  @ApiModelProperty(value = "The value of this lookup value")
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
    KeyValue keyValue = (KeyValue) o;
    return Objects.equals(this.description, keyValue.description) &&
        Objects.equals(this.key, keyValue.key) &&
        Objects.equals(this.value, keyValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyValue {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

