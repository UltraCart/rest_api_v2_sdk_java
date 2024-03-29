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
 * ScreenRecordingStoreFront
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ScreenRecordingStoreFront {
  @SerializedName("storefront_host_name")
  private String storefrontHostName = null;

  @SerializedName("storefront_oid")
  private Integer storefrontOid = null;

  public ScreenRecordingStoreFront storefrontHostName(String storefrontHostName) {
    this.storefrontHostName = storefrontHostName;
    return this;
  }

   /**
   * Get storefrontHostName
   * @return storefrontHostName
  **/
  @ApiModelProperty(value = "")
  public String getStorefrontHostName() {
    return storefrontHostName;
  }

  public void setStorefrontHostName(String storefrontHostName) {
    this.storefrontHostName = storefrontHostName;
  }

  public ScreenRecordingStoreFront storefrontOid(Integer storefrontOid) {
    this.storefrontOid = storefrontOid;
    return this;
  }

   /**
   * Get storefrontOid
   * @return storefrontOid
  **/
  @ApiModelProperty(value = "")
  public Integer getStorefrontOid() {
    return storefrontOid;
  }

  public void setStorefrontOid(Integer storefrontOid) {
    this.storefrontOid = storefrontOid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingStoreFront screenRecordingStoreFront = (ScreenRecordingStoreFront) o;
    return Objects.equals(this.storefrontHostName, screenRecordingStoreFront.storefrontHostName) &&
        Objects.equals(this.storefrontOid, screenRecordingStoreFront.storefrontOid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storefrontHostName, storefrontOid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingStoreFront {\n");
    
    sb.append("    storefrontHostName: ").append(toIndentedString(storefrontHostName)).append("\n");
    sb.append("    storefrontOid: ").append(toIndentedString(storefrontOid)).append("\n");
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

