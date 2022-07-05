# CouponApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCoupon**](CouponApi.md#deleteCoupon) | **DELETE** /coupon/coupons/{coupon_oid} | Delete a coupon |
| [**deleteCouponsByCode**](CouponApi.md#deleteCouponsByCode) | **DELETE** /coupon/coupons/by_code | Deletes multiple coupons |
| [**deleteCouponsByOid**](CouponApi.md#deleteCouponsByOid) | **DELETE** /coupon/coupons/by_oid | Deletes multiple coupons |
| [**doesCouponCodeExist**](CouponApi.md#doesCouponCodeExist) | **GET** /coupon/coupons/merchant_code/{merchant_code}/exists | Determines if a coupon merchant code already exists |
| [**generateCouponCodes**](CouponApi.md#generateCouponCodes) | **POST** /coupon/coupons/{coupon_oid}/generate_codes | Generates one time codes for a coupon |
| [**generateOneTimeCodesByMerchantCode**](CouponApi.md#generateOneTimeCodesByMerchantCode) | **POST** /coupon/coupons/merchant_code/{merchant_code}/generate_codes | Generates one time codes by merchant code |
| [**getAutoApply**](CouponApi.md#getAutoApply) | **GET** /coupon/auto_apply | Retrieve auto apply rules and conditions |
| [**getCoupon**](CouponApi.md#getCoupon) | **GET** /coupon/coupons/{coupon_oid} | Retrieve a coupon |
| [**getCouponByMerchantCode**](CouponApi.md#getCouponByMerchantCode) | **GET** /coupon/coupons/merchant_code/{merchant_code} | Retrieve a coupon by merchant code |
| [**getCoupons**](CouponApi.md#getCoupons) | **GET** /coupon/coupons | Retrieve coupons |
| [**getCouponsByQuery**](CouponApi.md#getCouponsByQuery) | **POST** /coupon/coupons/query | Retrieve coupons by query |
| [**getEditorValues**](CouponApi.md#getEditorValues) | **GET** /coupon/editor_values | Retrieve values needed for a coupon editor |
| [**insertCoupon**](CouponApi.md#insertCoupon) | **POST** /coupon/coupons | Insert a coupon |
| [**insertCoupons**](CouponApi.md#insertCoupons) | **POST** /coupon/coupons/batch | Insert multiple coupons |
| [**searchItems**](CouponApi.md#searchItems) | **GET** /coupon/searchItems | Searches for items to display within a coupon editor and assign to coupons |
| [**updateAutoApply**](CouponApi.md#updateAutoApply) | **POST** /coupon/auto_apply | Update auto apply rules and conditions |
| [**updateCoupon**](CouponApi.md#updateCoupon) | **PUT** /coupon/coupons/{coupon_oid} | Update a coupon |
| [**updateCoupons**](CouponApi.md#updateCoupons) | **PUT** /coupon/coupons/batch | Update multiple coupons |
| [**uploadCouponCodes**](CouponApi.md#uploadCouponCodes) | **POST** /coupon/coupons/{coupon_oid}/upload_codes | Upload one-time codes for a coupon |


<a name="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(couponOid)

Delete a coupon

Delete a coupon on the UltraCart account. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer couponOid = 56; // Integer | The coupon_oid to delete.
try {
    apiInstance.deleteCoupon(couponOid);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#deleteCoupon");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon_oid to delete. | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="deleteCouponsByCode"></a>
# **deleteCouponsByCode**
> deleteCouponsByCode(couponDeleteRequest)

Deletes multiple coupons

Delete coupons on the UltraCart account. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

CouponDeletesRequest couponDeleteRequest = new CouponDeletesRequest(); // CouponDeletesRequest | Coupon oids to delete
try {
    apiInstance.deleteCouponsByCode(couponDeleteRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#deleteCouponsByCode");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponDeleteRequest** | [**CouponDeletesRequest**](CouponDeletesRequest.md)| Coupon oids to delete | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="deleteCouponsByOid"></a>
# **deleteCouponsByOid**
> deleteCouponsByOid(couponDeleteRequest)

Deletes multiple coupons

Delete coupons on the UltraCart account. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

CouponDeletesRequest couponDeleteRequest = new CouponDeletesRequest(); // CouponDeletesRequest | Coupon oids to delete
try {
    apiInstance.deleteCouponsByOid(couponDeleteRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#deleteCouponsByOid");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponDeleteRequest** | [**CouponDeletesRequest**](CouponDeletesRequest.md)| Coupon oids to delete | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="doesCouponCodeExist"></a>
# **doesCouponCodeExist**
> CouponExistsResponse doesCouponCodeExist(merchantCode)

Determines if a coupon merchant code already exists

Determines if a coupon merchant code already exists. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String merchantCode = "merchantCode_example"; // String | The coupon merchant code to examine.
try {
    CouponExistsResponse result = apiInstance.doesCouponCodeExist(merchantCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#doesCouponCodeExist");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantCode** | **String**| The coupon merchant code to examine. | |

### Return type

[**CouponExistsResponse**](CouponExistsResponse.md)

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

<a name="generateCouponCodes"></a>
# **generateCouponCodes**
> CouponCodesResponse generateCouponCodes(couponOid, couponCodesRequest)

Generates one time codes for a coupon

Generate one time codes for a coupon 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer couponOid = 56; // Integer | The coupon oid to generate codes.
CouponCodesRequest couponCodesRequest = new CouponCodesRequest(); // CouponCodesRequest | Coupon code generation parameters
try {
    CouponCodesResponse result = apiInstance.generateCouponCodes(couponOidcouponCodesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#generateCouponCodes");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon oid to generate codes. | |
| **couponCodesRequest** | [**CouponCodesRequest**](CouponCodesRequest.md)| Coupon code generation parameters | |

### Return type

[**CouponCodesResponse**](CouponCodesResponse.md)

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

<a name="generateOneTimeCodesByMerchantCode"></a>
# **generateOneTimeCodesByMerchantCode**
> CouponCodesResponse generateOneTimeCodesByMerchantCode(merchantCode, couponCodesRequest)

Generates one time codes by merchant code

Generate one time codes by merchant code 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String merchantCode = "merchantCode_example"; // String | The merchant code to generate one time codes.
CouponCodesRequest couponCodesRequest = new CouponCodesRequest(); // CouponCodesRequest | Coupon code generation parameters
try {
    CouponCodesResponse result = apiInstance.generateOneTimeCodesByMerchantCode(merchantCodecouponCodesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#generateOneTimeCodesByMerchantCode");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantCode** | **String**| The merchant code to generate one time codes. | |
| **couponCodesRequest** | [**CouponCodesRequest**](CouponCodesRequest.md)| Coupon code generation parameters | |

### Return type

[**CouponCodesResponse**](CouponCodesResponse.md)

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

<a name="getAutoApply"></a>
# **getAutoApply**
> CouponAutoApplyConditions getAutoApply()

Retrieve auto apply rules and conditions

Retrieve auto apply rules and conditions 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    CouponAutoApplyConditions result = apiInstance.getAutoApply();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#getAutoApply");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**CouponAutoApplyConditions**](CouponAutoApplyConditions.md)

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

<a name="getCoupon"></a>
# **getCoupon**
> CouponResponse getCoupon(couponOid, expand)

Retrieve a coupon

Retrieves a single coupon using the specified coupon profile oid. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer couponOid = 56; // Integer | The coupon oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CouponResponse result = apiInstance.getCoupon(couponOidexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#getCoupon");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponResponse**](CouponResponse.md)

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

<a name="getCouponByMerchantCode"></a>
# **getCouponByMerchantCode**
> CouponResponse getCouponByMerchantCode(merchantCode, expand)

Retrieve a coupon by merchant code

Retrieves a single coupon using the specified merchant code. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String merchantCode = "merchantCode_example"; // String | The coupon merchant code to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CouponResponse result = apiInstance.getCouponByMerchantCode(merchantCodeexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#getCouponByMerchantCode");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantCode** | **String**| The coupon merchant code to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponResponse**](CouponResponse.md)

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

<a name="getCoupons"></a>
# **getCoupons**
> CouponsResponse getCoupons(merchantCode, description, couponType, startDateBegin, startDateEnd, expirationDateBegin, expirationDateEnd, affiliateOid, excludeExpired, limit, offset, sort, expand)

Retrieve coupons

Retrieves coupons for this account.  If no parameters are specified, all coupons will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String merchantCode = "merchantCode_example"; // String | Merchant code
String description = "description_example"; // String | Description
String couponType = "couponType_example"; // String | Coupon type
String startDateBegin = "startDateBegin_example"; // String | Start date begin
String startDateEnd = "startDateEnd_example"; // String | Start date end
String expirationDateBegin = "expirationDateBegin_example"; // String | Expiration date begin
String expirationDateEnd = "expirationDateEnd_example"; // String | Expiration date end
Integer affiliateOid = 56; // Integer | Affiliate oid
Boolean excludeExpired = true; // Boolean | Exclude expired
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the coupons.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CouponsResponse result = apiInstance.getCoupons(merchantCodedescriptioncouponTypestartDateBeginstartDateEndexpirationDateBeginexpirationDateEndaffiliateOidexcludeExpiredlimitoffsetsortexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#getCoupons");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantCode** | **String**| Merchant code | [optional] |
| **description** | **String**| Description | [optional] |
| **couponType** | **String**| Coupon type | [optional] |
| **startDateBegin** | **String**| Start date begin | [optional] |
| **startDateEnd** | **String**| Start date end | [optional] |
| **expirationDateBegin** | **String**| Expiration date begin | [optional] |
| **expirationDateEnd** | **String**| Expiration date end | [optional] |
| **affiliateOid** | **Integer**| Affiliate oid | [optional] |
| **excludeExpired** | **Boolean**| Exclude expired | [optional] |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the coupons.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponsResponse**](CouponsResponse.md)

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

<a name="getCouponsByQuery"></a>
# **getCouponsByQuery**
> CouponsResponse getCouponsByQuery(couponQuery, limit, offset, sort, expand)

Retrieve coupons by query

Retrieves coupons from the account.  If no parameters are specified, all coupons will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

CouponQuery couponQuery = new CouponQuery(); // CouponQuery | Coupon query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the coupons.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CouponsResponse result = apiInstance.getCouponsByQuery(couponQuerylimitoffsetsortexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#getCouponsByQuery");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponQuery** | [**CouponQuery**](CouponQuery.md)| Coupon query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the coupons.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponsResponse**](CouponsResponse.md)

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

<a name="getEditorValues"></a>
# **getEditorValues**
> CouponEditorValues getEditorValues()

Retrieve values needed for a coupon editor

Retrieve values needed for a coupon editor 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    CouponEditorValues result = apiInstance.getEditorValues();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#getEditorValues");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**CouponEditorValues**](CouponEditorValues.md)

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

<a name="insertCoupon"></a>
# **insertCoupon**
> CouponResponse insertCoupon(coupon, expand)

Insert a coupon

Insert a coupon on the UltraCart account. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Coupon coupon = new Coupon(); // Coupon | Coupon to insert
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CouponResponse result = apiInstance.insertCoupon(couponexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#insertCoupon");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coupon** | [**Coupon**](Coupon.md)| Coupon to insert | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponResponse**](CouponResponse.md)

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

<a name="insertCoupons"></a>
# **insertCoupons**
> CouponsResponse insertCoupons(couponsRequest, expand, placeholders)

Insert multiple coupons

Insert multiple coupon on the UltraCart account. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

CouponsRequest couponsRequest = new CouponsRequest(); // CouponsRequest | Coupons to insert (maximum 50)
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    CouponsResponse result = apiInstance.insertCoupons(couponsRequestexpandplaceholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#insertCoupons");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponsRequest** | [**CouponsRequest**](CouponsRequest.md)| Coupons to insert (maximum 50) | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**CouponsResponse**](CouponsResponse.md)

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

<a name="searchItems"></a>
# **searchItems**
> CouponItemSearchResultsResponse searchItems(s, m)

Searches for items to display within a coupon editor and assign to coupons

Searches for items to display within a coupon editor and assign to coupons 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String s = "s_example"; // String | 
Integer m = 56; // Integer | 
try {
    CouponItemSearchResultsResponse result = apiInstance.searchItems(sm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#searchItems");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **s** | **String**|  | [optional] |
| **m** | **Integer**|  | [optional] |

### Return type

[**CouponItemSearchResultsResponse**](CouponItemSearchResultsResponse.md)

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

<a name="updateAutoApply"></a>
# **updateAutoApply**
> updateAutoApply(conditions)

Update auto apply rules and conditions

Update auto apply rules and conditions 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

CouponAutoApplyConditions conditions = new CouponAutoApplyConditions(); // CouponAutoApplyConditions | Conditions
try {
    apiInstance.updateAutoApply(conditions);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#updateAutoApply");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conditions** | [**CouponAutoApplyConditions**](CouponAutoApplyConditions.md)| Conditions | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="updateCoupon"></a>
# **updateCoupon**
> CouponResponse updateCoupon(couponOid, coupon, expand)

Update a coupon

Update a coupon on the UltraCart account. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer couponOid = 56; // Integer | The coupon_oid to update.
Coupon coupon = new Coupon(); // Coupon | Coupon to update
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CouponResponse result = apiInstance.updateCoupon(couponOidcouponexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#updateCoupon");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon_oid to update. | |
| **coupon** | [**Coupon**](Coupon.md)| Coupon to update | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponResponse**](CouponResponse.md)

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

<a name="updateCoupons"></a>
# **updateCoupons**
> CouponsResponse updateCoupons(couponsRequest, expand, placeholders, async)

Update multiple coupons

Update multiple coupon on the UltraCart account. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

CouponsRequest couponsRequest = new CouponsRequest(); // CouponsRequest | Coupons to update (synchronous maximum 50 / asynchronous maximum 100)
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
Boolean async = true; // Boolean | True if the operation should be run async.  No result returned
try {
    CouponsResponse result = apiInstance.updateCoupons(couponsRequestexpandplaceholdersasync);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#updateCoupons");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponsRequest** | [**CouponsRequest**](CouponsRequest.md)| Coupons to update (synchronous maximum 50 / asynchronous maximum 100) | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |
| **async** | **Boolean**| True if the operation should be run async.  No result returned | [optional] |

### Return type

[**CouponsResponse**](CouponsResponse.md)

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

<a name="uploadCouponCodes"></a>
# **uploadCouponCodes**
> UploadCouponCodesResponse uploadCouponCodes(couponOid, uploadCouponCodesRequest)

Upload one-time codes for a coupon

Upload one-time codes for a coupon 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.CouponApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
CouponApi apiInstance = new CouponApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer couponOid = 56; // Integer | The coupon oid to associate with the provided one-time codes.
UploadCouponCodesRequest uploadCouponCodesRequest = new UploadCouponCodesRequest(); // UploadCouponCodesRequest | One-time coupon codes
try {
    UploadCouponCodesResponse result = apiInstance.uploadCouponCodes(couponOiduploadCouponCodesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CouponApi#uploadCouponCodes");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon oid to associate with the provided one-time codes. | |
| **uploadCouponCodesRequest** | [**UploadCouponCodesRequest**](UploadCouponCodesRequest.md)| One-time coupon codes | |

### Return type

[**UploadCouponCodesResponse**](UploadCouponCodesResponse.md)

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

