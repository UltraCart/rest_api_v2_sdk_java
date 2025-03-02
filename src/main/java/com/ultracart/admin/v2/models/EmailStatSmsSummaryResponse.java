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
import com.ultracart.admin.v2.models.EmailSmsStat;
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.ResponseMetadata;
import com.ultracart.admin.v2.models.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EmailStatSmsSummaryResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:16:56.926-05:00")



public class EmailStatSmsSummaryResponse {
  @SerializedName("error")
  private Error error = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("stats")
  private List<EmailSmsStat> stats = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("warning")
  private Warning warning = null;

  public EmailStatSmsSummaryResponse error(Error error) {
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

  public EmailStatSmsSummaryResponse metadata(ResponseMetadata metadata) {
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

  public EmailStatSmsSummaryResponse stats(List<EmailSmsStat> stats) {
    this.stats = stats;
    return this;
  }

  public EmailStatSmsSummaryResponse addStatsItem(EmailSmsStat statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<EmailSmsStat>();
    }
    this.stats.add(statsItem);
    return this;
  }

   /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
  public List<EmailSmsStat> getStats() {
    return stats;
  }

  public void setStats(List<EmailSmsStat> stats) {
    this.stats = stats;
  }

  public EmailStatSmsSummaryResponse success(Boolean success) {
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

  public EmailStatSmsSummaryResponse warning(Warning warning) {
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
    EmailStatSmsSummaryResponse emailStatSmsSummaryResponse = (EmailStatSmsSummaryResponse) o;
    return Objects.equals(this.error, emailStatSmsSummaryResponse.error) &&
        Objects.equals(this.metadata, emailStatSmsSummaryResponse.metadata) &&
        Objects.equals(this.stats, emailStatSmsSummaryResponse.stats) &&
        Objects.equals(this.success, emailStatSmsSummaryResponse.success) &&
        Objects.equals(this.warning, emailStatSmsSummaryResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, metadata, stats, success, warning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailStatSmsSummaryResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

