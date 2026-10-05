

# SfvbLibraryEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bookmarked** | **Boolean** | True when the calling user has bookmarked this entry. |  [optional] |
|**cjson** | **String** | The fragment&#39;s CJSON.  Omitted from search results to keep them terse; fetch a single entry to get it. |  [optional] |
|**contentManifest** | [**SfvbLibraryContentManifest**](SfvbLibraryContentManifest.md) |  |  [optional] |
|**description** | **String** | What this fragment is for. |  [optional] |
|**hashSha256** | **String** | Hash of the draft&#39;s writable fields.  Send it back as If-Match to update, delete or publish.  Present only for the owner. |  [optional] |
|**lastModifiedDts** | **String** | When the draft was last saved, ISO 8601. |  [optional] |
|**libraryOid** | **Integer** | Library entry oid. |  [optional] |
|**name** | **String** | Entry name. |  [optional] |
|**owned** | **Boolean** | True when the calling user owns this entry. |  [optional] |
|**parameters** | [**List&lt;SfvbLibraryParameter&gt;**](SfvbLibraryParameter.md) | Named values the fragment expects the installer to supply. |  [optional] |
|**publishedRevisionNumber** | **Integer** | The latest published revision, or null when the entry has never been published. |  [optional] |
|**referencedFiles** | **List&lt;String&gt;** | Storefront file paths this fragment references.  Installing the fragment copies them into the storefront; reading it does not. |  [optional] |
|**retired** | **Boolean** | True when the owner deleted an entry that had been published or installed.  It is kept so existing installs still resolve, and it leaves search. |  [optional] |
|**revisionNumber** | **Integer** | The revision returned.  For the owner this is the draft, which every save increments.  For anyone else it is the published revision. |  [optional] |
|**screenshotHeight** | **Integer** | Screenshot height in pixels. |  [optional] |
|**screenshotKey** | **String** | S3 listing key for the large screenshot, when one has been generated. |  [optional] |
|**screenshotSha256** | **String** | Hash of the uploaded screenshot. |  [optional] |
|**screenshotStale** | **Boolean** | True on an update that changed the fragment of an entry with a screenshot.  Retake it and set it again with the library screenshot endpoint. |  [optional] |
|**screenshotWidth** | **Integer** | Screenshot width in pixels. |  [optional] |
|**shareWithAccount** | **Boolean** | True when the entry is shared across the merchant account. |  [optional] |
|**sharedWith** | [**List&lt;SfvbLibraryShareTarget&gt;**](SfvbLibraryShareTarget.md) | Linked accounts the entry is shared with.  Present only for the owner. |  [optional] |
|**taxonomy** | [**SfvbLibraryTaxonomy**](SfvbLibraryTaxonomy.md) |  |  [optional] |
|**thumbnailKey** | **String** | S3 listing key for the medium thumbnail, when one has been generated.  Thumbnails are produced asynchronously and can lag a save by a minute or two. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | private, shared or public. |  [optional] |
|**widgetType** | **String** | Element type at the root of the fragment. |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC | &quot;public&quot; |



