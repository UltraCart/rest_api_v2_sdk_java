

# FraudRulePublic


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliateOid** | **Integer** | Affiliate oid for the &#39;affiliate matches&#39; rule type. |  [optional] |
|**amountThreshold** | **BigDecimal** | Monetary or score threshold for amount/score/percentage rule types. |  [optional] |
|**autoNote** | **String** | Note automatically appended to the order&#39;s merchant note when this rule fires. |  [optional] |
|**avsMatchType** | [**AvsMatchTypeEnum**](#AvsMatchTypeEnum) |  |  [optional] |
|**avsResponseCodes** | **String** | AVS response codes for the &#39;address street and zip avs&#39; rule type. |  [optional] |
|**cardNumber** | **String** | Masked credit card number for rules tied to a specific card |  [optional] |
|**countThreshold** | **Integer** | Integer count threshold for count/quantity/hours rule types. |  [optional] |
|**countryCode** | **String** | ISO country code for the &#39;address not in country&#39; rule type. |  [optional] |
|**createdBy** | **String** |  |  [optional] |
|**createdDts** | **String** | Created date |  [optional] |
|**creditCardBins** | **List&lt;String&gt;** | Credit card BINs blocked by the &#39;credit card block bin&#39; rule type. |  [optional] |
|**declineMessage** | **String** | Message shown in the A/R review screen when this rule fires. |  [optional] |
|**description** | **String** | Human-readable description of the rule |  [optional] |
|**descriptionHtml** | **String** | HTML version of the rule description |  [optional] |
|**email** | **String** | Email address for the &#39;address email&#39; rule type. |  [optional] |
|**failureAction** | [**FailureActionEnum**](#FailureActionEnum) | Action taken when this rule fires. |  [optional] |
|**fraudRuleOid** | **Integer** | UltraCart unique identifier for this fraud rule |  [optional] |
|**gatewayResponseCodes** | **String** | Gateway response code key for the &#39;gateway response&#39; rule type. |  [optional] |
|**gatewayResponseValue** | **String** | Gateway response code value for the &#39;gateway response&#39; rule type. |  [optional] |
|**ipAddress** | **String** | IP address or subnet for &#39;exempt ip&#39; and &#39;ip matches&#39; rule types. |  [optional] |
|**ipRangeType** | [**IpRangeTypeEnum**](#IpRangeTypeEnum) |  |  [optional] |
|**itemFilters** | [**List&lt;FraudRuleItemFilter&gt;**](FraudRuleItemFilter.md) | Item filters restricting this rule to orders containing one or more of these items. |  [optional] |
|**merchantItemId** | **String** | Merchant item id for the &#39;item matches&#39; rule type. |  [optional] |
|**modifyCustomField1** | **String** | Value the rule sets on order custom field 1 (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**modifyCustomField2** | **String** | Value the rule sets on order custom field 2 (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**modifyCustomField3** | **String** | Value the rule sets on order custom field 3 (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**modifyCustomField4** | **String** | Value the rule sets on order custom field 4 (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**modifyCustomField5** | **String** | Value the rule sets on order custom field 5 (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**modifyCustomField6** | **String** | Value the rule sets on order custom field 6 (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**modifyCustomField7** | **String** | Value the rule sets on order custom field 7 (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**modifySkipAffiliate** | **Boolean** | When true, the rule strips the affiliate from the order (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**modifySkipAffiliateNetworkPixel** | **Boolean** | When true, the rule suppresses the affiliate network pixel (only meaningful for &#39;Process Payment and Modify&#39;). |  [optional] |
|**rotatingTransactionGatewayFilters** | [**List&lt;FraudRuleRotatingTransactionGatewayFilter&gt;**](FraudRuleRotatingTransactionGatewayFilter.md) | Gateway filters restricting this rule to orders processed by one of these rotating transaction gateways. |  [optional] |
|**ruleGroup** | **String** | Group containing this rule type (eg &#39;creditCardRules&#39;). Deliberately not constrained by allowableValues on the response so SDK consumers do not hard-fail on an unexpected value if a future rule_type slips through the server-side mapping. Search REQUESTS still restrict rule_group to the known set. |  [optional] |
|**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | Rule type. |  [optional] |
|**storefrontFilters** | [**List&lt;FraudRuleStorefrontFilter&gt;**](FraudRuleStorefrontFilter.md) | Storefront filters restricting this rule to orders placed on one of these storefronts. |  [optional] |
|**userAction** | [**UserActionEnum**](#UserActionEnum) |  |  [optional] |



## Enum: AvsMatchTypeEnum

| Name | Value |
|---- | -----|
| MATCH | &quot;match&quot; |
| NO_MATCH | &quot;no match&quot; |
| PARTIAL | &quot;partial&quot; |



## Enum: FailureActionEnum

| Name | Value |
|---- | -----|
| FLAG_FOR_REVIEW | &quot;Flag For Review&quot; |
| PROCESS_PAYMENT_AND_MODIFY | &quot;Process Payment and Modify&quot; |
| PROCESS_PAYMENT_AND_REVIEW | &quot;Process Payment and Review&quot; |
| DECLINE_TRANSACTION | &quot;Decline Transaction&quot; |
| EXEMPT | &quot;Exempt&quot; |



## Enum: IpRangeTypeEnum

| Name | Value |
|---- | -----|
| ADDRESS | &quot;address&quot; |
| SUBNET | &quot;subnet&quot; |



## Enum: RuleTypeEnum

| Name | Value |
|---- | -----|
| EXEMPT_APO_FPO | &quot;exempt apo fpo&quot; |
| EXEMPT_IP | &quot;exempt ip&quot; |
| EXEMPT_LOGGED_IN_CUSTOMER_WITH_PRICING_TIER | &quot;exempt logged in customer with pricing tier&quot; |
| CREDIT_CARD_SINGLE_TRANSACTION_EXCEEDS | &quot;credit card single transaction exceeds&quot; |
| CREDIT_CARD_DAILY_TRANSACTION_AMOUNT_EXCEEDS | &quot;credit card daily transaction amount exceeds&quot; |
| CREDIT_CARD_DAILY_TRANSACTION_COUNT_EXCEEDS | &quot;credit card daily transaction count exceeds&quot; |
| CREDIT_CARD_WEEKLY_TRANSACTION_AMOUNT_EXCEEDS | &quot;credit card weekly transaction amount exceeds&quot; |
| CREDIT_CARD_WEEKLY_TRANSACTION_COUNT_EXCEEDS | &quot;credit card weekly transaction count exceeds&quot; |
| CREDIT_CARD_CHANGE_NUMBER | &quot;credit card change number&quot; |
| CREDIT_CARD_BLOCK_BIN | &quot;credit card block bin&quot; |
| CREDIT_CARD_BLOCK_PREPAID | &quot;credit card block prepaid&quot; |
| AMAZON_SPECIAL_INSTRUCTIONS | &quot;amazon special instructions&quot; |
| PAYPAL_SPECIAL_INSTRUCTIONS | &quot;paypal special instructions&quot; |
| REWARD_COUPON_EMAIL_MISMATCH | &quot;reward coupon email mismatch&quot; |
| GATEWAY_RESPONSE | &quot;gateway response&quot; |
| IP_DAILY_TRANSACTION_AMOUNT_EXCEEDS | &quot;ip daily transaction amount exceeds&quot; |
| IP_DAILY_TRANSACTION_COUNT_EXCEEDS | &quot;ip daily transaction count exceeds&quot; |
| IP_WEEKLY_TRANSACTION_AMOUNT_EXCEEDS | &quot;ip weekly transaction amount exceeds&quot; |
| IP_WEEKLY_TRANSACTION_COUNT_EXCEEDS | &quot;ip weekly transaction count exceeds&quot; |
| IP_MATCHES | &quot;ip matches&quot; |
| IP_COUNTRY_MISMATCH | &quot;ip country mismatch&quot; |
| ADDRESS_FRAUD_SCORE_EXCEEDS | &quot;address fraud score exceeds&quot; |
| ADDRESS_FRAUD_SCORE_EXCEEDS_EXEMPT_APO_FPO | &quot;address fraud score exceeds exempt apo fpo&quot; |
| ADDRESS_STREET_AND_ZIP_AVS | &quot;address street and zip avs&quot; |
| ADDRESS_BILLING_DOESNT_MATCH_SHIPPING | &quot;address billing doesnt match shipping&quot; |
| BILLING_COUNTRY_DOESNT_MATCH_SHIPPING | &quot;billing country doesnt match shipping&quot; |
| ADDRESS_INTERNATIONAL | &quot;address international&quot; |
| ADDRESS_MATCH_EXCEPT_ZIP | &quot;address match except zip&quot; |
| ADDRESS_EMAIL | &quot;address email&quot; |
| ADDRESS_NOT_IN_COUNTRY | &quot;address not in country&quot; |
| WHOLESALE_CUSTOMER_NOT_LOGGED_IN | &quot;wholesale customer not logged in&quot; |
| AFFILIATE_MATCHES | &quot;affiliate matches&quot; |
| AFFILIATE_DAILY_COUNT_EXCEEDS | &quot;affiliate daily count exceeds&quot; |
| AFFILIATE_WEEKLY_COUNT_EXCEEDS | &quot;affiliate weekly count exceeds&quot; |
| AFFILIATE_DAILY_DECLINE_PERCENTAGE_EXCEEDS | &quot;affiliate daily decline percentage exceeds&quot; |
| AFFILIATE_WEEKLY_DECLINE_PERCENTAGE_EXCEEDS | &quot;affiliate weekly decline percentage exceeds&quot; |
| AFFILIATE_DAILY_WITH_SAME_IP | &quot;affiliate daily with same ip&quot; |
| AFFILIATE_WEEKLY_WITH_SAME_IP | &quot;affiliate weekly with same ip&quot; |
| ITEM_MATCHES | &quot;item matches&quot; |
| ITEM_QUANTITY_EXCEEDS | &quot;item quantity exceeds&quot; |
| ORDER_PREVIOUS_RETURN | &quot;order previous return&quot; |
| ORDER_PURCHASED_WITHIN_LAST_HOURS | &quot;order purchased within last hours&quot; |
| ORDER_USED_COUPON_MEANT_FOR_SHARING | &quot;order used coupon meant for sharing&quot; |
| BROWSER_OS_LINUX | &quot;browser os linux&quot; |



## Enum: UserActionEnum

| Name | Value |
|---- | -----|
| ATTEMPTED | &quot;Attempted&quot; |
| APPROVED | &quot;Approved&quot; |



