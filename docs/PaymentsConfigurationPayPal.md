
# PaymentsConfigurationPayPal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptPaypal** | **Boolean** | Master flag that determine if PayPal is an active payment for this account |  [optional]
**accountingCode** | **String** | Optional accounting code that is set to Quickbooks when an order uses this payment method. |  [optional]
**apiPassword** | **String** | PayPal API password |  [optional]
**apiUsername** | **String** | PayPal API username |  [optional]
**certificateOnFile** | **Boolean** | (Legacy) true if there is a PayPal certificate already on file. Used to manage the internal UI |  [optional]
**depositToAccount** | **String** | The account to deposit funds |  [optional]
**email** | **String** | The main PayPal email address |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) | PayPal configuration, live or sandbox |  [optional]
**headerImageUrl** | **String** | The URL for the PayPal header |  [optional]
**hideBillMeLater** | **Boolean** | True if the Bill Me Later button should be hidden during checkout |  [optional]
**hideExpressCheckoutOnViewCart** | **Boolean** | True if the PayPal express checkout button should be hidden on the view cart page.  This will force the customer to enter address information before being able to checkout with PayPal |  [optional]
**hideForUnshippedOrders** | **Boolean** | True if PayPal should be hidden for orders with no shippable product, such as digital orders |  [optional]
**holdInAr** | **Boolean** | If true, PayPal orders are held in Accounts Receivable for review |  [optional]
**landingPage** | [**LandingPageEnum**](#LandingPageEnum) | PayPal landing page |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | The PayPal mode |  [optional]
**privateKeyPassword** | **String** | PayPal API private key password |  [optional]
**processingFee** | **String** | Optional additional fee to charge if PayPal is used.  It is rare for this to be used. |  [optional]
**processingPercentage** | **String** | The processing percentage charged by PayPal |  [optional]
**pushPaypal** | **Boolean** | True if the internal UI should recommend opening a PayPal account |  [optional]
**restrictions** | [**PaymentsConfigurationRestrictions**](PaymentsConfigurationRestrictions.md) |  |  [optional]
**sendRecurring** | **Boolean** | True if UltraCart should send recurring orders to PayPal.  There are restrictions to what PayPal will accept for recurring orders.  Be careful. |  [optional]
**shortPaypalMarketingText** | **Boolean** | Short marketing text |  [optional]
**showCardLogosNotDirectlySupported** | **Boolean** | internal ui flag |  [optional]
**showSignature** | **Boolean** | Internal flag used to manage UI |  [optional]
**signature** | **String** | PayPal signature |  [optional]
**solutionType** | [**SolutionTypeEnum**](#SolutionTypeEnum) | PayPal solution type |  [optional]
**summaryEmail** | **String** | The email where PayPal summaries should be sent |  [optional]
**summaryMode** | **String** | Description of what mode PayPal is operating |  [optional]
**zeroDollarPenny** | **Boolean** | Send free items to PayPal as one cent items and subtract this penny from shipping.  PayPal does not allow the sale of free items. |  [optional]


<a name="EnvironmentEnum"></a>
## Enum: EnvironmentEnum
Name | Value
---- | -----
LIVE | &quot;Live&quot;
SANDBOX | &quot;Sandbox&quot;


<a name="LandingPageEnum"></a>
## Enum: LandingPageEnum
Name | Value
---- | -----
BILLING | &quot;Billing&quot;
LOGIN | &quot;Login&quot;


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
WPPECO | &quot;WPPECO&quot;
WPPECDP | &quot;WPPECDP&quot;


<a name="SolutionTypeEnum"></a>
## Enum: SolutionTypeEnum
Name | Value
---- | -----
SOLE | &quot;Sole&quot;
MARK | &quot;Mark&quot;



