

# SfvbPageMoveRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | True to run every check and report what would move, without moving anything or needing an approval. |  [optional] |
|**newPath** | **String** | Where the page goes, for example /lp/summer-sale/ or /sale/spring/.  Its parent page must exist, and nothing may be at this path yet. |  [optional] |
|**path** | **String** | The page to move, for example /lp/spring-sale/. |  [optional] |
|**redirectNote** | **String** | The note on that redirect rule.  Up to 500 characters.  A note naming the move is used when left out. |  [optional] |
|**redirectOldUrl** | [**RedirectOldUrlEnum**](#RedirectOldUrlEnum) | 301 to add one pattern redirect from the old path, sub-pages and items included, to the new one in the same call.  Leave it out to add none, and the old addresses answer 404. |  [optional] |



## Enum: RedirectOldUrlEnum

| Name | Value |
|---- | -----|
| _301 | &quot;301&quot; |



