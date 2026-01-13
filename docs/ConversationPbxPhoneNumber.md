

# ConversationPbxPhoneNumber


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Action |  [optional] |
|**actionTarget** | **String** | Action target.  This is the UUID associated with the configuration object of that particular type. |  [optional] |
|**conversationPbxPhoneNumberUuid** | **String** | Conversation Pbx Phone Number UUID |  [optional] |
|**deletionProtected** | **Boolean** | If true, this phone number cannot be deleted through the API. It must be deleted via the Twilio console. |  [optional] |
|**merchantId** | **String** | Merchant Id |  [optional] |
|**phoneNumber** | **String** | Phone number |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| TIME_BASED | &quot;time based&quot; |
| MENU | &quot;menu&quot; |
| QUEUE | &quot;queue&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| AGENT | &quot;agent&quot; |



