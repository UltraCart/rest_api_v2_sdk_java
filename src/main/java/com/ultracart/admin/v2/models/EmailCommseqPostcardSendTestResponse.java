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

/**
 * EmailCommseqPostcardSendTestResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-01T07:55:46.727-05:00")



public class EmailCommseqPostcardSendTestResponse {
  @SerializedName("backThumbnail")
  private String backThumbnail = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("frontThumbnail")
  private String frontThumbnail = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("renderedPdf")
  private String renderedPdf = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("warning")
  private Warning warning = null;

  public EmailCommseqPostcardSendTestResponse backThumbnail(String backThumbnail) {
    this.backThumbnail = backThumbnail;
    return this;
  }

   /**
   * Get backThumbnail
   * @return backThumbnail
  **/
  @ApiModelProperty(value = "")
  public String getBackThumbnail() {
    return backThumbnail;
  }

  public void setBackThumbnail(String backThumbnail) {
    this.backThumbnail = backThumbnail;
  }

  public EmailCommseqPostcardSendTestResponse error(Error error) {
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

  public EmailCommseqPostcardSendTestResponse frontThumbnail(String frontThumbnail) {
    this.frontThumbnail = frontThumbnail;
    return this;
  }

   /**
   * Get frontThumbnail
   * @return frontThumbnail
  **/
  @ApiModelProperty(value = "")
  public String getFrontThumbnail() {
    return frontThumbnail;
  }

  public void setFrontThumbnail(String frontThumbnail) {
    this.frontThumbnail = frontThumbnail;
  }

  public EmailCommseqPostcardSendTestResponse metadata(ResponseMetadata metadata) {
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

  public EmailCommseqPostcardSendTestResponse renderedPdf(String renderedPdf) {
    this.renderedPdf = renderedPdf;
    return this;
  }

   /**
   * Get renderedPdf
   * @return renderedPdf
  **/
  @ApiModelProperty(value = "")
  public String getRenderedPdf() {
    return renderedPdf;
  }

  public void setRenderedPdf(String renderedPdf) {
    this.renderedPdf = renderedPdf;
  }

  public EmailCommseqPostcardSendTestResponse success(Boolean success) {
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

  public EmailCommseqPostcardSendTestResponse warning(Warning warning) {
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
    EmailCommseqPostcardSendTestResponse emailCommseqPostcardSendTestResponse = (EmailCommseqPostcardSendTestResponse) o;
    return Objects.equals(this.backThumbnail, emailCommseqPostcardSendTestResponse.backThumbnail) &&
        Objects.equals(this.error, emailCommseqPostcardSendTestResponse.error) &&
        Objects.equals(this.frontThumbnail, emailCommseqPostcardSendTestResponse.frontThumbnail) &&
        Objects.equals(this.metadata, emailCommseqPostcardSendTestResponse.metadata) &&
        Objects.equals(this.renderedPdf, emailCommseqPostcardSendTestResponse.renderedPdf) &&
        Objects.equals(this.success, emailCommseqPostcardSendTestResponse.success) &&
        Objects.equals(this.warning, emailCommseqPostcardSendTestResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backThumbnail, error, frontThumbnail, metadata, renderedPdf, success, warning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCommseqPostcardSendTestResponse {\n");
    
    sb.append("    backThumbnail: ").append(toIndentedString(backThumbnail)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    frontThumbnail: ").append(toIndentedString(frontThumbnail)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    renderedPdf: ").append(toIndentedString(renderedPdf)).append("\n");
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
