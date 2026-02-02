# GiftCertificateApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addGiftCertificateLedgerEntry**](GiftCertificateApi.md#addGiftCertificateLedgerEntry) | **POST** /gift_certificate/gift_certificates/{gift_certificate_oid}/ledger_entry | Add a gift certificate ledger entry
[**createGiftCertificate**](GiftCertificateApi.md#createGiftCertificate) | **POST** /gift_certificate/gift_certificates | Create a gift certificate
[**deleteGiftCertificate**](GiftCertificateApi.md#deleteGiftCertificate) | **DELETE** /gift_certificate/gift_certificates/{gift_certificate_oid} | Delete a gift certificate
[**getGiftCertificateByCode**](GiftCertificateApi.md#getGiftCertificateByCode) | **POST** /gift_certificate/gift_certificates/by_code/{code} | Retrieve gift certificate by code
[**getGiftCertificateByOid**](GiftCertificateApi.md#getGiftCertificateByOid) | **POST** /gift_certificate/gift_certificates/{gift_certificate_oid} | Retrieve gift certificate by oid
[**getGiftCertificatesByEmail**](GiftCertificateApi.md#getGiftCertificatesByEmail) | **POST** /gift_certificate/gift_certificates/by_email/{email} | Retrieve gift certificate by email
[**getGiftCertificatesByQuery**](GiftCertificateApi.md#getGiftCertificatesByQuery) | **POST** /gift_certificate/gift_certificates/query | Retrieve gift certificates by query
[**updateGiftCertificate**](GiftCertificateApi.md#updateGiftCertificate) | **PUT** /gift_certificate/gift_certificates/{gift_certificate_oid} | Update a gift certificate


<a name="addGiftCertificateLedgerEntry"></a>
# **addGiftCertificateLedgerEntry**
> GiftCertificateResponse addGiftCertificateLedgerEntry(giftCertificateOid, giftCertificateLedgerEntry)

Add a gift certificate ledger entry

Adds a ledger entry for this gift certificate. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.GiftCertificateApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
GiftCertificateApi apiInstance = new GiftCertificateApi(apiKey);

Integer giftCertificateOid = 56; // Integer | 
GiftCertificateLedgerEntry giftCertificateLedgerEntry = new GiftCertificateLedgerEntry(); // GiftCertificateLedgerEntry | Gift certificate ledger entry
try {
    GiftCertificateResponse result = apiInstance.addGiftCertificateLedgerEntry(giftCertificateOid, giftCertificateLedgerEntry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GiftCertificateApi#addGiftCertificateLedgerEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **giftCertificateOid** | **Integer**|  |
 **giftCertificateLedgerEntry** | [**GiftCertificateLedgerEntry**](GiftCertificateLedgerEntry.md)| Gift certificate ledger entry |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createGiftCertificate"></a>
# **createGiftCertificate**
> GiftCertificateResponse createGiftCertificate(giftCertificateCreateRequest)

Create a gift certificate

Creates a gift certificate for this merchant account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.GiftCertificateApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
GiftCertificateApi apiInstance = new GiftCertificateApi(apiKey);

GiftCertificateCreateRequest giftCertificateCreateRequest = new GiftCertificateCreateRequest(); // GiftCertificateCreateRequest | Gift certificate create request
try {
    GiftCertificateResponse result = apiInstance.createGiftCertificate(giftCertificateCreateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GiftCertificateApi#createGiftCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **giftCertificateCreateRequest** | [**GiftCertificateCreateRequest**](GiftCertificateCreateRequest.md)| Gift certificate create request |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGiftCertificate"></a>
# **deleteGiftCertificate**
> deleteGiftCertificate(giftCertificateOid)

Delete a gift certificate

Deletes a gift certificate for this merchant account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.GiftCertificateApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
GiftCertificateApi apiInstance = new GiftCertificateApi(apiKey);

Integer giftCertificateOid = 56; // Integer | 
try {
    apiInstance.deleteGiftCertificate(giftCertificateOid);
} catch (ApiException e) {
    System.err.println("Exception when calling GiftCertificateApi#deleteGiftCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **giftCertificateOid** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGiftCertificateByCode"></a>
# **getGiftCertificateByCode**
> GiftCertificateResponse getGiftCertificateByCode(code)

Retrieve gift certificate by code

Retrieves a gift certificate from the account based on the code (the value the customer enters at checkout time). 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.GiftCertificateApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
GiftCertificateApi apiInstance = new GiftCertificateApi(apiKey);

String code = "code_example"; // String | 
try {
    GiftCertificateResponse result = apiInstance.getGiftCertificateByCode(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GiftCertificateApi#getGiftCertificateByCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**|  |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGiftCertificateByOid"></a>
# **getGiftCertificateByOid**
> GiftCertificateResponse getGiftCertificateByOid(giftCertificateOid)

Retrieve gift certificate by oid

Retrieves a gift certificate from the account based on the internal primary key. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.GiftCertificateApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
GiftCertificateApi apiInstance = new GiftCertificateApi(apiKey);

Integer giftCertificateOid = 56; // Integer | 
try {
    GiftCertificateResponse result = apiInstance.getGiftCertificateByOid(giftCertificateOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GiftCertificateApi#getGiftCertificateByOid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **giftCertificateOid** | **Integer**|  |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGiftCertificatesByEmail"></a>
# **getGiftCertificatesByEmail**
> GiftCertificatesResponse getGiftCertificatesByEmail(email)

Retrieve gift certificate by email

Retrieves all gift certificates from the account based on customer email. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.GiftCertificateApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
GiftCertificateApi apiInstance = new GiftCertificateApi(apiKey);

String email = "email_example"; // String | 
try {
    GiftCertificatesResponse result = apiInstance.getGiftCertificatesByEmail(email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GiftCertificateApi#getGiftCertificatesByEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  |

### Return type

[**GiftCertificatesResponse**](GiftCertificatesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGiftCertificatesByQuery"></a>
# **getGiftCertificatesByQuery**
> GiftCertificatesResponse getGiftCertificatesByQuery(giftCertificateQuery, limit, offset, since, sort, expand)

Retrieve gift certificates by query

Retrieves gift certificates from the account.  If no parameters are specified, all gift certificates will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.GiftCertificateApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
GiftCertificateApi apiInstance = new GiftCertificateApi(apiKey);

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
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **giftCertificateQuery** | [**GiftCertificateQuery**](GiftCertificateQuery.md)| Gift certificates query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch customers that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**GiftCertificatesResponse**](GiftCertificatesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGiftCertificate"></a>
# **updateGiftCertificate**
> GiftCertificateResponse updateGiftCertificate(giftCertificateOid, giftCertificate)

Update a gift certificate

Update a gift certificate for this merchant account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.GiftCertificateApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
GiftCertificateApi apiInstance = new GiftCertificateApi(apiKey);

Integer giftCertificateOid = 56; // Integer | 
GiftCertificate giftCertificate = new GiftCertificate(); // GiftCertificate | Gift certificate
try {
    GiftCertificateResponse result = apiInstance.updateGiftCertificate(giftCertificateOid, giftCertificate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GiftCertificateApi#updateGiftCertificate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **giftCertificateOid** | **Integer**|  |
 **giftCertificate** | [**GiftCertificate**](GiftCertificate.md)| Gift certificate |

### Return type

[**GiftCertificateResponse**](GiftCertificateResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

