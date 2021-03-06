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
 * ApplyLibraryItemRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-13T10:52:10.135-04:00")



public class ApplyLibraryItemRequest {
  @SerializedName("email_uuid")
  private String emailUuid = null;

  @SerializedName("library_item_oid")
  private Integer libraryItemOid = null;

  @SerializedName("storefront_oid")
  private Integer storefrontOid = null;

  public ApplyLibraryItemRequest emailUuid(String emailUuid) {
    this.emailUuid = emailUuid;
    return this;
  }

   /**
   * Normal emails are applied to an existing email object, so when requesting a library item to be applied to an email, supply the email uuid.  This is only for normal emails.  Transactional emails do not have a uuid.
   * @return emailUuid
  **/
  @ApiModelProperty(value = "Normal emails are applied to an existing email object, so when requesting a library item to be applied to an email, supply the email uuid.  This is only for normal emails.  Transactional emails do not have a uuid.")
  public String getEmailUuid() {
    return emailUuid;
  }

  public void setEmailUuid(String emailUuid) {
    this.emailUuid = emailUuid;
  }

  public ApplyLibraryItemRequest libraryItemOid(Integer libraryItemOid) {
    this.libraryItemOid = libraryItemOid;
    return this;
  }

   /**
   * Library item oid that you wish to apply to the given StoreFront
   * @return libraryItemOid
  **/
  @ApiModelProperty(value = "Library item oid that you wish to apply to the given StoreFront")
  public Integer getLibraryItemOid() {
    return libraryItemOid;
  }

  public void setLibraryItemOid(Integer libraryItemOid) {
    this.libraryItemOid = libraryItemOid;
  }

  public ApplyLibraryItemRequest storefrontOid(Integer storefrontOid) {
    this.storefrontOid = storefrontOid;
    return this;
  }

   /**
   * StoreFront oid where content originates necessary for tracking down relative assets
   * @return storefrontOid
  **/
  @ApiModelProperty(value = "StoreFront oid where content originates necessary for tracking down relative assets")
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
    ApplyLibraryItemRequest applyLibraryItemRequest = (ApplyLibraryItemRequest) o;
    return Objects.equals(this.emailUuid, applyLibraryItemRequest.emailUuid) &&
        Objects.equals(this.libraryItemOid, applyLibraryItemRequest.libraryItemOid) &&
        Objects.equals(this.storefrontOid, applyLibraryItemRequest.storefrontOid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailUuid, libraryItemOid, storefrontOid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyLibraryItemRequest {\n");
    
    sb.append("    emailUuid: ").append(toIndentedString(emailUuid)).append("\n");
    sb.append("    libraryItemOid: ").append(toIndentedString(libraryItemOid)).append("\n");
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

