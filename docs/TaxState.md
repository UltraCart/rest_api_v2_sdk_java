
# TaxState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingCode** | **String** | Accounting code for programs such as QuickBooks |  [optional]
**counties** | [**List&lt;TaxCounty&gt;**](TaxCounty.md) | Counties within this state |  [optional]
**countryOid** | **Integer** | Tax record object identifier used internally by database |  [optional]
**dontCollectCity** | **Boolean** | Flag instructing engine to not collect city tax for this state |  [optional]
**dontCollectCounty** | **Boolean** | Flag instructing engine to not collect county tax for this state |  [optional]
**dontCollectPostalCode** | **Boolean** | Flag instructing engine to not collect postal code tax for this state |  [optional]
**dontCollectState** | **Boolean** | Flag instructing engine to not collect state tax for this state |  [optional]
**exemptDigitalItems** | **Boolean** | True if digital items are exempt from sales tax in this state. |  [optional]
**exemptPhysicalItems** | **Boolean** | True if physical items are exempt from sales tax in this state. |  [optional]
**exemptServiceItems** | **Boolean** | True if service items are exempt from sales tax in this state. |  [optional]
**stateCode** | **String** | State code |  [optional]
**stateOid** | **Integer** | Tax record object identifier used internally by database |  [optional]
**taxGiftCharge** | **Boolean** | True if taxation within this jurisdiction should charge tax on gift charge |  [optional]
**taxGiftWrap** | **Boolean** | True if taxation within this jurisdiction should charge tax on gift wrap |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | Tax Rate |  [optional]
**taxRateFormatted** | **String** | Tax rate formatted |  [optional]
**taxShipping** | **Boolean** | True if taxation within this jurisdiction should charge tax on shipping |  [optional]
**useUltracartManagedRates** | **Boolean** | If true, use UltraCart managed rates for this state |  [optional]



