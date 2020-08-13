# StorefrontApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addToLibrary**](StorefrontApi.md#addToLibrary) | **POST** /storefront/code_library | Add to library
[**applyToStoreFront**](StorefrontApi.md#applyToStoreFront) | **POST** /storefront/code_library/{library_item_oid}/applyToStoreFront/{storefront_oid} | Apply library item to storefront.
[**archiveEmailList**](StorefrontApi.md#archiveEmailList) | **POST** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/archive | Archive email list
[**archiveEmailSegment**](StorefrontApi.md#archiveEmailSegment) | **POST** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/archive | Archive email segment
[**backPopulateEmailFlow**](StorefrontApi.md#backPopulateEmailFlow) | **POST** /storefront/{storefront_oid}/email/flows/{email_flow_uuid}/backfill | Back populate email flow
[**checkDownloadEmailSegment**](StorefrontApi.md#checkDownloadEmailSegment) | **POST** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/downloadPrepare/{email_segment_rebuild_uuid} | Check download of email segment
[**cloneEmailCampaign**](StorefrontApi.md#cloneEmailCampaign) | **POST** /storefront/{storefront_oid}/email/campaigns/{email_campaign_uuid}/clone | Clone email campaign
[**cloneEmailFlow**](StorefrontApi.md#cloneEmailFlow) | **POST** /storefront/{storefront_oid}/email/flows/{email_flow_uuid}/clone | Clone email flow
[**cloneLibraryItem**](StorefrontApi.md#cloneLibraryItem) | **POST** /storefront/code_library/{library_item_oid}/clone | Clone public library item.
[**createEmailSendingDomain**](StorefrontApi.md#createEmailSendingDomain) | **POST** /storefront/email/sending_domains/{domain}/create | Create email campaign
[**deleteEmailCommseqStat**](StorefrontApi.md#deleteEmailCommseqStat) | **DELETE** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/stat | Delete communication sequence stats
[**deleteEmailEmail**](StorefrontApi.md#deleteEmailEmail) | **DELETE** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid} | Delete email email
[**deleteEmailListCustomer**](StorefrontApi.md#deleteEmailListCustomer) | **DELETE** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/customers/{email_customer_uuid} | Delete email list customer
[**deleteEmailPostcard**](StorefrontApi.md#deleteEmailPostcard) | **DELETE** /storefront/{storefront_oid}/email/postcards/{commseq_postcard_uuid} | Delete email postcard
[**deleteEmailSendingDomain**](StorefrontApi.md#deleteEmailSendingDomain) | **DELETE** /storefront/email/sending_domains/{domain} | delete email campaign
[**deleteExperiment**](StorefrontApi.md#deleteExperiment) | **DELETE** /storefront/{storefront_oid}/experiments/{storefront_experiment_oid} | Delete experiment
[**deleteLibraryItem**](StorefrontApi.md#deleteLibraryItem) | **DELETE** /storefront/code_library/{library_item_oid} | Delete library item
[**duplicateLibraryItem**](StorefrontApi.md#duplicateLibraryItem) | **POST** /storefront/code_library/{library_item_oid}/duplicate | Duplicate library item.
[**geocodeAddress**](StorefrontApi.md#geocodeAddress) | **POST** /storefront/{storefront_oid}/email/geocode | Obtain lat/long for an address
[**getCountries**](StorefrontApi.md#getCountries) | **GET** /storefront/{storefront_oid}/email/countries | Get countries
[**getEditorToken**](StorefrontApi.md#getEditorToken) | **GET** /storefront/{storefront_oid}/editor_token | Gets editor token
[**getEmailBaseTemplates**](StorefrontApi.md#getEmailBaseTemplates) | **GET** /storefront/{storefront_oid}/email/baseTemplates | Get email communication base templates
[**getEmailCampaign**](StorefrontApi.md#getEmailCampaign) | **GET** /storefront/{storefront_oid}/email/campaigns/{email_campaign_uuid} | Get email campaign
[**getEmailCampaigns**](StorefrontApi.md#getEmailCampaigns) | **GET** /storefront/{storefront_oid}/email/campaigns | Get email campaigns
[**getEmailCampaignsWithStats**](StorefrontApi.md#getEmailCampaignsWithStats) | **GET** /storefront/{storefront_oid}/email/campaignsWithStats/{stat_days} | Get email campaigns with stats
[**getEmailCommseq**](StorefrontApi.md#getEmailCommseq) | **GET** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid} | Get email commseq
[**getEmailCommseqEmailStats**](StorefrontApi.md#getEmailCommseqEmailStats) | **POST** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/emailStats | Get email communication sequence emails stats
[**getEmailCommseqPostcardStats**](StorefrontApi.md#getEmailCommseqPostcardStats) | **POST** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/postcardStats | Get email communication sequence postcard stats
[**getEmailCommseqStatOverall**](StorefrontApi.md#getEmailCommseqStatOverall) | **GET** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/stat | Get communication sequence stats overall
[**getEmailCommseqStepStats**](StorefrontApi.md#getEmailCommseqStepStats) | **POST** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/stepStats | Get email communication sequence step stats
[**getEmailCommseqStepWaiting**](StorefrontApi.md#getEmailCommseqStepWaiting) | **POST** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/waiting | Get email communication sequence customers waiting at each requested step
[**getEmailCommseqs**](StorefrontApi.md#getEmailCommseqs) | **GET** /storefront/{storefront_oid}/email/commseqs | Get email commseqs
[**getEmailCustomerEditorUrl**](StorefrontApi.md#getEmailCustomerEditorUrl) | **GET** /storefront/{storefront_oid}/email/customers/{email_customer_uuid}/editor_url | Get customers editor URL
[**getEmailCustomers**](StorefrontApi.md#getEmailCustomers) | **GET** /storefront/{storefront_oid}/email/customers | Get email customers
[**getEmailDashboardActivity**](StorefrontApi.md#getEmailDashboardActivity) | **GET** /storefront/{storefront_oid}/email/dashboard_activity | Get email dashboard activity
[**getEmailDashboardStats**](StorefrontApi.md#getEmailDashboardStats) | **GET** /storefront/{storefront_oid}/email/dashboard_stats | Get dashboard stats
[**getEmailEmail**](StorefrontApi.md#getEmailEmail) | **GET** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid} | Get email email
[**getEmailEmailClicks**](StorefrontApi.md#getEmailEmailClicks) | **GET** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/steps/{commseq_step_uuid}/emails/{commseq_email_uuid}/clicks | Get email email clicks
[**getEmailEmailCustomerEditorUrl**](StorefrontApi.md#getEmailEmailCustomerEditorUrl) | **GET** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid}/orders/{order_id}/editor_url | Get email order customer editor url
[**getEmailEmailOrders**](StorefrontApi.md#getEmailEmailOrders) | **GET** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/steps/{commseq_step_uuid}/emails/{commseq_email_uuid}/orders | Get email email orders
[**getEmailEmails**](StorefrontApi.md#getEmailEmails) | **GET** /storefront/{storefront_oid}/email/emails | Get email emails
[**getEmailEmailsMultiple**](StorefrontApi.md#getEmailEmailsMultiple) | **POST** /storefront/{storefront_oid}/email/emails/multiple | Get email emails multiple
[**getEmailFlow**](StorefrontApi.md#getEmailFlow) | **GET** /storefront/{storefront_oid}/email/flows/{email_flow_uuid} | Get email flow
[**getEmailFlows**](StorefrontApi.md#getEmailFlows) | **GET** /storefront/{storefront_oid}/email/flows | Get email flows
[**getEmailGlobalSettings**](StorefrontApi.md#getEmailGlobalSettings) | **GET** /storefront/email/global_settings | Get email globalsettings
[**getEmailList**](StorefrontApi.md#getEmailList) | **GET** /storefront/{storefront_oid}/email/lists/{email_list_uuid} | Get email list
[**getEmailListCustomerEditorUrl**](StorefrontApi.md#getEmailListCustomerEditorUrl) | **GET** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/customers/{email_customer_uuid}/editor_url | Get email list customer editor url
[**getEmailListCustomers**](StorefrontApi.md#getEmailListCustomers) | **GET** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/customers | Get email list customers
[**getEmailLists**](StorefrontApi.md#getEmailLists) | **GET** /storefront/{storefront_oid}/email/lists | Get email lists
[**getEmailPerformance**](StorefrontApi.md#getEmailPerformance) | **GET** /storefront/{storefront_oid}/email/performance | Get email performance
[**getEmailPlan**](StorefrontApi.md#getEmailPlan) | **GET** /storefront/{storefront_oid}/email/plan | Get email plan
[**getEmailPostcard**](StorefrontApi.md#getEmailPostcard) | **GET** /storefront/{storefront_oid}/email/postcards/{commseq_postcard_uuid} | Get email postcard
[**getEmailPostcards**](StorefrontApi.md#getEmailPostcards) | **GET** /storefront/{storefront_oid}/email/postcards | Get email postcards
[**getEmailPostcardsMultiple**](StorefrontApi.md#getEmailPostcardsMultiple) | **POST** /storefront/{storefront_oid}/email/postcards/multiple | Get email postcards multiple
[**getEmailSegment**](StorefrontApi.md#getEmailSegment) | **GET** /storefront/{storefront_oid}/email/segments/{email_segment_uuid} | Get email segment
[**getEmailSegmentCustomerEditorUrl**](StorefrontApi.md#getEmailSegmentCustomerEditorUrl) | **GET** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/customers/{email_customer_uuid}/editor_url | Get email segment customers editor URL
[**getEmailSegmentCustomers**](StorefrontApi.md#getEmailSegmentCustomers) | **GET** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/customers | Get email segment customers
[**getEmailSegments**](StorefrontApi.md#getEmailSegments) | **GET** /storefront/{storefront_oid}/email/segments | Get email segments
[**getEmailSendingDomain**](StorefrontApi.md#getEmailSendingDomain) | **GET** /storefront/email/sending_domain/{domain} | Get email sending domain
[**getEmailSendingDomainStatus**](StorefrontApi.md#getEmailSendingDomainStatus) | **POST** /storefront/email/sending_domains/{domain}/status | Get email sending domain status
[**getEmailSendingDomains**](StorefrontApi.md#getEmailSendingDomains) | **GET** /storefront/email/sending_domains | Get email sending domains
[**getEmailSettings**](StorefrontApi.md#getEmailSettings) | **GET** /storefront/{storefront_oid}/email/settings | Get email settings
[**getEmailTemplate**](StorefrontApi.md#getEmailTemplate) | **GET** /storefront/{storefront_oid}/email/templates/{email_template_oid} | Get email template
[**getEmailTemplates**](StorefrontApi.md#getEmailTemplates) | **GET** /storefront/{storefront_oid}/email/templates | Get email templates
[**getEmailThirdPartyProviders**](StorefrontApi.md#getEmailThirdPartyProviders) | **GET** /storefront/{storefront_oid}/email/third_party_providers | Get a list of third party email providers
[**getExperiments**](StorefrontApi.md#getExperiments) | **GET** /storefront/{storefront_oid}/experiments | Get experiments
[**getHistogramPropertyNames**](StorefrontApi.md#getHistogramPropertyNames) | **GET** /storefront/{storefront_oid}/email/histogram/property_names | Get histogram property names
[**getHistogramPropertyValues**](StorefrontApi.md#getHistogramPropertyValues) | **GET** /storefront/{storefront_oid}/email/histogram/property_values | Get histogram property values
[**getLibraryFilterValues**](StorefrontApi.md#getLibraryFilterValues) | **GET** /storefront/code_library/filter_values | Get library values used to populate drop down boxes for filtering.
[**getLibraryItem**](StorefrontApi.md#getLibraryItem) | **GET** /storefront/code_library/{library_item_oid} | Get library item.
[**getLibraryItemsByQuery**](StorefrontApi.md#getLibraryItemsByQuery) | **POST** /storefront/code_library/query | Retrieve library items
[**getTransactionEmail**](StorefrontApi.md#getTransactionEmail) | **GET** /storefront/{storefront_oid}/transaction_email/list/{email_id} | Gets a transaction email object
[**getTransactionEmailList**](StorefrontApi.md#getTransactionEmailList) | **GET** /storefront/{storefront_oid}/transaction_email/list | Gets a list of transaction email names
[**globalUnsubscribe**](StorefrontApi.md#globalUnsubscribe) | **POST** /storefront/{storefront_oid}/email/globalUnsubscribe | Globally unsubscribe a customer
[**importEmailThirdPartyProviderList**](StorefrontApi.md#importEmailThirdPartyProviderList) | **POST** /storefront/{storefront_oid}/email/third_party_providers/import | Import a third party provider list
[**insertEmailCampaign**](StorefrontApi.md#insertEmailCampaign) | **POST** /storefront/{storefront_oid}/email/campaigns | Insert email campaign
[**insertEmailCommseq**](StorefrontApi.md#insertEmailCommseq) | **POST** /storefront/{storefront_oid}/email/commseqs | Insert email commseq
[**insertEmailEmail**](StorefrontApi.md#insertEmailEmail) | **POST** /storefront/{storefront_oid}/email/emails | Insert email email
[**insertEmailFlow**](StorefrontApi.md#insertEmailFlow) | **POST** /storefront/{storefront_oid}/email/flows | Insert email flow
[**insertEmailList**](StorefrontApi.md#insertEmailList) | **POST** /storefront/{storefront_oid}/email/lists | Insert email list
[**insertEmailPostcard**](StorefrontApi.md#insertEmailPostcard) | **POST** /storefront/{storefront_oid}/email/postcards | Insert email postcard
[**insertEmailSegment**](StorefrontApi.md#insertEmailSegment) | **POST** /storefront/{storefront_oid}/email/segments | Insert email segment
[**prepareDownloadEmailSegment**](StorefrontApi.md#prepareDownloadEmailSegment) | **POST** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/downloadPrepare | Prepare download of email segment
[**releaseEmailCommseqStepWaiting**](StorefrontApi.md#releaseEmailCommseqStepWaiting) | **POST** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/waiting/{commseq_step_uuid} | Release email communication sequence customers waiting at the specified step
[**review**](StorefrontApi.md#review) | **POST** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid}/review | Request a review of an email
[**search**](StorefrontApi.md#search) | **GET** /storefront/search | Searches for all matching values
[**searchEmailListCustomers**](StorefrontApi.md#searchEmailListCustomers) | **GET** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/search | Search email list customers
[**searchEmailSegmentCustomers**](StorefrontApi.md#searchEmailSegmentCustomers) | **GET** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/search | Search email segment customers
[**sendEmailTest**](StorefrontApi.md#sendEmailTest) | **POST** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid}/test | Send email test
[**sendPostcardTest**](StorefrontApi.md#sendPostcardTest) | **POST** /storefront/{storefront_oid}/email/postcards/{commseq_postcard_uuid}/test | Send postcard test
[**startEmailCampaign**](StorefrontApi.md#startEmailCampaign) | **PUT** /storefront/{storefront_oid}/email/campaigns/{email_campaign_uuid}/start | Start email campaign
[**subscribeToEmailList**](StorefrontApi.md#subscribeToEmailList) | **POST** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/subscribe | Subscribe customers to email list
[**updateEmailCampaign**](StorefrontApi.md#updateEmailCampaign) | **PUT** /storefront/{storefront_oid}/email/campaigns/{email_campaign_uuid} | Update email campaign
[**updateEmailCommseq**](StorefrontApi.md#updateEmailCommseq) | **PUT** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid} | Update email commseq
[**updateEmailCustomer**](StorefrontApi.md#updateEmailCustomer) | **PUT** /storefront/{storefront_oid}/email/customers/{email_customer_uuid} | Update email customer
[**updateEmailEmail**](StorefrontApi.md#updateEmailEmail) | **PUT** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid} | Update email email
[**updateEmailFlow**](StorefrontApi.md#updateEmailFlow) | **PUT** /storefront/{storefront_oid}/email/flows/{email_flow_uuid} | Update email flow
[**updateEmailGlobalSettings**](StorefrontApi.md#updateEmailGlobalSettings) | **POST** /storefront/email/global_settings | Update email global settings
[**updateEmailList**](StorefrontApi.md#updateEmailList) | **PUT** /storefront/{storefront_oid}/email/lists/{email_list_uuid} | Update email list
[**updateEmailPlan**](StorefrontApi.md#updateEmailPlan) | **POST** /storefront/{storefront_oid}/email/plan | Update email plan
[**updateEmailPostcard**](StorefrontApi.md#updateEmailPostcard) | **PUT** /storefront/{storefront_oid}/email/postcards/{commseq_postcard_uuid} | Update email postcard
[**updateEmailSegment**](StorefrontApi.md#updateEmailSegment) | **PUT** /storefront/{storefront_oid}/email/segments/{email_segment_uuid} | Update email segment
[**updateEmailSettings**](StorefrontApi.md#updateEmailSettings) | **POST** /storefront/{storefront_oid}/email/settings | Update email settings
[**updateExperiment**](StorefrontApi.md#updateExperiment) | **PUT** /storefront/{storefront_oid}/experiments/{storefront_experiment_oid} | Update experiment
[**updateLibraryItem**](StorefrontApi.md#updateLibraryItem) | **PUT** /storefront/code_library/{library_item_oid} | Update library item. Note that only certain fields may be updated via this method.
[**updateTransactionEmail**](StorefrontApi.md#updateTransactionEmail) | **PUT** /storefront/{storefront_oid}/transaction_email/list/{email_id} | Updates a transaction email object


<a name="addToLibrary"></a>
# **addToLibrary**
> LibraryItemResponse addToLibrary(addLibraryRequest)

Add to library

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
AddLibraryItemRequest addLibraryRequest = new AddLibraryItemRequest(); // AddLibraryItemRequest | New library item
try {
    LibraryItemResponse result = apiInstance.addToLibrary(addLibraryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#addToLibrary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addLibraryRequest** | [**AddLibraryItemRequest**](AddLibraryItemRequest.md)| New library item |

### Return type

[**LibraryItemResponse**](LibraryItemResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="applyToStoreFront"></a>
# **applyToStoreFront**
> ApplyLibraryItemResponse applyToStoreFront(libraryItemOid, storefrontOid)

Apply library item to storefront.

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer libraryItemOid = 56; // Integer | 
Integer storefrontOid = 56; // Integer | 
try {
    ApplyLibraryItemResponse result = apiInstance.applyToStoreFront(libraryItemOid, storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#applyToStoreFront");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryItemOid** | **Integer**|  |
 **storefrontOid** | **Integer**|  |

### Return type

[**ApplyLibraryItemResponse**](ApplyLibraryItemResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="archiveEmailList"></a>
# **archiveEmailList**
> EmailListArchiveResponse archiveEmailList(storefrontOid, emailListUuid)

Archive email list

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailListUuid = "emailListUuid_example"; // String | 
try {
    EmailListArchiveResponse result = apiInstance.archiveEmailList(storefrontOid, emailListUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#archiveEmailList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailListUuid** | **String**|  |

### Return type

[**EmailListArchiveResponse**](EmailListArchiveResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="archiveEmailSegment"></a>
# **archiveEmailSegment**
> EmailSegmentArchiveResponse archiveEmailSegment(storefrontOid, emailSegmentUuid)

Archive email segment

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailSegmentUuid = "emailSegmentUuid_example"; // String | 
try {
    EmailSegmentArchiveResponse result = apiInstance.archiveEmailSegment(storefrontOid, emailSegmentUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#archiveEmailSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegmentUuid** | **String**|  |

### Return type

[**EmailSegmentArchiveResponse**](EmailSegmentArchiveResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="backPopulateEmailFlow"></a>
# **backPopulateEmailFlow**
> EmailFlowBackPopulateResponse backPopulateEmailFlow(storefrontOid, emailFlowUuid, backPopulateRequest)

Back populate email flow

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailFlowUuid = "emailFlowUuid_example"; // String | 
EmailFlowBackPopulateRequest backPopulateRequest = new EmailFlowBackPopulateRequest(); // EmailFlowBackPopulateRequest | The request to back populate
try {
    EmailFlowBackPopulateResponse result = apiInstance.backPopulateEmailFlow(storefrontOid, emailFlowUuid, backPopulateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#backPopulateEmailFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailFlowUuid** | **String**|  |
 **backPopulateRequest** | [**EmailFlowBackPopulateRequest**](EmailFlowBackPopulateRequest.md)| The request to back populate |

### Return type

[**EmailFlowBackPopulateResponse**](EmailFlowBackPopulateResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkDownloadEmailSegment"></a>
# **checkDownloadEmailSegment**
> EmailSegmentDownloadPrepareResponse checkDownloadEmailSegment(storefrontOid, emailSegmentUuid, emailSegmentRebuildUuid)

Check download of email segment

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailSegmentUuid = "emailSegmentUuid_example"; // String | 
String emailSegmentRebuildUuid = "emailSegmentRebuildUuid_example"; // String | 
try {
    EmailSegmentDownloadPrepareResponse result = apiInstance.checkDownloadEmailSegment(storefrontOid, emailSegmentUuid, emailSegmentRebuildUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#checkDownloadEmailSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegmentUuid** | **String**|  |
 **emailSegmentRebuildUuid** | **String**|  |

### Return type

[**EmailSegmentDownloadPrepareResponse**](EmailSegmentDownloadPrepareResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloneEmailCampaign"></a>
# **cloneEmailCampaign**
> EmailCampaignResponse cloneEmailCampaign(storefrontOid, emailCampaignUuid, targetStorefrontOid)

Clone email campaign

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailCampaignUuid = "emailCampaignUuid_example"; // String | 
Integer targetStorefrontOid = 56; // Integer | 
try {
    EmailCampaignResponse result = apiInstance.cloneEmailCampaign(storefrontOid, emailCampaignUuid, targetStorefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#cloneEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCampaignUuid** | **String**|  |
 **targetStorefrontOid** | **Integer**|  | [optional]

### Return type

[**EmailCampaignResponse**](EmailCampaignResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloneEmailFlow"></a>
# **cloneEmailFlow**
> EmailFlowResponse cloneEmailFlow(storefrontOid, emailFlowUuid, targetStorefrontOid)

Clone email flow

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailFlowUuid = "emailFlowUuid_example"; // String | 
Integer targetStorefrontOid = 56; // Integer | 
try {
    EmailFlowResponse result = apiInstance.cloneEmailFlow(storefrontOid, emailFlowUuid, targetStorefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#cloneEmailFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailFlowUuid** | **String**|  |
 **targetStorefrontOid** | **Integer**|  | [optional]

### Return type

[**EmailFlowResponse**](EmailFlowResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloneLibraryItem"></a>
# **cloneLibraryItem**
> LibraryItemResponse cloneLibraryItem(libraryItemOid, storefrontOid)

Clone public library item.

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer libraryItemOid = 56; // Integer | 
Integer storefrontOid = 56; // Integer | 
try {
    LibraryItemResponse result = apiInstance.cloneLibraryItem(libraryItemOid, storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#cloneLibraryItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryItemOid** | **Integer**|  |
 **storefrontOid** | **Integer**|  | [optional]

### Return type

[**LibraryItemResponse**](LibraryItemResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEmailSendingDomain"></a>
# **createEmailSendingDomain**
> EmailSendingDomainResponse createEmailSendingDomain(domain)

Create email campaign

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
String domain = "domain_example"; // String | 
try {
    EmailSendingDomainResponse result = apiInstance.createEmailSendingDomain(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#createEmailSendingDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**|  |

### Return type

[**EmailSendingDomainResponse**](EmailSendingDomainResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailCommseqStat"></a>
# **deleteEmailCommseqStat**
> deleteEmailCommseqStat(storefrontOid, commseqUuid)

Delete communication sequence stats

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
try {
    apiInstance.deleteEmailCommseqStat(storefrontOid, commseqUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#deleteEmailCommseqStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailEmail"></a>
# **deleteEmailEmail**
> BaseResponse deleteEmailEmail(storefrontOid, commseqEmailUuid)

Delete email email

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqEmailUuid = "commseqEmailUuid_example"; // String | 
try {
    BaseResponse result = apiInstance.deleteEmailEmail(storefrontOid, commseqEmailUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#deleteEmailEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqEmailUuid** | **String**|  |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailListCustomer"></a>
# **deleteEmailListCustomer**
> BaseResponse deleteEmailListCustomer(storefrontOid, emailListUuid, emailCustomerUuid)

Delete email list customer

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailListUuid = "emailListUuid_example"; // String | 
String emailCustomerUuid = "emailCustomerUuid_example"; // String | 
try {
    BaseResponse result = apiInstance.deleteEmailListCustomer(storefrontOid, emailListUuid, emailCustomerUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#deleteEmailListCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailListUuid** | **String**|  |
 **emailCustomerUuid** | **String**|  |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailPostcard"></a>
# **deleteEmailPostcard**
> BaseResponse deleteEmailPostcard(storefrontOid, commseqPostcardUuid)

Delete email postcard

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqPostcardUuid = "commseqPostcardUuid_example"; // String | 
try {
    BaseResponse result = apiInstance.deleteEmailPostcard(storefrontOid, commseqPostcardUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#deleteEmailPostcard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqPostcardUuid** | **String**|  |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteEmailSendingDomain"></a>
# **deleteEmailSendingDomain**
> BaseResponse deleteEmailSendingDomain(domain)

delete email campaign

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
String domain = "domain_example"; // String | 
try {
    BaseResponse result = apiInstance.deleteEmailSendingDomain(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#deleteEmailSendingDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**|  |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExperiment"></a>
# **deleteExperiment**
> deleteExperiment(storefrontOid, storefrontExperimentOid)

Delete experiment

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
Integer storefrontExperimentOid = 56; // Integer | 
try {
    apiInstance.deleteExperiment(storefrontOid, storefrontExperimentOid);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#deleteExperiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **storefrontExperimentOid** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLibraryItem"></a>
# **deleteLibraryItem**
> deleteLibraryItem(libraryItemOid)

Delete library item

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer libraryItemOid = 56; // Integer | 
try {
    apiInstance.deleteLibraryItem(libraryItemOid);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#deleteLibraryItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryItemOid** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="duplicateLibraryItem"></a>
# **duplicateLibraryItem**
> LibraryItemResponse duplicateLibraryItem(libraryItemOid)

Duplicate library item.

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer libraryItemOid = 56; // Integer | 
try {
    LibraryItemResponse result = apiInstance.duplicateLibraryItem(libraryItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#duplicateLibraryItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryItemOid** | **Integer**|  |

### Return type

[**LibraryItemResponse**](LibraryItemResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="geocodeAddress"></a>
# **geocodeAddress**
> GeocodeResponse geocodeAddress(storefrontOid, geocodeRequest)

Obtain lat/long for an address

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
GeocodeRequest geocodeRequest = new GeocodeRequest(); // GeocodeRequest | geocode request
try {
    GeocodeResponse result = apiInstance.geocodeAddress(storefrontOid, geocodeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#geocodeAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **geocodeRequest** | [**GeocodeRequest**](GeocodeRequest.md)| geocode request |

### Return type

[**GeocodeResponse**](GeocodeResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCountries"></a>
# **getCountries**
> CountriesResponse getCountries(storefrontOid)

Get countries

Obtain a list of all the countries 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    CountriesResponse result = apiInstance.getCountries(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getCountries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**CountriesResponse**](CountriesResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEditorToken"></a>
# **getEditorToken**
> EmailEditorTokenResponse getEditorToken(storefrontOid)

Gets editor token

Fetches a temporary authentication token for the editor 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailEditorTokenResponse result = apiInstance.getEditorToken(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEditorToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailEditorTokenResponse**](EmailEditorTokenResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailBaseTemplates"></a>
# **getEmailBaseTemplates**
> EmailBaseTemplateListResponse getEmailBaseTemplates(storefrontOid)

Get email communication base templates

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailBaseTemplateListResponse result = apiInstance.getEmailBaseTemplates(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailBaseTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailBaseTemplateListResponse**](EmailBaseTemplateListResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCampaign"></a>
# **getEmailCampaign**
> EmailCampaignResponse getEmailCampaign(storefrontOid, emailCampaignUuid)

Get email campaign

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailCampaignUuid = "emailCampaignUuid_example"; // String | 
try {
    EmailCampaignResponse result = apiInstance.getEmailCampaign(storefrontOid, emailCampaignUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCampaignUuid** | **String**|  |

### Return type

[**EmailCampaignResponse**](EmailCampaignResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCampaigns"></a>
# **getEmailCampaigns**
> EmailCampaignsResponse getEmailCampaigns(storefrontOid)

Get email campaigns

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailCampaignsResponse result = apiInstance.getEmailCampaigns(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailCampaignsResponse**](EmailCampaignsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCampaignsWithStats"></a>
# **getEmailCampaignsWithStats**
> EmailCampaignsResponse getEmailCampaignsWithStats(storefrontOid, statDays)

Get email campaigns with stats

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String statDays = "statDays_example"; // String | 
try {
    EmailCampaignsResponse result = apiInstance.getEmailCampaignsWithStats(storefrontOid, statDays);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCampaignsWithStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **statDays** | **String**|  |

### Return type

[**EmailCampaignsResponse**](EmailCampaignsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseq"></a>
# **getEmailCommseq**
> EmailCommseqResponse getEmailCommseq(storefrontOid, commseqUuid)

Get email commseq

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
try {
    EmailCommseqResponse result = apiInstance.getEmailCommseq(storefrontOid, commseqUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseq");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |

### Return type

[**EmailCommseqResponse**](EmailCommseqResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseqEmailStats"></a>
# **getEmailCommseqEmailStats**
> EmailStatSummaryResponse getEmailCommseqEmailStats(storefrontOid, commseqUuid, statsRequest)

Get email communication sequence emails stats

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
EmailStatSummaryRequest statsRequest = new EmailStatSummaryRequest(); // EmailStatSummaryRequest | StatsRequest
try {
    EmailStatSummaryResponse result = apiInstance.getEmailCommseqEmailStats(storefrontOid, commseqUuid, statsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseqEmailStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |
 **statsRequest** | [**EmailStatSummaryRequest**](EmailStatSummaryRequest.md)| StatsRequest |

### Return type

[**EmailStatSummaryResponse**](EmailStatSummaryResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseqPostcardStats"></a>
# **getEmailCommseqPostcardStats**
> EmailStatPostcardSummaryResponse getEmailCommseqPostcardStats(storefrontOid, commseqUuid, statsRequest)

Get email communication sequence postcard stats

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
EmailStatPostcardSummaryRequest statsRequest = new EmailStatPostcardSummaryRequest(); // EmailStatPostcardSummaryRequest | StatsRequest
try {
    EmailStatPostcardSummaryResponse result = apiInstance.getEmailCommseqPostcardStats(storefrontOid, commseqUuid, statsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseqPostcardStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |
 **statsRequest** | [**EmailStatPostcardSummaryRequest**](EmailStatPostcardSummaryRequest.md)| StatsRequest |

### Return type

[**EmailStatPostcardSummaryResponse**](EmailStatPostcardSummaryResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseqStatOverall"></a>
# **getEmailCommseqStatOverall**
> EmailCommseqStatResponse getEmailCommseqStatOverall(storefrontOid, commseqUuid)

Get communication sequence stats overall

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
try {
    EmailCommseqStatResponse result = apiInstance.getEmailCommseqStatOverall(storefrontOid, commseqUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseqStatOverall");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |

### Return type

[**EmailCommseqStatResponse**](EmailCommseqStatResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseqStepStats"></a>
# **getEmailCommseqStepStats**
> EmailStepStatResponse getEmailCommseqStepStats(storefrontOid, commseqUuid, statsRequest)

Get email communication sequence step stats

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
EmailStepStatRequest statsRequest = new EmailStepStatRequest(); // EmailStepStatRequest | StatsRequest
try {
    EmailStepStatResponse result = apiInstance.getEmailCommseqStepStats(storefrontOid, commseqUuid, statsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseqStepStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |
 **statsRequest** | [**EmailStepStatRequest**](EmailStepStatRequest.md)| StatsRequest |

### Return type

[**EmailStepStatResponse**](EmailStepStatResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseqStepWaiting"></a>
# **getEmailCommseqStepWaiting**
> EmailStepWaitingResponse getEmailCommseqStepWaiting(storefrontOid, commseqUuid, waitingRequest)

Get email communication sequence customers waiting at each requested step

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
EmailStepWaitingRequest waitingRequest = new EmailStepWaitingRequest(); // EmailStepWaitingRequest | WaitingRequest
try {
    EmailStepWaitingResponse result = apiInstance.getEmailCommseqStepWaiting(storefrontOid, commseqUuid, waitingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseqStepWaiting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |
 **waitingRequest** | [**EmailStepWaitingRequest**](EmailStepWaitingRequest.md)| WaitingRequest |

### Return type

[**EmailStepWaitingResponse**](EmailStepWaitingResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseqs"></a>
# **getEmailCommseqs**
> EmailCommseqsResponse getEmailCommseqs(storefrontOid)

Get email commseqs

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailCommseqsResponse result = apiInstance.getEmailCommseqs(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseqs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailCommseqsResponse**](EmailCommseqsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCustomerEditorUrl"></a>
# **getEmailCustomerEditorUrl**
> EmailCustomerEditorUrlResponse getEmailCustomerEditorUrl(storefrontOid, emailCustomerUuid)

Get customers editor URL

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailCustomerUuid = "emailCustomerUuid_example"; // String | 
try {
    EmailCustomerEditorUrlResponse result = apiInstance.getEmailCustomerEditorUrl(storefrontOid, emailCustomerUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCustomerEditorUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCustomerUuid** | **String**|  |

### Return type

[**EmailCustomerEditorUrlResponse**](EmailCustomerEditorUrlResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCustomers"></a>
# **getEmailCustomers**
> EmailCustomersResponse getEmailCustomers(storefrontOid, pageNumber, pageSize, searchEmailPrefix)

Get email customers

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
String searchEmailPrefix = "searchEmailPrefix_example"; // String | 
try {
    EmailCustomersResponse result = apiInstance.getEmailCustomers(storefrontOid, pageNumber, pageSize, searchEmailPrefix);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]
 **searchEmailPrefix** | **String**|  | [optional]

### Return type

[**EmailCustomersResponse**](EmailCustomersResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailDashboardActivity"></a>
# **getEmailDashboardActivity**
> EmailDashboardActivityResponse getEmailDashboardActivity(storefrontOid, lastRecords)

Get email dashboard activity

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
Integer lastRecords = 56; // Integer | 
try {
    EmailDashboardActivityResponse result = apiInstance.getEmailDashboardActivity(storefrontOid, lastRecords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailDashboardActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **lastRecords** | **Integer**|  | [optional]

### Return type

[**EmailDashboardActivityResponse**](EmailDashboardActivityResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailDashboardStats"></a>
# **getEmailDashboardStats**
> EmailDashboardStatsResponse getEmailDashboardStats(storefrontOid, days)

Get dashboard stats

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
Integer days = 56; // Integer | 
try {
    EmailDashboardStatsResponse result = apiInstance.getEmailDashboardStats(storefrontOid, days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailDashboardStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **days** | **Integer**|  | [optional]

### Return type

[**EmailDashboardStatsResponse**](EmailDashboardStatsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailEmail"></a>
# **getEmailEmail**
> EmailCommseqEmailResponse getEmailEmail(storefrontOid, commseqEmailUuid)

Get email email

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqEmailUuid = "commseqEmailUuid_example"; // String | 
try {
    EmailCommseqEmailResponse result = apiInstance.getEmailEmail(storefrontOid, commseqEmailUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqEmailUuid** | **String**|  |

### Return type

[**EmailCommseqEmailResponse**](EmailCommseqEmailResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailEmailClicks"></a>
# **getEmailEmailClicks**
> EmailClicksResponse getEmailEmailClicks(storefrontOid, commseqUuid, commseqStepUuid, commseqEmailUuid, days)

Get email email clicks

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
String commseqStepUuid = "commseqStepUuid_example"; // String | 
String commseqEmailUuid = "commseqEmailUuid_example"; // String | 
Integer days = 56; // Integer | 
try {
    EmailClicksResponse result = apiInstance.getEmailEmailClicks(storefrontOid, commseqUuid, commseqStepUuid, commseqEmailUuid, days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailEmailClicks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |
 **commseqStepUuid** | **String**|  |
 **commseqEmailUuid** | **String**|  |
 **days** | **Integer**|  | [optional]

### Return type

[**EmailClicksResponse**](EmailClicksResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailEmailCustomerEditorUrl"></a>
# **getEmailEmailCustomerEditorUrl**
> EmailCustomerEditorUrlResponse getEmailEmailCustomerEditorUrl(storefrontOid, commseqEmailUuid, orderId)

Get email order customer editor url

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqEmailUuid = "commseqEmailUuid_example"; // String | 
String orderId = "orderId_example"; // String | 
try {
    EmailCustomerEditorUrlResponse result = apiInstance.getEmailEmailCustomerEditorUrl(storefrontOid, commseqEmailUuid, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailEmailCustomerEditorUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqEmailUuid** | **String**|  |
 **orderId** | **String**|  |

### Return type

[**EmailCustomerEditorUrlResponse**](EmailCustomerEditorUrlResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailEmailOrders"></a>
# **getEmailEmailOrders**
> EmailOrdersResponse getEmailEmailOrders(storefrontOid, commseqUuid, commseqStepUuid, commseqEmailUuid, days)

Get email email orders

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
String commseqStepUuid = "commseqStepUuid_example"; // String | 
String commseqEmailUuid = "commseqEmailUuid_example"; // String | 
Integer days = 56; // Integer | 
try {
    EmailOrdersResponse result = apiInstance.getEmailEmailOrders(storefrontOid, commseqUuid, commseqStepUuid, commseqEmailUuid, days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailEmailOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |
 **commseqStepUuid** | **String**|  |
 **commseqEmailUuid** | **String**|  |
 **days** | **Integer**|  | [optional]

### Return type

[**EmailOrdersResponse**](EmailOrdersResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailEmails"></a>
# **getEmailEmails**
> EmailCommseqEmailsResponse getEmailEmails(storefrontOid)

Get email emails

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailCommseqEmailsResponse result = apiInstance.getEmailEmails(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailEmails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailCommseqEmailsResponse**](EmailCommseqEmailsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailEmailsMultiple"></a>
# **getEmailEmailsMultiple**
> EmailCommseqEmailsResponse getEmailEmailsMultiple(storefrontOid, emailCommseqEmailsRequest)

Get email emails multiple

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailCommseqEmailsRequest emailCommseqEmailsRequest = new EmailCommseqEmailsRequest(); // EmailCommseqEmailsRequest | Request of email uuids
try {
    EmailCommseqEmailsResponse result = apiInstance.getEmailEmailsMultiple(storefrontOid, emailCommseqEmailsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailEmailsMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCommseqEmailsRequest** | [**EmailCommseqEmailsRequest**](EmailCommseqEmailsRequest.md)| Request of email uuids |

### Return type

[**EmailCommseqEmailsResponse**](EmailCommseqEmailsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailFlow"></a>
# **getEmailFlow**
> EmailFlowResponse getEmailFlow(storefrontOid, emailFlowUuid)

Get email flow

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailFlowUuid = "emailFlowUuid_example"; // String | 
try {
    EmailFlowResponse result = apiInstance.getEmailFlow(storefrontOid, emailFlowUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailFlowUuid** | **String**|  |

### Return type

[**EmailFlowResponse**](EmailFlowResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailFlows"></a>
# **getEmailFlows**
> EmailFlowsResponse getEmailFlows(storefrontOid)

Get email flows

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailFlowsResponse result = apiInstance.getEmailFlows(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailFlows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailFlowsResponse**](EmailFlowsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailGlobalSettings"></a>
# **getEmailGlobalSettings**
> EmailGlobalSettingsResponse getEmailGlobalSettings()

Get email globalsettings

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
try {
    EmailGlobalSettingsResponse result = apiInstance.getEmailGlobalSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailGlobalSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EmailGlobalSettingsResponse**](EmailGlobalSettingsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailList"></a>
# **getEmailList**
> EmailListResponse getEmailList(storefrontOid, emailListUuid)

Get email list

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailListUuid = "emailListUuid_example"; // String | 
try {
    EmailListResponse result = apiInstance.getEmailList(storefrontOid, emailListUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailListUuid** | **String**|  |

### Return type

[**EmailListResponse**](EmailListResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailListCustomerEditorUrl"></a>
# **getEmailListCustomerEditorUrl**
> EmailCustomerEditorUrlResponse getEmailListCustomerEditorUrl(storefrontOid, emailListUuid, emailCustomerUuid)

Get email list customer editor url

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailListUuid = "emailListUuid_example"; // String | 
String emailCustomerUuid = "emailCustomerUuid_example"; // String | 
try {
    EmailCustomerEditorUrlResponse result = apiInstance.getEmailListCustomerEditorUrl(storefrontOid, emailListUuid, emailCustomerUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailListCustomerEditorUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailListUuid** | **String**|  |
 **emailCustomerUuid** | **String**|  |

### Return type

[**EmailCustomerEditorUrlResponse**](EmailCustomerEditorUrlResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailListCustomers"></a>
# **getEmailListCustomers**
> EmailListCustomersResponse getEmailListCustomers(storefrontOid, emailListUuid, pageNumber, pageSize)

Get email list customers

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailListUuid = "emailListUuid_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    EmailListCustomersResponse result = apiInstance.getEmailListCustomers(storefrontOid, emailListUuid, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailListCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailListUuid** | **String**|  |
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**EmailListCustomersResponse**](EmailListCustomersResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailLists"></a>
# **getEmailLists**
> EmailListsResponse getEmailLists(storefrontOid)

Get email lists

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailListsResponse result = apiInstance.getEmailLists(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailListsResponse**](EmailListsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailPerformance"></a>
# **getEmailPerformance**
> EmailPerformanceResponse getEmailPerformance(storefrontOid)

Get email performance

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailPerformanceResponse result = apiInstance.getEmailPerformance(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailPerformance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailPerformanceResponse**](EmailPerformanceResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailPlan"></a>
# **getEmailPlan**
> EmailPlanResponse getEmailPlan(storefrontOid)

Get email plan

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailPlanResponse result = apiInstance.getEmailPlan(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailPlanResponse**](EmailPlanResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailPostcard"></a>
# **getEmailPostcard**
> EmailCommseqPostcardResponse getEmailPostcard(storefrontOid, commseqPostcardUuid)

Get email postcard

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqPostcardUuid = "commseqPostcardUuid_example"; // String | 
try {
    EmailCommseqPostcardResponse result = apiInstance.getEmailPostcard(storefrontOid, commseqPostcardUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailPostcard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqPostcardUuid** | **String**|  |

### Return type

[**EmailCommseqPostcardResponse**](EmailCommseqPostcardResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailPostcards"></a>
# **getEmailPostcards**
> EmailCommseqPostcardsResponse getEmailPostcards(storefrontOid)

Get email postcards

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailCommseqPostcardsResponse result = apiInstance.getEmailPostcards(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailPostcards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailCommseqPostcardsResponse**](EmailCommseqPostcardsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailPostcardsMultiple"></a>
# **getEmailPostcardsMultiple**
> EmailCommseqPostcardsResponse getEmailPostcardsMultiple(storefrontOid, emailCommseqPostcardsRequest)

Get email postcards multiple

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailCommseqPostcardsRequest emailCommseqPostcardsRequest = new EmailCommseqPostcardsRequest(); // EmailCommseqPostcardsRequest | Request of postcard uuids
try {
    EmailCommseqPostcardsResponse result = apiInstance.getEmailPostcardsMultiple(storefrontOid, emailCommseqPostcardsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailPostcardsMultiple");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCommseqPostcardsRequest** | [**EmailCommseqPostcardsRequest**](EmailCommseqPostcardsRequest.md)| Request of postcard uuids |

### Return type

[**EmailCommseqPostcardsResponse**](EmailCommseqPostcardsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSegment"></a>
# **getEmailSegment**
> EmailSegmentResponse getEmailSegment(storefrontOid, emailSegmentUuid)

Get email segment

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailSegmentUuid = "emailSegmentUuid_example"; // String | 
try {
    EmailSegmentResponse result = apiInstance.getEmailSegment(storefrontOid, emailSegmentUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegmentUuid** | **String**|  |

### Return type

[**EmailSegmentResponse**](EmailSegmentResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSegmentCustomerEditorUrl"></a>
# **getEmailSegmentCustomerEditorUrl**
> EmailCustomerEditorUrlResponse getEmailSegmentCustomerEditorUrl(storefrontOid, emailSegmentUuid, emailCustomerUuid)

Get email segment customers editor URL

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailSegmentUuid = "emailSegmentUuid_example"; // String | 
String emailCustomerUuid = "emailCustomerUuid_example"; // String | 
try {
    EmailCustomerEditorUrlResponse result = apiInstance.getEmailSegmentCustomerEditorUrl(storefrontOid, emailSegmentUuid, emailCustomerUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailSegmentCustomerEditorUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegmentUuid** | **String**|  |
 **emailCustomerUuid** | **String**|  |

### Return type

[**EmailCustomerEditorUrlResponse**](EmailCustomerEditorUrlResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSegmentCustomers"></a>
# **getEmailSegmentCustomers**
> EmailSegmentCustomersResponse getEmailSegmentCustomers(storefrontOid, emailSegmentUuid, pageNumber, pageSize)

Get email segment customers

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailSegmentUuid = "emailSegmentUuid_example"; // String | 
Integer pageNumber = 56; // Integer | 
Integer pageSize = 56; // Integer | 
try {
    EmailSegmentCustomersResponse result = apiInstance.getEmailSegmentCustomers(storefrontOid, emailSegmentUuid, pageNumber, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailSegmentCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegmentUuid** | **String**|  |
 **pageNumber** | **Integer**|  | [optional]
 **pageSize** | **Integer**|  | [optional]

### Return type

[**EmailSegmentCustomersResponse**](EmailSegmentCustomersResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSegments"></a>
# **getEmailSegments**
> EmailSegmentsResponse getEmailSegments(storefrontOid)

Get email segments

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailSegmentsResponse result = apiInstance.getEmailSegments(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailSegments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailSegmentsResponse**](EmailSegmentsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSendingDomain"></a>
# **getEmailSendingDomain**
> EmailSendingDomainResponse getEmailSendingDomain(domain)

Get email sending domain

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
String domain = "domain_example"; // String | 
try {
    EmailSendingDomainResponse result = apiInstance.getEmailSendingDomain(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailSendingDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**|  |

### Return type

[**EmailSendingDomainResponse**](EmailSendingDomainResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSendingDomainStatus"></a>
# **getEmailSendingDomainStatus**
> EmailSendingDomainResponse getEmailSendingDomainStatus(domain)

Get email sending domain status

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
String domain = "domain_example"; // String | 
try {
    EmailSendingDomainResponse result = apiInstance.getEmailSendingDomainStatus(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailSendingDomainStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**|  |

### Return type

[**EmailSendingDomainResponse**](EmailSendingDomainResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSendingDomains"></a>
# **getEmailSendingDomains**
> EmailSendingDomainsResponse getEmailSendingDomains()

Get email sending domains

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
try {
    EmailSendingDomainsResponse result = apiInstance.getEmailSendingDomains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailSendingDomains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**EmailSendingDomainsResponse**](EmailSendingDomainsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailSettings"></a>
# **getEmailSettings**
> EmailSettingsResponse getEmailSettings(storefrontOid)

Get email settings

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailSettingsResponse result = apiInstance.getEmailSettings(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailSettingsResponse**](EmailSettingsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailTemplate"></a>
# **getEmailTemplate**
> EmailTemplate getEmailTemplate(storefrontOid, emailTemplateOid)

Get email template

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
Integer emailTemplateOid = 56; // Integer | 
try {
    EmailTemplate result = apiInstance.getEmailTemplate(storefrontOid, emailTemplateOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailTemplateOid** | **Integer**|  |

### Return type

[**EmailTemplate**](EmailTemplate.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailTemplates"></a>
# **getEmailTemplates**
> EmailTemplatesResponse getEmailTemplates(storefrontOid, triggerType)

Get email templates

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String triggerType = "triggerType_example"; // String | 
try {
    EmailTemplatesResponse result = apiInstance.getEmailTemplates(storefrontOid, triggerType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailTemplates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **triggerType** | **String**|  | [optional]

### Return type

[**EmailTemplatesResponse**](EmailTemplatesResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailThirdPartyProviders"></a>
# **getEmailThirdPartyProviders**
> EmailThirdPartyProvidersResponse getEmailThirdPartyProviders(storefrontOid)

Get a list of third party email providers

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    EmailThirdPartyProvidersResponse result = apiInstance.getEmailThirdPartyProviders(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailThirdPartyProviders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**EmailThirdPartyProvidersResponse**](EmailThirdPartyProvidersResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExperiments"></a>
# **getExperiments**
> ExperimentsResponse getExperiments(storefrontOid)

Get experiments

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    ExperimentsResponse result = apiInstance.getExperiments(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getExperiments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**ExperimentsResponse**](ExperimentsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistogramPropertyNames"></a>
# **getHistogramPropertyNames**
> EmailHistogramPropertyNamesResponse getHistogramPropertyNames(storefrontOid, propertyType)

Get histogram property names

Obtain a list of property names for a given property type 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String propertyType = "propertyType_example"; // String | 
try {
    EmailHistogramPropertyNamesResponse result = apiInstance.getHistogramPropertyNames(storefrontOid, propertyType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getHistogramPropertyNames");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **propertyType** | **String**|  | [optional]

### Return type

[**EmailHistogramPropertyNamesResponse**](EmailHistogramPropertyNamesResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistogramPropertyValues"></a>
# **getHistogramPropertyValues**
> EmailHistogramPropertyValuesResponse getHistogramPropertyValues(storefrontOid, propertyName, propertyType, limit)

Get histogram property values

Obtain a list of property values for a given property name and type 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String propertyName = "propertyName_example"; // String | 
String propertyType = "propertyType_example"; // String | 
Integer limit = 56; // Integer | 
try {
    EmailHistogramPropertyValuesResponse result = apiInstance.getHistogramPropertyValues(storefrontOid, propertyName, propertyType, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getHistogramPropertyValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **propertyName** | **String**|  | [optional]
 **propertyType** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

[**EmailHistogramPropertyValuesResponse**](EmailHistogramPropertyValuesResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLibraryFilterValues"></a>
# **getLibraryFilterValues**
> LibraryFilterValuesResponse getLibraryFilterValues()

Get library values used to populate drop down boxes for filtering.

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
try {
    LibraryFilterValuesResponse result = apiInstance.getLibraryFilterValues();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getLibraryFilterValues");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LibraryFilterValuesResponse**](LibraryFilterValuesResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLibraryItem"></a>
# **getLibraryItem**
> LibraryItemResponse getLibraryItem(libraryItemOid)

Get library item.

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer libraryItemOid = 56; // Integer | 
try {
    LibraryItemResponse result = apiInstance.getLibraryItem(libraryItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getLibraryItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryItemOid** | **Integer**|  |

### Return type

[**LibraryItemResponse**](LibraryItemResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLibraryItemsByQuery"></a>
# **getLibraryItemsByQuery**
> LibraryItemsResponse getLibraryItemsByQuery(itemQuery, limit, offset, sort)

Retrieve library items

Retrieves a library items based on a query object.  If no parameters are specified, the API call will default to the merchant id only.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
LibraryItemQuery itemQuery = new LibraryItemQuery(); // LibraryItemQuery | Item query
Integer limit = 10000; // Integer | The maximum number of records to return on this one API call. (Maximum 10000)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the library items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
try {
    LibraryItemsResponse result = apiInstance.getLibraryItemsByQuery(itemQuery, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getLibraryItemsByQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemQuery** | [**LibraryItemQuery**](LibraryItemQuery.md)| Item query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 10000) | [optional] [default to 10000]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **sort** | **String**| The sort order of the library items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]

### Return type

[**LibraryItemsResponse**](LibraryItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionEmail"></a>
# **getTransactionEmail**
> TransactionEmailResponse getTransactionEmail(storefrontOid, emailId)

Gets a transaction email object

Fetch a transactional email 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailId = "emailId_example"; // String | 
try {
    TransactionEmailResponse result = apiInstance.getTransactionEmail(storefrontOid, emailId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getTransactionEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailId** | **String**|  |

### Return type

[**TransactionEmailResponse**](TransactionEmailResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionEmailList"></a>
# **getTransactionEmailList**
> TransactionEmailListResponse getTransactionEmailList(storefrontOid)

Gets a list of transaction email names

Obtain a list of all transactional emails and return back just their names 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
try {
    TransactionEmailListResponse result = apiInstance.getTransactionEmailList(storefrontOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getTransactionEmailList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |

### Return type

[**TransactionEmailListResponse**](TransactionEmailListResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="globalUnsubscribe"></a>
# **globalUnsubscribe**
> EmailGlobalUnsubscribeResponse globalUnsubscribe(storefrontOid, unsubscribe)

Globally unsubscribe a customer

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailGlobalUnsubscribeRequest unsubscribe = new EmailGlobalUnsubscribeRequest(); // EmailGlobalUnsubscribeRequest | Unsubscribe
try {
    EmailGlobalUnsubscribeResponse result = apiInstance.globalUnsubscribe(storefrontOid, unsubscribe);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#globalUnsubscribe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **unsubscribe** | [**EmailGlobalUnsubscribeRequest**](EmailGlobalUnsubscribeRequest.md)| Unsubscribe |

### Return type

[**EmailGlobalUnsubscribeResponse**](EmailGlobalUnsubscribeResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importEmailThirdPartyProviderList"></a>
# **importEmailThirdPartyProviderList**
> importEmailThirdPartyProviderList(storefrontOid, importRequest)

Import a third party provider list

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailThirdPartyListImportRequest importRequest = new EmailThirdPartyListImportRequest(); // EmailThirdPartyListImportRequest | lists to import
try {
    apiInstance.importEmailThirdPartyProviderList(storefrontOid, importRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#importEmailThirdPartyProviderList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **importRequest** | [**EmailThirdPartyListImportRequest**](EmailThirdPartyListImportRequest.md)| lists to import |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertEmailCampaign"></a>
# **insertEmailCampaign**
> EmailCampaignResponse insertEmailCampaign(storefrontOid, emailCampaign)

Insert email campaign

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailCampaign emailCampaign = new EmailCampaign(); // EmailCampaign | Email campaign
try {
    EmailCampaignResponse result = apiInstance.insertEmailCampaign(storefrontOid, emailCampaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#insertEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCampaign** | [**EmailCampaign**](EmailCampaign.md)| Email campaign |

### Return type

[**EmailCampaignResponse**](EmailCampaignResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertEmailCommseq"></a>
# **insertEmailCommseq**
> EmailCommseqResponse insertEmailCommseq(storefrontOid, emailCommseq)

Insert email commseq

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailCommseq emailCommseq = new EmailCommseq(); // EmailCommseq | Email commseq
try {
    EmailCommseqResponse result = apiInstance.insertEmailCommseq(storefrontOid, emailCommseq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#insertEmailCommseq");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCommseq** | [**EmailCommseq**](EmailCommseq.md)| Email commseq |

### Return type

[**EmailCommseqResponse**](EmailCommseqResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertEmailEmail"></a>
# **insertEmailEmail**
> EmailCommseqEmailResponse insertEmailEmail(storefrontOid, emailCommseqEmail)

Insert email email

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailCommseqEmail emailCommseqEmail = new EmailCommseqEmail(); // EmailCommseqEmail | Email email
try {
    EmailCommseqEmailResponse result = apiInstance.insertEmailEmail(storefrontOid, emailCommseqEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#insertEmailEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCommseqEmail** | [**EmailCommseqEmail**](EmailCommseqEmail.md)| Email email |

### Return type

[**EmailCommseqEmailResponse**](EmailCommseqEmailResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertEmailFlow"></a>
# **insertEmailFlow**
> EmailFlowResponse insertEmailFlow(storefrontOid, emailFlow)

Insert email flow

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailFlow emailFlow = new EmailFlow(); // EmailFlow | Email flow
try {
    EmailFlowResponse result = apiInstance.insertEmailFlow(storefrontOid, emailFlow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#insertEmailFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailFlow** | [**EmailFlow**](EmailFlow.md)| Email flow |

### Return type

[**EmailFlowResponse**](EmailFlowResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertEmailList"></a>
# **insertEmailList**
> EmailListResponse insertEmailList(storefrontOid, emailList)

Insert email list

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailList emailList = new EmailList(); // EmailList | Email list
try {
    EmailListResponse result = apiInstance.insertEmailList(storefrontOid, emailList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#insertEmailList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailList** | [**EmailList**](EmailList.md)| Email list |

### Return type

[**EmailListResponse**](EmailListResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertEmailPostcard"></a>
# **insertEmailPostcard**
> EmailCommseqPostcardResponse insertEmailPostcard(storefrontOid, emailCommseqPostcard)

Insert email postcard

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailCommseqPostcard emailCommseqPostcard = new EmailCommseqPostcard(); // EmailCommseqPostcard | Email postcard
try {
    EmailCommseqPostcardResponse result = apiInstance.insertEmailPostcard(storefrontOid, emailCommseqPostcard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#insertEmailPostcard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCommseqPostcard** | [**EmailCommseqPostcard**](EmailCommseqPostcard.md)| Email postcard |

### Return type

[**EmailCommseqPostcardResponse**](EmailCommseqPostcardResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertEmailSegment"></a>
# **insertEmailSegment**
> EmailSegmentResponse insertEmailSegment(storefrontOid, emailSegment)

Insert email segment

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailSegment emailSegment = new EmailSegment(); // EmailSegment | Email segment
try {
    EmailSegmentResponse result = apiInstance.insertEmailSegment(storefrontOid, emailSegment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#insertEmailSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegment** | [**EmailSegment**](EmailSegment.md)| Email segment |

### Return type

[**EmailSegmentResponse**](EmailSegmentResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="prepareDownloadEmailSegment"></a>
# **prepareDownloadEmailSegment**
> EmailSegmentDownloadPrepareResponse prepareDownloadEmailSegment(storefrontOid, emailSegmentUuid)

Prepare download of email segment

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailSegmentUuid = "emailSegmentUuid_example"; // String | 
try {
    EmailSegmentDownloadPrepareResponse result = apiInstance.prepareDownloadEmailSegment(storefrontOid, emailSegmentUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#prepareDownloadEmailSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegmentUuid** | **String**|  |

### Return type

[**EmailSegmentDownloadPrepareResponse**](EmailSegmentDownloadPrepareResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="releaseEmailCommseqStepWaiting"></a>
# **releaseEmailCommseqStepWaiting**
> releaseEmailCommseqStepWaiting(storefrontOid, commseqUuid, commseqStepUuid)

Release email communication sequence customers waiting at the specified step

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
String commseqStepUuid = "commseqStepUuid_example"; // String | 
try {
    apiInstance.releaseEmailCommseqStepWaiting(storefrontOid, commseqUuid, commseqStepUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#releaseEmailCommseqStepWaiting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |
 **commseqStepUuid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="review"></a>
# **review**
> EmailCommseqEmailSendTestResponse review(storefrontOid, commseqEmailUuid, emailCommseqEmailReviewRequest)

Request a review of an email

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqEmailUuid = "commseqEmailUuid_example"; // String | 
EmailCommseqEmailSendTestRequest emailCommseqEmailReviewRequest = new EmailCommseqEmailSendTestRequest(); // EmailCommseqEmailSendTestRequest | Email commseq email review request
try {
    EmailCommseqEmailSendTestResponse result = apiInstance.review(storefrontOid, commseqEmailUuid, emailCommseqEmailReviewRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#review");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqEmailUuid** | **String**|  |
 **emailCommseqEmailReviewRequest** | [**EmailCommseqEmailSendTestRequest**](EmailCommseqEmailSendTestRequest.md)| Email commseq email review request |

### Return type

[**EmailCommseqEmailSendTestResponse**](EmailCommseqEmailSendTestResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="search"></a>
# **search**
> LookupResponse search(category, matches, storefrontOid, maxHits, subcategory)

Searches for all matching values

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
String category = "category_example"; // String | 
String matches = "matches_example"; // String | 
String storefrontOid = "storefrontOid_example"; // String | 
Integer maxHits = 56; // Integer | 
String subcategory = "subcategory_example"; // String | 
try {
    LookupResponse result = apiInstance.search(category, matches, storefrontOid, maxHits, subcategory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**|  | [optional]
 **matches** | **String**|  | [optional]
 **storefrontOid** | **String**|  | [optional]
 **maxHits** | **Integer**|  | [optional]
 **subcategory** | **String**|  | [optional]

### Return type

[**LookupResponse**](LookupResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchEmailListCustomers"></a>
# **searchEmailListCustomers**
> EmailListCustomersResponse searchEmailListCustomers(storefrontOid, emailListUuid, startsWith)

Search email list customers

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailListUuid = "emailListUuid_example"; // String | 
String startsWith = "startsWith_example"; // String | 
try {
    EmailListCustomersResponse result = apiInstance.searchEmailListCustomers(storefrontOid, emailListUuid, startsWith);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#searchEmailListCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailListUuid** | **String**|  |
 **startsWith** | **String**|  | [optional]

### Return type

[**EmailListCustomersResponse**](EmailListCustomersResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchEmailSegmentCustomers"></a>
# **searchEmailSegmentCustomers**
> EmailSegmentCustomersResponse searchEmailSegmentCustomers(storefrontOid, emailSegmentUuid, startsWith)

Search email segment customers

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailSegmentUuid = "emailSegmentUuid_example"; // String | 
String startsWith = "startsWith_example"; // String | 
try {
    EmailSegmentCustomersResponse result = apiInstance.searchEmailSegmentCustomers(storefrontOid, emailSegmentUuid, startsWith);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#searchEmailSegmentCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegmentUuid** | **String**|  |
 **startsWith** | **String**|  | [optional]

### Return type

[**EmailSegmentCustomersResponse**](EmailSegmentCustomersResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendEmailTest"></a>
# **sendEmailTest**
> EmailCommseqEmailSendTestResponse sendEmailTest(storefrontOid, commseqEmailUuid, emailCommseqEmailTestRequest)

Send email test

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqEmailUuid = "commseqEmailUuid_example"; // String | 
EmailCommseqEmailSendTestRequest emailCommseqEmailTestRequest = new EmailCommseqEmailSendTestRequest(); // EmailCommseqEmailSendTestRequest | Email commseq email test request
try {
    EmailCommseqEmailSendTestResponse result = apiInstance.sendEmailTest(storefrontOid, commseqEmailUuid, emailCommseqEmailTestRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#sendEmailTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqEmailUuid** | **String**|  |
 **emailCommseqEmailTestRequest** | [**EmailCommseqEmailSendTestRequest**](EmailCommseqEmailSendTestRequest.md)| Email commseq email test request |

### Return type

[**EmailCommseqEmailSendTestResponse**](EmailCommseqEmailSendTestResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendPostcardTest"></a>
# **sendPostcardTest**
> EmailCommseqPostcardSendTestResponse sendPostcardTest(storefrontOid, commseqPostcardUuid, emailCommseqPostcardTestRequest)

Send postcard test

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqPostcardUuid = "commseqPostcardUuid_example"; // String | 
EmailCommseqPostcardSendTestRequest emailCommseqPostcardTestRequest = new EmailCommseqPostcardSendTestRequest(); // EmailCommseqPostcardSendTestRequest | Email commseq email test request
try {
    EmailCommseqPostcardSendTestResponse result = apiInstance.sendPostcardTest(storefrontOid, commseqPostcardUuid, emailCommseqPostcardTestRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#sendPostcardTest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqPostcardUuid** | **String**|  |
 **emailCommseqPostcardTestRequest** | [**EmailCommseqPostcardSendTestRequest**](EmailCommseqPostcardSendTestRequest.md)| Email commseq email test request |

### Return type

[**EmailCommseqPostcardSendTestResponse**](EmailCommseqPostcardSendTestResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="startEmailCampaign"></a>
# **startEmailCampaign**
> BaseResponse startEmailCampaign(storefrontOid, emailCampaignUuid)

Start email campaign

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailCampaignUuid = "emailCampaignUuid_example"; // String | 
try {
    BaseResponse result = apiInstance.startEmailCampaign(storefrontOid, emailCampaignUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#startEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCampaignUuid** | **String**|  |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscribeToEmailList"></a>
# **subscribeToEmailList**
> EmailListSubscribeResponse subscribeToEmailList(storefrontOid, emailListUuid, customers)

Subscribe customers to email list

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailListUuid = "emailListUuid_example"; // String | 
List<EmailCustomer> customers = Arrays.asList(new EmailCustomer()); // List<EmailCustomer> | Customers
try {
    EmailListSubscribeResponse result = apiInstance.subscribeToEmailList(storefrontOid, emailListUuid, customers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#subscribeToEmailList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailListUuid** | **String**|  |
 **customers** | [**List&lt;EmailCustomer&gt;**](EmailCustomer.md)| Customers |

### Return type

[**EmailListSubscribeResponse**](EmailListSubscribeResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailCampaign"></a>
# **updateEmailCampaign**
> EmailCampaignResponse updateEmailCampaign(storefrontOid, emailCampaignUuid, emailCampaign)

Update email campaign

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailCampaignUuid = "emailCampaignUuid_example"; // String | 
EmailCampaign emailCampaign = new EmailCampaign(); // EmailCampaign | Email campaign
try {
    EmailCampaignResponse result = apiInstance.updateEmailCampaign(storefrontOid, emailCampaignUuid, emailCampaign);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCampaignUuid** | **String**|  |
 **emailCampaign** | [**EmailCampaign**](EmailCampaign.md)| Email campaign |

### Return type

[**EmailCampaignResponse**](EmailCampaignResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailCommseq"></a>
# **updateEmailCommseq**
> EmailCommseqResponse updateEmailCommseq(storefrontOid, commseqUuid, emailCommseq)

Update email commseq

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqUuid = "commseqUuid_example"; // String | 
EmailCommseq emailCommseq = new EmailCommseq(); // EmailCommseq | Email commseq
try {
    EmailCommseqResponse result = apiInstance.updateEmailCommseq(storefrontOid, commseqUuid, emailCommseq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailCommseq");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqUuid** | **String**|  |
 **emailCommseq** | [**EmailCommseq**](EmailCommseq.md)| Email commseq |

### Return type

[**EmailCommseqResponse**](EmailCommseqResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailCustomer"></a>
# **updateEmailCustomer**
> updateEmailCustomer(storefrontOid, emailCustomerUuid, emailCustomer)

Update email customer

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailCustomerUuid = "emailCustomerUuid_example"; // String | 
EmailCustomer emailCustomer = new EmailCustomer(); // EmailCustomer | Email customer
try {
    apiInstance.updateEmailCustomer(storefrontOid, emailCustomerUuid, emailCustomer);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailCustomerUuid** | **String**|  |
 **emailCustomer** | [**EmailCustomer**](EmailCustomer.md)| Email customer |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailEmail"></a>
# **updateEmailEmail**
> EmailCommseqEmailResponse updateEmailEmail(storefrontOid, commseqEmailUuid, emailCommseqEmail)

Update email email

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqEmailUuid = "commseqEmailUuid_example"; // String | 
EmailCommseqEmail emailCommseqEmail = new EmailCommseqEmail(); // EmailCommseqEmail | Email commseq email
try {
    EmailCommseqEmailResponse result = apiInstance.updateEmailEmail(storefrontOid, commseqEmailUuid, emailCommseqEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqEmailUuid** | **String**|  |
 **emailCommseqEmail** | [**EmailCommseqEmail**](EmailCommseqEmail.md)| Email commseq email |

### Return type

[**EmailCommseqEmailResponse**](EmailCommseqEmailResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailFlow"></a>
# **updateEmailFlow**
> EmailFlowResponse updateEmailFlow(storefrontOid, emailFlowUuid, emailFlow)

Update email flow

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailFlowUuid = "emailFlowUuid_example"; // String | 
EmailFlow emailFlow = new EmailFlow(); // EmailFlow | Email flow
try {
    EmailFlowResponse result = apiInstance.updateEmailFlow(storefrontOid, emailFlowUuid, emailFlow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailFlowUuid** | **String**|  |
 **emailFlow** | [**EmailFlow**](EmailFlow.md)| Email flow |

### Return type

[**EmailFlowResponse**](EmailFlowResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailGlobalSettings"></a>
# **updateEmailGlobalSettings**
> EmailGlobalSettingsResponse updateEmailGlobalSettings(globalSettings)

Update email global settings

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
EmailGlobalSettings globalSettings = new EmailGlobalSettings(); // EmailGlobalSettings | global settings request
try {
    EmailGlobalSettingsResponse result = apiInstance.updateEmailGlobalSettings(globalSettings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailGlobalSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **globalSettings** | [**EmailGlobalSettings**](EmailGlobalSettings.md)| global settings request |

### Return type

[**EmailGlobalSettingsResponse**](EmailGlobalSettingsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailList"></a>
# **updateEmailList**
> EmailListResponse updateEmailList(storefrontOid, emailListUuid, emailList)

Update email list

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailListUuid = "emailListUuid_example"; // String | 
EmailList emailList = new EmailList(); // EmailList | Email list
try {
    EmailListResponse result = apiInstance.updateEmailList(storefrontOid, emailListUuid, emailList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailListUuid** | **String**|  |
 **emailList** | [**EmailList**](EmailList.md)| Email list |

### Return type

[**EmailListResponse**](EmailListResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailPlan"></a>
# **updateEmailPlan**
> EmailPlanResponse updateEmailPlan(storefrontOid, settings)

Update email plan

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailPlan settings = new EmailPlan(); // EmailPlan | plan request
try {
    EmailPlanResponse result = apiInstance.updateEmailPlan(storefrontOid, settings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailPlan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **settings** | [**EmailPlan**](EmailPlan.md)| plan request |

### Return type

[**EmailPlanResponse**](EmailPlanResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailPostcard"></a>
# **updateEmailPostcard**
> EmailCommseqPostcardResponse updateEmailPostcard(storefrontOid, commseqPostcardUuid, emailCommseqPostcard)

Update email postcard

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String commseqPostcardUuid = "commseqPostcardUuid_example"; // String | 
EmailCommseqPostcard emailCommseqPostcard = new EmailCommseqPostcard(); // EmailCommseqPostcard | Email commseq postcard
try {
    EmailCommseqPostcardResponse result = apiInstance.updateEmailPostcard(storefrontOid, commseqPostcardUuid, emailCommseqPostcard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailPostcard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **commseqPostcardUuid** | **String**|  |
 **emailCommseqPostcard** | [**EmailCommseqPostcard**](EmailCommseqPostcard.md)| Email commseq postcard |

### Return type

[**EmailCommseqPostcardResponse**](EmailCommseqPostcardResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailSegment"></a>
# **updateEmailSegment**
> EmailSegmentResponse updateEmailSegment(storefrontOid, emailSegmentUuid, emailSegment)

Update email segment

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailSegmentUuid = "emailSegmentUuid_example"; // String | 
EmailSegment emailSegment = new EmailSegment(); // EmailSegment | Email segment
try {
    EmailSegmentResponse result = apiInstance.updateEmailSegment(storefrontOid, emailSegmentUuid, emailSegment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailSegmentUuid** | **String**|  |
 **emailSegment** | [**EmailSegment**](EmailSegment.md)| Email segment |

### Return type

[**EmailSegmentResponse**](EmailSegmentResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateEmailSettings"></a>
# **updateEmailSettings**
> EmailSettingsResponse updateEmailSettings(storefrontOid, settings)

Update email settings

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
EmailSettings settings = new EmailSettings(); // EmailSettings | settings request
try {
    EmailSettingsResponse result = apiInstance.updateEmailSettings(storefrontOid, settings);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateEmailSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **settings** | [**EmailSettings**](EmailSettings.md)| settings request |

### Return type

[**EmailSettingsResponse**](EmailSettingsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateExperiment"></a>
# **updateExperiment**
> ExperimentResponse updateExperiment(storefrontOid, storefrontExperimentOid, experiment)

Update experiment

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
Integer storefrontExperimentOid = 56; // Integer | 
Experiment experiment = new Experiment(); // Experiment | Experiment
try {
    ExperimentResponse result = apiInstance.updateExperiment(storefrontOid, storefrontExperimentOid, experiment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateExperiment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **storefrontExperimentOid** | **Integer**|  |
 **experiment** | [**Experiment**](Experiment.md)| Experiment |

### Return type

[**ExperimentResponse**](ExperimentResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLibraryItem"></a>
# **updateLibraryItem**
> LibraryItemResponse updateLibraryItem(libraryItemOid, libraryItem)

Update library item. Note that only certain fields may be updated via this method.

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer libraryItemOid = 56; // Integer | 
LibraryItem libraryItem = new LibraryItem(); // LibraryItem | Library item
try {
    LibraryItemResponse result = apiInstance.updateLibraryItem(libraryItemOid, libraryItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateLibraryItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **libraryItemOid** | **Integer**|  |
 **libraryItem** | [**LibraryItem**](LibraryItem.md)| Library item |

### Return type

[**LibraryItemResponse**](LibraryItemResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTransactionEmail"></a>
# **updateTransactionEmail**
> TransactionEmailResponse updateTransactionEmail(storefrontOid, emailId, transactionEmail)

Updates a transaction email object

Updates a transactional email 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.StorefrontApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

StorefrontApi apiInstance = new StorefrontApi();
Integer storefrontOid = 56; // Integer | 
String emailId = "emailId_example"; // String | 
TransactionEmail transactionEmail = new TransactionEmail(); // TransactionEmail | TransactionEmail
try {
    TransactionEmailResponse result = apiInstance.updateTransactionEmail(storefrontOid, emailId, transactionEmail);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#updateTransactionEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **Integer**|  |
 **emailId** | **String**|  |
 **transactionEmail** | [**TransactionEmail**](TransactionEmail.md)| TransactionEmail |

### Return type

[**TransactionEmailResponse**](TransactionEmailResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

