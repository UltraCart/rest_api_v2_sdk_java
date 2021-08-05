
# PaymentsConfigurationAffirm

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptAffirm** | **Boolean** | Master flag indicating this merchant accepts Affirm payments |  [optional]
**accountingCode** | **String** | Optional Quickbooks code for this payment method |  [optional]
**depositToAccount** | **String** | Optional Quickbooks Deposit to Account value |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) | Environment |  [optional]
**financialProductKey** | **String** | Financial product key |  [optional]
**privateApiKey** | **String** | Private API key |  [optional]
**publicApiKey** | **String** | Public API key |  [optional]
**restrictions** | [**PaymentsConfigurationRestrictions**](PaymentsConfigurationRestrictions.md) |  |  [optional]


<a name="EnvironmentEnum"></a>
## Enum: EnvironmentEnum
Name | Value
---- | -----
LIVE | &quot;Live&quot;
SANDBOX | &quot;Sandbox&quot;



