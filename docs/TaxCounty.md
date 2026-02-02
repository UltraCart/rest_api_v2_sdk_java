
# TaxCounty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingCode** | **String** | Accounting code for programs such as QuickBooks |  [optional]
**cities** | [**List&lt;TaxCity&gt;**](TaxCity.md) | Cities within this city |  [optional]
**county** | **String** | County |  [optional]
**countyOid** | **Integer** | Tax record object identifier used internally by database |  [optional]
**dontCollectCity** | **Boolean** | Flag instructing engine to not collect city tax for this county |  [optional]
**dontCollectCounty** | **Boolean** | Flag instructing engine to not collect county tax for this county |  [optional]
**dontCollectPostalCode** | **Boolean** | Flag instructing engine to not collect postal code tax for this county |  [optional]
**stateOid** | **Integer** | Tax record object identifier used internally by database |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | Tax Rate |  [optional]
**taxRateFormatted** | **String** | Tax rate formatted |  [optional]



