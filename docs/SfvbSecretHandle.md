

# SfvbSecretHandle


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expiresAt** | **String** | When it stops being usable, ISO 8601 UTC. |  [optional] |
|**fingerprint** | **String** | The last few characters of the value, as a mask shows them, so the person can tell values apart.  Empty until entered. |  [optional] |
|**handle** | **String** | The handle.  Safe to log and keep in plans.  It works only for the sign-in that requested it. |  [optional] |
|**key** | **String** | The bulk key it is for, or empty. |  [optional] |
|**sink** | **String** | The secret field it can be written to. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | pending (no value yet), ready, in_use (a write holds it), consumed, revoked or expired. |  [optional] |
|**targetId** | **String** | The object it can be written to, or empty when the request named none. |  [optional] |
|**usesLeft** | **Integer** | Writes left.  Empty once the handle is gone. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| READY | &quot;ready&quot; |
| IN_USE | &quot;in_use&quot; |
| CONSUMED | &quot;consumed&quot; |
| REVOKED | &quot;revoked&quot; |
| EXPIRED | &quot;expired&quot; |



