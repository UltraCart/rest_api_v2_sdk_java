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
 * FileManagerFile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-10-17T14:32:12.844-04:00")



public class FileManagerFile {
  @SerializedName("favorite")
  private Boolean favorite = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("i18n_violation")
  private Boolean i18nViolation = null;

  @SerializedName("icon")
  private String icon = null;

  @SerializedName("internal_version")
  private Integer internalVersion = null;

  @SerializedName("last_modified")
  private String lastModified = null;

  @SerializedName("merge_conflict")
  private Boolean mergeConflict = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parent_storefront_fs_directory_oid")
  private Integer parentStorefrontFsDirectoryOid = null;

  @SerializedName("part_of_active_theme")
  private Boolean partOfActiveTheme = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("raw_size")
  private Integer rawSize = null;

  @SerializedName("selected")
  private Boolean selected = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("storefront_fs_directory_oid")
  private Integer storefrontFsDirectoryOid = null;

  @SerializedName("storefront_fs_file_oid")
  private Integer storefrontFsFileOid = null;

  @SerializedName("storefront_oid")
  private Integer storefrontOid = null;

  @SerializedName("thumbnail_16_url")
  private String thumbnail16Url = null;

  @SerializedName("thumbnail_32_url")
  private String thumbnail32Url = null;

  @SerializedName("thumbnail_64_url")
  private String thumbnail64Url = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("valid_velocity")
  private String validVelocity = null;

  public FileManagerFile favorite(Boolean favorite) {
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  @ApiModelProperty(value = "")
  public Boolean isFavorite() {
    return favorite;
  }

  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }

  public FileManagerFile hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @ApiModelProperty(value = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public FileManagerFile i18nViolation(Boolean i18nViolation) {
    this.i18nViolation = i18nViolation;
    return this;
  }

   /**
   * Get i18nViolation
   * @return i18nViolation
  **/
  @ApiModelProperty(value = "")
  public Boolean isI18nViolation() {
    return i18nViolation;
  }

  public void setI18nViolation(Boolean i18nViolation) {
    this.i18nViolation = i18nViolation;
  }

  public FileManagerFile icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public FileManagerFile internalVersion(Integer internalVersion) {
    this.internalVersion = internalVersion;
    return this;
  }

   /**
   * Get internalVersion
   * @return internalVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getInternalVersion() {
    return internalVersion;
  }

  public void setInternalVersion(Integer internalVersion) {
    this.internalVersion = internalVersion;
  }

  public FileManagerFile lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public FileManagerFile mergeConflict(Boolean mergeConflict) {
    this.mergeConflict = mergeConflict;
    return this;
  }

   /**
   * Get mergeConflict
   * @return mergeConflict
  **/
  @ApiModelProperty(value = "")
  public Boolean isMergeConflict() {
    return mergeConflict;
  }

  public void setMergeConflict(Boolean mergeConflict) {
    this.mergeConflict = mergeConflict;
  }

  public FileManagerFile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileManagerFile parentStorefrontFsDirectoryOid(Integer parentStorefrontFsDirectoryOid) {
    this.parentStorefrontFsDirectoryOid = parentStorefrontFsDirectoryOid;
    return this;
  }

   /**
   * Get parentStorefrontFsDirectoryOid
   * @return parentStorefrontFsDirectoryOid
  **/
  @ApiModelProperty(value = "")
  public Integer getParentStorefrontFsDirectoryOid() {
    return parentStorefrontFsDirectoryOid;
  }

  public void setParentStorefrontFsDirectoryOid(Integer parentStorefrontFsDirectoryOid) {
    this.parentStorefrontFsDirectoryOid = parentStorefrontFsDirectoryOid;
  }

  public FileManagerFile partOfActiveTheme(Boolean partOfActiveTheme) {
    this.partOfActiveTheme = partOfActiveTheme;
    return this;
  }

   /**
   * Get partOfActiveTheme
   * @return partOfActiveTheme
  **/
  @ApiModelProperty(value = "")
  public Boolean isPartOfActiveTheme() {
    return partOfActiveTheme;
  }

  public void setPartOfActiveTheme(Boolean partOfActiveTheme) {
    this.partOfActiveTheme = partOfActiveTheme;
  }

  public FileManagerFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public FileManagerFile rawSize(Integer rawSize) {
    this.rawSize = rawSize;
    return this;
  }

   /**
   * Get rawSize
   * @return rawSize
  **/
  @ApiModelProperty(value = "")
  public Integer getRawSize() {
    return rawSize;
  }

  public void setRawSize(Integer rawSize) {
    this.rawSize = rawSize;
  }

  public FileManagerFile selected(Boolean selected) {
    this.selected = selected;
    return this;
  }

   /**
   * Get selected
   * @return selected
  **/
  @ApiModelProperty(value = "")
  public Boolean isSelected() {
    return selected;
  }

  public void setSelected(Boolean selected) {
    this.selected = selected;
  }

  public FileManagerFile size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public FileManagerFile storefrontFsDirectoryOid(Integer storefrontFsDirectoryOid) {
    this.storefrontFsDirectoryOid = storefrontFsDirectoryOid;
    return this;
  }

   /**
   * Get storefrontFsDirectoryOid
   * @return storefrontFsDirectoryOid
  **/
  @ApiModelProperty(value = "")
  public Integer getStorefrontFsDirectoryOid() {
    return storefrontFsDirectoryOid;
  }

  public void setStorefrontFsDirectoryOid(Integer storefrontFsDirectoryOid) {
    this.storefrontFsDirectoryOid = storefrontFsDirectoryOid;
  }

  public FileManagerFile storefrontFsFileOid(Integer storefrontFsFileOid) {
    this.storefrontFsFileOid = storefrontFsFileOid;
    return this;
  }

   /**
   * Get storefrontFsFileOid
   * @return storefrontFsFileOid
  **/
  @ApiModelProperty(value = "")
  public Integer getStorefrontFsFileOid() {
    return storefrontFsFileOid;
  }

  public void setStorefrontFsFileOid(Integer storefrontFsFileOid) {
    this.storefrontFsFileOid = storefrontFsFileOid;
  }

  public FileManagerFile storefrontOid(Integer storefrontOid) {
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

  public FileManagerFile thumbnail16Url(String thumbnail16Url) {
    this.thumbnail16Url = thumbnail16Url;
    return this;
  }

   /**
   * CDN thumbnail 16x16 size
   * @return thumbnail16Url
  **/
  @ApiModelProperty(value = "CDN thumbnail 16x16 size")
  public String getThumbnail16Url() {
    return thumbnail16Url;
  }

  public void setThumbnail16Url(String thumbnail16Url) {
    this.thumbnail16Url = thumbnail16Url;
  }

  public FileManagerFile thumbnail32Url(String thumbnail32Url) {
    this.thumbnail32Url = thumbnail32Url;
    return this;
  }

   /**
   * CDN thumbnail 32x32 size
   * @return thumbnail32Url
  **/
  @ApiModelProperty(value = "CDN thumbnail 32x32 size")
  public String getThumbnail32Url() {
    return thumbnail32Url;
  }

  public void setThumbnail32Url(String thumbnail32Url) {
    this.thumbnail32Url = thumbnail32Url;
  }

  public FileManagerFile thumbnail64Url(String thumbnail64Url) {
    this.thumbnail64Url = thumbnail64Url;
    return this;
  }

   /**
   * CDN thumbnail 64x64 size
   * @return thumbnail64Url
  **/
  @ApiModelProperty(value = "CDN thumbnail 64x64 size")
  public String getThumbnail64Url() {
    return thumbnail64Url;
  }

  public void setThumbnail64Url(String thumbnail64Url) {
    this.thumbnail64Url = thumbnail64Url;
  }

  public FileManagerFile type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FileManagerFile validVelocity(String validVelocity) {
    this.validVelocity = validVelocity;
    return this;
  }

   /**
   * Get validVelocity
   * @return validVelocity
  **/
  @ApiModelProperty(value = "")
  public String getValidVelocity() {
    return validVelocity;
  }

  public void setValidVelocity(String validVelocity) {
    this.validVelocity = validVelocity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileManagerFile fileManagerFile = (FileManagerFile) o;
    return Objects.equals(this.favorite, fileManagerFile.favorite) &&
        Objects.equals(this.hostname, fileManagerFile.hostname) &&
        Objects.equals(this.i18nViolation, fileManagerFile.i18nViolation) &&
        Objects.equals(this.icon, fileManagerFile.icon) &&
        Objects.equals(this.internalVersion, fileManagerFile.internalVersion) &&
        Objects.equals(this.lastModified, fileManagerFile.lastModified) &&
        Objects.equals(this.mergeConflict, fileManagerFile.mergeConflict) &&
        Objects.equals(this.name, fileManagerFile.name) &&
        Objects.equals(this.parentStorefrontFsDirectoryOid, fileManagerFile.parentStorefrontFsDirectoryOid) &&
        Objects.equals(this.partOfActiveTheme, fileManagerFile.partOfActiveTheme) &&
        Objects.equals(this.path, fileManagerFile.path) &&
        Objects.equals(this.rawSize, fileManagerFile.rawSize) &&
        Objects.equals(this.selected, fileManagerFile.selected) &&
        Objects.equals(this.size, fileManagerFile.size) &&
        Objects.equals(this.storefrontFsDirectoryOid, fileManagerFile.storefrontFsDirectoryOid) &&
        Objects.equals(this.storefrontFsFileOid, fileManagerFile.storefrontFsFileOid) &&
        Objects.equals(this.storefrontOid, fileManagerFile.storefrontOid) &&
        Objects.equals(this.thumbnail16Url, fileManagerFile.thumbnail16Url) &&
        Objects.equals(this.thumbnail32Url, fileManagerFile.thumbnail32Url) &&
        Objects.equals(this.thumbnail64Url, fileManagerFile.thumbnail64Url) &&
        Objects.equals(this.type, fileManagerFile.type) &&
        Objects.equals(this.validVelocity, fileManagerFile.validVelocity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favorite, hostname, i18nViolation, icon, internalVersion, lastModified, mergeConflict, name, parentStorefrontFsDirectoryOid, partOfActiveTheme, path, rawSize, selected, size, storefrontFsDirectoryOid, storefrontFsFileOid, storefrontOid, thumbnail16Url, thumbnail32Url, thumbnail64Url, type, validVelocity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileManagerFile {\n");
    
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    i18nViolation: ").append(toIndentedString(i18nViolation)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    internalVersion: ").append(toIndentedString(internalVersion)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    mergeConflict: ").append(toIndentedString(mergeConflict)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentStorefrontFsDirectoryOid: ").append(toIndentedString(parentStorefrontFsDirectoryOid)).append("\n");
    sb.append("    partOfActiveTheme: ").append(toIndentedString(partOfActiveTheme)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    rawSize: ").append(toIndentedString(rawSize)).append("\n");
    sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    storefrontFsDirectoryOid: ").append(toIndentedString(storefrontFsDirectoryOid)).append("\n");
    sb.append("    storefrontFsFileOid: ").append(toIndentedString(storefrontFsFileOid)).append("\n");
    sb.append("    storefrontOid: ").append(toIndentedString(storefrontOid)).append("\n");
    sb.append("    thumbnail16Url: ").append(toIndentedString(thumbnail16Url)).append("\n");
    sb.append("    thumbnail32Url: ").append(toIndentedString(thumbnail32Url)).append("\n");
    sb.append("    thumbnail64Url: ").append(toIndentedString(thumbnail64Url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validVelocity: ").append(toIndentedString(validVelocity)).append("\n");
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
