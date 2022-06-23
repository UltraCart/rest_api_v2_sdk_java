# GiftCertificateApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addGiftCertificateLedgerEntry**](GiftCertificateApi.md#addGiftCertificateLedgerEntry) | **POST** /gift_certificate/gift_certificates/{gift_certificate_oid}/ledger_entry | Add a gift certificate ledger entry |
| [**createGiftCertificate**](GiftCertificateApi.md#createGiftCertificate) | **POST** /gift_certificate/gift_certificates | Create a gift certificate |
| [**deleteGiftCertificate**](GiftCertificateApi.md#deleteGiftCertificate) | **DELETE** /gift_certificate/gift_certificates/{gift_certificate_oid} | Delete a gift certificate |
| [**getGiftCertificateByCode**](GiftCertificateApi.md#getGiftCertificateByCode) | **POST** /gift_certificate/gift_certificates/by_code/{code} | Retrieve gift certificate by code |
| [**getGiftCertificateByOid**](GiftCertificateApi.md#getGiftCertificateByOid) | **POST** /gift_certificate/gift_certificates/{gift_certificate_oid} | Retrieve gift certificate by oid |
| [**getGiftCertificatesByEmail**](GiftCertificateApi.md#getGiftCertificatesByEmail) | **POST** /gift_certificate/gift_certificates/by_email/{email} | Retrieve gift certificate by email |
| [**getGiftCertificatesByQuery**](GiftCertificateApi.md#getGiftCertificatesByQuery) | **POST** /gift_certificate/gift_certificates/query | Retrieve gift certificates by query |
| [**updateGiftCertificate**](GiftCertificateApi.md#updateGiftCertificate) | **PUT** /gift_certificate/gift_certificates/{gift_certificate_oid} | Update a gift certificate |


<a name="addGiftCertificateLedgerEntry"></a>
# **addGiftCertificateLedgerEntry**
> GiftCertificateResponse addGiftCertificateLedgerEntry(giftCertificateOid, giftCertificateLedgerEntry)

Add a gift certificate ledger entry

Adds a ledger entry for this gift certificate. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.GiftCertificateApi;

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

    GiftCertificateApi apiInstance = new GiftCertificateApi(defaultClient);
    Integer giftCertificateOid = 56; // Integer | 
    GiftCertificateLedgerEntry giftCertificateLedgerEntry = new GiftCertificateLedgerEntry(); // GiftCertificateLedgerEntry | Gift certificate ledger entry
    try {
      GiftCertificateResponse result = apiInstance.addGiftCertificateLedgerEntry(giftCertificateOid, giftCertificateLedgerEntry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftCertificateApi#addGiftCertificateLedgerEntry");
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
| **giftCertificateOid** | **Integer**|  | |
| **giftCertificateLedgerEntry** | [**GiftCertificateLedgerEntry**](GiftCertificateLedgerEntry.md)| Gift certificate ledger entry | |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

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

<a name="createGiftCertificate"></a>
# **createGiftCertificate**
> GiftCertificateResponse createGiftCertificate(giftCertificateCreateRequest)

Create a gift certificate

Creates a gift certificate for this merchant account. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.GiftCertificateApi;

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

    GiftCertificateApi apiInstance = new GiftCertificateApi(defaultClient);
    GiftCertificateCreateRequest giftCertificateCreateRequest = new GiftCertificateCreateRequest(); // GiftCertificateCreateRequest | Gift certificate create request
    try {
      GiftCertificateResponse result = apiInstance.createGiftCertificate(giftCertificateCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftCertificateApi#createGiftCertificate");
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
| **giftCertificateCreateRequest** | [**GiftCertificateCreateRequest**](GiftCertificateCreateRequest.md)| Gift certificate create request | |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

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

<a name="deleteGiftCertificate"></a>
# **deleteGiftCertificate**
> deleteGiftCertificate(giftCertificateOid)

Delete a gift certificate

Deletes a gift certificate for this merchant account. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.GiftCertificateApi;

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

    GiftCertificateApi apiInstance = new GiftCertificateApi(defaultClient);
    Integer giftCertificateOid = 56; // Integer | 
    try {
      apiInstance.deleteGiftCertificate(giftCertificateOid);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftCertificateApi#deleteGiftCertificate");
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
| **giftCertificateOid** | **Integer**|  | |

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

<a name="getGiftCertificateByCode"></a>
# **getGiftCertificateByCode**
> GiftCertificateResponse getGiftCertificateByCode(code)

Retrieve gift certificate by code

Retrieves a gift certificate from the account based on the code (the value the customer enters at checkout time). 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.GiftCertificateApi;

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

    GiftCertificateApi apiInstance = new GiftCertificateApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      GiftCertificateResponse result = apiInstance.getGiftCertificateByCode(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftCertificateApi#getGiftCertificateByCode");
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
| **code** | **String**|  | |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

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

<a name="getGiftCertificateByOid"></a>
# **getGiftCertificateByOid**
> GiftCertificateResponse getGiftCertificateByOid(giftCertificateOid)

Retrieve gift certificate by oid

Retrieves a gift certificate from the account based on the internal primary key. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.GiftCertificateApi;

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

    GiftCertificateApi apiInstance = new GiftCertificateApi(defaultClient);
    Integer giftCertificateOid = 56; // Integer | 
    try {
      GiftCertificateResponse result = apiInstance.getGiftCertificateByOid(giftCertificateOid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftCertificateApi#getGiftCertificateByOid");
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
| **giftCertificateOid** | **Integer**|  | |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

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

<a name="getGiftCertificatesByEmail"></a>
# **getGiftCertificatesByEmail**
> GiftCertificatesResponse getGiftCertificatesByEmail(email)

Retrieve gift certificate by email

Retrieves all gift certificates from the account based on customer email. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.GiftCertificateApi;

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

    GiftCertificateApi apiInstance = new GiftCertificateApi(defaultClient);
    String email = "email_example"; // String | 
    try {
      GiftCertificatesResponse result = apiInstance.getGiftCertificatesByEmail(email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftCertificateApi#getGiftCertificatesByEmail");
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
| **email** | **String**|  | |

### Return type

[**GiftCertificatesResponse**](GiftCertificatesResponse.md)

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

<a name="getGiftCertificatesByQuery"></a>
# **getGiftCertificatesByQuery**
> GiftCertificatesResponse getGiftCertificatesByQuery(giftCertificateQuery, limit, offset, since, sort, expand)

Retrieve gift certificates by query

Retrieves gift certificates from the account.  If no parameters are specified, all gift certificates will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.GiftCertificateApi;

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

    GiftCertificateApi apiInstance = new GiftCertificateApi(defaultClient);
    GiftCertificateQuery giftCertificateQuery = new GiftCertificateQuery(); // GiftCertificateQuery | Gift certificates query
    Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
    Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
    String since = "since_example"; // String | Fetch customers that have been created/modified since this date/time.
    String sort = "sort_example"; // String | The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
    String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
    try {
      GiftCertificatesResponse result = apiInstance.getGiftCertificatesByQuery(giftCertificateQuery, limit, offset, since, sort, expand);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftCertificateApi#getGiftCertificatesByQuery");
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
| **giftCertificateQuery** | [**GiftCertificateQuery**](GiftCertificateQuery.md)| Gift certificates query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch customers that have been created/modified since this date/time. | [optional] |
| **sort** | **String**| The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**GiftCertificatesResponse**](GiftCertificatesResponse.md)

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

<a name="updateGiftCertificate"></a>
# **updateGiftCertificate**
> GiftCertificateResponse updateGiftCertificate(giftCertificateOid, giftCertificate)

Update a gift certificate

Update a gift certificate for this merchant account. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.util.models.*;
import com.ultracart.admin.v2.GiftCertificateApi;

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

    GiftCertificateApi apiInstance = new GiftCertificateApi(defaultClient);
    Integer giftCertificateOid = 56; // Integer | 
    GiftCertificate giftCertificate = new GiftCertificate(); // GiftCertificate | Gift certificate
    try {
      GiftCertificateResponse result = apiInstance.updateGiftCertificate(giftCertificateOid, giftCertificate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GiftCertificateApi#updateGiftCertificate");
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
| **giftCertificateOid** | **Integer**|  | |
| **giftCertificate** | [**GiftCertificate**](GiftCertificate.md)| Gift certificate | |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

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

