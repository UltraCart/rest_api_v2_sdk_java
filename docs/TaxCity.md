
# TaxCity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingCode** | **String** | Accounting code for programs such as QuickBooks |  [optional]
**city** | **String** | City |  [optional]
**cityOid** | **Integer** | Tax record object identifier used internally by database |  [optional]
**countyOid** | **Integer** | Tax record object identifier used internally by database |  [optional]
**dontCollectCity** | **Boolean** | Flag instructing engine to not collect city tax for this city |  [optional]
**dontCollectPostalCode** | **Boolean** | Flag instructing engine to not collect postal code tax for this city |  [optional]
**postalCodes** | [**List&lt;TaxPostalCode&gt;**](TaxPostalCode.md) | Postal Codes within this city |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | Tax Rate |  [optional]
**taxRateFormatted** | **String** | Tax rate formatted |  [optional]



