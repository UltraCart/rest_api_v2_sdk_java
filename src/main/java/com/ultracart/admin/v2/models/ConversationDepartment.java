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
import com.ultracart.admin.v2.models.ConversationDepartmentMember;
import com.ultracart.admin.v2.models.ConversationDepartmentSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConversationDepartment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ConversationDepartment {
  @SerializedName("conversation_department_oid")
  private Integer conversationDepartmentOid = null;

  @SerializedName("department_name")
  private String departmentName = null;

  @SerializedName("members")
  private List<ConversationDepartmentMember> members = null;

  @SerializedName("merchant_id")
  private String merchantId = null;

  @SerializedName("settings")
  private ConversationDepartmentSettings settings = null;

  public ConversationDepartment conversationDepartmentOid(Integer conversationDepartmentOid) {
    this.conversationDepartmentOid = conversationDepartmentOid;
    return this;
  }

   /**
   * Get conversationDepartmentOid
   * @return conversationDepartmentOid
  **/
  @ApiModelProperty(value = "")
  public Integer getConversationDepartmentOid() {
    return conversationDepartmentOid;
  }

  public void setConversationDepartmentOid(Integer conversationDepartmentOid) {
    this.conversationDepartmentOid = conversationDepartmentOid;
  }

  public ConversationDepartment departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

   /**
   * Get departmentName
   * @return departmentName
  **/
  @ApiModelProperty(value = "")
  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public ConversationDepartment members(List<ConversationDepartmentMember> members) {
    this.members = members;
    return this;
  }

  public ConversationDepartment addMembersItem(ConversationDepartmentMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<ConversationDepartmentMember>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @ApiModelProperty(value = "")
  public List<ConversationDepartmentMember> getMembers() {
    return members;
  }

  public void setMembers(List<ConversationDepartmentMember> members) {
    this.members = members;
  }

  public ConversationDepartment merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(value = "")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public ConversationDepartment settings(ConversationDepartmentSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public ConversationDepartmentSettings getSettings() {
    return settings;
  }

  public void setSettings(ConversationDepartmentSettings settings) {
    this.settings = settings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationDepartment conversationDepartment = (ConversationDepartment) o;
    return Objects.equals(this.conversationDepartmentOid, conversationDepartment.conversationDepartmentOid) &&
        Objects.equals(this.departmentName, conversationDepartment.departmentName) &&
        Objects.equals(this.members, conversationDepartment.members) &&
        Objects.equals(this.merchantId, conversationDepartment.merchantId) &&
        Objects.equals(this.settings, conversationDepartment.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationDepartmentOid, departmentName, members, merchantId, settings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationDepartment {\n");
    
    sb.append("    conversationDepartmentOid: ").append(toIndentedString(conversationDepartmentOid)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

