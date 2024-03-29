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
 * WorkflowAttachment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class WorkflowAttachment {
  @SerializedName("download_key")
  private String downloadKey = null;

  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("file_uuid")
  private String fileUuid = null;

  @SerializedName("mime_type")
  private String mimeType = null;

  @SerializedName("upload_key")
  private String uploadKey = null;

  public WorkflowAttachment downloadKey(String downloadKey) {
    this.downloadKey = downloadKey;
    return this;
  }

   /**
   * Temporary download URL
   * @return downloadKey
  **/
  @ApiModelProperty(value = "Temporary download URL")
  public String getDownloadKey() {
    return downloadKey;
  }

  public void setDownloadKey(String downloadKey) {
    this.downloadKey = downloadKey;
  }

  public WorkflowAttachment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File name
   * @return fileName
  **/
  @ApiModelProperty(value = "File name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public WorkflowAttachment fileUuid(String fileUuid) {
    this.fileUuid = fileUuid;
    return this;
  }

   /**
   * File UUID
   * @return fileUuid
  **/
  @ApiModelProperty(value = "File UUID")
  public String getFileUuid() {
    return fileUuid;
  }

  public void setFileUuid(String fileUuid) {
    this.fileUuid = fileUuid;
  }

  public WorkflowAttachment mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Mime Type
   * @return mimeType
  **/
  @ApiModelProperty(value = "Mime Type")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public WorkflowAttachment uploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
    return this;
  }

   /**
   * Temporary upload key
   * @return uploadKey
  **/
  @ApiModelProperty(value = "Temporary upload key")
  public String getUploadKey() {
    return uploadKey;
  }

  public void setUploadKey(String uploadKey) {
    this.uploadKey = uploadKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowAttachment workflowAttachment = (WorkflowAttachment) o;
    return Objects.equals(this.downloadKey, workflowAttachment.downloadKey) &&
        Objects.equals(this.fileName, workflowAttachment.fileName) &&
        Objects.equals(this.fileUuid, workflowAttachment.fileUuid) &&
        Objects.equals(this.mimeType, workflowAttachment.mimeType) &&
        Objects.equals(this.uploadKey, workflowAttachment.uploadKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadKey, fileName, fileUuid, mimeType, uploadKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowAttachment {\n");
    
    sb.append("    downloadKey: ").append(toIndentedString(downloadKey)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileUuid: ").append(toIndentedString(fileUuid)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    uploadKey: ").append(toIndentedString(uploadKey)).append("\n");
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

