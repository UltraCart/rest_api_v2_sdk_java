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
 * ScreenRecordingAdPlatform
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ScreenRecordingAdPlatform {
  @SerializedName("fbc")
  private String fbc = null;

  @SerializedName("fbclid")
  private String fbclid = null;

  @SerializedName("fbp")
  private String fbp = null;

  @SerializedName("gacid")
  private String gacid = null;

  @SerializedName("glcid")
  private String glcid = null;

  @SerializedName("msclkid")
  private String msclkid = null;

  @SerializedName("ttclid")
  private String ttclid = null;

  public ScreenRecordingAdPlatform fbc(String fbc) {
    this.fbc = fbc;
    return this;
  }

   /**
   * Facebook Click Id (Cookie)
   * @return fbc
  **/
  @ApiModelProperty(value = "Facebook Click Id (Cookie)")
  public String getFbc() {
    return fbc;
  }

  public void setFbc(String fbc) {
    this.fbc = fbc;
  }

  public ScreenRecordingAdPlatform fbclid(String fbclid) {
    this.fbclid = fbclid;
    return this;
  }

   /**
   * Facebook Click Id Parameter (Parameter)
   * @return fbclid
  **/
  @ApiModelProperty(value = "Facebook Click Id Parameter (Parameter)")
  public String getFbclid() {
    return fbclid;
  }

  public void setFbclid(String fbclid) {
    this.fbclid = fbclid;
  }

  public ScreenRecordingAdPlatform fbp(String fbp) {
    this.fbp = fbp;
    return this;
  }

   /**
   * Facebook Browser Id (Cookie)
   * @return fbp
  **/
  @ApiModelProperty(value = "Facebook Browser Id (Cookie)")
  public String getFbp() {
    return fbp;
  }

  public void setFbp(String fbp) {
    this.fbp = fbp;
  }

  public ScreenRecordingAdPlatform gacid(String gacid) {
    this.gacid = gacid;
    return this;
  }

   /**
   * Google Analytics CID (Cookie)
   * @return gacid
  **/
  @ApiModelProperty(value = "Google Analytics CID (Cookie)")
  public String getGacid() {
    return gacid;
  }

  public void setGacid(String gacid) {
    this.gacid = gacid;
  }

  public ScreenRecordingAdPlatform glcid(String glcid) {
    this.glcid = glcid;
    return this;
  }

   /**
   * Google Adwords Click Id (Parameter)
   * @return glcid
  **/
  @ApiModelProperty(value = "Google Adwords Click Id (Parameter)")
  public String getGlcid() {
    return glcid;
  }

  public void setGlcid(String glcid) {
    this.glcid = glcid;
  }

  public ScreenRecordingAdPlatform msclkid(String msclkid) {
    this.msclkid = msclkid;
    return this;
  }

   /**
   * Bing Click Id (Parameter
   * @return msclkid
  **/
  @ApiModelProperty(value = "Bing Click Id (Parameter")
  public String getMsclkid() {
    return msclkid;
  }

  public void setMsclkid(String msclkid) {
    this.msclkid = msclkid;
  }

  public ScreenRecordingAdPlatform ttclid(String ttclid) {
    this.ttclid = ttclid;
    return this;
  }

   /**
   * TikTok Click Id (Parameter
   * @return ttclid
  **/
  @ApiModelProperty(value = "TikTok Click Id (Parameter")
  public String getTtclid() {
    return ttclid;
  }

  public void setTtclid(String ttclid) {
    this.ttclid = ttclid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingAdPlatform screenRecordingAdPlatform = (ScreenRecordingAdPlatform) o;
    return Objects.equals(this.fbc, screenRecordingAdPlatform.fbc) &&
        Objects.equals(this.fbclid, screenRecordingAdPlatform.fbclid) &&
        Objects.equals(this.fbp, screenRecordingAdPlatform.fbp) &&
        Objects.equals(this.gacid, screenRecordingAdPlatform.gacid) &&
        Objects.equals(this.glcid, screenRecordingAdPlatform.glcid) &&
        Objects.equals(this.msclkid, screenRecordingAdPlatform.msclkid) &&
        Objects.equals(this.ttclid, screenRecordingAdPlatform.ttclid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fbc, fbclid, fbp, gacid, glcid, msclkid, ttclid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingAdPlatform {\n");
    
    sb.append("    fbc: ").append(toIndentedString(fbc)).append("\n");
    sb.append("    fbclid: ").append(toIndentedString(fbclid)).append("\n");
    sb.append("    fbp: ").append(toIndentedString(fbp)).append("\n");
    sb.append("    gacid: ").append(toIndentedString(gacid)).append("\n");
    sb.append("    glcid: ").append(toIndentedString(glcid)).append("\n");
    sb.append("    msclkid: ").append(toIndentedString(msclkid)).append("\n");
    sb.append("    ttclid: ").append(toIndentedString(ttclid)).append("\n");
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

