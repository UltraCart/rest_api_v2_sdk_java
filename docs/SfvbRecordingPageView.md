

# SfvbRecordingPageView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**domain** | **String** | The host name of the address. |  [optional] |
|**events** | [**List&lt;SfvbRecordingEvent&gt;**](SfvbRecordingEvent.md) | Named events on this page view in time order, such as rage clicks and script errors. |  [optional] |
|**firstEventTimestamp** | **String** | When recording of this page view began, ISO-8601 in UTC. |  [optional] |
|**lastEventTimestamp** | **String** | When recording of this page view ended, ISO-8601 in UTC. |  [optional] |
|**missingEvents** | **Boolean** | True when no replay events were stored for this page view. |  [optional] |
|**params** | [**List&lt;SfvbRecordingParameter&gt;**](SfvbRecordingParameter.md) | The query string parameters on the address. |  [optional] |
|**referrer** | **String** | The referring address, when there was one. |  [optional] |
|**screenRecordingPageViewUuid** | **String** | Identifies this page view when fetching its replay events. |  [optional] |
|**timeOnPage** | **Integer** | Seconds the visitor spent on the page. |  [optional] |
|**timingDomContentLoaded** | **Integer** | Milliseconds until DOMContentLoaded fired. |  [optional] |
|**timingLoaded** | **Integer** | Milliseconds until the load event fired. |  [optional] |
|**truncatedEvents** | **Boolean** | True when the recorder stopped storing events part way through this page view. |  [optional] |
|**url** | **String** | The address the visitor viewed. |  [optional] |



