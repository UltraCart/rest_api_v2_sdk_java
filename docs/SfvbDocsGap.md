

# SfvbDocsGap


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**duplicate** | **Boolean** | On submit, true when this account had already sent the same report.  The earlier report_id is returned and nothing new is kept. |  [optional] |
|**receivedAt** | **String** | When UltraCart received the report. |  [optional] |
|**reportId** | **String** | The report&#39;s id.  Quote it to UltraCart, or look the report up with GET docs/gaps/{report_id}. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | received until UltraCart staff look at it, then accepted, declined or fixed. |  [optional] |
|**statusAt** | **String** | When the status last changed.  Absent while the report is received. |  [optional] |
|**storefrontOid** | **Integer** | The storefront named when the report was sent, if one was. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RECEIVED | &quot;received&quot; |
| ACCEPTED | &quot;accepted&quot; |
| DECLINED | &quot;declined&quot; |
| FIXED | &quot;fixed&quot; |



