

# SfvbEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventDts** | **String** | When it happened, ISO 8601. |  [optional] |
|**eventId** | **String** | Time-ordered id.  Pass the last one seen as after to replay what came since. |  [optional] |
|**objectId** | **String** | The id of what changed, such as the approval_id. |  [optional] |
|**objectType** | **String** | What changed, such as approval or secret_sink. |  [optional] |
|**storefrontOid** | **Integer** | The storefront it concerns.  Empty for merchant-level objects. |  [optional] |
|**type** | **String** | approval.decided (approved, denied, cancelled or refused by the script review), approval.ready (the review finished and the person can decide) or secret_sink.completed (a person entered the values of a secret request; object_id is the request id). |  [optional] |



