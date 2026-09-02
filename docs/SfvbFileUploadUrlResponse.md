

# SfvbFileUploadUrlResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expiresInSeconds** | **Integer** | Seconds until the upload URL stops working.  Ask for a new one rather than holding this across a long job. |  [optional] |
|**httpMethod** | **String** | HTTP method the upload URL expects. |  [optional] |
|**key** | **String** | Quote this back to the upload endpoint once the bytes are in place.  It identifies the uploaded object and is bound to your account. |  [optional] |
|**uploadUrl** | **String** | Send the raw bytes to this URL.  It is short lived and single use, and it is not part of this API - do not send an Authorization header with it. |  [optional] |



