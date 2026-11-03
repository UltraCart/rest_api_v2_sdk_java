

# SfvbTrackingPrivacy


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**anonymizeIp** | [**AnonymizeIpEnum**](#AnonymizeIpEnum) | Which shoppers have their IP address anonymized on the cart and order.  all, eea, non_us, or null for nobody. |  [optional] |
|**defaultMailingListOff** | [**DefaultMailingListOffEnum**](#DefaultMailingListOffEnum) | Which shoppers start checkout with the mailing list sign-up unchecked.  all, eea, non_us, or null for nobody. |  [optional] |
|**disableReturnEmail** | [**DisableReturnEmailEnum**](#DisableReturnEmailEnum) | Which shoppers are left out of the return email (the admin&#39;s Disable Return Email rule).  all, eea, non_us, or null for nobody. |  [optional] |
|**excludePurchaseBubbleHistory** | [**ExcludePurchaseBubbleHistoryEnum**](#ExcludePurchaseBubbleHistoryEnum) | Which shoppers&#39; purchases are left out of the purchase bubble history.  all, eea, non_us, or null for nobody. |  [optional] |
|**hashSha256** | **String** | The hash of these five rules.  Send it as If-Match when changing them. |  [optional] |
|**showCookieNotice** | [**ShowCookieNoticeEnum**](#ShowCookieNoticeEnum) | Which shoppers see the privacy and cookie notice.  all, eea (shoppers in the European Economic Area), non_us, or null for nobody. |  [optional] |



## Enum: AnonymizeIpEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| EEA | &quot;eea&quot; |
| NON_US | &quot;non_us&quot; |



## Enum: DefaultMailingListOffEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| EEA | &quot;eea&quot; |
| NON_US | &quot;non_us&quot; |



## Enum: DisableReturnEmailEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| EEA | &quot;eea&quot; |
| NON_US | &quot;non_us&quot; |



## Enum: ExcludePurchaseBubbleHistoryEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| EEA | &quot;eea&quot; |
| NON_US | &quot;non_us&quot; |



## Enum: ShowCookieNoticeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| EEA | &quot;eea&quot; |
| NON_US | &quot;non_us&quot; |



