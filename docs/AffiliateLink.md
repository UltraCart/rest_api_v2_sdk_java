

# AffiliateLink


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliateLinkOid** | **Integer** | Unique object identifier associated with this link |  [optional] |
|**affiliateManagedLinkOid** | **Integer** | Managed link OID that this link object was generated from |  [optional] |
|**affiliateOid** | **Integer** | Affiliate object ID associated with this link |  [optional] |
|**affiliateProgramItemOid** | **Integer** | The affiliate program item this managed link is associated with |  [optional] |
|**code** | **String** | Code associated with the link |  [optional] |
|**creativeOid** | **Integer** | Creative (image or text) associated with this link |  [optional] |
|**customHtml** | **String** | Custom HTML associated with this link |  [optional] |
|**customHtmlApprovalStatus** | [**CustomHtmlApprovalStatusEnum**](#CustomHtmlApprovalStatusEnum) | Approved status of the custom html |  [optional] |
|**customLandingUrl** | **String** | Custom landing page URL if configured |  [optional] |
|**deleted** | **Boolean** | True if the link has been deleted |  [optional] |
|**invisibleLinkApprovalStatus** | [**InvisibleLinkApprovalStatusEnum**](#InvisibleLinkApprovalStatusEnum) | Invisible link approval status |  [optional] |
|**invisibleLinkUrlPrefix** | **String** | Invisible link URL prefix |  [optional] |
|**name** | **String** | Name of the link |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of link |  [optional] |



## Enum: CustomHtmlApprovalStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| APPROVED | &quot;Approved&quot; |
| REJECTED | &quot;Rejected&quot; |



## Enum: InvisibleLinkApprovalStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;Pending&quot; |
| APPROVED | &quot;Approved&quot; |
| REJECTED | &quot;Rejected&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;image&quot; |
| TEXT | &quot;text&quot; |
| INVISIBLE | &quot;invisible&quot; |
| DIRECT | &quot;direct&quot; |



