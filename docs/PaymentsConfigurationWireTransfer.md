
# PaymentsConfigurationWireTransfer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptWireTransfer** | **Boolean** | Master flag indicating this merchant accepts wire transfers |  [optional]
**accountNumber** | **String** | account_number |  [optional]
**accountingCode** | **String** | Optional Quickbooks accounting code |  [optional]
**bankAddress** | **String** | Bank address |  [optional]
**depositToAccount** | **String** | Optional Quickbooks deposit to account |  [optional]
**intermediateRoutingNumber** | **String** | Intermediate routing number |  [optional]
**restrictions** | [**PaymentsConfigurationRestrictions**](PaymentsConfigurationRestrictions.md) |  |  [optional]
**routingNumber** | **String** | Routing number |  [optional]
**surchargeAccountingCode** | **String** | If a surcharge is present and this merchant is integrated with Quickbooks, this is the accounting code for the surcharge amount |  [optional]
**surchargeFee** | [**BigDecimal**](BigDecimal.md) | surcharge_fee |  [optional]
**surchargePercentage** | [**BigDecimal**](BigDecimal.md) | surcharge_percentage |  [optional]



