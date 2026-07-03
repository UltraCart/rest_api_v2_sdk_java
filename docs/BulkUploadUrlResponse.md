

# BulkUploadUrlResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**error** | [**Error**](Error.md) |  |  [optional] |
|**expiresAt** | **String** | When the presigned URL expires |  [optional] |
|**maxRecords** | **Integer** | Per-job record cap |  [optional] |
|**metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  |  [optional] |
|**s3Key** | **String** | Opaque reference to pass back on POST /rest/v2/bulk/{object} |  [optional] |
|**success** | **Boolean** | Indicates if API call was successful |  [optional] |
|**uploadUrl** | **String** | Presigned S3 PUT URL (short-lived) |  [optional] |
|**warning** | [**Warning**](Warning.md) |  |  [optional] |



