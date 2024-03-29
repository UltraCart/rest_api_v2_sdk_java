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
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.ItemDigitalItem;
import com.ultracart.admin.v2.models.ResponseMetadata;
import com.ultracart.admin.v2.models.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemDigitalItemsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemDigitalItemsResponse {
  @SerializedName("digital_items")
  private List<ItemDigitalItem> digitalItems = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("warning")
  private Warning warning = null;

  public ItemDigitalItemsResponse digitalItems(List<ItemDigitalItem> digitalItems) {
    this.digitalItems = digitalItems;
    return this;
  }

  public ItemDigitalItemsResponse addDigitalItemsItem(ItemDigitalItem digitalItemsItem) {
    if (this.digitalItems == null) {
      this.digitalItems = new ArrayList<ItemDigitalItem>();
    }
    this.digitalItems.add(digitalItemsItem);
    return this;
  }

   /**
   * digital_items
   * @return digitalItems
  **/
  @ApiModelProperty(value = "digital_items")
  public List<ItemDigitalItem> getDigitalItems() {
    return digitalItems;
  }

  public void setDigitalItems(List<ItemDigitalItem> digitalItems) {
    this.digitalItems = digitalItems;
  }

  public ItemDigitalItemsResponse error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  public ItemDigitalItemsResponse metadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
  }

  public ItemDigitalItemsResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Indicates if API call was successful
   * @return success
  **/
  @ApiModelProperty(value = "Indicates if API call was successful")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ItemDigitalItemsResponse warning(Warning warning) {
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @ApiModelProperty(value = "")
  public Warning getWarning() {
    return warning;
  }

  public void setWarning(Warning warning) {
    this.warning = warning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDigitalItemsResponse itemDigitalItemsResponse = (ItemDigitalItemsResponse) o;
    return Objects.equals(this.digitalItems, itemDigitalItemsResponse.digitalItems) &&
        Objects.equals(this.error, itemDigitalItemsResponse.error) &&
        Objects.equals(this.metadata, itemDigitalItemsResponse.metadata) &&
        Objects.equals(this.success, itemDigitalItemsResponse.success) &&
        Objects.equals(this.warning, itemDigitalItemsResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digitalItems, error, metadata, success, warning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDigitalItemsResponse {\n");
    
    sb.append("    digitalItems: ").append(toIndentedString(digitalItems)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

