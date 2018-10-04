
# TaxCountry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingCode** | **String** | Accounting code for programs such as QuickBooks |  [optional]
**countryCode** | **String** | Country code (2 characters |  [optional]
**countryOid** | **Integer** | Tax record object identifier used internally by database |  [optional]
**states** | [**List&lt;TaxState&gt;**](TaxState.md) | States (or regions or territories) within this country |  [optional]
**taxGiftCharge** | **Boolean** | True if taxation within this jurisdiction should charge tax on gift charge |  [optional]
**taxGiftWrap** | **Boolean** | True if taxation within this jurisdiction should charge tax on gift wrap |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | Tax Rate |  [optional]
**taxRateFormatted** | **String** | Tax rate formatted |  [optional]
**taxShipping** | **Boolean** | True if taxation within this jurisdiction should charge tax on shipping |  [optional]



