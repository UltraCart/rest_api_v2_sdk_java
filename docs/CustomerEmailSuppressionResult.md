

# CustomerEmailSuppressionResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bounceCleared** | **Boolean** | True only if this call actually removed bounce suppression.  Bounce has no per-customer flag, so there is no corresponding state field. |  [optional] |
|**customerProfileOid** | **Integer** | The customer profile oid that was operated on |  [optional] |
|**email** | **String** | The email address that was operated on |  [optional] |
|**espSuppressionRemoved** | **Boolean** | True only if every requested suppression surface was successfully cleared.  When false, see esp_warning -- the profile was still modified. |  [optional] |
|**espWarning** | **String** | Human readable explanation when esp_suppression_removed is false.  Suitable for display to a support agent. |  [optional] |
|**globalUnsubscribeCleared** | **Boolean** | True only if this call actually changed the global unsubscribe flag.  False if it was already clear. |  [optional] |
|**globalUnsubscribed** | **Boolean** | Global unsubscribe state AFTER this call |  [optional] |
|**globalUnsubscribedDts** | **String** | Global unsubscribe timestamp after this call.  Nulled when cleared; the prior value is retained on the audit record. |  [optional] |
|**spamComplaint** | **Boolean** | Spam complaint state AFTER this call |  [optional] |
|**spamComplaintCleared** | **Boolean** | True only if this call actually changed the spam complaint flag.  False if it was already clear. |  [optional] |
|**spamComplaintDts** | **String** | Spam complaint timestamp after this call.  Nulled when cleared; the prior value is retained on the audit record. |  [optional] |
|**suppressionSurfaces** | [**EmailSuppressionSurfaces**](EmailSuppressionSurfaces.md) |  |  [optional] |



