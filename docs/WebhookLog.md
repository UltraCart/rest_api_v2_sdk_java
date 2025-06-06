

# WebhookLog


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deliveryDts** | **String** | Date/time of delivery |  [optional] |
|**duration** | **Integer** | Number of milliseconds to process the notification |  [optional] |
|**queueDelay** | **Long** | Number of milliseconds of delay caused by queuing |  [optional] |
|**request** | **String** | Request payload (first 100,000 characters) |  [optional] |
|**requestHeaders** | [**List&lt;HTTPHeader&gt;**](HTTPHeader.md) | Request headers sent to the server |  [optional] |
|**requestId** | **String** | Request id is a unique string that you can look up in the logs |  [optional] |
|**response** | **String** | Response payload (first 100,000 characters) |  [optional] |
|**responseHeaders** | [**List&lt;HTTPHeader&gt;**](HTTPHeader.md) | Response headers received from the server |  [optional] |
|**statusCode** | **Integer** | HTTP status code received from the server |  [optional] |
|**success** | **Boolean** | True if the delivery was successful |  [optional] |
|**uri** | **String** | URI of the webhook delivered to |  [optional] |
|**webhookOid** | **Integer** | webhook oid |  [optional] |



