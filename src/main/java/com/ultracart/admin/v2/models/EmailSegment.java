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
 * EmailSegment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-23T03:23:57.585-04:00")
public class EmailSegment {
  @SerializedName("created_dts")
  private String createdDts = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("email_segment_uuid")
  private String emailSegmentUuid = null;

  @SerializedName("filter_profile_equation_json")
  private String filterProfileEquationJson = null;

  @SerializedName("member_count")
  private Integer memberCount = null;

  @SerializedName("merchant_id")
  private String merchantId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rebuild_required")
  private Boolean rebuildRequired = null;

  @SerializedName("storefront_oid")
  private Integer storefrontOid = null;

  public EmailSegment createdDts(String createdDts) {
    this.createdDts = createdDts;
    return this;
  }

   /**
   * Created date
   * @return createdDts
  **/
  @ApiModelProperty(value = "Created date")
  public String getCreatedDts() {
    return createdDts;
  }

  public void setCreatedDts(String createdDts) {
    this.createdDts = createdDts;
  }

  public EmailSegment deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * True if this campaign was deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "True if this campaign was deleted")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public EmailSegment emailSegmentUuid(String emailSegmentUuid) {
    this.emailSegmentUuid = emailSegmentUuid;
    return this;
  }

   /**
   * Email segment UUID
   * @return emailSegmentUuid
  **/
  @ApiModelProperty(value = "Email segment UUID")
  public String getEmailSegmentUuid() {
    return emailSegmentUuid;
  }

  public void setEmailSegmentUuid(String emailSegmentUuid) {
    this.emailSegmentUuid = emailSegmentUuid;
  }

  public EmailSegment filterProfileEquationJson(String filterProfileEquationJson) {
    this.filterProfileEquationJson = filterProfileEquationJson;
    return this;
  }

   /**
   * File profile equation json
   * @return filterProfileEquationJson
  **/
  @ApiModelProperty(value = "File profile equation json")
  public String getFilterProfileEquationJson() {
    return filterProfileEquationJson;
  }

  public void setFilterProfileEquationJson(String filterProfileEquationJson) {
    this.filterProfileEquationJson = filterProfileEquationJson;
  }

  public EmailSegment memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Count of members in this segment
   * @return memberCount
  **/
  @ApiModelProperty(value = "Count of members in this segment")
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public EmailSegment merchantId(String merchantId) {
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

  public EmailSegment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of email segment
   * @return name
  **/
  @ApiModelProperty(value = "Name of email segment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmailSegment rebuildRequired(Boolean rebuildRequired) {
    this.rebuildRequired = rebuildRequired;
    return this;
  }

   /**
   * True if a rebuild is required because some part of the segment has changed
   * @return rebuildRequired
  **/
  @ApiModelProperty(value = "True if a rebuild is required because some part of the segment has changed")
  public Boolean isRebuildRequired() {
    return rebuildRequired;
  }

  public void setRebuildRequired(Boolean rebuildRequired) {
    this.rebuildRequired = rebuildRequired;
  }

  public EmailSegment storefrontOid(Integer storefrontOid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailSegment emailSegment = (EmailSegment) o;
    return Objects.equals(this.createdDts, emailSegment.createdDts) &&
        Objects.equals(this.deleted, emailSegment.deleted) &&
        Objects.equals(this.emailSegmentUuid, emailSegment.emailSegmentUuid) &&
        Objects.equals(this.filterProfileEquationJson, emailSegment.filterProfileEquationJson) &&
        Objects.equals(this.memberCount, emailSegment.memberCount) &&
        Objects.equals(this.merchantId, emailSegment.merchantId) &&
        Objects.equals(this.name, emailSegment.name) &&
        Objects.equals(this.rebuildRequired, emailSegment.rebuildRequired) &&
        Objects.equals(this.storefrontOid, emailSegment.storefrontOid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDts, deleted, emailSegmentUuid, filterProfileEquationJson, memberCount, merchantId, name, rebuildRequired, storefrontOid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailSegment {\n");
    
    sb.append("    createdDts: ").append(toIndentedString(createdDts)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    emailSegmentUuid: ").append(toIndentedString(emailSegmentUuid)).append("\n");
    sb.append("    filterProfileEquationJson: ").append(toIndentedString(filterProfileEquationJson)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rebuildRequired: ").append(toIndentedString(rebuildRequired)).append("\n");
    sb.append("    storefrontOid: ").append(toIndentedString(storefrontOid)).append("\n");
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
