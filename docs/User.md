

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiIpAddressMasks** | **List&lt;String&gt;** | A list of IP addresses whitelisted for any user with API Access permission.  Without this list, each ip address must be authenticated by a user, which can be a pain for some servers. |  [optional] |
|**changeFtpPasswordTo** | **String** | Supply a new FTP password using this field.  Password are stored using one-way encryption, so they are never available anywhere in the system.  The FTP password cannot be the same as the normal password. |  [optional] |
|**changePasswordTo** | **String** | Supply a new password using this field.  Password are stored using one-way encryption, so they are never available anywhere in the system. |  [optional] |
|**email** | **String** | Email address of user |  [optional] |
|**fullName** | **String** | Full name of user.  This is used solely for human assistance and so the UltraCart staff knows who they are calling when there is a problem. |  [optional] |
|**groups** | [**List&lt;UserGroupMembership&gt;**](UserGroupMembership.md) | A list of groups for this merchant and whether or not this user is a member of those groups. |  [optional] |
|**linkedAccounts** | [**List&lt;LinkedAccount&gt;**](LinkedAccount.md) | A list of linked accounts and whether or not this user is mirrored to any of those accounts. |  [optional] |
|**login** | **String** | User name of user.  Must be unique across a merchant account. |  [optional] |
|**loginHistories** | [**List&lt;UserLogin&gt;**](UserLogin.md) | A list of user logins over the past 90 days |  [optional] |
|**notifications** | [**List&lt;Notification&gt;**](Notification.md) | A list of notifications the user receives. |  [optional] |
|**otpSerialNumber** | **String** | OTP Serial Number such as Google Authenticator or Crypto Card. |  [optional] |
|**permissions** | [**List&lt;Permission&gt;**](Permission.md) | A list of permissions the user enjoys for accessing the backend of UltraCart. |  [optional] |
|**phone** | **String** | Phone number of user.  Please supply a valid phone number.  When something breaks on your account, we need to be able to reach you. |  [optional] |
|**userId** | **Integer** | User id is a unique identifier for this user |  [optional] |



