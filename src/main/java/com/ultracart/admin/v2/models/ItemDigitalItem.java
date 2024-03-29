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
import com.ultracart.admin.v2.models.ItemDigitalItemPdfMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ItemDigitalItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemDigitalItem {
  @SerializedName("click_wrap_agreement")
  private String clickWrapAgreement = null;

  @SerializedName("creation_dts")
  private String creationDts = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("digital_item_oid")
  private Integer digitalItemOid = null;

  @SerializedName("external_id")
  private String externalId = null;

  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("import_from_url")
  private String importFromUrl = null;

  @SerializedName("mime_type")
  private String mimeType = null;

  @SerializedName("original_filename")
  private String originalFilename = null;

  @SerializedName("pdf_meta")
  private ItemDigitalItemPdfMeta pdfMeta = null;

  public ItemDigitalItem clickWrapAgreement(String clickWrapAgreement) {
    this.clickWrapAgreement = clickWrapAgreement;
    return this;
  }

   /**
   * Click wrap agreement is presented to the customer before they can purchase your product.
   * @return clickWrapAgreement
  **/
  @ApiModelProperty(value = "Click wrap agreement is presented to the customer before they can purchase your product.")
  public String getClickWrapAgreement() {
    return clickWrapAgreement;
  }

  public void setClickWrapAgreement(String clickWrapAgreement) {
    this.clickWrapAgreement = clickWrapAgreement;
  }

  public ItemDigitalItem creationDts(String creationDts) {
    this.creationDts = creationDts;
    return this;
  }

   /**
   * File creation date
   * @return creationDts
  **/
  @ApiModelProperty(value = "File creation date")
  public String getCreationDts() {
    return creationDts;
  }

  public void setCreationDts(String creationDts) {
    this.creationDts = creationDts;
  }

  public ItemDigitalItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the digital item
   * @return description
  **/
  @ApiModelProperty(value = "Description of the digital item")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemDigitalItem digitalItemOid(Integer digitalItemOid) {
    this.digitalItemOid = digitalItemOid;
    return this;
  }

   /**
   * The Digital item oid is a primary key used internally by UltraCart.  You should not set or change this value.  Doing so will have no effect.
   * @return digitalItemOid
  **/
  @ApiModelProperty(value = "The Digital item oid is a primary key used internally by UltraCart.  You should not set or change this value.  Doing so will have no effect.")
  public Integer getDigitalItemOid() {
    return digitalItemOid;
  }

  public void setDigitalItemOid(Integer digitalItemOid) {
    this.digitalItemOid = digitalItemOid;
  }

  public ItemDigitalItem externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External Id useful for syncing with a remote filesystem, this may be an MD5 hash or whatever suits your needs.
   * @return externalId
  **/
  @ApiModelProperty(value = "External Id useful for syncing with a remote filesystem, this may be an MD5 hash or whatever suits your needs.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ItemDigitalItem fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * File size
   * @return fileSize
  **/
  @ApiModelProperty(value = "File size")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public ItemDigitalItem importFromUrl(String importFromUrl) {
    this.importFromUrl = importFromUrl;
    return this;
  }

   /**
   * This url is sourced to create or update a digital file in your digital library.  It is only considered during an insert or update operation.
   * @return importFromUrl
  **/
  @ApiModelProperty(value = "This url is sourced to create or update a digital file in your digital library.  It is only considered during an insert or update operation.")
  public String getImportFromUrl() {
    return importFromUrl;
  }

  public void setImportFromUrl(String importFromUrl) {
    this.importFromUrl = importFromUrl;
  }

  public ItemDigitalItem mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Mime type associated with the file
   * @return mimeType
  **/
  @ApiModelProperty(value = "Mime type associated with the file")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public ItemDigitalItem originalFilename(String originalFilename) {
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

  public ItemDigitalItem pdfMeta(ItemDigitalItemPdfMeta pdfMeta) {
    this.pdfMeta = pdfMeta;
    return this;
  }

   /**
   * Get pdfMeta
   * @return pdfMeta
  **/
  @ApiModelProperty(value = "")
  public ItemDigitalItemPdfMeta getPdfMeta() {
    return pdfMeta;
  }

  public void setPdfMeta(ItemDigitalItemPdfMeta pdfMeta) {
    this.pdfMeta = pdfMeta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDigitalItem itemDigitalItem = (ItemDigitalItem) o;
    return Objects.equals(this.clickWrapAgreement, itemDigitalItem.clickWrapAgreement) &&
        Objects.equals(this.creationDts, itemDigitalItem.creationDts) &&
        Objects.equals(this.description, itemDigitalItem.description) &&
        Objects.equals(this.digitalItemOid, itemDigitalItem.digitalItemOid) &&
        Objects.equals(this.externalId, itemDigitalItem.externalId) &&
        Objects.equals(this.fileSize, itemDigitalItem.fileSize) &&
        Objects.equals(this.importFromUrl, itemDigitalItem.importFromUrl) &&
        Objects.equals(this.mimeType, itemDigitalItem.mimeType) &&
        Objects.equals(this.originalFilename, itemDigitalItem.originalFilename) &&
        Objects.equals(this.pdfMeta, itemDigitalItem.pdfMeta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickWrapAgreement, creationDts, description, digitalItemOid, externalId, fileSize, importFromUrl, mimeType, originalFilename, pdfMeta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDigitalItem {\n");
    
    sb.append("    clickWrapAgreement: ").append(toIndentedString(clickWrapAgreement)).append("\n");
    sb.append("    creationDts: ").append(toIndentedString(creationDts)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    digitalItemOid: ").append(toIndentedString(digitalItemOid)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    importFromUrl: ").append(toIndentedString(importFromUrl)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    pdfMeta: ").append(toIndentedString(pdfMeta)).append("\n");
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

