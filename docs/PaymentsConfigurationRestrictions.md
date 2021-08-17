
# PaymentsConfigurationRestrictions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**descriptions** | **List&lt;String&gt;** |  |  [optional]
**maximumSubtotal** | [**BigDecimal**](BigDecimal.md) | Maximum subtotal |  [optional]
**minimumSubtotal** | [**BigDecimal**](BigDecimal.md) | Minimum subtotal |  [optional]
**paymentMethod** | **String** | Payment method |  [optional]
**restrictionAlaskaHawaii** | [**RestrictionAlaskaHawaiiEnum**](#RestrictionAlaskaHawaiiEnum) | Alaska and Hawaii restriction |  [optional]
**restrictionApoFpo** | [**RestrictionApoFpoEnum**](#RestrictionApoFpoEnum) | APO/FPO restriction |  [optional]
**restrictionCanada** | [**RestrictionCanadaEnum**](#RestrictionCanadaEnum) | Canada restriction |  [optional]
**restrictionContinentalUs** | [**RestrictionContinentalUsEnum**](#RestrictionContinentalUsEnum) | Continental US restriction |  [optional]
**restrictionDomesticOnly** | [**RestrictionDomesticOnlyEnum**](#RestrictionDomesticOnlyEnum) | Domestic only restriction |  [optional]
**restrictionInternationalOnly** | [**RestrictionInternationalOnlyEnum**](#RestrictionInternationalOnlyEnum) | International only restriction |  [optional]
**restrictionPoBox** | [**RestrictionPoBoxEnum**](#RestrictionPoBoxEnum) | PO Box restriction |  [optional]
**restrictionPuertoRico** | [**RestrictionPuertoRicoEnum**](#RestrictionPuertoRicoEnum) | Puerto Rico restriction |  [optional]
**restrictionUsTerritories** | [**RestrictionUsTerritoriesEnum**](#RestrictionUsTerritoriesEnum) | US Territories restriction |  [optional]
**themes** | [**List&lt;PaymentsConfigurationRestrictionsTheme&gt;**](PaymentsConfigurationRestrictionsTheme.md) |  |  [optional]


<a name="RestrictionAlaskaHawaiiEnum"></a>
## Enum: RestrictionAlaskaHawaiiEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;


<a name="RestrictionApoFpoEnum"></a>
## Enum: RestrictionApoFpoEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;


<a name="RestrictionCanadaEnum"></a>
## Enum: RestrictionCanadaEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;


<a name="RestrictionContinentalUsEnum"></a>
## Enum: RestrictionContinentalUsEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;


<a name="RestrictionDomesticOnlyEnum"></a>
## Enum: RestrictionDomesticOnlyEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;


<a name="RestrictionInternationalOnlyEnum"></a>
## Enum: RestrictionInternationalOnlyEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;


<a name="RestrictionPoBoxEnum"></a>
## Enum: RestrictionPoBoxEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;


<a name="RestrictionPuertoRicoEnum"></a>
## Enum: RestrictionPuertoRicoEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;


<a name="RestrictionUsTerritoriesEnum"></a>
## Enum: RestrictionUsTerritoriesEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
INVALIDONLY | &quot;invalidOnly&quot;
VALID | &quot;valid&quot;



