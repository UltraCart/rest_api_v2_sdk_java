# ConversationApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgentProfileKnowledgeBaseDocument**](ConversationApi.md#deleteAgentProfileKnowledgeBaseDocument) | **DELETE** /conversation/agent/profiles/{user_id}/knowledge_base/{document_uuid} | Delete a knowledge base document
[**deleteAgentProfileMcp**](ConversationApi.md#deleteAgentProfileMcp) | **DELETE** /conversation/agent/profiles/{user_id}/mcps/{mcp_server_uuid} | Delete an agent MCP server
[**deleteConversationCannedMessage**](ConversationApi.md#deleteConversationCannedMessage) | **DELETE** /conversation/canned_messages/{conversation_canned_message_oid} | Delete a conversation canned message
[**deleteDepartment**](ConversationApi.md#deleteDepartment) | **DELETE** /conversation/departments/{conversation_department_oid} | Delete a conversation department
[**deleteEngagement**](ConversationApi.md#deleteEngagement) | **DELETE** /conversation/engagements/{conversation_engagement_oid} | Delete a conversation engagement
[**deletePbxAddress**](ConversationApi.md#deletePbxAddress) | **DELETE** /conversation/pbx/address/{conversationPbxAddressUuid} | Delete pbx address
[**deletePbxAgentVoicemail**](ConversationApi.md#deletePbxAgentVoicemail) | **DELETE** /conversation/pbx/agent/voicemails/{recording_sid} | Delete Agent Voicemail
[**deletePbxAudio**](ConversationApi.md#deletePbxAudio) | **DELETE** /conversation/pbx/audio/{conversationPbxAudioUuid} | Delete pbx audio
[**deletePbxClassOfService**](ConversationApi.md#deletePbxClassOfService) | **DELETE** /conversation/pbx/class_of_service/{classOfServiceUuid} | Delete pbx class of service
[**deletePbxHardwarePhone**](ConversationApi.md#deletePbxHardwarePhone) | **DELETE** /conversation/pbx/hardware_phone/{conversationPbxHardwarePhoneUuid} | Delete pbx hardware phone
[**deletePbxMenu**](ConversationApi.md#deletePbxMenu) | **DELETE** /conversation/pbx/menu/{conversationPbxMenuUuid} | Delete pbx menu
[**deletePbxPhoneNumber**](ConversationApi.md#deletePbxPhoneNumber) | **DELETE** /conversation/pbx/phone_number/{conversationPbxPhoneNumberUuid} | Delete pbx phoneNumber
[**deletePbxQueue**](ConversationApi.md#deletePbxQueue) | **DELETE** /conversation/pbx/queue/{conversationPbxQueueUuid} | Delete pbx queue
[**deletePbxQueueVoicemail**](ConversationApi.md#deletePbxQueueVoicemail) | **DELETE** /conversation/pbx/queues/{queue_uuid}/voicemails/{recording_sid} | Delete Queue Voicemail
[**deletePbxTimeBased**](ConversationApi.md#deletePbxTimeBased) | **DELETE** /conversation/pbx/time_based/{conversationPbxTimeBasedUuid} | Delete pbx timeBased
[**deletePbxTimeRange**](ConversationApi.md#deletePbxTimeRange) | **DELETE** /conversation/pbx/time_range/{conversationPbxTimeRangeUuid} | Delete pbx timeRange
[**deletePbxVoicemailMailbox**](ConversationApi.md#deletePbxVoicemailMailbox) | **DELETE** /conversation/pbx/voicemail_mailbox/{conversationPbxVoicemailMailboxUuid} | Delete pbx voicemailMailbox
[**getAgentKeepAlive**](ConversationApi.md#getAgentKeepAlive) | **GET** /conversation/agent/keepalive | Agent keep alive
[**getAgentProfile**](ConversationApi.md#getAgentProfile) | **GET** /conversation/agent/profile | Get agent profile
[**getAgentProfileKnowledgeBase**](ConversationApi.md#getAgentProfileKnowledgeBase) | **GET** /conversation/agent/profiles/{user_id}/knowledge_base | Get the list of knowledge base documents associated with this agent profile
[**getAgentProfileMcp**](ConversationApi.md#getAgentProfileMcp) | **GET** /conversation/agent/profiles/{user_id}/mcps/{mcp_server_uuid} | Get an MCP server associated with this agent
[**getAgentProfileMcpTools**](ConversationApi.md#getAgentProfileMcpTools) | **GET** /conversation/agent/profiles/{user_id}/mcps/{mcp_server_uuid}/tools | Get the tools available from the MCP server
[**getAgentProfileMcps**](ConversationApi.md#getAgentProfileMcps) | **GET** /conversation/agent/profiles/{user_id}/mcps | Get the list of MCP servers associated with this agent
[**getAgentProfiles**](ConversationApi.md#getAgentProfiles) | **GET** /conversation/agent/profiles | Get agent profiles
[**getAgentWebsocketAuthorization**](ConversationApi.md#getAgentWebsocketAuthorization) | **PUT** /conversation/agent/auth | Get agent websocket authorization
[**getConversation**](ConversationApi.md#getConversation) | **GET** /conversation/conversations/{conversation_uuid} | Retrieve a conversation
[**getConversationCannedMessages**](ConversationApi.md#getConversationCannedMessages) | **GET** /conversation/canned_messages | Retrieve a list of canned messages ordered by short_code
[**getConversationContext**](ConversationApi.md#getConversationContext) | **PUT** /conversation/conversations/{conversation_uuid}/context | Get a webchat conversation context
[**getConversationDepartmentMemberList**](ConversationApi.md#getConversationDepartmentMemberList) | **GET** /conversation/department_members | Retrieve a list of possible department members
[**getConversationDepartments**](ConversationApi.md#getConversationDepartments) | **GET** /conversation/departments | Retrieve a list of departments ordered by name
[**getConversationEngagement**](ConversationApi.md#getConversationEngagement) | **GET** /conversation/engagements/{conversation_engagement_oid} | Retrieve an engagement
[**getConversationEngagements**](ConversationApi.md#getConversationEngagements) | **GET** /conversation/engagements | Retrieve a list of engagements ordered by name
[**getConversationKnowledgeBaseDocumentUploadUrl**](ConversationApi.md#getConversationKnowledgeBaseDocumentUploadUrl) | **GET** /conversation/agent/profiles/{user_id}/knowledge_base/upload_url/{extension} | Get a pre-signed conversation knowledge base document upload URL
[**getConversationMessages**](ConversationApi.md#getConversationMessages) | **GET** /conversation/conversations/{conversation_uuid}/messages/{since} | Retrieve conversation messages
[**getConversationMultimediaUploadUrl**](ConversationApi.md#getConversationMultimediaUploadUrl) | **GET** /conversation/upload_url/{extension} | Get a presigned conversation multimedia upload URL
[**getConversationPbxAudioUploadUrl**](ConversationApi.md#getConversationPbxAudioUploadUrl) | **GET** /conversation/pbx/audio/upload_url/{extension} | Get a pre-signed conversation multimedia upload URL
[**getConversationPbxCustomerSnapshot**](ConversationApi.md#getConversationPbxCustomerSnapshot) | **POST** /conversation/pbx/customer_snapshot | Get orders and customer information for a phone number
[**getConversationPermissions**](ConversationApi.md#getConversationPermissions) | **GET** /conversation/permissions | Retrieve conversation permissions
[**getConversationWebchatQueueStatuses**](ConversationApi.md#getConversationWebchatQueueStatuses) | **GET** /conversation/conversations/queues/statuses | Retrieve a conversation webchat queue statuses
[**getConversations**](ConversationApi.md#getConversations) | **GET** /conversation/conversations | Retrieve a list of conversation summaries newest to oldest
[**getConversationsAutocomplete**](ConversationApi.md#getConversationsAutocomplete) | **POST** /conversation/conversations/autocomplete | Retrieve a list of matching terms for a search field
[**getConversationsSearch**](ConversationApi.md#getConversationsSearch) | **POST** /conversation/conversations/search | Search conversations
[**getLocationsForEngagement**](ConversationApi.md#getLocationsForEngagement) | **POST** /conversation/locations | Get location data for engagement configuration
[**getPbxAddress**](ConversationApi.md#getPbxAddress) | **GET** /conversation/pbx/address/{conversationPbxAddressUuid} | Get pbx address
[**getPbxAddresses**](ConversationApi.md#getPbxAddresses) | **GET** /conversation/pbx/address | Get pbx addresses
[**getPbxAgent**](ConversationApi.md#getPbxAgent) | **GET** /conversation/pbx/agent/{conversationPbxAgentUuid} | Get pbx agent
[**getPbxAgentVoicemail**](ConversationApi.md#getPbxAgentVoicemail) | **GET** /conversation/pbx/agent/voicemails/{recording_sid} | Get Agent Voicemail
[**getPbxAgentVoicemails**](ConversationApi.md#getPbxAgentVoicemails) | **GET** /conversation/pbx/agent/voicemails | Get Agent Voicemails
[**getPbxAgents**](ConversationApi.md#getPbxAgents) | **GET** /conversation/pbx/agent | Get pbx agents
[**getPbxAudio**](ConversationApi.md#getPbxAudio) | **GET** /conversation/pbx/audio/{conversationPbxAudioUuid} | Get pbx audio
[**getPbxAudioUsage**](ConversationApi.md#getPbxAudioUsage) | **GET** /conversation/pbx/audio/{conversationPbxAudioUuid}/usage | Get pbx audio usage
[**getPbxAudios**](ConversationApi.md#getPbxAudios) | **GET** /conversation/pbx/audio | Get pbx audios
[**getPbxCall**](ConversationApi.md#getPbxCall) | **GET** /conversation/pbx/call/{callUuid} | Get pbx call record
[**getPbxClassOfService**](ConversationApi.md#getPbxClassOfService) | **GET** /conversation/pbx/class_of_service/{classOfServiceUuid} | Get pbx class of service
[**getPbxClassesOfService**](ConversationApi.md#getPbxClassesOfService) | **GET** /conversation/pbx/class_of_service | Get pbx classes of service
[**getPbxCosAuditLogs**](ConversationApi.md#getPbxCosAuditLogs) | **GET** /conversation/pbx/class_of_service/audit_log | Get pbx class of service audit logs
[**getPbxHardwarePhone**](ConversationApi.md#getPbxHardwarePhone) | **GET** /conversation/pbx/hardware_phone/{conversationPbxHardwarePhoneUuid} | Get pbx hardware phone
[**getPbxHardwarePhoneManufacturers**](ConversationApi.md#getPbxHardwarePhoneManufacturers) | **GET** /conversation/pbx/hardware_phone/manufacturers | Get pbx hardware phone manufacturers
[**getPbxHardwarePhones**](ConversationApi.md#getPbxHardwarePhones) | **GET** /conversation/pbx/hardware_phone | Get pbx hardware phones
[**getPbxMenu**](ConversationApi.md#getPbxMenu) | **GET** /conversation/pbx/menu/{conversationPbxMenuUuid} | Get pbx menu
[**getPbxMenus**](ConversationApi.md#getPbxMenus) | **GET** /conversation/pbx/menu | Get pbx menus
[**getPbxPhoneNumber**](ConversationApi.md#getPbxPhoneNumber) | **GET** /conversation/pbx/phone_number/{conversationPbxPhoneNumberUuid} | Get pbx phoneNumber
[**getPbxPhoneNumbers**](ConversationApi.md#getPbxPhoneNumbers) | **GET** /conversation/pbx/phone_number | Get pbx phoneNumbers
[**getPbxQueue**](ConversationApi.md#getPbxQueue) | **GET** /conversation/pbx/queue/{conversationPbxQueueUuid} | Get pbx queue
[**getPbxQueueVoicemail**](ConversationApi.md#getPbxQueueVoicemail) | **GET** /conversation/pbx/queues/{queue_uuid}/voicemails/{recording_sid} | Get Queue Voicemail
[**getPbxQueueVoicemails**](ConversationApi.md#getPbxQueueVoicemails) | **GET** /conversation/pbx/queues/{queue_uuid}/voicemails | Get Queue Voicemails
[**getPbxQueues**](ConversationApi.md#getPbxQueues) | **GET** /conversation/pbx/queue | Get pbx queues
[**getPbxTimeBased**](ConversationApi.md#getPbxTimeBased) | **GET** /conversation/pbx/time_based/{conversationPbxTimeBasedUuid} | Get pbx timeBased
[**getPbxTimeBaseds**](ConversationApi.md#getPbxTimeBaseds) | **GET** /conversation/pbx/time_based | Get pbx timeBaseds
[**getPbxTimeRange**](ConversationApi.md#getPbxTimeRange) | **GET** /conversation/pbx/time_range/{conversationPbxTimeRangeUuid} | Get pbx timeRange
[**getPbxTimeRanges**](ConversationApi.md#getPbxTimeRanges) | **GET** /conversation/pbx/time_range | Get pbx timeRanges
[**getPbxVoicemailMailbox**](ConversationApi.md#getPbxVoicemailMailbox) | **GET** /conversation/pbx/voicemail_mailbox/{conversationPbxVoicemailMailboxUuid} | Get pbx voicemailMailbox
[**getPbxVoicemailMailboxes**](ConversationApi.md#getPbxVoicemailMailboxes) | **GET** /conversation/pbx/voicemail_mailbox | Get pbx voicemailMailboxes
[**getVirtualAgentBudget**](ConversationApi.md#getVirtualAgentBudget) | **GET** /conversation/virtualagent/budget | Get virtual agent budget
[**getVirtualAgentCapabilities**](ConversationApi.md#getVirtualAgentCapabilities) | **GET** /conversation/virtualagent/capabilities | Get virtual agent capabilities
[**insertAgentProfileKnowledgeBaseDocument**](ConversationApi.md#insertAgentProfileKnowledgeBaseDocument) | **POST** /conversation/agent/profiles/{user_id}/knowledge_base | Insert a knowledge base document
[**insertAgentProfileMcp**](ConversationApi.md#insertAgentProfileMcp) | **POST** /conversation/agent/profiles/{user_id}/mcps | Insert an agent MCP server
[**insertConversationCannedMessage**](ConversationApi.md#insertConversationCannedMessage) | **POST** /conversation/canned_messages | Insert a canned message
[**insertConversationDepartment**](ConversationApi.md#insertConversationDepartment) | **POST** /conversation/departments | Insert a department
[**insertConversationEngagement**](ConversationApi.md#insertConversationEngagement) | **POST** /conversation/engagements | Insert a engagement
[**insertPbxAddress**](ConversationApi.md#insertPbxAddress) | **POST** /conversation/pbx/address | Insert pbx address
[**insertPbxAudio**](ConversationApi.md#insertPbxAudio) | **POST** /conversation/pbx/audio | Insert pbx audio
[**insertPbxClassOfService**](ConversationApi.md#insertPbxClassOfService) | **POST** /conversation/pbx/class_of_service | Insert pbx class of service
[**insertPbxHardwarePhone**](ConversationApi.md#insertPbxHardwarePhone) | **POST** /conversation/pbx/hardware_phone | Insert pbx hardware phone
[**insertPbxMenu**](ConversationApi.md#insertPbxMenu) | **POST** /conversation/pbx/menu | Insert pbx menu
[**insertPbxQueue**](ConversationApi.md#insertPbxQueue) | **POST** /conversation/pbx/queue | Insert pbx queue
[**insertPbxTimeBased**](ConversationApi.md#insertPbxTimeBased) | **POST** /conversation/pbx/time_based | Insert pbx timeBased
[**insertPbxTimeRange**](ConversationApi.md#insertPbxTimeRange) | **POST** /conversation/pbx/time_range | Insert pbx timeRange
[**insertPbxVoicemailMailbox**](ConversationApi.md#insertPbxVoicemailMailbox) | **POST** /conversation/pbx/voicemail_mailbox | Insert pbx voicemailMailbox
[**joinConversation**](ConversationApi.md#joinConversation) | **PUT** /conversation/conversations/{conversation_uuid}/join | Join a conversation
[**leaveConversation**](ConversationApi.md#leaveConversation) | **DELETE** /conversation/conversations/{conversation_uuid}/leave | Leave a conversation
[**listenedPbxAgentVoicemail**](ConversationApi.md#listenedPbxAgentVoicemail) | **GET** /conversation/pbx/agent/voicemails/{recording_sid}/listened | Listened Agent Voicemail
[**listenedPbxQueueVoicemail**](ConversationApi.md#listenedPbxQueueVoicemail) | **GET** /conversation/pbx/queues/{queue_uuid}/voicemails/{recording_sid}/listened | Listened Queue Voicemail
[**markReadConversation**](ConversationApi.md#markReadConversation) | **PUT** /conversation/conversations/{conversation_uuid}/markread | Mark a conversation as read
[**protectPbxPhoneNumber**](ConversationApi.md#protectPbxPhoneNumber) | **PUT** /conversation/pbx/phone_number/{conversationPbxPhoneNumberUuid}/protect | Protect pbx phoneNumber from deletion
[**purchasePbxPhoneNumber**](ConversationApi.md#purchasePbxPhoneNumber) | **POST** /conversation/pbx/phone_number | Purchase pbx phone number
[**regeneratePasswordForPbxHardwarePhone**](ConversationApi.md#regeneratePasswordForPbxHardwarePhone) | **POST** /conversation/pbx/hardware_phone/{conversationPbxHardwarePhoneUuid}/regenerate_password | Update pbx hardware phone
[**resetConversationPbxQueueStatistics**](ConversationApi.md#resetConversationPbxQueueStatistics) | **POST** /conversation/pbx/queues/{queue_uuid}/reset_statistics | reset statistics within the queue
[**searchConversationCannedMessages**](ConversationApi.md#searchConversationCannedMessages) | **POST** /conversation/canned_messages/search | Search for canned messages by short_code
[**searchPbxAvailablePhoneNumbers**](ConversationApi.md#searchPbxAvailablePhoneNumbers) | **GET** /conversation/pbx/phone_number/search | Search for available phone numbers
[**searchPbxCalls**](ConversationApi.md#searchPbxCalls) | **POST** /conversation/pbx/call/search | Search pbx call records
[**smsUnsubscribeConversation**](ConversationApi.md#smsUnsubscribeConversation) | **PUT** /conversation/conversations/{conversation_uuid}/sms_unsubscribe | Unsubscribe any SMS participants in this conversation
[**startConversation**](ConversationApi.md#startConversation) | **PUT** /conversation/conversations | Start a conversation
[**updateAgentProfile**](ConversationApi.md#updateAgentProfile) | **PUT** /conversation/agent/profile | Update agent profile
[**updateAgentProfileMcp**](ConversationApi.md#updateAgentProfileMcp) | **POST** /conversation/agent/profiles/{user_id}/mcps/{mcp_server_uuid} | Update an agent MCP server
[**updateConversationCannedMessage**](ConversationApi.md#updateConversationCannedMessage) | **PUT** /conversation/canned_messages/{conversation_canned_message_oid} | Update a canned message
[**updateConversationDepartment**](ConversationApi.md#updateConversationDepartment) | **PUT** /conversation/departments/{conversation_department_oid} | Update a department
[**updateConversationEngagement**](ConversationApi.md#updateConversationEngagement) | **PUT** /conversation/engagements/{conversation_engagement_oid} | Update a engagement
[**updateConversationWebchatQueueStatus**](ConversationApi.md#updateConversationWebchatQueueStatus) | **PUT** /conversation/conversations/queues/{queue_name}/status | Update status within the queue
[**updatePbxAddress**](ConversationApi.md#updatePbxAddress) | **PUT** /conversation/pbx/address/{conversationPbxAddressUuid} | Update pbx address
[**updatePbxAgent**](ConversationApi.md#updatePbxAgent) | **PUT** /conversation/pbx/agent/{conversationPbxAgentUuid} | Update pbx agent
[**updatePbxAudio**](ConversationApi.md#updatePbxAudio) | **PUT** /conversation/pbx/audio/{conversationPbxAudioUuid} | Update pbx audio
[**updatePbxClassOfService**](ConversationApi.md#updatePbxClassOfService) | **PUT** /conversation/pbx/class_of_service/{classOfServiceUuid} | Update pbx class of service
[**updatePbxHardwarePhone**](ConversationApi.md#updatePbxHardwarePhone) | **PUT** /conversation/pbx/hardware_phone/{conversationPbxHardwarePhoneUuid} | Update pbx hardware phone
[**updatePbxMenu**](ConversationApi.md#updatePbxMenu) | **PUT** /conversation/pbx/menu/{conversationPbxMenuUuid} | Update pbx menu
[**updatePbxPhoneNumber**](ConversationApi.md#updatePbxPhoneNumber) | **PUT** /conversation/pbx/phone_number/{conversationPbxPhoneNumberUuid} | Update pbx phoneNumber
[**updatePbxQueue**](ConversationApi.md#updatePbxQueue) | **PUT** /conversation/pbx/queue/{conversationPbxQueueUuid} | Update pbx queue
[**updatePbxTimeBased**](ConversationApi.md#updatePbxTimeBased) | **PUT** /conversation/pbx/time_based/{conversationPbxTimeBasedUuid} | Update pbx timeBased
[**updatePbxTimeRange**](ConversationApi.md#updatePbxTimeRange) | **PUT** /conversation/pbx/time_range/{conversationPbxTimeRangeUuid} | Update pbx timeRange
[**updatePbxVoicemailMailbox**](ConversationApi.md#updatePbxVoicemailMailbox) | **PUT** /conversation/pbx/voicemail_mailbox/{conversationPbxVoicemailMailboxUuid} | Update pbx voicemailMailbox
[**updateVirtualAgentBudget**](ConversationApi.md#updateVirtualAgentBudget) | **PUT** /conversation/virtualagent/budget | Update virtual agent budget
[**updateVirtualAgentCapabilities**](ConversationApi.md#updateVirtualAgentCapabilities) | **PUT** /conversation/virtualagent/capabilities | Update virtual agent capabilities


<a name="deleteAgentProfileKnowledgeBaseDocument"></a>
# **deleteAgentProfileKnowledgeBaseDocument**
> ConversationDeleteKnowledgeBaseDocumentResponse deleteAgentProfileKnowledgeBaseDocument(userId, documentUuid)

Delete a knowledge base document

Delete a knowledge base document 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
String documentUuid = "documentUuid_example"; // String | 
try {
    ConversationDeleteKnowledgeBaseDocumentResponse result = apiInstance.deleteAgentProfileKnowledgeBaseDocument(userId, documentUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteAgentProfileKnowledgeBaseDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **documentUuid** | **String**|  |

### Return type

[**ConversationDeleteKnowledgeBaseDocumentResponse**](ConversationDeleteKnowledgeBaseDocumentResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAgentProfileMcp"></a>
# **deleteAgentProfileMcp**
> deleteAgentProfileMcp(userId, mcpServerUuid)

Delete an agent MCP server

Delete an agent MCP server 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
String mcpServerUuid = "mcpServerUuid_example"; // String | 
try {
    apiInstance.deleteAgentProfileMcp(userId, mcpServerUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteAgentProfileMcp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **mcpServerUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteConversationCannedMessage"></a>
# **deleteConversationCannedMessage**
> deleteConversationCannedMessage(conversationCannedMessageOid)

Delete a conversation canned message

Delete a conversation canned message 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer conversationCannedMessageOid = 56; // Integer | 
try {
    apiInstance.deleteConversationCannedMessage(conversationCannedMessageOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteConversationCannedMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationCannedMessageOid** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDepartment"></a>
# **deleteDepartment**
> deleteDepartment(conversationDepartmentOid)

Delete a conversation department

Delete a conversation department 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer conversationDepartmentOid = 56; // Integer | 
try {
    apiInstance.deleteDepartment(conversationDepartmentOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteDepartment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationDepartmentOid** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEngagement"></a>
# **deleteEngagement**
> deleteEngagement(conversationEngagementOid)

Delete a conversation engagement

Delete a conversation engagement 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer conversationEngagementOid = 56; // Integer | 
try {
    apiInstance.deleteEngagement(conversationEngagementOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteEngagement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationEngagementOid** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxAddress"></a>
# **deletePbxAddress**
> ConversationPbxAddressResponse deletePbxAddress(conversationPbxAddressUuid)

Delete pbx address

Delete a pbx address 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAddressUuid = "conversationPbxAddressUuid_example"; // String | 
try {
    ConversationPbxAddressResponse result = apiInstance.deletePbxAddress(conversationPbxAddressUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAddressUuid** | **String**|  |

### Return type

[**ConversationPbxAddressResponse**](ConversationPbxAddressResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxAgentVoicemail"></a>
# **deletePbxAgentVoicemail**
> deletePbxAgentVoicemail(recordingSid)

Delete Agent Voicemail

Delete pbx agent Voicemail 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String recordingSid = "recordingSid_example"; // String | 
try {
    apiInstance.deletePbxAgentVoicemail(recordingSid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxAgentVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingSid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxAudio"></a>
# **deletePbxAudio**
> ConversationPbxAudioResponse deletePbxAudio(conversationPbxAudioUuid)

Delete pbx audio

Delete a pbx audio 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAudioUuid = "conversationPbxAudioUuid_example"; // String | 
try {
    ConversationPbxAudioResponse result = apiInstance.deletePbxAudio(conversationPbxAudioUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxAudio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAudioUuid** | **String**|  |

### Return type

[**ConversationPbxAudioResponse**](ConversationPbxAudioResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxClassOfService"></a>
# **deletePbxClassOfService**
> BaseResponse deletePbxClassOfService(classOfServiceUuid)

Delete pbx class of service

Delete a class of service 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String classOfServiceUuid = "classOfServiceUuid_example"; // String | 
try {
    BaseResponse result = apiInstance.deletePbxClassOfService(classOfServiceUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxClassOfService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classOfServiceUuid** | **String**|  |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxHardwarePhone"></a>
# **deletePbxHardwarePhone**
> ConversationPbxHardwarePhoneResponse deletePbxHardwarePhone(conversationPbxHardwarePhoneUuid)

Delete pbx hardware phone

Delete a pbx hardware phone 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxHardwarePhoneUuid = "conversationPbxHardwarePhoneUuid_example"; // String | 
try {
    ConversationPbxHardwarePhoneResponse result = apiInstance.deletePbxHardwarePhone(conversationPbxHardwarePhoneUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxHardwarePhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxHardwarePhoneUuid** | **String**|  |

### Return type

[**ConversationPbxHardwarePhoneResponse**](ConversationPbxHardwarePhoneResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxMenu"></a>
# **deletePbxMenu**
> ConversationPbxMenuResponse deletePbxMenu(conversationPbxMenuUuid)

Delete pbx menu

Delete a pbx menu 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxMenuUuid = "conversationPbxMenuUuid_example"; // String | 
try {
    ConversationPbxMenuResponse result = apiInstance.deletePbxMenu(conversationPbxMenuUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxMenuUuid** | **String**|  |

### Return type

[**ConversationPbxMenuResponse**](ConversationPbxMenuResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxPhoneNumber"></a>
# **deletePbxPhoneNumber**
> deletePbxPhoneNumber(conversationPbxPhoneNumberUuid)

Delete pbx phoneNumber

Delete a pbx phoneNumber. Only works if deletion_protected is false. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxPhoneNumberUuid = "conversationPbxPhoneNumberUuid_example"; // String | 
try {
    apiInstance.deletePbxPhoneNumber(conversationPbxPhoneNumberUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxPhoneNumberUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxQueue"></a>
# **deletePbxQueue**
> ConversationPbxQueueResponse deletePbxQueue(conversationPbxQueueUuid)

Delete pbx queue

Delete a pbx queue 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxQueueUuid = "conversationPbxQueueUuid_example"; // String | 
try {
    ConversationPbxQueueResponse result = apiInstance.deletePbxQueue(conversationPbxQueueUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxQueueUuid** | **String**|  |

### Return type

[**ConversationPbxQueueResponse**](ConversationPbxQueueResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxQueueVoicemail"></a>
# **deletePbxQueueVoicemail**
> deletePbxQueueVoicemail(queueUuid, recordingSid)

Delete Queue Voicemail

Delete pbx queue Voicemail 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String queueUuid = "queueUuid_example"; // String | 
String recordingSid = "recordingSid_example"; // String | 
try {
    apiInstance.deletePbxQueueVoicemail(queueUuid, recordingSid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxQueueVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueUuid** | **String**|  |
 **recordingSid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxTimeBased"></a>
# **deletePbxTimeBased**
> ConversationPbxTimeBasedResponse deletePbxTimeBased(conversationPbxTimeBasedUuid)

Delete pbx timeBased

Delete a pbx timeBased 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxTimeBasedUuid = "conversationPbxTimeBasedUuid_example"; // String | 
try {
    ConversationPbxTimeBasedResponse result = apiInstance.deletePbxTimeBased(conversationPbxTimeBasedUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxTimeBased");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxTimeBasedUuid** | **String**|  |

### Return type

[**ConversationPbxTimeBasedResponse**](ConversationPbxTimeBasedResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxTimeRange"></a>
# **deletePbxTimeRange**
> ConversationPbxTimeRangeResponse deletePbxTimeRange(conversationPbxTimeRangeUuid)

Delete pbx timeRange

Delete a pbx timeRange 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxTimeRangeUuid = "conversationPbxTimeRangeUuid_example"; // String | 
try {
    ConversationPbxTimeRangeResponse result = apiInstance.deletePbxTimeRange(conversationPbxTimeRangeUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxTimeRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxTimeRangeUuid** | **String**|  |

### Return type

[**ConversationPbxTimeRangeResponse**](ConversationPbxTimeRangeResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePbxVoicemailMailbox"></a>
# **deletePbxVoicemailMailbox**
> ConversationPbxVoicemailMailboxResponse deletePbxVoicemailMailbox(conversationPbxVoicemailMailboxUuid)

Delete pbx voicemailMailbox

Delete a pbx voicemailMailbox 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxVoicemailMailboxUuid = "conversationPbxVoicemailMailboxUuid_example"; // String | 
try {
    ConversationPbxVoicemailMailboxResponse result = apiInstance.deletePbxVoicemailMailbox(conversationPbxVoicemailMailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deletePbxVoicemailMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxVoicemailMailboxUuid** | **String**|  |

### Return type

[**ConversationPbxVoicemailMailboxResponse**](ConversationPbxVoicemailMailboxResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentKeepAlive"></a>
# **getAgentKeepAlive**
> getAgentKeepAlive()

Agent keep alive

Called periodically by the conversation API to keep the session alive. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    apiInstance.getAgentKeepAlive();
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentKeepAlive");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentProfile"></a>
# **getAgentProfile**
> ConversationAgentProfileResponse getAgentProfile()

Get agent profile

Retrieve the agents profile 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationAgentProfileResponse result = apiInstance.getAgentProfile();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentProfile");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationAgentProfileResponse**](ConversationAgentProfileResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentProfileKnowledgeBase"></a>
# **getAgentProfileKnowledgeBase**
> ConversationKnowledgeBaseDocumentsResponse getAgentProfileKnowledgeBase(userId)

Get the list of knowledge base documents associated with this agent profile

Retrieve knowledge base documents 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
try {
    ConversationKnowledgeBaseDocumentsResponse result = apiInstance.getAgentProfileKnowledgeBase(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentProfileKnowledgeBase");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**ConversationKnowledgeBaseDocumentsResponse**](ConversationKnowledgeBaseDocumentsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentProfileMcp"></a>
# **getAgentProfileMcp**
> ConversationMcpServerResponse getAgentProfileMcp(userId, mcpServerUuid)

Get an MCP server associated with this agent

Retrieve MCP server associated with this agent 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
String mcpServerUuid = "mcpServerUuid_example"; // String | 
try {
    ConversationMcpServerResponse result = apiInstance.getAgentProfileMcp(userId, mcpServerUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentProfileMcp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **mcpServerUuid** | **String**|  |

### Return type

[**ConversationMcpServerResponse**](ConversationMcpServerResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentProfileMcpTools"></a>
# **getAgentProfileMcpTools**
> ConversationMcpServerToolsResponse getAgentProfileMcpTools(userId, mcpServerUuid)

Get the tools available from the MCP server

Get the tools available from the MCP server 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
String mcpServerUuid = "mcpServerUuid_example"; // String | 
try {
    ConversationMcpServerToolsResponse result = apiInstance.getAgentProfileMcpTools(userId, mcpServerUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentProfileMcpTools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **mcpServerUuid** | **String**|  |

### Return type

[**ConversationMcpServerToolsResponse**](ConversationMcpServerToolsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentProfileMcps"></a>
# **getAgentProfileMcps**
> ConversationMcpServersResponse getAgentProfileMcps(userId)

Get the list of MCP servers associated with this agent

Retrieve MCP servers associated with this agent 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
try {
    ConversationMcpServersResponse result = apiInstance.getAgentProfileMcps(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentProfileMcps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |

### Return type

[**ConversationMcpServersResponse**](ConversationMcpServersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentProfiles"></a>
# **getAgentProfiles**
> ConversationAgentProfilesResponse getAgentProfiles()

Get agent profiles

Retrieve the agents profile 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationAgentProfilesResponse result = apiInstance.getAgentProfiles();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentProfiles");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationAgentProfilesResponse**](ConversationAgentProfilesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAgentWebsocketAuthorization"></a>
# **getAgentWebsocketAuthorization**
> ConversationAgentAuthResponse getAgentWebsocketAuthorization()

Get agent websocket authorization

Retrieve a JWT to authorize an agent to make a websocket connection. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationAgentAuthResponse result = apiInstance.getAgentWebsocketAuthorization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentWebsocketAuthorization");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationAgentAuthResponse**](ConversationAgentAuthResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversation"></a>
# **getConversation**
> ConversationResponse getConversation(conversationUuid, limit)

Retrieve a conversation

Retrieve a conversation including the participants and messages 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationUuid = "conversationUuid_example"; // String | 
Integer limit = 56; // Integer | 
try {
    ConversationResponse result = apiInstance.getConversation(conversationUuid, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationUuid** | **String**|  |
 **limit** | **Integer**|  | [optional]

### Return type

[**ConversationResponse**](ConversationResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationCannedMessages"></a>
# **getConversationCannedMessages**
> ConversationCannedMessagesResponse getConversationCannedMessages()

Retrieve a list of canned messages ordered by short_code

Retrieve a list of canned messages ordered by short_code 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationCannedMessagesResponse result = apiInstance.getConversationCannedMessages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationCannedMessages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationCannedMessagesResponse**](ConversationCannedMessagesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationContext"></a>
# **getConversationContext**
> ConversationWebchatContext getConversationContext(conversationUuid)

Get a webchat conversation context

Get a webchat conversation context 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationUuid = "conversationUuid_example"; // String | 
try {
    ConversationWebchatContext result = apiInstance.getConversationContext(conversationUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationContext");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationUuid** | **String**|  |

### Return type

[**ConversationWebchatContext**](ConversationWebchatContext.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationDepartmentMemberList"></a>
# **getConversationDepartmentMemberList**
> ConversationDepartmentMembersResponse getConversationDepartmentMemberList()

Retrieve a list of possible department members

Retrieve a list of possible department members 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationDepartmentMembersResponse result = apiInstance.getConversationDepartmentMemberList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationDepartmentMemberList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationDepartmentMembersResponse**](ConversationDepartmentMembersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationDepartments"></a>
# **getConversationDepartments**
> ConversationDepartmentsResponse getConversationDepartments()

Retrieve a list of departments ordered by name

Retrieve a list of departments ordered by name 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationDepartmentsResponse result = apiInstance.getConversationDepartments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationDepartments");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationDepartmentsResponse**](ConversationDepartmentsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationEngagement"></a>
# **getConversationEngagement**
> ConversationEngagementResponse getConversationEngagement(conversationEngagementOid)

Retrieve an engagement

Retrieve an engagement 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer conversationEngagementOid = 56; // Integer | 
try {
    ConversationEngagementResponse result = apiInstance.getConversationEngagement(conversationEngagementOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationEngagement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationEngagementOid** | **Integer**|  |

### Return type

[**ConversationEngagementResponse**](ConversationEngagementResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationEngagements"></a>
# **getConversationEngagements**
> ConversationEngagementsResponse getConversationEngagements()

Retrieve a list of engagements ordered by name

Retrieve a list of engagements ordered by name 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationEngagementsResponse result = apiInstance.getConversationEngagements();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationEngagements");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationEngagementsResponse**](ConversationEngagementsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationKnowledgeBaseDocumentUploadUrl"></a>
# **getConversationKnowledgeBaseDocumentUploadUrl**
> ConversationKnowledgeBaseDocumentUploadUrlResponse getConversationKnowledgeBaseDocumentUploadUrl(userId, extension)

Get a pre-signed conversation knowledge base document upload URL

Get a pre-signed conversation knowledge base document upload URL 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
String extension = "extension_example"; // String | 
try {
    ConversationKnowledgeBaseDocumentUploadUrlResponse result = apiInstance.getConversationKnowledgeBaseDocumentUploadUrl(userId, extension);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationKnowledgeBaseDocumentUploadUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **extension** | **String**|  |

### Return type

[**ConversationKnowledgeBaseDocumentUploadUrlResponse**](ConversationKnowledgeBaseDocumentUploadUrlResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationMessages"></a>
# **getConversationMessages**
> ConversationMessagesResponse getConversationMessages(conversationUuid, since, limit)

Retrieve conversation messages

Retrieve conversation messages since a particular time 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationUuid = "conversationUuid_example"; // String | 
Long since = 789L; // Long | 
Integer limit = 56; // Integer | 
try {
    ConversationMessagesResponse result = apiInstance.getConversationMessages(conversationUuid, since, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationUuid** | **String**|  |
 **since** | **Long**|  |
 **limit** | **Integer**|  | [optional]

### Return type

[**ConversationMessagesResponse**](ConversationMessagesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationMultimediaUploadUrl"></a>
# **getConversationMultimediaUploadUrl**
> ConversationMultimediaUploadUrlResponse getConversationMultimediaUploadUrl(extension)

Get a presigned conversation multimedia upload URL

Get a presigned conversation multimedia upload URL 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String extension = "extension_example"; // String | 
try {
    ConversationMultimediaUploadUrlResponse result = apiInstance.getConversationMultimediaUploadUrl(extension);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationMultimediaUploadUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension** | **String**|  |

### Return type

[**ConversationMultimediaUploadUrlResponse**](ConversationMultimediaUploadUrlResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationPbxAudioUploadUrl"></a>
# **getConversationPbxAudioUploadUrl**
> ConversationPbxAudioUploadUrlResponse getConversationPbxAudioUploadUrl(extension)

Get a pre-signed conversation multimedia upload URL

Get a pre-signed conversation multimedia upload URL 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String extension = "extension_example"; // String | 
try {
    ConversationPbxAudioUploadUrlResponse result = apiInstance.getConversationPbxAudioUploadUrl(extension);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationPbxAudioUploadUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension** | **String**|  |

### Return type

[**ConversationPbxAudioUploadUrlResponse**](ConversationPbxAudioUploadUrlResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationPbxCustomerSnapshot"></a>
# **getConversationPbxCustomerSnapshot**
> ConversationPbxCustomerSnapshotResponse getConversationPbxCustomerSnapshot(pbxCustomerSnapshotRequest)

Get orders and customer information for a phone number

Retrieves all the orders, auto orders, and customer profile for a given phone number 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxCustomerSnapshotRequest pbxCustomerSnapshotRequest = new ConversationPbxCustomerSnapshotRequest(); // ConversationPbxCustomerSnapshotRequest | Conversation pbx customer snapshot request
try {
    ConversationPbxCustomerSnapshotResponse result = apiInstance.getConversationPbxCustomerSnapshot(pbxCustomerSnapshotRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationPbxCustomerSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxCustomerSnapshotRequest** | [**ConversationPbxCustomerSnapshotRequest**](ConversationPbxCustomerSnapshotRequest.md)| Conversation pbx customer snapshot request |

### Return type

[**ConversationPbxCustomerSnapshotResponse**](ConversationPbxCustomerSnapshotResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationPermissions"></a>
# **getConversationPermissions**
> ConversationPermissionsResponse getConversationPermissions()

Retrieve conversation permissions

Retrieve conversation permissions 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPermissionsResponse result = apiInstance.getConversationPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPermissionsResponse**](ConversationPermissionsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationWebchatQueueStatuses"></a>
# **getConversationWebchatQueueStatuses**
> ConversationWebchatQueueStatusesResponse getConversationWebchatQueueStatuses()

Retrieve a conversation webchat queue statuses

Retrieve a conversation webchat queue statuses including agent status and queue entries 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationWebchatQueueStatusesResponse result = apiInstance.getConversationWebchatQueueStatuses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationWebchatQueueStatuses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationWebchatQueueStatusesResponse**](ConversationWebchatQueueStatusesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversations"></a>
# **getConversations**
> ConversationsResponse getConversations(medium, before, limit, offset)

Retrieve a list of conversation summaries newest to oldest

Retrieve a list of conversation summaries that are ordered newest to oldest, include the most recent message and whether its been read. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String medium = "medium_example"; // String | 
String before = "before_example"; // String | 
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
try {
    ConversationsResponse result = apiInstance.getConversations(medium, before, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **medium** | **String**|  | [optional]
 **before** | **String**|  | [optional]
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]

### Return type

[**ConversationsResponse**](ConversationsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationsAutocomplete"></a>
# **getConversationsAutocomplete**
> ConversationAutocompleteResponse getConversationsAutocomplete(autocompleteRequest)

Retrieve a list of matching terms for a search field

Retrieve a list of matching terms for a search field 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationAutocompleteRequest autocompleteRequest = new ConversationAutocompleteRequest(); // ConversationAutocompleteRequest | Autocomplete Request
try {
    ConversationAutocompleteResponse result = apiInstance.getConversationsAutocomplete(autocompleteRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationsAutocomplete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autocompleteRequest** | [**ConversationAutocompleteRequest**](ConversationAutocompleteRequest.md)| Autocomplete Request |

### Return type

[**ConversationAutocompleteResponse**](ConversationAutocompleteResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConversationsSearch"></a>
# **getConversationsSearch**
> ConversationSearchResponse getConversationsSearch(searchRequest)

Search conversations

Search conversations 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationSearchRequest searchRequest = new ConversationSearchRequest(); // ConversationSearchRequest | Search Request
try {
    ConversationSearchResponse result = apiInstance.getConversationsSearch(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationsSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRequest** | [**ConversationSearchRequest**](ConversationSearchRequest.md)| Search Request |

### Return type

[**ConversationSearchResponse**](ConversationSearchResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLocationsForEngagement"></a>
# **getLocationsForEngagement**
> ConversationLocationsResponse getLocationsForEngagement()

Get location data for engagement configuration

Get location data for engagement configuration 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationLocationsResponse result = apiInstance.getLocationsForEngagement();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getLocationsForEngagement");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationLocationsResponse**](ConversationLocationsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAddress"></a>
# **getPbxAddress**
> ConversationPbxAddressResponse getPbxAddress(conversationPbxAddressUuid)

Get pbx address

Retrieve a pbx address 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAddressUuid = "conversationPbxAddressUuid_example"; // String | 
try {
    ConversationPbxAddressResponse result = apiInstance.getPbxAddress(conversationPbxAddressUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAddressUuid** | **String**|  |

### Return type

[**ConversationPbxAddressResponse**](ConversationPbxAddressResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAddresses"></a>
# **getPbxAddresses**
> ConversationPbxAddressesResponse getPbxAddresses()

Get pbx addresses

Retrieve pbx addresses 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxAddressesResponse result = apiInstance.getPbxAddresses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAddresses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxAddressesResponse**](ConversationPbxAddressesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAgent"></a>
# **getPbxAgent**
> ConversationPbxAgentResponse getPbxAgent(conversationPbxAgentUuid)

Get pbx agent

Retrieve a pbx agent 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAgentUuid = "conversationPbxAgentUuid_example"; // String | 
try {
    ConversationPbxAgentResponse result = apiInstance.getPbxAgent(conversationPbxAgentUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAgentUuid** | **String**|  |

### Return type

[**ConversationPbxAgentResponse**](ConversationPbxAgentResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAgentVoicemail"></a>
# **getPbxAgentVoicemail**
> ConversationPbxVoicemailMessageResponse getPbxAgentVoicemail(recordingSid)

Get Agent Voicemail

Retrieve pbx agent Voicemail 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String recordingSid = "recordingSid_example"; // String | 
try {
    ConversationPbxVoicemailMessageResponse result = apiInstance.getPbxAgentVoicemail(recordingSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAgentVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingSid** | **String**|  |

### Return type

[**ConversationPbxVoicemailMessageResponse**](ConversationPbxVoicemailMessageResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAgentVoicemails"></a>
# **getPbxAgentVoicemails**
> ConversationPbxVoicemailMessageSummariesResponse getPbxAgentVoicemails()

Get Agent Voicemails

Retrieve pbx agent Voicemails 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxVoicemailMessageSummariesResponse result = apiInstance.getPbxAgentVoicemails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAgentVoicemails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxVoicemailMessageSummariesResponse**](ConversationPbxVoicemailMessageSummariesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAgents"></a>
# **getPbxAgents**
> ConversationPbxAgentsResponse getPbxAgents()

Get pbx agents

Retrieve pbx agents 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxAgentsResponse result = apiInstance.getPbxAgents();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAgents");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxAgentsResponse**](ConversationPbxAgentsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAudio"></a>
# **getPbxAudio**
> ConversationPbxAudioResponse getPbxAudio(conversationPbxAudioUuid)

Get pbx audio

Retrieve a pbx audio 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAudioUuid = "conversationPbxAudioUuid_example"; // String | 
try {
    ConversationPbxAudioResponse result = apiInstance.getPbxAudio(conversationPbxAudioUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAudio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAudioUuid** | **String**|  |

### Return type

[**ConversationPbxAudioResponse**](ConversationPbxAudioResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAudioUsage"></a>
# **getPbxAudioUsage**
> ConversationPbxAudioUsageResponse getPbxAudioUsage(conversationPbxAudioUuid)

Get pbx audio usage

Retrieve a pbx audio usage 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAudioUuid = "conversationPbxAudioUuid_example"; // String | 
try {
    ConversationPbxAudioUsageResponse result = apiInstance.getPbxAudioUsage(conversationPbxAudioUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAudioUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAudioUuid** | **String**|  |

### Return type

[**ConversationPbxAudioUsageResponse**](ConversationPbxAudioUsageResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxAudios"></a>
# **getPbxAudios**
> ConversationPbxAudiosResponse getPbxAudios()

Get pbx audios

Retrieve pbx audios 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxAudiosResponse result = apiInstance.getPbxAudios();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxAudios");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxAudiosResponse**](ConversationPbxAudiosResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxCall"></a>
# **getPbxCall**
> ConversationPbxCallResponse getPbxCall(callUuid)

Get pbx call record

Retrieve a single PBX call record with full details 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String callUuid = "callUuid_example"; // String | 
try {
    ConversationPbxCallResponse result = apiInstance.getPbxCall(callUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxCall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **callUuid** | **String**|  |

### Return type

[**ConversationPbxCallResponse**](ConversationPbxCallResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxClassOfService"></a>
# **getPbxClassOfService**
> ConversationPbxClassOfServiceResponse getPbxClassOfService(classOfServiceUuid)

Get pbx class of service

Retrieve a single class of service 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String classOfServiceUuid = "classOfServiceUuid_example"; // String | 
try {
    ConversationPbxClassOfServiceResponse result = apiInstance.getPbxClassOfService(classOfServiceUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxClassOfService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classOfServiceUuid** | **String**|  |

### Return type

[**ConversationPbxClassOfServiceResponse**](ConversationPbxClassOfServiceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxClassesOfService"></a>
# **getPbxClassesOfService**
> ConversationPbxClassOfServicesResponse getPbxClassesOfService()

Get pbx classes of service

Retrieve all classes of service for the merchant 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxClassOfServicesResponse result = apiInstance.getPbxClassesOfService();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxClassesOfService");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxClassOfServicesResponse**](ConversationPbxClassOfServicesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxCosAuditLogs"></a>
# **getPbxCosAuditLogs**
> ConversationPbxCosAuditLogsResponse getPbxCosAuditLogs(since, agentLogin, limit)

Get pbx class of service audit logs

Retrieve audit log entries for class of service enforcement 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String since = "since_example"; // String | ISO timestamp to filter entries since
String agentLogin = "agentLogin_example"; // String | Filter by agent login
Integer limit = 56; // Integer | Maximum number of entries to return (default 100)
try {
    ConversationPbxCosAuditLogsResponse result = apiInstance.getPbxCosAuditLogs(since, agentLogin, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxCosAuditLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **String**| ISO timestamp to filter entries since | [optional]
 **agentLogin** | **String**| Filter by agent login | [optional]
 **limit** | **Integer**| Maximum number of entries to return (default 100) | [optional]

### Return type

[**ConversationPbxCosAuditLogsResponse**](ConversationPbxCosAuditLogsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxHardwarePhone"></a>
# **getPbxHardwarePhone**
> ConversationPbxHardwarePhoneResponse getPbxHardwarePhone(conversationPbxHardwarePhoneUuid)

Get pbx hardware phone

Retrieve a pbx hardware phone 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxHardwarePhoneUuid = "conversationPbxHardwarePhoneUuid_example"; // String | 
try {
    ConversationPbxHardwarePhoneResponse result = apiInstance.getPbxHardwarePhone(conversationPbxHardwarePhoneUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxHardwarePhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxHardwarePhoneUuid** | **String**|  |

### Return type

[**ConversationPbxHardwarePhoneResponse**](ConversationPbxHardwarePhoneResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxHardwarePhoneManufacturers"></a>
# **getPbxHardwarePhoneManufacturers**
> ConversationPbxPhoneManufacturersResponse getPbxHardwarePhoneManufacturers()

Get pbx hardware phone manufacturers

Retrieve pbx hardware phone manufacturers and models for auto-provisioning 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxPhoneManufacturersResponse result = apiInstance.getPbxHardwarePhoneManufacturers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxHardwarePhoneManufacturers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxPhoneManufacturersResponse**](ConversationPbxPhoneManufacturersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxHardwarePhones"></a>
# **getPbxHardwarePhones**
> ConversationPbxHardwarePhonesResponse getPbxHardwarePhones()

Get pbx hardware phones

Retrieve pbx hardware phones 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxHardwarePhonesResponse result = apiInstance.getPbxHardwarePhones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxHardwarePhones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxHardwarePhonesResponse**](ConversationPbxHardwarePhonesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxMenu"></a>
# **getPbxMenu**
> ConversationPbxMenuResponse getPbxMenu(conversationPbxMenuUuid)

Get pbx menu

Retrieve a pbx menu 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxMenuUuid = "conversationPbxMenuUuid_example"; // String | 
try {
    ConversationPbxMenuResponse result = apiInstance.getPbxMenu(conversationPbxMenuUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxMenuUuid** | **String**|  |

### Return type

[**ConversationPbxMenuResponse**](ConversationPbxMenuResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxMenus"></a>
# **getPbxMenus**
> ConversationPbxMenusResponse getPbxMenus()

Get pbx menus

Retrieve pbx menus 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxMenusResponse result = apiInstance.getPbxMenus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxMenus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxMenusResponse**](ConversationPbxMenusResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxPhoneNumber"></a>
# **getPbxPhoneNumber**
> ConversationPbxPhoneNumberResponse getPbxPhoneNumber(conversationPbxPhoneNumberUuid)

Get pbx phoneNumber

Retrieve a pbx phoneNumber 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxPhoneNumberUuid = "conversationPbxPhoneNumberUuid_example"; // String | 
try {
    ConversationPbxPhoneNumberResponse result = apiInstance.getPbxPhoneNumber(conversationPbxPhoneNumberUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxPhoneNumberUuid** | **String**|  |

### Return type

[**ConversationPbxPhoneNumberResponse**](ConversationPbxPhoneNumberResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxPhoneNumbers"></a>
# **getPbxPhoneNumbers**
> ConversationPbxPhoneNumbersResponse getPbxPhoneNumbers()

Get pbx phoneNumbers

Retrieve pbx phoneNumbers 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxPhoneNumbersResponse result = apiInstance.getPbxPhoneNumbers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxPhoneNumbers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxPhoneNumbersResponse**](ConversationPbxPhoneNumbersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxQueue"></a>
# **getPbxQueue**
> ConversationPbxQueueResponse getPbxQueue(conversationPbxQueueUuid)

Get pbx queue

Retrieve a pbx queue 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxQueueUuid = "conversationPbxQueueUuid_example"; // String | 
try {
    ConversationPbxQueueResponse result = apiInstance.getPbxQueue(conversationPbxQueueUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxQueueUuid** | **String**|  |

### Return type

[**ConversationPbxQueueResponse**](ConversationPbxQueueResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxQueueVoicemail"></a>
# **getPbxQueueVoicemail**
> ConversationPbxVoicemailMessageResponse getPbxQueueVoicemail(queueUuid, recordingSid)

Get Queue Voicemail

Retrieve pbx queue Voicemail 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String queueUuid = "queueUuid_example"; // String | 
String recordingSid = "recordingSid_example"; // String | 
try {
    ConversationPbxVoicemailMessageResponse result = apiInstance.getPbxQueueVoicemail(queueUuid, recordingSid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxQueueVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueUuid** | **String**|  |
 **recordingSid** | **String**|  |

### Return type

[**ConversationPbxVoicemailMessageResponse**](ConversationPbxVoicemailMessageResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxQueueVoicemails"></a>
# **getPbxQueueVoicemails**
> ConversationPbxVoicemailMessageSummariesResponse getPbxQueueVoicemails(queueUuid)

Get Queue Voicemails

Retrieve pbx queue voicemails 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String queueUuid = "queueUuid_example"; // String | 
try {
    ConversationPbxVoicemailMessageSummariesResponse result = apiInstance.getPbxQueueVoicemails(queueUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxQueueVoicemails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueUuid** | **String**|  |

### Return type

[**ConversationPbxVoicemailMessageSummariesResponse**](ConversationPbxVoicemailMessageSummariesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxQueues"></a>
# **getPbxQueues**
> ConversationPbxQueuesResponse getPbxQueues()

Get pbx queues

Retrieve pbx queues 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxQueuesResponse result = apiInstance.getPbxQueues();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxQueues");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxQueuesResponse**](ConversationPbxQueuesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxTimeBased"></a>
# **getPbxTimeBased**
> ConversationPbxTimeBasedResponse getPbxTimeBased(conversationPbxTimeBasedUuid)

Get pbx timeBased

Retrieve a pbx timeBased 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxTimeBasedUuid = "conversationPbxTimeBasedUuid_example"; // String | 
try {
    ConversationPbxTimeBasedResponse result = apiInstance.getPbxTimeBased(conversationPbxTimeBasedUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxTimeBased");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxTimeBasedUuid** | **String**|  |

### Return type

[**ConversationPbxTimeBasedResponse**](ConversationPbxTimeBasedResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxTimeBaseds"></a>
# **getPbxTimeBaseds**
> ConversationPbxTimeBasedsResponse getPbxTimeBaseds()

Get pbx timeBaseds

Retrieve pbx timeBaseds 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxTimeBasedsResponse result = apiInstance.getPbxTimeBaseds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxTimeBaseds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxTimeBasedsResponse**](ConversationPbxTimeBasedsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxTimeRange"></a>
# **getPbxTimeRange**
> ConversationPbxTimeRangeResponse getPbxTimeRange(conversationPbxTimeRangeUuid)

Get pbx timeRange

Retrieve a pbx timeRange 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxTimeRangeUuid = "conversationPbxTimeRangeUuid_example"; // String | 
try {
    ConversationPbxTimeRangeResponse result = apiInstance.getPbxTimeRange(conversationPbxTimeRangeUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxTimeRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxTimeRangeUuid** | **String**|  |

### Return type

[**ConversationPbxTimeRangeResponse**](ConversationPbxTimeRangeResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxTimeRanges"></a>
# **getPbxTimeRanges**
> ConversationPbxTimeRangesResponse getPbxTimeRanges()

Get pbx timeRanges

Retrieve pbx timeRanges 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxTimeRangesResponse result = apiInstance.getPbxTimeRanges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxTimeRanges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxTimeRangesResponse**](ConversationPbxTimeRangesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxVoicemailMailbox"></a>
# **getPbxVoicemailMailbox**
> ConversationPbxVoicemailMailboxResponse getPbxVoicemailMailbox(conversationPbxVoicemailMailboxUuid)

Get pbx voicemailMailbox

Retrieve a pbx voicemailMailbox 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxVoicemailMailboxUuid = "conversationPbxVoicemailMailboxUuid_example"; // String | 
try {
    ConversationPbxVoicemailMailboxResponse result = apiInstance.getPbxVoicemailMailbox(conversationPbxVoicemailMailboxUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxVoicemailMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxVoicemailMailboxUuid** | **String**|  |

### Return type

[**ConversationPbxVoicemailMailboxResponse**](ConversationPbxVoicemailMailboxResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPbxVoicemailMailboxes"></a>
# **getPbxVoicemailMailboxes**
> ConversationPbxVoicemailMailboxesResponse getPbxVoicemailMailboxes()

Get pbx voicemailMailboxes

Retrieve pbx voicemailMailboxes 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationPbxVoicemailMailboxesResponse result = apiInstance.getPbxVoicemailMailboxes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getPbxVoicemailMailboxes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPbxVoicemailMailboxesResponse**](ConversationPbxVoicemailMailboxesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVirtualAgentBudget"></a>
# **getVirtualAgentBudget**
> ConversationVirtualAgentBudgetResponse getVirtualAgentBudget()

Get virtual agent budget

Retrieve virtual agent budget 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationVirtualAgentBudgetResponse result = apiInstance.getVirtualAgentBudget();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getVirtualAgentBudget");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationVirtualAgentBudgetResponse**](ConversationVirtualAgentBudgetResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getVirtualAgentCapabilities"></a>
# **getVirtualAgentCapabilities**
> ConversationVirtualAgentCapabilitiesResponse getVirtualAgentCapabilities()

Get virtual agent capabilities

Retrieve virtual agent capabilities 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

try {
    ConversationVirtualAgentCapabilitiesResponse result = apiInstance.getVirtualAgentCapabilities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getVirtualAgentCapabilities");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationVirtualAgentCapabilitiesResponse**](ConversationVirtualAgentCapabilitiesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertAgentProfileKnowledgeBaseDocument"></a>
# **insertAgentProfileKnowledgeBaseDocument**
> ConversationInsertKnowledgeBaseDocumentResponse insertAgentProfileKnowledgeBaseDocument(userId, knowledgeBaseDocumentRequest)

Insert a knowledge base document

Insert a knowledge base document 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
ConversationInsertKnowledgeBaseDocumentRequest knowledgeBaseDocumentRequest = new ConversationInsertKnowledgeBaseDocumentRequest(); // ConversationInsertKnowledgeBaseDocumentRequest | Insert request
try {
    ConversationInsertKnowledgeBaseDocumentResponse result = apiInstance.insertAgentProfileKnowledgeBaseDocument(userId, knowledgeBaseDocumentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertAgentProfileKnowledgeBaseDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **knowledgeBaseDocumentRequest** | [**ConversationInsertKnowledgeBaseDocumentRequest**](ConversationInsertKnowledgeBaseDocumentRequest.md)| Insert request |

### Return type

[**ConversationInsertKnowledgeBaseDocumentResponse**](ConversationInsertKnowledgeBaseDocumentResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertAgentProfileMcp"></a>
# **insertAgentProfileMcp**
> ConversationMcpServerResponse insertAgentProfileMcp(userId, mcpServer)

Insert an agent MCP server

Insert an agent MCP server 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
ConversationMcpServer mcpServer = new ConversationMcpServer(); // ConversationMcpServer | MCP Server
try {
    ConversationMcpServerResponse result = apiInstance.insertAgentProfileMcp(userId, mcpServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertAgentProfileMcp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **mcpServer** | [**ConversationMcpServer**](ConversationMcpServer.md)| MCP Server |

### Return type

[**ConversationMcpServerResponse**](ConversationMcpServerResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertConversationCannedMessage"></a>
# **insertConversationCannedMessage**
> ConversationCannedMessageResponse insertConversationCannedMessage(cannedMessage)

Insert a canned message

Insert a canned message 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationCannedMessage cannedMessage = new ConversationCannedMessage(); // ConversationCannedMessage | Canned message
try {
    ConversationCannedMessageResponse result = apiInstance.insertConversationCannedMessage(cannedMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertConversationCannedMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cannedMessage** | [**ConversationCannedMessage**](ConversationCannedMessage.md)| Canned message |

### Return type

[**ConversationCannedMessageResponse**](ConversationCannedMessageResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertConversationDepartment"></a>
# **insertConversationDepartment**
> ConversationDepartmentResponse insertConversationDepartment(department)

Insert a department

Insert a department 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationDepartment department = new ConversationDepartment(); // ConversationDepartment | Department
try {
    ConversationDepartmentResponse result = apiInstance.insertConversationDepartment(department);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertConversationDepartment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **department** | [**ConversationDepartment**](ConversationDepartment.md)| Department |

### Return type

[**ConversationDepartmentResponse**](ConversationDepartmentResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertConversationEngagement"></a>
# **insertConversationEngagement**
> ConversationEngagementResponse insertConversationEngagement(engagement)

Insert a engagement

Insert a engagement 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationEngagement engagement = new ConversationEngagement(); // ConversationEngagement | Engagement
try {
    ConversationEngagementResponse result = apiInstance.insertConversationEngagement(engagement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertConversationEngagement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engagement** | [**ConversationEngagement**](ConversationEngagement.md)| Engagement |

### Return type

[**ConversationEngagementResponse**](ConversationEngagementResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertPbxAddress"></a>
# **insertPbxAddress**
> ConversationPbxAddressResponse insertPbxAddress(pbxAddress)

Insert pbx address

Insert a pbx address 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxAddress pbxAddress = new ConversationPbxAddress(); // ConversationPbxAddress | Pbx Address
try {
    ConversationPbxAddressResponse result = apiInstance.insertPbxAddress(pbxAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxAddress** | [**ConversationPbxAddress**](ConversationPbxAddress.md)| Pbx Address |

### Return type

[**ConversationPbxAddressResponse**](ConversationPbxAddressResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertPbxAudio"></a>
# **insertPbxAudio**
> ConversationPbxAudioResponse insertPbxAudio(pbxAudio)

Insert pbx audio

Insert a pbx audio 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxAudio pbxAudio = new ConversationPbxAudio(); // ConversationPbxAudio | Pbx Audio
try {
    ConversationPbxAudioResponse result = apiInstance.insertPbxAudio(pbxAudio);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxAudio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxAudio** | [**ConversationPbxAudio**](ConversationPbxAudio.md)| Pbx Audio |

### Return type

[**ConversationPbxAudioResponse**](ConversationPbxAudioResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertPbxClassOfService"></a>
# **insertPbxClassOfService**
> ConversationPbxClassOfServiceResponse insertPbxClassOfService(classOfService)

Insert pbx class of service

Create a new class of service 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxClassOfService classOfService = new ConversationPbxClassOfService(); // ConversationPbxClassOfService | Class of service
try {
    ConversationPbxClassOfServiceResponse result = apiInstance.insertPbxClassOfService(classOfService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxClassOfService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classOfService** | [**ConversationPbxClassOfService**](ConversationPbxClassOfService.md)| Class of service |

### Return type

[**ConversationPbxClassOfServiceResponse**](ConversationPbxClassOfServiceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="insertPbxHardwarePhone"></a>
# **insertPbxHardwarePhone**
> ConversationPbxHardwarePhoneResponse insertPbxHardwarePhone(pbxHardwarePhone)

Insert pbx hardware phone

Insert a pbx hardware phone 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxHardwarePhone pbxHardwarePhone = new ConversationPbxHardwarePhone(); // ConversationPbxHardwarePhone | Pbx Hardware Phone
try {
    ConversationPbxHardwarePhoneResponse result = apiInstance.insertPbxHardwarePhone(pbxHardwarePhone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxHardwarePhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxHardwarePhone** | [**ConversationPbxHardwarePhone**](ConversationPbxHardwarePhone.md)| Pbx Hardware Phone |

### Return type

[**ConversationPbxHardwarePhoneResponse**](ConversationPbxHardwarePhoneResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertPbxMenu"></a>
# **insertPbxMenu**
> ConversationPbxMenuResponse insertPbxMenu(pbxMenu)

Insert pbx menu

Insert a pbx menu 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxMenu pbxMenu = new ConversationPbxMenu(); // ConversationPbxMenu | Pbx Menu
try {
    ConversationPbxMenuResponse result = apiInstance.insertPbxMenu(pbxMenu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxMenu** | [**ConversationPbxMenu**](ConversationPbxMenu.md)| Pbx Menu |

### Return type

[**ConversationPbxMenuResponse**](ConversationPbxMenuResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertPbxQueue"></a>
# **insertPbxQueue**
> ConversationPbxQueueResponse insertPbxQueue(pbxQueue)

Insert pbx queue

Insert a pbx queue 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxQueue pbxQueue = new ConversationPbxQueue(); // ConversationPbxQueue | Pbx Queue
try {
    ConversationPbxQueueResponse result = apiInstance.insertPbxQueue(pbxQueue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxQueue** | [**ConversationPbxQueue**](ConversationPbxQueue.md)| Pbx Queue |

### Return type

[**ConversationPbxQueueResponse**](ConversationPbxQueueResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertPbxTimeBased"></a>
# **insertPbxTimeBased**
> ConversationPbxTimeBasedResponse insertPbxTimeBased(pbxTimeBased)

Insert pbx timeBased

Insert a pbx timeBased 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxTimeBased pbxTimeBased = new ConversationPbxTimeBased(); // ConversationPbxTimeBased | Pbx TimeBased
try {
    ConversationPbxTimeBasedResponse result = apiInstance.insertPbxTimeBased(pbxTimeBased);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxTimeBased");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxTimeBased** | [**ConversationPbxTimeBased**](ConversationPbxTimeBased.md)| Pbx TimeBased |

### Return type

[**ConversationPbxTimeBasedResponse**](ConversationPbxTimeBasedResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertPbxTimeRange"></a>
# **insertPbxTimeRange**
> ConversationPbxTimeRangeResponse insertPbxTimeRange(pbxTimeRange)

Insert pbx timeRange

Insert a pbx timeRange 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxTimeRange pbxTimeRange = new ConversationPbxTimeRange(); // ConversationPbxTimeRange | Pbx TimeRange
try {
    ConversationPbxTimeRangeResponse result = apiInstance.insertPbxTimeRange(pbxTimeRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxTimeRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxTimeRange** | [**ConversationPbxTimeRange**](ConversationPbxTimeRange.md)| Pbx TimeRange |

### Return type

[**ConversationPbxTimeRangeResponse**](ConversationPbxTimeRangeResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertPbxVoicemailMailbox"></a>
# **insertPbxVoicemailMailbox**
> ConversationPbxVoicemailMailboxResponse insertPbxVoicemailMailbox(pbxVoicemailMailbox)

Insert pbx voicemailMailbox

Insert a pbx voicemailMailbox 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxVoicemailMailbox pbxVoicemailMailbox = new ConversationPbxVoicemailMailbox(); // ConversationPbxVoicemailMailbox | Pbx VoicemailMailbox
try {
    ConversationPbxVoicemailMailboxResponse result = apiInstance.insertPbxVoicemailMailbox(pbxVoicemailMailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertPbxVoicemailMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbxVoicemailMailbox** | [**ConversationPbxVoicemailMailbox**](ConversationPbxVoicemailMailbox.md)| Pbx VoicemailMailbox |

### Return type

[**ConversationPbxVoicemailMailboxResponse**](ConversationPbxVoicemailMailboxResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="joinConversation"></a>
# **joinConversation**
> joinConversation(conversationUuid, joinRequest)

Join a conversation

Join a conversation 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationUuid = "conversationUuid_example"; // String | 
ConversationJoinRequest joinRequest = new ConversationJoinRequest(); // ConversationJoinRequest | Join request
try {
    apiInstance.joinConversation(conversationUuid, joinRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#joinConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationUuid** | **String**|  |
 **joinRequest** | [**ConversationJoinRequest**](ConversationJoinRequest.md)| Join request | [optional]

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="leaveConversation"></a>
# **leaveConversation**
> leaveConversation(conversationUuid)

Leave a conversation

Leave a conversation 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationUuid = "conversationUuid_example"; // String | 
try {
    apiInstance.leaveConversation(conversationUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#leaveConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listenedPbxAgentVoicemail"></a>
# **listenedPbxAgentVoicemail**
> listenedPbxAgentVoicemail(recordingSid)

Listened Agent Voicemail

Listened pbx agent Voicemail 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String recordingSid = "recordingSid_example"; // String | 
try {
    apiInstance.listenedPbxAgentVoicemail(recordingSid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#listenedPbxAgentVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **recordingSid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listenedPbxQueueVoicemail"></a>
# **listenedPbxQueueVoicemail**
> listenedPbxQueueVoicemail(queueUuid, recordingSid)

Listened Queue Voicemail

Listened pbx queue Voicemail 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String queueUuid = "queueUuid_example"; // String | 
String recordingSid = "recordingSid_example"; // String | 
try {
    apiInstance.listenedPbxQueueVoicemail(queueUuid, recordingSid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#listenedPbxQueueVoicemail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueUuid** | **String**|  |
 **recordingSid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="markReadConversation"></a>
# **markReadConversation**
> markReadConversation(conversationUuid)

Mark a conversation as read

Mark a conversation as read 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationUuid = "conversationUuid_example"; // String | 
try {
    apiInstance.markReadConversation(conversationUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#markReadConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="protectPbxPhoneNumber"></a>
# **protectPbxPhoneNumber**
> ConversationPbxPhoneNumberResponse protectPbxPhoneNumber(conversationPbxPhoneNumberUuid)

Protect pbx phoneNumber from deletion

Protect a pbx phoneNumber from deletion. This is a one-way operation and cannot be undone through the API. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxPhoneNumberUuid = "conversationPbxPhoneNumberUuid_example"; // String | 
try {
    ConversationPbxPhoneNumberResponse result = apiInstance.protectPbxPhoneNumber(conversationPbxPhoneNumberUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#protectPbxPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxPhoneNumberUuid** | **String**|  |

### Return type

[**ConversationPbxPhoneNumberResponse**](ConversationPbxPhoneNumberResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchasePbxPhoneNumber"></a>
# **purchasePbxPhoneNumber**
> ConversationPbxPhoneNumberResponse purchasePbxPhoneNumber(phoneNumberPurchaseRequest)

Purchase pbx phone number

Purchase a phone number from Twilio. The phone_number must be from the available phone number search results. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxPhoneNumberPurchaseRequest phoneNumberPurchaseRequest = new ConversationPbxPhoneNumberPurchaseRequest(); // ConversationPbxPhoneNumberPurchaseRequest | Phone number purchase request
try {
    ConversationPbxPhoneNumberResponse result = apiInstance.purchasePbxPhoneNumber(phoneNumberPurchaseRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#purchasePbxPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneNumberPurchaseRequest** | [**ConversationPbxPhoneNumberPurchaseRequest**](ConversationPbxPhoneNumberPurchaseRequest.md)| Phone number purchase request |

### Return type

[**ConversationPbxPhoneNumberResponse**](ConversationPbxPhoneNumberResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="regeneratePasswordForPbxHardwarePhone"></a>
# **regeneratePasswordForPbxHardwarePhone**
> ConversationPbxHardwarePhoneResponse regeneratePasswordForPbxHardwarePhone(conversationPbxHardwarePhoneUuid, pbxHardwarePhone)

Update pbx hardware phone

Update a pbx hardware phone 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxHardwarePhoneUuid = "conversationPbxHardwarePhoneUuid_example"; // String | 
ConversationPbxHardwarePhone pbxHardwarePhone = new ConversationPbxHardwarePhone(); // ConversationPbxHardwarePhone | Pbx Hardware Phone
try {
    ConversationPbxHardwarePhoneResponse result = apiInstance.regeneratePasswordForPbxHardwarePhone(conversationPbxHardwarePhoneUuid, pbxHardwarePhone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#regeneratePasswordForPbxHardwarePhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxHardwarePhoneUuid** | **String**|  |
 **pbxHardwarePhone** | [**ConversationPbxHardwarePhone**](ConversationPbxHardwarePhone.md)| Pbx Hardware Phone |

### Return type

[**ConversationPbxHardwarePhoneResponse**](ConversationPbxHardwarePhoneResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resetConversationPbxQueueStatistics"></a>
# **resetConversationPbxQueueStatistics**
> resetConversationPbxQueueStatistics(queueUuid)

reset statistics within the queue

reset statistics within the queue 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String queueUuid = "queueUuid_example"; // String | 
try {
    apiInstance.resetConversationPbxQueueStatistics(queueUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#resetConversationPbxQueueStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchConversationCannedMessages"></a>
# **searchConversationCannedMessages**
> ConversationCannedMessagesResponse searchConversationCannedMessages(searchRequest)

Search for canned messages by short_code

Search for canned messages by short_code 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationCannedMessagesSearch searchRequest = new ConversationCannedMessagesSearch(); // ConversationCannedMessagesSearch | Search request
try {
    ConversationCannedMessagesResponse result = apiInstance.searchConversationCannedMessages(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#searchConversationCannedMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRequest** | [**ConversationCannedMessagesSearch**](ConversationCannedMessagesSearch.md)| Search request |

### Return type

[**ConversationCannedMessagesResponse**](ConversationCannedMessagesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchPbxAvailablePhoneNumbers"></a>
# **searchPbxAvailablePhoneNumbers**
> ConversationPbxAvailablePhoneNumbersResponse searchPbxAvailablePhoneNumbers(country, areaCode, contains, smsEnabled, voiceEnabled, type, limit)

Search for available phone numbers

Search for available phone numbers from Twilio that can be purchased 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String country = "country_example"; // String | ISO country code (e.g., US, CA, GB)
String areaCode = "areaCode_example"; // String | Area code filter (e.g., 614)
String contains = "contains_example"; // String | Pattern to match (e.g., 555, *PIZZA)
Boolean smsEnabled = true; // Boolean | Filter for SMS capability
Boolean voiceEnabled = true; // Boolean | Filter for voice capability
String type = "type_example"; // String | Phone number type
Integer limit = 56; // Integer | Max results (default 20, max 100)
try {
    ConversationPbxAvailablePhoneNumbersResponse result = apiInstance.searchPbxAvailablePhoneNumbers(country, areaCode, contains, smsEnabled, voiceEnabled, type, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#searchPbxAvailablePhoneNumbers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**| ISO country code (e.g., US, CA, GB) |
 **areaCode** | **String**| Area code filter (e.g., 614) | [optional]
 **contains** | **String**| Pattern to match (e.g., 555, *PIZZA) | [optional]
 **smsEnabled** | **Boolean**| Filter for SMS capability | [optional]
 **voiceEnabled** | **Boolean**| Filter for voice capability | [optional]
 **type** | **String**| Phone number type | [optional]
 **limit** | **Integer**| Max results (default 20, max 100) | [optional]

### Return type

[**ConversationPbxAvailablePhoneNumbersResponse**](ConversationPbxAvailablePhoneNumbersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchPbxCalls"></a>
# **searchPbxCalls**
> ConversationPbxCallSearchResponse searchPbxCalls(searchRequest, limit, offset, sort)

Search pbx call records

Search and list PBX call records with filtering, sorting, and pagination 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationPbxCallSearchRequest searchRequest = new ConversationPbxCallSearchRequest(); // ConversationPbxCallSearchRequest | Search Request
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Maximum 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the calls.
try {
    ConversationPbxCallSearchResponse result = apiInstance.searchPbxCalls(searchRequest, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#searchPbxCalls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchRequest** | [**ConversationPbxCallSearchRequest**](ConversationPbxCallSearchRequest.md)| Search Request |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **sort** | **String**| The sort order of the calls. | [optional]

### Return type

[**ConversationPbxCallSearchResponse**](ConversationPbxCallSearchResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="smsUnsubscribeConversation"></a>
# **smsUnsubscribeConversation**
> smsUnsubscribeConversation(conversationUuid)

Unsubscribe any SMS participants in this conversation

Unsubscribe any SMS participants in this conversation 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationUuid = "conversationUuid_example"; // String | 
try {
    apiInstance.smsUnsubscribeConversation(conversationUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#smsUnsubscribeConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startConversation"></a>
# **startConversation**
> ConversationStartResponse startConversation(startRequest)

Start a conversation

Start a new conversation 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationStartRequest startRequest = new ConversationStartRequest(); // ConversationStartRequest | Start request
try {
    ConversationStartResponse result = apiInstance.startConversation(startRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#startConversation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startRequest** | [**ConversationStartRequest**](ConversationStartRequest.md)| Start request |

### Return type

[**ConversationStartResponse**](ConversationStartResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAgentProfile"></a>
# **updateAgentProfile**
> ConversationAgentProfileResponse updateAgentProfile(profileRequest)

Update agent profile

Update agent profile 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationAgentProfile profileRequest = new ConversationAgentProfile(); // ConversationAgentProfile | Profile request
try {
    ConversationAgentProfileResponse result = apiInstance.updateAgentProfile(profileRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateAgentProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profileRequest** | [**ConversationAgentProfile**](ConversationAgentProfile.md)| Profile request |

### Return type

[**ConversationAgentProfileResponse**](ConversationAgentProfileResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAgentProfileMcp"></a>
# **updateAgentProfileMcp**
> ConversationMcpServerResponse updateAgentProfileMcp(userId, mcpServerUuid, mcpServer)

Update an agent MCP server

Update an agent MCP server 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer userId = 56; // Integer | 
String mcpServerUuid = "mcpServerUuid_example"; // String | 
ConversationMcpServer mcpServer = new ConversationMcpServer(); // ConversationMcpServer | MCP Server
try {
    ConversationMcpServerResponse result = apiInstance.updateAgentProfileMcp(userId, mcpServerUuid, mcpServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateAgentProfileMcp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Integer**|  |
 **mcpServerUuid** | **String**|  |
 **mcpServer** | [**ConversationMcpServer**](ConversationMcpServer.md)| MCP Server |

### Return type

[**ConversationMcpServerResponse**](ConversationMcpServerResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConversationCannedMessage"></a>
# **updateConversationCannedMessage**
> ConversationCannedMessageResponse updateConversationCannedMessage(conversationCannedMessageOid, cannedMessage)

Update a canned message

Update a canned message 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer conversationCannedMessageOid = 56; // Integer | 
ConversationCannedMessage cannedMessage = new ConversationCannedMessage(); // ConversationCannedMessage | Canned message
try {
    ConversationCannedMessageResponse result = apiInstance.updateConversationCannedMessage(conversationCannedMessageOid, cannedMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateConversationCannedMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationCannedMessageOid** | **Integer**|  |
 **cannedMessage** | [**ConversationCannedMessage**](ConversationCannedMessage.md)| Canned message |

### Return type

[**ConversationCannedMessageResponse**](ConversationCannedMessageResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConversationDepartment"></a>
# **updateConversationDepartment**
> ConversationDepartmentResponse updateConversationDepartment(conversationDepartmentOid, department)

Update a department

Update a department 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer conversationDepartmentOid = 56; // Integer | 
ConversationDepartment department = new ConversationDepartment(); // ConversationDepartment | Department
try {
    ConversationDepartmentResponse result = apiInstance.updateConversationDepartment(conversationDepartmentOid, department);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateConversationDepartment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationDepartmentOid** | **Integer**|  |
 **department** | [**ConversationDepartment**](ConversationDepartment.md)| Department |

### Return type

[**ConversationDepartmentResponse**](ConversationDepartmentResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConversationEngagement"></a>
# **updateConversationEngagement**
> ConversationEngagementResponse updateConversationEngagement(conversationEngagementOid, engagement)

Update a engagement

Update a engagement 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

Integer conversationEngagementOid = 56; // Integer | 
ConversationEngagement engagement = new ConversationEngagement(); // ConversationEngagement | Engagement
try {
    ConversationEngagementResponse result = apiInstance.updateConversationEngagement(conversationEngagementOid, engagement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateConversationEngagement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationEngagementOid** | **Integer**|  |
 **engagement** | [**ConversationEngagement**](ConversationEngagement.md)| Engagement |

### Return type

[**ConversationEngagementResponse**](ConversationEngagementResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConversationWebchatQueueStatus"></a>
# **updateConversationWebchatQueueStatus**
> updateConversationWebchatQueueStatus(queueName, statusRequest)

Update status within the queue

Update status within the queue 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String queueName = "queueName_example"; // String | 
ConversationWebchatQueueStatusUpdateRequest statusRequest = new ConversationWebchatQueueStatusUpdateRequest(); // ConversationWebchatQueueStatusUpdateRequest | Status request
try {
    apiInstance.updateConversationWebchatQueueStatus(queueName, statusRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateConversationWebchatQueueStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queueName** | **String**|  |
 **statusRequest** | [**ConversationWebchatQueueStatusUpdateRequest**](ConversationWebchatQueueStatusUpdateRequest.md)| Status request |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxAddress"></a>
# **updatePbxAddress**
> ConversationPbxAddressResponse updatePbxAddress(conversationPbxAddressUuid, pbxAddress)

Update pbx address

Update a pbx address 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAddressUuid = "conversationPbxAddressUuid_example"; // String | 
ConversationPbxAddress pbxAddress = new ConversationPbxAddress(); // ConversationPbxAddress | Pbx Address
try {
    ConversationPbxAddressResponse result = apiInstance.updatePbxAddress(conversationPbxAddressUuid, pbxAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAddressUuid** | **String**|  |
 **pbxAddress** | [**ConversationPbxAddress**](ConversationPbxAddress.md)| Pbx Address |

### Return type

[**ConversationPbxAddressResponse**](ConversationPbxAddressResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxAgent"></a>
# **updatePbxAgent**
> ConversationPbxAgentResponse updatePbxAgent(conversationPbxAgentUuid, pbxAgent)

Update pbx agent

Update a pbx agent 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAgentUuid = "conversationPbxAgentUuid_example"; // String | 
ConversationPbxAgent pbxAgent = new ConversationPbxAgent(); // ConversationPbxAgent | Pbx Agent
try {
    ConversationPbxAgentResponse result = apiInstance.updatePbxAgent(conversationPbxAgentUuid, pbxAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxAgent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAgentUuid** | **String**|  |
 **pbxAgent** | [**ConversationPbxAgent**](ConversationPbxAgent.md)| Pbx Agent |

### Return type

[**ConversationPbxAgentResponse**](ConversationPbxAgentResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxAudio"></a>
# **updatePbxAudio**
> ConversationPbxAudioResponse updatePbxAudio(conversationPbxAudioUuid, pbxAudio)

Update pbx audio

Update a pbx audio 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxAudioUuid = "conversationPbxAudioUuid_example"; // String | 
ConversationPbxAudio pbxAudio = new ConversationPbxAudio(); // ConversationPbxAudio | Pbx Audio
try {
    ConversationPbxAudioResponse result = apiInstance.updatePbxAudio(conversationPbxAudioUuid, pbxAudio);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxAudio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxAudioUuid** | **String**|  |
 **pbxAudio** | [**ConversationPbxAudio**](ConversationPbxAudio.md)| Pbx Audio |

### Return type

[**ConversationPbxAudioResponse**](ConversationPbxAudioResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxClassOfService"></a>
# **updatePbxClassOfService**
> ConversationPbxClassOfServiceResponse updatePbxClassOfService(classOfServiceUuid, classOfService)

Update pbx class of service

Update an existing class of service 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String classOfServiceUuid = "classOfServiceUuid_example"; // String | 
ConversationPbxClassOfService classOfService = new ConversationPbxClassOfService(); // ConversationPbxClassOfService | Class of service
try {
    ConversationPbxClassOfServiceResponse result = apiInstance.updatePbxClassOfService(classOfServiceUuid, classOfService);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxClassOfService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **classOfServiceUuid** | **String**|  |
 **classOfService** | [**ConversationPbxClassOfService**](ConversationPbxClassOfService.md)| Class of service |

### Return type

[**ConversationPbxClassOfServiceResponse**](ConversationPbxClassOfServiceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updatePbxHardwarePhone"></a>
# **updatePbxHardwarePhone**
> ConversationPbxHardwarePhoneResponse updatePbxHardwarePhone(conversationPbxHardwarePhoneUuid, pbxHardwarePhone)

Update pbx hardware phone

Update a pbx hardware phone 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxHardwarePhoneUuid = "conversationPbxHardwarePhoneUuid_example"; // String | 
ConversationPbxHardwarePhone pbxHardwarePhone = new ConversationPbxHardwarePhone(); // ConversationPbxHardwarePhone | Pbx Hardware Phone
try {
    ConversationPbxHardwarePhoneResponse result = apiInstance.updatePbxHardwarePhone(conversationPbxHardwarePhoneUuid, pbxHardwarePhone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxHardwarePhone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxHardwarePhoneUuid** | **String**|  |
 **pbxHardwarePhone** | [**ConversationPbxHardwarePhone**](ConversationPbxHardwarePhone.md)| Pbx Hardware Phone |

### Return type

[**ConversationPbxHardwarePhoneResponse**](ConversationPbxHardwarePhoneResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxMenu"></a>
# **updatePbxMenu**
> ConversationPbxMenuResponse updatePbxMenu(conversationPbxMenuUuid, pbxMenu)

Update pbx menu

Update a pbx menu 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxMenuUuid = "conversationPbxMenuUuid_example"; // String | 
ConversationPbxMenu pbxMenu = new ConversationPbxMenu(); // ConversationPbxMenu | Pbx Menu
try {
    ConversationPbxMenuResponse result = apiInstance.updatePbxMenu(conversationPbxMenuUuid, pbxMenu);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxMenuUuid** | **String**|  |
 **pbxMenu** | [**ConversationPbxMenu**](ConversationPbxMenu.md)| Pbx Menu |

### Return type

[**ConversationPbxMenuResponse**](ConversationPbxMenuResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxPhoneNumber"></a>
# **updatePbxPhoneNumber**
> ConversationPbxPhoneNumberResponse updatePbxPhoneNumber(conversationPbxPhoneNumberUuid, pbxPhoneNumber)

Update pbx phoneNumber

Update a pbx phoneNumber 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxPhoneNumberUuid = "conversationPbxPhoneNumberUuid_example"; // String | 
ConversationPbxPhoneNumber pbxPhoneNumber = new ConversationPbxPhoneNumber(); // ConversationPbxPhoneNumber | Pbx PhoneNumber
try {
    ConversationPbxPhoneNumberResponse result = apiInstance.updatePbxPhoneNumber(conversationPbxPhoneNumberUuid, pbxPhoneNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxPhoneNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxPhoneNumberUuid** | **String**|  |
 **pbxPhoneNumber** | [**ConversationPbxPhoneNumber**](ConversationPbxPhoneNumber.md)| Pbx PhoneNumber |

### Return type

[**ConversationPbxPhoneNumberResponse**](ConversationPbxPhoneNumberResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxQueue"></a>
# **updatePbxQueue**
> ConversationPbxQueueResponse updatePbxQueue(conversationPbxQueueUuid, pbxQueue)

Update pbx queue

Update a pbx queue 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxQueueUuid = "conversationPbxQueueUuid_example"; // String | 
ConversationPbxQueue pbxQueue = new ConversationPbxQueue(); // ConversationPbxQueue | Pbx Queue
try {
    ConversationPbxQueueResponse result = apiInstance.updatePbxQueue(conversationPbxQueueUuid, pbxQueue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxQueueUuid** | **String**|  |
 **pbxQueue** | [**ConversationPbxQueue**](ConversationPbxQueue.md)| Pbx Queue |

### Return type

[**ConversationPbxQueueResponse**](ConversationPbxQueueResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxTimeBased"></a>
# **updatePbxTimeBased**
> ConversationPbxTimeBasedResponse updatePbxTimeBased(conversationPbxTimeBasedUuid, pbxTimeBased)

Update pbx timeBased

Update a pbx timeBased 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxTimeBasedUuid = "conversationPbxTimeBasedUuid_example"; // String | 
ConversationPbxTimeBased pbxTimeBased = new ConversationPbxTimeBased(); // ConversationPbxTimeBased | Pbx TimeBased
try {
    ConversationPbxTimeBasedResponse result = apiInstance.updatePbxTimeBased(conversationPbxTimeBasedUuid, pbxTimeBased);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxTimeBased");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxTimeBasedUuid** | **String**|  |
 **pbxTimeBased** | [**ConversationPbxTimeBased**](ConversationPbxTimeBased.md)| Pbx TimeBased |

### Return type

[**ConversationPbxTimeBasedResponse**](ConversationPbxTimeBasedResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxTimeRange"></a>
# **updatePbxTimeRange**
> ConversationPbxTimeRangeResponse updatePbxTimeRange(conversationPbxTimeRangeUuid, pbxTimeRange)

Update pbx timeRange

Update a pbx timeRange 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxTimeRangeUuid = "conversationPbxTimeRangeUuid_example"; // String | 
ConversationPbxTimeRange pbxTimeRange = new ConversationPbxTimeRange(); // ConversationPbxTimeRange | Pbx TimeRange
try {
    ConversationPbxTimeRangeResponse result = apiInstance.updatePbxTimeRange(conversationPbxTimeRangeUuid, pbxTimeRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxTimeRange");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxTimeRangeUuid** | **String**|  |
 **pbxTimeRange** | [**ConversationPbxTimeRange**](ConversationPbxTimeRange.md)| Pbx TimeRange |

### Return type

[**ConversationPbxTimeRangeResponse**](ConversationPbxTimeRangeResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePbxVoicemailMailbox"></a>
# **updatePbxVoicemailMailbox**
> ConversationPbxVoicemailMailboxResponse updatePbxVoicemailMailbox(conversationPbxVoicemailMailboxUuid, pbxVoicemailMailbox)

Update pbx voicemailMailbox

Update a pbx voicemailMailbox 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

String conversationPbxVoicemailMailboxUuid = "conversationPbxVoicemailMailboxUuid_example"; // String | 
ConversationPbxVoicemailMailbox pbxVoicemailMailbox = new ConversationPbxVoicemailMailbox(); // ConversationPbxVoicemailMailbox | Pbx VoicemailMailbox
try {
    ConversationPbxVoicemailMailboxResponse result = apiInstance.updatePbxVoicemailMailbox(conversationPbxVoicemailMailboxUuid, pbxVoicemailMailbox);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updatePbxVoicemailMailbox");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **conversationPbxVoicemailMailboxUuid** | **String**|  |
 **pbxVoicemailMailbox** | [**ConversationPbxVoicemailMailbox**](ConversationPbxVoicemailMailbox.md)| Pbx VoicemailMailbox |

### Return type

[**ConversationPbxVoicemailMailboxResponse**](ConversationPbxVoicemailMailboxResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVirtualAgentBudget"></a>
# **updateVirtualAgentBudget**
> ConversationVirtualAgentBudgetResponse updateVirtualAgentBudget(virtualAgentBudget)

Update virtual agent budget

Update virtual agent budget 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationVirtualAgentBudget virtualAgentBudget = new ConversationVirtualAgentBudget(); // ConversationVirtualAgentBudget | Virtual Agent Budget
try {
    ConversationVirtualAgentBudgetResponse result = apiInstance.updateVirtualAgentBudget(virtualAgentBudget);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateVirtualAgentBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **virtualAgentBudget** | [**ConversationVirtualAgentBudget**](ConversationVirtualAgentBudget.md)| Virtual Agent Budget |

### Return type

[**ConversationVirtualAgentBudgetResponse**](ConversationVirtualAgentBudgetResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateVirtualAgentCapabilities"></a>
# **updateVirtualAgentCapabilities**
> ConversationVirtualAgentCapabilitiesResponse updateVirtualAgentCapabilities(virtualAgentCapabilities)

Update virtual agent capabilities

Update virtual agent capabilities 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConversationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConversationApi apiInstance = new ConversationApi(apiKey);

ConversationVirtualAgentCapabilities virtualAgentCapabilities = new ConversationVirtualAgentCapabilities(); // ConversationVirtualAgentCapabilities | Virtual Agent Capabilities
try {
    ConversationVirtualAgentCapabilitiesResponse result = apiInstance.updateVirtualAgentCapabilities(virtualAgentCapabilities);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateVirtualAgentCapabilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **virtualAgentCapabilities** | [**ConversationVirtualAgentCapabilities**](ConversationVirtualAgentCapabilities.md)| Virtual Agent Capabilities |

### Return type

[**ConversationVirtualAgentCapabilitiesResponse**](ConversationVirtualAgentCapabilitiesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

