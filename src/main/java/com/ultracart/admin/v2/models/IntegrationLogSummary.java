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
 * IntegrationLogSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-08-09T16:22:10.185-04:00")



public class IntegrationLogSummary {
  @SerializedName("critical")
  private Integer critical = null;

  @SerializedName("error")
  private Integer error = null;

  @SerializedName("events")
  private Integer events = null;

  @SerializedName("log_type")
  private String logType = null;

  @SerializedName("logger_id")
  private String loggerId = null;

  @SerializedName("logger_name")
  private String loggerName = null;

  @SerializedName("success")
  private Integer success = null;

  @SerializedName("view_url")
  private String viewUrl = null;

  @SerializedName("warning")
  private Integer warning = null;

  public IntegrationLogSummary critical(Integer critical) {
    this.critical = critical;
    return this;
  }

   /**
   * Get critical
   * @return critical
  **/
  @ApiModelProperty(value = "")
  public Integer getCritical() {
    return critical;
  }

  public void setCritical(Integer critical) {
    this.critical = critical;
  }

  public IntegrationLogSummary error(Integer error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Integer getError() {
    return error;
  }

  public void setError(Integer error) {
    this.error = error;
  }

  public IntegrationLogSummary events(Integer events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public Integer getEvents() {
    return events;
  }

  public void setEvents(Integer events) {
    this.events = events;
  }

  public IntegrationLogSummary logType(String logType) {
    this.logType = logType;
    return this;
  }

   /**
   * Get logType
   * @return logType
  **/
  @ApiModelProperty(value = "")
  public String getLogType() {
    return logType;
  }

  public void setLogType(String logType) {
    this.logType = logType;
  }

  public IntegrationLogSummary loggerId(String loggerId) {
    this.loggerId = loggerId;
    return this;
  }

   /**
   * Get loggerId
   * @return loggerId
  **/
  @ApiModelProperty(value = "")
  public String getLoggerId() {
    return loggerId;
  }

  public void setLoggerId(String loggerId) {
    this.loggerId = loggerId;
  }

  public IntegrationLogSummary loggerName(String loggerName) {
    this.loggerName = loggerName;
    return this;
  }

   /**
   * Get loggerName
   * @return loggerName
  **/
  @ApiModelProperty(value = "")
  public String getLoggerName() {
    return loggerName;
  }

  public void setLoggerName(String loggerName) {
    this.loggerName = loggerName;
  }

  public IntegrationLogSummary success(Integer success) {
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @ApiModelProperty(value = "")
  public Integer getSuccess() {
    return success;
  }

  public void setSuccess(Integer success) {
    this.success = success;
  }

  public IntegrationLogSummary viewUrl(String viewUrl) {
    this.viewUrl = viewUrl;
    return this;
  }

   /**
   * Get viewUrl
   * @return viewUrl
  **/
  @ApiModelProperty(value = "")
  public String getViewUrl() {
    return viewUrl;
  }

  public void setViewUrl(String viewUrl) {
    this.viewUrl = viewUrl;
  }

  public IntegrationLogSummary warning(Integer warning) {
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @ApiModelProperty(value = "")
  public Integer getWarning() {
    return warning;
  }

  public void setWarning(Integer warning) {
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
    IntegrationLogSummary integrationLogSummary = (IntegrationLogSummary) o;
    return Objects.equals(this.critical, integrationLogSummary.critical) &&
        Objects.equals(this.error, integrationLogSummary.error) &&
        Objects.equals(this.events, integrationLogSummary.events) &&
        Objects.equals(this.logType, integrationLogSummary.logType) &&
        Objects.equals(this.loggerId, integrationLogSummary.loggerId) &&
        Objects.equals(this.loggerName, integrationLogSummary.loggerName) &&
        Objects.equals(this.success, integrationLogSummary.success) &&
        Objects.equals(this.viewUrl, integrationLogSummary.viewUrl) &&
        Objects.equals(this.warning, integrationLogSummary.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(critical, error, events, logType, loggerId, loggerName, success, viewUrl, warning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogSummary {\n");
    
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
    sb.append("    loggerId: ").append(toIndentedString(loggerId)).append("\n");
    sb.append("    loggerName: ").append(toIndentedString(loggerName)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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
