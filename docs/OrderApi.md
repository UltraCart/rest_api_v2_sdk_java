# OrderApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adjustOrderTotal**](OrderApi.md#adjustOrderTotal) | **POST** /order/orders/{order_id}/adjust_order_total/{desired_total} | Adjusts an order total
[**assignToAffiliate**](OrderApi.md#assignToAffiliate) | **POST** /order/orders/{order_id}/assignToAffiliate | Assigns an order to an affiliate
[**blockRefundOnOrder**](OrderApi.md#blockRefundOnOrder) | **GET** /order/orders/{order_id}/refund_block | Set a refund block on an order
[**cancelOrder**](OrderApi.md#cancelOrder) | **POST** /order/orders/{order_id}/cancel | Cancel an order
[**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /order/orders/{order_id} | Delete an order
[**duplicateOrder**](OrderApi.md#duplicateOrder) | **POST** /order/orders/{order_id}/duplicate | Duplicate an order
[**format**](OrderApi.md#format) | **POST** /order/orders/{order_id}/format | Format order
[**generateInvoice**](OrderApi.md#generateInvoice) | **GET** /order/orders/{order_id}/invoice | Generate an invoice for this order.
[**generateOrderToken**](OrderApi.md#generateOrderToken) | **GET** /order/orders/token/{order_id} | Generate an order token for a given order id
[**generatePackingSlipAllDC**](OrderApi.md#generatePackingSlipAllDC) | **GET** /order/orders/{order_id}/packing_slip | Generate a packing slip for this order across all distribution centers.
[**generatePackingSlipSpecificDC**](OrderApi.md#generatePackingSlipSpecificDC) | **GET** /order/orders/{order_id}/packing_slip/{distribution_center_code} | Generate a packing slip for this order for the given distribution center.
[**getAccountsReceivableRetryConfig**](OrderApi.md#getAccountsReceivableRetryConfig) | **GET** /order/accountsReceivableRetryConfig | Retrieve A/R Retry Configuration
[**getAccountsReceivableRetryStats**](OrderApi.md#getAccountsReceivableRetryStats) | **GET** /order/accountsReceivableRetryConfig/stats | Retrieve A/R Retry Statistics
[**getOrder**](OrderApi.md#getOrder) | **GET** /order/orders/{order_id} | Retrieve an order
[**getOrderByToken**](OrderApi.md#getOrderByToken) | **POST** /order/orders/token | Retrieve an order using a token
[**getOrderEdiDocuments**](OrderApi.md#getOrderEdiDocuments) | **GET** /order/orders/{order_id}/edi | Retrieve EDI documents associated with this order.
[**getOrderUpsellCart**](OrderApi.md#getOrderUpsellCart) | **PUT** /order/orders/{order_id}/upsell_with_cart | Get Order Upsell Cart
[**getOrders**](OrderApi.md#getOrders) | **GET** /order/orders | Retrieve orders
[**getOrdersBatch**](OrderApi.md#getOrdersBatch) | **POST** /order/orders/batch | Retrieve order batch
[**getOrdersByQuery**](OrderApi.md#getOrdersByQuery) | **POST** /order/orders/query | Retrieve orders by query
[**insertOrder**](OrderApi.md#insertOrder) | **POST** /order/orders | Insert an order
[**isRefundableOrder**](OrderApi.md#isRefundableOrder) | **GET** /order/orders/{order_id}/refundable | Determine if an order can be refunded
[**processPayment**](OrderApi.md#processPayment) | **POST** /order/orders/{order_id}/process_payment | Process payment
[**refundOrder**](OrderApi.md#refundOrder) | **PUT** /order/orders/{order_id}/refund | Refund an order
[**replaceOrderItemMerchantItemId**](OrderApi.md#replaceOrderItemMerchantItemId) | **PUT** /order/orders/{order_id}/replace_item_id | Replaces an order item id
[**replacement**](OrderApi.md#replacement) | **POST** /order/orders/{order_id}/replacement | Replacement order
[**resendReceipt**](OrderApi.md#resendReceipt) | **POST** /order/orders/{order_id}/resend_receipt | Resend receipt
[**resendShipmentConfirmation**](OrderApi.md#resendShipmentConfirmation) | **POST** /order/orders/{order_id}/resend_shipment_confirmation | Resend shipment confirmation
[**unblockRefundOnOrder**](OrderApi.md#unblockRefundOnOrder) | **GET** /order/orders/{order_id}/refund_unblock | Remove a refund block on an order
[**updateAccountsReceivableRetryConfig**](OrderApi.md#updateAccountsReceivableRetryConfig) | **POST** /order/accountsReceivableRetryConfig | Update A/R Retry Configuration
[**updateOrder**](OrderApi.md#updateOrder) | **PUT** /order/orders/{order_id} | Update an order
[**validateOrder**](OrderApi.md#validateOrder) | **POST** /order/validate | Validate


<a name="adjustOrderTotal"></a>
# **adjustOrderTotal**
> BaseResponse adjustOrderTotal(orderId, desiredTotal)

Adjusts an order total

Adjusts an order total.  Adjusts individual items appropriately and considers taxes.  Desired total should be provided in the same currency as the order and must be less than the current total and greater than zero.  This call will change the order total.  It returns true if the desired total is achieved.  If the goal seeking algorithm falls short (usually by pennies), this method returns back false.  View the merchant notes for the order for further details. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to cancel.
String desiredTotal = "desiredTotal_example"; // String | The desired total with no formatting. example 123.45
try {
    BaseResponse result = apiInstance.adjustOrderTotal(orderId, desiredTotal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#adjustOrderTotal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to cancel. |
 **desiredTotal** | **String**| The desired total with no formatting. example 123.45 |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="assignToAffiliate"></a>
# **assignToAffiliate**
> OrderResponse assignToAffiliate(orderId, assignToAffiliateRequest, expand)

Assigns an order to an affiliate

Assigns an order to an affiliate. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to assign to the affiliate.
OrderAssignToAffiliateRequest assignToAffiliateRequest = new OrderAssignToAffiliateRequest(); // OrderAssignToAffiliateRequest | Assign to affiliate request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.assignToAffiliate(orderId, assignToAffiliateRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#assignToAffiliate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to assign to the affiliate. |
 **assignToAffiliateRequest** | [**OrderAssignToAffiliateRequest**](OrderAssignToAffiliateRequest.md)| Assign to affiliate request |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="blockRefundOnOrder"></a>
# **blockRefundOnOrder**
> blockRefundOnOrder(orderId, blockReason)

Set a refund block on an order

Sets a refund block on an order to prevent a user from performing a refund.  Commonly used when a chargeback has been received. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to block a refund on.
String blockReason = "blockReason_example"; // String | Block reason code (optional)
try {
    apiInstance.blockRefundOnOrder(orderId, blockReason);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#blockRefundOnOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to block a refund on. |
 **blockReason** | **String**| Block reason code (optional) | [optional]

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelOrder"></a>
# **cancelOrder**
> BaseResponse cancelOrder(orderId, lockSelfShipOrders, skipRefundAndHold)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to cancel.
Boolean lockSelfShipOrders = true; // Boolean | Flag to prevent a order shipping during a refund process
Boolean skipRefundAndHold = true; // Boolean | Skip refund and move order to Held Orders department
try {
    BaseResponse result = apiInstance.cancelOrder(orderId, lockSelfShipOrders, skipRefundAndHold);
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
 **lockSelfShipOrders** | **Boolean**| Flag to prevent a order shipping during a refund process | [optional]
 **skipRefundAndHold** | **Boolean**| Skip refund and move order to Held Orders department | [optional]

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

<a name="duplicateOrder"></a>
# **duplicateOrder**
> OrderResponse duplicateOrder(orderId, expand)

Duplicate an order

Perform a duplicate of the specified order_id and return a new order located in Accounts Receivable. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to duplicate.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.duplicateOrder(orderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#duplicateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to duplicate. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

<a name="generateInvoice"></a>
# **generateInvoice**
> OrderInvoiceResponse generateInvoice(orderId)

Generate an invoice for this order.

The invoice PDF that is returned is base 64 encoded 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | Order ID
try {
    OrderInvoiceResponse result = apiInstance.generateInvoice(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#generateInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order ID |

### Return type

[**OrderInvoiceResponse**](OrderInvoiceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generateOrderToken"></a>
# **generateOrderToken**
> OrderTokenResponse generateOrderToken(orderId)

Generate an order token for a given order id

Retrieves a single order token for a given order id.  The token can be used with the getOrderByToken API. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to generate a token for.
try {
    OrderTokenResponse result = apiInstance.generateOrderToken(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#generateOrderToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to generate a token for. |

### Return type

[**OrderTokenResponse**](OrderTokenResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generatePackingSlipAllDC"></a>
# **generatePackingSlipAllDC**
> OrderPackingSlipResponse generatePackingSlipAllDC(orderId)

Generate a packing slip for this order across all distribution centers.

The packing slip PDF that is returned is base 64 encoded 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | Order ID
try {
    OrderPackingSlipResponse result = apiInstance.generatePackingSlipAllDC(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#generatePackingSlipAllDC");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order ID |

### Return type

[**OrderPackingSlipResponse**](OrderPackingSlipResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="generatePackingSlipSpecificDC"></a>
# **generatePackingSlipSpecificDC**
> OrderPackingSlipResponse generatePackingSlipSpecificDC(distributionCenterCode, orderId)

Generate a packing slip for this order for the given distribution center.

The packing slip PDF that is returned is base 64 encoded 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String distributionCenterCode = "distributionCenterCode_example"; // String | Distribution center code
String orderId = "orderId_example"; // String | Order ID
try {
    OrderPackingSlipResponse result = apiInstance.generatePackingSlipSpecificDC(distributionCenterCode, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#generatePackingSlipSpecificDC");
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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String from = "from_example"; // String | 
String to = "to_example"; // String | 
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
 **from** | **String**|  | [optional]
 **to** | **String**|  | [optional]

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

<a name="getOrderByToken"></a>
# **getOrderByToken**
> OrderResponse getOrderByToken(orderByTokenQuery, expand)

Retrieve an order using a token

Retrieves a single order using the specified order token. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

OrderByTokenQuery orderByTokenQuery = new OrderByTokenQuery(); // OrderByTokenQuery | Order by token query
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.getOrderByToken(orderByTokenQuery, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderByToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderByTokenQuery** | [**OrderByTokenQuery**](OrderByTokenQuery.md)| Order by token query |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderEdiDocuments"></a>
# **getOrderEdiDocuments**
> OrderEdiDocumentsResponse getOrderEdiDocuments(orderId)

Retrieve EDI documents associated with this order.

Retrieve EDI documents associated with this order. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to retrieve EDI documents for.
try {
    OrderEdiDocumentsResponse result = apiInstance.getOrderEdiDocuments(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderEdiDocuments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to retrieve EDI documents for. |

### Return type

[**OrderEdiDocumentsResponse**](OrderEdiDocumentsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderUpsellCart"></a>
# **getOrderUpsellCart**
> OrderResponse getOrderUpsellCart(upsellCartRequest, orderId, expand)

Get Order Upsell Cart

Creates a new cart using cloned information from the order, but with a specific set of items, coupons and optionally a checkout URL to return the customer to 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

OrderUpsellCartRequest upsellCartRequest = new OrderUpsellCartRequest(); // OrderUpsellCartRequest | Request for the upsell cart
String orderId = "orderId_example"; // String | The order id to base things on.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.getOrderUpsellCart(upsellCartRequest, orderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrderUpsellCart");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **upsellCartRequest** | [**OrderUpsellCartRequest**](OrderUpsellCartRequest.md)| Request for the upsell cart |
 **orderId** | **String**| The order id to base things on. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getOrders"></a>
# **getOrders**
> OrdersResponse getOrders(orderId, paymentMethod, company, firstName, lastName, city, stateRegion, postalCode, countryCode, phone, email, ccEmail, total, screenBrandingThemeCode, storefrontHostName, creationDateBegin, creationDateEnd, paymentDateBegin, paymentDateEnd, shipmentDateBegin, shipmentDateEnd, rma, purchaseOrderNumber, itemId, currentStage, channelPartnerCode, channelPartnerOrderId, limit, offset, sort, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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
    OrdersResponse result = apiInstance.getOrders(orderId, paymentMethod, company, firstName, lastName, city, stateRegion, postalCode, countryCode, phone, email, ccEmail, total, screenBrandingThemeCode, storefrontHostName, creationDateBegin, creationDateEnd, paymentDateBegin, paymentDateEnd, shipmentDateBegin, shipmentDateEnd, rma, purchaseOrderNumber, itemId, currentStage, channelPartnerCode, channelPartnerOrderId, limit, offset, sort, expand);
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

<a name="getOrdersBatch"></a>
# **getOrdersBatch**
> OrdersResponse getOrdersBatch(orderBatch, expand)

Retrieve order batch

Retrieves a group of orders from the account based on an array of order ids.  If more than 500 order ids are specified, the API call will fail with a bad request error. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

OrderQueryBatch orderBatch = new OrderQueryBatch(); // OrderQueryBatch | Order batch
String expand = "expand_example"; // String | The object expansion to perform on the result.
try {
    OrdersResponse result = apiInstance.getOrdersBatch(orderBatch, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#getOrdersBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderBatch** | [**OrderQueryBatch**](OrderQueryBatch.md)| Order batch |
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

Retrieve orders by query

Retrieves a group of orders from the account based on a query object.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the orders returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

<a name="isRefundableOrder"></a>
# **isRefundableOrder**
> OrderRefundableResponse isRefundableOrder(orderId)

Determine if an order can be refunded

Determine if an order can be refunded based upon payment method and age 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to check for refundable order.
try {
    OrderRefundableResponse result = apiInstance.isRefundableOrder(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#isRefundableOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to check for refundable order. |

### Return type

[**OrderRefundableResponse**](OrderRefundableResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="processPayment"></a>
# **processPayment**
> OrderProcessPaymentResponse processPayment(orderId, processPaymentRequest)

Process payment

Process payment on order 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to process payment on
OrderProcessPaymentRequest processPaymentRequest = new OrderProcessPaymentRequest(); // OrderProcessPaymentRequest | Process payment parameters
try {
    OrderProcessPaymentResponse result = apiInstance.processPayment(orderId, processPaymentRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#processPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to process payment on |
 **processPaymentRequest** | [**OrderProcessPaymentRequest**](OrderProcessPaymentRequest.md)| Process payment parameters |

### Return type

[**OrderProcessPaymentResponse**](OrderProcessPaymentResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refundOrder"></a>
# **refundOrder**
> OrderResponse refundOrder(order, orderId, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, issueStoreCredit, autoOrderCancelReason, expand)

Refund an order

Perform a refund operation on an order and then update the order if successful.  All of the object properties ending in _refunded should be the TOTAL amount that should end up being refunded.  UltraCart will calculate the actual amount to refund based upon the prior refunds. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

Order order = new Order(); // Order | Order to refund
String orderId = "orderId_example"; // String | The order id to refund.
Boolean rejectAfterRefund = false; // Boolean | Reject order after refund
Boolean skipCustomerNotification = false; // Boolean | Skip customer email notification
Boolean autoOrderCancel = false; // Boolean | Cancel associated auto orders
Boolean manualRefund = false; // Boolean | Consider a manual refund done externally
Boolean reverseAffiliateTransactions = true; // Boolean | Reverse affiliate transactions
Boolean issueStoreCredit = false; // Boolean | Issue a store credit instead of refunding the original payment method, loyalty must be configured on merchant account
String autoOrderCancelReason = "autoOrderCancelReason_example"; // String | Reason for auto orders cancellation
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.refundOrder(order, orderId, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, issueStoreCredit, autoOrderCancelReason, expand);
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
 **issueStoreCredit** | **Boolean**| Issue a store credit instead of refunding the original payment method, loyalty must be configured on merchant account | [optional] [default to false]
 **autoOrderCancelReason** | **String**| Reason for auto orders cancellation | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="replaceOrderItemMerchantItemId"></a>
# **replaceOrderItemMerchantItemId**
> OrderResponse replaceOrderItemMerchantItemId(replaceOrderItemIdRequest, orderId, expand)

Replaces an order item id

Replaces a single order item id with another merchant_item_id, leaving all other attributes and properties unchanged.  A custom method requested by a merchant to allow for item id updates due to shipping errors.  It is doubtful you will ever need this method.  The expansion variable affects the returned order object. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

ReplaceOrderItemIdRequest replaceOrderItemIdRequest = new ReplaceOrderItemIdRequest(); // ReplaceOrderItemIdRequest | Replacement Request
String orderId = "orderId_example"; // String | The order id to update.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    OrderResponse result = apiInstance.replaceOrderItemMerchantItemId(replaceOrderItemIdRequest, orderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#replaceOrderItemMerchantItemId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replaceOrderItemIdRequest** | [**ReplaceOrderItemIdRequest**](ReplaceOrderItemIdRequest.md)| Replacement Request |
 **orderId** | **String**| The order id to update. |
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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

<a name="unblockRefundOnOrder"></a>
# **unblockRefundOnOrder**
> unblockRefundOnOrder(orderId)

Remove a refund block on an order

Removes a refund block on an order to prevent a user from performing a refund. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

String orderId = "orderId_example"; // String | The order id to unblock a refund on.
try {
    apiInstance.unblockRefundOnOrder(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#unblockRefundOnOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to unblock a refund on. |

### Return type

null (empty response body)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

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

<a name="validateOrder"></a>
# **validateOrder**
> OrderValidationResponse validateOrder(validationRequest)

Validate

Validate the order for errors.  Specific checks can be passed to fine tune what is validated. Read and write permissions are required because the validate method may fix obvious address issues automatically which require update permission.This rest call makes use of the built-in translation of rest objects to UltraCart internal objects which also contains a multitude of validation checks that cannot be trapped.  Therefore any time this call is made, you should also trap api exceptions and examine their content because it may contain validation issues.  So check the response object and trap any exceptions. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OrderApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OrderApi apiInstance = new OrderApi(apiKey);

OrderValidationRequest validationRequest = new OrderValidationRequest(); // OrderValidationRequest | Validation request
try {
    OrderValidationResponse result = apiInstance.validateOrder(validationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#validateOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validationRequest** | [**OrderValidationRequest**](OrderValidationRequest.md)| Validation request |

### Return type

[**OrderValidationResponse**](OrderValidationResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

