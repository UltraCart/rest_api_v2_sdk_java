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
 * ConversationEventTyping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-08-22T10:13:58.216-04:00")



public class ConversationEventTyping {
  @SerializedName("author_conversation_participant_arn")
  private String authorConversationParticipantArn = null;

  @SerializedName("author_conversation_participant_name")
  private String authorConversationParticipantName = null;

  @SerializedName("value")
  private String value = null;

  public ConversationEventTyping authorConversationParticipantArn(String authorConversationParticipantArn) {
    this.authorConversationParticipantArn = authorConversationParticipantArn;
    return this;
  }

   /**
   * Get authorConversationParticipantArn
   * @return authorConversationParticipantArn
  **/
  @ApiModelProperty(value = "")
  public String getAuthorConversationParticipantArn() {
    return authorConversationParticipantArn;
  }

  public void setAuthorConversationParticipantArn(String authorConversationParticipantArn) {
    this.authorConversationParticipantArn = authorConversationParticipantArn;
  }

  public ConversationEventTyping authorConversationParticipantName(String authorConversationParticipantName) {
    this.authorConversationParticipantName = authorConversationParticipantName;
    return this;
  }

   /**
   * Get authorConversationParticipantName
   * @return authorConversationParticipantName
  **/
  @ApiModelProperty(value = "")
  public String getAuthorConversationParticipantName() {
    return authorConversationParticipantName;
  }

  public void setAuthorConversationParticipantName(String authorConversationParticipantName) {
    this.authorConversationParticipantName = authorConversationParticipantName;
  }

  public ConversationEventTyping value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEventTyping conversationEventTyping = (ConversationEventTyping) o;
    return Objects.equals(this.authorConversationParticipantArn, conversationEventTyping.authorConversationParticipantArn) &&
        Objects.equals(this.authorConversationParticipantName, conversationEventTyping.authorConversationParticipantName) &&
        Objects.equals(this.value, conversationEventTyping.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorConversationParticipantArn, authorConversationParticipantName, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTyping {\n");
    
    sb.append("    authorConversationParticipantArn: ").append(toIndentedString(authorConversationParticipantArn)).append("\n");
    sb.append("    authorConversationParticipantName: ").append(toIndentedString(authorConversationParticipantName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
