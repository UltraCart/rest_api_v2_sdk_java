# TaxApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTaxProviderSelfCity**](TaxApi.md#deleteTaxProviderSelfCity) | **DELETE** /tax/providers/self/city/{city} | Deletes a Self tax provider city |
| [**deleteTaxProviderSelfCountry**](TaxApi.md#deleteTaxProviderSelfCountry) | **DELETE** /tax/providers/self/country/{countryCode} | Deletes a Self tax provider country |
| [**deleteTaxProviderSelfCounty**](TaxApi.md#deleteTaxProviderSelfCounty) | **DELETE** /tax/providers/self/county/{county} | Deletes a Self tax provider county |
| [**deleteTaxProviderSelfPostalCode**](TaxApi.md#deleteTaxProviderSelfPostalCode) | **DELETE** /tax/providers/self/postalCode/{postal_code} | Deletes a Self tax provider postalCode |
| [**deleteTaxProviderSelfState**](TaxApi.md#deleteTaxProviderSelfState) | **DELETE** /tax/providers/self/state/{stateCode} | Deletes a Self tax provider state |
| [**getTaxProviderAvalara**](TaxApi.md#getTaxProviderAvalara) | **GET** /tax/providers/avalara | Retrieve the Avalara tax provider |
| [**getTaxProviderAvalaraCompanies**](TaxApi.md#getTaxProviderAvalaraCompanies) | **POST** /tax/providers/avalara/companies | Returns Avalara Tax companies configured by the merchant |
| [**getTaxProviderAvalaraTest**](TaxApi.md#getTaxProviderAvalaraTest) | **GET** /tax/providers/avalara/test | Attempts to connect to Avalara and returns back the response |
| [**getTaxProviderSelf**](TaxApi.md#getTaxProviderSelf) | **GET** /tax/providers/self | Retrieve the Self tax provider |
| [**getTaxProviderSelfCountries**](TaxApi.md#getTaxProviderSelfCountries) | **GET** /tax/providers/self/countries | Retrieve the Self tax provider countries |
| [**getTaxProviderSelfRegionsByCountryCode**](TaxApi.md#getTaxProviderSelfRegionsByCountryCode) | **GET** /tax/providers/self/regions/{countryCode} | Retrieve the Self tax provider regions for a given country code |
| [**getTaxProviderSovos**](TaxApi.md#getTaxProviderSovos) | **GET** /tax/providers/sovos | Retrieve the Sovos tax provider |
| [**getTaxProviderSovosTest**](TaxApi.md#getTaxProviderSovosTest) | **GET** /tax/providers/sovos/test | Attempts to connect to Sovos and returns back the response |
| [**getTaxProviderTaxJar**](TaxApi.md#getTaxProviderTaxJar) | **GET** /tax/providers/taxjar | Retrieve the TaxJar tax provider |
| [**getTaxProviderTaxJarTest**](TaxApi.md#getTaxProviderTaxJarTest) | **GET** /tax/providers/taxjar/test | Attempts to connect to TaxJar and returns back the response |
| [**getTaxProviderUltraCart**](TaxApi.md#getTaxProviderUltraCart) | **GET** /tax/providers/ultracart | Retrieve the UltraCart tax provider |
| [**getTaxProviders**](TaxApi.md#getTaxProviders) | **GET** /tax/providers | Retrieve tax methods |
| [**setActiveTaxProvider**](TaxApi.md#setActiveTaxProvider) | **POST** /tax/providers/setActive/{providerName} | Toggle a tax provider to active |
| [**updateTaxProviderAvalara**](TaxApi.md#updateTaxProviderAvalara) | **POST** /tax/providers/avalara | Update the Avalara tax provider |
| [**updateTaxProviderSelf**](TaxApi.md#updateTaxProviderSelf) | **POST** /tax/providers/self | Update the Self tax provider |
| [**updateTaxProviderSelfCity**](TaxApi.md#updateTaxProviderSelfCity) | **POST** /tax/providers/self/city/{city} | Updates a Self tax provider city |
| [**updateTaxProviderSelfCountry**](TaxApi.md#updateTaxProviderSelfCountry) | **POST** /tax/providers/self/country/{countryCode} | Updates a Self tax provider country |
| [**updateTaxProviderSelfCounty**](TaxApi.md#updateTaxProviderSelfCounty) | **POST** /tax/providers/self/county/{county} | Updates a Self tax provider county |
| [**updateTaxProviderSelfPostalCode**](TaxApi.md#updateTaxProviderSelfPostalCode) | **POST** /tax/providers/self/postalCode/{postal_code} | Updates a Self tax provider postalCode |
| [**updateTaxProviderSelfState**](TaxApi.md#updateTaxProviderSelfState) | **POST** /tax/providers/self/state/{stateCode} | Updates a Self tax provider state |
| [**updateTaxProviderSovos**](TaxApi.md#updateTaxProviderSovos) | **POST** /tax/providers/sovos | Update the Sovos tax provider |
| [**updateTaxProviderTaxJar**](TaxApi.md#updateTaxProviderTaxJar) | **POST** /tax/providers/taxjar | Update the TaxJar tax provider |
| [**updateTaxProviderUltraCart**](TaxApi.md#updateTaxProviderUltraCart) | **POST** /tax/providers/ultracart | Update the UltraCart tax provider |


<a name="deleteTaxProviderSelfCity"></a>
# **deleteTaxProviderSelfCity**
> deleteTaxProviderSelfCity(city, taxCity)

Deletes a Self tax provider city

Deletes a Self tax provider city. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String city = "city_example"; // String | The city being deleted.
TaxCity taxCity = new TaxCity(); // TaxCity | tax city to be deleted
try {
    apiInstance.deleteTaxProviderSelfCity(citytaxCity);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#deleteTaxProviderSelfCity");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **city** | **String**| The city being deleted. | |
| **taxCity** | [**TaxCity**](TaxCity.md)| tax city to be deleted | |

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

<a name="deleteTaxProviderSelfCountry"></a>
# **deleteTaxProviderSelfCountry**
> deleteTaxProviderSelfCountry(countryCode, taxCountry)

Deletes a Self tax provider country

Deletes a Self tax provider country. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String countryCode = "countryCode_example"; // String | The country code being deleted.
TaxCountry taxCountry = new TaxCountry(); // TaxCountry | tax country to be deleted
try {
    apiInstance.deleteTaxProviderSelfCountry(countryCodetaxCountry);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#deleteTaxProviderSelfCountry");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**| The country code being deleted. | |
| **taxCountry** | [**TaxCountry**](TaxCountry.md)| tax country to be deleted | |

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

<a name="deleteTaxProviderSelfCounty"></a>
# **deleteTaxProviderSelfCounty**
> deleteTaxProviderSelfCounty(county, taxCounty)

Deletes a Self tax provider county

Deletes a Self tax provider county. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String county = "county_example"; // String | The county being deleted.
TaxCounty taxCounty = new TaxCounty(); // TaxCounty | tax county to be deleted
try {
    apiInstance.deleteTaxProviderSelfCounty(countytaxCounty);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#deleteTaxProviderSelfCounty");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **county** | **String**| The county being deleted. | |
| **taxCounty** | [**TaxCounty**](TaxCounty.md)| tax county to be deleted | |

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

<a name="deleteTaxProviderSelfPostalCode"></a>
# **deleteTaxProviderSelfPostalCode**
> deleteTaxProviderSelfPostalCode(postalCode, taxPostalCode)

Deletes a Self tax provider postalCode

Deletes a Self tax provider postalCode. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String postalCode = "postalCode_example"; // String | The postal code being deleted.
TaxPostalCode taxPostalCode = new TaxPostalCode(); // TaxPostalCode | tax postal code to be deleted
try {
    apiInstance.deleteTaxProviderSelfPostalCode(postalCodetaxPostalCode);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#deleteTaxProviderSelfPostalCode");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postalCode** | **String**| The postal code being deleted. | |
| **taxPostalCode** | [**TaxPostalCode**](TaxPostalCode.md)| tax postal code to be deleted | |

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

<a name="deleteTaxProviderSelfState"></a>
# **deleteTaxProviderSelfState**
> deleteTaxProviderSelfState(stateCode, taxState)

Deletes a Self tax provider state

Deletes a Self tax provider state. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String stateCode = "stateCode_example"; // String | The state code being deleted.
TaxState taxState = new TaxState(); // TaxState | tax state to be deleted
try {
    apiInstance.deleteTaxProviderSelfState(stateCodetaxState);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#deleteTaxProviderSelfState");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateCode** | **String**| The state code being deleted. | |
| **taxState** | [**TaxState**](TaxState.md)| tax state to be deleted | |

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

<a name="getTaxProviderAvalara"></a>
# **getTaxProviderAvalara**
> TaxProviderAvalara getTaxProviderAvalara()

Retrieve the Avalara tax provider

Retrieves the Avalara tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderAvalara result = apiInstance.getTaxProviderAvalara();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderAvalara");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderAvalara**](TaxProviderAvalara.md)

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

<a name="getTaxProviderAvalaraCompanies"></a>
# **getTaxProviderAvalaraCompanies**
> TaxProviderAvalaraCompaniesResult getTaxProviderAvalaraCompanies(taxProviderAvalara)

Returns Avalara Tax companies configured by the merchant

Returns Avalara Tax companies configured by the merchant 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

TaxProviderAvalara taxProviderAvalara = new TaxProviderAvalara(); // TaxProviderAvalara | TaxProviderAvalara object
try {
    TaxProviderAvalaraCompaniesResult result = apiInstance.getTaxProviderAvalaraCompanies(taxProviderAvalara);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderAvalaraCompanies");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taxProviderAvalara** | [**TaxProviderAvalara**](TaxProviderAvalara.md)| TaxProviderAvalara object | |

### Return type

[**TaxProviderAvalaraCompaniesResult**](TaxProviderAvalaraCompaniesResult.md)

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

<a name="getTaxProviderAvalaraTest"></a>
# **getTaxProviderAvalaraTest**
> TaxProviderTestResult getTaxProviderAvalaraTest()

Attempts to connect to Avalara and returns back the response

Attempts to connect to Avalara and returns back the response. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderTestResult result = apiInstance.getTaxProviderAvalaraTest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderAvalaraTest");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderTestResult**](TaxProviderTestResult.md)

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

<a name="getTaxProviderSelf"></a>
# **getTaxProviderSelf**
> TaxProviderSelf getTaxProviderSelf()

Retrieve the Self tax provider

Retrieves the Self tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderSelf result = apiInstance.getTaxProviderSelf();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderSelf");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderSelf**](TaxProviderSelf.md)

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

<a name="getTaxProviderSelfCountries"></a>
# **getTaxProviderSelfCountries**
> TaxProviderSelfCountriesResponse getTaxProviderSelfCountries()

Retrieve the Self tax provider countries

Retrieves the Self tax provider countries. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderSelfCountriesResponse result = apiInstance.getTaxProviderSelfCountries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderSelfCountries");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderSelfCountriesResponse**](TaxProviderSelfCountriesResponse.md)

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

<a name="getTaxProviderSelfRegionsByCountryCode"></a>
# **getTaxProviderSelfRegionsByCountryCode**
> TaxProviderSelfRegionsResponse getTaxProviderSelfRegionsByCountryCode(countryCode)

Retrieve the Self tax provider regions for a given country code

Retrieves the Self tax provider regions for a given country code. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String countryCode = "countryCode_example"; // String | The country code regions desired.
try {
    TaxProviderSelfRegionsResponse result = apiInstance.getTaxProviderSelfRegionsByCountryCode(countryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderSelfRegionsByCountryCode");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**| The country code regions desired. | |

### Return type

[**TaxProviderSelfRegionsResponse**](TaxProviderSelfRegionsResponse.md)

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

<a name="getTaxProviderSovos"></a>
# **getTaxProviderSovos**
> TaxProviderSovos getTaxProviderSovos()

Retrieve the Sovos tax provider

Retrieves the Sovos tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderSovos result = apiInstance.getTaxProviderSovos();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderSovos");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderSovos**](TaxProviderSovos.md)

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

<a name="getTaxProviderSovosTest"></a>
# **getTaxProviderSovosTest**
> TaxProviderTestResult getTaxProviderSovosTest()

Attempts to connect to Sovos and returns back the response

Attempts to connect to Sovos and returns back the response. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderTestResult result = apiInstance.getTaxProviderSovosTest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderSovosTest");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderTestResult**](TaxProviderTestResult.md)

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

<a name="getTaxProviderTaxJar"></a>
# **getTaxProviderTaxJar**
> TaxProviderTaxJar getTaxProviderTaxJar()

Retrieve the TaxJar tax provider

Retrieves the TaxJar tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderTaxJar result = apiInstance.getTaxProviderTaxJar();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderTaxJar");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderTaxJar**](TaxProviderTaxJar.md)

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

<a name="getTaxProviderTaxJarTest"></a>
# **getTaxProviderTaxJarTest**
> TaxProviderTestResult getTaxProviderTaxJarTest()

Attempts to connect to TaxJar and returns back the response

Attempts to connect to TaxJar and returns back the response. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderTestResult result = apiInstance.getTaxProviderTaxJarTest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderTaxJarTest");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderTestResult**](TaxProviderTestResult.md)

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

<a name="getTaxProviderUltraCart"></a>
# **getTaxProviderUltraCart**
> TaxProviderUltraCart getTaxProviderUltraCart()

Retrieve the UltraCart tax provider

Retrieves the UltraCart tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    TaxProviderUltraCart result = apiInstance.getTaxProviderUltraCart();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviderUltraCart");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**TaxProviderUltraCart**](TaxProviderUltraCart.md)

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

<a name="getTaxProviders"></a>
# **getTaxProviders**
> TaxProvidersResponse getTaxProviders(limit, offset, expand)

Retrieve tax methods

Retrieves tax methods for this account. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    TaxProvidersResponse result = apiInstance.getTaxProviders(limitoffsetexpand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#getTaxProviders");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**TaxProvidersResponse**](TaxProvidersResponse.md)

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

<a name="setActiveTaxProvider"></a>
# **setActiveTaxProvider**
> TaxProviderActivateResult setActiveTaxProvider(providerName)

Toggle a tax provider to active

Toggle a tax provider to active. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String providerName = "providerName_example"; // String | The tax provider to set active.
try {
    TaxProviderActivateResult result = apiInstance.setActiveTaxProvider(providerName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#setActiveTaxProvider");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **providerName** | **String**| The tax provider to set active. | |

### Return type

[**TaxProviderActivateResult**](TaxProviderActivateResult.md)

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

<a name="updateTaxProviderAvalara"></a>
# **updateTaxProviderAvalara**
> TaxProviderAvalara updateTaxProviderAvalara(taxProviderAvalara)

Update the Avalara tax provider

Update the Avalara tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

TaxProviderAvalara taxProviderAvalara = new TaxProviderAvalara(); // TaxProviderAvalara | TaxProviderAvalara object
try {
    TaxProviderAvalara result = apiInstance.updateTaxProviderAvalara(taxProviderAvalara);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderAvalara");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taxProviderAvalara** | [**TaxProviderAvalara**](TaxProviderAvalara.md)| TaxProviderAvalara object | |

### Return type

[**TaxProviderAvalara**](TaxProviderAvalara.md)

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

<a name="updateTaxProviderSelf"></a>
# **updateTaxProviderSelf**
> TaxProviderSelf updateTaxProviderSelf(taxProviderSelf)

Update the Self tax provider

Update the Self tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

TaxProviderSelf taxProviderSelf = new TaxProviderSelf(); // TaxProviderSelf | TaxProviderSelf object
try {
    TaxProviderSelf result = apiInstance.updateTaxProviderSelf(taxProviderSelf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderSelf");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taxProviderSelf** | [**TaxProviderSelf**](TaxProviderSelf.md)| TaxProviderSelf object | |

### Return type

[**TaxProviderSelf**](TaxProviderSelf.md)

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

<a name="updateTaxProviderSelfCity"></a>
# **updateTaxProviderSelfCity**
> TaxCity updateTaxProviderSelfCity(city, taxCity)

Updates a Self tax provider city

Updates a Self tax provider city. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String city = "city_example"; // String | The city being updated.
TaxCity taxCity = new TaxCity(); // TaxCity | tax city to be updated
try {
    TaxCity result = apiInstance.updateTaxProviderSelfCity(citytaxCity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderSelfCity");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **city** | **String**| The city being updated. | |
| **taxCity** | [**TaxCity**](TaxCity.md)| tax city to be updated | |

### Return type

[**TaxCity**](TaxCity.md)

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

<a name="updateTaxProviderSelfCountry"></a>
# **updateTaxProviderSelfCountry**
> TaxCountry updateTaxProviderSelfCountry(countryCode, taxCountry)

Updates a Self tax provider country

Updates a Self tax provider country. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String countryCode = "countryCode_example"; // String | The country code being updated.
TaxCountry taxCountry = new TaxCountry(); // TaxCountry | tax country to be updated
try {
    TaxCountry result = apiInstance.updateTaxProviderSelfCountry(countryCodetaxCountry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderSelfCountry");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryCode** | **String**| The country code being updated. | |
| **taxCountry** | [**TaxCountry**](TaxCountry.md)| tax country to be updated | |

### Return type

[**TaxCountry**](TaxCountry.md)

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

<a name="updateTaxProviderSelfCounty"></a>
# **updateTaxProviderSelfCounty**
> TaxCounty updateTaxProviderSelfCounty(county, taxCounty)

Updates a Self tax provider county

Updates a Self tax provider county. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String county = "county_example"; // String | The county being updated.
TaxCounty taxCounty = new TaxCounty(); // TaxCounty | tax county to be updated
try {
    TaxCounty result = apiInstance.updateTaxProviderSelfCounty(countytaxCounty);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderSelfCounty");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **county** | **String**| The county being updated. | |
| **taxCounty** | [**TaxCounty**](TaxCounty.md)| tax county to be updated | |

### Return type

[**TaxCounty**](TaxCounty.md)

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

<a name="updateTaxProviderSelfPostalCode"></a>
# **updateTaxProviderSelfPostalCode**
> TaxPostalCode updateTaxProviderSelfPostalCode(postalCode, taxPostalCode)

Updates a Self tax provider postalCode

Updates a Self tax provider postalCode. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String postalCode = "postalCode_example"; // String | The postal code being updated.
TaxPostalCode taxPostalCode = new TaxPostalCode(); // TaxPostalCode | tax postal code to be updated
try {
    TaxPostalCode result = apiInstance.updateTaxProviderSelfPostalCode(postalCodetaxPostalCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderSelfPostalCode");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postalCode** | **String**| The postal code being updated. | |
| **taxPostalCode** | [**TaxPostalCode**](TaxPostalCode.md)| tax postal code to be updated | |

### Return type

[**TaxPostalCode**](TaxPostalCode.md)

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

<a name="updateTaxProviderSelfState"></a>
# **updateTaxProviderSelfState**
> TaxState updateTaxProviderSelfState(stateCode, taxState)

Updates a Self tax provider state

Updates a Self tax provider state. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String stateCode = "stateCode_example"; // String | The state code being updated.
TaxState taxState = new TaxState(); // TaxState | tax state to be updated
try {
    TaxState result = apiInstance.updateTaxProviderSelfState(stateCodetaxState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderSelfState");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateCode** | **String**| The state code being updated. | |
| **taxState** | [**TaxState**](TaxState.md)| tax state to be updated | |

### Return type

[**TaxState**](TaxState.md)

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

<a name="updateTaxProviderSovos"></a>
# **updateTaxProviderSovos**
> TaxProviderSovos updateTaxProviderSovos(taxProviderSovos)

Update the Sovos tax provider

Update the Sovos tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

TaxProviderSovos taxProviderSovos = new TaxProviderSovos(); // TaxProviderSovos | TaxProviderSovos object
try {
    TaxProviderSovos result = apiInstance.updateTaxProviderSovos(taxProviderSovos);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderSovos");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taxProviderSovos** | [**TaxProviderSovos**](TaxProviderSovos.md)| TaxProviderSovos object | |

### Return type

[**TaxProviderSovos**](TaxProviderSovos.md)

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

<a name="updateTaxProviderTaxJar"></a>
# **updateTaxProviderTaxJar**
> TaxProviderTaxJar updateTaxProviderTaxJar(taxProviderTaxJar)

Update the TaxJar tax provider

Update the TaxJar tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

TaxProviderTaxJar taxProviderTaxJar = new TaxProviderTaxJar(); // TaxProviderTaxJar | TaxProviderTaxJar object
try {
    TaxProviderTaxJar result = apiInstance.updateTaxProviderTaxJar(taxProviderTaxJar);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderTaxJar");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taxProviderTaxJar** | [**TaxProviderTaxJar**](TaxProviderTaxJar.md)| TaxProviderTaxJar object | |

### Return type

[**TaxProviderTaxJar**](TaxProviderTaxJar.md)

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

<a name="updateTaxProviderUltraCart"></a>
# **updateTaxProviderUltraCart**
> TaxProviderUltraCart updateTaxProviderUltraCart(taxProviderUltracart)

Update the UltraCart tax provider

Update the UltraCart tax provider. 

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
import com.ultracart.admin.v2.TaxApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
TaxApi apiInstance = new TaxApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

TaxProviderUltraCart taxProviderUltracart = new TaxProviderUltraCart(); // TaxProviderUltraCart | TaxProviderUltraCart object
try {
    TaxProviderUltraCart result = apiInstance.updateTaxProviderUltraCart(taxProviderUltracart);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TaxApi#updateTaxProviderUltraCart");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **taxProviderUltracart** | [**TaxProviderUltraCart**](TaxProviderUltraCart.md)| TaxProviderUltraCart object | |

### Return type

[**TaxProviderUltraCart**](TaxProviderUltraCart.md)

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

