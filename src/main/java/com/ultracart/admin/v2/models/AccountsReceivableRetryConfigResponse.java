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
import com.ultracart.admin.v2.models.AccountsReceivableRetryConfig;
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.ResponseMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountsReceivableRetryConfigResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-23T03:23:57.585-04:00")
public class AccountsReceivableRetryConfigResponse {
  @SerializedName("config")
  private AccountsReceivableRetryConfig config = null;

  @SerializedName("coupon_codes")
  private List<String> couponCodes = null;

  @SerializedName("emails")
  private List<String> emails = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("has_linked_accounts")
  private Boolean hasLinkedAccounts = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("success")
  private Boolean success = null;

  public AccountsReceivableRetryConfigResponse config(AccountsReceivableRetryConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(value = "")
  public AccountsReceivableRetryConfig getConfig() {
    return config;
  }

  public void setConfig(AccountsReceivableRetryConfig config) {
    this.config = config;
  }

  public AccountsReceivableRetryConfigResponse couponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
    return this;
  }

  public AccountsReceivableRetryConfigResponse addCouponCodesItem(String couponCodesItem) {
    if (this.couponCodes == null) {
      this.couponCodes = new ArrayList<String>();
    }
    this.couponCodes.add(couponCodesItem);
    return this;
  }

   /**
   * Get couponCodes
   * @return couponCodes
  **/
  @ApiModelProperty(value = "")
  public List<String> getCouponCodes() {
    return couponCodes;
  }

  public void setCouponCodes(List<String> couponCodes) {
    this.couponCodes = couponCodes;
  }

  public AccountsReceivableRetryConfigResponse emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public AccountsReceivableRetryConfigResponse addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<String>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(value = "")
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public AccountsReceivableRetryConfigResponse error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  public AccountsReceivableRetryConfigResponse hasLinkedAccounts(Boolean hasLinkedAccounts) {
    this.hasLinkedAccounts = hasLinkedAccounts;
    return this;
  }

   /**
   * Get hasLinkedAccounts
   * @return hasLinkedAccounts
  **/
  @ApiModelProperty(value = "")
  public Boolean isHasLinkedAccounts() {
    return hasLinkedAccounts;
  }

  public void setHasLinkedAccounts(Boolean hasLinkedAccounts) {
    this.hasLinkedAccounts = hasLinkedAccounts;
  }

  public AccountsReceivableRetryConfigResponse metadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
  }

  public AccountsReceivableRetryConfigResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Indicates if API call was successful
   * @return success
  **/
  @ApiModelProperty(value = "Indicates if API call was successful")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsReceivableRetryConfigResponse accountsReceivableRetryConfigResponse = (AccountsReceivableRetryConfigResponse) o;
    return Objects.equals(this.config, accountsReceivableRetryConfigResponse.config) &&
        Objects.equals(this.couponCodes, accountsReceivableRetryConfigResponse.couponCodes) &&
        Objects.equals(this.emails, accountsReceivableRetryConfigResponse.emails) &&
        Objects.equals(this.error, accountsReceivableRetryConfigResponse.error) &&
        Objects.equals(this.hasLinkedAccounts, accountsReceivableRetryConfigResponse.hasLinkedAccounts) &&
        Objects.equals(this.metadata, accountsReceivableRetryConfigResponse.metadata) &&
        Objects.equals(this.success, accountsReceivableRetryConfigResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, couponCodes, emails, error, hasLinkedAccounts, metadata, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsReceivableRetryConfigResponse {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    couponCodes: ").append(toIndentedString(couponCodes)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    hasLinkedAccounts: ").append(toIndentedString(hasLinkedAccounts)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
