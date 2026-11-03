

# SfvbAffiliateNetworkRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignToAffiliateOid** | **Integer** | One of the account&#39;s own affiliates.  Name it in unset to clear it. |  [optional] |
|**commission** | **BigDecimal** | A fixed commission amount, 0 or more, with at most 6 decimals.  Name it in unset to clear it. |  [optional] |
|**conversionPixel** | **String** | HTML for custom, at most 10,000 characters, or one https URL for server_to_server.  An empty string empties it.  A pixel that a custom or server_to_server network will use needs an approved affiliate_network.change request for exactly this change. |  [optional] |
|**conversionType** | [**ConversionTypeEnum**](#ConversionTypeEnum) | custom, commission_junction or server_to_server. |  [optional] |
|**cookieLifetimeDays** | **Integer** | 1 to 3650. |  [optional] |
|**dryRun** | **Boolean** | True to check the change and say whether it needs an approval, without saving. |  [optional] |
|**firePercentage** | **BigDecimal** | 0 to 100, with at most 2 decimals. |  [optional] |
|**ifNotFired** | [**IfNotFiredEnum**](#IfNotFiredEnum) | process, skip or assign.  assign needs if_not_fired_affiliate_oid. |  [optional] |
|**ifNotFiredAffiliateOid** | **Integer** | For if_not_fired assign, one of the account&#39;s own affiliates. |  [optional] |
|**networkName** | **String** | Up to 50 characters.  Required on a create. |  [optional] |
|**parameterName** | **String** | Up to 50 characters.  Required on a create. |  [optional] |
|**parameterValue** | **String** | Up to 100 characters.  Required on a create. |  [optional] |
|**recordFireInCustomField** | **Integer** | 1 to 10. |  [optional] |
|**recordNameInCustomField** | **Integer** | 1 to 10. |  [optional] |
|**removeEmptyPixelParameters** | **Boolean** | server_to_server only. |  [optional] |
|**stompPreviousCookie** | **Boolean** | True to replace another network&#39;s cookie. |  [optional] |
|**unset** | **List&lt;String&gt;** | Fields to clear.  commission and assign_to_affiliate_oid only. |  [optional] |



## Enum: ConversionTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;custom&quot; |
| COMMISSION_JUNCTION | &quot;commission_junction&quot; |
| SERVER_TO_SERVER | &quot;server_to_server&quot; |



## Enum: IfNotFiredEnum

| Name | Value |
|---- | -----|
| PROCESS | &quot;process&quot; |
| SKIP | &quot;skip&quot; |
| ASSIGN | &quot;assign&quot; |



