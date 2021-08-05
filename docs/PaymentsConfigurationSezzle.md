
# PaymentsConfigurationSezzle

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptSezzle** | **Boolean** | Master flag for this merchant accepting Sezzle payments |  [optional]
**accountingCode** | **String** | Optional Quickbooks code for this payment method |  [optional]
**businessId** | **String** | Business ID |  [optional]
**depositToAccount** | **String** | Optional Quickbooks Deposit to Account value |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) | Sezzle environment |  [optional]
**environments** | **Object** | List of environments possible |  [optional]
**privateApiKey** | **String** | Private API key |  [optional]
**publicApiKey** | **String** | Public API key |  [optional]
**restrictions** | [**PaymentsConfigurationRestrictions**](PaymentsConfigurationRestrictions.md) |  |  [optional]


<a name="EnvironmentEnum"></a>
## Enum: EnvironmentEnum
Name | Value
---- | -----
LIVE | &quot;Live&quot;
SANDBOX | &quot;Sandbox&quot;



