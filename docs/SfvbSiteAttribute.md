

# SfvbSiteAttribute


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Attribute name, as a template&#39;s site attribute declaration spells it.  Compare case insensitively.  This is the value siteAttributeName refers to and the name $site.attr takes. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | What kind of attribute this is, taken from the template that declares it rather than from the stored row.  orphan means no template declares it.  reserved covers the settings the StoreFronts General screen owns. |  [optional] |
|**undeclared** | **Boolean** | True when no template declares this name and it is not a reserved setting.  A template can still read it with $site.attr, so this is not proof it is unused, but a name you did not mean to create is most likely a misspelling. |  [optional] |
|**usedBy** | **String** | The other themes that declare this attribute, when the active theme does not. |  [optional] |
|**usedByCurrentTheme** | **Boolean** | True when a template in the active theme declares this attribute. |  [optional] |
|**value** | **String** | The stored value, or the template default when nothing has set it. |  [optional] |
|**writable** | **Boolean** | True when this API will change the value.  List, video list, mailing list and item set values are structured documents and must be edited in the store admin.  Of the reserved settings only the title, the SEO description and keywords and the social account names are writable here. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STRING | &quot;string&quot; |
| MULTILINE | &quot;multiline&quot; |
| HTML | &quot;html&quot; |
| COLOR | &quot;color&quot; |
| RGBA | &quot;rgba&quot; |
| BOOLEAN | &quot;boolean&quot; |
| INTEGER | &quot;integer&quot; |
| ORPHAN | &quot;orphan&quot; |
| RESERVED | &quot;reserved&quot; |
| SIMPLELIST | &quot;simplelist&quot; |
| DEFINITIONLIST | &quot;definitionlist&quot; |
| VIDEOLIST | &quot;videolist&quot; |
| MAILINGLIST | &quot;mailinglist&quot; |
| ITEMSET | &quot;itemset&quot; |



