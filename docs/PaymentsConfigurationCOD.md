
# PaymentsConfigurationCOD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptCod** | **Boolean** | Master flag indicating this merchant accepts COD |  [optional]
**approvedCustomersOnly** | **Boolean** | If true, only approved customers may pay with COD |  [optional]
**restrictions** | [**PaymentsConfigurationRestrictions**](PaymentsConfigurationRestrictions.md) |  |  [optional]
**surchargeAccountingCode** | **String** | Optional field, if surcharge is set, this is the accounting code the surcharge is tagged with when sent to Quickbooks |  [optional]
**surchargeFee** | [**BigDecimal**](BigDecimal.md) | Additional cost for using COD |  [optional]
**surchargePercentage** | [**BigDecimal**](BigDecimal.md) | Additional percentage cost for using COD |  [optional]



