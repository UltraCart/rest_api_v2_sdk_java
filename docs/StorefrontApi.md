# StorefrontApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**archiveEmailList**](StorefrontApi.md#archiveEmailList) | **POST** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/archive | Archive email list
[**archiveEmailSegment**](StorefrontApi.md#archiveEmailSegment) | **POST** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/archive | Archive email segment
[**cloneEmailCampaign**](StorefrontApi.md#cloneEmailCampaign) | **POST** /storefront/{storefront_oid}/email/campaigns/{email_campaign_uuid}/clone | Clone email campaign
[**cloneEmailFlow**](StorefrontApi.md#cloneEmailFlow) | **POST** /storefront/{storefront_oid}/email/flows/{email_flow_uuid}/clone | Clone email flow
[**createEmailSendingDomain**](StorefrontApi.md#createEmailSendingDomain) | **POST** /storefront//email/sending_domains/{domain}/create | Create email campaign
[**deleteEmailEmail**](StorefrontApi.md#deleteEmailEmail) | **DELETE** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid} | Delete email email
[**deleteEmailListCustomer**](StorefrontApi.md#deleteEmailListCustomer) | **DELETE** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/customers/{email_customer_uuid} | Delete email list customer
[**deleteEmailSendingDomain**](StorefrontApi.md#deleteEmailSendingDomain) | **DELETE** /storefront//email/sending_domains/{domain} | delete email campaign
[**getEmailBaseTemplates**](StorefrontApi.md#getEmailBaseTemplates) | **GET** /storefront/{storefront_oid}/email/baseTemplates | Get email communication base templates
[**getEmailCampaign**](StorefrontApi.md#getEmailCampaign) | **GET** /storefront/{storefront_oid}/email/campaigns/{email_campaign_uuid} | Get email campaign
[**getEmailCampaigns**](StorefrontApi.md#getEmailCampaigns) | **GET** /storefront/{storefront_oid}/email/campaigns | Get email campaigns
[**getEmailCampaignsWithStats**](StorefrontApi.md#getEmailCampaignsWithStats) | **GET** /storefront/{storefront_oid}/email/campaignsWithStats/{stat_days} | Get email campaigns with stats
[**getEmailCommseq**](StorefrontApi.md#getEmailCommseq) | **GET** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid} | Get email commseq
[**getEmailCommseqEmailStats**](StorefrontApi.md#getEmailCommseqEmailStats) | **GET** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/emailStats/{commseq_email_uuid} | Get email communication sequence emails stats
[**getEmailCommseqStats**](StorefrontApi.md#getEmailCommseqStats) | **GET** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid}/stats | Get email communication sequence stats
[**getEmailCommseqs**](StorefrontApi.md#getEmailCommseqs) | **GET** /storefront/{storefront_oid}/email/commseqs | Get email commseqs
[**getEmailDashboardActivity**](StorefrontApi.md#getEmailDashboardActivity) | **GET** /storefront/{storefront_oid}/email/dashboard_activity | Get email dashboard activity
[**getEmailDashboardStats**](StorefrontApi.md#getEmailDashboardStats) | **GET** /storefront/{storefront_oid}/email/dashboard_stats | Get dashboard stats
[**getEmailEmail**](StorefrontApi.md#getEmailEmail) | **GET** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid} | Get email email
[**getEmailEmails**](StorefrontApi.md#getEmailEmails) | **GET** /storefront/{storefront_oid}/email/emails | Get email emails
[**getEmailFlow**](StorefrontApi.md#getEmailFlow) | **GET** /storefront/{storefront_oid}/email/flows/{email_flow_uuid} | Get email flow
[**getEmailFlows**](StorefrontApi.md#getEmailFlows) | **GET** /storefront/{storefront_oid}/email/flows | Get email flows
[**getEmailList**](StorefrontApi.md#getEmailList) | **GET** /storefront/{storefront_oid}/email/lists/{email_list_uuid} | Get email list
[**getEmailListCustomerEditorUrl**](StorefrontApi.md#getEmailListCustomerEditorUrl) | **GET** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/customers/{email_customer_uuid}/editor_url | Get email list customers
[**getEmailListCustomers**](StorefrontApi.md#getEmailListCustomers) | **GET** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/customers | Get email list customers
[**getEmailLists**](StorefrontApi.md#getEmailLists) | **GET** /storefront/{storefront_oid}/email/lists | Get email lists
[**getEmailSegment**](StorefrontApi.md#getEmailSegment) | **GET** /storefront/{storefront_oid}/email/segments/{email_segment_uuid} | Get email segment
[**getEmailSegmentCustomers**](StorefrontApi.md#getEmailSegmentCustomers) | **GET** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/customers | Get email segment customers
[**getEmailSegments**](StorefrontApi.md#getEmailSegments) | **GET** /storefront/{storefront_oid}/email/segments | Get email segments
[**getEmailSendingDomain**](StorefrontApi.md#getEmailSendingDomain) | **GET** /storefront/email/sending_domain/{domain} | Get email sending domain
[**getEmailSendingDomains**](StorefrontApi.md#getEmailSendingDomains) | **GET** /storefront/email/sending_domains | Get email sending domains
[**getEmailTemplate**](StorefrontApi.md#getEmailTemplate) | **GET** /storefront/{storefront_oid}/email/templates/{email_template_oid} | Get email template
[**getEmailTemplates**](StorefrontApi.md#getEmailTemplates) | **GET** /storefront/{storefront_oid}/email/templates | Get email templates
[**insertEmailCampaign**](StorefrontApi.md#insertEmailCampaign) | **POST** /storefront/{storefront_oid}/email/campaigns | Insert email campaign
[**insertEmailCommseq**](StorefrontApi.md#insertEmailCommseq) | **POST** /storefront/{storefront_oid}/email/commseqs | Insert email commseq
[**insertEmailEmail**](StorefrontApi.md#insertEmailEmail) | **POST** /storefront/{storefront_oid}/email/emails | Insert email email
[**insertEmailFlow**](StorefrontApi.md#insertEmailFlow) | **POST** /storefront/{storefront_oid}/email/flows | Insert email flow
[**insertEmailList**](StorefrontApi.md#insertEmailList) | **POST** /storefront/{storefront_oid}/email/lists | Insert email list
[**insertEmailSegment**](StorefrontApi.md#insertEmailSegment) | **POST** /storefront/{storefront_oid}/email/segments | Insert email segment
[**searchEmailListCustomers**](StorefrontApi.md#searchEmailListCustomers) | **GET** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/search | Search email list customers
[**searchEmailSegmentCustomers**](StorefrontApi.md#searchEmailSegmentCustomers) | **GET** /storefront/{storefront_oid}/email/segments/{email_segment_uuid}/search | Search email segment customers
[**startEmailCampaign**](StorefrontApi.md#startEmailCampaign) | **PUT** /storefront/{storefront_oid}/email/campaigns/{email_campaign_uuid}/start | Start email campaign
[**subscribeToEmailList**](StorefrontApi.md#subscribeToEmailList) | **POST** /storefront/{storefront_oid}/email/lists/{email_list_uuid}/subscribe | Subscribe customers to email list
[**updateEmailCampaign**](StorefrontApi.md#updateEmailCampaign) | **PUT** /storefront/{storefront_oid}/email/campaigns/{email_campaign_uuid} | Update email campaign
[**updateEmailCommseq**](StorefrontApi.md#updateEmailCommseq) | **PUT** /storefront/{storefront_oid}/email/commseqs/{commseq_uuid} | Update email commseq
[**updateEmailEmail**](StorefrontApi.md#updateEmailEmail) | **PUT** /storefront/{storefront_oid}/email/emails/{commseq_email_uuid} | Update email email
[**updateEmailFlow**](StorefrontApi.md#updateEmailFlow) | **PUT** /storefront/{storefront_oid}/email/flows/{email_flow_uuid} | Update email flow
[**updateEmailList**](StorefrontApi.md#updateEmailList) | **PUT** /storefront/{storefront_oid}/email/lists/{email_list_uuid} | Update email list
[**updateEmailSegment**](StorefrontApi.md#updateEmailSegment) | **PUT** /storefront/{storefront_oid}/email/segments/{email_segment_uuid} | Update email segment
[**verifyEmailSendingDomain**](StorefrontApi.md#verifyEmailSendingDomain) | **POST** /storefront//email/sending_domains/{domain}/verify | Verify email campaign


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
String storefrontOid = "storefrontOid_example"; // String | null
String emailListUuid = "emailListUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailListUuid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailSegmentUuid = "emailSegmentUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailSegmentUuid** | **String**| null |

### Return type

[**EmailSegmentArchiveResponse**](EmailSegmentArchiveResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloneEmailCampaign"></a>
# **cloneEmailCampaign**
> EmailCampaignResponse cloneEmailCampaign(storefrontOid, emailCampaignUuid)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailCampaignUuid = "emailCampaignUuid_example"; // String | null
try {
    EmailCampaignResponse result = apiInstance.cloneEmailCampaign(storefrontOid, emailCampaignUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#cloneEmailCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **String**| null |
 **emailCampaignUuid** | **String**| null |

### Return type

[**EmailCampaignResponse**](EmailCampaignResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cloneEmailFlow"></a>
# **cloneEmailFlow**
> EmailFlowResponse cloneEmailFlow(storefrontOid, emailFlowUuid)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailFlowUuid = "emailFlowUuid_example"; // String | null
try {
    EmailFlowResponse result = apiInstance.cloneEmailFlow(storefrontOid, emailFlowUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#cloneEmailFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **String**| null |
 **emailFlowUuid** | **String**| null |

### Return type

[**EmailFlowResponse**](EmailFlowResponse.md)

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
String domain = "domain_example"; // String | null
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
 **domain** | **String**| null |

### Return type

[**EmailSendingDomainResponse**](EmailSendingDomainResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String commseqEmailUuid = "commseqEmailUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **commseqEmailUuid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailListUuid = "emailListUuid_example"; // String | null
String emailCustomerUuid = "emailCustomerUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailListUuid** | **String**| null |
 **emailCustomerUuid** | **String**| null |

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
String domain = "domain_example"; // String | null
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
 **domain** | **String**| null |

### Return type

[**BaseResponse**](BaseResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailCampaignUuid = "emailCampaignUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailCampaignUuid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String statDays = "statDays_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **statDays** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String commseqUuid = "commseqUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **commseqUuid** | **String**| null |

### Return type

[**EmailCommseqResponse**](EmailCommseqResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseqEmailStats"></a>
# **getEmailCommseqEmailStats**
> EmailStatSummaryResponse getEmailCommseqEmailStats(storefrontOid, commseqUuid, commseqEmailUuid, days)

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
String storefrontOid = "storefrontOid_example"; // String | null
String commseqUuid = "commseqUuid_example"; // String | null
String commseqEmailUuid = "commseqEmailUuid_example"; // String | null
Integer days = 56; // Integer | null
try {
    EmailStatSummaryResponse result = apiInstance.getEmailCommseqEmailStats(storefrontOid, commseqUuid, commseqEmailUuid, days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseqEmailStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **String**| null |
 **commseqUuid** | **String**| null |
 **commseqEmailUuid** | **String**| null |
 **days** | **Integer**| null | [optional]

### Return type

[**EmailStatSummaryResponse**](EmailStatSummaryResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEmailCommseqStats"></a>
# **getEmailCommseqStats**
> EmailStatSummaryResponse getEmailCommseqStats(storefrontOid, commseqUuid, days)

Get email communication sequence stats

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
String storefrontOid = "storefrontOid_example"; // String | null
String commseqUuid = "commseqUuid_example"; // String | null
Integer days = 56; // Integer | null
try {
    EmailStatSummaryResponse result = apiInstance.getEmailCommseqStats(storefrontOid, commseqUuid, days);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#getEmailCommseqStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storefrontOid** | **String**| null |
 **commseqUuid** | **String**| null |
 **days** | **Integer**| null | [optional]

### Return type

[**EmailStatSummaryResponse**](EmailStatSummaryResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |

### Return type

[**EmailCommseqsResponse**](EmailCommseqsResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
Integer lastRecords = 56; // Integer | null
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
 **storefrontOid** | **String**| null |
 **lastRecords** | **Integer**| null | [optional]

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
String storefrontOid = "storefrontOid_example"; // String | null
Integer days = 56; // Integer | null
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
 **storefrontOid** | **String**| null |
 **days** | **Integer**| null | [optional]

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
String storefrontOid = "storefrontOid_example"; // String | null
String commseqEmailUuid = "commseqEmailUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **commseqEmailUuid** | **String**| null |

### Return type

[**EmailCommseqEmailResponse**](EmailCommseqEmailResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailFlowUuid = "emailFlowUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailFlowUuid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |

### Return type

[**EmailFlowsResponse**](EmailFlowsResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailListUuid = "emailListUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailListUuid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailListUuid = "emailListUuid_example"; // String | null
String emailCustomerUuid = "emailCustomerUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailListUuid** | **String**| null |
 **emailCustomerUuid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailListUuid = "emailListUuid_example"; // String | null
Integer pageNumber = 56; // Integer | null
Integer pageSize = 56; // Integer | null
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
 **storefrontOid** | **String**| null |
 **emailListUuid** | **String**| null |
 **pageNumber** | **Integer**| null | [optional]
 **pageSize** | **Integer**| null | [optional]

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |

### Return type

[**EmailListsResponse**](EmailListsResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailSegmentUuid = "emailSegmentUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailSegmentUuid** | **String**| null |

### Return type

[**EmailSegmentResponse**](EmailSegmentResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailSegmentUuid = "emailSegmentUuid_example"; // String | null
Integer pageNumber = 56; // Integer | null
Integer pageSize = 56; // Integer | null
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
 **storefrontOid** | **String**| null |
 **emailSegmentUuid** | **String**| null |
 **pageNumber** | **Integer**| null | [optional]
 **pageSize** | **Integer**| null | [optional]

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |

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
String domain = "domain_example"; // String | null
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
 **domain** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
Integer emailTemplateOid = 56; // Integer | null
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
 **storefrontOid** | **String**| null |
 **emailTemplateOid** | **Integer**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String triggerType = "triggerType_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **triggerType** | **String**| null | [optional]

### Return type

[**EmailTemplatesResponse**](EmailTemplatesResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |
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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |
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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |
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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |
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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailList** | [**EmailList**](EmailList.md)| Email list |

### Return type

[**EmailListResponse**](EmailListResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailSegment** | [**EmailSegment**](EmailSegment.md)| Email segment |

### Return type

[**EmailSegmentResponse**](EmailSegmentResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailListUuid = "emailListUuid_example"; // String | null
String startsWith = "startsWith_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailListUuid** | **String**| null |
 **startsWith** | **String**| null | [optional]

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailSegmentUuid = "emailSegmentUuid_example"; // String | null
String startsWith = "startsWith_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailSegmentUuid** | **String**| null |
 **startsWith** | **String**| null | [optional]

### Return type

[**EmailSegmentCustomersResponse**](EmailSegmentCustomersResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailCampaignUuid = "emailCampaignUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailCampaignUuid** | **String**| null |

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailListUuid = "emailListUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailListUuid** | **String**| null |
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
String storefrontOid = "storefrontOid_example"; // String | null
String emailCampaignUuid = "emailCampaignUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailCampaignUuid** | **String**| null |
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
String storefrontOid = "storefrontOid_example"; // String | null
String commseqUuid = "commseqUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **commseqUuid** | **String**| null |
 **emailCommseq** | [**EmailCommseq**](EmailCommseq.md)| Email commseq |

### Return type

[**EmailCommseqResponse**](EmailCommseqResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String commseqEmailUuid = "commseqEmailUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **commseqEmailUuid** | **String**| null |
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
String storefrontOid = "storefrontOid_example"; // String | null
String emailFlowUuid = "emailFlowUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailFlowUuid** | **String**| null |
 **emailFlow** | [**EmailFlow**](EmailFlow.md)| Email flow |

### Return type

[**EmailFlowResponse**](EmailFlowResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailListUuid = "emailListUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailListUuid** | **String**| null |
 **emailList** | [**EmailList**](EmailList.md)| Email list |

### Return type

[**EmailListResponse**](EmailListResponse.md)

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
String storefrontOid = "storefrontOid_example"; // String | null
String emailSegmentUuid = "emailSegmentUuid_example"; // String | null
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
 **storefrontOid** | **String**| null |
 **emailSegmentUuid** | **String**| null |
 **emailSegment** | [**EmailSegment**](EmailSegment.md)| Email segment |

### Return type

[**EmailSegmentResponse**](EmailSegmentResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="verifyEmailSendingDomain"></a>
# **verifyEmailSendingDomain**
> EmailSendingDomainResponse verifyEmailSendingDomain(domain)

Verify email campaign

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
String domain = "domain_example"; // String | null
try {
    EmailSendingDomainResponse result = apiInstance.verifyEmailSendingDomain(domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorefrontApi#verifyEmailSendingDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| null |

### Return type

[**EmailSendingDomainResponse**](EmailSendingDomainResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

