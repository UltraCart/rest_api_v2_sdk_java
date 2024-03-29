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
import com.ultracart.admin.v2.models.FileManagerDirectory;
import com.ultracart.admin.v2.models.FileManagerFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * FileManagerPage
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class FileManagerPage {
  @SerializedName("current_storefront_fs_directory_oid")
  private Integer currentStorefrontFsDirectoryOid = null;

  @SerializedName("directories")
  private List<FileManagerDirectory> directories = null;

  @SerializedName("files")
  private List<FileManagerFile> files = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("parent_storefront_fs_directory_oid")
  private Integer parentStorefrontFsDirectoryOid = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("path_list")
  private List<FileManagerDirectory> pathList = null;

  @SerializedName("storefront_oid")
  private Integer storefrontOid = null;

  public FileManagerPage currentStorefrontFsDirectoryOid(Integer currentStorefrontFsDirectoryOid) {
    this.currentStorefrontFsDirectoryOid = currentStorefrontFsDirectoryOid;
    return this;
  }

   /**
   * Get currentStorefrontFsDirectoryOid
   * @return currentStorefrontFsDirectoryOid
  **/
  @ApiModelProperty(value = "")
  public Integer getCurrentStorefrontFsDirectoryOid() {
    return currentStorefrontFsDirectoryOid;
  }

  public void setCurrentStorefrontFsDirectoryOid(Integer currentStorefrontFsDirectoryOid) {
    this.currentStorefrontFsDirectoryOid = currentStorefrontFsDirectoryOid;
  }

  public FileManagerPage directories(List<FileManagerDirectory> directories) {
    this.directories = directories;
    return this;
  }

  public FileManagerPage addDirectoriesItem(FileManagerDirectory directoriesItem) {
    if (this.directories == null) {
      this.directories = new ArrayList<FileManagerDirectory>();
    }
    this.directories.add(directoriesItem);
    return this;
  }

   /**
   * Get directories
   * @return directories
  **/
  @ApiModelProperty(value = "")
  public List<FileManagerDirectory> getDirectories() {
    return directories;
  }

  public void setDirectories(List<FileManagerDirectory> directories) {
    this.directories = directories;
  }

  public FileManagerPage files(List<FileManagerFile> files) {
    this.files = files;
    return this;
  }

  public FileManagerPage addFilesItem(FileManagerFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<FileManagerFile>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(value = "")
  public List<FileManagerFile> getFiles() {
    return files;
  }

  public void setFiles(List<FileManagerFile> files) {
    this.files = files;
  }

  public FileManagerPage hostname(String hostname) {
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

  public FileManagerPage parentStorefrontFsDirectoryOid(Integer parentStorefrontFsDirectoryOid) {
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

  public FileManagerPage path(String path) {
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

  public FileManagerPage pathList(List<FileManagerDirectory> pathList) {
    this.pathList = pathList;
    return this;
  }

  public FileManagerPage addPathListItem(FileManagerDirectory pathListItem) {
    if (this.pathList == null) {
      this.pathList = new ArrayList<FileManagerDirectory>();
    }
    this.pathList.add(pathListItem);
    return this;
  }

   /**
   * Get pathList
   * @return pathList
  **/
  @ApiModelProperty(value = "")
  public List<FileManagerDirectory> getPathList() {
    return pathList;
  }

  public void setPathList(List<FileManagerDirectory> pathList) {
    this.pathList = pathList;
  }

  public FileManagerPage storefrontOid(Integer storefrontOid) {
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
    FileManagerPage fileManagerPage = (FileManagerPage) o;
    return Objects.equals(this.currentStorefrontFsDirectoryOid, fileManagerPage.currentStorefrontFsDirectoryOid) &&
        Objects.equals(this.directories, fileManagerPage.directories) &&
        Objects.equals(this.files, fileManagerPage.files) &&
        Objects.equals(this.hostname, fileManagerPage.hostname) &&
        Objects.equals(this.parentStorefrontFsDirectoryOid, fileManagerPage.parentStorefrontFsDirectoryOid) &&
        Objects.equals(this.path, fileManagerPage.path) &&
        Objects.equals(this.pathList, fileManagerPage.pathList) &&
        Objects.equals(this.storefrontOid, fileManagerPage.storefrontOid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentStorefrontFsDirectoryOid, directories, files, hostname, parentStorefrontFsDirectoryOid, path, pathList, storefrontOid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileManagerPage {\n");
    
    sb.append("    currentStorefrontFsDirectoryOid: ").append(toIndentedString(currentStorefrontFsDirectoryOid)).append("\n");
    sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    parentStorefrontFsDirectoryOid: ").append(toIndentedString(parentStorefrontFsDirectoryOid)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pathList: ").append(toIndentedString(pathList)).append("\n");
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

