

# BulkJob


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**completedAt** | **String** | When the job reached a terminal status |  [optional] |
|**duplicateCount** | **Integer** | Records short-circuited as duplicates |  [optional] |
|**errorCode** | **String** | Job-level failure code when status is failed |  [optional] |
|**failCount** | **Integer** | Records that failed |  [optional] |
|**jobId** | **String** | Public-facing job id (uc-bulk-&lt;ulid&gt;) |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Object type this job processes |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Mutation mode this job runs (the bulk surface is write-only) |  [optional] |
|**processedRecords** | **Integer** | Records processed so far |  [optional] |
|**queuePosition** | **Integer** | Position behind the merchant&#39;s active job (queued jobs only) |  [optional] |
|**resultsSummaryUrl** | **String** | Presigned S3 URL to the full per-record results NDJSON (set when finished) |  [optional] |
|**startedAt** | **String** | When the worker started the job |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Job status |  [optional] |
|**submittedAt** | **String** | When the job was submitted |  [optional] |
|**successCount** | **Integer** | Records that landed |  [optional] |
|**totalRecords** | **Integer** | Total records counted on the first pass (null until counted) |  [optional] |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;order&quot; |
| CUSTOMER | &quot;customer&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| INSERT | &quot;insert&quot; |
| UPSERT | &quot;upsert&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| SUCCEEDED | &quot;succeeded&quot; |
| PARTIAL_SUCCESS | &quot;partial_success&quot; |
| FAILED | &quot;failed&quot; |
| CANCELLED | &quot;cancelled&quot; |



