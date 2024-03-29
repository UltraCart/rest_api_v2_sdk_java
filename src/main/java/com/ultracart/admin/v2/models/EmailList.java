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
import com.ultracart.admin.v2.models.EmailListSegmentUsedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EmailList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class EmailList {
  @SerializedName("allow_csv_download")
  private Boolean allowCsvDownload = null;

  @SerializedName("created_dts")
  private String createdDts = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("email_list_uuid")
  private String emailListUuid = null;

  @SerializedName("esp_list_segment_folder_uuid")
  private String espListSegmentFolderUuid = null;

  @SerializedName("member_count")
  private Integer memberCount = null;

  @SerializedName("merchant_id")
  private String merchantId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("public_description")
  private String publicDescription = null;

  @SerializedName("public_list")
  private Boolean publicList = null;

  @SerializedName("storefront_oid")
  private Integer storefrontOid = null;

  @SerializedName("used_by")
  private List<EmailListSegmentUsedBy> usedBy = null;

  public EmailList allowCsvDownload(Boolean allowCsvDownload) {
    this.allowCsvDownload = allowCsvDownload;
    return this;
  }

   /**
   * True if the current user has the rights to download this list.
   * @return allowCsvDownload
  **/
  @ApiModelProperty(value = "True if the current user has the rights to download this list.")
  public Boolean isAllowCsvDownload() {
    return allowCsvDownload;
  }

  public void setAllowCsvDownload(Boolean allowCsvDownload) {
    this.allowCsvDownload = allowCsvDownload;
  }

  public EmailList createdDts(String createdDts) {
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

  public EmailList deleted(Boolean deleted) {
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

  public EmailList emailListUuid(String emailListUuid) {
    this.emailListUuid = emailListUuid;
    return this;
  }

   /**
   * Email list UUID
   * @return emailListUuid
  **/
  @ApiModelProperty(value = "Email list UUID")
  public String getEmailListUuid() {
    return emailListUuid;
  }

  public void setEmailListUuid(String emailListUuid) {
    this.emailListUuid = emailListUuid;
  }

  public EmailList espListSegmentFolderUuid(String espListSegmentFolderUuid) {
    this.espListSegmentFolderUuid = espListSegmentFolderUuid;
    return this;
  }

   /**
   * List/Segment folder UUID
   * @return espListSegmentFolderUuid
  **/
  @ApiModelProperty(value = "List/Segment folder UUID")
  public String getEspListSegmentFolderUuid() {
    return espListSegmentFolderUuid;
  }

  public void setEspListSegmentFolderUuid(String espListSegmentFolderUuid) {
    this.espListSegmentFolderUuid = espListSegmentFolderUuid;
  }

  public EmailList memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Count of members in this list
   * @return memberCount
  **/
  @ApiModelProperty(value = "Count of members in this list")
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public EmailList merchantId(String merchantId) {
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

  public EmailList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of email list
   * @return name
  **/
  @ApiModelProperty(value = "Name of email list")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EmailList publicDescription(String publicDescription) {
    this.publicDescription = publicDescription;
    return this;
  }

   /**
   * Description of list shown to customer.
   * @return publicDescription
  **/
  @ApiModelProperty(value = "Description of list shown to customer.")
  public String getPublicDescription() {
    return publicDescription;
  }

  public void setPublicDescription(String publicDescription) {
    this.publicDescription = publicDescription;
  }

  public EmailList publicList(Boolean publicList) {
    this.publicList = publicList;
    return this;
  }

   /**
   * True if this list is public
   * @return publicList
  **/
  @ApiModelProperty(value = "True if this list is public")
  public Boolean isPublicList() {
    return publicList;
  }

  public void setPublicList(Boolean publicList) {
    this.publicList = publicList;
  }

  public EmailList storefrontOid(Integer storefrontOid) {
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

  public EmailList usedBy(List<EmailListSegmentUsedBy> usedBy) {
    this.usedBy = usedBy;
    return this;
  }

  public EmailList addUsedByItem(EmailListSegmentUsedBy usedByItem) {
    if (this.usedBy == null) {
      this.usedBy = new ArrayList<EmailListSegmentUsedBy>();
    }
    this.usedBy.add(usedByItem);
    return this;
  }

   /**
   * Details on the flows or campaigns that use this list.
   * @return usedBy
  **/
  @ApiModelProperty(value = "Details on the flows or campaigns that use this list.")
  public List<EmailListSegmentUsedBy> getUsedBy() {
    return usedBy;
  }

  public void setUsedBy(List<EmailListSegmentUsedBy> usedBy) {
    this.usedBy = usedBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailList emailList = (EmailList) o;
    return Objects.equals(this.allowCsvDownload, emailList.allowCsvDownload) &&
        Objects.equals(this.createdDts, emailList.createdDts) &&
        Objects.equals(this.deleted, emailList.deleted) &&
        Objects.equals(this.emailListUuid, emailList.emailListUuid) &&
        Objects.equals(this.espListSegmentFolderUuid, emailList.espListSegmentFolderUuid) &&
        Objects.equals(this.memberCount, emailList.memberCount) &&
        Objects.equals(this.merchantId, emailList.merchantId) &&
        Objects.equals(this.name, emailList.name) &&
        Objects.equals(this.publicDescription, emailList.publicDescription) &&
        Objects.equals(this.publicList, emailList.publicList) &&
        Objects.equals(this.storefrontOid, emailList.storefrontOid) &&
        Objects.equals(this.usedBy, emailList.usedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowCsvDownload, createdDts, deleted, emailListUuid, espListSegmentFolderUuid, memberCount, merchantId, name, publicDescription, publicList, storefrontOid, usedBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailList {\n");
    
    sb.append("    allowCsvDownload: ").append(toIndentedString(allowCsvDownload)).append("\n");
    sb.append("    createdDts: ").append(toIndentedString(createdDts)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    emailListUuid: ").append(toIndentedString(emailListUuid)).append("\n");
    sb.append("    espListSegmentFolderUuid: ").append(toIndentedString(espListSegmentFolderUuid)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publicDescription: ").append(toIndentedString(publicDescription)).append("\n");
    sb.append("    publicList: ").append(toIndentedString(publicList)).append("\n");
    sb.append("    storefrontOid: ").append(toIndentedString(storefrontOid)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
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

