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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * EmailCommseqStat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-23T15:16:21.092-05:00")
public class EmailCommseqStat {
  @SerializedName("click_count")
  private Integer clickCount = null;

  @SerializedName("click_count_formatted")
  private String clickCountFormatted = null;

  @SerializedName("delivered_count")
  private Integer deliveredCount = null;

  @SerializedName("delivered_count_formatted")
  private String deliveredCountFormatted = null;

  @SerializedName("email_communication_sequence_uuid")
  private String emailCommunicationSequenceUuid = null;

  @SerializedName("finished_count")
  private Integer finishedCount = null;

  @SerializedName("finished_count_formatted")
  private String finishedCountFormatted = null;

  @SerializedName("in_progress_count")
  private Integer inProgressCount = null;

  @SerializedName("in_progress_count_formatted")
  private String inProgressCountFormatted = null;

  @SerializedName("kickbox_count")
  private Integer kickboxCount = null;

  @SerializedName("kickbox_count_formatted")
  private String kickboxCountFormatted = null;

  @SerializedName("merchant_id")
  private String merchantId = null;

  @SerializedName("open_count")
  private Integer openCount = null;

  @SerializedName("open_count_formatted")
  private String openCountFormatted = null;

  @SerializedName("order_count")
  private Integer orderCount = null;

  @SerializedName("order_count_formatted")
  private String orderCountFormatted = null;

  @SerializedName("permanent_bounce_count")
  private Integer permanentBounceCount = null;

  @SerializedName("permanent_bounce_count_formatted")
  private String permanentBounceCountFormatted = null;

  @SerializedName("profit")
  private BigDecimal profit = null;

  @SerializedName("profit_formatted")
  private String profitFormatted = null;

  @SerializedName("revenue")
  private BigDecimal revenue = null;

  @SerializedName("revenue_formatted")
  private String revenueFormatted = null;

  @SerializedName("send_count")
  private Integer sendCount = null;

  @SerializedName("send_count_formatted")
  private String sendCountFormatted = null;

  @SerializedName("skipped_count")
  private Integer skippedCount = null;

  @SerializedName("skipped_count_formatted")
  private String skippedCountFormatted = null;

  @SerializedName("spam_count")
  private Integer spamCount = null;

  @SerializedName("spam_count_formatted")
  private String spamCountFormatted = null;

  @SerializedName("started_count")
  private Integer startedCount = null;

  @SerializedName("started_count_formatted")
  private String startedCountFormatted = null;

  @SerializedName("storefront_oid")
  private Integer storefrontOid = null;

  @SerializedName("view_count")
  private Integer viewCount = null;

  @SerializedName("view_count_formatted")
  private String viewCountFormatted = null;

  public EmailCommseqStat clickCount(Integer clickCount) {
    this.clickCount = clickCount;
    return this;
  }

   /**
   * Count of clicked emails
   * @return clickCount
  **/
  @ApiModelProperty(value = "Count of clicked emails")
  public Integer getClickCount() {
    return clickCount;
  }

  public void setClickCount(Integer clickCount) {
    this.clickCount = clickCount;
  }

  public EmailCommseqStat clickCountFormatted(String clickCountFormatted) {
    this.clickCountFormatted = clickCountFormatted;
    return this;
  }

   /**
   * Count of clicked emails, formatted
   * @return clickCountFormatted
  **/
  @ApiModelProperty(value = "Count of clicked emails, formatted")
  public String getClickCountFormatted() {
    return clickCountFormatted;
  }

  public void setClickCountFormatted(String clickCountFormatted) {
    this.clickCountFormatted = clickCountFormatted;
  }

  public EmailCommseqStat deliveredCount(Integer deliveredCount) {
    this.deliveredCount = deliveredCount;
    return this;
  }

   /**
   * Count of delivered emails
   * @return deliveredCount
  **/
  @ApiModelProperty(value = "Count of delivered emails")
  public Integer getDeliveredCount() {
    return deliveredCount;
  }

  public void setDeliveredCount(Integer deliveredCount) {
    this.deliveredCount = deliveredCount;
  }

  public EmailCommseqStat deliveredCountFormatted(String deliveredCountFormatted) {
    this.deliveredCountFormatted = deliveredCountFormatted;
    return this;
  }

   /**
   * Count of delivered emails, formatted
   * @return deliveredCountFormatted
  **/
  @ApiModelProperty(value = "Count of delivered emails, formatted")
  public String getDeliveredCountFormatted() {
    return deliveredCountFormatted;
  }

  public void setDeliveredCountFormatted(String deliveredCountFormatted) {
    this.deliveredCountFormatted = deliveredCountFormatted;
  }

  public EmailCommseqStat emailCommunicationSequenceUuid(String emailCommunicationSequenceUuid) {
    this.emailCommunicationSequenceUuid = emailCommunicationSequenceUuid;
    return this;
  }

   /**
   * UUID associated with the communication sequence
   * @return emailCommunicationSequenceUuid
  **/
  @ApiModelProperty(value = "UUID associated with the communication sequence")
  public String getEmailCommunicationSequenceUuid() {
    return emailCommunicationSequenceUuid;
  }

  public void setEmailCommunicationSequenceUuid(String emailCommunicationSequenceUuid) {
    this.emailCommunicationSequenceUuid = emailCommunicationSequenceUuid;
  }

  public EmailCommseqStat finishedCount(Integer finishedCount) {
    this.finishedCount = finishedCount;
    return this;
  }

   /**
   * Count of customers that finished the sequence
   * @return finishedCount
  **/
  @ApiModelProperty(value = "Count of customers that finished the sequence")
  public Integer getFinishedCount() {
    return finishedCount;
  }

  public void setFinishedCount(Integer finishedCount) {
    this.finishedCount = finishedCount;
  }

  public EmailCommseqStat finishedCountFormatted(String finishedCountFormatted) {
    this.finishedCountFormatted = finishedCountFormatted;
    return this;
  }

   /**
   * Count of customers that finished the sequence, formatted
   * @return finishedCountFormatted
  **/
  @ApiModelProperty(value = "Count of customers that finished the sequence, formatted")
  public String getFinishedCountFormatted() {
    return finishedCountFormatted;
  }

  public void setFinishedCountFormatted(String finishedCountFormatted) {
    this.finishedCountFormatted = finishedCountFormatted;
  }

  public EmailCommseqStat inProgressCount(Integer inProgressCount) {
    this.inProgressCount = inProgressCount;
    return this;
  }

   /**
   * Count of customers in progress
   * @return inProgressCount
  **/
  @ApiModelProperty(value = "Count of customers in progress")
  public Integer getInProgressCount() {
    return inProgressCount;
  }

  public void setInProgressCount(Integer inProgressCount) {
    this.inProgressCount = inProgressCount;
  }

  public EmailCommseqStat inProgressCountFormatted(String inProgressCountFormatted) {
    this.inProgressCountFormatted = inProgressCountFormatted;
    return this;
  }

   /**
   * Count of customers in progress, formatted
   * @return inProgressCountFormatted
  **/
  @ApiModelProperty(value = "Count of customers in progress, formatted")
  public String getInProgressCountFormatted() {
    return inProgressCountFormatted;
  }

  public void setInProgressCountFormatted(String inProgressCountFormatted) {
    this.inProgressCountFormatted = inProgressCountFormatted;
  }

  public EmailCommseqStat kickboxCount(Integer kickboxCount) {
    this.kickboxCount = kickboxCount;
    return this;
  }

   /**
   * Count of emails kicked
   * @return kickboxCount
  **/
  @ApiModelProperty(value = "Count of emails kicked")
  public Integer getKickboxCount() {
    return kickboxCount;
  }

  public void setKickboxCount(Integer kickboxCount) {
    this.kickboxCount = kickboxCount;
  }

  public EmailCommseqStat kickboxCountFormatted(String kickboxCountFormatted) {
    this.kickboxCountFormatted = kickboxCountFormatted;
    return this;
  }

   /**
   * Count of emails kicked, formatted
   * @return kickboxCountFormatted
  **/
  @ApiModelProperty(value = "Count of emails kicked, formatted")
  public String getKickboxCountFormatted() {
    return kickboxCountFormatted;
  }

  public void setKickboxCountFormatted(String kickboxCountFormatted) {
    this.kickboxCountFormatted = kickboxCountFormatted;
  }

  public EmailCommseqStat merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant ID
   * @return merchantId
  **/
  @ApiModelProperty(value = "Merchant ID")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public EmailCommseqStat openCount(Integer openCount) {
    this.openCount = openCount;
    return this;
  }

   /**
   * Count of opened emails
   * @return openCount
  **/
  @ApiModelProperty(value = "Count of opened emails")
  public Integer getOpenCount() {
    return openCount;
  }

  public void setOpenCount(Integer openCount) {
    this.openCount = openCount;
  }

  public EmailCommseqStat openCountFormatted(String openCountFormatted) {
    this.openCountFormatted = openCountFormatted;
    return this;
  }

   /**
   * Count of opened emails, formatted
   * @return openCountFormatted
  **/
  @ApiModelProperty(value = "Count of opened emails, formatted")
  public String getOpenCountFormatted() {
    return openCountFormatted;
  }

  public void setOpenCountFormatted(String openCountFormatted) {
    this.openCountFormatted = openCountFormatted;
  }

  public EmailCommseqStat orderCount(Integer orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * Count of orders
   * @return orderCount
  **/
  @ApiModelProperty(value = "Count of orders")
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public EmailCommseqStat orderCountFormatted(String orderCountFormatted) {
    this.orderCountFormatted = orderCountFormatted;
    return this;
  }

   /**
   * Count of orders, formatted
   * @return orderCountFormatted
  **/
  @ApiModelProperty(value = "Count of orders, formatted")
  public String getOrderCountFormatted() {
    return orderCountFormatted;
  }

  public void setOrderCountFormatted(String orderCountFormatted) {
    this.orderCountFormatted = orderCountFormatted;
  }

  public EmailCommseqStat permanentBounceCount(Integer permanentBounceCount) {
    this.permanentBounceCount = permanentBounceCount;
    return this;
  }

   /**
   * Count of emails permanently bounced
   * @return permanentBounceCount
  **/
  @ApiModelProperty(value = "Count of emails permanently bounced")
  public Integer getPermanentBounceCount() {
    return permanentBounceCount;
  }

  public void setPermanentBounceCount(Integer permanentBounceCount) {
    this.permanentBounceCount = permanentBounceCount;
  }

  public EmailCommseqStat permanentBounceCountFormatted(String permanentBounceCountFormatted) {
    this.permanentBounceCountFormatted = permanentBounceCountFormatted;
    return this;
  }

   /**
   * Count of emails permanently bounced, formatted
   * @return permanentBounceCountFormatted
  **/
  @ApiModelProperty(value = "Count of emails permanently bounced, formatted")
  public String getPermanentBounceCountFormatted() {
    return permanentBounceCountFormatted;
  }

  public void setPermanentBounceCountFormatted(String permanentBounceCountFormatted) {
    this.permanentBounceCountFormatted = permanentBounceCountFormatted;
  }

  public EmailCommseqStat profit(BigDecimal profit) {
    this.profit = profit;
    return this;
  }

   /**
   * Profit
   * @return profit
  **/
  @ApiModelProperty(value = "Profit")
  public BigDecimal getProfit() {
    return profit;
  }

  public void setProfit(BigDecimal profit) {
    this.profit = profit;
  }

  public EmailCommseqStat profitFormatted(String profitFormatted) {
    this.profitFormatted = profitFormatted;
    return this;
  }

   /**
   * Profit, formatted
   * @return profitFormatted
  **/
  @ApiModelProperty(value = "Profit, formatted")
  public String getProfitFormatted() {
    return profitFormatted;
  }

  public void setProfitFormatted(String profitFormatted) {
    this.profitFormatted = profitFormatted;
  }

  public EmailCommseqStat revenue(BigDecimal revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * Revenue
   * @return revenue
  **/
  @ApiModelProperty(value = "Revenue")
  public BigDecimal getRevenue() {
    return revenue;
  }

  public void setRevenue(BigDecimal revenue) {
    this.revenue = revenue;
  }

  public EmailCommseqStat revenueFormatted(String revenueFormatted) {
    this.revenueFormatted = revenueFormatted;
    return this;
  }

   /**
   * Revenue, formatted
   * @return revenueFormatted
  **/
  @ApiModelProperty(value = "Revenue, formatted")
  public String getRevenueFormatted() {
    return revenueFormatted;
  }

  public void setRevenueFormatted(String revenueFormatted) {
    this.revenueFormatted = revenueFormatted;
  }

  public EmailCommseqStat sendCount(Integer sendCount) {
    this.sendCount = sendCount;
    return this;
  }

   /**
   * Count of emails sent
   * @return sendCount
  **/
  @ApiModelProperty(value = "Count of emails sent")
  public Integer getSendCount() {
    return sendCount;
  }

  public void setSendCount(Integer sendCount) {
    this.sendCount = sendCount;
  }

  public EmailCommseqStat sendCountFormatted(String sendCountFormatted) {
    this.sendCountFormatted = sendCountFormatted;
    return this;
  }

   /**
   * Count of emails sent, formatted
   * @return sendCountFormatted
  **/
  @ApiModelProperty(value = "Count of emails sent, formatted")
  public String getSendCountFormatted() {
    return sendCountFormatted;
  }

  public void setSendCountFormatted(String sendCountFormatted) {
    this.sendCountFormatted = sendCountFormatted;
  }

  public EmailCommseqStat skippedCount(Integer skippedCount) {
    this.skippedCount = skippedCount;
    return this;
  }

   /**
   * Count of skipped emails
   * @return skippedCount
  **/
  @ApiModelProperty(value = "Count of skipped emails")
  public Integer getSkippedCount() {
    return skippedCount;
  }

  public void setSkippedCount(Integer skippedCount) {
    this.skippedCount = skippedCount;
  }

  public EmailCommseqStat skippedCountFormatted(String skippedCountFormatted) {
    this.skippedCountFormatted = skippedCountFormatted;
    return this;
  }

   /**
   * Count of skipped emails, formatted
   * @return skippedCountFormatted
  **/
  @ApiModelProperty(value = "Count of skipped emails, formatted")
  public String getSkippedCountFormatted() {
    return skippedCountFormatted;
  }

  public void setSkippedCountFormatted(String skippedCountFormatted) {
    this.skippedCountFormatted = skippedCountFormatted;
  }

  public EmailCommseqStat spamCount(Integer spamCount) {
    this.spamCount = spamCount;
    return this;
  }

   /**
   * Count of emails classified as spam
   * @return spamCount
  **/
  @ApiModelProperty(value = "Count of emails classified as spam")
  public Integer getSpamCount() {
    return spamCount;
  }

  public void setSpamCount(Integer spamCount) {
    this.spamCount = spamCount;
  }

  public EmailCommseqStat spamCountFormatted(String spamCountFormatted) {
    this.spamCountFormatted = spamCountFormatted;
    return this;
  }

   /**
   * Count of emails classified as spam, formatted
   * @return spamCountFormatted
  **/
  @ApiModelProperty(value = "Count of emails classified as spam, formatted")
  public String getSpamCountFormatted() {
    return spamCountFormatted;
  }

  public void setSpamCountFormatted(String spamCountFormatted) {
    this.spamCountFormatted = spamCountFormatted;
  }

  public EmailCommseqStat startedCount(Integer startedCount) {
    this.startedCount = startedCount;
    return this;
  }

   /**
   * Count of customers that started the sequence
   * @return startedCount
  **/
  @ApiModelProperty(value = "Count of customers that started the sequence")
  public Integer getStartedCount() {
    return startedCount;
  }

  public void setStartedCount(Integer startedCount) {
    this.startedCount = startedCount;
  }

  public EmailCommseqStat startedCountFormatted(String startedCountFormatted) {
    this.startedCountFormatted = startedCountFormatted;
    return this;
  }

   /**
   * Count of customers that started the sequence, formatted
   * @return startedCountFormatted
  **/
  @ApiModelProperty(value = "Count of customers that started the sequence, formatted")
  public String getStartedCountFormatted() {
    return startedCountFormatted;
  }

  public void setStartedCountFormatted(String startedCountFormatted) {
    this.startedCountFormatted = startedCountFormatted;
  }

  public EmailCommseqStat storefrontOid(Integer storefrontOid) {
    this.storefrontOid = storefrontOid;
    return this;
  }

   /**
   * Storefront oid
   * @return storefrontOid
  **/
  @ApiModelProperty(value = "Storefront oid")
  public Integer getStorefrontOid() {
    return storefrontOid;
  }

  public void setStorefrontOid(Integer storefrontOid) {
    this.storefrontOid = storefrontOid;
  }

  public EmailCommseqStat viewCount(Integer viewCount) {
    this.viewCount = viewCount;
    return this;
  }

   /**
   * Count of views
   * @return viewCount
  **/
  @ApiModelProperty(value = "Count of views")
  public Integer getViewCount() {
    return viewCount;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public EmailCommseqStat viewCountFormatted(String viewCountFormatted) {
    this.viewCountFormatted = viewCountFormatted;
    return this;
  }

   /**
   * Count of views, formatted
   * @return viewCountFormatted
  **/
  @ApiModelProperty(value = "Count of views, formatted")
  public String getViewCountFormatted() {
    return viewCountFormatted;
  }

  public void setViewCountFormatted(String viewCountFormatted) {
    this.viewCountFormatted = viewCountFormatted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailCommseqStat emailCommseqStat = (EmailCommseqStat) o;
    return Objects.equals(this.clickCount, emailCommseqStat.clickCount) &&
        Objects.equals(this.clickCountFormatted, emailCommseqStat.clickCountFormatted) &&
        Objects.equals(this.deliveredCount, emailCommseqStat.deliveredCount) &&
        Objects.equals(this.deliveredCountFormatted, emailCommseqStat.deliveredCountFormatted) &&
        Objects.equals(this.emailCommunicationSequenceUuid, emailCommseqStat.emailCommunicationSequenceUuid) &&
        Objects.equals(this.finishedCount, emailCommseqStat.finishedCount) &&
        Objects.equals(this.finishedCountFormatted, emailCommseqStat.finishedCountFormatted) &&
        Objects.equals(this.inProgressCount, emailCommseqStat.inProgressCount) &&
        Objects.equals(this.inProgressCountFormatted, emailCommseqStat.inProgressCountFormatted) &&
        Objects.equals(this.kickboxCount, emailCommseqStat.kickboxCount) &&
        Objects.equals(this.kickboxCountFormatted, emailCommseqStat.kickboxCountFormatted) &&
        Objects.equals(this.merchantId, emailCommseqStat.merchantId) &&
        Objects.equals(this.openCount, emailCommseqStat.openCount) &&
        Objects.equals(this.openCountFormatted, emailCommseqStat.openCountFormatted) &&
        Objects.equals(this.orderCount, emailCommseqStat.orderCount) &&
        Objects.equals(this.orderCountFormatted, emailCommseqStat.orderCountFormatted) &&
        Objects.equals(this.permanentBounceCount, emailCommseqStat.permanentBounceCount) &&
        Objects.equals(this.permanentBounceCountFormatted, emailCommseqStat.permanentBounceCountFormatted) &&
        Objects.equals(this.profit, emailCommseqStat.profit) &&
        Objects.equals(this.profitFormatted, emailCommseqStat.profitFormatted) &&
        Objects.equals(this.revenue, emailCommseqStat.revenue) &&
        Objects.equals(this.revenueFormatted, emailCommseqStat.revenueFormatted) &&
        Objects.equals(this.sendCount, emailCommseqStat.sendCount) &&
        Objects.equals(this.sendCountFormatted, emailCommseqStat.sendCountFormatted) &&
        Objects.equals(this.skippedCount, emailCommseqStat.skippedCount) &&
        Objects.equals(this.skippedCountFormatted, emailCommseqStat.skippedCountFormatted) &&
        Objects.equals(this.spamCount, emailCommseqStat.spamCount) &&
        Objects.equals(this.spamCountFormatted, emailCommseqStat.spamCountFormatted) &&
        Objects.equals(this.startedCount, emailCommseqStat.startedCount) &&
        Objects.equals(this.startedCountFormatted, emailCommseqStat.startedCountFormatted) &&
        Objects.equals(this.storefrontOid, emailCommseqStat.storefrontOid) &&
        Objects.equals(this.viewCount, emailCommseqStat.viewCount) &&
        Objects.equals(this.viewCountFormatted, emailCommseqStat.viewCountFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickCount, clickCountFormatted, deliveredCount, deliveredCountFormatted, emailCommunicationSequenceUuid, finishedCount, finishedCountFormatted, inProgressCount, inProgressCountFormatted, kickboxCount, kickboxCountFormatted, merchantId, openCount, openCountFormatted, orderCount, orderCountFormatted, permanentBounceCount, permanentBounceCountFormatted, profit, profitFormatted, revenue, revenueFormatted, sendCount, sendCountFormatted, skippedCount, skippedCountFormatted, spamCount, spamCountFormatted, startedCount, startedCountFormatted, storefrontOid, viewCount, viewCountFormatted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCommseqStat {\n");
    
    sb.append("    clickCount: ").append(toIndentedString(clickCount)).append("\n");
    sb.append("    clickCountFormatted: ").append(toIndentedString(clickCountFormatted)).append("\n");
    sb.append("    deliveredCount: ").append(toIndentedString(deliveredCount)).append("\n");
    sb.append("    deliveredCountFormatted: ").append(toIndentedString(deliveredCountFormatted)).append("\n");
    sb.append("    emailCommunicationSequenceUuid: ").append(toIndentedString(emailCommunicationSequenceUuid)).append("\n");
    sb.append("    finishedCount: ").append(toIndentedString(finishedCount)).append("\n");
    sb.append("    finishedCountFormatted: ").append(toIndentedString(finishedCountFormatted)).append("\n");
    sb.append("    inProgressCount: ").append(toIndentedString(inProgressCount)).append("\n");
    sb.append("    inProgressCountFormatted: ").append(toIndentedString(inProgressCountFormatted)).append("\n");
    sb.append("    kickboxCount: ").append(toIndentedString(kickboxCount)).append("\n");
    sb.append("    kickboxCountFormatted: ").append(toIndentedString(kickboxCountFormatted)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
    sb.append("    openCountFormatted: ").append(toIndentedString(openCountFormatted)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    orderCountFormatted: ").append(toIndentedString(orderCountFormatted)).append("\n");
    sb.append("    permanentBounceCount: ").append(toIndentedString(permanentBounceCount)).append("\n");
    sb.append("    permanentBounceCountFormatted: ").append(toIndentedString(permanentBounceCountFormatted)).append("\n");
    sb.append("    profit: ").append(toIndentedString(profit)).append("\n");
    sb.append("    profitFormatted: ").append(toIndentedString(profitFormatted)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    revenueFormatted: ").append(toIndentedString(revenueFormatted)).append("\n");
    sb.append("    sendCount: ").append(toIndentedString(sendCount)).append("\n");
    sb.append("    sendCountFormatted: ").append(toIndentedString(sendCountFormatted)).append("\n");
    sb.append("    skippedCount: ").append(toIndentedString(skippedCount)).append("\n");
    sb.append("    skippedCountFormatted: ").append(toIndentedString(skippedCountFormatted)).append("\n");
    sb.append("    spamCount: ").append(toIndentedString(spamCount)).append("\n");
    sb.append("    spamCountFormatted: ").append(toIndentedString(spamCountFormatted)).append("\n");
    sb.append("    startedCount: ").append(toIndentedString(startedCount)).append("\n");
    sb.append("    startedCountFormatted: ").append(toIndentedString(startedCountFormatted)).append("\n");
    sb.append("    storefrontOid: ").append(toIndentedString(storefrontOid)).append("\n");
    sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
    sb.append("    viewCountFormatted: ").append(toIndentedString(viewCountFormatted)).append("\n");
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
