

# EmailSegment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowCsvDownload** | **Boolean** | True if the current user has the rights to download this segment. |  [optional] |
|**allowFacebookAudiences** | **Boolean** | True if this StoreFront has the Facebook Analytics app connected and supports them |  [optional] |
|**createdDts** | **String** | Created date |  [optional] |
|**deleted** | **Boolean** | True if this campaign was deleted |  [optional] |
|**emailSegmentUuid** | **String** | Email segment UUID |  [optional] |
|**espListSegmentFolderUuid** | **String** | List/Segment folder UUID |  [optional] |
|**facebookCustomAudience** | **Boolean** | True if you want to sync to a facebook custom audience |  [optional] |
|**filterProfileEquationJson** | **String** | File profile equation json |  [optional] |
|**memberCount** | **Integer** | Count of members in this segment |  [optional] |
|**merchantId** | **String** | Merchant ID |  [optional] |
|**name** | **String** | Name of email segment |  [optional] |
|**rankJson** | **String** | Rank settings json |  [optional] |
|**rebuildRequired** | **Boolean** | True if a rebuild is required because some part of the segment has changed |  [optional] |
|**storefrontOid** | **Integer** | Storefront oid |  [optional] |
|**thirdpartyJoinAddTags** | **List&lt;String&gt;** | Third party provider tags to add when a customer joins the segment. |  [optional] |
|**thirdpartyJoinRemoveTags** | **List&lt;String&gt;** | Third party provider tags to remove when a customer joins the segment. |  [optional] |
|**thirdpartyLeaveAddTags** | **List&lt;String&gt;** | Third party provider tags to add when a customer leaves the segment. |  [optional] |
|**thirdpartyLeaveRemoveTags** | **List&lt;String&gt;** | Third party provider tags to remove when a customer leaves the segment. |  [optional] |
|**thirdpartyListId** | **String** | List id of third party provider to sync with. |  [optional] |
|**thirdpartyProviderName** | **String** | Name of third party provider to sync segment to a list with. |  [optional] |
|**usedBy** | [**List&lt;EmailListSegmentUsedBy&gt;**](EmailListSegmentUsedBy.md) | Details on the flows or campaigns that use this list. |  [optional] |



