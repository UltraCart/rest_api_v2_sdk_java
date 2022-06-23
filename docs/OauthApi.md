# OauthApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**oauthAccessToken**](OauthApi.md#oauthAccessToken) | **POST** /oauth/token | Exchange authorization code for access token. |
| [**oauthRevoke**](OauthApi.md#oauthRevoke) | **POST** /oauth/revoke | Revoke this OAuth application. |


<a name="oauthAccessToken"></a>
# **oauthAccessToken**
> OauthTokenResponse oauthAccessToken(clientId, grantType, code, redirectUri, refreshToken)

Exchange authorization code for access token.

The final leg in the OAuth process which exchanges the specified access token for the access code needed to make API calls. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.swagger.ApiClient;
import com.ultracart.admin.v2.swagger.ApiException;
import com.ultracart.admin.v2.swagger.Configuration;
import com.ultracart.admin.v2.swagger.auth.*;
import com.ultracart.admin.v2.swagger.models.*;
import com.ultracart.admin.v2.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://secure.ultracart.com/rest/v2");
    
    // Configure API key authorization: ultraCartBrowserApiKey
    ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
    ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartBrowserApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: ultraCartOauth
    OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
    ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ultraCartSimpleApiKey
    ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
    ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartSimpleApiKey.setApiKeyPrefix("Token");

    OauthApi apiInstance = new OauthApi(defaultClient);
    String clientId = "clientId_example"; // String | The OAuth application client_id.
    String grantType = "grantType_example"; // String | Type of grant
    String code = "code_example"; // String | Authorization code received back from the browser redirect
    String redirectUri = "redirectUri_example"; // String | The URI that you redirect the browser to to start the authorization process
    String refreshToken = "refreshToken_example"; // String | The refresh token received during the original grant_type=authorization_code that can be used to return a new access token
    try {
      OauthTokenResponse result = apiInstance.oauthAccessToken(clientId, grantType, code, redirectUri, refreshToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#oauthAccessToken");
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
| **clientId** | **String**| The OAuth application client_id. | |
| **grantType** | **String**| Type of grant | |
| **code** | **String**| Authorization code received back from the browser redirect | [optional] |
| **redirectUri** | **String**| The URI that you redirect the browser to to start the authorization process | [optional] |
| **refreshToken** | **String**| The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token | [optional] |

### Return type

[**OauthTokenResponse**](OauthTokenResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="oauthRevoke"></a>
# **oauthRevoke**
> OauthRevokeSuccessResponse oauthRevoke(clientId, token)

Revoke this OAuth application.

Revokes the OAuth application associated with the specified client_id and token. 

### Example
```java
// Import classes:
import com.ultracart.admin.v2.swagger.ApiClient;
import com.ultracart.admin.v2.swagger.ApiException;
import com.ultracart.admin.v2.swagger.Configuration;
import com.ultracart.admin.v2.swagger.auth.*;
import com.ultracart.admin.v2.swagger.models.*;
import com.ultracart.admin.v2.OauthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://secure.ultracart.com/rest/v2");
    
    // Configure API key authorization: ultraCartBrowserApiKey
    ApiKeyAuth ultraCartBrowserApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartBrowserApiKey");
    ultraCartBrowserApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartBrowserApiKey.setApiKeyPrefix("Token");

    // Configure OAuth2 access token for authorization: ultraCartOauth
    OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
    ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: ultraCartSimpleApiKey
    ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
    ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ultraCartSimpleApiKey.setApiKeyPrefix("Token");

    OauthApi apiInstance = new OauthApi(defaultClient);
    String clientId = "clientId_example"; // String | The OAuth application client_id.
    String token = "token_example"; // String | The OAuth access token that is to be revoked..
    try {
      OauthRevokeSuccessResponse result = apiInstance.oauthRevoke(clientId, token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OauthApi#oauthRevoke");
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
| **clientId** | **String**| The OAuth application client_id. | |
| **token** | **String**| The OAuth access token that is to be revoked.. | |

### Return type

[**OauthRevokeSuccessResponse**](OauthRevokeSuccessResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

