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
 * SingleSignOnAuthorizeResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-07-29T10:39:55.223-04:00")



public class SingleSignOnAuthorizeResponse {
  @SerializedName("expiration_dts")
  private String expirationDts = null;

  @SerializedName("login_url")
  private String loginUrl = null;

  public SingleSignOnAuthorizeResponse expirationDts(String expirationDts) {
    this.expirationDts = expirationDts;
    return this;
  }

   /**
   * Expiration date/time after which the single sign-on login operation will have timed out
   * @return expirationDts
  **/
  @ApiModelProperty(value = "Expiration date/time after which the single sign-on login operation will have timed out")
  public String getExpirationDts() {
    return expirationDts;
  }

  public void setExpirationDts(String expirationDts) {
    this.expirationDts = expirationDts;
  }

  public SingleSignOnAuthorizeResponse loginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
    return this;
  }

   /**
   * The URL that you should redirect the customer&#39;s browser to.  This URL will begin the login process.
   * @return loginUrl
  **/
  @ApiModelProperty(value = "The URL that you should redirect the customer's browser to.  This URL will begin the login process.")
  public String getLoginUrl() {
    return loginUrl;
  }

  public void setLoginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleSignOnAuthorizeResponse singleSignOnAuthorizeResponse = (SingleSignOnAuthorizeResponse) o;
    return Objects.equals(this.expirationDts, singleSignOnAuthorizeResponse.expirationDts) &&
        Objects.equals(this.loginUrl, singleSignOnAuthorizeResponse.loginUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDts, loginUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleSignOnAuthorizeResponse {\n");
    
    sb.append("    expirationDts: ").append(toIndentedString(expirationDts)).append("\n");
    sb.append("    loginUrl: ").append(toIndentedString(loginUrl)).append("\n");
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
