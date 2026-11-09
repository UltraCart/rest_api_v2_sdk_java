

# SfvbTrackingCheckPlan


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogVersion** | **Integer** | The tracking provider catalog version the plan was built from. |  [optional] |
|**consent** | **String** | The consent state the plan assumes.  none, all, or the granted categories in the order statistics, preferences, marketing.  Left out when the plan lists every gate instead. |  [optional] |
|**event** | [**EventEnum**](#EventEnum) | page_view, or purchase for a test order receipt. |  [optional] |
|**notes** | **List&lt;String&gt;** | What the plan assumes about the browser and the page. |  [optional] |
|**orderId** | **String** | The test order a purchase plan is for.  Left out for a page view. |  [optional] |
|**path** | **String** | The page path the plan is for, as given. |  [optional] |
|**planId** | **String** | The lowercase SHA-256 hex of the UTF-8 bytes of this response written as JSON without plan_id and snippet, with object keys sorted, no white space, and keys whose value is null left out, as JavaScript JSON.stringify writes values.  A results file carries it, so the CLI can tell which plan the results belong to. |  [optional] |
|**providers** | [**List&lt;SfvbTrackingCheckPlanProvider&gt;**](SfvbTrackingCheckPlanProvider.md) | One entry per provider the storefront turns on for this event, then one per host found in custom or affiliate network HTML. |  [optional] |
|**region** | [**RegionEnum**](#RegionEnum) | Where the browser is, which decides which gates apply.  eea, non-us or other.  Left out when the plan lists every gate instead. |  [optional] |
|**serverSide** | [**List&lt;SfvbTrackingCheckPlanServerSide&gt;**](SfvbTrackingCheckPlanServerSide.md) | What providers send from UltraCart servers for this event.  The browser never sees these, so they are reported as not checked. |  [optional] |
|**snippet** | **String** | The collector, the source of one JavaScript async arrow function.  Run it with addInitScript before the action so it starts before the page scripts, then run it again with evaluate after the action.  The second run waits for 3 seconds of quiet, or 15 seconds at most, and returns plan_id, page, collected_at, requests (url, initiator) and events (via, name, params).  URLs keep only the query params the plan names for that host, and events only the params the plan names.  It never reads cookies, storage or form fields and sends nothing anywhere. |  [optional] |
|**storefrontOid** | **Integer** | The storefront. |  [optional] |
|**unchecked** | [**List&lt;SfvbTrackingCheckPlanUnchecked&gt;**](SfvbTrackingCheckPlanUnchecked.md) | What the plan could not predict, and why. |  [optional] |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| PAGE_VIEW | &quot;page_view&quot; |
| PURCHASE | &quot;purchase&quot; |



## Enum: RegionEnum

| Name | Value |
|---- | -----|
| EEA | &quot;eea&quot; |
| NON_US | &quot;non-us&quot; |
| OTHER | &quot;other&quot; |



