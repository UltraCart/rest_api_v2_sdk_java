

# SfvbCommsDnsRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The host name, relative to the domain.  @ is the domain itself. |  [optional] |
|**purpose** | [**PurposeEnum**](#PurposeEnum) | What the record is for.  verification proves the domain is yours, spf lists who may send for it, and dkim signs its mail. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The record type. |  [optional] |
|**value** | **String** | The value to publish. |  [optional] |



## Enum: PurposeEnum

| Name | Value |
|---- | -----|
| VERIFICATION | &quot;verification&quot; |
| SPF | &quot;spf&quot; |
| DKIM | &quot;dkim&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TXT | &quot;TXT&quot; |
| CNAME | &quot;CNAME&quot; |



