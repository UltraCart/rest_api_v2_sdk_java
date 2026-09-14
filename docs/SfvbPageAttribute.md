

# SfvbPageAttribute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**deprecated** | **Boolean** | True when the active theme marks this attribute as on its way out.  Prefer not to build on it. |  [optional] |
|**name** | **String** | Attribute name, as the template&#39;s uc page-attribute directive spells it.  Compare case insensitively.  This is the value pageAttributeName refers to. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | What kind of attribute this is, taken from the template that declares it rather than from the stored row.  orphan means no template declares it.  reserved covers the page SEO fields. |  [optional] |
|**undeclared** | **Boolean** | True when no template references this name.  Writing such a name is allowed, but if you did not mean to create one this is a misspelling and nothing on the page will show it. |  [optional] |
|**usedBy** | **String** | The other themes that declare this attribute, when the active theme does not. |  [optional] |
|**usedByCurrentTheme** | **Boolean** | True when a template in the active theme declares this attribute. |  [optional] |
|**value** | **String** | The stored value.  Empty when a template declares the attribute and nothing has set it. |  [optional] |
|**writable** | **Boolean** | True when this API will change the value.  List, slider, item set, page collection and video list values are structured documents carrying their own translation references and derived data, so they are shown here but must be edited in the page editor. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| COLOR | &quot;color&quot; |
| RGBA | &quot;rgba&quot; |
| BOOLEAN | &quot;boolean&quot; |
| INTEGER | &quot;integer&quot; |
| HTML | &quot;html&quot; |
| ORPHAN | &quot;orphan&quot; |
| MULTILINE | &quot;multiline&quot; |
| RESERVED | &quot;reserved&quot; |
| ITEMSET | &quot;itemset&quot; |
| SLIDER | &quot;slider&quot; |
| SIMPLELIST | &quot;simplelist&quot; |
| DEFINITIONLIST | &quot;definitionlist&quot; |
| PAGECOLLECTION | &quot;pagecollection&quot; |
| FONT | &quot;font&quot; |
| VIDEOLIST | &quot;videolist&quot; |
| MAILINGLIST | &quot;mailinglist&quot; |



