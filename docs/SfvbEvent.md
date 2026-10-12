

# SfvbEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventDts** | **String** | When it happened, ISO 8601. |  [optional] |
|**eventId** | **String** | Time-ordered id.  Pass the last one seen as after to replay what came since. |  [optional] |
|**objectId** | **String** | The id of what changed, such as the approval_id. |  [optional] |
|**objectType** | **String** | What changed, such as approval. |  [optional] |
|**storefrontOid** | **Integer** | The storefront it concerns.  Empty for merchant-level objects. |  [optional] |
|**type** | **String** | approval.decided (approved, denied, cancelled or refused by the script review) or approval.ready (the review finished and the person can decide). |  [optional] |



