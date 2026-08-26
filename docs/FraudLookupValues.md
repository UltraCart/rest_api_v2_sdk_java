

# FraudLookupValues


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliates** | [**List&lt;FraudLookupAffiliate&gt;**](FraudLookupAffiliate.md) | Affiliates with non-empty email, sorted by email. |  [optional] |
|**avsMatchTypes** | **List&lt;String&gt;** | Valid values for avs_match_type on the &#39;address street and zip avs&#39; rule type. |  [optional] |
|**countries** | **List&lt;String&gt;** | ISO country codes available to this merchant. |  [optional] |
|**failureActions** | **List&lt;String&gt;** | Valid values for failure_action on insert and search requests. |  [optional] |
|**ipRangeTypes** | **List&lt;String&gt;** | Valid values for ip_range_type on IP-based rules. |  [optional] |
|**linkedAccounts** | **Boolean** | True when this merchant has at least one linked merchant account. |  [optional] |
|**rotatingTransactionGateways** | [**List&lt;FraudLookupGateway&gt;**](FraudLookupGateway.md) | Rotating transaction gateways configured for this merchant. Use the oid as a value in rotating_transaction_gateway_filters on insert. |  [optional] |
|**ruleGroups** | **List&lt;String&gt;** | Valid values for rule_group on search requests. |  [optional] |
|**ruleTypes** | **List&lt;String&gt;** | Valid values for rule_type on insert and search requests. |  [optional] |
|**screenBrandingThemes** | [**List&lt;FraudLookupTheme&gt;**](FraudLookupTheme.md) | Screen branding themes configured for this merchant. Use the oid as a value in screen_branding_theme_filters on insert. |  [optional] |
|**userActions** | **List&lt;String&gt;** | Valid values for user_action on rule types that distinguish between attempted and approved transactions. |  [optional] |



