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

/**
 * TaxJarConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-23T03:23:57.585-04:00")
public class TaxJarConfig {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("api_key")
  private String apiKey = null;

  @SerializedName("estimate_only")
  private Boolean estimateOnly = null;

  @SerializedName("send_test_orders")
  private Boolean sendTestOrders = null;

  @SerializedName("use_distribution_center_from")
  private Boolean useDistributionCenterFrom = null;

  public TaxJarConfig active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * True if TaxJar is active for this merchant
   * @return active
  **/
  @ApiModelProperty(value = "True if TaxJar is active for this merchant")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public TaxJarConfig apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * TaxJar API key
   * @return apiKey
  **/
  @ApiModelProperty(value = "TaxJar API key")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public TaxJarConfig estimateOnly(Boolean estimateOnly) {
    this.estimateOnly = estimateOnly;
    return this;
  }

   /**
   * True if this TaxJar configuration is to estimate taxes only and not report placed orders to TaxJar
   * @return estimateOnly
  **/
  @ApiModelProperty(value = "True if this TaxJar configuration is to estimate taxes only and not report placed orders to TaxJar")
  public Boolean isEstimateOnly() {
    return estimateOnly;
  }

  public void setEstimateOnly(Boolean estimateOnly) {
    this.estimateOnly = estimateOnly;
  }

  public TaxJarConfig sendTestOrders(Boolean sendTestOrders) {
    this.sendTestOrders = sendTestOrders;
    return this;
  }

   /**
   * Send test orders through to TaxJar.  The default is to not transmit test orders to TaxJar.
   * @return sendTestOrders
  **/
  @ApiModelProperty(value = "Send test orders through to TaxJar.  The default is to not transmit test orders to TaxJar.")
  public Boolean isSendTestOrders() {
    return sendTestOrders;
  }

  public void setSendTestOrders(Boolean sendTestOrders) {
    this.sendTestOrders = sendTestOrders;
  }

  public TaxJarConfig useDistributionCenterFrom(Boolean useDistributionCenterFrom) {
    this.useDistributionCenterFrom = useDistributionCenterFrom;
    return this;
  }

   /**
   * Use distribution center from address
   * @return useDistributionCenterFrom
  **/
  @ApiModelProperty(value = "Use distribution center from address")
  public Boolean isUseDistributionCenterFrom() {
    return useDistributionCenterFrom;
  }

  public void setUseDistributionCenterFrom(Boolean useDistributionCenterFrom) {
    this.useDistributionCenterFrom = useDistributionCenterFrom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxJarConfig taxJarConfig = (TaxJarConfig) o;
    return Objects.equals(this.active, taxJarConfig.active) &&
        Objects.equals(this.apiKey, taxJarConfig.apiKey) &&
        Objects.equals(this.estimateOnly, taxJarConfig.estimateOnly) &&
        Objects.equals(this.sendTestOrders, taxJarConfig.sendTestOrders) &&
        Objects.equals(this.useDistributionCenterFrom, taxJarConfig.useDistributionCenterFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, apiKey, estimateOnly, sendTestOrders, useDistributionCenterFrom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxJarConfig {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    estimateOnly: ").append(toIndentedString(estimateOnly)).append("\n");
    sb.append("    sendTestOrders: ").append(toIndentedString(sendTestOrders)).append("\n");
    sb.append("    useDistributionCenterFrom: ").append(toIndentedString(useDistributionCenterFrom)).append("\n");
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
