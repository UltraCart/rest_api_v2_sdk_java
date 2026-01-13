
# ConversationPbxAvailablePhoneNumber

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addressRequirements** | [**AddressRequirementsEnum**](#AddressRequirementsEnum) | Address requirements |  [optional]
**country** | **String** | ISO country code |  [optional]
**friendlyName** | **String** | Friendly formatted phone number |  [optional]
**locality** | **String** | City/Locality |  [optional]
**mms** | **Boolean** | MMS capability |  [optional]
**phoneNumber** | **String** | Phone number in E.164 format |  [optional]
**region** | **String** | State/Province/Region |  [optional]
**sms** | **Boolean** | SMS capability |  [optional]
**voice** | **Boolean** | Voice capability |  [optional]


<a name="AddressRequirementsEnum"></a>
## Enum: AddressRequirementsEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
ANY | &quot;any&quot;
LOCAL | &quot;local&quot;
FOREIGN | &quot;foreign&quot;



