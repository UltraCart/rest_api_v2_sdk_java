

# SfvbPageSelectors


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blogPostSelectors** | [**List&lt;SfvbPageBlogPostSelector&gt;**](SfvbPageBlogPostSelector.md) | The conditions that choose the page&#39;s blog posts. |  [optional] |
|**itemSelectors** | [**List&lt;SfvbPageItemSelector&gt;**](SfvbPageItemSelector.md) | The conditions that choose the page&#39;s items.  While there are any, the page&#39;s items are recalculated from them and cannot be assigned by hand. |  [optional] |
|**matchAllBlogPostSelectors** | **Boolean** | True when a blog post must meet every blog post selector, false when any one is enough. |  [optional] |
|**matchAllItemSelectors** | **Boolean** | True when an item must meet every item selector, false when meeting any one is enough. |  [optional] |
|**path** | **String** | The page path.  Read only. |  [optional] |



