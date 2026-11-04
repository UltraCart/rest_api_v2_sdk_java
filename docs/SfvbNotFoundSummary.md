

# SfvbNotFoundSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**last24Hours** | **List&lt;Integer&gt;** | 404 hits per hour for the last 24 hours, oldest first. |  [optional] |
|**last30Days** | **List&lt;Integer&gt;** | 404 hits per day, oldest first, ending today in the server&#39;s time zone.  Bots and shoppers together. |  [optional] |
|**last7Days** | **List&lt;Integer&gt;** | 404 hits per day for the last 7 days, oldest first. |  [optional] |
|**newPaths** | [**List&lt;SfvbNotFoundEntry&gt;**](SfvbNotFoundEntry.md) | Up to 10 open paths first seen in the last 30 days, most hits first, leaving out paths only bots have hit. |  [optional] |
|**notes** | **List&lt;String&gt;** | What a person should know about reading these counts. |  [optional] |
|**total30Days** | **Integer** | The sum of last_30_days. |  [optional] |



