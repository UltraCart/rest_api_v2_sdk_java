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
import com.ultracart.admin.v2.models.ConversationWebchatQueueStatusAgent;
import com.ultracart.admin.v2.models.ConversationWebchatQueueStatusQueueEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConversationWebchatQueueStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-07-29T12:29:46.161-04:00")



public class ConversationWebchatQueueStatus {
  @SerializedName("agent_available_count")
  private Integer agentAvailableCount = null;

  @SerializedName("agent_busy_count")
  private Integer agentBusyCount = null;

  @SerializedName("agent_count")
  private Integer agentCount = null;

  @SerializedName("agent_unavailable_count")
  private Integer agentUnavailableCount = null;

  @SerializedName("agents")
  private List<ConversationWebchatQueueStatusAgent> agents = null;

  @SerializedName("customer_abandon_count")
  private Integer customerAbandonCount = null;

  @SerializedName("customer_active_count")
  private Integer customerActiveCount = null;

  @SerializedName("customer_average_abandon_time_seconds")
  private Integer customerAverageAbandonTimeSeconds = null;

  @SerializedName("customer_average_chat_time_seconds")
  private Integer customerAverageChatTimeSeconds = null;

  @SerializedName("customer_average_hold_time_seconds")
  private Integer customerAverageHoldTimeSeconds = null;

  @SerializedName("customer_chat_count")
  private Integer customerChatCount = null;

  @SerializedName("customer_waiting_count")
  private Integer customerWaitingCount = null;

  @SerializedName("customer_waiting_join_dts")
  private String customerWaitingJoinDts = null;

  @SerializedName("queue_entries")
  private List<ConversationWebchatQueueStatusQueueEntry> queueEntries = null;

  @SerializedName("queue_name")
  private String queueName = null;

  public ConversationWebchatQueueStatus agentAvailableCount(Integer agentAvailableCount) {
    this.agentAvailableCount = agentAvailableCount;
    return this;
  }

   /**
   * Get agentAvailableCount
   * @return agentAvailableCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAgentAvailableCount() {
    return agentAvailableCount;
  }

  public void setAgentAvailableCount(Integer agentAvailableCount) {
    this.agentAvailableCount = agentAvailableCount;
  }

  public ConversationWebchatQueueStatus agentBusyCount(Integer agentBusyCount) {
    this.agentBusyCount = agentBusyCount;
    return this;
  }

   /**
   * Get agentBusyCount
   * @return agentBusyCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAgentBusyCount() {
    return agentBusyCount;
  }

  public void setAgentBusyCount(Integer agentBusyCount) {
    this.agentBusyCount = agentBusyCount;
  }

  public ConversationWebchatQueueStatus agentCount(Integer agentCount) {
    this.agentCount = agentCount;
    return this;
  }

   /**
   * Get agentCount
   * @return agentCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAgentCount() {
    return agentCount;
  }

  public void setAgentCount(Integer agentCount) {
    this.agentCount = agentCount;
  }

  public ConversationWebchatQueueStatus agentUnavailableCount(Integer agentUnavailableCount) {
    this.agentUnavailableCount = agentUnavailableCount;
    return this;
  }

   /**
   * Get agentUnavailableCount
   * @return agentUnavailableCount
  **/
  @ApiModelProperty(value = "")
  public Integer getAgentUnavailableCount() {
    return agentUnavailableCount;
  }

  public void setAgentUnavailableCount(Integer agentUnavailableCount) {
    this.agentUnavailableCount = agentUnavailableCount;
  }

  public ConversationWebchatQueueStatus agents(List<ConversationWebchatQueueStatusAgent> agents) {
    this.agents = agents;
    return this;
  }

  public ConversationWebchatQueueStatus addAgentsItem(ConversationWebchatQueueStatusAgent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<ConversationWebchatQueueStatusAgent>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * Get agents
   * @return agents
  **/
  @ApiModelProperty(value = "")
  public List<ConversationWebchatQueueStatusAgent> getAgents() {
    return agents;
  }

  public void setAgents(List<ConversationWebchatQueueStatusAgent> agents) {
    this.agents = agents;
  }

  public ConversationWebchatQueueStatus customerAbandonCount(Integer customerAbandonCount) {
    this.customerAbandonCount = customerAbandonCount;
    return this;
  }

   /**
   * Get customerAbandonCount
   * @return customerAbandonCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerAbandonCount() {
    return customerAbandonCount;
  }

  public void setCustomerAbandonCount(Integer customerAbandonCount) {
    this.customerAbandonCount = customerAbandonCount;
  }

  public ConversationWebchatQueueStatus customerActiveCount(Integer customerActiveCount) {
    this.customerActiveCount = customerActiveCount;
    return this;
  }

   /**
   * Get customerActiveCount
   * @return customerActiveCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerActiveCount() {
    return customerActiveCount;
  }

  public void setCustomerActiveCount(Integer customerActiveCount) {
    this.customerActiveCount = customerActiveCount;
  }

  public ConversationWebchatQueueStatus customerAverageAbandonTimeSeconds(Integer customerAverageAbandonTimeSeconds) {
    this.customerAverageAbandonTimeSeconds = customerAverageAbandonTimeSeconds;
    return this;
  }

   /**
   * Get customerAverageAbandonTimeSeconds
   * @return customerAverageAbandonTimeSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerAverageAbandonTimeSeconds() {
    return customerAverageAbandonTimeSeconds;
  }

  public void setCustomerAverageAbandonTimeSeconds(Integer customerAverageAbandonTimeSeconds) {
    this.customerAverageAbandonTimeSeconds = customerAverageAbandonTimeSeconds;
  }

  public ConversationWebchatQueueStatus customerAverageChatTimeSeconds(Integer customerAverageChatTimeSeconds) {
    this.customerAverageChatTimeSeconds = customerAverageChatTimeSeconds;
    return this;
  }

   /**
   * Get customerAverageChatTimeSeconds
   * @return customerAverageChatTimeSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerAverageChatTimeSeconds() {
    return customerAverageChatTimeSeconds;
  }

  public void setCustomerAverageChatTimeSeconds(Integer customerAverageChatTimeSeconds) {
    this.customerAverageChatTimeSeconds = customerAverageChatTimeSeconds;
  }

  public ConversationWebchatQueueStatus customerAverageHoldTimeSeconds(Integer customerAverageHoldTimeSeconds) {
    this.customerAverageHoldTimeSeconds = customerAverageHoldTimeSeconds;
    return this;
  }

   /**
   * Get customerAverageHoldTimeSeconds
   * @return customerAverageHoldTimeSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerAverageHoldTimeSeconds() {
    return customerAverageHoldTimeSeconds;
  }

  public void setCustomerAverageHoldTimeSeconds(Integer customerAverageHoldTimeSeconds) {
    this.customerAverageHoldTimeSeconds = customerAverageHoldTimeSeconds;
  }

  public ConversationWebchatQueueStatus customerChatCount(Integer customerChatCount) {
    this.customerChatCount = customerChatCount;
    return this;
  }

   /**
   * Get customerChatCount
   * @return customerChatCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerChatCount() {
    return customerChatCount;
  }

  public void setCustomerChatCount(Integer customerChatCount) {
    this.customerChatCount = customerChatCount;
  }

  public ConversationWebchatQueueStatus customerWaitingCount(Integer customerWaitingCount) {
    this.customerWaitingCount = customerWaitingCount;
    return this;
  }

   /**
   * Get customerWaitingCount
   * @return customerWaitingCount
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerWaitingCount() {
    return customerWaitingCount;
  }

  public void setCustomerWaitingCount(Integer customerWaitingCount) {
    this.customerWaitingCount = customerWaitingCount;
  }

  public ConversationWebchatQueueStatus customerWaitingJoinDts(String customerWaitingJoinDts) {
    this.customerWaitingJoinDts = customerWaitingJoinDts;
    return this;
  }

   /**
   * Date/time that the oldest person joined the queue
   * @return customerWaitingJoinDts
  **/
  @ApiModelProperty(value = "Date/time that the oldest person joined the queue")
  public String getCustomerWaitingJoinDts() {
    return customerWaitingJoinDts;
  }

  public void setCustomerWaitingJoinDts(String customerWaitingJoinDts) {
    this.customerWaitingJoinDts = customerWaitingJoinDts;
  }

  public ConversationWebchatQueueStatus queueEntries(List<ConversationWebchatQueueStatusQueueEntry> queueEntries) {
    this.queueEntries = queueEntries;
    return this;
  }

  public ConversationWebchatQueueStatus addQueueEntriesItem(ConversationWebchatQueueStatusQueueEntry queueEntriesItem) {
    if (this.queueEntries == null) {
      this.queueEntries = new ArrayList<ConversationWebchatQueueStatusQueueEntry>();
    }
    this.queueEntries.add(queueEntriesItem);
    return this;
  }

   /**
   * Get queueEntries
   * @return queueEntries
  **/
  @ApiModelProperty(value = "")
  public List<ConversationWebchatQueueStatusQueueEntry> getQueueEntries() {
    return queueEntries;
  }

  public void setQueueEntries(List<ConversationWebchatQueueStatusQueueEntry> queueEntries) {
    this.queueEntries = queueEntries;
  }

  public ConversationWebchatQueueStatus queueName(String queueName) {
    this.queueName = queueName;
    return this;
  }

   /**
   * Get queueName
   * @return queueName
  **/
  @ApiModelProperty(value = "")
  public String getQueueName() {
    return queueName;
  }

  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationWebchatQueueStatus conversationWebchatQueueStatus = (ConversationWebchatQueueStatus) o;
    return Objects.equals(this.agentAvailableCount, conversationWebchatQueueStatus.agentAvailableCount) &&
        Objects.equals(this.agentBusyCount, conversationWebchatQueueStatus.agentBusyCount) &&
        Objects.equals(this.agentCount, conversationWebchatQueueStatus.agentCount) &&
        Objects.equals(this.agentUnavailableCount, conversationWebchatQueueStatus.agentUnavailableCount) &&
        Objects.equals(this.agents, conversationWebchatQueueStatus.agents) &&
        Objects.equals(this.customerAbandonCount, conversationWebchatQueueStatus.customerAbandonCount) &&
        Objects.equals(this.customerActiveCount, conversationWebchatQueueStatus.customerActiveCount) &&
        Objects.equals(this.customerAverageAbandonTimeSeconds, conversationWebchatQueueStatus.customerAverageAbandonTimeSeconds) &&
        Objects.equals(this.customerAverageChatTimeSeconds, conversationWebchatQueueStatus.customerAverageChatTimeSeconds) &&
        Objects.equals(this.customerAverageHoldTimeSeconds, conversationWebchatQueueStatus.customerAverageHoldTimeSeconds) &&
        Objects.equals(this.customerChatCount, conversationWebchatQueueStatus.customerChatCount) &&
        Objects.equals(this.customerWaitingCount, conversationWebchatQueueStatus.customerWaitingCount) &&
        Objects.equals(this.customerWaitingJoinDts, conversationWebchatQueueStatus.customerWaitingJoinDts) &&
        Objects.equals(this.queueEntries, conversationWebchatQueueStatus.queueEntries) &&
        Objects.equals(this.queueName, conversationWebchatQueueStatus.queueName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentAvailableCount, agentBusyCount, agentCount, agentUnavailableCount, agents, customerAbandonCount, customerActiveCount, customerAverageAbandonTimeSeconds, customerAverageChatTimeSeconds, customerAverageHoldTimeSeconds, customerChatCount, customerWaitingCount, customerWaitingJoinDts, queueEntries, queueName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationWebchatQueueStatus {\n");
    
    sb.append("    agentAvailableCount: ").append(toIndentedString(agentAvailableCount)).append("\n");
    sb.append("    agentBusyCount: ").append(toIndentedString(agentBusyCount)).append("\n");
    sb.append("    agentCount: ").append(toIndentedString(agentCount)).append("\n");
    sb.append("    agentUnavailableCount: ").append(toIndentedString(agentUnavailableCount)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    customerAbandonCount: ").append(toIndentedString(customerAbandonCount)).append("\n");
    sb.append("    customerActiveCount: ").append(toIndentedString(customerActiveCount)).append("\n");
    sb.append("    customerAverageAbandonTimeSeconds: ").append(toIndentedString(customerAverageAbandonTimeSeconds)).append("\n");
    sb.append("    customerAverageChatTimeSeconds: ").append(toIndentedString(customerAverageChatTimeSeconds)).append("\n");
    sb.append("    customerAverageHoldTimeSeconds: ").append(toIndentedString(customerAverageHoldTimeSeconds)).append("\n");
    sb.append("    customerChatCount: ").append(toIndentedString(customerChatCount)).append("\n");
    sb.append("    customerWaitingCount: ").append(toIndentedString(customerWaitingCount)).append("\n");
    sb.append("    customerWaitingJoinDts: ").append(toIndentedString(customerWaitingJoinDts)).append("\n");
    sb.append("    queueEntries: ").append(toIndentedString(queueEntries)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
