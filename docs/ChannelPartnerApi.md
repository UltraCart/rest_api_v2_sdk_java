# ChannelPartnerApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelOrderByChannelPartnerOrderId**](ChannelPartnerApi.md#cancelOrderByChannelPartnerOrderId) | **DELETE** /channel_partner/cancel/by_channel_partner_order_id/{order_id} | Cancel channel partner order by channel partner order id |
| [**cancelOrderByUltraCartOrderId**](ChannelPartnerApi.md#cancelOrderByUltraCartOrderId) | **DELETE** /channel_partner/cancel/by_ultracart_order_id/{order_id} | Cancel channel partner order by UltraCart order id |
| [**estimateShippingForChannelPartnerOrder**](ChannelPartnerApi.md#estimateShippingForChannelPartnerOrder) | **POST** /channel_partner/estimate_shipping | Estimate shipping for channel partner order |
| [**estimateTaxForChannelPartnerOrder**](ChannelPartnerApi.md#estimateTaxForChannelPartnerOrder) | **POST** /channel_partner/estimate_tax | Estimate tax for channel partner order |
| [**importChannelPartnerOrder**](ChannelPartnerApi.md#importChannelPartnerOrder) | **POST** /channel_partner/import | Insert channel partner order |


<a name="cancelOrderByChannelPartnerOrderId"></a>
# **cancelOrderByChannelPartnerOrderId**
> ChannelPartnerCancelResponse cancelOrderByChannelPartnerOrderId(orderId)

Cancel channel partner order by channel partner order id

Cancel channel partner order by channel partner order id 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.ChannelPartnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://secure.ultracart.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: ultraCartOauth
    OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
    ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ultraCartSimpleApiKey
    ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
    ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartSimpleApiKey.setApiKeyPrefix("Token");

    ChannelPartnerApi apiInstance = new ChannelPartnerApi(defaultClient);
    String orderId = "orderId_example"; // String | The channel partner order id to delete.
    try {
      ChannelPartnerCancelResponse result = apiInstance.cancelOrderByChannelPartnerOrderId(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelPartnerApi#cancelOrderByChannelPartnerOrderId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The channel partner order id to delete. | |

### Return type

[**ChannelPartnerCancelResponse**](ChannelPartnerCancelResponse.md)

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

<a name="cancelOrderByUltraCartOrderId"></a>
# **cancelOrderByUltraCartOrderId**
> ChannelPartnerCancelResponse cancelOrderByUltraCartOrderId(orderId)

Cancel channel partner order by UltraCart order id

Cancel channel partner order by UltraCart order id 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.ChannelPartnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://secure.ultracart.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: ultraCartOauth
    OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
    ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ultraCartSimpleApiKey
    ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
    ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartSimpleApiKey.setApiKeyPrefix("Token");

    ChannelPartnerApi apiInstance = new ChannelPartnerApi(defaultClient);
    String orderId = "orderId_example"; // String | The UltraCart order id to delete.
    try {
      ChannelPartnerCancelResponse result = apiInstance.cancelOrderByUltraCartOrderId(orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelPartnerApi#cancelOrderByUltraCartOrderId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The UltraCart order id to delete. | |

### Return type

[**ChannelPartnerCancelResponse**](ChannelPartnerCancelResponse.md)

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

<a name="estimateShippingForChannelPartnerOrder"></a>
# **estimateShippingForChannelPartnerOrder**
> ChannelPartnerEstimateShippingResponse estimateShippingForChannelPartnerOrder(channelPartnerOrder)

Estimate shipping for channel partner order

Estimate shipping for order from a channel partner. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.ChannelPartnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://secure.ultracart.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: ultraCartOauth
    OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
    ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ultraCartSimpleApiKey
    ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
    ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartSimpleApiKey.setApiKeyPrefix("Token");

    ChannelPartnerApi apiInstance = new ChannelPartnerApi(defaultClient);
    ChannelPartnerOrder channelPartnerOrder = new ChannelPartnerOrder(); // ChannelPartnerOrder | Order needing shipping estimate
    try {
      ChannelPartnerEstimateShippingResponse result = apiInstance.estimateShippingForChannelPartnerOrder(channelPartnerOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelPartnerApi#estimateShippingForChannelPartnerOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order needing shipping estimate | |

### Return type

[**ChannelPartnerEstimateShippingResponse**](ChannelPartnerEstimateShippingResponse.md)

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

<a name="estimateTaxForChannelPartnerOrder"></a>
# **estimateTaxForChannelPartnerOrder**
> ChannelPartnerEstimateTaxResponse estimateTaxForChannelPartnerOrder(channelPartnerOrder)

Estimate tax for channel partner order

Estimate tax for order from a channel partner. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.ChannelPartnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://secure.ultracart.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: ultraCartOauth
    OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
    ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ultraCartSimpleApiKey
    ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
    ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartSimpleApiKey.setApiKeyPrefix("Token");

    ChannelPartnerApi apiInstance = new ChannelPartnerApi(defaultClient);
    ChannelPartnerOrder channelPartnerOrder = new ChannelPartnerOrder(); // ChannelPartnerOrder | Order needing tax estimate
    try {
      ChannelPartnerEstimateTaxResponse result = apiInstance.estimateTaxForChannelPartnerOrder(channelPartnerOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelPartnerApi#estimateTaxForChannelPartnerOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order needing tax estimate | |

### Return type

[**ChannelPartnerEstimateTaxResponse**](ChannelPartnerEstimateTaxResponse.md)

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

<a name="importChannelPartnerOrder"></a>
# **importChannelPartnerOrder**
> ChannelPartnerImportResponse importChannelPartnerOrder(channelPartnerOrder)

Insert channel partner order

Insert order from a channel partner. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.ChannelPartnerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://secure.ultracart.com/rest/v2");
    
    // Configure OAuth2 access token for authorization: ultraCartOauth
    OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
    ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ultraCartSimpleApiKey
    ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
    ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartSimpleApiKey.setApiKeyPrefix("Token");

    ChannelPartnerApi apiInstance = new ChannelPartnerApi(defaultClient);
    ChannelPartnerOrder channelPartnerOrder = new ChannelPartnerOrder(); // ChannelPartnerOrder | Order to insert
    try {
      ChannelPartnerImportResponse result = apiInstance.importChannelPartnerOrder(channelPartnerOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelPartnerApi#importChannelPartnerOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order to insert | |

### Return type

[**ChannelPartnerImportResponse**](ChannelPartnerImportResponse.md)

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

