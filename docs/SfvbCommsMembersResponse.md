

# SfvbCommsMembersResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerData** | **String** | masked, or shown when show_customer_data was sent. |  [optional] |
|**listUuid** | **String** | The list, for a list&#39;s members. |  [optional] |
|**members** | [**List&lt;SfvbCommsMember&gt;**](SfvbCommsMember.md) | This page of members. |  [optional] |
|**notes** | **List&lt;String&gt;** | What to keep in mind, such as how to handle customer data that is shown. |  [optional] |
|**page** | **Integer** | The page number, from 1. |  [optional] |
|**pageSize** | **Integer** | Members per page. |  [optional] |
|**rebuildRequired** | **Boolean** | For a segment, true while it is being rebuilt, so the members are from the last rebuild. |  [optional] |
|**segmentUuid** | **String** | The segment, for a segment&#39;s members. |  [optional] |
|**totalMembers** | **Integer** | How many members there are. |  [optional] |
|**totalPages** | **Integer** | How many pages there are. |  [optional] |



