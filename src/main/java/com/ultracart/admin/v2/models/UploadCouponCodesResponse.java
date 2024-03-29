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
import com.ultracart.admin.v2.models.ResponseMetadata;
import com.ultracart.admin.v2.models.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * UploadCouponCodesResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class UploadCouponCodesResponse {
  @SerializedName("duplicate_codes")
  private List<String> duplicateCodes = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("rejected_codes")
  private List<String> rejectedCodes = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("uploaded_codes")
  private List<String> uploadedCodes = null;

  @SerializedName("warning")
  private Warning warning = null;

  public UploadCouponCodesResponse duplicateCodes(List<String> duplicateCodes) {
    this.duplicateCodes = duplicateCodes;
    return this;
  }

  public UploadCouponCodesResponse addDuplicateCodesItem(String duplicateCodesItem) {
    if (this.duplicateCodes == null) {
      this.duplicateCodes = new ArrayList<String>();
    }
    this.duplicateCodes.add(duplicateCodesItem);
    return this;
  }

   /**
   * Duplicate codes
   * @return duplicateCodes
  **/
  @ApiModelProperty(value = "Duplicate codes")
  public List<String> getDuplicateCodes() {
    return duplicateCodes;
  }

  public void setDuplicateCodes(List<String> duplicateCodes) {
    this.duplicateCodes = duplicateCodes;
  }

  public UploadCouponCodesResponse error(Error error) {
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

  public UploadCouponCodesResponse metadata(ResponseMetadata metadata) {
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

  public UploadCouponCodesResponse rejectedCodes(List<String> rejectedCodes) {
    this.rejectedCodes = rejectedCodes;
    return this;
  }

  public UploadCouponCodesResponse addRejectedCodesItem(String rejectedCodesItem) {
    if (this.rejectedCodes == null) {
      this.rejectedCodes = new ArrayList<String>();
    }
    this.rejectedCodes.add(rejectedCodesItem);
    return this;
  }

   /**
   * Rejected codes
   * @return rejectedCodes
  **/
  @ApiModelProperty(value = "Rejected codes")
  public List<String> getRejectedCodes() {
    return rejectedCodes;
  }

  public void setRejectedCodes(List<String> rejectedCodes) {
    this.rejectedCodes = rejectedCodes;
  }

  public UploadCouponCodesResponse success(Boolean success) {
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

  public UploadCouponCodesResponse uploadedCodes(List<String> uploadedCodes) {
    this.uploadedCodes = uploadedCodes;
    return this;
  }

  public UploadCouponCodesResponse addUploadedCodesItem(String uploadedCodesItem) {
    if (this.uploadedCodes == null) {
      this.uploadedCodes = new ArrayList<String>();
    }
    this.uploadedCodes.add(uploadedCodesItem);
    return this;
  }

   /**
   * Uploaded codes
   * @return uploadedCodes
  **/
  @ApiModelProperty(value = "Uploaded codes")
  public List<String> getUploadedCodes() {
    return uploadedCodes;
  }

  public void setUploadedCodes(List<String> uploadedCodes) {
    this.uploadedCodes = uploadedCodes;
  }

  public UploadCouponCodesResponse warning(Warning warning) {
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
    UploadCouponCodesResponse uploadCouponCodesResponse = (UploadCouponCodesResponse) o;
    return Objects.equals(this.duplicateCodes, uploadCouponCodesResponse.duplicateCodes) &&
        Objects.equals(this.error, uploadCouponCodesResponse.error) &&
        Objects.equals(this.metadata, uploadCouponCodesResponse.metadata) &&
        Objects.equals(this.rejectedCodes, uploadCouponCodesResponse.rejectedCodes) &&
        Objects.equals(this.success, uploadCouponCodesResponse.success) &&
        Objects.equals(this.uploadedCodes, uploadCouponCodesResponse.uploadedCodes) &&
        Objects.equals(this.warning, uploadCouponCodesResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duplicateCodes, error, metadata, rejectedCodes, success, uploadedCodes, warning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadCouponCodesResponse {\n");
    
    sb.append("    duplicateCodes: ").append(toIndentedString(duplicateCodes)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    rejectedCodes: ").append(toIndentedString(rejectedCodes)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    uploadedCodes: ").append(toIndentedString(uploadedCodes)).append("\n");
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

