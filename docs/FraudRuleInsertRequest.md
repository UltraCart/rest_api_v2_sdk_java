

# FraudRuleInsertRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliateEmail** | **String** | Affiliate email. Used by the &#39;affiliate matches&#39; rule type when affiliate_oid is not supplied. |  [optional] |
|**affiliateOid** | **Integer** | Affiliate OID. Used by the &#39;affiliate matches&#39; rule type. If omitted, affiliate_email is required. |  [optional] |
|**amountThreshold** | **BigDecimal** | Monetary or score threshold. Used by *transaction amount exceeds*, *fraud score exceeds*, and *decline percentage exceeds* rules. |  [optional] |
|**autoNote** | **String** | Note automatically appended to the order&#39;s merchant note when this rule fires. |  [optional] |
|**avsMatchType** | [**AvsMatchTypeEnum**](#AvsMatchTypeEnum) | AVS match type for the zip portion. Used by the &#39;address street and zip avs&#39; rule type. |  [optional] |
|**avsResponseCodes** | **String** | AVS response codes (street). Used by the &#39;address street and zip avs&#39; rule type. |  [optional] |
|**countThreshold** | **Integer** | Integer count threshold. Used by *count exceeds*, *change number*, *quantity exceeds*, and *purchased within last hours* rules. |  [optional] |
|**countryCode** | **String** | ISO country code. Used by the &#39;address not in country&#39; rule type. |  [optional] |
|**creditCardBins** | **Object** | Credit card BINs to block (max 20). Used by the &#39;credit card block bin&#39; rule type. |  [optional] |
|**email** | **String** | Email address. Used by the &#39;address email&#39; rule type. |  [optional] |
|**failureAction** | [**FailureActionEnum**](#FailureActionEnum) | Action to take when this rule fires. |  [optional] |
|**gatewayResponseCodes** | **String** | Gateway response code key. Used by the &#39;gateway response&#39; rule type. |  [optional] |
|**gatewayResponseValue** | **String** | Gateway response code value. Used by the &#39;gateway response&#39; rule type. |  [optional] |
|**ipAddress** | **String** | IP address or subnet (eg &#39;192.168.1.1&#39; or &#39;10.0.0.0/8&#39;). Used by &#39;exempt ip&#39; and &#39;ip matches&#39; rules. |  [optional] |
|**ipRangeType** | [**IpRangeTypeEnum**](#IpRangeTypeEnum) | Specifies whether an IP rule applies to a single address or a subnet. |  [optional] |
|**itemFilters** | **Object** | Optional list of merchant item ids restricting this rule to orders containing one or more of these items. |  [optional] |
|**merchantItemId** | **String** | Merchant item id. Used by the &#39;item matches&#39; rule type. |  [optional] |
|**modifyCustomField1** | **String** |  |  [optional] |
|**modifyCustomField2** | **String** |  |  [optional] |
|**modifyCustomField3** | **String** |  |  [optional] |
|**modifyCustomField4** | **String** |  |  [optional] |
|**modifyCustomField5** | **String** |  |  [optional] |
|**modifyCustomField6** | **String** |  |  [optional] |
|**modifyCustomField7** | **String** |  |  [optional] |
|**modifySkipAffiliate** | **Boolean** |  |  [optional] |
|**modifySkipAffiliateNetworkPixel** | **Boolean** |  |  [optional] |
|**rotatingTransactionGatewayFilters** | **Object** | Optional list of rotating transaction gateway oids restricting this rule to orders processed by one of these gateways. |  [optional] |
|**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | Rule type. Also returned by GET /v2/fraud/lookup_values. |  [optional] |
|**screenBrandingThemeFilters** | **Object** | Optional list of screen branding theme oids restricting this rule to orders associated with one or more storefronts. |  [optional] |
|**userAction** | [**UserActionEnum**](#UserActionEnum) | Only used by rule types that distinguish between attempted and approved transactions. |  [optional] |



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



