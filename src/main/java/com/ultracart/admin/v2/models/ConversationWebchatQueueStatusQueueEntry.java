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
 * ConversationWebchatQueueStatusQueueEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:29:46.161-04:00")



public class ConversationWebchatQueueStatusQueueEntry {
  @SerializedName("conversation_participant_arn")
  private String conversationParticipantArn = null;

  @SerializedName("conversation_participant_name")
  private String conversationParticipantName = null;

  @SerializedName("conversation_webchat_queue_uuid")
  private String conversationWebchatQueueUuid = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("join_dts")
  private String joinDts = null;

  @SerializedName("question")
  private String question = null;

  public ConversationWebchatQueueStatusQueueEntry conversationParticipantArn(String conversationParticipantArn) {
    this.conversationParticipantArn = conversationParticipantArn;
    return this;
  }

   /**
   * Get conversationParticipantArn
   * @return conversationParticipantArn
  **/
  @ApiModelProperty(value = "")
  public String getConversationParticipantArn() {
    return conversationParticipantArn;
  }

  public void setConversationParticipantArn(String conversationParticipantArn) {
    this.conversationParticipantArn = conversationParticipantArn;
  }

  public ConversationWebchatQueueStatusQueueEntry conversationParticipantName(String conversationParticipantName) {
    this.conversationParticipantName = conversationParticipantName;
    return this;
  }

   /**
   * Get conversationParticipantName
   * @return conversationParticipantName
  **/
  @ApiModelProperty(value = "")
  public String getConversationParticipantName() {
    return conversationParticipantName;
  }

  public void setConversationParticipantName(String conversationParticipantName) {
    this.conversationParticipantName = conversationParticipantName;
  }

  public ConversationWebchatQueueStatusQueueEntry conversationWebchatQueueUuid(String conversationWebchatQueueUuid) {
    this.conversationWebchatQueueUuid = conversationWebchatQueueUuid;
    return this;
  }

   /**
   * Get conversationWebchatQueueUuid
   * @return conversationWebchatQueueUuid
  **/
  @ApiModelProperty(value = "")
  public String getConversationWebchatQueueUuid() {
    return conversationWebchatQueueUuid;
  }

  public void setConversationWebchatQueueUuid(String conversationWebchatQueueUuid) {
    this.conversationWebchatQueueUuid = conversationWebchatQueueUuid;
  }

  public ConversationWebchatQueueStatusQueueEntry email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ConversationWebchatQueueStatusQueueEntry joinDts(String joinDts) {
    this.joinDts = joinDts;
    return this;
  }

   /**
   * Date/time the customer joined the queue
   * @return joinDts
  **/
  @ApiModelProperty(value = "Date/time the customer joined the queue")
  public String getJoinDts() {
    return joinDts;
  }

  public void setJoinDts(String joinDts) {
    this.joinDts = joinDts;
  }

  public ConversationWebchatQueueStatusQueueEntry question(String question) {
    this.question = question;
    return this;
  }

   /**
   * Get question
   * @return question
  **/
  @ApiModelProperty(value = "")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationWebchatQueueStatusQueueEntry conversationWebchatQueueStatusQueueEntry = (ConversationWebchatQueueStatusQueueEntry) o;
    return Objects.equals(this.conversationParticipantArn, conversationWebchatQueueStatusQueueEntry.conversationParticipantArn) &&
        Objects.equals(this.conversationParticipantName, conversationWebchatQueueStatusQueueEntry.conversationParticipantName) &&
        Objects.equals(this.conversationWebchatQueueUuid, conversationWebchatQueueStatusQueueEntry.conversationWebchatQueueUuid) &&
        Objects.equals(this.email, conversationWebchatQueueStatusQueueEntry.email) &&
        Objects.equals(this.joinDts, conversationWebchatQueueStatusQueueEntry.joinDts) &&
        Objects.equals(this.question, conversationWebchatQueueStatusQueueEntry.question);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationParticipantArn, conversationParticipantName, conversationWebchatQueueUuid, email, joinDts, question);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationWebchatQueueStatusQueueEntry {\n");
    
    sb.append("    conversationParticipantArn: ").append(toIndentedString(conversationParticipantArn)).append("\n");
    sb.append("    conversationParticipantName: ").append(toIndentedString(conversationParticipantName)).append("\n");
    sb.append("    conversationWebchatQueueUuid: ").append(toIndentedString(conversationWebchatQueueUuid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    joinDts: ").append(toIndentedString(joinDts)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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
