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
import java.math.BigDecimal;

/**
 * ExperimentVariationStat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-23T14:49:10.477-05:00")



public class ExperimentVariationStat {
  @SerializedName("add_to_cart_count")
  private Integer addToCartCount = null;

  @SerializedName("bounce_count")
  private Integer bounceCount = null;

  @SerializedName("duration_seconds_sum")
  private Long durationSecondsSum = null;

  @SerializedName("event_count")
  private Integer eventCount = null;

  @SerializedName("initiate_checkout_count")
  private Integer initiateCheckoutCount = null;

  @SerializedName("order_count")
  private Integer orderCount = null;

  @SerializedName("order_item_count")
  private Integer orderItemCount = null;

  @SerializedName("page_view_count")
  private Integer pageViewCount = null;

  @SerializedName("revenue")
  private BigDecimal revenue = null;

  @SerializedName("session_count")
  private Integer sessionCount = null;

  @SerializedName("stat_dts")
  private String statDts = null;

  public ExperimentVariationStat addToCartCount(Integer addToCartCount) {
    this.addToCartCount = addToCartCount;
    return this;
  }

   /**
   * Total add to cart count for this variation
   * @return addToCartCount
  **/
  @ApiModelProperty(value = "Total add to cart count for this variation")
  public Integer getAddToCartCount() {
    return addToCartCount;
  }

  public void setAddToCartCount(Integer addToCartCount) {
    this.addToCartCount = addToCartCount;
  }

  public ExperimentVariationStat bounceCount(Integer bounceCount) {
    this.bounceCount = bounceCount;
    return this;
  }

   /**
   * Total bounce count for this variation
   * @return bounceCount
  **/
  @ApiModelProperty(value = "Total bounce count for this variation")
  public Integer getBounceCount() {
    return bounceCount;
  }

  public void setBounceCount(Integer bounceCount) {
    this.bounceCount = bounceCount;
  }

  public ExperimentVariationStat durationSecondsSum(Long durationSecondsSum) {
    this.durationSecondsSum = durationSecondsSum;
    return this;
  }

   /**
   * Total number of seconds spent on the site for this variation
   * @return durationSecondsSum
  **/
  @ApiModelProperty(value = "Total number of seconds spent on the site for this variation")
  public Long getDurationSecondsSum() {
    return durationSecondsSum;
  }

  public void setDurationSecondsSum(Long durationSecondsSum) {
    this.durationSecondsSum = durationSecondsSum;
  }

  public ExperimentVariationStat eventCount(Integer eventCount) {
    this.eventCount = eventCount;
    return this;
  }

   /**
   * Total event count for this variation
   * @return eventCount
  **/
  @ApiModelProperty(value = "Total event count for this variation")
  public Integer getEventCount() {
    return eventCount;
  }

  public void setEventCount(Integer eventCount) {
    this.eventCount = eventCount;
  }

  public ExperimentVariationStat initiateCheckoutCount(Integer initiateCheckoutCount) {
    this.initiateCheckoutCount = initiateCheckoutCount;
    return this;
  }

   /**
   * Total initiate checkout count for this variation
   * @return initiateCheckoutCount
  **/
  @ApiModelProperty(value = "Total initiate checkout count for this variation")
  public Integer getInitiateCheckoutCount() {
    return initiateCheckoutCount;
  }

  public void setInitiateCheckoutCount(Integer initiateCheckoutCount) {
    this.initiateCheckoutCount = initiateCheckoutCount;
  }

  public ExperimentVariationStat orderCount(Integer orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * Total order count for this variation
   * @return orderCount
  **/
  @ApiModelProperty(value = "Total order count for this variation")
  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public ExperimentVariationStat orderItemCount(Integer orderItemCount) {
    this.orderItemCount = orderItemCount;
    return this;
  }

   /**
   * Total order item count for this variation
   * @return orderItemCount
  **/
  @ApiModelProperty(value = "Total order item count for this variation")
  public Integer getOrderItemCount() {
    return orderItemCount;
  }

  public void setOrderItemCount(Integer orderItemCount) {
    this.orderItemCount = orderItemCount;
  }

  public ExperimentVariationStat pageViewCount(Integer pageViewCount) {
    this.pageViewCount = pageViewCount;
    return this;
  }

   /**
   * Total page view count for this variation
   * @return pageViewCount
  **/
  @ApiModelProperty(value = "Total page view count for this variation")
  public Integer getPageViewCount() {
    return pageViewCount;
  }

  public void setPageViewCount(Integer pageViewCount) {
    this.pageViewCount = pageViewCount;
  }

  public ExperimentVariationStat revenue(BigDecimal revenue) {
    this.revenue = revenue;
    return this;
  }

   /**
   * Total revenue for this variation
   * @return revenue
  **/
  @ApiModelProperty(value = "Total revenue for this variation")
  public BigDecimal getRevenue() {
    return revenue;
  }

  public void setRevenue(BigDecimal revenue) {
    this.revenue = revenue;
  }

  public ExperimentVariationStat sessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
    return this;
  }

   /**
   * Total sessions for this variation
   * @return sessionCount
  **/
  @ApiModelProperty(value = "Total sessions for this variation")
  public Integer getSessionCount() {
    return sessionCount;
  }

  public void setSessionCount(Integer sessionCount) {
    this.sessionCount = sessionCount;
  }

  public ExperimentVariationStat statDts(String statDts) {
    this.statDts = statDts;
    return this;
  }

   /**
   * Date/time that the statistic was created
   * @return statDts
  **/
  @ApiModelProperty(value = "Date/time that the statistic was created")
  public String getStatDts() {
    return statDts;
  }

  public void setStatDts(String statDts) {
    this.statDts = statDts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentVariationStat experimentVariationStat = (ExperimentVariationStat) o;
    return Objects.equals(this.addToCartCount, experimentVariationStat.addToCartCount) &&
        Objects.equals(this.bounceCount, experimentVariationStat.bounceCount) &&
        Objects.equals(this.durationSecondsSum, experimentVariationStat.durationSecondsSum) &&
        Objects.equals(this.eventCount, experimentVariationStat.eventCount) &&
        Objects.equals(this.initiateCheckoutCount, experimentVariationStat.initiateCheckoutCount) &&
        Objects.equals(this.orderCount, experimentVariationStat.orderCount) &&
        Objects.equals(this.orderItemCount, experimentVariationStat.orderItemCount) &&
        Objects.equals(this.pageViewCount, experimentVariationStat.pageViewCount) &&
        Objects.equals(this.revenue, experimentVariationStat.revenue) &&
        Objects.equals(this.sessionCount, experimentVariationStat.sessionCount) &&
        Objects.equals(this.statDts, experimentVariationStat.statDts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addToCartCount, bounceCount, durationSecondsSum, eventCount, initiateCheckoutCount, orderCount, orderItemCount, pageViewCount, revenue, sessionCount, statDts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentVariationStat {\n");
    
    sb.append("    addToCartCount: ").append(toIndentedString(addToCartCount)).append("\n");
    sb.append("    bounceCount: ").append(toIndentedString(bounceCount)).append("\n");
    sb.append("    durationSecondsSum: ").append(toIndentedString(durationSecondsSum)).append("\n");
    sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
    sb.append("    initiateCheckoutCount: ").append(toIndentedString(initiateCheckoutCount)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
    sb.append("    orderItemCount: ").append(toIndentedString(orderItemCount)).append("\n");
    sb.append("    pageViewCount: ").append(toIndentedString(pageViewCount)).append("\n");
    sb.append("    revenue: ").append(toIndentedString(revenue)).append("\n");
    sb.append("    sessionCount: ").append(toIndentedString(sessionCount)).append("\n");
    sb.append("    statDts: ").append(toIndentedString(statDts)).append("\n");
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
