

# ConversationVirtualAgentCapabilities


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessStorefrontAndItem** | **Boolean** | Permission flag to allow this Agent access to the storefront and item information. |  [optional] |
|**cancelSubscription** | **Boolean** |  |  [optional] |
|**delaySubscription** | **Boolean** |  |  [optional] |
|**lookupOrderInformation** | **Boolean** |  |  [optional] |
|**lookupSubscriptionInformation** | **Boolean** |  |  [optional] |
|**openSupportTicket** | **Boolean** |  |  [optional] |
|**openSupportTicketChannel** | [**OpenSupportTicketChannelEnum**](#OpenSupportTicketChannelEnum) | Channel to use to open the support ticket |  [optional] |
|**openSupportTicketChannelEmail** | **String** | Email to send support ticket to |  [optional] |
|**openSupportTicketZohoDeskDepartmentId** | **String** | Department ID to open a Zoho Desk ticket for |  [optional] |
|**pauseSubscription** | **Boolean** |  |  [optional] |
|**resumeSubscription** | **Boolean** |  |  [optional] |
|**transferChatToLiveAgent** | **Boolean** |  |  [optional] |
|**updateSubscriptionCreditCard** | **Boolean** |  |  [optional] |
|**zohoDeskAvailable** | **Boolean** | True if Zoho Desk is connected to UltraCart |  [optional] |
|**zohoDeskDepartments** | [**List&lt;ConversationVirtualAgentCapabilityZohoDeskDepartment&gt;**](ConversationVirtualAgentCapabilityZohoDeskDepartment.md) | Array of Zoho Desk Department if zoho desk is connected to UltraCart |  [optional] |



## Enum: OpenSupportTicketChannelEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| EMAIL | &quot;email&quot; |
| ULTRACART_TASK | &quot;ultracart_task&quot; |
| ZOHO_DESK_TICKET | &quot;zoho_desk_ticket&quot; |



