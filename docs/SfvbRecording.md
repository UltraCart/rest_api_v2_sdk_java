

# SfvbRecording


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adPlatform** | [**ScreenRecordingAdPlatform**](ScreenRecordingAdPlatform.md) |  |  [optional] |
|**browser** | **String** | Browser name from the user agent. |  [optional] |
|**browserVersion** | **String** | Browser version from the user agent. |  [optional] |
|**converted** | **Boolean** | True when the session ended in an order. |  [optional] |
|**device** | **String** | Device name from the user agent. |  [optional] |
|**endTimestamp** | **String** | When the session ended, ISO-8601 in UTC. |  [optional] |
|**geolocationCountry** | **String** | Country the visitor was in. |  [optional] |
|**geolocationState** | **String** | State or region the visitor was in. |  [optional] |
|**languageIsoCode** | **String** | The browser language. |  [optional] |
|**orderId** | **String** | The order placed during the session, when there was one. |  [optional] |
|**os** | **String** | Operating system from the user agent. |  [optional] |
|**pageViewCount** | **Integer** | How many pages the visitor viewed. |  [optional] |
|**pageViews** | [**List&lt;SfvbRecordingPageView&gt;**](SfvbRecordingPageView.md) | The pages viewed, in order. |  [optional] |
|**referrerDomain** | **String** | The domain that referred the visitor. |  [optional] |
|**rrwebVersion** | **String** | The rrweb version that recorded the session.  Replay with the same version. |  [optional] |
|**screenRecordingUuid** | **String** | Identifies the recording. |  [optional] |
|**startTimestamp** | **String** | When the session started, ISO-8601 in UTC. |  [optional] |
|**timeOnSite** | **Integer** | Seconds the visitor spent on the site. |  [optional] |
|**utmCampaign** | **String** | utm_campaign on arrival. |  [optional] |
|**utmSource** | **String** | utm_source on arrival. |  [optional] |
|**windowHeight** | **Integer** | Browser window height in pixels. |  [optional] |
|**windowWidth** | **Integer** | Browser window width in pixels. |  [optional] |



