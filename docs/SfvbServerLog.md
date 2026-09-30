

# SfvbServerLog


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appError** | **Boolean** | True when the render itself failed and the page could not be produced. |  [optional] |
|**durationMs** | **Integer** | How long the render took in milliseconds. |  [optional] |
|**errorCount** | **Integer** | Error lines in the log, including Velocity problems such as a null |  [optional] |
|**lineCount** | **Integer** | Lines in the full log text. |  [optional] |
|**logId** | **String** | Opaque id of this log.  Pass it to the get endpoint.  Preview pages send the same id in the X-UltraCart-Storefront-Log-Id response header. |  [optional] |
|**requestTemplate** | **String** | The template the page rendered with, when known. |  [optional] |
|**requestUrl** | **String** | The address that was rendered, as the server recorded it. |  [optional] |
|**startDate** | **String** | When the render started, ISO-8601 in UTC. |  [optional] |
|**status** | **String** | ERROR when the render logged any error line or failed, otherwise SUCCESS. |  [optional] |
|**stopDate** | **String** | When the render finished, ISO-8601 in UTC. |  [optional] |
|**warningCount** | **Integer** | Warning lines in the log. |  [optional] |



