# FulfillmentApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acknowledgeOrders**](FulfillmentApi.md#acknowledgeOrders) | **PUT** /fulfillment/distribution_centers/{distribution_center_code}/acknowledgements | Acknowledge receipt of orders.
[**generatePackingSlip**](FulfillmentApi.md#generatePackingSlip) | **GET** /fulfillment/distribution_centers/{distribution_center_code}/orders/{order_id} | Generate a packing slip for this order for the given distribution center.
[**getDistributionCenterOrders**](FulfillmentApi.md#getDistributionCenterOrders) | **GET** /fulfillment/distribution_centers/{distribution_center_code}/orders | Retrieve orders queued up for this distribution center.
[**getDistributionCenters**](FulfillmentApi.md#getDistributionCenters) | **GET** /fulfillment/distribution_centers | Retrieve distribution centers
[**shipOrders**](FulfillmentApi.md#shipOrders) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/shipments | Mark orders as shipped
[**updateInventory**](FulfillmentApi.md#updateInventory) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/inventory | Update inventory


<a name="acknowledgeOrders"></a>
# **acknowledgeOrders**
> acknowledgeOrders(distributionCenterCode, orderIds)

Acknowledge receipt of orders.

Acknowledge receipt of orders so that they are removed from the fulfillment queue.  This method must be called after receiving and order (via webhook) or retrieving (via retrieve orders method). 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.FulfillmentApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
FulfillmentApi apiInstance = new FulfillmentApi(apiKey);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<String> orderIds = Arrays.asList(new List<String>()); // List<String> | Orders to acknowledge receipt of (limit 100)
try {
    apiInstance.acknowledgeOrders(distributionCenterCode, orderIds);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#acknowledgeOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionCenterCode** | **String**| Distribution center code |
 **orderIds** | **List&lt;String&gt;**| Orders to acknowledge receipt of (limit 100) |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generatePackingSlip"></a>
# **generatePackingSlip**
> OrderPackingSlipResponse generatePackingSlip(distributionCenterCode, orderId)

Generate a packing slip for this order for the given distribution center.

The packing slip PDF that is returned is base 64 encoded 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.FulfillmentApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
FulfillmentApi apiInstance = new FulfillmentApi(apiKey);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
String orderId = "orderId_example"; // String | Order ID
try {
    OrderPackingSlipResponse result = apiInstance.generatePackingSlip(distributionCenterCode, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#generatePackingSlip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionCenterCode** | **String**| Distribution center code |
 **orderId** | **String**| Order ID |

### Return type

[**OrderPackingSlipResponse**](OrderPackingSlipResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDistributionCenterOrders"></a>
# **getDistributionCenterOrders**
> OrdersResponse getDistributionCenterOrders(distributionCenterCode)

Retrieve orders queued up for this distribution center.

Retrieves up to 100 orders that are queued up in this distribution center.  You must acknowledge them before additional new orders will be returned.  There is NO record chunking.  You&#39;ll get the same 100 records again and again until you acknowledge orders.  The orders that are returned contain only items for this distribution center and are by default completely expanded with billing, channel_partner, checkout, coupons, customer_profile, edi, gift, gift_certificate, internal, items, payment, shipping, summary, taxes. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.FulfillmentApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
FulfillmentApi apiInstance = new FulfillmentApi(apiKey);

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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionCenterCode** | **String**| Distribution center code |

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDistributionCenters"></a>
# **getDistributionCenters**
> DistributionCentersResponse getDistributionCenters()

Retrieve distribution centers

Retrieves the distribution centers that this user has access to. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.FulfillmentApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
FulfillmentApi apiInstance = new FulfillmentApi(apiKey);

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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="shipOrders"></a>
# **shipOrders**
> shipOrders(distributionCenterCode, shipments)

Mark orders as shipped

Store the tracking information and mark the order shipped for this distribution center. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.FulfillmentApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
FulfillmentApi apiInstance = new FulfillmentApi(apiKey);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<FulfillmentShipment> shipments = Arrays.asList(new FulfillmentShipment()); // List<FulfillmentShipment> | Orders to mark shipped
try {
    apiInstance.shipOrders(distributionCenterCode, shipments);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#shipOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionCenterCode** | **String**| Distribution center code |
 **shipments** | [**List&lt;FulfillmentShipment&gt;**](FulfillmentShipment.md)| Orders to mark shipped |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInventory"></a>
# **updateInventory**
> updateInventory(distributionCenterCode, inventories)

Update inventory

Update the inventory for items associated with this distribution center 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.FulfillmentApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
FulfillmentApi apiInstance = new FulfillmentApi(apiKey);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<FulfillmentInventory> inventories = Arrays.asList(new FulfillmentInventory()); // List<FulfillmentInventory> | Inventory updates (limit 500)
try {
    apiInstance.updateInventory(distributionCenterCode, inventories);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#updateInventory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributionCenterCode** | **String**| Distribution center code |
 **inventories** | [**List&lt;FulfillmentInventory&gt;**](FulfillmentInventory.md)| Inventory updates (limit 500) |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

