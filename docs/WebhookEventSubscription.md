

# WebhookEventSubscription


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comments** | **String** | Comment about the event to provide further clarification to the end user |  [optional] |
|**deprecatedFlag** | **Boolean** | True if the event is deprecated.  See the API change log for details on when it will be discontinued. |  [optional] |
|**discontinuedFlag** | **Boolean** | True if the event is discontinued.  See the API change log for details on migration details. |  [optional] |
|**eventDescription** | **String** | Description of the event |  [optional] |
|**eventName** | **String** | Event name |  [optional] |
|**eventRuler** | **String** | Optional - Event ruler expression to filter events to.  Only events that match this Ruler expression will be transmitted to the webhook. |  [optional] |
|**expansion** | **String** | The expand string for the notification object.  See the individual resource _expand documentation for valid values. |  [optional] |
|**subscribed** | **Boolean** | True if this is event is subscribed to |  [optional] |
|**supportsReflow** | **Boolean** | True if the event can be triggered to reflow existing records |  [optional] |
|**webhookEventOid** | **Integer** | The webhook event object identifier |  [optional] |



