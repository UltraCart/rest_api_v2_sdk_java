# CheckoutApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkoutBrowserKeyPut**](CheckoutApi.md#checkoutBrowserKeyPut) | **PUT** /checkout/browser_key | Setup Browser Application
[**checkoutCartCartIdGet**](CheckoutApi.md#checkoutCartCartIdGet) | **GET** /checkout/cart/{cart_id} | Get cart (by cart id)
[**checkoutCartFinalizeOrderPost**](CheckoutApi.md#checkoutCartFinalizeOrderPost) | **POST** /checkout/cart/finalizeOrder | Finalize Order
[**checkoutCartGet**](CheckoutApi.md#checkoutCartGet) | **GET** /checkout/cart | Get cart
[**checkoutCartHandoffPost**](CheckoutApi.md#checkoutCartHandoffPost) | **POST** /checkout/cart/handoff | Handoff cart
[**checkoutCartProfileLoginPost**](CheckoutApi.md#checkoutCartProfileLoginPost) | **POST** /checkout/cart/profile/login | Profile login
[**checkoutCartProfileLogoutPost**](CheckoutApi.md#checkoutCartProfileLogoutPost) | **POST** /checkout/cart/profile/logout | Profile logout
[**checkoutCartProfileRegisterPost**](CheckoutApi.md#checkoutCartProfileRegisterPost) | **POST** /checkout/cart/profile/register | Profile registration
[**checkoutCartPut**](CheckoutApi.md#checkoutCartPut) | **PUT** /checkout/cart | Update cart
[**checkoutCartValidatePost**](CheckoutApi.md#checkoutCartValidatePost) | **POST** /checkout/cart/validate | Validate
[**checkoutCityStatePost**](CheckoutApi.md#checkoutCityStatePost) | **POST** /checkout/city_state | City/State for Zip
[**checkoutRelatedItemsItemIdPost**](CheckoutApi.md#checkoutRelatedItemsItemIdPost) | **POST** /checkout/relatedItems/{item_id} | Related items (specific item)
[**checkoutRelatedItemsPost**](CheckoutApi.md#checkoutRelatedItemsPost) | **POST** /checkout/related_items | Related items
[**checkoutReturnReturnCodeGet**](CheckoutApi.md#checkoutReturnReturnCodeGet) | **GET** /checkout/return/{return_code} | Get cart (by return code)


<a name="checkoutBrowserKeyPut"></a>
# **checkoutBrowserKeyPut**
> CheckoutSetupBrowserKeyResponse checkoutBrowserKeyPut(browserKeyRequest)

Setup Browser Application

Setup a browser key authenticated application with checkout permissions.  This REST call must be made with an authentication scheme that is not browser key.  The new application will be linked to the application that makes this call.  If this application is disabled / deleted, then so will the application setup by this call.  The purpose of this call is to allow an OAuth applicaiton, such as the Wordpress plugin, to setup the proper browser based authentication for the REST checkout API to use. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
CheckoutSetupBrowserKeyRequest browserKeyRequest = new CheckoutSetupBrowserKeyRequest(); // CheckoutSetupBrowserKeyRequest | Setup browser key request
try {
    CheckoutSetupBrowserKeyResponse result = apiInstance.checkoutBrowserKeyPut(browserKeyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutBrowserKeyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **browserKeyRequest** | [**CheckoutSetupBrowserKeyRequest**](CheckoutSetupBrowserKeyRequest.md)| Setup browser key request |

### Return type

[**CheckoutSetupBrowserKeyResponse**](CheckoutSetupBrowserKeyResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartCartIdGet"></a>
# **checkoutCartCartIdGet**
> CartResponse checkoutCartCartIdGet(cartId, expand)

Get cart (by cart id)

Get a cart specified by the cart_id parameter. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
String cartId = "cartId_example"; // String | Cart ID to retrieve
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.checkoutCartCartIdGet(cartId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartCartIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**| Cart ID to retrieve |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartFinalizeOrderPost"></a>
# **checkoutCartFinalizeOrderPost**
> CartFinalizeOrderResponse checkoutCartFinalizeOrderPost(finalizeRequest)

Finalize Order

Finalize the cart into an order.  This method can not be called with browser key authentication.  It is ONLY meant for server side code to call. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
CartFinalizeOrderRequest finalizeRequest = new CartFinalizeOrderRequest(); // CartFinalizeOrderRequest | Finalize request
try {
    CartFinalizeOrderResponse result = apiInstance.checkoutCartFinalizeOrderPost(finalizeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartFinalizeOrderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **finalizeRequest** | [**CartFinalizeOrderRequest**](CartFinalizeOrderRequest.md)| Finalize request |

### Return type

[**CartFinalizeOrderResponse**](CartFinalizeOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartGet"></a>
# **checkoutCartGet**
> CartResponse checkoutCartGet(expand)

Get cart

If the cookie is set on the browser making the request then it will return their active cart.  Otherwise it will create a new cart. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.checkoutCartGet(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartHandoffPost"></a>
# **checkoutCartHandoffPost**
> CheckoutHandoffResponse checkoutCartHandoffPost(handoffRequest, expand)

Handoff cart

Handoff the browser to UltraCart for view cart on StoreFront, transfer to PayPal or finalization of the order (including upsell processing). 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
CheckoutHandoffRequest handoffRequest = new CheckoutHandoffRequest(); // CheckoutHandoffRequest | Handoff request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CheckoutHandoffResponse result = apiInstance.checkoutCartHandoffPost(handoffRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartHandoffPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **handoffRequest** | [**CheckoutHandoffRequest**](CheckoutHandoffRequest.md)| Handoff request |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CheckoutHandoffResponse**](CheckoutHandoffResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartProfileLoginPost"></a>
# **checkoutCartProfileLoginPost**
> CartProfileLoginResponse checkoutCartProfileLoginPost(loginRequest, expand)

Profile login

Login in to the customer profile specified by cart.billing.email and password 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
CartProfileLoginRequest loginRequest = new CartProfileLoginRequest(); // CartProfileLoginRequest | Login request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartProfileLoginResponse result = apiInstance.checkoutCartProfileLoginPost(loginRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartProfileLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginRequest** | [**CartProfileLoginRequest**](CartProfileLoginRequest.md)| Login request |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartProfileLoginResponse**](CartProfileLoginResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartProfileLogoutPost"></a>
# **checkoutCartProfileLogoutPost**
> CartResponse checkoutCartProfileLogoutPost(cart, expand)

Profile logout

Log the cart out of the current profile.  No error will occur if they are not logged in. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
Cart cart = new Cart(); // Cart | Cart
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.checkoutCartProfileLogoutPost(cart, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartProfileLogoutPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cart** | [**Cart**](Cart.md)| Cart |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartProfileRegisterPost"></a>
# **checkoutCartProfileRegisterPost**
> CartProfileRegisterResponse checkoutCartProfileRegisterPost(registerRequest, expand)

Profile registration

Register a new customer profile.  Requires the cart.billing object to be populated along with the password. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
CartProfileRegisterRequest registerRequest = new CartProfileRegisterRequest(); // CartProfileRegisterRequest | Register request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartProfileRegisterResponse result = apiInstance.checkoutCartProfileRegisterPost(registerRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartProfileRegisterPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerRequest** | [**CartProfileRegisterRequest**](CartProfileRegisterRequest.md)| Register request |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartProfileRegisterResponse**](CartProfileRegisterResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartPut"></a>
# **checkoutCartPut**
> CartResponse checkoutCartPut(cart, expand)

Update cart

Update the cart. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
Cart cart = new Cart(); // Cart | Cart
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.checkoutCartPut(cart, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cart** | [**Cart**](Cart.md)| Cart |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCartValidatePost"></a>
# **checkoutCartValidatePost**
> CartValidationResponse checkoutCartValidatePost(validationRequest, expand)

Validate

Validate the cart for errors.  Specific checks can be passed and multiple validations can occur throughout your checkout flow. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
CartValidationRequest validationRequest = new CartValidationRequest(); // CartValidationRequest | Validation request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartValidationResponse result = apiInstance.checkoutCartValidatePost(validationRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCartValidatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validationRequest** | [**CartValidationRequest**](CartValidationRequest.md)| Validation request |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartValidationResponse**](CartValidationResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutCityStatePost"></a>
# **checkoutCityStatePost**
> ItemsResponse checkoutCityStatePost(cart)

City/State for Zip

Look up the city and state for the shipping zip code.  Useful for building an auto complete for parts of the shipping address 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
Cart cart = new Cart(); // Cart | Cart
try {
    ItemsResponse result = apiInstance.checkoutCityStatePost(cart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutCityStatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cart** | [**Cart**](Cart.md)| Cart |

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutRelatedItemsItemIdPost"></a>
# **checkoutRelatedItemsItemIdPost**
> ItemsResponse checkoutRelatedItemsItemIdPost(itemId, cart, expand)

Related items (specific item)

Retrieve all the related items for the cart contents.  Expansion is limited to content, content.assignments, content.attributes, content.multimedia, content.multimedia.thumbnails, options, pricing, and pricing.tiers. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
String itemId = "itemId_example"; // String | Item ID to retrieve related items for
Cart cart = new Cart(); // Cart | Cart
String expand = "expand_example"; // String | The object expansion to perform on the result.  See item resource documentation for examples
try {
    ItemsResponse result = apiInstance.checkoutRelatedItemsItemIdPost(itemId, cart, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutRelatedItemsItemIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemId** | **String**| Item ID to retrieve related items for |
 **cart** | [**Cart**](Cart.md)| Cart |
 **expand** | **String**| The object expansion to perform on the result.  See item resource documentation for examples | [optional]

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutRelatedItemsPost"></a>
# **checkoutRelatedItemsPost**
> ItemsResponse checkoutRelatedItemsPost(cart, expand)

Related items

Retrieve all the related items for the cart contents.  Expansion is limited to content, content.assignments, content.attributes, content.multimedia, content.multimedia.thumbnails, options, pricing, and pricing.tiers. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
Cart cart = new Cart(); // Cart | Cart
String expand = "expand_example"; // String | The object expansion to perform on the result.  See item resource documentation for examples
try {
    ItemsResponse result = apiInstance.checkoutRelatedItemsPost(cart, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutRelatedItemsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cart** | [**Cart**](Cart.md)| Cart |
 **expand** | **String**| The object expansion to perform on the result.  See item resource documentation for examples | [optional]

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="checkoutReturnReturnCodeGet"></a>
# **checkoutReturnReturnCodeGet**
> CartResponse checkoutReturnReturnCodeGet(returnCode, expand)

Get cart (by return code)

Get a cart specified by the return code parameter. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ultraCartBrowserApiKey
ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartBrowserApiKey.setApiKeyPrefix("Token");

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CheckoutApi apiInstance = new CheckoutApi();
String returnCode = "returnCode_example"; // String | Return code to lookup cart ID by
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.checkoutReturnReturnCodeGet(returnCode, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#checkoutReturnReturnCodeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnCode** | **String**| Return code to lookup cart ID by |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

