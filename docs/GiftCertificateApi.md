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
package gift_certificate;

import com.ultracart.admin.v2.GiftCertificateApi;
import com.ultracart.admin.v2.models.GiftCertificate;
import com.ultracart.admin.v2.models.GiftCertificateLedgerEntry;
import com.ultracart.admin.v2.models.GiftCertificateResponse;
import common.Constants;
import common.JSON;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.math.BigDecimal;

public class AddGiftCertificateLedgerEntry{

  public static void execute() throws Exception {

    GiftCertificateApi giftCertificateApi = new GiftCertificateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);
    DateTimeFormatter fmt = ISODateTimeFormat.dateTimeNoMillis();

    int giftCertificateOid = 676713;

    GiftCertificateLedgerEntry ledgerEntry = new GiftCertificateLedgerEntry();
    ledgerEntry.setAmount(new BigDecimal("-15.55")); // this is the change amount in the gift certificate.  this is not a balance.  it will be subtracted from it.
    ledgerEntry.setDescription("Debit using Java SDK");
    ledgerEntry.setEntryDts(fmt.print(DateTime.now()));
    ledgerEntry.setGiftCertificateLedgerOid(0); // the system will assign an oid.  do not assign one here.
    ledgerEntry.setGiftCertificateOid(giftCertificateOid); // this is an existing gift certificate oid.  I created it using createGiftCertificate.ts
    ledgerEntry.setReferenceOrderId("BLAH-54321"); // if this ledger entry is related to an order, add it here, else use null.

    // add ledger does not take an expansion variable.  it will return the entire object by default.
    GiftCertificateResponse gcResponse = giftCertificateApi.addGiftCertificateLedgerEntry(giftCertificateOid, ledgerEntry);
    GiftCertificate giftCertificate = gcResponse.getGiftCertificate();

    System.out.println(JSON.toJSON(giftCertificate));

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
package gift_certificate;

import com.ultracart.admin.v2.GiftCertificateApi;
import com.ultracart.admin.v2.models.GiftCertificate;
import com.ultracart.admin.v2.models.GiftCertificateCreateRequest;
import com.ultracart.admin.v2.models.GiftCertificateResponse;
import common.Constants;
import common.JSON;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.math.BigDecimal;

public class CreateGiftCertificate {

  public static void execute() throws Exception {

    // Don't use verifySsl=false in production.
    GiftCertificateApi giftCertificateApi = new GiftCertificateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);
    DateTimeFormatter fmt = ISODateTimeFormat.dateTimeNoMillis();

    GiftCertificateCreateRequest createRequest = new GiftCertificateCreateRequest();
    createRequest.setAmount(new BigDecimal("150.75"));
    createRequest.setInitialLedgerDescription("Issued instead of refund");
    createRequest.setMerchantNote("Created via Java SDK");
    createRequest.setEmail("perry@ultracart.com");
    createRequest.setExpirationDts(fmt.print(DateTime.now().plusMonths(3)));

    // create does not take an expansion variable.  it will return the entire object by default.
    GiftCertificateResponse gcResponse = giftCertificateApi.createGiftCertificate(createRequest);
    GiftCertificate giftCertificate = gcResponse.getGiftCertificate();

    System.out.println(JSON.toJSON(giftCertificate));

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
package gift_certificate;

import com.ultracart.admin.v2.GiftCertificateApi;
import com.ultracart.admin.v2.models.GiftCertificate;
import com.ultracart.admin.v2.models.GiftCertificateResponse;
import common.Constants;
import common.JSON;

public class DeleteGiftCertificate{

  public static void execute() throws Exception {

    GiftCertificateApi giftCertificateApi = new GiftCertificateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

    int giftCertificateOid = 676713;

    giftCertificateApi.deleteGiftCertificate(giftCertificateOid);

    // if I query the gift certificate again, I will get an object back, but the deleted property will be true.
    // by_oid does not take an expansion variable.  it will return the entire object by default.
    GiftCertificateResponse gcResponse = giftCertificateApi.getGiftCertificateByOid(giftCertificateOid);
    GiftCertificate giftCertificate = gcResponse.getGiftCertificate();

    System.out.println(JSON.toJSON(giftCertificate));

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
package gift_certificate;

import com.ultracart.admin.v2.GiftCertificateApi;
import com.ultracart.admin.v2.models.GiftCertificate;
import com.ultracart.admin.v2.models.GiftCertificateResponse;
import common.Constants;
import common.JSON;

public class GetGiftCertificateByCode{

  public static void execute() throws Exception {

    GiftCertificateApi giftCertificateApi = new GiftCertificateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

    String code = "93KHHXD6VH";

    // by_code does not take an expansion variable.  it will return the entire object by default.
    GiftCertificateResponse gcResponse = giftCertificateApi.getGiftCertificateByCode(code);
    GiftCertificate giftCertificate = gcResponse.getGiftCertificate();

    System.out.println(JSON.toJSON(giftCertificate));

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
package gift_certificate;

import com.ultracart.admin.v2.GiftCertificateApi;
import com.ultracart.admin.v2.models.GiftCertificate;
import com.ultracart.admin.v2.models.GiftCertificateResponse;
import common.Constants;
import common.JSON;

public class GetGiftCertificateByOid{

  public static void execute() throws Exception {

    GiftCertificateApi giftCertificateApi = new GiftCertificateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

    int giftCertificateOid = 676713;

    // by_oid does not take an expansion variable.  it will return the entire object by default.
    GiftCertificateResponse gcResponse = giftCertificateApi.getGiftCertificateByOid(giftCertificateOid);
    GiftCertificate giftCertificate = gcResponse.getGiftCertificate();

    System.out.println(JSON.toJSON(giftCertificate));

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
package gift_certificate;

import com.ultracart.admin.v2.GiftCertificateApi;
import com.ultracart.admin.v2.models.GiftCertificate;
import com.ultracart.admin.v2.models.GiftCertificatesResponse;
import common.Constants;
import common.JSON;

import java.util.List;

public class GetGiftCertificatesByEmail {

  public static void execute() throws Exception {

    GiftCertificateApi giftCertificateApi = new GiftCertificateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

    String email = "support@ultracart.com";

    // by_email does not take an expansion variable.  it will return the entire object by default.
    GiftCertificatesResponse gcResponse = giftCertificateApi.getGiftCertificatesByEmail(email);
    List<GiftCertificate> giftCertificates = gcResponse.getGiftCertificates();

    for (GiftCertificate certificate : giftCertificates) {
      System.out.println(JSON.toJSON(certificate));
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
package gift_certificate;

import com.ultracart.admin.v2.GiftCertificateApi;
import com.ultracart.admin.v2.models.GiftCertificate;
import com.ultracart.admin.v2.models.GiftCertificateQuery;
import com.ultracart.admin.v2.models.GiftCertificatesResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;
import common.JSON;

import java.util.ArrayList;
import java.util.List;

public class GetGiftCertificatesByQuery{

  public static List<GiftCertificate> getGiftCertificateChunk(GiftCertificateApi giftCertificateApi,
                                                                   int offset,
                                                                   int limit) throws ApiException {
    String expansion = "ledger";
    GiftCertificateQuery query = new GiftCertificateQuery();  // leave this empty to retrieve all records.
    GiftCertificatesResponse gcResponse = giftCertificateApi.getGiftCertificatesByQuery(query, limit, offset, null, null, expansion);
    if(gcResponse != null && gcResponse.getGiftCertificates() != null){
      return gcResponse.getGiftCertificates();
    }
    return new ArrayList<>();
  }

  public static void execute() throws Exception {

    GiftCertificateApi giftCertificateApi = new GiftCertificateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

    ArrayList<GiftCertificate> giftCertificates = new ArrayList<>();
    int iteration = 1;
    int offset = 0;
    int limit = 200;
    boolean moreRecordsToFetch = true;

    while( moreRecordsToFetch ){

        System.out.println("executing iteration " + iteration);
        List<GiftCertificate> chuckOfCertificates = getGiftCertificateChunk(giftCertificateApi, offset, limit);
        giftCertificates.addAll(chuckOfCertificates);
        offset = offset + limit;
        moreRecordsToFetch = chuckOfCertificates.size() == limit;
        iteration++;

    }

    for (GiftCertificate giftCertificate : giftCertificates) {
      System.out.println(JSON.toJSON(giftCertificate));
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
package gift_certificate;

import com.ultracart.admin.v2.GiftCertificateApi;
import com.ultracart.admin.v2.models.GiftCertificate;
import com.ultracart.admin.v2.models.GiftCertificateResponse;
import common.Constants;
import common.JSON;

public class UpdateGiftCertificate{

  public static void execute() throws Exception {

    GiftCertificateApi giftCertificateApi = new GiftCertificateApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

    int giftCertificateOid = 676713;

    // by_oid does not take an expansion variable.  it will return the entire object by default.
    GiftCertificateResponse gcResponse = giftCertificateApi.getGiftCertificateByOid(giftCertificateOid);
    GiftCertificate giftCertificate = gcResponse.getGiftCertificate();

    giftCertificate.setEmail("support@ultracart.com");
    gcResponse = giftCertificateApi.updateGiftCertificate(giftCertificateOid, giftCertificate);
    giftCertificate = gcResponse.getGiftCertificate();

    System.out.println(JSON.toJSON(giftCertificate));

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

