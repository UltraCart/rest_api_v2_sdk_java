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
import java.util.ArrayList;
import java.util.List;

/**
 * ConversationStartRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:29:46.161-04:00")



public class ConversationStartRequest {
  @SerializedName("add_conversation_participant_arns")
  private List<String> addConversationParticipantArns = null;

  @SerializedName("conversation_arn")
  private String conversationArn = null;

  @SerializedName("conversation_webchat_queue_uuid")
  private String conversationWebchatQueueUuid = null;

  public ConversationStartRequest addConversationParticipantArns(List<String> addConversationParticipantArns) {
    this.addConversationParticipantArns = addConversationParticipantArns;
    return this;
  }

  public ConversationStartRequest addAddConversationParticipantArnsItem(String addConversationParticipantArnsItem) {
    if (this.addConversationParticipantArns == null) {
      this.addConversationParticipantArns = new ArrayList<String>();
    }
    this.addConversationParticipantArns.add(addConversationParticipantArnsItem);
    return this;
  }

   /**
   * Get addConversationParticipantArns
   * @return addConversationParticipantArns
  **/
  @ApiModelProperty(value = "")
  public List<String> getAddConversationParticipantArns() {
    return addConversationParticipantArns;
  }

  public void setAddConversationParticipantArns(List<String> addConversationParticipantArns) {
    this.addConversationParticipantArns = addConversationParticipantArns;
  }

  public ConversationStartRequest conversationArn(String conversationArn) {
    this.conversationArn = conversationArn;
    return this;
  }

   /**
   * Get conversationArn
   * @return conversationArn
  **/
  @ApiModelProperty(value = "")
  public String getConversationArn() {
    return conversationArn;
  }

  public void setConversationArn(String conversationArn) {
    this.conversationArn = conversationArn;
  }

  public ConversationStartRequest conversationWebchatQueueUuid(String conversationWebchatQueueUuid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationStartRequest conversationStartRequest = (ConversationStartRequest) o;
    return Objects.equals(this.addConversationParticipantArns, conversationStartRequest.addConversationParticipantArns) &&
        Objects.equals(this.conversationArn, conversationStartRequest.conversationArn) &&
        Objects.equals(this.conversationWebchatQueueUuid, conversationStartRequest.conversationWebchatQueueUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addConversationParticipantArns, conversationArn, conversationWebchatQueueUuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationStartRequest {\n");
    
    sb.append("    addConversationParticipantArns: ").append(toIndentedString(addConversationParticipantArns)).append("\n");
    sb.append("    conversationArn: ").append(toIndentedString(conversationArn)).append("\n");
    sb.append("    conversationWebchatQueueUuid: ").append(toIndentedString(conversationWebchatQueueUuid)).append("\n");
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
