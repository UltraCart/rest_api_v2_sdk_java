

# FraudRuleFromOrderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoNote** | **String** | Note automatically appended to the order&#39;s merchant note when these rules fire. |  [optional] |
|**establishAddressFilter** | **Boolean** | Establish an &#39;address street and zip avs&#39; rule from the order&#39;s ship-to street and zip. |  [optional] |
|**establishCardFilter** | **Boolean** | Establish a &#39;credit card matches&#39; rule by duplicating the order&#39;s stored card vault token. Skipped if the order has no stored card. |  [optional] |
|**establishEmailFilter** | **Boolean** | Establish an &#39;address email&#39; rule from the order&#39;s email address. |  [optional] |
|**establishIpFilter** | **Boolean** | Establish an &#39;ip matches&#39; subnet rule from the order&#39;s customer IP address (last octet masked to a subnet). |  [optional] |
|**failureAction** | [**FailureActionEnum**](#FailureActionEnum) | Action to take when these rules fire. Defaults to &#39;Flag For Review&#39; when omitted. |  [optional] |
|**orderId** | **String** | The order id to establish the fraud rule(s) from. |  [optional] |



## Enum: FailureActionEnum

| Name | Value |
|---- | -----|
| FLAG_FOR_REVIEW | &quot;Flag For Review&quot; |
| PROCESS_PAYMENT_AND_MODIFY | &quot;Process Payment and Modify&quot; |
| PROCESS_PAYMENT_AND_REVIEW | &quot;Process Payment and Review&quot; |
| DECLINE_TRANSACTION | &quot;Decline Transaction&quot; |
| EXEMPT | &quot;Exempt&quot; |



