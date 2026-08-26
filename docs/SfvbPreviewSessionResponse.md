

# SfvbPreviewSessionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bytesStored** | **Integer** | Bytes stored in this session by the request that returned this response. |  [optional] |
|**expiresInSeconds** | **Integer** | Seconds until this session expires. |  [optional] |
|**maxBytes** | **Integer** | Maximum bytes one preview session may hold. |  [optional] |
|**ownerLogin** | **String** | Login this session belongs to.  Sessions are keyed by user, not by token. |  [optional] |
|**previewSessionId** | **String** | The preview session id. |  [optional] |
|**skipped** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Containers that were sent but could not be stored, with the reason. |  [optional] |
|**storedKeys** | **List&lt;String&gt;** | Preview map keys that were stored.  A container whose owner type could not be resolved is silently dropped by the underlying store, so compare this against what you sent. |  [optional] |



