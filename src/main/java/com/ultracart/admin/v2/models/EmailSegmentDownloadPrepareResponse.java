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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.ResponseMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * EmailSegmentDownloadPrepareResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-23T15:16:21.092-05:00")
public class EmailSegmentDownloadPrepareResponse {
  @SerializedName("email_segment_rebuild_uuid")
  private String emailSegmentRebuildUuid = null;

  @SerializedName("email_segment_uuid")
  private String emailSegmentUuid = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("percentage_complete")
  private BigDecimal percentageComplete = null;

  @SerializedName("proceed")
  private Boolean proceed = null;

  @SerializedName("success")
  private Boolean success = null;

  public EmailSegmentDownloadPrepareResponse emailSegmentRebuildUuid(String emailSegmentRebuildUuid) {
    this.emailSegmentRebuildUuid = emailSegmentRebuildUuid;
    return this;
  }

   /**
   * Get emailSegmentRebuildUuid
   * @return emailSegmentRebuildUuid
  **/
  @ApiModelProperty(value = "")
  public String getEmailSegmentRebuildUuid() {
    return emailSegmentRebuildUuid;
  }

  public void setEmailSegmentRebuildUuid(String emailSegmentRebuildUuid) {
    this.emailSegmentRebuildUuid = emailSegmentRebuildUuid;
  }

  public EmailSegmentDownloadPrepareResponse emailSegmentUuid(String emailSegmentUuid) {
    this.emailSegmentUuid = emailSegmentUuid;
    return this;
  }

   /**
   * Get emailSegmentUuid
   * @return emailSegmentUuid
  **/
  @ApiModelProperty(value = "")
  public String getEmailSegmentUuid() {
    return emailSegmentUuid;
  }

  public void setEmailSegmentUuid(String emailSegmentUuid) {
    this.emailSegmentUuid = emailSegmentUuid;
  }

  public EmailSegmentDownloadPrepareResponse error(Error error) {
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

  public EmailSegmentDownloadPrepareResponse metadata(ResponseMetadata metadata) {
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

  public EmailSegmentDownloadPrepareResponse percentageComplete(BigDecimal percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }

   /**
   * Get percentageComplete
   * @return percentageComplete
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPercentageComplete() {
    return percentageComplete;
  }

  public void setPercentageComplete(BigDecimal percentageComplete) {
    this.percentageComplete = percentageComplete;
  }

  public EmailSegmentDownloadPrepareResponse proceed(Boolean proceed) {
    this.proceed = proceed;
    return this;
  }

   /**
   * Get proceed
   * @return proceed
  **/
  @ApiModelProperty(value = "")
  public Boolean isProceed() {
    return proceed;
  }

  public void setProceed(Boolean proceed) {
    this.proceed = proceed;
  }

  public EmailSegmentDownloadPrepareResponse success(Boolean success) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSegmentDownloadPrepareResponse emailSegmentDownloadPrepareResponse = (EmailSegmentDownloadPrepareResponse) o;
    return Objects.equals(this.emailSegmentRebuildUuid, emailSegmentDownloadPrepareResponse.emailSegmentRebuildUuid) &&
        Objects.equals(this.emailSegmentUuid, emailSegmentDownloadPrepareResponse.emailSegmentUuid) &&
        Objects.equals(this.error, emailSegmentDownloadPrepareResponse.error) &&
        Objects.equals(this.metadata, emailSegmentDownloadPrepareResponse.metadata) &&
        Objects.equals(this.percentageComplete, emailSegmentDownloadPrepareResponse.percentageComplete) &&
        Objects.equals(this.proceed, emailSegmentDownloadPrepareResponse.proceed) &&
        Objects.equals(this.success, emailSegmentDownloadPrepareResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailSegmentRebuildUuid, emailSegmentUuid, error, metadata, percentageComplete, proceed, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSegmentDownloadPrepareResponse {\n");
    
    sb.append("    emailSegmentRebuildUuid: ").append(toIndentedString(emailSegmentRebuildUuid)).append("\n");
    sb.append("    emailSegmentUuid: ").append(toIndentedString(emailSegmentUuid)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
    sb.append("    proceed: ").append(toIndentedString(proceed)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
