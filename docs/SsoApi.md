# SsoApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSsoSessionUser**](SsoApi.md#getSsoSessionUser) | **GET** /sso/session/user | Get single sign on session user
[**ssoAuthorize**](SsoApi.md#ssoAuthorize) | **PUT** /sso/authorize | Authorize a single sign on session
[**ssoSessionRevoke**](SsoApi.md#ssoSessionRevoke) | **DELETE** /sso/session/revoke | Revoke single sign on session
[**ssoToken**](SsoApi.md#ssoToken) | **PUT** /sso/token | Exchange a single sign on code for a simple key token


<a name="getSsoSessionUser"></a>
# **getSsoSessionUser**
> User getSsoSessionUser()

Get single sign on session user

This is the equivalent of logging out of the single sign on session 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.SsoApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
SsoApi apiInstance = new SsoApi(apiKey);

try {
    User result = apiInstance.getSsoSessionUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoApi#getSsoSessionUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="ssoAuthorize"></a>
# **ssoAuthorize**
> ItemsResponse ssoAuthorize(authorizationRequest)

Authorize a single sign on session

Starts the process of authorizing a single sign on session. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.SsoApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
SsoApi apiInstance = new SsoApi(apiKey);

SingleSignOnAuthorizeRequest authorizationRequest = new SingleSignOnAuthorizeRequest(); // SingleSignOnAuthorizeRequest | Authorization request
try {
    ItemsResponse result = apiInstance.ssoAuthorize(authorizationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoApi#ssoAuthorize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizationRequest** | [**SingleSignOnAuthorizeRequest**](SingleSignOnAuthorizeRequest.md)| Authorization request |

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="ssoSessionRevoke"></a>
# **ssoSessionRevoke**
> ssoSessionRevoke()

Revoke single sign on session

This is the equivalent of logging out of the single sign on session 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.SsoApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
SsoApi apiInstance = new SsoApi(apiKey);

try {
    apiInstance.ssoSessionRevoke();
} catch (ApiException e) {
    System.err.println("Exception when calling SsoApi#ssoSessionRevoke");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="ssoToken"></a>
# **ssoToken**
> ItemsResponse ssoToken(tokenRequest)

Exchange a single sign on code for a simple key token

Called by your application after receiving the code back on the redirect URI to obtain a simple key token to make API calls with 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.SsoApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
SsoApi apiInstance = new SsoApi(apiKey);

SingleSignOnTokenRequest tokenRequest = new SingleSignOnTokenRequest(); // SingleSignOnTokenRequest | Token request
try {
    ItemsResponse result = apiInstance.ssoToken(tokenRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SsoApi#ssoToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenRequest** | [**SingleSignOnTokenRequest**](SingleSignOnTokenRequest.md)| Token request |

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

