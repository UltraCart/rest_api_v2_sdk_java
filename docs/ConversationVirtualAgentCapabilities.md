
# ConversationVirtualAgentCapabilities

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cancelSubscription** | **Boolean** |  |  [optional]
**delaySubscription** | **Boolean** |  |  [optional]
**lookupOrderInformation** | **Boolean** |  |  [optional]
**lookupSubscriptionInformation** | **Boolean** |  |  [optional]
**openSupportTicket** | **Boolean** |  |  [optional]
**openSupportTicketChannel** | [**OpenSupportTicketChannelEnum**](#OpenSupportTicketChannelEnum) | Channel to use to open the support ticket |  [optional]
**openSupportTicketChannelEmail** | **String** | Email to send support ticket to |  [optional]
**pauseSubscription** | **Boolean** |  |  [optional]
**resumeSubscription** | **Boolean** |  |  [optional]
**transferChatToLiveAgent** | **Boolean** |  |  [optional]
**updateSubscriptionCreditCard** | **Boolean** |  |  [optional]


<a name="OpenSupportTicketChannelEnum"></a>
## Enum: OpenSupportTicketChannelEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
EMAIL | &quot;email&quot;
ULTRACART_TASK | &quot;UltraCart Task&quot;
ZOHO_DESK_TICKET | &quot;Zoho Desk Ticket&quot;



