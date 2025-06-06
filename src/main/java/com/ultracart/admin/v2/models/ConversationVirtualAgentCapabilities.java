/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ultracart.admin.v2.util.JSON;

/**
 * ConversationVirtualAgentCapabilities
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-20T12:50:59.354-04:00[America/Indianapolis]")
public class ConversationVirtualAgentCapabilities {
  public static final String SERIALIZED_NAME_CANCEL_SUBSCRIPTION = "cancel_subscription";
  @SerializedName(SERIALIZED_NAME_CANCEL_SUBSCRIPTION)
  private Boolean cancelSubscription;

  public static final String SERIALIZED_NAME_DELAY_SUBSCRIPTION = "delay_subscription";
  @SerializedName(SERIALIZED_NAME_DELAY_SUBSCRIPTION)
  private Boolean delaySubscription;

  public static final String SERIALIZED_NAME_LOOKUP_ORDER_INFORMATION = "lookup_order_information";
  @SerializedName(SERIALIZED_NAME_LOOKUP_ORDER_INFORMATION)
  private Boolean lookupOrderInformation;

  public static final String SERIALIZED_NAME_LOOKUP_SUBSCRIPTION_INFORMATION = "lookup_subscription_information";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SUBSCRIPTION_INFORMATION)
  private Boolean lookupSubscriptionInformation;

  public static final String SERIALIZED_NAME_OPEN_SUPPORT_TICKET = "open_support_ticket";
  @SerializedName(SERIALIZED_NAME_OPEN_SUPPORT_TICKET)
  private Boolean openSupportTicket;

  public static final String SERIALIZED_NAME_PAUSE_SUBSCRIPTION = "pause_subscription";
  @SerializedName(SERIALIZED_NAME_PAUSE_SUBSCRIPTION)
  private Boolean pauseSubscription;

  public static final String SERIALIZED_NAME_RESUME_SUBSCRIPTION = "resume_subscription";
  @SerializedName(SERIALIZED_NAME_RESUME_SUBSCRIPTION)
  private Boolean resumeSubscription;

  public static final String SERIALIZED_NAME_TRANSFER_CHAT_TO_LIVE_AGENT = "transfer_chat_to_live_agent";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CHAT_TO_LIVE_AGENT)
  private Boolean transferChatToLiveAgent;

  public static final String SERIALIZED_NAME_UPDATE_SUBSCRIPTION_CREDIT_CARD = "update_subscription_credit_card";
  @SerializedName(SERIALIZED_NAME_UPDATE_SUBSCRIPTION_CREDIT_CARD)
  private Boolean updateSubscriptionCreditCard;

  public ConversationVirtualAgentCapabilities() { 
  }

  public ConversationVirtualAgentCapabilities cancelSubscription(Boolean cancelSubscription) {
    
    this.cancelSubscription = cancelSubscription;
    return this;
  }

   /**
   * Get cancelSubscription
   * @return cancelSubscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCancelSubscription() {
    return cancelSubscription;
  }


  public void setCancelSubscription(Boolean cancelSubscription) {
    this.cancelSubscription = cancelSubscription;
  }


  public ConversationVirtualAgentCapabilities delaySubscription(Boolean delaySubscription) {
    
    this.delaySubscription = delaySubscription;
    return this;
  }

   /**
   * Get delaySubscription
   * @return delaySubscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDelaySubscription() {
    return delaySubscription;
  }


  public void setDelaySubscription(Boolean delaySubscription) {
    this.delaySubscription = delaySubscription;
  }


  public ConversationVirtualAgentCapabilities lookupOrderInformation(Boolean lookupOrderInformation) {
    
    this.lookupOrderInformation = lookupOrderInformation;
    return this;
  }

   /**
   * Get lookupOrderInformation
   * @return lookupOrderInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLookupOrderInformation() {
    return lookupOrderInformation;
  }


  public void setLookupOrderInformation(Boolean lookupOrderInformation) {
    this.lookupOrderInformation = lookupOrderInformation;
  }


  public ConversationVirtualAgentCapabilities lookupSubscriptionInformation(Boolean lookupSubscriptionInformation) {
    
    this.lookupSubscriptionInformation = lookupSubscriptionInformation;
    return this;
  }

   /**
   * Get lookupSubscriptionInformation
   * @return lookupSubscriptionInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLookupSubscriptionInformation() {
    return lookupSubscriptionInformation;
  }


  public void setLookupSubscriptionInformation(Boolean lookupSubscriptionInformation) {
    this.lookupSubscriptionInformation = lookupSubscriptionInformation;
  }


  public ConversationVirtualAgentCapabilities openSupportTicket(Boolean openSupportTicket) {
    
    this.openSupportTicket = openSupportTicket;
    return this;
  }

   /**
   * Get openSupportTicket
   * @return openSupportTicket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOpenSupportTicket() {
    return openSupportTicket;
  }


  public void setOpenSupportTicket(Boolean openSupportTicket) {
    this.openSupportTicket = openSupportTicket;
  }


  public ConversationVirtualAgentCapabilities pauseSubscription(Boolean pauseSubscription) {
    
    this.pauseSubscription = pauseSubscription;
    return this;
  }

   /**
   * Get pauseSubscription
   * @return pauseSubscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPauseSubscription() {
    return pauseSubscription;
  }


  public void setPauseSubscription(Boolean pauseSubscription) {
    this.pauseSubscription = pauseSubscription;
  }


  public ConversationVirtualAgentCapabilities resumeSubscription(Boolean resumeSubscription) {
    
    this.resumeSubscription = resumeSubscription;
    return this;
  }

   /**
   * Get resumeSubscription
   * @return resumeSubscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getResumeSubscription() {
    return resumeSubscription;
  }


  public void setResumeSubscription(Boolean resumeSubscription) {
    this.resumeSubscription = resumeSubscription;
  }


  public ConversationVirtualAgentCapabilities transferChatToLiveAgent(Boolean transferChatToLiveAgent) {
    
    this.transferChatToLiveAgent = transferChatToLiveAgent;
    return this;
  }

   /**
   * Get transferChatToLiveAgent
   * @return transferChatToLiveAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTransferChatToLiveAgent() {
    return transferChatToLiveAgent;
  }


  public void setTransferChatToLiveAgent(Boolean transferChatToLiveAgent) {
    this.transferChatToLiveAgent = transferChatToLiveAgent;
  }


  public ConversationVirtualAgentCapabilities updateSubscriptionCreditCard(Boolean updateSubscriptionCreditCard) {
    
    this.updateSubscriptionCreditCard = updateSubscriptionCreditCard;
    return this;
  }

   /**
   * Get updateSubscriptionCreditCard
   * @return updateSubscriptionCreditCard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpdateSubscriptionCreditCard() {
    return updateSubscriptionCreditCard;
  }


  public void setUpdateSubscriptionCreditCard(Boolean updateSubscriptionCreditCard) {
    this.updateSubscriptionCreditCard = updateSubscriptionCreditCard;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationVirtualAgentCapabilities conversationVirtualAgentCapabilities = (ConversationVirtualAgentCapabilities) o;
    return Objects.equals(this.cancelSubscription, conversationVirtualAgentCapabilities.cancelSubscription) &&
        Objects.equals(this.delaySubscription, conversationVirtualAgentCapabilities.delaySubscription) &&
        Objects.equals(this.lookupOrderInformation, conversationVirtualAgentCapabilities.lookupOrderInformation) &&
        Objects.equals(this.lookupSubscriptionInformation, conversationVirtualAgentCapabilities.lookupSubscriptionInformation) &&
        Objects.equals(this.openSupportTicket, conversationVirtualAgentCapabilities.openSupportTicket) &&
        Objects.equals(this.pauseSubscription, conversationVirtualAgentCapabilities.pauseSubscription) &&
        Objects.equals(this.resumeSubscription, conversationVirtualAgentCapabilities.resumeSubscription) &&
        Objects.equals(this.transferChatToLiveAgent, conversationVirtualAgentCapabilities.transferChatToLiveAgent) &&
        Objects.equals(this.updateSubscriptionCreditCard, conversationVirtualAgentCapabilities.updateSubscriptionCreditCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelSubscription, delaySubscription, lookupOrderInformation, lookupSubscriptionInformation, openSupportTicket, pauseSubscription, resumeSubscription, transferChatToLiveAgent, updateSubscriptionCreditCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationVirtualAgentCapabilities {\n");
    sb.append("    cancelSubscription: ").append(toIndentedString(cancelSubscription)).append("\n");
    sb.append("    delaySubscription: ").append(toIndentedString(delaySubscription)).append("\n");
    sb.append("    lookupOrderInformation: ").append(toIndentedString(lookupOrderInformation)).append("\n");
    sb.append("    lookupSubscriptionInformation: ").append(toIndentedString(lookupSubscriptionInformation)).append("\n");
    sb.append("    openSupportTicket: ").append(toIndentedString(openSupportTicket)).append("\n");
    sb.append("    pauseSubscription: ").append(toIndentedString(pauseSubscription)).append("\n");
    sb.append("    resumeSubscription: ").append(toIndentedString(resumeSubscription)).append("\n");
    sb.append("    transferChatToLiveAgent: ").append(toIndentedString(transferChatToLiveAgent)).append("\n");
    sb.append("    updateSubscriptionCreditCard: ").append(toIndentedString(updateSubscriptionCreditCard)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("cancel_subscription");
    openapiFields.add("delay_subscription");
    openapiFields.add("lookup_order_information");
    openapiFields.add("lookup_subscription_information");
    openapiFields.add("open_support_ticket");
    openapiFields.add("pause_subscription");
    openapiFields.add("resume_subscription");
    openapiFields.add("transfer_chat_to_live_agent");
    openapiFields.add("update_subscription_credit_card");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConversationVirtualAgentCapabilities
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConversationVirtualAgentCapabilities.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConversationVirtualAgentCapabilities is not found in the empty JSON string", ConversationVirtualAgentCapabilities.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConversationVirtualAgentCapabilities.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConversationVirtualAgentCapabilities` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConversationVirtualAgentCapabilities.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConversationVirtualAgentCapabilities' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConversationVirtualAgentCapabilities> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConversationVirtualAgentCapabilities.class));

       return (TypeAdapter<T>) new TypeAdapter<ConversationVirtualAgentCapabilities>() {
           @Override
           public void write(JsonWriter out, ConversationVirtualAgentCapabilities value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConversationVirtualAgentCapabilities read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConversationVirtualAgentCapabilities given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConversationVirtualAgentCapabilities
  * @throws IOException if the JSON string is invalid with respect to ConversationVirtualAgentCapabilities
  */
  public static ConversationVirtualAgentCapabilities fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConversationVirtualAgentCapabilities.class);
  }

 /**
  * Convert an instance of ConversationVirtualAgentCapabilities to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

