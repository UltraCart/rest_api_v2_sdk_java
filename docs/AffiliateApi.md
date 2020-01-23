# AffiliateApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClicksByQuery**](AffiliateApi.md#getClicksByQuery) | **POST** /affiliate/clicks/query | Retrieve clicks
[**getLedgersByQuery**](AffiliateApi.md#getLedgersByQuery) | **POST** /affiliate/ledgers/query | Retrieve ledger entries


<a name="getClicksByQuery"></a>
# **getClicksByQuery**
> AffiliateClicksResponse getClicksByQuery(clickQuery, limit, offset, expand)

Retrieve clicks

Retrieves a group of clicks from the account based on a query object.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the clicks returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AffiliateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

AffiliateApi apiInstance = new AffiliateApi();
AffiliateClickQuery clickQuery = new AffiliateClickQuery(); // AffiliateClickQuery | Click query
Integer limit = 10000; // Integer | The maximum number of records to return on this one API call. (Maximum 10000)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String expand = "expand_example"; // String | The object expansion to perform on the result.  Only option is link.
try {
    AffiliateClicksResponse result = apiInstance.getClicksByQuery(clickQuery, limit, offset, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AffiliateApi#getClicksByQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clickQuery** | [**AffiliateClickQuery**](AffiliateClickQuery.md)| Click query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 10000) | [optional] [default to 10000]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **expand** | **String**| The object expansion to perform on the result.  Only option is link. | [optional]

### Return type

[**AffiliateClicksResponse**](AffiliateClicksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLedgersByQuery"></a>
# **getLedgersByQuery**
> AffiliateLedgersResponse getLedgersByQuery(ledgerQuery, limit, offset, expand)

Retrieve ledger entries

Retrieves a group of ledger entries from the account based on a query object.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the ledgers returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AffiliateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

AffiliateApi apiInstance = new AffiliateApi();
AffiliateLedgerQuery ledgerQuery = new AffiliateLedgerQuery(); // AffiliateLedgerQuery | Ledger query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Maximum 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String expand = "expand_example"; // String | The object expansion to perform on the result.  Only option is link.
try {
    AffiliateLedgersResponse result = apiInstance.getLedgersByQuery(ledgerQuery, limit, offset, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AffiliateApi#getLedgersByQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ledgerQuery** | [**AffiliateLedgerQuery**](AffiliateLedgerQuery.md)| Ledger query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **expand** | **String**| The object expansion to perform on the result.  Only option is link. | [optional]

### Return type

[**AffiliateLedgersResponse**](AffiliateLedgersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

