/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ultracart.admin.v2;

import com.ultracart.admin.v2.util.ApiCallback;
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.ApiResponse;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.Pair;
import com.ultracart.admin.v2.util.ProgressRequestBody;
import com.ultracart.admin.v2.util.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ultracart.admin.v2.models.ErrorResponse;
import com.ultracart.admin.v2.models.OauthRevokeSuccessResponse;
import com.ultracart.admin.v2.models.OauthTokenResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OauthApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OauthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OauthApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }


  public OauthApi(String apiKey){
      ApiClient client = new ApiClient();

      com.ultracart.admin.v2.util.auth.ApiKeyAuth ultraCartSimpleApiKey = (com.ultracart.admin.v2.util.auth.ApiKeyAuth) client.getAuthentication("ultraCartSimpleApiKey");
      ultraCartSimpleApiKey.setApiKey(apiKey);

      client.addDefaultHeader("X-UltraCart-Api-Version", "2017-03-01");
      this.localVarApiClient = client;
  }

  public OauthApi(String apiKey, boolean verifySsl, boolean debugging){
      ApiClient client = new ApiClient();

      com.ultracart.admin.v2.util.auth.ApiKeyAuth ultraCartSimpleApiKey = (com.ultracart.admin.v2.util.auth.ApiKeyAuth) client.getAuthentication("ultraCartSimpleApiKey");
      ultraCartSimpleApiKey.setApiKey(apiKey);

      client.addDefaultHeader("X-UltraCart-Api-Version", "2017-03-01");

      client.setDebugging(debugging);
      client.setVerifyingSsl(verifySsl);
      this.localVarApiClient = client;
  }



    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for oauthAccessToken
     * @param clientId The OAuth application client_id. (required)
     * @param grantType Type of grant (required)
     * @param code Authorization code received back from the browser redirect (optional)
     * @param redirectUri The URI that you redirect the browser to start the authorization process (optional)
     * @param refreshToken The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Status Code 400: bad request input such as invalid json </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
        <tr><td> 500 </td><td> Status Code 500: any server side error.  the body will contain a generic server error message </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
     </table>
     */
    public okhttp3.Call oauthAccessTokenCall(String clientId, String grantType, String code, String redirectUri, String refreshToken, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/oauth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientId != null) {
            localVarFormParams.put("client_id", clientId);
        }

        if (grantType != null) {
            localVarFormParams.put("grant_type", grantType);
        }

        if (code != null) {
            localVarFormParams.put("code", code);
        }

        if (redirectUri != null) {
            localVarFormParams.put("redirect_uri", redirectUri);
        }

        if (refreshToken != null) {
            localVarFormParams.put("refresh_token", refreshToken);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ultraCartBrowserApiKey", "ultraCartOauth", "ultraCartSimpleApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call oauthAccessTokenValidateBeforeCall(String clientId, String grantType, String code, String redirectUri, String refreshToken, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling oauthAccessToken(Async)");
        }
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling oauthAccessToken(Async)");
        }
        

        okhttp3.Call localVarCall = oauthAccessTokenCall(clientId, grantType, code, redirectUri, refreshToken, _callback);
        return localVarCall;

    }

    /**
     * Exchange authorization code for access token.
     * The final leg in the OAuth process which exchanges the specified access token for the access code needed to make API calls. 
     * @param clientId The OAuth application client_id. (required)
     * @param grantType Type of grant (required)
     * @param code Authorization code received back from the browser redirect (optional)
     * @param redirectUri The URI that you redirect the browser to start the authorization process (optional)
     * @param refreshToken The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token (optional)
     * @return OauthTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Status Code 400: bad request input such as invalid json </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
        <tr><td> 500 </td><td> Status Code 500: any server side error.  the body will contain a generic server error message </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
     </table>
     */
    public OauthTokenResponse oauthAccessToken(String clientId, String grantType, String code, String redirectUri, String refreshToken) throws ApiException {
        ApiResponse<OauthTokenResponse> localVarResp = oauthAccessTokenWithHttpInfo(clientId, grantType, code, redirectUri, refreshToken);
        return localVarResp.getData();
    }

    /**
     * Exchange authorization code for access token.
     * The final leg in the OAuth process which exchanges the specified access token for the access code needed to make API calls. 
     * @param clientId The OAuth application client_id. (required)
     * @param grantType Type of grant (required)
     * @param code Authorization code received back from the browser redirect (optional)
     * @param redirectUri The URI that you redirect the browser to start the authorization process (optional)
     * @param refreshToken The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token (optional)
     * @return ApiResponse&lt;OauthTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Status Code 400: bad request input such as invalid json </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
        <tr><td> 500 </td><td> Status Code 500: any server side error.  the body will contain a generic server error message </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
     </table>
     */
    public ApiResponse<OauthTokenResponse> oauthAccessTokenWithHttpInfo(String clientId, String grantType, String code, String redirectUri, String refreshToken) throws ApiException {
        okhttp3.Call localVarCall = oauthAccessTokenValidateBeforeCall(clientId, grantType, code, redirectUri, refreshToken, null);
        Type localVarReturnType = new TypeToken<OauthTokenResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Exchange authorization code for access token. (asynchronously)
     * The final leg in the OAuth process which exchanges the specified access token for the access code needed to make API calls. 
     * @param clientId The OAuth application client_id. (required)
     * @param grantType Type of grant (required)
     * @param code Authorization code received back from the browser redirect (optional)
     * @param redirectUri The URI that you redirect the browser to start the authorization process (optional)
     * @param refreshToken The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Status Code 400: bad request input such as invalid json </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
        <tr><td> 500 </td><td> Status Code 500: any server side error.  the body will contain a generic server error message </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
     </table>
     */
    public okhttp3.Call oauthAccessTokenAsync(String clientId, String grantType, String code, String redirectUri, String refreshToken, final ApiCallback<OauthTokenResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = oauthAccessTokenValidateBeforeCall(clientId, grantType, code, redirectUri, refreshToken, _callback);
        Type localVarReturnType = new TypeToken<OauthTokenResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for oauthRevoke
     * @param clientId The OAuth application client_id. (required)
     * @param token The OAuth access token that is to be revoked.. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Status Code 400: bad request input such as invalid json </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
        <tr><td> 500 </td><td> Status Code 500: any server side error.  the body will contain a generic server error message </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
     </table>
     */
    public okhttp3.Call oauthRevokeCall(String clientId, String token, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/oauth/revoke";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clientId != null) {
            localVarFormParams.put("client_id", clientId);
        }

        if (token != null) {
            localVarFormParams.put("token", token);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ultraCartBrowserApiKey", "ultraCartOauth", "ultraCartSimpleApiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call oauthRevokeValidateBeforeCall(String clientId, String token, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling oauthRevoke(Async)");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling oauthRevoke(Async)");
        }
        

        okhttp3.Call localVarCall = oauthRevokeCall(clientId, token, _callback);
        return localVarCall;

    }

    /**
     * Revoke this OAuth application.
     * Revokes the OAuth application associated with the specified client_id and token. 
     * @param clientId The OAuth application client_id. (required)
     * @param token The OAuth access token that is to be revoked.. (required)
     * @return OauthRevokeSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Status Code 400: bad request input such as invalid json </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
        <tr><td> 500 </td><td> Status Code 500: any server side error.  the body will contain a generic server error message </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
     </table>
     */
    public OauthRevokeSuccessResponse oauthRevoke(String clientId, String token) throws ApiException {
        ApiResponse<OauthRevokeSuccessResponse> localVarResp = oauthRevokeWithHttpInfo(clientId, token);
        return localVarResp.getData();
    }

    /**
     * Revoke this OAuth application.
     * Revokes the OAuth application associated with the specified client_id and token. 
     * @param clientId The OAuth application client_id. (required)
     * @param token The OAuth access token that is to be revoked.. (required)
     * @return ApiResponse&lt;OauthRevokeSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Status Code 400: bad request input such as invalid json </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
        <tr><td> 500 </td><td> Status Code 500: any server side error.  the body will contain a generic server error message </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
     </table>
     */
    public ApiResponse<OauthRevokeSuccessResponse> oauthRevokeWithHttpInfo(String clientId, String token) throws ApiException {
        okhttp3.Call localVarCall = oauthRevokeValidateBeforeCall(clientId, token, null);
        Type localVarReturnType = new TypeToken<OauthRevokeSuccessResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Revoke this OAuth application. (asynchronously)
     * Revokes the OAuth application associated with the specified client_id and token. 
     * @param clientId The OAuth application client_id. (required)
     * @param token The OAuth access token that is to be revoked.. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Status Code 400: bad request input such as invalid json </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
        <tr><td> 500 </td><td> Status Code 500: any server side error.  the body will contain a generic server error message </td><td>  * UC-REST-ERROR - Contains human readable error message <br>  </td></tr>
     </table>
     */
    public okhttp3.Call oauthRevokeAsync(String clientId, String token, final ApiCallback<OauthRevokeSuccessResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = oauthRevokeValidateBeforeCall(clientId, token, _callback);
        Type localVarReturnType = new TypeToken<OauthRevokeSuccessResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
