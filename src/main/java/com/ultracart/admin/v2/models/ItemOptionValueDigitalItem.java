/*
 * UltraCart Rest API V2
 * This is the next generation UltraCart REST API...
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

/**
 * ItemOptionValueDigitalItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class ItemOptionValueDigitalItem {
  @SerializedName("digital_item_oid")
  private Integer digitalItemOid = null;

  @SerializedName("original_filename")
  private String originalFilename = null;

  public ItemOptionValueDigitalItem digitalItemOid(Integer digitalItemOid) {
    this.digitalItemOid = digitalItemOid;
    return this;
  }

   /**
   * Digital item object identifier
   * @return digitalItemOid
  **/
  @ApiModelProperty(value = "Digital item object identifier")
  public Integer getDigitalItemOid() {
    return digitalItemOid;
  }

  public void setDigitalItemOid(Integer digitalItemOid) {
    this.digitalItemOid = digitalItemOid;
  }

  public ItemOptionValueDigitalItem originalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
    return this;
  }

   /**
   * Original filename
   * @return originalFilename
  **/
  @ApiModelProperty(value = "Original filename")
  public String getOriginalFilename() {
    return originalFilename;
  }

  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemOptionValueDigitalItem itemOptionValueDigitalItem = (ItemOptionValueDigitalItem) o;
    return Objects.equals(this.digitalItemOid, itemOptionValueDigitalItem.digitalItemOid) &&
        Objects.equals(this.originalFilename, itemOptionValueDigitalItem.originalFilename);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digitalItemOid, originalFilename);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemOptionValueDigitalItem {\n");
    
    sb.append("    digitalItemOid: ").append(toIndentedString(digitalItemOid)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
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
