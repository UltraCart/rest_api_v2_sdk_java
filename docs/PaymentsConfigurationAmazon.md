
# PaymentsConfigurationAmazon

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptAmazon** | **Boolean** | Master flag to determine if this merchant accepts Pay by Amazon |  [optional]
**accessKeyId** | **String** | Amazon access key ID |  [optional]
**accountingCode** | **String** | Optional accounting code for use with Quickbooks integrations |  [optional]
**amazonMerchantId** | **String** | Amazon merchant ID |  [optional]
**depositToAccount** | **String** | Optional deposit to account field for use with Quickbooks integrations |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) | Environment |  [optional]
**restrictions** | [**PaymentsConfigurationRestrictions**](PaymentsConfigurationRestrictions.md) |  |  [optional]
**secretAccessKey** | **String** | Amazon secret access key |  [optional]


<a name="EnvironmentEnum"></a>
## Enum: EnvironmentEnum
Name | Value
---- | -----
LIVE | &quot;Live&quot;
SANDBOX | &quot;Sandbox&quot;



