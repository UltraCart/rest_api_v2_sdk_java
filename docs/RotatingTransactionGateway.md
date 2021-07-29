
# RotatingTransactionGateway

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalNativeCurrencyCodes** | [**List&lt;RtgCurrency&gt;**](RtgCurrency.md) | An array of all currencies known to the UltraCart system and a boolean indicating whether this gateway supports that currency. |  [optional]
**autoOrderCancelUnlessResponseName** | **String** | Advanced feature for canceling an auto order unless the transaction gateway response contains a field with this name.  If specified, this field must exist and the value must equal a value in the auto_order_cancel_unless_response_values array |  [optional]
**autoOrderCancelUnlessResponseValues** | **List&lt;String&gt;** | Advanced feature for canceling an auto order unless the transaction gateway response contains a field with the name specified in auto_order_cancel_unless_response_name.  If specified, this field must exist and the value must equal a value in this array.  If nothing matches, the auto order is canceled. |  [optional]
**baseCurrencyCode** | **String** | The base currency code for your gateway.  For example, USD. |  [optional]
**cascadeCode** | **String** | Optional field specifying a different rotating gateway to use if this gateway fails to process the transaction. |  [optional]
**cascadeCodes** | **List&lt;String&gt;** | A list of other rotating transaction gateways that can be used as a lookup to assign actions based on failures of this gateway |  [optional]
**cascadeDailyAutoOrderCode** | **String** | The code for the next rotating gateway that should be used when this gateway reaches a daily limit |  [optional]
**chargeAppearsOnStatementAs** | **String** | Optional field providing an alternate Charge Appears As value for this rotating gateway |  [optional]
**code** | **String** | A human friendly short code used to recognize and differentiate this rotating gateway with other rotating gateways |  [optional]
**currentDaily** | [**BigDecimal**](BigDecimal.md) | The current daily dollar amount this gateway has processed.  Providing this will allow UltraCart to track the monthly amount going forward. |  [optional]
**currentDailyAutoOrder** | [**BigDecimal**](BigDecimal.md) | The current daily dollar amount of auto orders (recurring) this gateway has processed.  Providing this will allow UltraCart to track the monthly amount going forward. |  [optional]
**currentMonthly** | [**BigDecimal**](BigDecimal.md) | The current monthly dollar amount this gateway has processed.  Providing this will allow UltraCart to track the monthly amount going forward. |  [optional]
**customerServiceEmail** | **String** | The customer service email address for this gateway |  [optional]
**customerServicePhone** | **String** | The customer service phone number for this gateway |  [optional]
**dayOfMonthRestrictions** | [**List&lt;RtgDayOfMonthRestriction&gt;**](RtgDayOfMonthRestriction.md) | Array containing all 31 (possible) days and any optional restrictions for one or more days. |  [optional]
**dayOfWeekRestrictions** | [**List&lt;RtgDayOfWeekRestriction&gt;**](RtgDayOfWeekRestriction.md) | Array containing all seven days of the week and any optional restrictions for one or more days |  [optional]
**deactivateAfterFailures** | **Integer** | If non-zero, this gateway will be deactivated after reaching this amount of consecutive failures. |  [optional]
**endDate** | **String** | Optional field to specify an absolute date when this gateway should stop accepting transactions |  [optional]
**gateways** | [**List&lt;TransactionGateway&gt;**](TransactionGateway.md) | An array of all transaction gateways, not just the one currently configured for this rotating gateway. This allows for easy switching to another gateway.  The enabled property on the transaction gateway indicates which one is actually being used. |  [optional]
**maximumDaily** | [**BigDecimal**](BigDecimal.md) | The maximum daily dollar amount this gateway may process |  [optional]
**maximumDailyAutoOrder** | [**BigDecimal**](BigDecimal.md) | The maximum daily dollar amount of auto orders (recurring) this gateway may process |  [optional]
**maximumMonthly** | [**BigDecimal**](BigDecimal.md) | The maximum monthly dollar amount this gateway may process. |  [optional]
**nextDailyAutoOrderReset** | **String** | The date and time when this gateway daily limit for auto orders will reset |  [optional]
**nextDailyReset** | **String** | The date and time when this gateway daily limit will reset |  [optional]
**nextMonthlyReset** | **String** | The date and time when this gateway monthly limit will reset |  [optional]
**orderTotal** | [**BigDecimal**](BigDecimal.md) | This optional field is combined with order_total_comparison to determine if an order should be processed thorugh this gateway. |  [optional]
**orderTotalComparison** | [**OrderTotalComparisonEnum**](#OrderTotalComparisonEnum) | The math operator used to determine if the order total is allowed to process through this gateway. |  [optional]
**rebillAutoOrdersAgainstThisRtgCode** | **String** | If specified auto orders (rebills) are routed to this rotating gateway.  This may be needed because rebills lack a credit card cvv. |  [optional]
**reserveDays** | **Integer** | The number of days that your gateway holds any reserves.  This aids in profitability reporting. |  [optional]
**reservePercentage** | [**BigDecimal**](BigDecimal.md) | The percentage of an order which your gateway is holding in reserve.  This aids in profitability reporting. |  [optional]
**reserveRefunded** | **Boolean** | If true, reserves are refunded when an order is refunded.  This aids in profitability reporting. |  [optional]
**reservesReleasedThrough** | **String** | An optional date specifying the date up to which your gateway has released all reserve funds.  This aids in profitability reporting. |  [optional]
**rotatingTransactionGatewayOid** | **Integer** | Internal identifier used to store and retrieve this gateway information |  [optional]
**selectedGatewayName** | **String** | The name of the currently selected transaction gateway used by this rotating gateway |  [optional]
**showCascadeCodes** | **Boolean** | A boolean used by the builtin UltraCart UI to determine if cascading rtg codes should be shown |  [optional]
**showMerchantAccountProfiles** | **Boolean** | A flag to help the UltraCart UI to know whether to show merchant account profiles or not. |  [optional]
**startDate** | **String** | Optional field to specify an absolute date when this gateway should begin accepting transactions |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | A field used to take a gateway offline without removing/deleting the configuration. Inactive marks the gateway as completely unusable.  Standby takes the gateway offline and will not be used unless all other active gateways fail. |  [optional]
**themeRestrictions** | [**List&lt;RtgThemeRestriction&gt;**](RtgThemeRestriction.md) | Optional restrictions by theme/storefront |  [optional]
**trafficPercentage** | [**BigDecimal**](BigDecimal.md) | Required field between 0 and 1 that dictates the percentage of traffic that should flow through this gateway |  [optional]
**trialDailyAmount** | **Integer** | If specified, limits the total daily dollar amount of trial orders |  [optional]
**trialDailyLimit** | **Integer** | If specified, limits the total month count of trial orders |  [optional]
**trialMonthlyLimit** | **Integer** | If specified, limits the total month dollar amount of trial orders |  [optional]


<a name="OrderTotalComparisonEnum"></a>
## Enum: OrderTotalComparisonEnum
Name | Value
---- | -----
LESS_THAN | &quot;&lt;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;
EQUAL | &quot;&#x3D;&quot;
GREATER_THAN | &quot;&gt;&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
STANDBY | &quot;standby&quot;



