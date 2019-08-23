# OrderApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrder**](OrderApi.md#cancelOrder) | **POST** /order/orders/{order_id}/cancel | Cancel an order
[**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /order/orders/{order_id} | Delete an order
[**format**](OrderApi.md#format) | **POST** /order/orders/{order_id}/format | Format order
[**getAccountsReceivableRetryConfig**](OrderApi.md#getAccountsReceivableRetryConfig) | **GET** /order/accountsReceivableRetryConfig | Retrieve A/R Retry Configuration
[**getAccountsReceivableRetryStats**](OrderApi.md#getAccountsReceivableRetryStats) | **GET** /order/accountsReceivableRetryConfig/stats | Retrieve A/R Retry Statistics
[**getOrder**](OrderApi.md#getOrder) | **GET** /order/orders/{order_id} | Retrieve an order
[**getOrders**](OrderApi.md#getOrders) | **GET** /order/orders | Retrieve orders
[**getOrdersByQuery**](OrderApi.md#getOrdersByQuery) | **POST** /order/orders/query | Retrieve orders
[**insertOrder**](OrderApi.md#insertOrder) | **POST** /order/orders | Insert an order
[**refundOrder**](OrderApi.md#refundOrder) | **PUT** /order/orders/{order_id}/refund | Refund an order
[**replacement**](OrderApi.md#replacement) | **POST** /order/orders/{order_id}/replacement | Replacement order
[**resendReceipt**](OrderApi.md#resendReceipt) | **POST** /order/orders/{order_id}/resend_receipt | Resend receipt
[**resendShipmentConfirmation**](OrderApi.md#resendShipmentConfirmation) | **POST** /order/orders/{order_id}/resend_shipment_confirmation | Resend shipment confirmation
[**updateAccountsReceivableRetryConfig**](OrderApi.md#updateAccountsReceivableRetryConfig) | **POST** /order/accountsReceivableRetryConfig | Update A/R Retry Configuration
[**updateOrder**](OrderApi.md#updateOrder) | **PUT** /order/orders/{order_id} | Update an order


<a name="cancelOrder"></a>
# **cancelOrder**
> BaseResponse cancelOrder(orderId)

Cancel an order

Cancel an order on the UltraCart account.  If the success flag is false, then consult the error message for why it failed. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order id to cancel.
try {
    BaseResponse result = apiInstance.cancelOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#cancelOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to cancel. |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(orderId)

Delete an order

Delete an order on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order id to delete.
try {
    apiInstance.deleteOrder(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to delete. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="format"></a>
# **format**
> OrderFormatResponse format(orderId, formatOptions)

Format order

Format the order for display at text or html 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order id to format
OrderFormat formatOptions = new OrderFormat(); // OrderFormat | Format options
try {
    OrderFormatResponse result = apiInstance.format(orderId, formatOptions);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#format");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to format |
 **formatOptions** | [**OrderFormat**](OrderFormat.md)| Format options |

### Return type

[**OrderFormatResponse**](OrderFormatResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountsReceivableRetryConfig"></a>
# **getAccountsReceivableRetryConfig**
> AccountsReceivableRetryConfigResponse getAccountsReceivableRetryConfig()

Retrieve A/R Retry Configuration

Retrieve A/R Retry Configuration. This is primarily an internal API call.  It is doubtful you would ever need to use it. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
try {
    AccountsReceivableRetryConfigResponse result = apiInstance.getAccountsReceivableRetryConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getAccountsReceivableRetryConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountsReceivableRetryConfigResponse**](AccountsReceivableRetryConfigResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountsReceivableRetryStats"></a>
# **getAccountsReceivableRetryStats**
> AccountsReceivableRetryStatsResponse getAccountsReceivableRetryStats(from, to)

Retrieve A/R Retry Statistics

Retrieve A/R Retry Statistics. This is primarily an internal API call.  It is doubtful you would ever need to use it. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String from = "from_example"; // String | null
String to = "to_example"; // String | null
try {
    AccountsReceivableRetryStatsResponse result = apiInstance.getAccountsReceivableRetryStats(from, to);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getAccountsReceivableRetryStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **from** | **String**| null | [optional]
 **to** | **String**| null | [optional]

### Return type

[**AccountsReceivableRetryStatsResponse**](AccountsReceivableRetryStatsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrder"></a>
# **getOrder**
> OrderResponse getOrder(orderId, expand)

Retrieve an order

Retrieves a single order using the specified order id. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order id to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.getOrder(orderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrders"></a>
# **getOrders**
> OrdersResponse getOrders(orderId, paymentMethod, company, firstName, lastName, city, stateRegion, postalCode, countryCode, phone, email, ccEmail, total, screenBrandingThemeCode, storefrontHostName, creationDateBegin, creationDateEnd, paymentDateBegin, paymentDateEnd, shipmentDateBegin, shipmentDateEnd, rma, purchaseOrderNumber, itemId, currentStage, channelPartnerCode, channelPartnerOrderId, customerProfileOid, refundDateBegin, refundDateEnd, limit, offset, sort, expand)

Retrieve orders

Retrieves a group of orders from the account.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the orders returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | Order Id
String paymentMethod = "paymentMethod_example"; // String | Payment Method
String company = "company_example"; // String | Company
String firstName = "firstName_example"; // String | First Name
String lastName = "lastName_example"; // String | Last Name
String city = "city_example"; // String | City
String stateRegion = "stateRegion_example"; // String | State/Region
String postalCode = "postalCode_example"; // String | Postal Code
String countryCode = "countryCode_example"; // String | Country Code (ISO-3166 two letter)
String phone = "phone_example"; // String | Phone
String email = "email_example"; // String | Email
String ccEmail = "ccEmail_example"; // String | CC Email
BigDecimal total = new BigDecimal(); // BigDecimal | Total
String screenBrandingThemeCode = "screenBrandingThemeCode_example"; // String | Screen Branding Theme Code
String storefrontHostName = "storefrontHostName_example"; // String | StoreFront Host Name
String creationDateBegin = "creationDateBegin_example"; // String | Creation Date Begin
String creationDateEnd = "creationDateEnd_example"; // String | Creation Date End
String paymentDateBegin = "paymentDateBegin_example"; // String | Payment Date Begin
String paymentDateEnd = "paymentDateEnd_example"; // String | Payment Date End
String shipmentDateBegin = "shipmentDateBegin_example"; // String | Shipment Date Begin
String shipmentDateEnd = "shipmentDateEnd_example"; // String | Shipment Date End
String rma = "rma_example"; // String | RMA
String purchaseOrderNumber = "purchaseOrderNumber_example"; // String | Purchase Order Number
String itemId = "itemId_example"; // String | Item Id
String currentStage = "currentStage_example"; // String | Current Stage
String channelPartnerCode = "channelPartnerCode_example"; // String | Channel Partner Code
String channelPartnerOrderId = "channelPartnerOrderId_example"; // String | Channel Partner Order ID
Integer customerProfileOid = 56; // Integer | null
String refundDateBegin = "refundDateBegin_example"; // String | null
String refundDateEnd = "refundDateEnd_example"; // String | null
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Maximum 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.
try {
    OrdersResponse result = apiInstance.getOrders(orderId, paymentMethod, company, firstName, lastName, city, stateRegion, postalCode, countryCode, phone, email, ccEmail, total, screenBrandingThemeCode, storefrontHostName, creationDateBegin, creationDateEnd, paymentDateBegin, paymentDateEnd, shipmentDateBegin, shipmentDateEnd, rma, purchaseOrderNumber, itemId, currentStage, channelPartnerCode, channelPartnerOrderId, customerProfileOid, refundDateBegin, refundDateEnd, limit, offset, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order Id | [optional]
 **paymentMethod** | **String**| Payment Method | [optional]
 **company** | **String**| Company | [optional]
 **firstName** | **String**| First Name | [optional]
 **lastName** | **String**| Last Name | [optional]
 **city** | **String**| City | [optional]
 **stateRegion** | **String**| State/Region | [optional]
 **postalCode** | **String**| Postal Code | [optional]
 **countryCode** | **String**| Country Code (ISO-3166 two letter) | [optional]
 **phone** | **String**| Phone | [optional]
 **email** | **String**| Email | [optional]
 **ccEmail** | **String**| CC Email | [optional]
 **total** | **BigDecimal**| Total | [optional]
 **screenBrandingThemeCode** | **String**| Screen Branding Theme Code | [optional]
 **storefrontHostName** | **String**| StoreFront Host Name | [optional]
 **creationDateBegin** | **String**| Creation Date Begin | [optional]
 **creationDateEnd** | **String**| Creation Date End | [optional]
 **paymentDateBegin** | **String**| Payment Date Begin | [optional]
 **paymentDateEnd** | **String**| Payment Date End | [optional]
 **shipmentDateBegin** | **String**| Shipment Date Begin | [optional]
 **shipmentDateEnd** | **String**| Shipment Date End | [optional]
 **rma** | **String**| RMA | [optional]
 **purchaseOrderNumber** | **String**| Purchase Order Number | [optional]
 **itemId** | **String**| Item Id | [optional]
 **currentStage** | **String**| Current Stage | [optional]
 **channelPartnerCode** | **String**| Channel Partner Code | [optional]
 **channelPartnerOrderId** | **String**| Channel Partner Order ID | [optional]
 **customerProfileOid** | **Integer**| null | [optional]
 **refundDateBegin** | **String**| null | [optional]
 **refundDateEnd** | **String**| null | [optional]
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **sort** | **String**| The sort order of the orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result. | [optional]

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrdersByQuery"></a>
# **getOrdersByQuery**
> OrdersResponse getOrdersByQuery(orderQuery, limit, offset, sort, expand)

Retrieve orders

Retrieves a group of orders from the account based on a query object.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the orders returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
OrderQuery orderQuery = new OrderQuery(); // OrderQuery | Order query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Maximum 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.
try {
    OrdersResponse result = apiInstance.getOrdersByQuery(orderQuery, limit, offset, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrdersByQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderQuery** | [**OrderQuery**](OrderQuery.md)| Order query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **sort** | **String**| The sort order of the orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result. | [optional]

### Return type

[**OrdersResponse**](OrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertOrder"></a>
# **insertOrder**
> OrderResponse insertOrder(order, expand)

Insert an order

Inserts a new order on the UltraCart account.  This is probably NOT the method you want.  This is for channel orders.  For regular orders the customer is entering, use the CheckoutApi.  It has many, many more features, checks, and validations. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Order order = new Order(); // Order | Order to insert
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.insertOrder(order, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#insertOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| Order to insert |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="refundOrder"></a>
# **refundOrder**
> OrderResponse refundOrder(order, orderId, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, expand)

Refund an order

Perform a refund operation on an order and then update the order if successful 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Order order = new Order(); // Order | Order to refund
String orderId = "orderId_example"; // String | The order id to refund.
Boolean rejectAfterRefund = false; // Boolean | Reject order after refund
Boolean skipCustomerNotification = false; // Boolean | Skip customer email notification
Boolean autoOrderCancel = false; // Boolean | Cancel associated auto orders
Boolean manualRefund = false; // Boolean | Consider a manual refund done externally
Boolean reverseAffiliateTransactions = true; // Boolean | Reverse affiliate transactions
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.refundOrder(order, orderId, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#refundOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| Order to refund |
 **orderId** | **String**| The order id to refund. |
 **rejectAfterRefund** | **Boolean**| Reject order after refund | [optional] [default to false]
 **skipCustomerNotification** | **Boolean**| Skip customer email notification | [optional] [default to false]
 **autoOrderCancel** | **Boolean**| Cancel associated auto orders | [optional] [default to false]
 **manualRefund** | **Boolean**| Consider a manual refund done externally | [optional] [default to false]
 **reverseAffiliateTransactions** | **Boolean**| Reverse affiliate transactions | [optional] [default to true]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="replacement"></a>
# **replacement**
> OrderReplacementResponse replacement(orderId, replacement)

Replacement order

Create a replacement order based upon a previous order 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order id to generate a replacement for.
OrderReplacement replacement = new OrderReplacement(); // OrderReplacement | Replacement order details
try {
    OrderReplacementResponse result = apiInstance.replacement(orderId, replacement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#replacement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to generate a replacement for. |
 **replacement** | [**OrderReplacement**](OrderReplacement.md)| Replacement order details |

### Return type

[**OrderReplacementResponse**](OrderReplacementResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendReceipt"></a>
# **resendReceipt**
> BaseResponse resendReceipt(orderId)

Resend receipt

Resend the receipt for an order on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order id to resend the receipt for.
try {
    BaseResponse result = apiInstance.resendReceipt(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#resendReceipt");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to resend the receipt for. |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resendShipmentConfirmation"></a>
# **resendShipmentConfirmation**
> BaseResponse resendShipmentConfirmation(orderId)

Resend shipment confirmation

Resend shipment confirmation for an order on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
String orderId = "orderId_example"; // String | The order id to resend the shipment notification for.
try {
    BaseResponse result = apiInstance.resendShipmentConfirmation(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#resendShipmentConfirmation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to resend the shipment notification for. |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountsReceivableRetryConfig"></a>
# **updateAccountsReceivableRetryConfig**
> BaseResponse updateAccountsReceivableRetryConfig(retryConfig)

Update A/R Retry Configuration

Update A/R Retry Configuration.  This is primarily an internal API call.  It is doubtful you would ever need to use it. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
AccountsReceivableRetryConfig retryConfig = new AccountsReceivableRetryConfig(); // AccountsReceivableRetryConfig | AccountsReceivableRetryConfig object
try {
    BaseResponse result = apiInstance.updateAccountsReceivableRetryConfig(retryConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateAccountsReceivableRetryConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **retryConfig** | [**AccountsReceivableRetryConfig**](AccountsReceivableRetryConfig.md)| AccountsReceivableRetryConfig object |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrder"></a>
# **updateOrder**
> OrderResponse updateOrder(order, orderId, expand)

Update an order

Update a new order on the UltraCart account.  This is probably NOT the method you want.  It is rare to update a completed order.  This will not trigger charges, emails, or any other automation. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

OrderApi apiInstance = new OrderApi();
Order order = new Order(); // Order | Order to update
String orderId = "orderId_example"; // String | The order id to update.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.updateOrder(order, orderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#updateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| Order to update |
 **orderId** | **String**| The order id to update. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

