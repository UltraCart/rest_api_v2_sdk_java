# AutoOrderApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAutoOrder**](AutoOrderApi.md#getAutoOrder) | **GET** /auto_order/auto_orders/{auto_order_oid} | Retrieve an auto order by oid |
| [**getAutoOrderByCode**](AutoOrderApi.md#getAutoOrderByCode) | **GET** /auto_order/auto_orders/code/{auto_order_code} | Retrieve an auto order by code |
| [**getAutoOrderByReferenceOrderId**](AutoOrderApi.md#getAutoOrderByReferenceOrderId) | **GET** /auto_order/auto_orders/reference_order_id/{reference_order_id} | Retrieve an auto order by order id |
| [**getAutoOrders**](AutoOrderApi.md#getAutoOrders) | **GET** /auto_order/auto_orders | Retrieve auto orders |
| [**getAutoOrdersBatch**](AutoOrderApi.md#getAutoOrdersBatch) | **POST** /auto_order/auto_orders/batch | Retrieve auto order batch |
| [**getAutoOrdersByQuery**](AutoOrderApi.md#getAutoOrdersByQuery) | **POST** /auto_order/auto_orders/query | Retrieve auto orders by query |
| [**updateAutoOrder**](AutoOrderApi.md#updateAutoOrder) | **PUT** /auto_order/auto_orders/{auto_order_oid} | Update an auto order |
| [**updateAutoOrdersBatch**](AutoOrderApi.md#updateAutoOrdersBatch) | **PUT** /auto_order/auto_orders/batch | Update multiple auto orders |


<a name="getAutoOrder"></a>
# **getAutoOrder**
> AutoOrderResponse getAutoOrder(autoOrderOid, expand)

Retrieve an auto order by oid

Retrieves a single auto order using the specified auto order oid. 

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
import com.ultracart.admin.v2.AutoOrderApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AutoOrderApi apiInstance = new AutoOrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer autoOrderOid = 56; // Integer | The auto order oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.getAutoOrder(autoOrderOidexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrder");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderOid** | **Integer**| The auto order oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a name="getAutoOrderByCode"></a>
# **getAutoOrderByCode**
> AutoOrderResponse getAutoOrderByCode(autoOrderCode, expand)

Retrieve an auto order by code

Retrieves a single auto order using the specified reference (original) order id. 

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
import com.ultracart.admin.v2.AutoOrderApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AutoOrderApi apiInstance = new AutoOrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String autoOrderCode = "autoOrderCode_example"; // String | The auto order oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.getAutoOrderByCode(autoOrderCodeexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrderByCode");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderCode** | **String**| The auto order oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a name="getAutoOrderByReferenceOrderId"></a>
# **getAutoOrderByReferenceOrderId**
> AutoOrderResponse getAutoOrderByReferenceOrderId(referenceOrderId, expand)

Retrieve an auto order by order id

Retrieves a single auto order using the specified reference (original) order id. 

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
import com.ultracart.admin.v2.AutoOrderApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AutoOrderApi apiInstance = new AutoOrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String referenceOrderId = "referenceOrderId_example"; // String | The auto order oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.getAutoOrderByReferenceOrderId(referenceOrderIdexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrderByReferenceOrderId");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **referenceOrderId** | **String**| The auto order oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a name="getAutoOrders"></a>
# **getAutoOrders**
> AutoOrdersResponse getAutoOrders(autoOrderCode, originalOrderId, firstName, lastName, company, city, state, postalCode, countryCode, phone, email, originalOrderDateBegin, originalOrderDateEnd, nextShipmentDateBegin, nextShipmentDateEnd, cardType, itemId, status, limit, offset, since, sort, expand)

Retrieve auto orders

Retrieves auto orders from the account.  If no parameters are specified, all auto orders will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

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
import com.ultracart.admin.v2.AutoOrderApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AutoOrderApi apiInstance = new AutoOrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String autoOrderCode = "autoOrderCode_example"; // String | Auto order code
String originalOrderId = "originalOrderId_example"; // String | Original order id
String firstName = "firstName_example"; // String | First name
String lastName = "lastName_example"; // String | Last name
String company = "company_example"; // String | Company
String city = "city_example"; // String | City
String state = "state_example"; // String | State
String postalCode = "postalCode_example"; // String | Postal code
String countryCode = "countryCode_example"; // String | Country code (ISO-3166 two letter)
String phone = "phone_example"; // String | Phone
String email = "email_example"; // String | Email
String originalOrderDateBegin = "originalOrderDateBegin_example"; // String | Original order date begin
String originalOrderDateEnd = "originalOrderDateEnd_example"; // String | Original order date end
String nextShipmentDateBegin = "nextShipmentDateBegin_example"; // String | Next shipment date begin
String nextShipmentDateEnd = "nextShipmentDateEnd_example"; // String | Next shipment date end
String cardType = "cardType_example"; // String | Card type
String itemId = "itemId_example"; // String | Item ID
String status = "status_example"; // String | Status
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch auto orders that have been created/modified since this date/time.
String sort = "sort_example"; // String | The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrdersResponse result = apiInstance.getAutoOrders(autoOrderCodeoriginalOrderIdfirstNamelastNamecompanycitystatepostalCodecountryCodephoneemailoriginalOrderDateBeginoriginalOrderDateEndnextShipmentDateBeginnextShipmentDateEndcardTypeitemIdstatuslimitoffsetsincesortexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrders");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderCode** | **String**| Auto order code | [optional] |
| **originalOrderId** | **String**| Original order id | [optional] |
| **firstName** | **String**| First name | [optional] |
| **lastName** | **String**| Last name | [optional] |
| **company** | **String**| Company | [optional] |
| **city** | **String**| City | [optional] |
| **state** | **String**| State | [optional] |
| **postalCode** | **String**| Postal code | [optional] |
| **countryCode** | **String**| Country code (ISO-3166 two letter) | [optional] |
| **phone** | **String**| Phone | [optional] |
| **email** | **String**| Email | [optional] |
| **originalOrderDateBegin** | **String**| Original order date begin | [optional] |
| **originalOrderDateEnd** | **String**| Original order date end | [optional] |
| **nextShipmentDateBegin** | **String**| Next shipment date begin | [optional] |
| **nextShipmentDateEnd** | **String**| Next shipment date end | [optional] |
| **cardType** | **String**| Card type | [optional] |
| **itemId** | **String**| Item ID | [optional] |
| **status** | **String**| Status | [optional] |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch auto orders that have been created/modified since this date/time. | [optional] |
| **sort** | **String**| The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a name="getAutoOrdersBatch"></a>
# **getAutoOrdersBatch**
> AutoOrdersResponse getAutoOrdersBatch(autoOrderBatch, expand)

Retrieve auto order batch

Retrieves a group of auto orders from the account based on an array of auto order oids.  If more than 200 auto order ids are specified, the API call will fail with a bad request error. 

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
import com.ultracart.admin.v2.AutoOrderApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AutoOrderApi apiInstance = new AutoOrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

AutoOrderQueryBatch autoOrderBatch = new AutoOrderQueryBatch(); // AutoOrderQueryBatch | Auto order batch
String expand = "expand_example"; // String | The object expansion to perform on the result.
try {
    AutoOrdersResponse result = apiInstance.getAutoOrdersBatch(autoOrderBatchexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrdersBatch");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderBatch** | [**AutoOrderQueryBatch**](AutoOrderQueryBatch.md)| Auto order batch | |
| **expand** | **String**| The object expansion to perform on the result. | [optional] |

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

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

<a name="getAutoOrdersByQuery"></a>
# **getAutoOrdersByQuery**
> AutoOrdersResponse getAutoOrdersByQuery(autoOrderQuery, limit, offset, sort, expand)

Retrieve auto orders by query

Retrieves a group of auto orders from the account based on a query object.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

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
import com.ultracart.admin.v2.AutoOrderApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AutoOrderApi apiInstance = new AutoOrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

AutoOrderQuery autoOrderQuery = new AutoOrderQuery(); // AutoOrderQuery | Auto order query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Maximum 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.
try {
    AutoOrdersResponse result = apiInstance.getAutoOrdersByQuery(autoOrderQuerylimitoffsetsortexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrdersByQuery");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderQuery** | [**AutoOrderQuery**](AutoOrderQuery.md)| Auto order query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result. | [optional] |

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

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

<a name="updateAutoOrder"></a>
# **updateAutoOrder**
> AutoOrderResponse updateAutoOrder(autoOrderOid, autoOrder, expand)

Update an auto order

Update an auto order on the UltraCart account. 

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
import com.ultracart.admin.v2.AutoOrderApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AutoOrderApi apiInstance = new AutoOrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer autoOrderOid = 56; // Integer | The auto order oid to update.
AutoOrder autoOrder = new AutoOrder(); // AutoOrder | Auto order to update
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.updateAutoOrder(autoOrderOidautoOrderexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#updateAutoOrder");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderOid** | **Integer**| The auto order oid to update. | |
| **autoOrder** | [**AutoOrder**](AutoOrder.md)| Auto order to update | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
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

<a name="updateAutoOrdersBatch"></a>
# **updateAutoOrdersBatch**
> AutoOrdersResponse updateAutoOrdersBatch(autoOrdersRequest, expand, placeholders, async)

Update multiple auto orders

Update multiple auto orders on the UltraCart account. 

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
import com.ultracart.admin.v2.AutoOrderApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
AutoOrderApi apiInstance = new AutoOrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

AutoOrdersRequest autoOrdersRequest = new AutoOrdersRequest(); // AutoOrdersRequest | Auto orders to update (synchronous maximum 20 / asynchronous maximum 100)
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
Boolean async = true; // Boolean | True if the operation should be run async.  No result returned
try {
    AutoOrdersResponse result = apiInstance.updateAutoOrdersBatch(autoOrdersRequestexpandplaceholdersasync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#updateAutoOrdersBatch");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrdersRequest** | [**AutoOrdersRequest**](AutoOrdersRequest.md)| Auto orders to update (synchronous maximum 20 / asynchronous maximum 100) | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |
| **async** | **Boolean**| True if the operation should be run async.  No result returned | [optional] |

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
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

