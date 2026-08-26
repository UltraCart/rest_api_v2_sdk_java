

# BulkJobRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operation** | [**OperationEnum**](#OperationEnum) | Mutation mode - insert (create only) or upsert (create or update). Defaults to insert. This is always a mutation verb â€” the bulk surface writes only and has no read / query mode. upsert is currently supported for customer only. |  [optional] |
|**s3Key** | **String** | The s3_key returned by the upload-url endpoint |  [optional] |
|**webhookSecret** | **String** | Optional shared secret echoed in the completion POST&#39;s Authorization header |  [optional] |
|**webhookUrl** | **String** | Optional URL to POST once, on completion |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| INSERT | &quot;insert&quot; |
| UPSERT | &quot;upsert&quot; |



