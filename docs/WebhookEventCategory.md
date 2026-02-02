
# WebhookEventCategory

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anySubscribed** | **Boolean** | True if any events are subscribed to. |  [optional]
**availableExpansions** | **List&lt;String&gt;** | Array of available expansion constants |  [optional]
**eventCategory** | **String** | Name of the event category |  [optional]
**events** | [**List&lt;WebhookEventSubscription&gt;**](WebhookEventSubscription.md) | The events within the category.  Individual subscription flags contained within the child object. |  [optional]
**subscribed** | **Boolean** | True if all the events within this category are subscribed.  This is a convenience flag to make user interfaces easier. |  [optional]



