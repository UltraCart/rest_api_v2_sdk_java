

# SfvbTrackingCheckPlanEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The event name or command. |  [optional] |
|**params** | **Object** | Params the call must carry, as text.  A star means present with any value. |  [optional] |
|**via** | [**ViaEnum**](#ViaEnum) | dataLayer, gtag or fbq. |  [optional] |



## Enum: ViaEnum

| Name | Value |
|---- | -----|
| DATALAYER | &quot;dataLayer&quot; |
| GTAG | &quot;gtag&quot; |
| FBQ | &quot;fbq&quot; |



