

# FraudRuleSearchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliateOidOrEmail** | **String** | Affiliate oid (integer) or affiliate email. Email is resolved to oid before searching. |  [optional] |
|**amountThresholdBegin** | **BigDecimal** | Lower bound on amount/score/percentage thresholds (rules backed by the same numeric column). |  [optional] |
|**amountThresholdEnd** | **BigDecimal** | Upper bound on amount/score/percentage thresholds (rules backed by the same numeric column). |  [optional] |
|**autoNote** | **String** | Wildcard search on the rule&#39;s auto_note. Use &#39;*&#39; for wildcards. |  [optional] |
|**countThresholdBegin** | **Integer** | Lower bound on count thresholds (rules backed by the same integer count column). |  [optional] |
|**countThresholdEnd** | **Integer** | Upper bound on count thresholds (rules backed by the same integer count column). |  [optional] |
|**createdBy** | **String** | Filter to rules created by this user login. |  [optional] |
|**createdDateBegin** | **String** | Rule creation date begin (MM/dd/yyyy) |  [optional] |
|**createdDateEnd** | **String** | Rule creation date end (MM/dd/yyyy) |  [optional] |
|**creditCardPartial** | **String** | Partial credit card number for matching &#39;credit card matches&#39; rules. Use &#39;*&#39; wildcards. |  [optional] |
|**declineMessage** | **String** | Wildcard search on the rule&#39;s decline_message. Use &#39;*&#39; for wildcards. |  [optional] |
|**failureAction** | [**FailureActionEnum**](#FailureActionEnum) |  |  [optional] |
|**gatewayCode** | **String** | Filter to rules with this rotating transaction gateway code in their rotating_transaction_gateway_filters list. |  [optional] |
|**merchantItemId** | **String** | Filter to rules with this merchant item id in their item_filters list. |  [optional] |
|**modifierValue** | **String** | Wildcard search on the rule&#39;s secondary modifier (eg &#39;address&#39;/&#39;subnet&#39;, gateway codes, avs match types). |  [optional] |
|**modifyCustomField1** | **String** | Wildcard search on rules&#39; modify_custom_field1 value. |  [optional] |
|**modifyCustomField2** | **String** | Wildcard search on rules&#39; modify_custom_field2 value. |  [optional] |
|**modifyCustomField3** | **String** | Wildcard search on rules&#39; modify_custom_field3 value. |  [optional] |
|**modifyCustomField4** | **String** | Wildcard search on rules&#39; modify_custom_field4 value. |  [optional] |
|**modifyCustomField5** | **String** | Wildcard search on rules&#39; modify_custom_field5 value. |  [optional] |
|**modifyCustomField6** | **String** | Wildcard search on rules&#39; modify_custom_field6 value. |  [optional] |
|**modifyCustomField7** | **String** | Wildcard search on rules&#39; modify_custom_field7 value. |  [optional] |
|**modifySkipAffiliate** | **Boolean** | Filter to rules whose modify_skip_affiliate flag matches this value. |  [optional] |
|**modifySkipAffiliateNetworkPixel** | **Boolean** | Filter to rules whose modify_skip_affiliate_network_pixel flag matches this value. |  [optional] |
|**ruleGroup** | [**RuleGroupEnum**](#RuleGroupEnum) | Rule group to filter by. |  [optional] |
|**ruleType** | [**RuleTypeEnum**](#RuleTypeEnum) | Rule type to filter by. |  [optional] |
|**searchLinkedAccounts** | **Boolean** | Include rules from accounts linked to this merchant. Defaults to false. |  [optional] |
|**storefrontHostname** | **String** | Filter to rules with this storefront hostname in their screen_branding_theme_filters list. |  [optional] |
|**textValue** | **String** | Wildcard search on the rule&#39;s text parameter (email / ip / bin / country / item id / avs codes - the backend disambiguates by rule_type). |  [optional] |
|**themeCode** | **String** | Filter to rules with this screen branding theme code in their screen_branding_theme_filters list. |  [optional] |
|**userAction** | [**UserActionEnum**](#UserActionEnum) |  |  [optional] |



## Enum: FailureActionEnum

| Name | Value |
|---- | -----|
| FLAG_FOR_REVIEW | &quot;Flag For Review&quot; |
| PROCESS_PAYMENT_AND_MODIFY | &quot;Process Payment and Modify&quot; |
| PROCESS_PAYMENT_AND_REVIEW | &quot;Process Payment and Review&quot; |
| DECLINE_TRANSACTION | &quot;Decline Transaction&quot; |
| EXEMPT | &quot;Exempt&quot; |



## Enum: RuleGroupEnum

| Name | Value |
|---- | -----|
| EXEMPTRULES | &quot;exemptRules&quot; |
| CREDITCARDRULES | &quot;creditCardRules&quot; |
| IPRULES | &quot;ipRules&quot; |
| ADDRESSRULES | &quot;addressRules&quot; |
| AFFILIATERULES | &quot;affiliateRules&quot; |
| ITEMRULES | &quot;itemRules&quot; |
| ORDERRULES | &quot;orderRules&quot; |
| BROWSERRULES | &quot;browserRules&quot; |



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



