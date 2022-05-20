# ChannelPartnerApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrderByChannelPartnerOrderId**](ChannelPartnerApi.md#cancelOrderByChannelPartnerOrderId) | **DELETE** /channel_partner/cancel/by_channel_partner_order_id/{order_id} | Cancel channel partner order by channel partner order id
[**cancelOrderByUltraCartOrderId**](ChannelPartnerApi.md#cancelOrderByUltraCartOrderId) | **DELETE** /channel_partner/cancel/by_ultracart_order_id/{order_id} | Cancel channel partner order by UltraCart order id
[**estimateShippingForChannelPartnerOrder**](ChannelPartnerApi.md#estimateShippingForChannelPartnerOrder) | **POST** /channel_partner/estimate_shipping | Estimate shipping for channel partner order
[**importChannelPartnerOrder**](ChannelPartnerApi.md#importChannelPartnerOrder) | **POST** /channel_partner/import | Insert channel partner order


<a name="cancelOrderByChannelPartnerOrderId"></a>
# **cancelOrderByChannelPartnerOrderId**
> ChannelPartnerCancelResponse cancelOrderByChannelPartnerOrderId(orderId)

Cancel channel partner order by channel partner order id

Cancel channel partner order by channel partner order id 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChannelPartnerApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChannelPartnerApi apiInstance = new ChannelPartnerApi(apiKey);

String orderId = "orderId_example"; // String | The channel partner order id to delete.
try {
    ChannelPartnerCancelResponse result = apiInstance.cancelOrderByChannelPartnerOrderId(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#cancelOrderByChannelPartnerOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The channel partner order id to delete. |

### Return type

[**ChannelPartnerCancelResponse**](ChannelPartnerCancelResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelOrderByUltraCartOrderId"></a>
# **cancelOrderByUltraCartOrderId**
> ChannelPartnerCancelResponse cancelOrderByUltraCartOrderId(orderId)

Cancel channel partner order by UltraCart order id

Cancel channel partner order by UltraCart order id 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChannelPartnerApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChannelPartnerApi apiInstance = new ChannelPartnerApi(apiKey);

String orderId = "orderId_example"; // String | The UltraCart order id to delete.
try {
    ChannelPartnerCancelResponse result = apiInstance.cancelOrderByUltraCartOrderId(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#cancelOrderByUltraCartOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The UltraCart order id to delete. |

### Return type

[**ChannelPartnerCancelResponse**](ChannelPartnerCancelResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="estimateShippingForChannelPartnerOrder"></a>
# **estimateShippingForChannelPartnerOrder**
> ChannelPartnerEstimateShippingResponse estimateShippingForChannelPartnerOrder(channelPartnerOrder)

Estimate shipping for channel partner order

Estimate shipping for order from a channel partner. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChannelPartnerApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChannelPartnerApi apiInstance = new ChannelPartnerApi(apiKey);

ChannelPartnerOrder channelPartnerOrder = new ChannelPartnerOrder(); // ChannelPartnerOrder | Order needing shipping estimate
try {
    ChannelPartnerEstimateShippingResponse result = apiInstance.estimateShippingForChannelPartnerOrder(channelPartnerOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#estimateShippingForChannelPartnerOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order needing shipping estimate |

### Return type

[**ChannelPartnerEstimateShippingResponse**](ChannelPartnerEstimateShippingResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="importChannelPartnerOrder"></a>
# **importChannelPartnerOrder**
> ChannelPartnerImportResponse importChannelPartnerOrder(channelPartnerOrder)

Insert channel partner order

Insert order from a channel partner. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChannelPartnerApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChannelPartnerApi apiInstance = new ChannelPartnerApi(apiKey);

ChannelPartnerOrder channelPartnerOrder = new ChannelPartnerOrder(); // ChannelPartnerOrder | Order to insert
try {
    ChannelPartnerImportResponse result = apiInstance.importChannelPartnerOrder(channelPartnerOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#importChannelPartnerOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order to insert |

### Return type

[**ChannelPartnerImportResponse**](ChannelPartnerImportResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

