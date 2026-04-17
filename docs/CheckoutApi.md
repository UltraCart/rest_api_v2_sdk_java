# CheckoutApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cityState**](CheckoutApi.md#cityState) | **POST** /checkout/city_state | City/State for Zip |
| [**finalizeOrder**](CheckoutApi.md#finalizeOrder) | **POST** /checkout/cart/finalizeOrder | Finalize Order |
| [**getAffirmCheckout**](CheckoutApi.md#getAffirmCheckout) | **GET** /checkout/cart/{cart_id}/affirmCheckout | Get affirm checkout (by cart id) |
| [**getAllowedCountries**](CheckoutApi.md#getAllowedCountries) | **POST** /checkout/allowedCountries | Allowed countries |
| [**getCart**](CheckoutApi.md#getCart) | **GET** /checkout/cart | Get cart |
| [**getCartByCartId**](CheckoutApi.md#getCartByCartId) | **GET** /checkout/cart/{cart_id} | Get cart (by cart id) |
| [**getCartByReturnCode**](CheckoutApi.md#getCartByReturnCode) | **GET** /checkout/return/{return_code} | Get cart (by return code) |
| [**getCartByReturnToken**](CheckoutApi.md#getCartByReturnToken) | **GET** /checkout/return_token | Get cart (by return token) |
| [**getStateProvincesForCountry**](CheckoutApi.md#getStateProvincesForCountry) | **POST** /checkout/stateProvincesForCountry/{country_code} | Get state/province list for a country code |
| [**handoffCart**](CheckoutApi.md#handoffCart) | **POST** /checkout/cart/handoff | Handoff cart |
| [**login**](CheckoutApi.md#login) | **POST** /checkout/cart/profile/login | Profile login |
| [**logout**](CheckoutApi.md#logout) | **POST** /checkout/cart/profile/logout | Profile logout |
| [**register**](CheckoutApi.md#register) | **POST** /checkout/cart/profile/register | Profile registration |
| [**registerAffiliateClick**](CheckoutApi.md#registerAffiliateClick) | **POST** /checkout/affiliateClick/register | Register affiliate click |
| [**relatedItemsForCart**](CheckoutApi.md#relatedItemsForCart) | **POST** /checkout/related_items | Related items |
| [**relatedItemsForItem**](CheckoutApi.md#relatedItemsForItem) | **POST** /checkout/relatedItems/{item_id} | Related items (specific item) |
| [**setupBrowserKey**](CheckoutApi.md#setupBrowserKey) | **PUT** /checkout/browser_key | Setup Browser Application |
| [**updateCart**](CheckoutApi.md#updateCart) | **PUT** /checkout/cart | Update cart |
| [**validateCart**](CheckoutApi.md#validateCart) | **POST** /checkout/cart/validate | Validate |


<a name="cityState"></a>
# **cityState**
> CityStateZip cityState(cart)

City/State for Zip

Look up the city and state for the shipping zip code.  Useful for building an auto complete for parts of the shipping address 

### Example

```java
package checkout;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class CityState {
    /**
     * Takes a postal code and returns back a city and state (US Only)
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     */
    public static void execute() {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        String cartId = "123456789123456789123456789123456789";  // you should have the cart id from session or cookie.
        Cart cart = new Cart();
        cart.cartId(cartId); // required
        cart.shipping(new CartShipping());
        cart.getShipping().postalCode("44233");

        try {
            CityStateZip apiResponse = checkoutApi.cityState(cart);
            System.out.println("City: " + apiResponse.getCity());
            System.out.println("State: " + apiResponse.getState());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cart** | [**Cart**](Cart.md)| Cart | |

### Return type

[**CityStateZip**](CityStateZip.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="finalizeOrder"></a>
# **finalizeOrder**
> CartFinalizeOrderResponse finalizeOrder(finalizeRequest)

Finalize Order

Finalize the cart into an order.  This method can not be called with browser key authentication.  It is ONLY meant for server side code to call. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FinalizeOrder {
    /**
     * Finalizes an order from a cart
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     * 
     * Note: You probably should NOT be using this method. Use handoffCart() instead.
     * This method is a server-side only (no browser key allowed) method for turning a cart into an order.
     * It exists for merchants who wish to provide their own upsells, but using this method
     * will exclude the customer checkout from a vast and powerful suite of functionality provided free by UltraCart.
     */
    public static void execute() {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        // Possible Expansion Variables documented at https://www.ultracart.com/api/#resource_checkout.html
        String expansion = "customer_profile,items,billing,shipping,coupons,checkout,payment,summary,taxes";

        String cartId = "123456789123456789123456789123456789"; // get the cart id from session or cookie

        try {
            CartResponse cartResponse = checkoutApi.getCartByCartId(cartId, expansion);
            Cart cart = cartResponse.getCart();

            // TODO - add some items, collect billing and shipping, use hosted fields to collect payment, etc.

            CartFinalizeOrderRequest finalizeRequest = new CartFinalizeOrderRequest();
            finalizeRequest.cart(cart);
            CartFinalizeOrderRequestOptions finalizeOptions = new CartFinalizeOrderRequestOptions();
            finalizeRequest.options(finalizeOptions);

            CartFinalizeOrderResponse orderResponse = checkoutApi.finalizeOrder(finalizeRequest);
            // orderResponse.isSuccessful();
            // orderResponse.getErrors();
            // orderResponse.getOrderId();
            // orderResponse.getOrder();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(orderResponse));

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **finalizeRequest** | [**CartFinalizeOrderRequest**](CartFinalizeOrderRequest.md)| Finalize request | |

### Return type

[**CartFinalizeOrderResponse**](CartFinalizeOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="getAffirmCheckout"></a>
# **getAffirmCheckout**
> CartAffirmCheckoutResponse getAffirmCheckout(cartId)

Get affirm checkout (by cart id)

Get a Affirm checkout object for the specified cart_id parameter. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.CartAffirmCheckoutResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class GetAffirmCheckout {
    /**
     * Returns Affirm checkout JSON for a given cart ID
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     * See https://www.affirm.com/ for Affirm details
     */
    public static void execute() {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);
        String cartId = "123456789123456789123456789123456789"; // retrieve from session or cookie

        try {
            CartAffirmCheckoutResponse apiResponse = checkoutApi.getAffirmCheckout(cartId);
            
            if (apiResponse.getErrors() != null && !apiResponse.getErrors().isEmpty()) {
                // Display errors to customer about the failure
                for (String error : apiResponse.getErrors()) {
                    System.out.println(error);
                }
            } else {
                System.out.println(apiResponse.getCheckoutJson()); // object to send to Affirm
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cartId** | **String**| Cart ID to retrieve | |

### Return type

[**CartAffirmCheckoutResponse**](CartAffirmCheckoutResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

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

<a name="getAllowedCountries"></a>
# **getAllowedCountries**
> CheckoutAllowedCountriesResponse getAllowedCountries()

Allowed countries

Lookup the allowed countries for this merchant id 

### Example

```java
package checkout;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.CheckoutAllowedCountriesResponse;
import com.ultracart.admin.v2.models.Country;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.List;

public class GetAllowedCountries {
    /**
     * Populates the country list with all countries the merchant has configured to accept
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     */
    public static void execute() {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        try {
            CheckoutAllowedCountriesResponse apiResponse = checkoutApi.getAllowedCountries();
            List<Country> allowedCountries = apiResponse.getCountries();

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            for (Country country : allowedCountries) {
                System.out.println(gson.toJson(country));
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**CheckoutAllowedCountriesResponse**](CheckoutAllowedCountriesResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

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

<a name="getCart"></a>
# **getCart**
> CartResponse getCart(expand)

Get cart

If the cookie is set on the browser making the request then it will return their active cart.  Otherwise it will create a new cart. 

### Example

```java
package checkout;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetCart {
    /**
     * Retrieves a cart either by creating a new one or getting an existing one by cart ID
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     *
     * This example is the same for both getCart.php and getCartByCartId.php.  They work as a pair and are called
     * depending on the presence of an existing cart id or not.  For new carts, getCart() is used.  For existing
     * carts, getCartByCartId($cart_id) is used.
     */
    public static void execute() {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html
        /*
        affiliate                   checkout                            customer_profile
        billing                     coupons                             gift
        gift_certificate            items.attributes                   items.multimedia
        items                       items.multimedia.thumbnails         items.physical
        marketing                   payment                                settings.gift
        settings.billing.provinces  settings.shipping.deliver_on_date   settings.shipping.estimates
        settings.shipping.provinces settings.shipping.ship_on_date     settings.taxes
        settings.terms              shipping                           taxes
        summary                     upsell_after
         */
        String expansion = "customer_profile,items,billing,shipping,coupons,checkout,payment,summary,taxes";

        try {
            String cartId = null; // no cart id yet.  GetCart will return a new cart.
            CartResponse apiResponse = checkoutApi.getCart(expansion);
            Cart cart = apiResponse.getCart();

            // TODO: set or re-set the cart cookie if this is part of a multi-page process. two weeks is a generous cart id time.
            // Note: In Java, cookie handling is framework-specific. The following is a conceptual representation.
            // HttpCookie cookie = new HttpCookie(Constants.CART_ID_COOKIE_NAME);
            // cookie.setValue(cart.getCartId());
            // cookie.setMaxAge(1209600); // 1209600 seconds = 14 days
            // cookie.setPath("/");
            // HttpContext.getCurrentResponse().addCookie(cookie);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(cart));

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

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

<a name="getCartByCartId"></a>
# **getCartByCartId**
> CartResponse getCartByCartId(cartId, expand)

Get cart (by cart id)

Get a cart specified by the cart_id parameter. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetCartByCartId {
    /**
     * Retrieves a cart either by creating a new one or getting an existing one by cart ID
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     *
     * This example is the same for both getCart.php and getCartByCartId.php.  They work as a pair and are called
     * depending on the presence of an existing cart id or not.  For new carts, getCart() is used.  For existing
     * carts, getCartByCartId($cart_id) is used.
     */
    public static void execute() {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        // for this example, we're just getting a cart to insert some items into it.
        String expansion = "items";

        try {
            // get cart ID from session or cookie.
            String cartId = "123456780123456780123456780123456780";
            CartResponse apiResponse = checkoutApi.getCartByCartId(cartId, expansion);
            Cart cart = apiResponse.getCart();

            // TODO: set or re-set the cart cookie if this is part of a multi-page process. two weeks is a generous cart id time.
            // Note: In Java, cookie handling is framework-specific. The following is a conceptual representation.
            // HttpCookie cookie = new HttpCookie(Constants.CART_ID_COOKIE_NAME);
            // cookie.setValue(cart.getCartId());
            // cookie.setMaxAge(1209600); // 1209600 seconds = 14 days
            // cookie.setPath("/");
            // HttpContext.getCurrentResponse().addCookie(cookie);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(cart));

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cartId** | **String**| Cart ID to retrieve | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

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

<a name="getCartByReturnCode"></a>
# **getCartByReturnCode**
> CartResponse getCartByReturnCode(returnCode, expand)

Get cart (by return code)

Get a cart specified by the return code parameter. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetCartByReturnCode {
    /**
     * Retrieves a cart using a return code
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     *
     * This example returns a shopping cart given a return_code. The return_code is generated by UltraCart
     * and usually emailed to a customer. The email will provide a link to this script where you may use the
     * return_code to retrieve the customer's cart.
     */
    public static void execute() {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html
        /*
        affiliate                   checkout                            customer_profile
        billing                     coupons                             gift
        gift_certificate            items.attributes                   items.multimedia
        items                       items.multimedia.thumbnails         items.physical
        marketing                   payment                                settings.gift
        settings.billing.provinces  settings.shipping.deliver_on_date   settings.shipping.estimates
        settings.shipping.provinces settings.shipping.ship_on_date     settings.taxes
        settings.terms              shipping                           taxes
        summary                     upsell_after
         */
        String expansion = "items,billing,shipping,coupons,checkout,payment,summary,taxes";

        try {
            // usually retrieved from a query parameter
            String returnCode = "1234567890";
            CartResponse apiResponse = checkoutApi.getCartByReturnCode(returnCode, expansion);
            Cart cart = apiResponse.getCart();

            // TODO: set or re-set the cart cookie if this is part of a multi-page process. two weeks is a generous cart id time.
            // Note: In Java, cookie handling is framework-specific. The following is a conceptual representation.
            // HttpCookie cookie = new HttpCookie(Constants.CART_ID_COOKIE_NAME);
            // cookie.setValue(cart.getCartId());
            // cookie.setMaxAge(1209600); // 1209600 seconds = 14 days
            // cookie.setPath("/");
            // HttpContext.getCurrentResponse().addCookie(cookie);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(cart));

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **returnCode** | **String**| Return code to lookup cart ID by | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

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

<a name="getCartByReturnToken"></a>
# **getCartByReturnToken**
> CartResponse getCartByReturnToken(returnToken, expand)

Get cart (by return token)

Get a cart specified by the encrypted return token parameter. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GetCartByReturnToken {
    /**
     * Retrieves a cart using a return token
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     *
     * This example returns a shopping cart given a return_token. The return token is generated by StoreFront Communications
     * and usually emailed to a customer. The link within the email will (when you configure your storefront communications)
     * provide a link to this script where you may use the token to retrieve the customer's cart.
     */
    public static void execute() {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html
        /*
        affiliate                   checkout                            customer_profile
        billing                     coupons                             gift
        gift_certificate            items.attributes                   items.multimedia
        items                       items.multimedia.thumbnails         items.physical
        marketing                   payment                                settings.gift
        settings.billing.provinces  settings.shipping.deliver_on_date   settings.shipping.estimates
        settings.shipping.provinces settings.shipping.ship_on_date     settings.taxes
        settings.terms              shipping                           taxes
        summary                     upsell_after
         */
        String expansion = "items,billing,shipping,coupons,checkout,payment,summary,taxes";

        try {
            // usually retrieved from a query parameter
            String cartToken = "1234567890";
            CartResponse apiResponse = checkoutApi.getCartByReturnToken(cartToken, expansion);
            Cart cart = apiResponse.getCart();

            // TODO: set or re-set the cart cookie if this is part of a multi-page process. two weeks is a generous cart id time.
            // Note: In Java, cookie handling is framework-specific. The following is a conceptual representation.
            // HttpCookie cookie = new HttpCookie(Constants.CART_ID_COOKIE_NAME);
            // cookie.setValue(cart.getCartId());
            // cookie.setMaxAge(1209600); // 1209600 seconds = 14 days
            // cookie.setPath("/");
            // HttpContext.getCurrentResponse().addCookie(cookie);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            System.out.println(gson.toJson(cart));

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **returnToken** | **String**| Return token provided by StoreFront Communications | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

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

<a name="getStateProvincesForCountry"></a>
# **getStateProvincesForCountry**
> CheckoutStateProvinceResponse getStateProvincesForCountry(countryCode)

Get state/province list for a country code

Lookup a state/province list for a given country code 

### Example

```java
package checkout;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.CheckoutStateProvinceResponse;
import com.ultracart.admin.v2.models.StateProvince;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.List;

public class GetStateProvincesForCountry {
    /**
     * A simple method for populating the state_region list boxes with all the states/regions allowed for a country code.
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     */
    public static void execute() throws ApiException {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        String countryCode = "US";

        CheckoutStateProvinceResponse apiResponse = checkoutApi.getStateProvincesForCountry(countryCode);
        List<StateProvince> provinces = apiResponse.getStateProvinces();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        for (StateProvince province : provinces) {
            System.out.println(gson.toJson(province));
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**| Two letter ISO country code | |

### Return type

[**CheckoutStateProvinceResponse**](CheckoutStateProvinceResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

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

<a name="handoffCart"></a>
# **handoffCart**
> CheckoutHandoffResponse handoffCart(handoffRequest, expand)

Handoff cart

Handoff the browser to UltraCart for view cart on StoreFront, transfer to PayPal, transfer to Affirm, transfer to Sezzle or finalization of the order (including upsell processing). 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.Cart;
import com.ultracart.admin.v2.models.CartResponse;
import com.ultracart.admin.v2.models.CheckoutHandoffRequest;
import com.ultracart.admin.v2.models.CheckoutHandoffResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class HandoffCart {
    /**
     * Hands off a cart to the UltraCart engine for further processing
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     */
    public static void execute() throws ApiException {
        // this example uses the getCart method as a starting point, because we must get a cart to handoff a cart.
        // here, we are handing off the cart to the ultracart engine with an operation of 'view', meaning that we
        // simply added some items to the cart and wish for UltraCart to gather the remaining customer information
        // as part of a normal checkout operation.
        // valid operations are: "view", "checkout", "paypal", "paypalcredit", "affirm", "sezzle"
        // Besides "view", the other operations are finalizers.
        // "checkout": finalize the transaction using a customer's personal credit card (traditional checkout)
        // "paypal": finalize the transaction by sending the customer to PayPal

        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        String expansion = "items"; // for this example, we're just getting a cart to insert some items into it.

        String cartId = null;
        // get the cartId from session or cookie.
        // if (HttpContext.Current.Request.Cookies[Constants.CART_ID_COOKIE_NAME] != null)
        // {
        //     cartId = HttpContext.Current.Request.Cookies[Constants.CART_ID_COOKIE_NAME].Value;
        // }

        Cart cart;
        CartResponse apiResponse;
        if (cartId == null) {
            apiResponse = checkoutApi.getCart(expansion);
        } else {
            apiResponse = checkoutApi.getCartByCartId(cartId, expansion);
        }
        cart = apiResponse.getCart();

        // Although the above code checks for a cookie and retrieves or creates a cart based on the cookie presence, typically
        // a php script calling the handoff() method will have an existing cart, so you may wish to check for a cookie and
        // redirect if there isn't one.  However, it is possible that you wish to create a cart, update it, and hand it off
        // to UltraCart all within one script, so we've left the conditional cart creation calls intact.

        CheckoutHandoffRequest handoffRequest = new CheckoutHandoffRequest();
        handoffRequest.setCart(cart);
        handoffRequest.setOperation(CheckoutHandoffRequest.OperationEnum.VIEW);
        handoffRequest.setErrorReturnUrl("/some/page/on/this/php/server/that/can/handle/errors/if/ultracart/encounters/an/issue/with/this/cart.php");
        handoffRequest.setErrorParameterName("uc_error"); // name this whatever the script supplied in ->setErrorReturnUrl() will check for in the $_GET object.
        handoffRequest.setSecureHostName("mystorefront.com"); // set to desired storefront.  some merchants have multiple storefronts.
        CheckoutHandoffResponse handoffResponse = checkoutApi.handoffCart(handoffRequest, expansion);

        if (handoffResponse.getErrors() != null && !handoffResponse.getErrors().isEmpty()) {
            // TODO: handle errors that might happen before handoff and manage those
        } else {
            String redirectUrl = handoffResponse.getRedirectToUrl();
            System.out.println(redirectUrl);
            // Issue the redirect to the customer.
            // HttpContext.Current.Response.Redirect(redirectUrl);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **handoffRequest** | [**CheckoutHandoffRequest**](CheckoutHandoffRequest.md)| Handoff request | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CheckoutHandoffResponse**](CheckoutHandoffResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="login"></a>
# **login**
> CartProfileLoginResponse login(loginRequest, expand)

Profile login

Login in to the customer profile specified by cart.billing.email and password 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.Cart;
import com.ultracart.admin.v2.models.CartBilling;
import com.ultracart.admin.v2.models.CartProfileLoginRequest;
import com.ultracart.admin.v2.models.CartProfileLoginResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class Login {
    /**
     * Logs a user into the UltraCart system
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     */
    public static void execute() throws ApiException {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        // Note: customer_profile is a required expansion for login to work properly
        String expansion = "customer_profile,items,billing,shipping,coupons,checkout,payment,summary,taxes";
        // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html

        // create a new cart (change this to an existing if you have one)
        Cart cart = checkoutApi.getCart(expansion).getCart();

        String email = "test@test.com"; // collect this from user.
        String password = "ABC123"; // collect this from user.

        cart.setBilling(new CartBilling());
        cart.getBilling().setEmail(email);

        CartProfileLoginRequest loginRequest = new CartProfileLoginRequest();
        loginRequest.setCart(cart); // will look for billing.email
        loginRequest.setPassword(password);

        // TODO: Make your expand variable whatever you need to populate your cart.
        CartProfileLoginResponse apiResponse = checkoutApi.login(loginRequest, null);
        // Store the updated cart variable.
        cart = apiResponse.getCart();

        if (apiResponse.getErrors() != null && !apiResponse.getErrors().isEmpty()) {
            // notify customer login failed.
        } else {
            // proceed with successful login.                
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **loginRequest** | [**CartProfileLoginRequest**](CartProfileLoginRequest.md)| Login request | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartProfileLoginResponse**](CartProfileLoginResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="logout"></a>
# **logout**
> CartResponse logout(cart, expand)

Profile logout

Log the cart out of the current profile.  No error will occur if they are not logged in. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.Cart;
import com.ultracart.admin.v2.models.CartBilling;
import com.ultracart.admin.v2.models.CartProfileLoginRequest;
import com.ultracart.admin.v2.models.CartProfileLoginResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class Logout {
    /**
     * Logs a user OUT of the UltraCart system
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     */
    public static void execute() throws ApiException {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        // Note: customer_profile is a required expansion for login to work properly
        String expansion = "customer_profile,items,billing,shipping,coupons,checkout,payment,summary,taxes";
        // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html

        // create a new cart (change this to an existing if you have one)
        Cart cart = checkoutApi.getCart(expansion).getCart();

        String email = "test@test.com"; // collect this from user.
        String password = "ABC123"; // collect this from user.

        cart.setBilling(new CartBilling());
        cart.getBilling().setEmail(email);

        CartProfileLoginRequest loginRequest = new CartProfileLoginRequest();
        loginRequest.setCart(cart); // will look for billing.email
        loginRequest.setPassword(password);

        CartProfileLoginResponse apiResponse = checkoutApi.login(loginRequest, null);
        cart = apiResponse.getCart();

        if (apiResponse.getErrors() != null && !apiResponse.getErrors().isEmpty()) {
            // notify customer login failed. Until they login, you can't logout.
        } else {
            checkoutApi.logout(cart, expansion); // <-- Here is the logout call.                
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cart** | [**Cart**](Cart.md)| Cart | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="register"></a>
# **register**
> CartProfileRegisterResponse register(registerRequest, expand)

Profile registration

Register a new customer profile.  Requires the cart.billing object to be populated along with the password. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.Cart;
import com.ultracart.admin.v2.models.CartBilling;
import com.ultracart.admin.v2.models.CartProfileRegisterRequest;
import com.ultracart.admin.v2.models.CartProfileRegisterResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class Register {
    /**
     * Registers a user in your merchant system. This will create a customer profile.
     * Reference Implementation: https://github.com/UltraCart/responsive_checkout
     */
    public static void execute() throws ApiException {
        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        // Note: customer_profile is a required expansion for login to work properly
        String expansion = "customer_profile,items,billing,shipping,coupons,checkout,payment,summary,taxes";
        // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html

        // create a new cart (change this to an existing if you have one)
        Cart cart = checkoutApi.getCart(expansion).getCart();

        String email = "test@test.com"; // collect this from user.
        String password = "ABC123"; // collect this from user.

        cart.setBilling(new CartBilling());
        cart.getBilling().setEmail(email); // this is the username.

        CartProfileRegisterRequest registerRequest = new CartProfileRegisterRequest();
        registerRequest.setCart(cart); // will look for billing.email
        registerRequest.setPassword(password);

        CartProfileRegisterResponse apiResponse = checkoutApi.register(registerRequest, null);
        cart = apiResponse.getCart(); // Important!  Get the cart from the response.

        if (apiResponse.getErrors() != null && !apiResponse.getErrors().isEmpty()) {
            for (String error : apiResponse.getErrors()) {
                System.out.println(error);
            }
        } else {
            System.out.println("Successfully registered new customer profile!");
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerRequest** | [**CartProfileRegisterRequest**](CartProfileRegisterRequest.md)| Register request | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartProfileRegisterResponse**](CartProfileRegisterResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="registerAffiliateClick"></a>
# **registerAffiliateClick**
> RegisterAffiliateClickResponse registerAffiliateClick(registerAffiliateClickRequest, expand)

Register affiliate click

Register an affiliate click.  Used by custom checkouts that are completely API based and do not perform checkout handoff. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.RegisterAffiliateClickRequest;
import com.ultracart.admin.v2.models.RegisterAffiliateClickResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class RegisterAffiliateClick {
    public static void execute() {
        // Reference Implementation: https://github.com/UltraCart/responsive_checkout
        // Records an affiliate click.

        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        RegisterAffiliateClickRequest clickRequest = new RegisterAffiliateClickRequest();
        
        // Note: In Java, you'll need to get these values from your HttpContext
        // This is a simplified example - implement proper request handling in your application
        String ipAddress = "127.0.0.1"; // Replace with actual implementation to get IP
        String userAgent = ""; // Replace with actual implementation to get user agent
        String refererUrl = ""; // Replace with actual implementation to get referer URL
        
        clickRequest.setIpAddress(ipAddress);
        clickRequest.setUserAgent(userAgent);
        clickRequest.setReferrerUrl(refererUrl);
        clickRequest.setAffid(123456789); // you should know this from your UltraCart affiliate system.
        clickRequest.setSubid("TODO:SupplyThisValue");
        // clickRequest.setLandingPageUrl(null);  // if you have landing page url.

        try {
            RegisterAffiliateClickResponse apiResponse = checkoutApi.registerAffiliateClick(clickRequest, null);
            System.out.println(apiResponse.toString());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **registerAffiliateClickRequest** | [**RegisterAffiliateClickRequest**](RegisterAffiliateClickRequest.md)| Register affiliate click request | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**RegisterAffiliateClickResponse**](RegisterAffiliateClickResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="relatedItemsForCart"></a>
# **relatedItemsForCart**
> ItemsResponse relatedItemsForCart(cart, expand)

Related items

Retrieve all the related items for the cart contents.  Expansion is limited to content, content.assignments, content.attributes, content.multimedia, content.multimedia.thumbnails, options, pricing, and pricing.tiers. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RelatedItemsForCart {
    public static void execute() {
        // Reference Implementation: https://github.com/UltraCart/responsive_checkout

        // Retrieves items related to the items within the cart. Item relations are configured in the UltraCart backend.
        // See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377171/Related+Items

        // Note: The returned items have a fixed expansion (only so many item properties are returned). The item expansion is:
        // content, content.assignments, content.attributes, content.multimedia, content.multimedia.thumbnails, options, pricing, and pricing.tiers

        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        String expansion = "customer_profile,items,billing,shipping,coupons,checkout,payment,summary,taxes";
        // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html
        /*
        affiliate                   checkout                            customer_profile
        billing                     coupons                             gift
        gift_certificate            items.attributes                   items.multimedia
        items                       items.multimedia.thumbnails         items.physical
        marketing                   payment                                settings.gift
        settings.billing.provinces  settings.shipping.deliver_on_date   settings.shipping.estimates
        settings.shipping.provinces settings.shipping.ship_on_date     settings.taxes
        settings.terms              shipping                           taxes
        summary                     upsell_after
         */

        // In Java web application, you'd get the cookie from HttpServletRequest
        String cartId = null;
        // Example of how you might get the cookie in a Servlet
        // Cookie[] cookies = request.getCookies();
        // if (cookies != null) {
        //     for (Cookie cookie : cookies) {
        //         if (Constants.CART_ID_COOKIE_NAME.equals(cookie.getName())) {
        //             cartId = cookie.getValue();
        //             break;
        //         }
        //     }
        // }

        Cart cart;
        try {
            if (cartId == null) {
                CartResponse apiResponse = checkoutApi.getCart(expansion);
                cart = apiResponse.getCart();
            } else {
                CartResponse apiResponse = checkoutApi.getCartByCartId(cartId, expansion);
                cart = apiResponse.getCart();
            }

            // TODO - add some items to the cart and update.

            List<CartItem> items = new ArrayList<>();
            CartItem cartItem = new CartItem();
            cartItem.setItemId("ITEM_ABC");
            cartItem.setQuantity(BigDecimal.valueOf(1));
            items.add(cartItem);
            cart.setItems(items);

            // update the cart and assign it back to our variable.
            cart = checkoutApi.updateCart(cart, expansion).getCart();

            ItemsResponse apiResponse2 = checkoutApi.relatedItemsForCart(cart, null);
            List<Item> relatedItems = apiResponse2.getItems();

            System.out.println("<html lang=\"en\"><body><pre>");
            for (Item item : relatedItems) {
                System.out.println(item.toString());
            }
            System.out.println("</pre></body></html>");

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cart** | [**Cart**](Cart.md)| Cart | |
| **expand** | **String**| The object expansion to perform on the result.  See item resource documentation for examples | [optional] |

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="relatedItemsForItem"></a>
# **relatedItemsForItem**
> ItemsResponse relatedItemsForItem(itemId, cart, expand)

Related items (specific item)

Retrieve all the related items for the cart contents.  Expansion is limited to content, content.assignments, content.attributes, content.multimedia, content.multimedia.thumbnails, options, pricing, and pricing.tiers. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RelatedItemsForItem {
    public static void execute() {
        // Reference Implementation: https://github.com/UltraCart/responsive_checkout

        // Retrieves items related to the items within the cart, in addition to another item id you supply.
        // Item relations are configured in the UltraCart backend.
        // See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377171/Related+Items

        // Note: The returned items have a fixed expansion (only so many item properties are returned). The item expansion is:
        // content, content.assignments, content.attributes, content.multimedia, content.multimedia.thumbnails, options, pricing, and pricing.tiers

        CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

        String expansion = "customer_profile,items,billing,shipping,coupons,checkout,payment,summary,taxes";
        // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html
        /*
        affiliate                   checkout                            customer_profile
        billing                     coupons                             gift
        gift_certificate            items.attributes                   items.multimedia
        items                       items.multimedia.thumbnails         items.physical
        marketing                   payment                                settings.gift
        settings.billing.provinces  settings.shipping.deliver_on_date   settings.shipping.estimates
        settings.shipping.provinces settings.shipping.ship_on_date     settings.taxes
        settings.terms              shipping                           taxes
        summary                     upsell_after
         */

        // In Java web application, you'd get the cookie from HttpServletRequest
        String cartId = null;
        // Example of how you might get the cookie in a Servlet
        // Cookie[] cookies = request.getCookies();
        // if (cookies != null) {
        //     for (Cookie cookie : cookies) {
        //         if (Constants.CART_ID_COOKIE_NAME.equals(cookie.getName())) {
        //             cartId = cookie.getValue();
        //             break;
        //         }
        //     }
        // }

        try {
            Cart cart;
            if (cartId == null) {
                CartResponse apiResponse = checkoutApi.getCart(expansion);
                cart = apiResponse.getCart();
            } else {
                CartResponse apiResponse = checkoutApi.getCartByCartId(cartId, expansion);
                cart = apiResponse.getCart();
            }

            // TODO - add some items to the cart and update.

            List<CartItem> items = new ArrayList<>();
            CartItem cartItem = new CartItem();
            cartItem.setItemId("ITEM_ABC");
            cartItem.setQuantity(BigDecimal.valueOf(1));
            items.add(cartItem);
            cart.setItems(items);

            // update the cart and assign it back to our variable.
            cart = checkoutApi.updateCart(cart, expansion).getCart();

            String anotherItemId = "ITEM_ZZZ";

            ItemsResponse apiResponse2 = checkoutApi.relatedItemsForItem(anotherItemId, cart, expansion);
            List<Item> relatedItems = apiResponse2.getItems();

            System.out.println("<html lang=\"en\"><body><pre>");
            for (Item item : relatedItems) {
                System.out.println(item.toString());
            }
            System.out.println("</pre></body></html>");

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemId** | **String**| Item ID to retrieve related items for | |
| **cart** | [**Cart**](Cart.md)| Cart | |
| **expand** | **String**| The object expansion to perform on the result.  See item resource documentation for examples | [optional] |

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="setupBrowserKey"></a>
# **setupBrowserKey**
> CheckoutSetupBrowserKeyResponse setupBrowserKey(browserKeyRequest)

Setup Browser Application

Setup a browser key authenticated application with checkout permissions.  This REST call must be made with an authentication scheme that is not browser key.  The new application will be linked to the application that makes this call.  If this application is disabled / deleted, then so will the application setup by this call.  The purpose of this call is to allow an OAuth application, such as the Wordpress plugin, to setup the proper browser based authentication for the REST checkout API to use. 

### Example

```java
package checkout;

import java.util.Collections;
import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class SetupBrowserKey {
    public static void execute() {
        /*
            This is a checkout api method. It creates a browser key for use in a client side checkout. This call must be
            made server side with a Simple API Key or an OAuth access_token.
         */

        try {
            CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

            CheckoutSetupBrowserKeyRequest keyRequest = new CheckoutSetupBrowserKeyRequest();
            keyRequest.setAllowedReferrers(Collections.singletonList("https://www.mywebsite.com"));
            String browserKey = checkoutApi.setupBrowserKey(keyRequest).getBrowserKey();

            System.out.println("<html lang=\"en\"><body><pre>");
            System.out.println(browserKey);
            System.out.println("</pre></body></html>");
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **browserKeyRequest** | [**CheckoutSetupBrowserKeyRequest**](CheckoutSetupBrowserKeyRequest.md)| Setup browser key request | |

### Return type

[**CheckoutSetupBrowserKeyResponse**](CheckoutSetupBrowserKeyResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="updateCart"></a>
# **updateCart**
> CartResponse updateCart(cart, expand)

Update cart

Update the cart. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.Cart;
import com.ultracart.admin.v2.models.CartItem;
import com.ultracart.admin.v2.models.CartItemOption;
import com.ultracart.admin.v2.models.CartResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UpdateCart {
    public static void execute() {
        // Reference Implementation: https://github.com/UltraCart/responsive_checkout

        // this example uses the getCart method as a starting point, because we must get a cart to update a cart.
        // this example is the same for both getCart and getCartByCartId. They work as a pair and are called
        // depending on the presence of an existing cart id or not. For new carts, getCart() is used. 
        // For existing carts, getCartByCartId(cart_id) is used.

        try {
            CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);

            String expansion = "items"; // for this example, we're just getting a cart to insert some items into it.

            // In Java web applications, you'd retrieve the cookie from the HttpServletRequest
            String cartId = null;
            // Example of how you might retrieve a cookie in a Servlet:
            // Cookie[] cookies = request.getCookies();
            // if (cookies != null) {
            //     for (Cookie cookie : cookies) {
            //         if (Constants.CART_ID_COOKIE_NAME.equals(cookie.getName())) {
            //             cartId = cookie.getValue();
            //             break;
            //         }
            //     }
            // }

            Cart cart;
            if (cartId == null) {
                CartResponse apiResponse = checkoutApi.getCart(expansion);
                cart = apiResponse.getCart();
            } else {
                CartResponse apiResponse = checkoutApi.getCartByCartId(cartId, expansion);
                cart = apiResponse.getCart();
            }

            // for this simple example, items will be added to the cart. so our expansion variable is simply 'items' above.
            // Get the items array on the cart, creating it if it doesn't exist.
            List<CartItem> items = cart.getItems();
            // If null, go ahead and initialize it to an empty list
            if (items == null) {
                items = new ArrayList<>();
            }

            // Create a new item
            CartItem item = new CartItem();
            item.setItemId("BASEBALL"); // TODO: Adjust the item id
            item.setQuantity(BigDecimal.valueOf(1)); // TODO: Adjust the quantity

            // TODO: If your item has options then you need to create a new CartItemOption object and add it to the list.
            List<CartItemOption> options = new ArrayList<>();
            item.setOptions(options);

            // Add the item to the items list
            items.add(item);

            // Make sure to update the cart with the new list
            cart.setItems(items);

            // Push the cart up to save the item
            CartResponse cartResponse = checkoutApi.updateCart(cart, expansion);

            // Extract the updated cart from the response
            cart = cartResponse.getCart();

            // TODO: set or re-set the cart cookie if this is part of a multi-page process. two weeks is a generous cart id time.
            // Example of how you might set a cookie in a Servlet:
            // Cookie cookie = new Cookie(Constants.CART_ID_COOKIE_NAME, cart.getCartId());
            // cookie.setMaxAge(14 * 24 * 60 * 60); // 2 weeks in seconds
            // cookie.setPath("/");
            // response.addCookie(cookie);

            System.out.println(cart.toString());

        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cart** | [**Cart**](Cart.md)| Cart | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartResponse**](CartResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="validateCart"></a>
# **validateCart**
> CartValidationResponse validateCart(validationRequest, expand)

Validate

Validate the cart for errors.  Specific checks can be passed and multiple validations can occur throughout your checkout flow. 

### Example

```java
package checkout;

import com.ultracart.admin.v2.CheckoutApi;
import com.ultracart.admin.v2.models.Cart;
import com.ultracart.admin.v2.models.CartValidationRequest;
import com.ultracart.admin.v2.models.CartValidationResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class ValidateCart {
  public static void execute() {
        /*
            This is a checkout api method. It can be used both server side or client side. This example is a server side
            call using a Simple API Key. See the JavaScript sdk samples if you wish to see a browser key implementation.

            validateCart passes a shopping cart to UltraCart for validation.
         */

    try {
      CheckoutApi checkoutApi = new CheckoutApi(Constants.API_KEY);
      String cartId = "123456789123456789123456789123456789"; // usually this would be retrieved from a session variable or cookie.

      String expansion = "items,billing,shipping,coupons,checkout,payment,summary,taxes";
      // Possible Expansion Variables: (see https://www.ultracart.com/api/#resource_checkout.html) also see getCart() example

      Cart cart = checkoutApi.getCartByCartId(cartId, expansion).getCart();

      CartValidationRequest validationRequest = new CartValidationRequest();
      validationRequest.setCart(cart);
      // validationRequest.setChecks(null); // leave this null for all validations
      // Possible Checks
            /*
            All,Advertising Source Provided,Billing Address Provided,
            Billing Destination Restriction,Billing Phone Numbers Provided,Billing State Abbreviation Valid,Billing Validate City State Zip,
            Coupon Zip Code Restriction,Credit Card Shipping Method Conflict,Customer Profile Does Not Exist.,CVV2 Not Required,
            Electronic Check Confirm Account Number,Email confirmed,Email provided if required,Gift Message Length,Item Quantity Valid,
            Item Restrictions,Items Present,Merchant Specific Item Relationships,One per customer violations,Options Provided,
            Payment Information Validate,Payment Method Provided,Payment Method Restriction,Pricing Tier Limits,Quantity requirements met,
            Referral Code Provided,Shipping Address Provided,Shipping Destination Restriction,Shipping Method Provided,
            Shipping Needs Recalculation,Shipping State Abbreviation Valid,Shipping Validate City State Zip,Special Instructions Length,
            Tax County Specified,Valid Delivery Date,Valid Ship On Date,Auth Test Credit Card
             */

      // This method also does an update in the process, so pass in a good expansion and grab the return cart variable.
      CartValidationResponse apiResponse = checkoutApi.validateCart(validationRequest, expansion);
      cart = apiResponse.getCart();

      System.out.println("<html lang=\"en\"><body><pre>");
      System.out.println("Validation Errors:");
      if (apiResponse.getErrors() != null) {
        for (String error : apiResponse.getErrors()) {
          System.out.println(error);
        }
      }
      System.out.println(cart.toString());
      System.out.println("</pre></body></html>");

    } catch (ApiException e) {
      e.printStackTrace();
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validationRequest** | [**CartValidationRequest**](CartValidationRequest.md)| Validation request | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CartValidationResponse**](CartValidationResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

