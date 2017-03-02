# FulfillmentApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fulfillmentDistributionCentersDistributionCenterCodeAcknowledgementsPut**](FulfillmentApi.md#fulfillmentDistributionCentersDistributionCenterCodeAcknowledgementsPut) | **PUT** /fulfillment/distribution_centers/{distribution_center_code}/acknowledgements | Acknowledge receipt of orders.
[**fulfillmentDistributionCentersDistributionCenterCodeInventoryPost**](FulfillmentApi.md#fulfillmentDistributionCentersDistributionCenterCodeInventoryPost) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/inventory | Update inventory
[**fulfillmentDistributionCentersDistributionCenterCodeOrdersGet**](FulfillmentApi.md#fulfillmentDistributionCentersDistributionCenterCodeOrdersGet) | **GET** /fulfillment/distribution_centers/{distribution_center_code}/orders | Retrieve orders queued up for this distribution center.
[**fulfillmentDistributionCentersDistributionCenterCodeShipmentsPost**](FulfillmentApi.md#fulfillmentDistributionCentersDistributionCenterCodeShipmentsPost) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/shipments | Mark orders as shipped
[**fulfillmentDistributionCentersGet**](FulfillmentApi.md#fulfillmentDistributionCentersGet) | **GET** /fulfillment/distribution_centers | Retrieve distribution centers


<a name="fulfillmentDistributionCentersDistributionCenterCodeAcknowledgementsPut"></a>
# **fulfillmentDistributionCentersDistributionCenterCodeAcknowledgementsPut**
> fulfillmentDistributionCentersDistributionCenterCodeAcknowledgementsPut(distributionCenterCode, orderIds)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

FulfillmentApi apiInstance = new FulfillmentApi();
String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<String> orderIds = Arrays.asList(new List<String>()); // List<String> | Orders to acknowledge receipt of (limit 100)
try {
    apiInstance.fulfillmentDistributionCentersDistributionCenterCodeAcknowledgementsPut(distributionCenterCode, orderIds);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#fulfillmentDistributionCentersDistributionCenterCodeAcknowledgementsPut");
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

<a name="fulfillmentDistributionCentersDistributionCenterCodeInventoryPost"></a>
# **fulfillmentDistributionCentersDistributionCenterCodeInventoryPost**
> fulfillmentDistributionCentersDistributionCenterCodeInventoryPost(distributionCenterCode, inventories)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

FulfillmentApi apiInstance = new FulfillmentApi();
String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<FulfillmentInventory> inventories = Arrays.asList(new FulfillmentInventory()); // List<FulfillmentInventory> | Inventory updates (limit 500)
try {
    apiInstance.fulfillmentDistributionCentersDistributionCenterCodeInventoryPost(distributionCenterCode, inventories);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#fulfillmentDistributionCentersDistributionCenterCodeInventoryPost");
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

<a name="fulfillmentDistributionCentersDistributionCenterCodeOrdersGet"></a>
# **fulfillmentDistributionCentersDistributionCenterCodeOrdersGet**
> OrdersResponse fulfillmentDistributionCentersDistributionCenterCodeOrdersGet(distributionCenterCode)

Retrieve orders queued up for this distribution center.

Retrieves up to 100 orders that are queued up in this distribution center.  You must acknowledge them before additional new orders will be returned.  The orders that are returned contain only items for this distribution center and are expanded with billing, buysafe, channel_partner, checkout, coupons, customer_profile, edi, gift, gift_certificate, internal, items, payment, shipping, summary, taxes. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.FulfillmentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

FulfillmentApi apiInstance = new FulfillmentApi();
String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
try {
    OrdersResponse result = apiInstance.fulfillmentDistributionCentersDistributionCenterCodeOrdersGet(distributionCenterCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#fulfillmentDistributionCentersDistributionCenterCodeOrdersGet");
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

<a name="fulfillmentDistributionCentersDistributionCenterCodeShipmentsPost"></a>
# **fulfillmentDistributionCentersDistributionCenterCodeShipmentsPost**
> fulfillmentDistributionCentersDistributionCenterCodeShipmentsPost(distributionCenterCode, shipments)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

FulfillmentApi apiInstance = new FulfillmentApi();
String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
List<FulfillmentShipment> shipments = Arrays.asList(new FulfillmentShipment()); // List<FulfillmentShipment> | Orders to mark shipped
try {
    apiInstance.fulfillmentDistributionCentersDistributionCenterCodeShipmentsPost(distributionCenterCode, shipments);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#fulfillmentDistributionCentersDistributionCenterCodeShipmentsPost");
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

<a name="fulfillmentDistributionCentersGet"></a>
# **fulfillmentDistributionCentersGet**
> DistributionCentersResponse fulfillmentDistributionCentersGet()

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

FulfillmentApi apiInstance = new FulfillmentApi();
try {
    DistributionCentersResponse result = apiInstance.fulfillmentDistributionCentersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FulfillmentApi#fulfillmentDistributionCentersGet");
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

