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
 * EmailDashboardActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class EmailDashboardActivity {
  @SerializedName("action")
  private String action = null;

  @SerializedName("activity_dts")
  private String activityDts = null;

  @SerializedName("destination_name")
  private String destinationName = null;

  @SerializedName("destination_uuid")
  private String destinationUuid = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("is_list")
  private Boolean isList = null;

  @SerializedName("is_segment")
  private Boolean isSegment = null;

  public EmailDashboardActivity action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Type of action such as add, remove, subscribe, unsubscribe
   * @return action
  **/
  @ApiModelProperty(value = "Type of action such as add, remove, subscribe, unsubscribe")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public EmailDashboardActivity activityDts(String activityDts) {
    this.activityDts = activityDts;
    return this;
  }

   /**
   * Date/time of the activity
   * @return activityDts
  **/
  @ApiModelProperty(value = "Date/time of the activity")
  public String getActivityDts() {
    return activityDts;
  }

  public void setActivityDts(String activityDts) {
    this.activityDts = activityDts;
  }

  public EmailDashboardActivity destinationName(String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

   /**
   * List or segment name
   * @return destinationName
  **/
  @ApiModelProperty(value = "List or segment name")
  public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }

  public EmailDashboardActivity destinationUuid(String destinationUuid) {
    this.destinationUuid = destinationUuid;
    return this;
  }

   /**
   * List or segment uuid
   * @return destinationUuid
  **/
  @ApiModelProperty(value = "List or segment uuid")
  public String getDestinationUuid() {
    return destinationUuid;
  }

  public void setDestinationUuid(String destinationUuid) {
    this.destinationUuid = destinationUuid;
  }

  public EmailDashboardActivity email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address
   * @return email
  **/
  @ApiModelProperty(value = "Email address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EmailDashboardActivity isList(Boolean isList) {
    this.isList = isList;
    return this;
  }

   /**
   * true if activity is related to list
   * @return isList
  **/
  @ApiModelProperty(value = "true if activity is related to list")
  public Boolean isIsList() {
    return isList;
  }

  public void setIsList(Boolean isList) {
    this.isList = isList;
  }

  public EmailDashboardActivity isSegment(Boolean isSegment) {
    this.isSegment = isSegment;
    return this;
  }

   /**
   * true if activity is related to segment
   * @return isSegment
  **/
  @ApiModelProperty(value = "true if activity is related to segment")
  public Boolean isIsSegment() {
    return isSegment;
  }

  public void setIsSegment(Boolean isSegment) {
    this.isSegment = isSegment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailDashboardActivity emailDashboardActivity = (EmailDashboardActivity) o;
    return Objects.equals(this.action, emailDashboardActivity.action) &&
        Objects.equals(this.activityDts, emailDashboardActivity.activityDts) &&
        Objects.equals(this.destinationName, emailDashboardActivity.destinationName) &&
        Objects.equals(this.destinationUuid, emailDashboardActivity.destinationUuid) &&
        Objects.equals(this.email, emailDashboardActivity.email) &&
        Objects.equals(this.isList, emailDashboardActivity.isList) &&
        Objects.equals(this.isSegment, emailDashboardActivity.isSegment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, activityDts, destinationName, destinationUuid, email, isList, isSegment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailDashboardActivity {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activityDts: ").append(toIndentedString(activityDts)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    destinationUuid: ").append(toIndentedString(destinationUuid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isList: ").append(toIndentedString(isList)).append("\n");
    sb.append("    isSegment: ").append(toIndentedString(isSegment)).append("\n");
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

