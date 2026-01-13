
# ConversationPbxPhoneNumberPurchaseRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | Initial action for incoming calls |  [optional]
**actionTarget** | **String** | Initial action target UUID |  [optional]
**addressSid** | **String** | Address SID if required for regulatory compliance |  [optional]
**friendlyName** | **String** | Friendly name for the phone number |  [optional]
**phoneNumber** | **String** | Phone number to purchase in E.164 format (from search results) |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
TIME_BASED | &quot;time based&quot;
MENU | &quot;menu&quot;
QUEUE | &quot;queue&quot;
VOICEMAIL | &quot;voicemail&quot;
AGENT | &quot;agent&quot;



