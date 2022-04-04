
# ItemTax

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exemptions** | [**List&lt;ItemTaxExemption&gt;**](ItemTaxExemption.md) | Exemptions |  [optional]
**taxFree** | **Boolean** | True if tax free |  [optional]
**taxProductType** | [**TaxProductTypeEnum**](#TaxProductTypeEnum) | Tax product type |  [optional]
**taxableCost** | [**BigDecimal**](BigDecimal.md) | Taxable cost if different than regular cost |  [optional]


<a name="TaxProductTypeEnum"></a>
## Enum: TaxProductTypeEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
DIGITAL | &quot;digital&quot;
PHYSICAL | &quot;physical&quot;
SERVICE | &quot;service&quot;



