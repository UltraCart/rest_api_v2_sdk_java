# OauthApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthAccessToken**](OauthApi.md#oauthAccessToken) | **POST** /oauth/token | Exchange authorization code for access token.
[**oauthRevoke**](OauthApi.md#oauthRevoke) | **POST** /oauth/revoke | Revoke this OAuth application.


<a name="oauthAccessToken"></a>
# **oauthAccessToken**
> OauthTokenResponse oauthAccessToken(clientId, grantType, code, redirectUri, refreshToken)

Exchange authorization code for access token.

The final leg in the OAuth process which exchanges the specified access token for the access code needed to make API calls. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OauthApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OauthApi apiInstance = new OauthApi(apiKey);

String clientId = "clientId_example"; // String | The OAuth application client_id.
String grantType = "grantType_example"; // String | Type of grant
String code = "code_example"; // String | Authorization code received back from the browser redirect
String redirectUri = "redirectUri_example"; // String | The URI that you redirect the browser to start the authorization process
String refreshToken = "refreshToken_example"; // String | The refresh token received during the original grant_type=authorization_code that can be used to return a new access token
try {
    OauthTokenResponse result = apiInstance.oauthAccessToken(clientId, grantType, code, redirectUri, refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthApi#oauthAccessToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The OAuth application client_id. |
 **grantType** | **String**| Type of grant |
 **code** | **String**| Authorization code received back from the browser redirect | [optional]
 **redirectUri** | **String**| The URI that you redirect the browser to start the authorization process | [optional]
 **refreshToken** | **String**| The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token | [optional]

### Return type

[**OauthTokenResponse**](OauthTokenResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="oauthRevoke"></a>
# **oauthRevoke**
> OauthRevokeSuccessResponse oauthRevoke(clientId, token)

Revoke this OAuth application.

Revokes the OAuth application associated with the specified client_id and token. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.OauthApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
OauthApi apiInstance = new OauthApi(apiKey);

String clientId = "clientId_example"; // String | The OAuth application client_id.
String token = "token_example"; // String | The OAuth access token that is to be revoked..
try {
    OauthRevokeSuccessResponse result = apiInstance.oauthRevoke(clientId, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthApi#oauthRevoke");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The OAuth application client_id. |
 **token** | **String**| The OAuth access token that is to be revoked.. |

### Return type

[**OauthRevokeSuccessResponse**](OauthRevokeSuccessResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

