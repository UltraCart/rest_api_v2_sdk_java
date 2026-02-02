# AutoOrderApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**consolidateAutoOrders**](AutoOrderApi.md#consolidateAutoOrders) | **PUT** /auto_order/auto_orders/{auto_order_oid}/consolidate | Consolidates multiple auto orders
[**establishAutoOrderByReferenceOrderId**](AutoOrderApi.md#establishAutoOrderByReferenceOrderId) | **POST** /auto_order/auto_orders/reference_order_id/{reference_order_id} | Establish an auto order by referencing a regular order id
[**getAutoOrder**](AutoOrderApi.md#getAutoOrder) | **GET** /auto_order/auto_orders/{auto_order_oid} | Retrieve an auto order by oid
[**getAutoOrderByCode**](AutoOrderApi.md#getAutoOrderByCode) | **GET** /auto_order/auto_orders/code/{auto_order_code} | Retrieve an auto order by code
[**getAutoOrderByReferenceOrderId**](AutoOrderApi.md#getAutoOrderByReferenceOrderId) | **GET** /auto_order/auto_orders/reference_order_id/{reference_order_id} | Retrieve an auto order by order id
[**getAutoOrders**](AutoOrderApi.md#getAutoOrders) | **GET** /auto_order/auto_orders | Retrieve auto orders
[**getAutoOrdersBatch**](AutoOrderApi.md#getAutoOrdersBatch) | **POST** /auto_order/auto_orders/batch | Retrieve auto order batch
[**getAutoOrdersByQuery**](AutoOrderApi.md#getAutoOrdersByQuery) | **POST** /auto_order/auto_orders/query | Retrieve auto orders by query
[**pauseAutoOrder**](AutoOrderApi.md#pauseAutoOrder) | **PUT** /auto_order/auto_orders/{auto_order_oid}/pause | Pause auto order
[**updateAutoOrder**](AutoOrderApi.md#updateAutoOrder) | **PUT** /auto_order/auto_orders/{auto_order_oid} | Update an auto order
[**updateAutoOrdersBatch**](AutoOrderApi.md#updateAutoOrdersBatch) | **PUT** /auto_order/auto_orders/batch | Update multiple auto orders


<a name="consolidateAutoOrders"></a>
# **consolidateAutoOrders**
> AutoOrderResponse consolidateAutoOrders(autoOrderConsolidate, autoOrderOid, expand)

Consolidates multiple auto orders

Consolidates mutliple auto orders on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

AutoOrderConsolidate autoOrderConsolidate = new AutoOrderConsolidate(); // AutoOrderConsolidate | Auto orders to consolidate
Integer autoOrderOid = 56; // Integer | The auto order oid to consolidate into.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.consolidateAutoOrders(autoOrderConsolidate, autoOrderOid, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#consolidateAutoOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrderConsolidate** | [**AutoOrderConsolidate**](AutoOrderConsolidate.md)| Auto orders to consolidate |
 **autoOrderOid** | **Integer**| The auto order oid to consolidate into. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="establishAutoOrderByReferenceOrderId"></a>
# **establishAutoOrderByReferenceOrderId**
> AutoOrderResponse establishAutoOrderByReferenceOrderId(referenceOrderId, expand)

Establish an auto order by referencing a regular order id

Establish an auto order by referencing a regular order id.  The result will be an auto order without any items.  You should add the items and perform an update call.  Orders must be less than 60 days old and use a credit card payment. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

String referenceOrderId = "referenceOrderId_example"; // String | The order id to attach this auto order to
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.establishAutoOrderByReferenceOrderId(referenceOrderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#establishAutoOrderByReferenceOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceOrderId** | **String**| The order id to attach this auto order to |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutoOrder"></a>
# **getAutoOrder**
> AutoOrderResponse getAutoOrder(autoOrderOid, expand)

Retrieve an auto order by oid

Retrieves a single auto order using the specified auto order oid. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

Integer autoOrderOid = 56; // Integer | The auto order oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.getAutoOrder(autoOrderOid, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrderOid** | **Integer**| The auto order oid to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutoOrderByCode"></a>
# **getAutoOrderByCode**
> AutoOrderResponse getAutoOrderByCode(autoOrderCode, expand)

Retrieve an auto order by code

Retrieves a single auto order using the specified reference (original) order id. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

String autoOrderCode = "autoOrderCode_example"; // String | The auto order oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.getAutoOrderByCode(autoOrderCode, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrderByCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrderCode** | **String**| The auto order oid to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutoOrderByReferenceOrderId"></a>
# **getAutoOrderByReferenceOrderId**
> AutoOrderResponse getAutoOrderByReferenceOrderId(referenceOrderId, expand)

Retrieve an auto order by order id

Retrieves a single auto order using the specified reference (original) order id. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

String referenceOrderId = "referenceOrderId_example"; // String | The auto order oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.getAutoOrderByReferenceOrderId(referenceOrderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrderByReferenceOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **referenceOrderId** | **String**| The auto order oid to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutoOrders"></a>
# **getAutoOrders**
> AutoOrdersResponse getAutoOrders(autoOrderCode, originalOrderId, firstName, lastName, company, city, state, postalCode, countryCode, phone, email, originalOrderDateBegin, originalOrderDateEnd, nextShipmentDateBegin, nextShipmentDateEnd, cardType, itemId, status, limit, offset, since, sort, expand)

Retrieve auto orders

Retrieves auto orders from the account.  If no parameters are specified, all auto orders will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

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
    AutoOrdersResponse result = apiInstance.getAutoOrders(autoOrderCode, originalOrderId, firstName, lastName, company, city, state, postalCode, countryCode, phone, email, originalOrderDateBegin, originalOrderDateEnd, nextShipmentDateBegin, nextShipmentDateEnd, cardType, itemId, status, limit, offset, since, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrderCode** | **String**| Auto order code | [optional]
 **originalOrderId** | **String**| Original order id | [optional]
 **firstName** | **String**| First name | [optional]
 **lastName** | **String**| Last name | [optional]
 **company** | **String**| Company | [optional]
 **city** | **String**| City | [optional]
 **state** | **String**| State | [optional]
 **postalCode** | **String**| Postal code | [optional]
 **countryCode** | **String**| Country code (ISO-3166 two letter) | [optional]
 **phone** | **String**| Phone | [optional]
 **email** | **String**| Email | [optional]
 **originalOrderDateBegin** | **String**| Original order date begin | [optional]
 **originalOrderDateEnd** | **String**| Original order date end | [optional]
 **nextShipmentDateBegin** | **String**| Next shipment date begin | [optional]
 **nextShipmentDateEnd** | **String**| Next shipment date end | [optional]
 **cardType** | **String**| Card type | [optional]
 **itemId** | **String**| Item ID | [optional]
 **status** | **String**| Status | [optional]
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch auto orders that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutoOrdersBatch"></a>
# **getAutoOrdersBatch**
> AutoOrdersResponse getAutoOrdersBatch(autoOrderBatch, expand)

Retrieve auto order batch

Retrieves a group of auto orders from the account based on an array of auto order oids.  If more than 200 auto order ids are specified, the API call will fail with a bad request error. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

AutoOrderQueryBatch autoOrderBatch = new AutoOrderQueryBatch(); // AutoOrderQueryBatch | Auto order batch
String expand = "expand_example"; // String | The object expansion to perform on the result.
try {
    AutoOrdersResponse result = apiInstance.getAutoOrdersBatch(autoOrderBatch, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrdersBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrderBatch** | [**AutoOrderQueryBatch**](AutoOrderQueryBatch.md)| Auto order batch |
 **expand** | **String**| The object expansion to perform on the result. | [optional]

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAutoOrdersByQuery"></a>
# **getAutoOrdersByQuery**
> AutoOrdersResponse getAutoOrdersByQuery(autoOrderQuery, limit, offset, sort, expand)

Retrieve auto orders by query

Retrieves a group of auto orders from the account based on a query object.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

AutoOrderQuery autoOrderQuery = new AutoOrderQuery(); // AutoOrderQuery | Auto order query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Maximum 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.
try {
    AutoOrdersResponse result = apiInstance.getAutoOrdersByQuery(autoOrderQuery, limit, offset, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#getAutoOrdersByQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrderQuery** | [**AutoOrderQuery**](AutoOrderQuery.md)| Auto order query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **sort** | **String**| The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result. | [optional]

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pauseAutoOrder"></a>
# **pauseAutoOrder**
> AutoOrderResponse pauseAutoOrder(autoOrder, autoOrderOid, expand)

Pause auto order

Completely pause an auto order 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

AutoOrder autoOrder = new AutoOrder(); // AutoOrder | Auto order to pause
Integer autoOrderOid = 56; // Integer | The auto order oid to pause.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.pauseAutoOrder(autoOrder, autoOrderOid, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#pauseAutoOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrder** | [**AutoOrder**](AutoOrder.md)| Auto order to pause |
 **autoOrderOid** | **Integer**| The auto order oid to pause. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateAutoOrder"></a>
# **updateAutoOrder**
> AutoOrderResponse updateAutoOrder(autoOrder, autoOrderOid, validateOriginalOrder, expand)

Update an auto order

Update an auto order on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

AutoOrder autoOrder = new AutoOrder(); // AutoOrder | Auto order to update
Integer autoOrderOid = 56; // Integer | The auto order oid to update.
String validateOriginalOrder = "validateOriginalOrder_example"; // String | Validate original order before updating
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.updateAutoOrder(autoOrder, autoOrderOid, validateOriginalOrder, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#updateAutoOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrder** | [**AutoOrder**](AutoOrder.md)| Auto order to update |
 **autoOrderOid** | **Integer**| The auto order oid to update. |
 **validateOriginalOrder** | **String**| Validate original order before updating | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateAutoOrdersBatch"></a>
# **updateAutoOrdersBatch**
> AutoOrdersResponse updateAutoOrdersBatch(autoOrdersRequest, expand, placeholders, async)

Update multiple auto orders

Update multiple auto orders on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoOrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
AutoOrderApi apiInstance = new AutoOrderApi(apiKey);

AutoOrdersRequest autoOrdersRequest = new AutoOrdersRequest(); // AutoOrdersRequest | Auto orders to update (synchronous maximum 20 / asynchronous maximum 100)
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
Boolean async = true; // Boolean | True if the operation should be run async.  No result returned
try {
    AutoOrdersResponse result = apiInstance.updateAutoOrdersBatch(autoOrdersRequest, expand, placeholders, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoOrderApi#updateAutoOrdersBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrdersRequest** | [**AutoOrdersRequest**](AutoOrdersRequest.md)| Auto orders to update (synchronous maximum 20 / asynchronous maximum 100) |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]
 **async** | **Boolean**| True if the operation should be run async.  No result returned | [optional]

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

