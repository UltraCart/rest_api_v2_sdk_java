/*
 * UltraCart Rest API V2
 * This is the next generation UltraCart REST API...
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Error
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class Error {
  @SerializedName("developer_message")
  private String developerMessage = null;

  @SerializedName("error_code")
  private String errorCode = null;

  @SerializedName("more_info")
  private String moreInfo = null;

  @SerializedName("user_message")
  private String userMessage = null;

  public Error developerMessage(String developerMessage) {
    this.developerMessage = developerMessage;
    return this;
  }

   /**
   * A technical message meant to be read by a developer
   * @return developerMessage
  **/
  @ApiModelProperty(value = "A technical message meant to be read by a developer")
  public String getDeveloperMessage() {
    return developerMessage;
  }

  public void setDeveloperMessage(String developerMessage) {
    this.developerMessage = developerMessage;
  }

  public Error errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * HTTP status code
   * @return errorCode
  **/
  @ApiModelProperty(value = "HTTP status code")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public Error moreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

   /**
   * Additional information often a link to additional documentation
   * @return moreInfo
  **/
  @ApiModelProperty(value = "Additional information often a link to additional documentation")
  public String getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(String moreInfo) {
    this.moreInfo = moreInfo;
  }

  public Error userMessage(String userMessage) {
    this.userMessage = userMessage;
    return this;
  }

   /**
   * An end-user friendly message suitable for display to the customer
   * @return userMessage
  **/
  @ApiModelProperty(value = "An end-user friendly message suitable for display to the customer")
  public String getUserMessage() {
    return userMessage;
  }

  public void setUserMessage(String userMessage) {
    this.userMessage = userMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.developerMessage, error.developerMessage) &&
        Objects.equals(this.errorCode, error.errorCode) &&
        Objects.equals(this.moreInfo, error.moreInfo) &&
        Objects.equals(this.userMessage, error.userMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(developerMessage, errorCode, moreInfo, userMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    developerMessage: ").append(toIndentedString(developerMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
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
