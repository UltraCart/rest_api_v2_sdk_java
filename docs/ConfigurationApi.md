# ConfigurationApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delayAutoOrders**](ConfigurationApi.md#delayAutoOrders) | **POST** /configuration/checkout/payments/rtg/{rtg_oid}/delayAutoOrders | Delay auto order processing for a day for this rotating transaction gateway
[**deleteRotatingTransactionGateway**](ConfigurationApi.md#deleteRotatingTransactionGateway) | **DELETE** /configuration/checkout/payments/rtg/{rtg_oid} | Delete a rotating transaction gateway
[**getPaymentsConfiguration**](ConfigurationApi.md#getPaymentsConfiguration) | **GET** /configuration/checkout/payments | Retrieve payments configuration
[**getPaymentsRotatingGateway**](ConfigurationApi.md#getPaymentsRotatingGateway) | **GET** /configuration/checkout/payments/rtg/{rtg_oid} | Retrieve a rotating transaction gateway
[**getPaymentsRotatingGatewayByCode**](ConfigurationApi.md#getPaymentsRotatingGatewayByCode) | **GET** /configuration/checkout/payments/rtg/byCode/{code} | Retrieve a rotating transaction gateway by code
[**getPaymentsRotatingTransactionGateways**](ConfigurationApi.md#getPaymentsRotatingTransactionGateways) | **GET** /configuration/checkout/payments/rtg | Retrieve a list of rotating transaction gateways
[**getPaymentsRtgSummaries**](ConfigurationApi.md#getPaymentsRtgSummaries) | **GET** /configuration/checkout/payments/rtg/summaries | Retrieve a summary of rotating transaction gateways
[**getPaymentsTransactionGateways**](ConfigurationApi.md#getPaymentsTransactionGateways) | **GET** /configuration/checkout/payments/tg | Retrieve a list of transaction gateways
[**insertRotatingTransactionGateway**](ConfigurationApi.md#insertRotatingTransactionGateway) | **POST** /configuration/checkout/payments/rtg/ | Insert a rotating transaction gateway
[**migrateToRotatingTransactionGateway**](ConfigurationApi.md#migrateToRotatingTransactionGateway) | **POST** /configuration/checkout/payments/tg/migrateToRtgWithCodeOf/{code} | Migrate a normal transaction gateway to a rotating transaction gateway
[**stripeConnect**](ConfigurationApi.md#stripeConnect) | **POST** /configuration/checkout/payments/rtg/{rtg_oid}/stripeConnect | Begin the processing of connecting with Stripe
[**updatePaymentsConfiguration**](ConfigurationApi.md#updatePaymentsConfiguration) | **PUT** /configuration/checkout/payments | Updates payments configuration
[**updatePaymentsTransactionGateway**](ConfigurationApi.md#updatePaymentsTransactionGateway) | **PUT** /configuration/checkout/payments/tg | Updates payments transaction gateway
[**updateRotatingTransactionGateway**](ConfigurationApi.md#updateRotatingTransactionGateway) | **PUT** /configuration/checkout/payments/rtg/{rtg_oid} | Update a rotating transaction gateway
[**wepayEnroll**](ConfigurationApi.md#wepayEnroll) | **PUT** /configuration/checkout/wepayEnroll | Enroll with WePay


<a name="delayAutoOrders"></a>
# **delayAutoOrders**
> DelayAutoOrdersResponse delayAutoOrders(rtgOid)

Delay auto order processing for a day for this rotating transaction gateway

Delay auto order processing for a day for this rotating transaction gateway 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

Integer rtgOid = 56; // Integer | The rtg_oid to delay.
try {
    DelayAutoOrdersResponse result = apiInstance.delayAutoOrders(rtgOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#delayAutoOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rtgOid** | **Integer**| The rtg_oid to delay. |

### Return type

[**DelayAutoOrdersResponse**](DelayAutoOrdersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="deleteRotatingTransactionGateway"></a>
# **deleteRotatingTransactionGateway**
> BaseResponse deleteRotatingTransactionGateway(rtgOid)

Delete a rotating transaction gateway

Delete a rotating transaction gateway 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

Integer rtgOid = 56; // Integer | The rtg_oid to delete.
try {
    BaseResponse result = apiInstance.deleteRotatingTransactionGateway(rtgOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#deleteRotatingTransactionGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rtgOid** | **Integer**| The rtg_oid to delete. |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getPaymentsConfiguration"></a>
# **getPaymentsConfiguration**
> PaymentsConfigurationResponse getPaymentsConfiguration()

Retrieve payments configuration

Retrieves payments configuration for this account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

try {
    PaymentsConfigurationResponse result = apiInstance.getPaymentsConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getPaymentsConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PaymentsConfigurationResponse**](PaymentsConfigurationResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentsRotatingGateway"></a>
# **getPaymentsRotatingGateway**
> RotatingTransactionGatewayResponse getPaymentsRotatingGateway(rtgOid)

Retrieve a rotating transaction gateway

Retrieve a rotating transaction gateway 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

Integer rtgOid = 56; // Integer | The rtg_oid for the desired record.
try {
    RotatingTransactionGatewayResponse result = apiInstance.getPaymentsRotatingGateway(rtgOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getPaymentsRotatingGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rtgOid** | **Integer**| The rtg_oid for the desired record. |

### Return type

[**RotatingTransactionGatewayResponse**](RotatingTransactionGatewayResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentsRotatingGatewayByCode"></a>
# **getPaymentsRotatingGatewayByCode**
> RotatingTransactionGatewayResponse getPaymentsRotatingGatewayByCode(code)

Retrieve a rotating transaction gateway by code

Retrieve a rotating transaction gateway by code 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

String code = "code_example"; // String | The code for the desired rotating transaction gateway.
try {
    RotatingTransactionGatewayResponse result = apiInstance.getPaymentsRotatingGatewayByCode(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getPaymentsRotatingGatewayByCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The code for the desired rotating transaction gateway. |

### Return type

[**RotatingTransactionGatewayResponse**](RotatingTransactionGatewayResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentsRotatingTransactionGateways"></a>
# **getPaymentsRotatingTransactionGateways**
> RotatingTransactionGatewaysResponse getPaymentsRotatingTransactionGateways()

Retrieve a list of rotating transaction gateways

Retrieve a list of rotating transaction gateways 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

try {
    RotatingTransactionGatewaysResponse result = apiInstance.getPaymentsRotatingTransactionGateways();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getPaymentsRotatingTransactionGateways");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RotatingTransactionGatewaysResponse**](RotatingTransactionGatewaysResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentsRtgSummaries"></a>
# **getPaymentsRtgSummaries**
> RtgSummaryResponse getPaymentsRtgSummaries()

Retrieve a summary of rotating transaction gateways

Retrieve a summary of rotating transaction gateways 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

try {
    RtgSummaryResponse result = apiInstance.getPaymentsRtgSummaries();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getPaymentsRtgSummaries");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RtgSummaryResponse**](RtgSummaryResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentsTransactionGateways"></a>
# **getPaymentsTransactionGateways**
> TransactionGatewaysResponse getPaymentsTransactionGateways()

Retrieve a list of transaction gateways

Retrieve a list of transaction gateways 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

try {
    TransactionGatewaysResponse result = apiInstance.getPaymentsTransactionGateways();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#getPaymentsTransactionGateways");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TransactionGatewaysResponse**](TransactionGatewaysResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertRotatingTransactionGateway"></a>
# **insertRotatingTransactionGateway**
> RotatingTransactionGatewayResponse insertRotatingTransactionGateway(rotatingTransactionGateway)

Insert a rotating transaction gateway

Insert a rotating transaction gateway 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

RotatingTransactionGateway rotatingTransactionGateway = new RotatingTransactionGateway(); // RotatingTransactionGateway | Rotating transaction gateway
try {
    RotatingTransactionGatewayResponse result = apiInstance.insertRotatingTransactionGateway(rotatingTransactionGateway);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#insertRotatingTransactionGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rotatingTransactionGateway** | [**RotatingTransactionGateway**](RotatingTransactionGateway.md)| Rotating transaction gateway |

### Return type

[**RotatingTransactionGatewayResponse**](RotatingTransactionGatewayResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="migrateToRotatingTransactionGateway"></a>
# **migrateToRotatingTransactionGateway**
> RotatingTransactionGatewayResponse migrateToRotatingTransactionGateway(code)

Migrate a normal transaction gateway to a rotating transaction gateway

Migrate a normal transaction gateway to a rotating transaction gateway 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

String code = "code_example"; // String | The short code for the new rotating transaction gateway
try {
    RotatingTransactionGatewayResponse result = apiInstance.migrateToRotatingTransactionGateway(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#migrateToRotatingTransactionGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| The short code for the new rotating transaction gateway |

### Return type

[**RotatingTransactionGatewayResponse**](RotatingTransactionGatewayResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="stripeConnect"></a>
# **stripeConnect**
> StripeConnectResponse stripeConnect(rtgOid)

Begin the processing of connecting with Stripe

Begin the processing of connecting with Stripe. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

Integer rtgOid = 56; // Integer | The rtg_oid to be connected to stripe.
try {
    StripeConnectResponse result = apiInstance.stripeConnect(rtgOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#stripeConnect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rtgOid** | **Integer**| The rtg_oid to be connected to stripe. |

### Return type

[**StripeConnectResponse**](StripeConnectResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updatePaymentsConfiguration"></a>
# **updatePaymentsConfiguration**
> PaymentsConfigurationResponse updatePaymentsConfiguration(paymentsConfiguration)

Updates payments configuration

Updates payments configuration on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

PaymentsConfiguration paymentsConfiguration = new PaymentsConfiguration(); // PaymentsConfiguration | Payments configuration
try {
    PaymentsConfigurationResponse result = apiInstance.updatePaymentsConfiguration(paymentsConfiguration);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#updatePaymentsConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentsConfiguration** | [**PaymentsConfiguration**](PaymentsConfiguration.md)| Payments configuration |

### Return type

[**PaymentsConfigurationResponse**](PaymentsConfigurationResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updatePaymentsTransactionGateway"></a>
# **updatePaymentsTransactionGateway**
> TransactionGatewaysResponse updatePaymentsTransactionGateway(updateGatewayRequest)

Updates payments transaction gateway

Updates payments transaction gateway on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

TransactionGatewaysRequest updateGatewayRequest = new TransactionGatewaysRequest(); // TransactionGatewaysRequest | Transaction gateways
try {
    TransactionGatewaysResponse result = apiInstance.updatePaymentsTransactionGateway(updateGatewayRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#updatePaymentsTransactionGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateGatewayRequest** | [**TransactionGatewaysRequest**](TransactionGatewaysRequest.md)| Transaction gateways |

### Return type

[**TransactionGatewaysResponse**](TransactionGatewaysResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateRotatingTransactionGateway"></a>
# **updateRotatingTransactionGateway**
> RotatingTransactionGateway updateRotatingTransactionGateway(rtgOid, rotatingTransactionGateway)

Update a rotating transaction gateway

Update a rotating transaction gateway 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

Integer rtgOid = 56; // Integer | The rtg_oid to update.
RotatingTransactionGateway rotatingTransactionGateway = new RotatingTransactionGateway(); // RotatingTransactionGateway | Rotating transaction gateway
try {
    RotatingTransactionGateway result = apiInstance.updateRotatingTransactionGateway(rtgOid, rotatingTransactionGateway);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#updateRotatingTransactionGateway");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rtgOid** | **Integer**| The rtg_oid to update. |
 **rotatingTransactionGateway** | [**RotatingTransactionGateway**](RotatingTransactionGateway.md)| Rotating transaction gateway |

### Return type

[**RotatingTransactionGateway**](RotatingTransactionGateway.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="wepayEnroll"></a>
# **wepayEnroll**
> PaymentsConfigurationResponse wepayEnroll(wepayEnroll)

Enroll with WePay

Enroll with WePay on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ConfigurationApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ConfigurationApi apiInstance = new ConfigurationApi(apiKey);

PaymentsWepayEnroll wepayEnroll = new PaymentsWepayEnroll(); // PaymentsWepayEnroll | Wepay enrollment information
try {
    PaymentsConfigurationResponse result = apiInstance.wepayEnroll(wepayEnroll);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConfigurationApi#wepayEnroll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wepayEnroll** | [**PaymentsWepayEnroll**](PaymentsWepayEnroll.md)| Wepay enrollment information |

### Return type

[**PaymentsConfigurationResponse**](PaymentsConfigurationResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

