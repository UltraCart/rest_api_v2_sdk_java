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
 * HitSessionStart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class HitSessionStart {
  @SerializedName("bot")
  private Boolean bot = null;

  @SerializedName("bounce")
  private Boolean bounce = null;

  @SerializedName("channel")
  private String channel = null;

  @SerializedName("device_switch_detected")
  private Boolean deviceSwitchDetected = null;

  @SerializedName("fake_bot")
  private Boolean fakeBot = null;

  @SerializedName("geolocation_country")
  private String geolocationCountry = null;

  @SerializedName("geolocation_latitude")
  private BigDecimal geolocationLatitude = null;

  @SerializedName("geolocation_longitude")
  private BigDecimal geolocationLongitude = null;

  @SerializedName("geolocation_province")
  private String geolocationProvince = null;

  @SerializedName("no_cookie_support")
  private Boolean noCookieSupport = null;

  @SerializedName("prefetch")
  private Boolean prefetch = null;

  @SerializedName("referrer")
  private String referrer = null;

  @SerializedName("screen_height")
  private Integer screenHeight = null;

  @SerializedName("screen_width")
  private Integer screenWidth = null;

  @SerializedName("time_on_Site")
  private BigDecimal timeOnSite = null;

  @SerializedName("user_agent")
  private String userAgent = null;

  @SerializedName("user_ip")
  private String userIp = null;

  public HitSessionStart bot(Boolean bot) {
    this.bot = bot;
    return this;
  }

   /**
   * Get bot
   * @return bot
  **/
  @ApiModelProperty(value = "")
  public Boolean isBot() {
    return bot;
  }

  public void setBot(Boolean bot) {
    this.bot = bot;
  }

  public HitSessionStart bounce(Boolean bounce) {
    this.bounce = bounce;
    return this;
  }

   /**
   * Get bounce
   * @return bounce
  **/
  @ApiModelProperty(value = "")
  public Boolean isBounce() {
    return bounce;
  }

  public void setBounce(Boolean bounce) {
    this.bounce = bounce;
  }

  public HitSessionStart channel(String channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")
  public String getChannel() {
    return channel;
  }

  public void setChannel(String channel) {
    this.channel = channel;
  }

  public HitSessionStart deviceSwitchDetected(Boolean deviceSwitchDetected) {
    this.deviceSwitchDetected = deviceSwitchDetected;
    return this;
  }

   /**
   * Get deviceSwitchDetected
   * @return deviceSwitchDetected
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeviceSwitchDetected() {
    return deviceSwitchDetected;
  }

  public void setDeviceSwitchDetected(Boolean deviceSwitchDetected) {
    this.deviceSwitchDetected = deviceSwitchDetected;
  }

  public HitSessionStart fakeBot(Boolean fakeBot) {
    this.fakeBot = fakeBot;
    return this;
  }

   /**
   * Get fakeBot
   * @return fakeBot
  **/
  @ApiModelProperty(value = "")
  public Boolean isFakeBot() {
    return fakeBot;
  }

  public void setFakeBot(Boolean fakeBot) {
    this.fakeBot = fakeBot;
  }

  public HitSessionStart geolocationCountry(String geolocationCountry) {
    this.geolocationCountry = geolocationCountry;
    return this;
  }

   /**
   * Get geolocationCountry
   * @return geolocationCountry
  **/
  @ApiModelProperty(value = "")
  public String getGeolocationCountry() {
    return geolocationCountry;
  }

  public void setGeolocationCountry(String geolocationCountry) {
    this.geolocationCountry = geolocationCountry;
  }

  public HitSessionStart geolocationLatitude(BigDecimal geolocationLatitude) {
    this.geolocationLatitude = geolocationLatitude;
    return this;
  }

   /**
   * Get geolocationLatitude
   * @return geolocationLatitude
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGeolocationLatitude() {
    return geolocationLatitude;
  }

  public void setGeolocationLatitude(BigDecimal geolocationLatitude) {
    this.geolocationLatitude = geolocationLatitude;
  }

  public HitSessionStart geolocationLongitude(BigDecimal geolocationLongitude) {
    this.geolocationLongitude = geolocationLongitude;
    return this;
  }

   /**
   * Get geolocationLongitude
   * @return geolocationLongitude
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGeolocationLongitude() {
    return geolocationLongitude;
  }

  public void setGeolocationLongitude(BigDecimal geolocationLongitude) {
    this.geolocationLongitude = geolocationLongitude;
  }

  public HitSessionStart geolocationProvince(String geolocationProvince) {
    this.geolocationProvince = geolocationProvince;
    return this;
  }

   /**
   * Get geolocationProvince
   * @return geolocationProvince
  **/
  @ApiModelProperty(value = "")
  public String getGeolocationProvince() {
    return geolocationProvince;
  }

  public void setGeolocationProvince(String geolocationProvince) {
    this.geolocationProvince = geolocationProvince;
  }

  public HitSessionStart noCookieSupport(Boolean noCookieSupport) {
    this.noCookieSupport = noCookieSupport;
    return this;
  }

   /**
   * Get noCookieSupport
   * @return noCookieSupport
  **/
  @ApiModelProperty(value = "")
  public Boolean isNoCookieSupport() {
    return noCookieSupport;
  }

  public void setNoCookieSupport(Boolean noCookieSupport) {
    this.noCookieSupport = noCookieSupport;
  }

  public HitSessionStart prefetch(Boolean prefetch) {
    this.prefetch = prefetch;
    return this;
  }

   /**
   * Get prefetch
   * @return prefetch
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrefetch() {
    return prefetch;
  }

  public void setPrefetch(Boolean prefetch) {
    this.prefetch = prefetch;
  }

  public HitSessionStart referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

   /**
   * Get referrer
   * @return referrer
  **/
  @ApiModelProperty(value = "")
  public String getReferrer() {
    return referrer;
  }

  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }

  public HitSessionStart screenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }

   /**
   * Get screenHeight
   * @return screenHeight
  **/
  @ApiModelProperty(value = "")
  public Integer getScreenHeight() {
    return screenHeight;
  }

  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }

  public HitSessionStart screenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }

   /**
   * Get screenWidth
   * @return screenWidth
  **/
  @ApiModelProperty(value = "")
  public Integer getScreenWidth() {
    return screenWidth;
  }

  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }

  public HitSessionStart timeOnSite(BigDecimal timeOnSite) {
    this.timeOnSite = timeOnSite;
    return this;
  }

   /**
   * Get timeOnSite
   * @return timeOnSite
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTimeOnSite() {
    return timeOnSite;
  }

  public void setTimeOnSite(BigDecimal timeOnSite) {
    this.timeOnSite = timeOnSite;
  }

  public HitSessionStart userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * Get userAgent
   * @return userAgent
  **/
  @ApiModelProperty(value = "")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public HitSessionStart userIp(String userIp) {
    this.userIp = userIp;
    return this;
  }

   /**
   * Get userIp
   * @return userIp
  **/
  @ApiModelProperty(value = "")
  public String getUserIp() {
    return userIp;
  }

  public void setUserIp(String userIp) {
    this.userIp = userIp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HitSessionStart hitSessionStart = (HitSessionStart) o;
    return Objects.equals(this.bot, hitSessionStart.bot) &&
        Objects.equals(this.bounce, hitSessionStart.bounce) &&
        Objects.equals(this.channel, hitSessionStart.channel) &&
        Objects.equals(this.deviceSwitchDetected, hitSessionStart.deviceSwitchDetected) &&
        Objects.equals(this.fakeBot, hitSessionStart.fakeBot) &&
        Objects.equals(this.geolocationCountry, hitSessionStart.geolocationCountry) &&
        Objects.equals(this.geolocationLatitude, hitSessionStart.geolocationLatitude) &&
        Objects.equals(this.geolocationLongitude, hitSessionStart.geolocationLongitude) &&
        Objects.equals(this.geolocationProvince, hitSessionStart.geolocationProvince) &&
        Objects.equals(this.noCookieSupport, hitSessionStart.noCookieSupport) &&
        Objects.equals(this.prefetch, hitSessionStart.prefetch) &&
        Objects.equals(this.referrer, hitSessionStart.referrer) &&
        Objects.equals(this.screenHeight, hitSessionStart.screenHeight) &&
        Objects.equals(this.screenWidth, hitSessionStart.screenWidth) &&
        Objects.equals(this.timeOnSite, hitSessionStart.timeOnSite) &&
        Objects.equals(this.userAgent, hitSessionStart.userAgent) &&
        Objects.equals(this.userIp, hitSessionStart.userIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bot, bounce, channel, deviceSwitchDetected, fakeBot, geolocationCountry, geolocationLatitude, geolocationLongitude, geolocationProvince, noCookieSupport, prefetch, referrer, screenHeight, screenWidth, timeOnSite, userAgent, userIp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HitSessionStart {\n");
    
    sb.append("    bot: ").append(toIndentedString(bot)).append("\n");
    sb.append("    bounce: ").append(toIndentedString(bounce)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    deviceSwitchDetected: ").append(toIndentedString(deviceSwitchDetected)).append("\n");
    sb.append("    fakeBot: ").append(toIndentedString(fakeBot)).append("\n");
    sb.append("    geolocationCountry: ").append(toIndentedString(geolocationCountry)).append("\n");
    sb.append("    geolocationLatitude: ").append(toIndentedString(geolocationLatitude)).append("\n");
    sb.append("    geolocationLongitude: ").append(toIndentedString(geolocationLongitude)).append("\n");
    sb.append("    geolocationProvince: ").append(toIndentedString(geolocationProvince)).append("\n");
    sb.append("    noCookieSupport: ").append(toIndentedString(noCookieSupport)).append("\n");
    sb.append("    prefetch: ").append(toIndentedString(prefetch)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    timeOnSite: ").append(toIndentedString(timeOnSite)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    userIp: ").append(toIndentedString(userIp)).append("\n");
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

