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
import com.ultracart.admin.v2.models.EmailCampaign;
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.ResponseMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EmailCampaignsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-23T03:23:57.585-04:00")
public class EmailCampaignsResponse {
  @SerializedName("campaigns")
  private List<EmailCampaign> campaigns = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("success")
  private Boolean success = null;

  public EmailCampaignsResponse campaigns(List<EmailCampaign> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public EmailCampaignsResponse addCampaignsItem(EmailCampaign campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<EmailCampaign>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Get campaigns
   * @return campaigns
  **/
  @ApiModelProperty(value = "")
  public List<EmailCampaign> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<EmailCampaign> campaigns) {
    this.campaigns = campaigns;
  }

  public EmailCampaignsResponse error(Error error) {
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

  public EmailCampaignsResponse metadata(ResponseMetadata metadata) {
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

  public EmailCampaignsResponse success(Boolean success) {
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
    EmailCampaignsResponse emailCampaignsResponse = (EmailCampaignsResponse) o;
    return Objects.equals(this.campaigns, emailCampaignsResponse.campaigns) &&
        Objects.equals(this.error, emailCampaignsResponse.error) &&
        Objects.equals(this.metadata, emailCampaignsResponse.metadata) &&
        Objects.equals(this.success, emailCampaignsResponse.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, error, metadata, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCampaignsResponse {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
