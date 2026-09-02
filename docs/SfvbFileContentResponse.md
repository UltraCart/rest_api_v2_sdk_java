

# SfvbFileContentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoCompiled** | **Boolean** | True when this file is compiler output and must not be edited directly. |  [optional] |
|**content** | **String** | UTF-8 content.  Only text/_* files can be read this way. |  [optional] |
|**fsFileOid** | **Integer** | StoreFront file system file oid. |  [optional] |
|**hashSha256** | **String** | SHA-256 of the content.  Send this back as If-Match when writing.  The ETag header carries the same hash, but a compressing proxy may append a suffix such as -gzip to it, so this body value is the authoritative one.  Both forms are accepted on write. |  [optional] |
|**mimeType** | **String** | Mime type. |  [optional] |
|**path** | **String** | Full path of the file. |  [optional] |
|**size** | **Integer** | Size in bytes. |  [optional] |
|**truncated** | **Boolean** | True when the content was cut short.  Never truncated silently. |  [optional] |
|**valid** | **Boolean** | False when the file failed Velocity validation on its last write. |  [optional] |
|**velocityErrors** | **String** | Velocity errors recorded on the last write.  Null when valid. |  [optional] |
|**version** | **Integer** | Version number of the content returned. |  [optional] |



