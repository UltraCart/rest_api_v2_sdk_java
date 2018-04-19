# CustomerApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /customer/customers/{customer_profile_oid} | Delete a customer
[**getCustomer**](CustomerApi.md#getCustomer) | **GET** /customer/customers/{customer_profile_oid} | Retrieve a customer
[**getCustomers**](CustomerApi.md#getCustomers) | **GET** /customer/customers | Retrieve customers
[**getCustomersByQuery**](CustomerApi.md#getCustomersByQuery) | **GET** /customer/customers/query | Retrieve customers by query
[**getCustomersForDataTables**](CustomerApi.md#getCustomersForDataTables) | **POST** /customer/customers/dataTables | Retrieve customers for DataTables plugin
[**getEditorValues**](CustomerApi.md#getEditorValues) | **GET** /customer/editor_values | Retrieve values needed for a customer profile editor
[**insertCustomer**](CustomerApi.md#insertCustomer) | **POST** /customer/customers | Insert a customer
[**updateCustomer**](CustomerApi.md#updateCustomer) | **PUT** /customer/customers/{customer_profile_oid} | Update a customer


<a name="deleteCustomer"></a>
# **deleteCustomer**
> CustomerResponse deleteCustomer(customerProfileOid)

Delete a customer

Delete a customer on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerProfileOid = 56; // Integer | The customer_profile_oid to delete.
try {
    CustomerResponse result = apiInstance.deleteCustomer(customerProfileOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#deleteCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerProfileOid** | **Integer**| The customer_profile_oid to delete. |

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getCustomer"></a>
# **getCustomer**
> CustomerResponse getCustomer(customerProfileOid, expand)

Retrieve a customer

Retrieves a single customer using the specified customer profile oid. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Integer customerProfileOid = 56; // Integer | The customer oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CustomerResponse result = apiInstance.getCustomer(customerProfileOid, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerProfileOid** | **Integer**| The customer oid to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomers"></a>
# **getCustomers**
> CustomersResponse getCustomers(email, qbClass, quickbooksCode, lastModifiedDtsStart, lastModifiedDtsEnd, signupDtsStart, signupDtsEnd, billingFirstName, billingLastName, billingCompany, billingCity, billingState, billingPostalCode, billingCountryCode, billingDayPhone, billingEveningPhone, shippingFirstName, shippingLastName, shippingCompany, shippingCity, shippingState, shippingPostalCode, shippingCountryCode, shippingDayPhone, shippingEveningPhone, pricingTierOid, pricingTierName, limit, offset, since, sort, expand)

Retrieve customers

Retrieves customers from the account.  If no parameters are specified, all customers will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
String email = "email_example"; // String | Email
String qbClass = "qbClass_example"; // String | Quickbooks class
String quickbooksCode = "quickbooksCode_example"; // String | Quickbooks code
String lastModifiedDtsStart = "lastModifiedDtsStart_example"; // String | Last modified date start
String lastModifiedDtsEnd = "lastModifiedDtsEnd_example"; // String | Last modified date end
String signupDtsStart = "signupDtsStart_example"; // String | Signup date start
String signupDtsEnd = "signupDtsEnd_example"; // String | Signup date end
String billingFirstName = "billingFirstName_example"; // String | Billing first name
String billingLastName = "billingLastName_example"; // String | Billing last name
String billingCompany = "billingCompany_example"; // String | Billing company
String billingCity = "billingCity_example"; // String | Billing city
String billingState = "billingState_example"; // String | Billing state
String billingPostalCode = "billingPostalCode_example"; // String | Billing postal code
String billingCountryCode = "billingCountryCode_example"; // String | Billing country code
String billingDayPhone = "billingDayPhone_example"; // String | Billing day phone
String billingEveningPhone = "billingEveningPhone_example"; // String | Billing evening phone
String shippingFirstName = "shippingFirstName_example"; // String | Shipping first name
String shippingLastName = "shippingLastName_example"; // String | Shipping last name
String shippingCompany = "shippingCompany_example"; // String | Shipping company
String shippingCity = "shippingCity_example"; // String | Shipping city
String shippingState = "shippingState_example"; // String | Shipping state
String shippingPostalCode = "shippingPostalCode_example"; // String | Shipping postal code
String shippingCountryCode = "shippingCountryCode_example"; // String | Shipping country code
String shippingDayPhone = "shippingDayPhone_example"; // String | Shipping day phone
String shippingEveningPhone = "shippingEveningPhone_example"; // String | Shipping evening phone
Integer pricingTierOid = 56; // Integer | Pricing tier oid
String pricingTierName = "pricingTierName_example"; // String | Pricing tier name
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch customers that have been created/modified since this date/time.
String sort = "sort_example"; // String | The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CustomersResponse result = apiInstance.getCustomers(email, qbClass, quickbooksCode, lastModifiedDtsStart, lastModifiedDtsEnd, signupDtsStart, signupDtsEnd, billingFirstName, billingLastName, billingCompany, billingCity, billingState, billingPostalCode, billingCountryCode, billingDayPhone, billingEveningPhone, shippingFirstName, shippingLastName, shippingCompany, shippingCity, shippingState, shippingPostalCode, shippingCountryCode, shippingDayPhone, shippingEveningPhone, pricingTierOid, pricingTierName, limit, offset, since, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| Email | [optional]
 **qbClass** | **String**| Quickbooks class | [optional]
 **quickbooksCode** | **String**| Quickbooks code | [optional]
 **lastModifiedDtsStart** | **String**| Last modified date start | [optional]
 **lastModifiedDtsEnd** | **String**| Last modified date end | [optional]
 **signupDtsStart** | **String**| Signup date start | [optional]
 **signupDtsEnd** | **String**| Signup date end | [optional]
 **billingFirstName** | **String**| Billing first name | [optional]
 **billingLastName** | **String**| Billing last name | [optional]
 **billingCompany** | **String**| Billing company | [optional]
 **billingCity** | **String**| Billing city | [optional]
 **billingState** | **String**| Billing state | [optional]
 **billingPostalCode** | **String**| Billing postal code | [optional]
 **billingCountryCode** | **String**| Billing country code | [optional]
 **billingDayPhone** | **String**| Billing day phone | [optional]
 **billingEveningPhone** | **String**| Billing evening phone | [optional]
 **shippingFirstName** | **String**| Shipping first name | [optional]
 **shippingLastName** | **String**| Shipping last name | [optional]
 **shippingCompany** | **String**| Shipping company | [optional]
 **shippingCity** | **String**| Shipping city | [optional]
 **shippingState** | **String**| Shipping state | [optional]
 **shippingPostalCode** | **String**| Shipping postal code | [optional]
 **shippingCountryCode** | **String**| Shipping country code | [optional]
 **shippingDayPhone** | **String**| Shipping day phone | [optional]
 **shippingEveningPhone** | **String**| Shipping evening phone | [optional]
 **pricingTierOid** | **Integer**| Pricing tier oid | [optional]
 **pricingTierName** | **String**| Pricing tier name | [optional]
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch customers that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CustomersResponse**](CustomersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomersByQuery"></a>
# **getCustomersByQuery**
> CustomersResponse getCustomersByQuery(customerQuery, limit, offset, since, sort, expand)

Retrieve customers by query

Retrieves customers from the account.  If no parameters are specified, all customers will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
CustomerQuery customerQuery = new CustomerQuery(); // CustomerQuery | Customer query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch customers that have been created/modified since this date/time.
String sort = "sort_example"; // String | The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CustomersResponse result = apiInstance.getCustomersByQuery(customerQuery, limit, offset, since, sort, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomersByQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerQuery** | [**CustomerQuery**](CustomerQuery.md)| Customer query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch customers that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CustomersResponse**](CustomersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomersForDataTables"></a>
# **getCustomersForDataTables**
> DataTablesServerSideResponse getCustomersForDataTables(expand)

Retrieve customers for DataTables plugin

Retrieves customers from the account.  If no searches are specified, all customers will be returned. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    DataTablesServerSideResponse result = apiInstance.getCustomersForDataTables(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getCustomersForDataTables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**DataTablesServerSideResponse**](DataTablesServerSideResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEditorValues"></a>
# **getEditorValues**
> CustomerEditorValues getEditorValues()

Retrieve values needed for a customer profile editor

Retrieve values needed for a customer profile editor. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
try {
    CustomerEditorValues result = apiInstance.getEditorValues();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#getEditorValues");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomerEditorValues**](CustomerEditorValues.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertCustomer"></a>
# **insertCustomer**
> CustomerResponse insertCustomer(customer, expand)

Insert a customer

Insert a customer on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Customer customer = new Customer(); // Customer | Customer to insert
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CustomerResponse result = apiInstance.insertCustomer(customer, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#insertCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| Customer to insert |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateCustomer"></a>
# **updateCustomer**
> CustomerResponse updateCustomer(customer, customerProfileOid, expand)

Update a customer

Update a customer on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.CustomerApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

CustomerApi apiInstance = new CustomerApi();
Customer customer = new Customer(); // Customer | Customer to update
Integer customerProfileOid = 56; // Integer | The customer_profile_oid to update.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    CustomerResponse result = apiInstance.updateCustomer(customer, customerProfileOid, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CustomerApi#updateCustomer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)| Customer to update |
 **customerProfileOid** | **Integer**| The customer_profile_oid to update. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**CustomerResponse**](CustomerResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

