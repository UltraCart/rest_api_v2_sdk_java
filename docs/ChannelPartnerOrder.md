
# ChannelPartnerOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertisingSource** | **String** | advertising_source |  [optional]
**affiliateId** | **String** | Affiliate Id |  [optional]
**affiliateSubId** | **String** | Affiliate Sub Id |  [optional]
**arbitraryShippingHandlingTotal** | [**BigDecimal**](BigDecimal.md) | Arbitrary shipping handling total |  [optional]
**arbitraryTax** | [**BigDecimal**](BigDecimal.md) | Arbitrary tax for overriding calculated taxes |  [optional]
**arbitraryTaxRate** | [**BigDecimal**](BigDecimal.md) | Arbitrary tax rate |  [optional]
**arbitraryTaxableSubtotal** | [**BigDecimal**](BigDecimal.md) | Arbitrary taxable subtotal |  [optional]
**associateWithCustomerProfileIfPresent** | **Boolean** | If true any matching customer profile based on email is associated with this order |  [optional]
**autoApprovePurchaseOrder** | **Boolean** | If true any purchase orders are automatically approved |  [optional]
**billtoAddress1** | **String** | Billing Address line 1 |  [optional]
**billtoAddress2** | **String** | Billing Address line 2 |  [optional]
**billtoCity** | **String** | Billing City |  [optional]
**billtoCompany** | **String** | Billing Company |  [optional]
**billtoCountryCode** | **String** | Billing ISO-3166 two letter country code |  [optional]
**billtoDayPhone** | **String** | Billing Day phone |  [optional]
**billtoEveningPhone** | **String** | Billing Evening phone |  [optional]
**billtoFirstName** | **String** | Billing First name |  [optional]
**billtoLastName** | **String** | Billing Last name |  [optional]
**billtoPostalCode** | **String** | Billing Postal code |  [optional]
**billtoStateRegion** | **String** | Billing State for United States otherwise region or province for other countries |  [optional]
**billtoTitle** | **String** | Billing Title |  [optional]
**ccEmail** | **String** | CC email. |  [optional]
**channelPartnerOrderId** | **String** | The id for this order within the channel partner system. |  [optional]
**considerRecurring** | **Boolean** | If true this order is marked as an auto order (recurring) |  [optional]
**coupons** | **List&lt;String&gt;** | Array of coupon codes |  [optional]
**creditCardAuthorizationAmount** | [**BigDecimal**](BigDecimal.md) | The amount authorized externally |  [optional]
**creditCardAuthorizationDts** | **String** | Date/Time of credit card authorization in ISO8601 format |  [optional]
**creditCardAuthorizationNumber** | **String** | The reference number provided by an externally processed transaction |  [optional]
**creditCardExpirationMonth** | **Integer** | Credit card expiration month |  [optional]
**creditCardExpirationYear** | **Integer** | Credit card expiration year |  [optional]
**creditCardType** | **String** | Credit card type |  [optional]
**customField1** | **String** | Custom field 1 |  [optional]
**customField2** | **String** | Custom field 2 |  [optional]
**customField3** | **String** | Custom field 3 |  [optional]
**customField4** | **String** | Custom field 4 |  [optional]
**customField5** | **String** | Custom field 5 |  [optional]
**customField6** | **String** | Custom field 6 |  [optional]
**customField7** | **String** | Custom field 7 |  [optional]
**deliveryDate** | **String** | Date the customer is requesting delivery on. Typically used for perishable product delivery. |  [optional]
**echeckBankAbaCode** | **String** | eCheck bank ABA code |  [optional]
**echeckBankAccountName** | **String** | eCheck bank account name |  [optional]
**echeckBankAccountNumber** | **String** | eCheck bank account number |  [optional]
**echeckBankAccountType** | [**EcheckBankAccountTypeEnum**](#EcheckBankAccountTypeEnum) | eCheck bank account type |  [optional]
**echeckBankName** | **String** | eCheck bank name |  [optional]
**echeckBankOwnerType** | [**EcheckBankOwnerTypeEnum**](#EcheckBankOwnerTypeEnum) | eCheck bank owner type |  [optional]
**echeckCustomerTaxId** | **String** | eCheck customer tax id |  [optional]
**echeckDriversLicenseDob** | **String** | eCheck drivers license dob |  [optional]
**echeckDriversLicenseNumber** | **String** | eCheck drivers license number |  [optional]
**echeckDriversLicenseState** | **String** | eCheck drivers license state |  [optional]
**email** | **String** | Email |  [optional]
**gift** | **Boolean** | True if this order is a gift |  [optional]
**giftEmail** | **String** | Email address of the gift recipient |  [optional]
**giftMessage** | **String** | Message to the gift recipient |  [optional]
**hostedFieldsCardToken** | **String** | The token provided by UltraCart hosted fields when a credit card number is uploaded into the system.  This is the only way to provide a credit card number. |  [optional]
**hostedFieldsCvvToken** | **String** | The token provided by UltraCart hosted fields when a credit card cvv is uploaded into the system.  This is the only way to provide a cvv number. |  [optional]
**insuranceApplicationId** | **String** | Insurance application id |  [optional]
**insuranceClaimId** | **String** | Insurance claim id |  [optional]
**ipAddress** | **String** | IP Address of the customer |  [optional]
**items** | [**List&lt;ChannelPartnerOrderItem&gt;**](ChannelPartnerOrderItem.md) | Items |  [optional]
**leastCostRoute** | **Boolean** | If true the least expensive shipping method is automatically chosen during the order import |  [optional]
**leastCostRouteShippingMethods** | **List&lt;String&gt;** | An optional array of shipping methods to restict choices if least_cost_route is true |  [optional]
**mailingListOptIn** | **Boolean** | If true the customer is subscribed to any configured mailing lists |  [optional]
**noRealtimePaymentProcessing** | **Boolean** | If true no payment processing is done and the order is placed into Accounts Receivable |  [optional]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | Payment method |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number |  [optional]
**rotatingTransactionGatewayCode** | **String** | The rotating transaction gateway code for the gateway used to charge this order |  [optional]
**salesRepCode** | **String** | Sales rep code |  [optional]
**screenBrandingThemeCode** | **String** | Screen branding theme code |  [optional]
**shipOnDate** | **String** | Date the customer is requesting that the order ship on.  Typically used for perishable product delivery. |  [optional]
**shipToResidential** | **Boolean** | True if the shipping adress is residential.  Effects the methods that are available to the customer as well as the price of the shipping method. |  [optional]
**shippingMethod** | **String** | Shipping method |  [optional]
**shiptoAddress1** | **String** | Shipping Address line 1 |  [optional]
**shiptoAddress2** | **String** | Shipping Address line 2 |  [optional]
**shiptoCity** | **String** | Shipping City |  [optional]
**shiptoCompany** | **String** | Shipping Company |  [optional]
**shiptoCountryCode** | **String** | Shipping ISO-3166 two letter country code |  [optional]
**shiptoDayPhone** | **String** | Shipping Day phone |  [optional]
**shiptoEveningPhone** | **String** | Shipping Evening phone |  [optional]
**shiptoFirstName** | **String** | Shipping First name |  [optional]
**shiptoLastName** | **String** | Shipping Last name |  [optional]
**shiptoPostalCode** | **String** | Shipping Postal code |  [optional]
**shiptoStateRegion** | **String** | Shipping State for United States otherwise region or province for other countries |  [optional]
**shiptoTitle** | **String** | Shipping Title |  [optional]
**skipPaymentProcessing** | **Boolean** | If true the order is placed directly into the shipping department |  [optional]
**specialInstructions** | **String** | Special instructions from the customer regarding shipping |  [optional]
**storeCompleted** | **Boolean** | If true the order bypasses shipping and is marked completed |  [optional]
**storeIfPaymentDeclines** | **Boolean** | If true any failed payments are placed into Accounts Receivable.  If false any failed payments result in a rejected order resulting in errors thrown during the insert routine |  [optional]
**storefrontHostName** | **String** | StoreFront host name associated with the order |  [optional]
**taxCounty** | **String** | The optional shipping county used to determine exact taxes |  [optional]
**taxExempt** | **Boolean** | If true this order is marked as being tax exempt |  [optional]
**transaction** | [**ChannelPartnerOrderTransaction**](ChannelPartnerOrderTransaction.md) |  |  [optional]
**treatWarningsAsErrors** | **Boolean** | If true all warnings are considered errors, this is true by default |  [optional]
**usePriorPaymentInformationFromOrderId** | **String** | An Order Id from a prior purchase of this customer which is used to retrieve vaulted payment information in order to pay for this current order. |  [optional]


<a name="EcheckBankAccountTypeEnum"></a>
## Enum: EcheckBankAccountTypeEnum
Name | Value
---- | -----
CHECKING | &quot;Checking&quot;
SAVINGS | &quot;Savings&quot;


<a name="EcheckBankOwnerTypeEnum"></a>
## Enum: EcheckBankOwnerTypeEnum
Name | Value
---- | -----
BUSINESS | &quot;Business&quot;
PERSONAL | &quot;Personal&quot;


<a name="PaymentMethodEnum"></a>
## Enum: PaymentMethodEnum
Name | Value
---- | -----
AFFIRM | &quot;Affirm&quot;
AMAZON | &quot;Amazon&quot;
CHECK | &quot;Check&quot;
COD | &quot;COD&quot;
CREDIT_CARD | &quot;Credit Card&quot;
ECHECK | &quot;eCheck&quot;
LOANHERO | &quot;LoanHero&quot;
MONEY_ORDER | &quot;Money Order&quot;
PAYPAL | &quot;PayPal&quot;
PURCHASE_ORDER | &quot;Purchase Order&quot;
QUOTE_REQUEST | &quot;Quote Request&quot;
WIRE_TRANSFER | &quot;Wire Transfer&quot;



