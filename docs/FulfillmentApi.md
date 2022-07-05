# FulfillmentApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acknowledgeOrders**](FulfillmentApi.md#acknowledgeOrders) | **PUT** /fulfillment/distribution_centers/{distribution_center_code}/acknowledgements | Acknowledge receipt of orders. |
| [**generatePackingSlip**](FulfillmentApi.md#generatePackingSlip) | **GET** /fulfillment/distribution_centers/{distribution_center_code}/orders/{order_id} | Generate a packing slip for this order for the given distribution center. |
| [**getDistributionCenterOrders**](FulfillmentApi.md#getDistributionCenterOrders) | **GET** /fulfillment/distribution_centers/{distribution_center_code}/orders | Retrieve orders queued up for this distribution center. |
| [**getDistributionCenters**](FulfillmentApi.md#getDistributionCenters) | **GET** /fulfillment/distribution_centers | Retrieve distribution centers |
| [**shipOrders**](FulfillmentApi.md#shipOrders) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/shipments | Mark orders as shipped |
| [**updateInventory**](FulfillmentApi.md#updateInventory) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/inventory | Update inventory |


<a name="acknowledgeOrders"></a>
# **acknowledgeOrders**
> acknowledgeOrders(distributionCenterCode, orderIds)

Acknowledge receipt of orders.

Acknowledge receipt of orders so that they are removed from the fulfillment queue.  This method must be called after receiving and order (via webhook) or retrieving (via retrieve orders method). 

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
import com.ultracart.admin.v2.FulfillmentApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
FulfillmentApi apiInstance = new FulfillmentApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<String> orderIds = Arrays.asList(); // List<String> | Orders to acknowledge receipt of (limit 100)
try {
    apiInstance.acknowledgeOrders(distributionCenterCodeorderIds);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#acknowledgeOrders");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |
| **orderIds** | [**List&lt;String&gt;**](String.md)| Orders to acknowledge receipt of (limit 100) | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="generatePackingSlip"></a>
# **generatePackingSlip**
> OrdersResponse generatePackingSlip(distributionCenterCode, orderId)

Generate a packing slip for this order for the given distribution center.

The packing slip PDF that is returned is base 64 encoded 

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
import com.ultracart.admin.v2.FulfillmentApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
FulfillmentApi apiInstance = new FulfillmentApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
String orderId = "orderId_example"; // String | Order ID
try {
    OrdersResponse result = apiInstance.generatePackingSlip(distributionCenterCodeorderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#generatePackingSlip");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |
| **orderId** | **String**| Order ID | |

### Return type

[**OrdersResponse**](OrdersResponse.md)

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

<a name="getDistributionCenterOrders"></a>
# **getDistributionCenterOrders**
> OrdersResponse getDistributionCenterOrders(distributionCenterCode)

Retrieve orders queued up for this distribution center.

Retrieves up to 100 orders that are queued up in this distribution center.  You must acknowledge them before additional new orders will be returned.  There is NO record chunking.  You&#39;ll get the same 100 records again and again until you acknowledge orders.  The orders that are returned contain only items for this distribution center and are by default completely expanded with billing, buysafe, channel_partner, checkout, coupons, customer_profile, edi, gift, gift_certificate, internal, items, payment, shipping, summary, taxes. 

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
import com.ultracart.admin.v2.FulfillmentApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
FulfillmentApi apiInstance = new FulfillmentApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
try {
    OrdersResponse result = apiInstance.getDistributionCenterOrders(distributionCenterCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#getDistributionCenterOrders");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |

### Return type

[**OrdersResponse**](OrdersResponse.md)

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

<a name="getDistributionCenters"></a>
# **getDistributionCenters**
> DistributionCentersResponse getDistributionCenters()

Retrieve distribution centers

Retrieves the distribution centers that this user has access to. 

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
import com.ultracart.admin.v2.FulfillmentApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
FulfillmentApi apiInstance = new FulfillmentApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    DistributionCentersResponse result = apiInstance.getDistributionCenters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#getDistributionCenters");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**DistributionCentersResponse**](DistributionCentersResponse.md)

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

<a name="shipOrders"></a>
# **shipOrders**
> shipOrders(distributionCenterCode, shipments)

Mark orders as shipped

Store the tracking information and mark the order shipped for this distribution center. 

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
import com.ultracart.admin.v2.FulfillmentApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
FulfillmentApi apiInstance = new FulfillmentApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<FulfillmentShipment> shipments = Arrays.asList(); // List<FulfillmentShipment> | Orders to mark shipped
try {
    apiInstance.shipOrders(distributionCenterCodeshipments);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#shipOrders");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |
| **shipments** | [**List&lt;FulfillmentShipment&gt;**](FulfillmentShipment.md)| Orders to mark shipped | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="updateInventory"></a>
# **updateInventory**
> updateInventory(distributionCenterCode, inventories)

Update inventory

Update the inventory for items associated with this distribution center 

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
import com.ultracart.admin.v2.FulfillmentApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
FulfillmentApi apiInstance = new FulfillmentApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<FulfillmentInventory> inventories = Arrays.asList(); // List<FulfillmentInventory> | Inventory updates (limit 500)
try {
    apiInstance.updateInventory(distributionCenterCodeinventories);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#updateInventory");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |
| **inventories** | [**List&lt;FulfillmentInventory&gt;**](FulfillmentInventory.md)| Inventory updates (limit 500) | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

