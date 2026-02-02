# ChannelPartnerApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelOrderByChannelPartnerOrderId**](ChannelPartnerApi.md#cancelOrderByChannelPartnerOrderId) | **DELETE** /channel_partner/cancel/by_channel_partner_order_id/{order_id} | Cancel channel partner order by channel partner order id
[**cancelOrderByUltraCartOrderId**](ChannelPartnerApi.md#cancelOrderByUltraCartOrderId) | **DELETE** /channel_partner/cancel/by_ultracart_order_id/{order_id} | Cancel channel partner order by UltraCart order id
[**deleteChannelPartnerShipToPreference**](ChannelPartnerApi.md#deleteChannelPartnerShipToPreference) | **DELETE** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences/{channel_partner_ship_to_preference_oid} | Delete a ship to preference record for the channel partner.
[**estimateShippingForChannelPartnerOrder**](ChannelPartnerApi.md#estimateShippingForChannelPartnerOrder) | **POST** /channel_partner/estimate_shipping | Estimate shipping for channel partner order
[**estimateTaxForChannelPartnerOrder**](ChannelPartnerApi.md#estimateTaxForChannelPartnerOrder) | **POST** /channel_partner/estimate_tax | Estimate tax for channel partner order
[**getChannelPartnerOrder**](ChannelPartnerApi.md#getChannelPartnerOrder) | **GET** /channel_partner/orders/{order_id} | Retrieve a channel partner order
[**getChannelPartnerOrderByChannelPartnerOrderId**](ChannelPartnerApi.md#getChannelPartnerOrderByChannelPartnerOrderId) | **GET** /channel_partner/orders/by_channel_partner_order_id/{order_id} | Retrieve a channel partner order by the channel partner order id
[**getChannelPartnerReasonCodes**](ChannelPartnerApi.md#getChannelPartnerReasonCodes) | **GET** /channel_partner/channel_partners/{channel_partner_oid}/reason_codes | Retrieve reject and refund reason codes.
[**getChannelPartnerShipToPreference**](ChannelPartnerApi.md#getChannelPartnerShipToPreference) | **GET** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences/{channel_partner_ship_to_preference_oid} | Retrieve the ship to preference associated with the channel partner and the specific id.
[**getChannelPartnerShipToPreferences**](ChannelPartnerApi.md#getChannelPartnerShipToPreferences) | **GET** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences | Retrieve the ship to preferences associated with the channel partner.
[**getChannelPartners**](ChannelPartnerApi.md#getChannelPartners) | **GET** /channel_partner/channel_partners | Retrieve the channel partners configured on the account.
[**importChannelPartnerOrder**](ChannelPartnerApi.md#importChannelPartnerOrder) | **POST** /channel_partner/import | Insert channel partner order
[**insertChannelPartnerShipToPreference**](ChannelPartnerApi.md#insertChannelPartnerShipToPreference) | **POST** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences | Insert a ship to preference record for the channel partner.
[**refundChannelPartnerOrder**](ChannelPartnerApi.md#refundChannelPartnerOrder) | **PUT** /channel_partner/orders/{order_id}/refund | Refund a channel partner order
[**updateChannelPartnerShipToPreference**](ChannelPartnerApi.md#updateChannelPartnerShipToPreference) | **PUT** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences/{channel_partner_ship_to_preference_oid} | Update a ship to preference record for the channel partner.


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

<a name="deleteChannelPartnerShipToPreference"></a>
# **deleteChannelPartnerShipToPreference**
> deleteChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid)

Delete a ship to preference record for the channel partner.

Delete a ship to preference record for the channel partner. 

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

Integer channelPartnerOid = 56; // Integer | 
Integer channelPartnerShipToPreferenceOid = 56; // Integer | 
try {
    apiInstance.deleteChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#deleteChannelPartnerShipToPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOid** | **Integer**|  |
 **channelPartnerShipToPreferenceOid** | **Integer**|  |

### Return type

null (empty response body)

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

<a name="estimateTaxForChannelPartnerOrder"></a>
# **estimateTaxForChannelPartnerOrder**
> ChannelPartnerEstimateTaxResponse estimateTaxForChannelPartnerOrder(channelPartnerOrder)

Estimate tax for channel partner order

Estimate tax for order from a channel partner. 

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

ChannelPartnerOrder channelPartnerOrder = new ChannelPartnerOrder(); // ChannelPartnerOrder | Order needing tax estimate
try {
    ChannelPartnerEstimateTaxResponse result = apiInstance.estimateTaxForChannelPartnerOrder(channelPartnerOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#estimateTaxForChannelPartnerOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order needing tax estimate |

### Return type

[**ChannelPartnerEstimateTaxResponse**](ChannelPartnerEstimateTaxResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getChannelPartnerOrder"></a>
# **getChannelPartnerOrder**
> OrderResponse getChannelPartnerOrder(orderId, expand)

Retrieve a channel partner order

Retrieves a single order using the specified order id.  Only orders belonging to this channel partner may be retrieved. 

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

String orderId = "orderId_example"; // String | The order id to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See OrderApi.getOrder documentation for examples
try {
    OrderResponse result = apiInstance.getChannelPartnerOrder(orderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#getChannelPartnerOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The order id to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See OrderApi.getOrder documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelPartnerOrderByChannelPartnerOrderId"></a>
# **getChannelPartnerOrderByChannelPartnerOrderId**
> OrderResponse getChannelPartnerOrderByChannelPartnerOrderId(orderId, expand)

Retrieve a channel partner order by the channel partner order id

Retrieves a single order using the channel partner order id, not the ultracart order id.  Only orders belonging to this channel partner may be retrieved. 

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

String orderId = "orderId_example"; // String | The channel partner order id to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See OrderApi.getOrder documentation for examples
try {
    OrderResponse result = apiInstance.getChannelPartnerOrderByChannelPartnerOrderId(orderId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#getChannelPartnerOrderByChannelPartnerOrderId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| The channel partner order id to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See OrderApi.getOrder documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelPartnerReasonCodes"></a>
# **getChannelPartnerReasonCodes**
> ChanelPartnerReasonCodesResponse getChannelPartnerReasonCodes(channelPartnerOid)

Retrieve reject and refund reason codes.

Retrieve reject and refund reason codes. 

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

Integer channelPartnerOid = 56; // Integer | 
try {
    ChanelPartnerReasonCodesResponse result = apiInstance.getChannelPartnerReasonCodes(channelPartnerOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#getChannelPartnerReasonCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOid** | **Integer**|  |

### Return type

[**ChanelPartnerReasonCodesResponse**](ChanelPartnerReasonCodesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelPartnerShipToPreference"></a>
# **getChannelPartnerShipToPreference**
> ChannelPartnerShipToPreferenceResponse getChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid)

Retrieve the ship to preference associated with the channel partner and the specific id.

Retrieve the ship to preference associated with the channel partner and the specific id. 

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

Integer channelPartnerOid = 56; // Integer | 
Integer channelPartnerShipToPreferenceOid = 56; // Integer | 
try {
    ChannelPartnerShipToPreferenceResponse result = apiInstance.getChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#getChannelPartnerShipToPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOid** | **Integer**|  |
 **channelPartnerShipToPreferenceOid** | **Integer**|  |

### Return type

[**ChannelPartnerShipToPreferenceResponse**](ChannelPartnerShipToPreferenceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelPartnerShipToPreferences"></a>
# **getChannelPartnerShipToPreferences**
> ChannelPartnerShipToPreferencesResponse getChannelPartnerShipToPreferences(channelPartnerOid)

Retrieve the ship to preferences associated with the channel partner.

Retrieve the ship to preferences associated with the channel partner. 

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

Integer channelPartnerOid = 56; // Integer | 
try {
    ChannelPartnerShipToPreferencesResponse result = apiInstance.getChannelPartnerShipToPreferences(channelPartnerOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#getChannelPartnerShipToPreferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOid** | **Integer**|  |

### Return type

[**ChannelPartnerShipToPreferencesResponse**](ChannelPartnerShipToPreferencesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelPartners"></a>
# **getChannelPartners**
> ChannelPartnersResponse getChannelPartners()

Retrieve the channel partners configured on the account.

Retrieve the channel partners configured on the account. 

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

try {
    ChannelPartnersResponse result = apiInstance.getChannelPartners();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#getChannelPartners");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ChannelPartnersResponse**](ChannelPartnersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="insertChannelPartnerShipToPreference"></a>
# **insertChannelPartnerShipToPreference**
> ChannelPartnerShipToPreferenceResponse insertChannelPartnerShipToPreference(channelPartnerOid, shipToPreference)

Insert a ship to preference record for the channel partner.

Insert a ship to preference record for the channel partner. 

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

Integer channelPartnerOid = 56; // Integer | 
ChannelPartnerShipToPreference shipToPreference = new ChannelPartnerShipToPreference(); // ChannelPartnerShipToPreference | Ship to preference to create
try {
    ChannelPartnerShipToPreferenceResponse result = apiInstance.insertChannelPartnerShipToPreference(channelPartnerOid, shipToPreference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#insertChannelPartnerShipToPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOid** | **Integer**|  |
 **shipToPreference** | [**ChannelPartnerShipToPreference**](ChannelPartnerShipToPreference.md)| Ship to preference to create |

### Return type

[**ChannelPartnerShipToPreferenceResponse**](ChannelPartnerShipToPreferenceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refundChannelPartnerOrder"></a>
# **refundChannelPartnerOrder**
> OrderResponse refundChannelPartnerOrder(order, orderId, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, issueStoreCredit, autoOrderCancelReason, expand)

Refund a channel partner order

Perform a refund operation on a channel partner order and then update the order if successful.  All of the object properties ending in _refunded should be the TOTAL amount that should end up being refunded.  UltraCart will calculate the actual amount to refund based upon the prior refunds. 

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

Order order = new Order(); // Order | Order to refund
String orderId = "orderId_example"; // String | The order id to refund.
Boolean rejectAfterRefund = false; // Boolean | Reject order after refund
Boolean skipCustomerNotification = false; // Boolean | Skip customer email notification
Boolean autoOrderCancel = false; // Boolean | Cancel associated auto orders
Boolean manualRefund = false; // Boolean | Consider a manual refund done externally
Boolean reverseAffiliateTransactions = true; // Boolean | Reverse affiliate transactions
Boolean issueStoreCredit = false; // Boolean | Issue a store credit instead of refunding the original payment method, loyalty must be configured on merchant account
String autoOrderCancelReason = "autoOrderCancelReason_example"; // String | Reason for auto orders cancellation
String expand = "expand_example"; // String | The object expansion to perform on the result.  See OrderApi.refundOrder documentation for examples
try {
    OrderResponse result = apiInstance.refundChannelPartnerOrder(order, orderId, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, issueStoreCredit, autoOrderCancelReason, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#refundChannelPartnerOrder");
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
 **expand** | **String**| The object expansion to perform on the result.  See OrderApi.refundOrder documentation for examples | [optional]

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateChannelPartnerShipToPreference"></a>
# **updateChannelPartnerShipToPreference**
> ChannelPartnerShipToPreferenceResponse updateChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid, shipToPreference)

Update a ship to preference record for the channel partner.

Update a ship to preference record for the channel partner. 

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

Integer channelPartnerOid = 56; // Integer | 
Integer channelPartnerShipToPreferenceOid = 56; // Integer | 
ChannelPartnerShipToPreference shipToPreference = new ChannelPartnerShipToPreference(); // ChannelPartnerShipToPreference | Ship to preference to create
try {
    ChannelPartnerShipToPreferenceResponse result = apiInstance.updateChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid, shipToPreference);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChannelPartnerApi#updateChannelPartnerShipToPreference");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channelPartnerOid** | **Integer**|  |
 **channelPartnerShipToPreferenceOid** | **Integer**|  |
 **shipToPreference** | [**ChannelPartnerShipToPreference**](ChannelPartnerShipToPreference.md)| Ship to preference to create |

### Return type

[**ChannelPartnerShipToPreferenceResponse**](ChannelPartnerShipToPreferenceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

