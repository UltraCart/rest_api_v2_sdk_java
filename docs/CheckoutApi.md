# CheckoutApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cityState**](CheckoutApi.md#cityState) | **POST** /checkout/city_state | City/State for Zip
[**finalizeOrder**](CheckoutApi.md#finalizeOrder) | **POST** /checkout/cart/finalizeOrder | Finalize Order
[**getAffirmCheckout**](CheckoutApi.md#getAffirmCheckout) | **GET** /checkout/cart/{cart_id}/affirmCheckout | Get affirm checkout (by cart id)
[**getAllowedCountries**](CheckoutApi.md#getAllowedCountries) | **POST** /checkout/allowedCountries | Allowed countries
[**getCart**](CheckoutApi.md#getCart) | **GET** /checkout/cart | Get cart
[**getCartByCartId**](CheckoutApi.md#getCartByCartId) | **GET** /checkout/cart/{cart_id} | Get cart (by cart id)
[**getCartByReturnCode**](CheckoutApi.md#getCartByReturnCode) | **GET** /checkout/return/{return_code} | Get cart (by return code)
[**getCartByReturnToken**](CheckoutApi.md#getCartByReturnToken) | **GET** /checkout/return_token | Get cart (by return token)
[**getStateProvincesForCountry**](CheckoutApi.md#getStateProvincesForCountry) | **POST** /checkout/stateProvincesForCountry/{country_code} | Get state/province list for a country code
[**handoffCart**](CheckoutApi.md#handoffCart) | **POST** /checkout/cart/handoff | Handoff cart
[**login**](CheckoutApi.md#login) | **POST** /checkout/cart/profile/login | Profile login
[**logout**](CheckoutApi.md#logout) | **POST** /checkout/cart/profile/logout | Profile logout
[**register**](CheckoutApi.md#register) | **POST** /checkout/cart/profile/register | Profile registration
[**registerAffiliateClick**](CheckoutApi.md#registerAffiliateClick) | **POST** /checkout/affiliateClick/register | Register affiliate click
[**relatedItemsForCart**](CheckoutApi.md#relatedItemsForCart) | **POST** /checkout/related_items | Related items
[**relatedItemsForItem**](CheckoutApi.md#relatedItemsForItem) | **POST** /checkout/relatedItems/{item_id} | Related items (specific item)
[**setupBrowserKey**](CheckoutApi.md#setupBrowserKey) | **PUT** /checkout/browser_key | Setup Browser Application
[**updateCart**](CheckoutApi.md#updateCart) | **PUT** /checkout/cart | Update cart
[**validateCart**](CheckoutApi.md#validateCart) | **POST** /checkout/cart/validate | Validate


<a name="cityState"></a>
# **cityState**
> CityStateZip cityState(cart)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

Cart cart = new Cart(); // Cart | Cart
try {
    CityStateZip result = apiInstance.cityState(cart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#cityState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cart** | [**Cart**](Cart.md)| Cart |

### Return type

[**CityStateZip**](CityStateZip.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="finalizeOrder"></a>
# **finalizeOrder**
> CartFinalizeOrderResponse finalizeOrder(finalizeRequest)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

CartFinalizeOrderRequest finalizeRequest = new CartFinalizeOrderRequest(); // CartFinalizeOrderRequest | Finalize request
try {
    CartFinalizeOrderResponse result = apiInstance.finalizeOrder(finalizeRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#finalizeOrder");
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

<a name="getAffirmCheckout"></a>
# **getAffirmCheckout**
> CartAffirmCheckoutResponse getAffirmCheckout(cartId)

Get affirm checkout (by cart id)

Get a Affirm checkout object for the specified cart_id parameter. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

String cartId = "cartId_example"; // String | Cart ID to retrieve
try {
    CartAffirmCheckoutResponse result = apiInstance.getAffirmCheckout(cartId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#getAffirmCheckout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cartId** | **String**| Cart ID to retrieve |

### Return type

[**CartAffirmCheckoutResponse**](CartAffirmCheckoutResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllowedCountries"></a>
# **getAllowedCountries**
> CheckoutAllowedCountriesResponse getAllowedCountries()

Allowed countries

Lookup the allowed countries for this merchant id 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

try {
    CheckoutAllowedCountriesResponse result = apiInstance.getAllowedCountries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#getAllowedCountries");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CheckoutAllowedCountriesResponse**](CheckoutAllowedCountriesResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCart"></a>
# **getCart**
> CartResponse getCart(expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.getCart(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#getCart");
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

<a name="getCartByCartId"></a>
# **getCartByCartId**
> CartResponse getCartByCartId(cartId, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

String cartId = "cartId_example"; // String | Cart ID to retrieve
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.getCartByCartId(cartId, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#getCartByCartId");
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

<a name="getCartByReturnCode"></a>
# **getCartByReturnCode**
> CartResponse getCartByReturnCode(returnCode, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

String returnCode = "returnCode_example"; // String | Return code to lookup cart ID by
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.getCartByReturnCode(returnCode, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#getCartByReturnCode");
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

<a name="getCartByReturnToken"></a>
# **getCartByReturnToken**
> CartResponse getCartByReturnToken(returnToken, expand)

Get cart (by return token)

Get a cart specified by the encrypted return token parameter. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

String returnToken = "returnToken_example"; // String | Return token provided by StoreFront Communications
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.getCartByReturnToken(returnToken, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#getCartByReturnToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returnToken** | **String**| Return token provided by StoreFront Communications | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStateProvincesForCountry"></a>
# **getStateProvincesForCountry**
> CheckoutStateProvinceResponse getStateProvincesForCountry(countryCode)

Get state/province list for a country code

Lookup a state/province list for a given country code 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

String countryCode = "countryCode_example"; // String | Two letter ISO country code
try {
    CheckoutStateProvinceResponse result = apiInstance.getStateProvincesForCountry(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#getStateProvincesForCountry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| Two letter ISO country code |

### Return type

[**CheckoutStateProvinceResponse**](CheckoutStateProvinceResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="handoffCart"></a>
# **handoffCart**
> CheckoutHandoffResponse handoffCart(handoffRequest, expand)

Handoff cart

Handoff the browser to UltraCart for view cart on StoreFront, transfer to PayPal, transfer to Affirm, transfer to Sezzle or finalization of the order (including upsell processing). 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

CheckoutHandoffRequest handoffRequest = new CheckoutHandoffRequest(); // CheckoutHandoffRequest | Handoff request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CheckoutHandoffResponse result = apiInstance.handoffCart(handoffRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#handoffCart");
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

<a name="login"></a>
# **login**
> CartProfileLoginResponse login(loginRequest, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

CartProfileLoginRequest loginRequest = new CartProfileLoginRequest(); // CartProfileLoginRequest | Login request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartProfileLoginResponse result = apiInstance.login(loginRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#login");
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

<a name="logout"></a>
# **logout**
> CartResponse logout(cart, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

Cart cart = new Cart(); // Cart | Cart
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.logout(cart, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#logout");
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

<a name="register"></a>
# **register**
> CartProfileRegisterResponse register(registerRequest, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

CartProfileRegisterRequest registerRequest = new CartProfileRegisterRequest(); // CartProfileRegisterRequest | Register request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartProfileRegisterResponse result = apiInstance.register(registerRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#register");
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

<a name="registerAffiliateClick"></a>
# **registerAffiliateClick**
> RegisterAffiliateClickResponse registerAffiliateClick(registerAffiliateClickRequest, expand)

Register affiliate click

Register an affiliate click.  Used by custom checkouts that are completely API based and do not perform checkout handoff. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CheckoutApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

RegisterAffiliateClickRequest registerAffiliateClickRequest = new RegisterAffiliateClickRequest(); // RegisterAffiliateClickRequest | Register affiliate click request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    RegisterAffiliateClickResponse result = apiInstance.registerAffiliateClick(registerAffiliateClickRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#registerAffiliateClick");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registerAffiliateClickRequest** | [**RegisterAffiliateClickRequest**](RegisterAffiliateClickRequest.md)| Register affiliate click request |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**RegisterAffiliateClickResponse**](RegisterAffiliateClickResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="relatedItemsForCart"></a>
# **relatedItemsForCart**
> ItemsResponse relatedItemsForCart(cart, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

Cart cart = new Cart(); // Cart | Cart
String expand = "expand_example"; // String | The object expansion to perform on the result.  See item resource documentation for examples
try {
    ItemsResponse result = apiInstance.relatedItemsForCart(cart, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#relatedItemsForCart");
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

<a name="relatedItemsForItem"></a>
# **relatedItemsForItem**
> ItemsResponse relatedItemsForItem(itemId, cart, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

String itemId = "itemId_example"; // String | Item ID to retrieve related items for
Cart cart = new Cart(); // Cart | Cart
String expand = "expand_example"; // String | The object expansion to perform on the result.  See item resource documentation for examples
try {
    ItemsResponse result = apiInstance.relatedItemsForItem(itemId, cart, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#relatedItemsForItem");
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

<a name="setupBrowserKey"></a>
# **setupBrowserKey**
> CheckoutSetupBrowserKeyResponse setupBrowserKey(browserKeyRequest)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

CheckoutSetupBrowserKeyRequest browserKeyRequest = new CheckoutSetupBrowserKeyRequest(); // CheckoutSetupBrowserKeyRequest | Setup browser key request
try {
    CheckoutSetupBrowserKeyResponse result = apiInstance.setupBrowserKey(browserKeyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#setupBrowserKey");
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

<a name="updateCart"></a>
# **updateCart**
> CartResponse updateCart(cart, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

Cart cart = new Cart(); // Cart | Cart
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartResponse result = apiInstance.updateCart(cart, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#updateCart");
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

<a name="validateCart"></a>
# **validateCart**
> CartValidationResponse validateCart(validationRequest, expand)

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

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
CheckoutApi apiInstance = new CheckoutApi(apiKey);

CartValidationRequest validationRequest = new CartValidationRequest(); // CartValidationRequest | Validation request
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CartValidationResponse result = apiInstance.validateCart(validationRequest, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckoutApi#validateCart");
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

