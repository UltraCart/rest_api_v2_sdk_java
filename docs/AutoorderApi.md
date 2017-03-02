# AutoorderApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autoOrderAutoOrdersAutoOrderOidGet**](AutoorderApi.md#autoOrderAutoOrdersAutoOrderOidGet) | **GET** /auto_order/auto_orders/{auto_order_oid} | Retrieve an auto order
[**autoOrderAutoOrdersAutoOrderOidPut**](AutoorderApi.md#autoOrderAutoOrdersAutoOrderOidPut) | **PUT** /auto_order/auto_orders/{auto_order_oid} | Update an auto order
[**autoOrderAutoOrdersGet**](AutoorderApi.md#autoOrderAutoOrdersGet) | **GET** /auto_order/auto_orders | Retrieve auto orders


<a name="autoOrderAutoOrdersAutoOrderOidGet"></a>
# **autoOrderAutoOrdersAutoOrderOidGet**
> AutoOrderResponse autoOrderAutoOrdersAutoOrderOidGet(autoOrderOid, expand)

Retrieve an auto order

Retrieves a single auto order using the specified auto order oid. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoorderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

AutoorderApi apiInstance = new AutoorderApi();
Integer autoOrderOid = 56; // Integer | The auto order oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrderResponse result = apiInstance.autoOrderAutoOrdersAutoOrderOidGet(autoOrderOid, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoorderApi#autoOrderAutoOrdersAutoOrderOidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrderOid** | **Integer**| The auto order oid to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoOrderAutoOrdersAutoOrderOidPut"></a>
# **autoOrderAutoOrdersAutoOrderOidPut**
> AutoOrderResponse autoOrderAutoOrdersAutoOrderOidPut(autoOrder, autoOrderOid)

Update an auto order

Update an auto order on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoorderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

AutoorderApi apiInstance = new AutoorderApi();
AutoOrder autoOrder = new AutoOrder(); // AutoOrder | Auto order to update
Integer autoOrderOid = 56; // Integer | The auto order oid to update.
try {
    AutoOrderResponse result = apiInstance.autoOrderAutoOrdersAutoOrderOidPut(autoOrder, autoOrderOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoorderApi#autoOrderAutoOrdersAutoOrderOidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrder** | [**AutoOrder**](AutoOrder.md)| Auto order to update |
 **autoOrderOid** | **Integer**| The auto order oid to update. |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="autoOrderAutoOrdersGet"></a>
# **autoOrderAutoOrdersGet**
> AutoOrdersResponse autoOrderAutoOrdersGet(autoOrderCode, originalOrderId, firstName, lastName, company, city, state, postalCode, countryCode, phone, email, originalOrderDateBegin, originalOrderDateEnd, nextShipmentDateBegin, nextShipmentDateEnd, cardType, itemId, status, limit, offset, since, sort, expand)

Retrieve auto orders

Retrieves auto orders from the account.  If no parameters are specified, all auto orders will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.AutoorderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

AutoorderApi apiInstance = new AutoorderApi();
String autoOrderCode = "autoOrderCode_example"; // String | Auto order code
String originalOrderId = "originalOrderId_example"; // String | Original order id
String firstName = "firstName_example"; // String | First name
String lastName = "lastName_example"; // String | Last name
String company = "company_example"; // String | Company
String city = "city_example"; // String | City
String state = "state_example"; // String | State
String postalCode = "postalCode_example"; // String | Postal code
String countryCode = "countryCode_example"; // String | Country code (ISO-3166 two letter)
String phone = "phone_example"; // String | Phone
String email = "email_example"; // String | Email
String originalOrderDateBegin = "originalOrderDateBegin_example"; // String | Original order date begin
String originalOrderDateEnd = "originalOrderDateEnd_example"; // String | Original order date end
String nextShipmentDateBegin = "nextShipmentDateBegin_example"; // String | Next shipment date begin
String nextShipmentDateEnd = "nextShipmentDateEnd_example"; // String | Next shipment date end
String cardType = "cardType_example"; // String | Card type
String itemId = "itemId_example"; // String | Item ID
String status = "status_example"; // String | Status
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch auto orders that have been created/modified since this date/time.
String sort = "sort_example"; // String | The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    AutoOrdersResponse result = apiInstance.autoOrderAutoOrdersGet(autoOrderCode, originalOrderId, firstName, lastName, company, city, state, postalCode, countryCode, phone, email, originalOrderDateBegin, originalOrderDateEnd, nextShipmentDateBegin, nextShipmentDateEnd, cardType, itemId, status, limit, offset, since, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoorderApi#autoOrderAutoOrdersGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOrderCode** | **String**| Auto order code | [optional]
 **originalOrderId** | **String**| Original order id | [optional]
 **firstName** | **String**| First name | [optional]
 **lastName** | **String**| Last name | [optional]
 **company** | **String**| Company | [optional]
 **city** | **String**| City | [optional]
 **state** | **String**| State | [optional]
 **postalCode** | **String**| Postal code | [optional]
 **countryCode** | **String**| Country code (ISO-3166 two letter) | [optional]
 **phone** | **String**| Phone | [optional]
 **email** | **String**| Email | [optional]
 **originalOrderDateBegin** | **String**| Original order date begin | [optional]
 **originalOrderDateEnd** | **String**| Original order date end | [optional]
 **nextShipmentDateBegin** | **String**| Next shipment date begin | [optional]
 **nextShipmentDateEnd** | **String**| Next shipment date end | [optional]
 **cardType** | **String**| Card type | [optional]
 **itemId** | **String**| Item ID | [optional]
 **status** | **String**| Status | [optional]
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch auto orders that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

