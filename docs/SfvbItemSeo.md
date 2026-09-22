

# SfvbItemSeo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | storefrontSEODescription as stored on this item.  Empty when it has never been set. |  [optional] |
|**descriptionSource** | [**DescriptionSourceEnum**](#DescriptionSourceEnum) | Where effective_description comes from. |  [optional] |
|**effectiveDescription** | **String** | What the meta description renders as, after the item to page to site fallback. |  [optional] |
|**effectiveKeywords** | **String** | What the meta keywords render as, after the item to page to site fallback. |  [optional] |
|**effectiveTitle** | **String** | What the document title renders as. |  [optional] |
|**keywords** | **String** | storefrontSEOKeywords as stored on this item.  Empty when it has never been set. |  [optional] |
|**keywordsSource** | [**KeywordsSourceEnum**](#KeywordsSourceEnum) | Where effective_keywords comes from. |  [optional] |
|**title** | **String** | storefrontSEOTitle as stored on this item.  Empty when it has never been set. |  [optional] |
|**titleSource** | [**TitleSourceEnum**](#TitleSourceEnum) | Where effective_title comes from.  item_description means nothing is set here and the item&#39;s own description is being used. |  [optional] |



## Enum: DescriptionSourceEnum

| Name | Value |
|---- | -----|
| ITEM | &quot;item&quot; |
| GROUP | &quot;group&quot; |
| SITE | &quot;site&quot; |
| NONE | &quot;none&quot; |



## Enum: KeywordsSourceEnum

| Name | Value |
|---- | -----|
| ITEM | &quot;item&quot; |
| GROUP | &quot;group&quot; |
| SITE | &quot;site&quot; |
| NONE | &quot;none&quot; |



## Enum: TitleSourceEnum

| Name | Value |
|---- | -----|
| ITEM | &quot;item&quot; |
| ITEM_DESCRIPTION | &quot;item_description&quot; |
| NONE | &quot;none&quot; |



