

# SfvbFilesContentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | [**List&lt;SfvbFileContentResult&gt;**](SfvbFileContentResult.md) | One entry per path read, in the order asked. |  [optional] |
|**remainingPaths** | **List&lt;String&gt;** | Paths not read because the response reached its size limit, in the order asked.  Send them again to read them.  Omitted when every path was read. |  [optional] |



