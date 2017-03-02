# OrderApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderOrdersGet**](OrderApi.md#orderOrdersGet) | **GET** /order/orders | Retrieve orders
[**orderOrdersOrderIdCancelPost**](OrderApi.md#orderOrdersOrderIdCancelPost) | **POST** /order/orders/{order_id}/cancel | Cancel an order
[**orderOrdersOrderIdDelete**](OrderApi.md#orderOrdersOrderIdDelete) | **DELETE** /order/orders/{order_id} | Delete an order
[**orderOrdersOrderIdGet**](OrderApi.md#orderOrdersOrderIdGet) | **GET** /order/orders/{order_id} | Retrieve an order
[**orderOrdersOrderIdPut**](OrderApi.md#orderOrdersOrderIdPut) | **PUT** /order/orders/{order_id} | Update an order
[**orderOrdersOrderIdResendReceiptPost**](OrderApi.md#orderOrdersOrderIdResendReceiptPost) | **POST** /order/orders/{order_id}/resend_receipt | Resend receipt
[**orderOrdersOrderIdResendShipmentConfirmationPost**](OrderApi.md#orderOrdersOrderIdResendShipmentConfirmationPost) | **POST** /order/orders/{order_id}/resend_shipment_confirmation | Resend shipment confirmation


<a name="orderOrdersGet"></a>
# **orderOrdersGet**
> OrdersResponse orderOrdersGet(orderId, paymentMethod, company, firstName, lastName, city, stateRegion, postalCode, countryCode, phone, email, ccEmail, total, screenBrandingThemeCode, storefrontHostName, creationDateBegin, creationDateEnd, paymentDateBegin, paymentDateEnd, shipmentDateBegin, shipmentDateEnd, rma, purchaseOrderNumber, itemId, currentStage, channelPartnerCode, channelPartnerOrderId, limit, offset, sort, expand)

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
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Maximum 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.
try {
    OrdersResponse result = apiInstance.orderOrdersGet(orderId, paymentMethod, company, firstName, lastName, city, stateRegion, postalCode, countryCode, phone, email, ccEmail, total, screenBrandingThemeCode, storefrontHostName, creationDateBegin, creationDateEnd, paymentDateBegin, paymentDateEnd, shipmentDateBegin, shipmentDateEnd, rma, purchaseOrderNumber, itemId, currentStage, channelPartnerCode, channelPartnerOrderId, limit, offset, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderOrdersGet");
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

<a name="orderOrdersOrderIdCancelPost"></a>
# **orderOrdersOrderIdCancelPost**
> BaseResponse orderOrdersOrderIdCancelPost(orderId)

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
    BaseResponse result = apiInstance.orderOrdersOrderIdCancelPost(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderOrdersOrderIdCancelPost");
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

<a name="orderOrdersOrderIdDelete"></a>
# **orderOrdersOrderIdDelete**
> orderOrdersOrderIdDelete(orderId)

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
    apiInstance.orderOrdersOrderIdDelete(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderOrdersOrderIdDelete");
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

<a name="orderOrdersOrderIdGet"></a>
# **orderOrdersOrderIdGet**
> OrderResponse orderOrdersOrderIdGet(orderId, expand)

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
    OrderResponse result = apiInstance.orderOrdersOrderIdGet(orderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderOrdersOrderIdGet");
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

<a name="orderOrdersOrderIdPut"></a>
# **orderOrdersOrderIdPut**
> OrderResponse orderOrdersOrderIdPut(order, orderId)

Update an order

Update a new order on the UltraCart account. 

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
try {
    OrderResponse result = apiInstance.orderOrdersOrderIdPut(order, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderOrdersOrderIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)| Order to update |
 **orderId** | **String**| The order id to update. |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="orderOrdersOrderIdResendReceiptPost"></a>
# **orderOrdersOrderIdResendReceiptPost**
> BaseResponse orderOrdersOrderIdResendReceiptPost(orderId)

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
    BaseResponse result = apiInstance.orderOrdersOrderIdResendReceiptPost(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderOrdersOrderIdResendReceiptPost");
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

<a name="orderOrdersOrderIdResendShipmentConfirmationPost"></a>
# **orderOrdersOrderIdResendShipmentConfirmationPost**
> BaseResponse orderOrdersOrderIdResendShipmentConfirmationPost(orderId)

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
    BaseResponse result = apiInstance.orderOrdersOrderIdResendShipmentConfirmationPost(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#orderOrdersOrderIdResendShipmentConfirmationPost");
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

