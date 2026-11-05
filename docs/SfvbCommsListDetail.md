

# SfvbCommsListDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdDts** | **String** | When the list was created. |  [optional] |
|**folderUuid** | **String** | The list and segment folder it is filed in, or none. |  [optional] |
|**hashSha256** | **String** | The hash of the name, folder and public settings.  Send it as If-Match to change or archive the list. |  [optional] |
|**listUuid** | **String** | The list uuid. |  [optional] |
|**memberCount** | **Integer** | How many customers are on the list. |  [optional] |
|**name** | **String** | The list name. |  [optional] |
|**publicDescription** | **String** | The description subscribers see for a public list. |  [optional] |
|**publicList** | **Boolean** | True when subscribers can choose this list on the storefront&#39;s email preferences page. |  [optional] |
|**usedBy** | [**List&lt;SfvbCommsSegmentUsedBy&gt;**](SfvbCommsSegmentUsedBy.md) | The campaigns that send to the list and the flows it starts, each with whether it is live. |  [optional] |



