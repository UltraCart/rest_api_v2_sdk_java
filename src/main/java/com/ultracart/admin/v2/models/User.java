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
import com.ultracart.admin.v2.models.LinkedAccount;
import com.ultracart.admin.v2.models.Notification;
import com.ultracart.admin.v2.models.Permission;
import com.ultracart.admin.v2.models.UserGroupMembership;
import com.ultracart.admin.v2.models.UserLogin;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * User
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class User {
  @SerializedName("api_ip_address_masks")
  private List<String> apiIpAddressMasks = null;

  @SerializedName("change_ftp_password_to")
  private String changeFtpPasswordTo = null;

  @SerializedName("change_password_to")
  private String changePasswordTo = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("groups")
  private List<UserGroupMembership> groups = null;

  @SerializedName("linked_accounts")
  private List<LinkedAccount> linkedAccounts = null;

  @SerializedName("login")
  private String login = null;

  @SerializedName("login_histories")
  private List<UserLogin> loginHistories = null;

  @SerializedName("notifications")
  private List<Notification> notifications = null;

  @SerializedName("otp_serial_number")
  private String otpSerialNumber = null;

  @SerializedName("permissions")
  private List<Permission> permissions = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public User apiIpAddressMasks(List<String> apiIpAddressMasks) {
    this.apiIpAddressMasks = apiIpAddressMasks;
    return this;
  }

  public User addApiIpAddressMasksItem(String apiIpAddressMasksItem) {
    if (this.apiIpAddressMasks == null) {
      this.apiIpAddressMasks = new ArrayList<String>();
    }
    this.apiIpAddressMasks.add(apiIpAddressMasksItem);
    return this;
  }

   /**
   * A list of IP addresses whitelisted for any user with API Access permission.  Without this list, each ip address must be authenticated by a user, which can be a pain for some servers.
   * @return apiIpAddressMasks
  **/
  @ApiModelProperty(value = "A list of IP addresses whitelisted for any user with API Access permission.  Without this list, each ip address must be authenticated by a user, which can be a pain for some servers.")
  public List<String> getApiIpAddressMasks() {
    return apiIpAddressMasks;
  }

  public void setApiIpAddressMasks(List<String> apiIpAddressMasks) {
    this.apiIpAddressMasks = apiIpAddressMasks;
  }

  public User changeFtpPasswordTo(String changeFtpPasswordTo) {
    this.changeFtpPasswordTo = changeFtpPasswordTo;
    return this;
  }

   /**
   * Supply a new FTP password using this field.  Password are stored using one-way encryption, so they are never available anywhere in the system.  The FTP password cannot be the same as the normal password.
   * @return changeFtpPasswordTo
  **/
  @ApiModelProperty(value = "Supply a new FTP password using this field.  Password are stored using one-way encryption, so they are never available anywhere in the system.  The FTP password cannot be the same as the normal password.")
  public String getChangeFtpPasswordTo() {
    return changeFtpPasswordTo;
  }

  public void setChangeFtpPasswordTo(String changeFtpPasswordTo) {
    this.changeFtpPasswordTo = changeFtpPasswordTo;
  }

  public User changePasswordTo(String changePasswordTo) {
    this.changePasswordTo = changePasswordTo;
    return this;
  }

   /**
   * Supply a new password using this field.  Password are stored using one-way encryption, so they are never available anywhere in the system.
   * @return changePasswordTo
  **/
  @ApiModelProperty(value = "Supply a new password using this field.  Password are stored using one-way encryption, so they are never available anywhere in the system.")
  public String getChangePasswordTo() {
    return changePasswordTo;
  }

  public void setChangePasswordTo(String changePasswordTo) {
    this.changePasswordTo = changePasswordTo;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of user
   * @return email
  **/
  @ApiModelProperty(value = "Email address of user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of user.  This is used solely for human assistance and so the UltraCart staff knows who they are calling when there is a problem.
   * @return fullName
  **/
  @ApiModelProperty(value = "Full name of user.  This is used solely for human assistance and so the UltraCart staff knows who they are calling when there is a problem.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public User groups(List<UserGroupMembership> groups) {
    this.groups = groups;
    return this;
  }

  public User addGroupsItem(UserGroupMembership groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<UserGroupMembership>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of groups for this merchant and whether or not this user is a member of those groups.
   * @return groups
  **/
  @ApiModelProperty(value = "A list of groups for this merchant and whether or not this user is a member of those groups.")
  public List<UserGroupMembership> getGroups() {
    return groups;
  }

  public void setGroups(List<UserGroupMembership> groups) {
    this.groups = groups;
  }

  public User linkedAccounts(List<LinkedAccount> linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
    return this;
  }

  public User addLinkedAccountsItem(LinkedAccount linkedAccountsItem) {
    if (this.linkedAccounts == null) {
      this.linkedAccounts = new ArrayList<LinkedAccount>();
    }
    this.linkedAccounts.add(linkedAccountsItem);
    return this;
  }

   /**
   * A list of linked accounts and whether or not this user is mirrored to any of those accounts.
   * @return linkedAccounts
  **/
  @ApiModelProperty(value = "A list of linked accounts and whether or not this user is mirrored to any of those accounts.")
  public List<LinkedAccount> getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(List<LinkedAccount> linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }

  public User login(String login) {
    this.login = login;
    return this;
  }

   /**
   * User name of user.  Must be unique across a merchant account.
   * @return login
  **/
  @ApiModelProperty(value = "User name of user.  Must be unique across a merchant account.")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public User loginHistories(List<UserLogin> loginHistories) {
    this.loginHistories = loginHistories;
    return this;
  }

  public User addLoginHistoriesItem(UserLogin loginHistoriesItem) {
    if (this.loginHistories == null) {
      this.loginHistories = new ArrayList<UserLogin>();
    }
    this.loginHistories.add(loginHistoriesItem);
    return this;
  }

   /**
   * A list of user logins over the past 90 days
   * @return loginHistories
  **/
  @ApiModelProperty(value = "A list of user logins over the past 90 days")
  public List<UserLogin> getLoginHistories() {
    return loginHistories;
  }

  public void setLoginHistories(List<UserLogin> loginHistories) {
    this.loginHistories = loginHistories;
  }

  public User notifications(List<Notification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public User addNotificationsItem(Notification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<Notification>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * A list of notifications the user receives.
   * @return notifications
  **/
  @ApiModelProperty(value = "A list of notifications the user receives.")
  public List<Notification> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<Notification> notifications) {
    this.notifications = notifications;
  }

  public User otpSerialNumber(String otpSerialNumber) {
    this.otpSerialNumber = otpSerialNumber;
    return this;
  }

   /**
   * OTP Serial Number such as Google Authenticator or Crypto Card.
   * @return otpSerialNumber
  **/
  @ApiModelProperty(value = "OTP Serial Number such as Google Authenticator or Crypto Card.")
  public String getOtpSerialNumber() {
    return otpSerialNumber;
  }

  public void setOtpSerialNumber(String otpSerialNumber) {
    this.otpSerialNumber = otpSerialNumber;
  }

  public User permissions(List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public User addPermissionsItem(Permission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<Permission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * A list of permissions the user enjoys for accessing the backend of UltraCart.
   * @return permissions
  **/
  @ApiModelProperty(value = "A list of permissions the user enjoys for accessing the backend of UltraCart.")
  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone number of user.  Please supply a valid phone number.  When something breaks on your account, we need to be able to reach you.
   * @return phone
  **/
  @ApiModelProperty(value = "Phone number of user.  Please supply a valid phone number.  When something breaks on your account, we need to be able to reach you.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public User userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User id is a unique identifier for this user
   * @return userId
  **/
  @ApiModelProperty(value = "User id is a unique identifier for this user")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.apiIpAddressMasks, user.apiIpAddressMasks) &&
        Objects.equals(this.changeFtpPasswordTo, user.changeFtpPasswordTo) &&
        Objects.equals(this.changePasswordTo, user.changePasswordTo) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.linkedAccounts, user.linkedAccounts) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.loginHistories, user.loginHistories) &&
        Objects.equals(this.notifications, user.notifications) &&
        Objects.equals(this.otpSerialNumber, user.otpSerialNumber) &&
        Objects.equals(this.permissions, user.permissions) &&
        Objects.equals(this.phone, user.phone) &&
        Objects.equals(this.userId, user.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiIpAddressMasks, changeFtpPasswordTo, changePasswordTo, email, fullName, groups, linkedAccounts, login, loginHistories, notifications, otpSerialNumber, permissions, phone, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    apiIpAddressMasks: ").append(toIndentedString(apiIpAddressMasks)).append("\n");
    sb.append("    changeFtpPasswordTo: ").append(toIndentedString(changeFtpPasswordTo)).append("\n");
    sb.append("    changePasswordTo: ").append(toIndentedString(changePasswordTo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    linkedAccounts: ").append(toIndentedString(linkedAccounts)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    loginHistories: ").append(toIndentedString(loginHistories)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    otpSerialNumber: ").append(toIndentedString(otpSerialNumber)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

