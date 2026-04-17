# ConversationEmbedApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**embedOauthDeviceAuthorize**](ConversationEmbedApi.md#embedOauthDeviceAuthorize) | **POST** /conversation_embed/oauth/device/authorize | Initiate a device authorization flow for an embed widget. |
| [**embedOauthRevoke**](ConversationEmbedApi.md#embedOauthRevoke) | **POST** /conversation_embed/oauth/device/revoke | Revoke an embed widget access or refresh token. |
| [**embedOauthToken**](ConversationEmbedApi.md#embedOauthToken) | **POST** /conversation_embed/oauth/device/token | Exchange a device_code or refresh_token for an access token (embed widget). |
| [**getEmbedPbxAuth**](ConversationEmbedApi.md#getEmbedPbxAuth) | **PUT** /conversation_embed/pbx-auth | Get PBX authorization for the embedded softphone widget. |


<a name="embedOauthDeviceAuthorize"></a>
# **embedOauthDeviceAuthorize**
> embedOauthDeviceAuthorize(clientId, scope)

Initiate a device authorization flow for an embed widget.

RFC 8628 device authorization. Only the embed widget&#39;s client_id and the crm_embed scope are accepted. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| The embed widget OAuth client_id. | |
| **scope** | **String**| The application-level scope (must be &#39;crm_embed&#39;). | |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="embedOauthRevoke"></a>
# **embedOauthRevoke**
> embedOauthRevoke(clientId, token)

Revoke an embed widget access or refresh token.

RFC 7009 style â€” the token itself is proof of possession. Accepts either an access token or a refresh token in the &#39;token&#39; parameter. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| The embed widget OAuth client_id. | |
| **token** | **String**| The token to revoke (access token or refresh token). | |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="embedOauthToken"></a>
# **embedOauthToken**
> embedOauthToken(clientId, grantType, deviceCode, refreshToken)

Exchange a device_code or refresh_token for an access token (embed widget).

Accepts grant_type&#x3D;urn:ietf:params:oauth:grant-type:device_code or grant_type&#x3D;refresh_token. Other grant types are rejected. Access tokens issued here expire in 60 minutes. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| The embed widget OAuth client_id. | |
| **grantType** | **String**| Grant type. | |
| **deviceCode** | **String**| The device code received from /oauth/device/authorize (required for device_code grant). | [optional] |
| **refreshToken** | **String**| The refresh token (required for refresh_token grant). | [optional] |

### Return type

null (empty response body)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getEmbedPbxAuth"></a>
# **getEmbedPbxAuth**
> ConversationEmbedPbxAuthResponse getEmbedPbxAuth()

Get PBX authorization for the embedded softphone widget.

Returns a narrow subset of agent auth fields â€” only what the softphone widget needs to connect to the PBX relay. Twilio tokens, conversation JWTs, and chat/customer permissions are intentionally excluded. 

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationEmbedPbxAuthResponse**](ConversationEmbedPbxAuthResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth)

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

