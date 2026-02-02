
# OrderTaxes

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arbitraryTax** | [**BigDecimal**](BigDecimal.md) | Arbitrary Tax, this is meaningless for updating an order.  For inserting a new order, this will override any internal tax calculations and should only be used for orders completed outside the system. |  [optional]
**arbitraryTaxRate** | [**BigDecimal**](BigDecimal.md) | Arbitrary tax rate, this is meaningless for updating an order.  For inserting a new order, this will override any internal tax calculations and should only be used for orders completed outside the system. |  [optional]
**arbitraryTaxableSubtotal** | [**BigDecimal**](BigDecimal.md) | Arbitrary taxable subtotal, this is meaningless for updating an order.  For inserting a new order, this will override any internal tax calculations and should only be used for orders completed outside the system. |  [optional]
**taxCityAccountingCode** | **String** | QuickBooks tax city code |  [optional]
**taxCountryAccountingCode** | **String** | QuickBooks tax country code |  [optional]
**taxCounty** | **String** | County used for tax calculation purposes (only in the United States) |  [optional]
**taxCountyAccountingCode** | **String** | QuickBooks tax county code |  [optional]
**taxGiftCharge** | **Boolean** | True if gift charge is taxed |  [optional]
**taxPostalCodeAccountingCode** | **String** | QuickBooks tax postal code code |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | Tax rate, this is meaningless for updating an order.  For inserting a new order, if you need to override internal tax calculations, use the arbitrary fields. |  [optional]
**taxRateCity** | [**BigDecimal**](BigDecimal.md) | Tax rate at the city level |  [optional]
**taxRateCountry** | [**BigDecimal**](BigDecimal.md) | Tax rate at the country level |  [optional]
**taxRateCounty** | [**BigDecimal**](BigDecimal.md) | Tax rate at the county level |  [optional]
**taxRatePostalCode** | [**BigDecimal**](BigDecimal.md) | Tax rate at the postal code level |  [optional]
**taxRateState** | [**BigDecimal**](BigDecimal.md) | Tax rate at the state level |  [optional]
**taxShipping** | **Boolean** | True if shipping is taxed |  [optional]
**taxStateAccountingCode** | **String** | QuickBooks tax state code |  [optional]



