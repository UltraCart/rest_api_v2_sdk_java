# ChargebackApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChargeback**](ChargebackApi.md#deleteChargeback) | **DELETE** /chargeback/chargebacks/{chargeback_dispute_oid} | Delete a chargeback
[**getChargebackDispute**](ChargebackApi.md#getChargebackDispute) | **GET** /chargeback/chargebacks/{chargeback_dispute_oid} | Retrieve a chargeback
[**getChargebackDisputes**](ChargebackApi.md#getChargebackDisputes) | **GET** /chargeback/chargebacks | Retrieve chargebacks
[**insertChargeback**](ChargebackApi.md#insertChargeback) | **POST** /chargeback/chargebacks | Insert a chargeback
[**updateChargeback**](ChargebackApi.md#updateChargeback) | **PUT** /chargeback/chargebacks/{chargeback_dispute_oid} | Update a chargeback


<a name="deleteChargeback"></a>
# **deleteChargeback**
> ChargebackDisputeResponse deleteChargeback(chargebackDisputeOid)

Delete a chargeback

Delete a chargeback on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChargebackApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChargebackApi apiInstance = new ChargebackApi(apiKey);

Integer chargebackDisputeOid = 56; // Integer | The chargeback_dispute_oid to delete.
try {
    ChargebackDisputeResponse result = apiInstance.deleteChargeback(chargebackDisputeOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebackApi#deleteChargeback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargebackDisputeOid** | **Integer**| The chargeback_dispute_oid to delete. |

### Return type

[**ChargebackDisputeResponse**](ChargebackDisputeResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getChargebackDispute"></a>
# **getChargebackDispute**
> ChargebackDisputeResponse getChargebackDispute(chargebackDisputeOid, expand)

Retrieve a chargeback

Retrieves a single chargeback using the specified chargeback dispute oid. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChargebackApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChargebackApi apiInstance = new ChargebackApi(apiKey);

Integer chargebackDisputeOid = 56; // Integer | The chargeback dispute oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    ChargebackDisputeResponse result = apiInstance.getChargebackDispute(chargebackDisputeOid, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebackApi#getChargebackDispute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargebackDisputeOid** | **Integer**| The chargeback dispute oid to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**ChargebackDisputeResponse**](ChargebackDisputeResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChargebackDisputes"></a>
# **getChargebackDisputes**
> ChargebackDisputesResponse getChargebackDisputes(orderId, caseNumber, status, expirationDtsStart, expirationDtsEnd, chargebackDtsStart, chargebackDtsEnd, limit, offset, since, sort, expand)

Retrieve chargebacks

Retrieves chargebacks from the account.  If no parameters are specified, all chargebacks will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChargebackApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChargebackApi apiInstance = new ChargebackApi(apiKey);

String orderId = "orderId_example"; // String | Order Id
String caseNumber = "caseNumber_example"; // String | Case number
String status = "status_example"; // String | Status
String expirationDtsStart = "expirationDtsStart_example"; // String | Expiration dts start
String expirationDtsEnd = "expirationDtsEnd_example"; // String | Expiration dts end
String chargebackDtsStart = "chargebackDtsStart_example"; // String | Chargeback dts start
String chargebackDtsEnd = "chargebackDtsEnd_example"; // String | Chargeback dts end
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch chargebacks that have been created/modified since this date/time.
String sort = "sort_example"; // String | The sort order of the chargebacks.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    ChargebackDisputesResponse result = apiInstance.getChargebackDisputes(orderId, caseNumber, status, expirationDtsStart, expirationDtsEnd, chargebackDtsStart, chargebackDtsEnd, limit, offset, since, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebackApi#getChargebackDisputes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **String**| Order Id | [optional]
 **caseNumber** | **String**| Case number | [optional]
 **status** | **String**| Status | [optional]
 **expirationDtsStart** | **String**| Expiration dts start | [optional]
 **expirationDtsEnd** | **String**| Expiration dts end | [optional]
 **chargebackDtsStart** | **String**| Chargeback dts start | [optional]
 **chargebackDtsEnd** | **String**| Chargeback dts end | [optional]
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch chargebacks that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the chargebacks.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**ChargebackDisputesResponse**](ChargebackDisputesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertChargeback"></a>
# **insertChargeback**
> ChargebackDisputeResponse insertChargeback(chargeback, expand)

Insert a chargeback

Insert a chargeback on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChargebackApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChargebackApi apiInstance = new ChargebackApi(apiKey);

ChargebackDispute chargeback = new ChargebackDispute(); // ChargebackDispute | Chargeback to insert
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    ChargebackDisputeResponse result = apiInstance.insertChargeback(chargeback, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebackApi#insertChargeback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargeback** | [**ChargebackDispute**](ChargebackDispute.md)| Chargeback to insert |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**ChargebackDisputeResponse**](ChargebackDisputeResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateChargeback"></a>
# **updateChargeback**
> ChargebackDisputeResponse updateChargeback(chargeback, chargebackDisputeOid, expand)

Update a chargeback

Update a chargeback on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ChargebackApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ChargebackApi apiInstance = new ChargebackApi(apiKey);

ChargebackDispute chargeback = new ChargebackDispute(); // ChargebackDispute | Chargeback to update
Integer chargebackDisputeOid = 56; // Integer | The chargeback_dispute_oid to update.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    ChargebackDisputeResponse result = apiInstance.updateChargeback(chargeback, chargebackDisputeOid, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChargebackApi#updateChargeback");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chargeback** | [**ChargebackDispute**](ChargebackDispute.md)| Chargeback to update |
 **chargebackDisputeOid** | **Integer**| The chargeback_dispute_oid to update. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**ChargebackDisputeResponse**](ChargebackDisputeResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

