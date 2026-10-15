

# SfvbSecretRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **String** | When the request was made, ISO 8601 UTC. |  [optional] |
|**delegated** | **Boolean** | True when the requester handed it to a colleague to fill in. |  [optional] |
|**description** | **String** | The sentence the person reads.  Written by the server, not the agent. |  [optional] |
|**expiresAt** | **String** | When a pending request lapses, ISO 8601 UTC. |  [optional] |
|**expiresInSeconds** | **Integer** | Seconds until expires_at.  Zero once passed. |  [optional] |
|**fulfilledAt** | **String** | When the values were entered, ISO 8601 UTC. |  [optional] |
|**handleCount** | **Integer** | How many handles the request made. |  [optional] |
|**handles** | [**List&lt;SfvbSecretHandle&gt;**](SfvbSecretHandle.md) | Every handle with its status.  Left out of the list endpoint; read one request for them. |  [optional] |
|**intervalSeconds** | **Integer** | Poll no more often than this. |  [optional] |
|**keys** | **List&lt;String&gt;** | The bulk keys, or empty. |  [optional] |
|**label** | **String** | The label the agent sent, as stored and shown. |  [optional] |
|**reason** | **String** | The reason the agent sent, as stored and shown. |  [optional] |
|**requestId** | **String** | The request id. |  [optional] |
|**requestUrl** | **String** | The page where the person enters the values.  Show it to them.  Never open or fill it in yourself. |  [optional] |
|**requiresTotp** | **Boolean** | True when the person must enter a code from their authenticator app. |  [optional] |
|**sinks** | **List&lt;String&gt;** | The secret fields being collected. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | pending, fulfilled, cancelled or expired. |  [optional] |
|**targetId** | **String** | The object the values are for, or empty for a bulk request or an open one. |  [optional] |
|**userCode** | **String** | Short matching code.  Print it next to request_url so the person can check the page shows the same code. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| FULFILLED | &quot;fulfilled&quot; |
| CANCELLED | &quot;cancelled&quot; |
| EXPIRED | &quot;expired&quot; |



