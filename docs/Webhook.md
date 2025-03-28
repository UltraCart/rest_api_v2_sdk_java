

# Webhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiUserOid** | **Integer** | Populated if webhook associated with an API user |  [optional] |
|**apiVersion** | [**ApiVersionEnum**](#ApiVersionEnum) | Version of the API objects that are sent in notifications |  [optional] |
|**applicationProfile** | [**ApiUserApplicationProfile**](ApiUserApplicationProfile.md) |  |  [optional] |
|**authenticationType** | [**AuthenticationTypeEnum**](#AuthenticationTypeEnum) | The type of authentication this webhook will use when communicating with your server |  [optional] |
|**basicPassword** | **String** | Basic authentication password |  [optional] |
|**basicUsername** | **String** | Basic authentication user name |  [optional] |
|**compressEvents** | **Boolean** | Compress events with GZIP then base 64 encode them as a string |  [optional] |
|**consecutiveFailures** | **Integer** | The number of consecutive failures that have occurred trying to deliver notifications to the target server |  [optional] |
|**disabled** | **Boolean** | True if the webhook has been disabled |  [optional] |
|**eventCategories** | [**List&lt;WebhookEventCategory&gt;**](WebhookEventCategory.md) | The categories of events.  Individual events and subscriptions are handled in the child objects.  _placeholders parameter effects the population of this on a retrieval. |  [optional] |
|**iamAccessKey** | **String** | IAM Access Key for AWS SQS Delivery |  [optional] |
|**iamSecretKey** | **String** | IAM Secret Key for AWS SQS Delivery |  [optional] |
|**maximumEvents** | **Integer** | The maximum number of events in the payload that UltraCart will deliver |  [optional] |
|**maximumSize** | **Integer** | The maximum size of the payload that UltraCart will deliver |  [optional] |
|**merchantId** | **String** | The UltraCart merchant ID that owns this webhook |  [optional] |
|**nextRetryAfter** | **String** | The next time UltraCart will attempt delivery if failures have been occurring |  [optional] |
|**pending** | **Integer** | The number of pending events for this webhook |  [optional] |
|**webhookOid** | **Integer** | The object identifier for this webhook |  [optional] |
|**webhookUrl** | **String** | The URL to deliver events to.  Must be HTTPS for customer related information. |  [optional] |



## Enum: ApiVersionEnum

| Name | Value |
|---- | -----|
| _2017_03_01 | &quot;2017-03-01&quot; |



## Enum: AuthenticationTypeEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| BASIC | &quot;basic&quot; |
| API_USER | &quot;api user&quot; |
| AWS_IAM | &quot;aws iam&quot; |



