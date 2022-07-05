# AffiliateApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getClicksByQuery**](AffiliateApi.md#getClicksByQuery) | **POST** /affiliate/clicks/query | Retrieve clicks |
| [**getLedgersByQuery**](AffiliateApi.md#getLedgersByQuery) | **POST** /affiliate/ledgers/query | Retrieve ledger entries |


<a name="getClicksByQuery"></a>
# **getClicksByQuery**
> AffiliateClicksResponse getClicksByQuery(clickQuery, limit, offset, expand)

Retrieve clicks

Retrieves a group of clicks from the account based on a query object.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the clicks returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.AffiliateApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AffiliateApi apiInstance = new AffiliateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

AffiliateClickQuery clickQuery = new AffiliateClickQuery(); // AffiliateClickQuery | Click query
Integer limit = 10000; // Integer | The maximum number of records to return on this one API call. (Maximum 10000)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String expand = "expand_example"; // String | The object expansion to perform on the result.  Only option is link.
try {
    AffiliateClicksResponse result = apiInstance.getClicksByQuery(clickQuerylimitoffsetexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AffiliateApi#getClicksByQuery");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clickQuery** | [**AffiliateClickQuery**](AffiliateClickQuery.md)| Click query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 10000) | [optional] [default to 10000] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **expand** | **String**| The object expansion to perform on the result.  Only option is link. | [optional] |

### Return type

[**AffiliateClicksResponse**](AffiliateClicksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getLedgersByQuery"></a>
# **getLedgersByQuery**
> AffiliateLedgersResponse getLedgersByQuery(ledgerQuery, limit, offset, expand)

Retrieve ledger entries

Retrieves a group of ledger entries from the account based on a query object.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the ledgers returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.AffiliateApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AffiliateApi apiInstance = new AffiliateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

AffiliateLedgerQuery ledgerQuery = new AffiliateLedgerQuery(); // AffiliateLedgerQuery | Ledger query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Maximum 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String expand = "expand_example"; // String | The object expansion to perform on the result.  Only option is link.
try {
    AffiliateLedgersResponse result = apiInstance.getLedgersByQuery(ledgerQuerylimitoffsetexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AffiliateApi#getLedgersByQuery");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ledgerQuery** | [**AffiliateLedgerQuery**](AffiliateLedgerQuery.md)| Ledger query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **expand** | **String**| The object expansion to perform on the result.  Only option is link. | [optional] |

### Return type

[**AffiliateLedgersResponse**](AffiliateLedgersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

