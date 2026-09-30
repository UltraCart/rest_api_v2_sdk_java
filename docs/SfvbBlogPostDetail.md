

# SfvbBlogPostDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowComments** | **Boolean** | Whether shoppers may comment. |  [optional] |
|**author** | **String** | The post author. |  [optional] |
|**blogPostOid** | **Integer** | The blog post&#39;s oid.  This is what a page&#39;s blog post assignment names. |  [optional] |
|**body** | **String** | The post body as HTML, exactly as stored. |  [optional] |
|**createdDts** | **String** | When the post was created (ISO 8601, UTC). |  [optional] |
|**excerpt** | **String** | The post excerpt as HTML, exactly as stored. |  [optional] |
|**images** | [**List&lt;SfvbBlogPostImage&gt;**](SfvbBlogPostImage.md) | The post&#39;s images, the default image first. |  [optional] |
|**lastModifiedDts** | **String** | When the post was last changed (ISO 8601, UTC), or null if it never was. |  [optional] |
|**publicationDts** | **String** | When the post is published (ISO 8601, UTC), or null for a draft. |  [optional] |
|**tags** | **List&lt;String&gt;** | The post&#39;s tags. |  [optional] |
|**title** | **String** | The post title. |  [optional] |
|**unassigned** | **Boolean** | True when no page shows this post yet. |  [optional] |
|**urlPart** | **String** | The post&#39;s name in its URL. |  [optional] |
|**viewUrl** | **String** | The post&#39;s address on the storefront, or null until a page shows it. |  [optional] |
|**visibility** | **String** | P public, L logged in customers only, D draft. |  [optional] |



