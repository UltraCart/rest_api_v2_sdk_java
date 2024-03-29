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
 * RegisterAffiliateClickRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class RegisterAffiliateClickRequest {
  @SerializedName("affid")
  private Integer affid = null;

  @SerializedName("ip_address")
  private String ipAddress = null;

  @SerializedName("landing_page_url")
  private String landingPageUrl = null;

  @SerializedName("referrer_url")
  private String referrerUrl = null;

  @SerializedName("subid")
  private String subid = null;

  @SerializedName("user_agent")
  private String userAgent = null;

  public RegisterAffiliateClickRequest affid(Integer affid) {
    this.affid = affid;
    return this;
  }

   /**
   * Affiliate Id (must be specified if landing_page_url is not)
   * @return affid
  **/
  @ApiModelProperty(value = "Affiliate Id (must be specified if landing_page_url is not)")
  public Integer getAffid() {
    return affid;
  }

  public void setAffid(Integer affid) {
    this.affid = affid;
  }

  public RegisterAffiliateClickRequest ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * IP Address (must be specified for non-browser key authenticated)
   * @return ipAddress
  **/
  @ApiModelProperty(value = "IP Address (must be specified for non-browser key authenticated)")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public RegisterAffiliateClickRequest landingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
    return this;
  }

   /**
   * Landing Page URL
   * @return landingPageUrl
  **/
  @ApiModelProperty(value = "Landing Page URL")
  public String getLandingPageUrl() {
    return landingPageUrl;
  }

  public void setLandingPageUrl(String landingPageUrl) {
    this.landingPageUrl = landingPageUrl;
  }

  public RegisterAffiliateClickRequest referrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
    return this;
  }

   /**
   * Referrer URL (used for detecting invisible linking)
   * @return referrerUrl
  **/
  @ApiModelProperty(value = "Referrer URL (used for detecting invisible linking)")
  public String getReferrerUrl() {
    return referrerUrl;
  }

  public void setReferrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
  }

  public RegisterAffiliateClickRequest subid(String subid) {
    this.subid = subid;
    return this;
  }

   /**
   * Sub Id (optional value if affid is specified.
   * @return subid
  **/
  @ApiModelProperty(value = "Sub Id (optional value if affid is specified.")
  public String getSubid() {
    return subid;
  }

  public void setSubid(String subid) {
    this.subid = subid;
  }

  public RegisterAffiliateClickRequest userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User agent of the browser (must be specified for non-browser key authenticated)
   * @return userAgent
  **/
  @ApiModelProperty(value = "User agent of the browser (must be specified for non-browser key authenticated)")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterAffiliateClickRequest registerAffiliateClickRequest = (RegisterAffiliateClickRequest) o;
    return Objects.equals(this.affid, registerAffiliateClickRequest.affid) &&
        Objects.equals(this.ipAddress, registerAffiliateClickRequest.ipAddress) &&
        Objects.equals(this.landingPageUrl, registerAffiliateClickRequest.landingPageUrl) &&
        Objects.equals(this.referrerUrl, registerAffiliateClickRequest.referrerUrl) &&
        Objects.equals(this.subid, registerAffiliateClickRequest.subid) &&
        Objects.equals(this.userAgent, registerAffiliateClickRequest.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affid, ipAddress, landingPageUrl, referrerUrl, subid, userAgent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterAffiliateClickRequest {\n");
    
    sb.append("    affid: ").append(toIndentedString(affid)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    landingPageUrl: ").append(toIndentedString(landingPageUrl)).append("\n");
    sb.append("    referrerUrl: ").append(toIndentedString(referrerUrl)).append("\n");
    sb.append("    subid: ").append(toIndentedString(subid)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

