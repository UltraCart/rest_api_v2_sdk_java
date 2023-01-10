

# ConversationEngagementEquationFunction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anyPageUrlLogic** | [**AnyPageUrlLogicEnum**](#AnyPageUrlLogicEnum) | Logic operation to perform on an any page url function type |  [optional] |
|**anyPageUrlValue** | **String** |  |  [optional] |
|**currentPageUrlLogic** | [**CurrentPageUrlLogicEnum**](#CurrentPageUrlLogicEnum) | Logic operation to perform on a current page url function type |  [optional] |
|**currentPageUrlValue** | **String** |  |  [optional] |
|**customersBrowsingTimeLogic** | [**CustomersBrowsingTimeLogicEnum**](#CustomersBrowsingTimeLogicEnum) | Logic operation to perform on a customer&#39;s browsing time function type |  [optional] |
|**customersBrowsingTimeSeconds** | **Integer** |  |  [optional] |
|**customersLocationCountry** | **String** |  |  [optional] |
|**customersLocationLogic** | [**CustomersLocationLogicEnum**](#CustomersLocationLogicEnum) | Logic operation to perform on a customer&#39;s location function type |  [optional] |
|**customersLocationState** | **String** |  |  [optional] |
|**numberOfViewedPagesLogic** | [**NumberOfViewedPagesLogicEnum**](#NumberOfViewedPagesLogicEnum) | Logic operation to perform on a customer&#39;s browsing time function type |  [optional] |
|**numberOfViewedPagesValue** | **Integer** |  |  [optional] |
|**referringWebsiteLogic** | [**ReferringWebsiteLogicEnum**](#ReferringWebsiteLogicEnum) | Logic operation to perform on a referring website function type |  [optional] |
|**referringWebsiteValue** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of function |  [optional] |



## Enum: AnyPageUrlLogicEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;contains&quot; |
| DOES_NOT_CONTAIN | &quot;does not contain&quot; |
| IS_EXACTLY | &quot;is exactly&quot; |
| IS_NOT | &quot;is not&quot; |



## Enum: CurrentPageUrlLogicEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;contains&quot; |
| DOES_NOT_CONTAIN | &quot;does not contain&quot; |
| IS_EXACTLY | &quot;is exactly&quot; |
| IS_NOT | &quot;is not&quot; |



## Enum: CustomersBrowsingTimeLogicEnum

| Name | Value |
|---- | -----|
| AT_LEAST | &quot;is at least&quot; |
| MORE_THAN | &quot;is more than&quot; |
| LESS_THAN | &quot;is less than&quot; |
| AT_MOST | &quot;is at most&quot; |



## Enum: CustomersLocationLogicEnum

| Name | Value |
|---- | -----|
| IS | &quot;is&quot; |
| IS_NOT | &quot;is not&quot; |



## Enum: NumberOfViewedPagesLogicEnum

| Name | Value |
|---- | -----|
| AT_LEAST | &quot;is at least&quot; |
| MORE_THAN | &quot;is more than&quot; |
| LESS_THAN | &quot;is less than&quot; |
| AT_MOST | &quot;is at most&quot; |



## Enum: ReferringWebsiteLogicEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;contains&quot; |
| DOES_NOT_CONTAIN | &quot;does not contain&quot; |
| IS_EXACTLY | &quot;is exactly&quot; |
| IS_NOT | &quot;is not&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CURRENT_PAGE_URL | &quot;current page url&quot; |
| CUSTOMERS_LOCATION | &quot;customers location&quot; |
| CUSTOMERS_BROWSING_TIME | &quot;customers browsing time&quot; |
| NUMBER_OF_VIEWED_PAGES | &quot;number of viewed pages&quot; |
| REFERRING_WEBSITE_ADDRESS | &quot;referring website address&quot; |
| ANY_PAGE_FROM_SESSION | &quot;any page from session&quot; |



