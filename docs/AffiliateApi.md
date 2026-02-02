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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AffiliateApi apiInstance = new AffiliateApi(apiKey);

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AffiliateApi apiInstance = new AffiliateApi(apiKey);

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

