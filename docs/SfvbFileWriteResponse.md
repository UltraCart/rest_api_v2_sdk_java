

# SfvbFileWriteResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**compiledPath** | **String** | Path of the compiled output, when writing a .cjson under a theme triggered a compile. |  [optional] |
|**_file** | [**SfvbFileEntry**](SfvbFileEntry.md) |  |  [optional] |
|**hashSha256** | **String** | New SHA-256.  Use as the next If-Match value. |  [optional] |
|**publicUrl** | **String** | Where a shopper&#39;s browser will fetch this file, for use in an img src or a background image.  Present only for a path outside /themes/, which is served straight off the storefront root.  A file inside a theme is absent here because its public URL depends on which theme is active, and guessing it would be worse than omitting it. |  [optional] |
|**validation** | [**SfvbValidationResponse**](SfvbValidationResponse.md) |  |  [optional] |
|**velocityErrors** | **String** | Velocity errors recorded by the store.  Present means the file was written but is not valid. |  [optional] |
|**version** | **Integer** | New version number. |  [optional] |



