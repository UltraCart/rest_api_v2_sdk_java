/*
 * UltraCart Rest API V2
 * This is the next generation UltraCart REST API...
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ultracart.admin.v2;

import com.ultracart.admin.v2.swagger.ApiCallback;
import com.ultracart.admin.v2.swagger.ApiClient;
import com.ultracart.admin.v2.swagger.ApiException;
import com.ultracart.admin.v2.swagger.ApiResponse;
import com.ultracart.admin.v2.swagger.Configuration;
import com.ultracart.admin.v2.swagger.Pair;
import com.ultracart.admin.v2.swagger.ProgressRequestBody;
import com.ultracart.admin.v2.swagger.ProgressResponseBody;

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

public class OauthApi {
    private ApiClient apiClient;

    public OauthApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OauthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for oauthAccessToken
     * @param clientId The OAuth application client_id. (required)
     * @param grantType Type of grant (required)
     * @param code Authorization code received back from the browser redirect (optional)
     * @param redirectUri The URI that you redirect the browser to to start the authorization process (optional)
     * @param refreshToken The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthAccessTokenCall(String clientId, String grantType, String code, String redirectUri, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (clientId != null)
        localVarFormParams.put("client_id", clientId);
        if (grantType != null)
        localVarFormParams.put("grant_type", grantType);
        if (code != null)
        localVarFormParams.put("code", code);
        if (redirectUri != null)
        localVarFormParams.put("redirect_uri", redirectUri);
        if (refreshToken != null)
        localVarFormParams.put("refresh_token", refreshToken);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ultraCartBrowserApiKey", "ultraCartOauth", "ultraCartSimpleApiKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call oauthAccessTokenValidateBeforeCall(String clientId, String grantType, String code, String redirectUri, String refreshToken, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling oauthAccessToken(Async)");
        }
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling oauthAccessToken(Async)");
        }
        
        
        com.squareup.okhttp.Call call = oauthAccessTokenCall(clientId, grantType, code, redirectUri, refreshToken, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Exchange authorization code for access token.
     * The final leg in the OAuth process which exchanges the specified access token for the access code needed to make API calls. 
     * @param clientId The OAuth application client_id. (required)
     * @param grantType Type of grant (required)
     * @param code Authorization code received back from the browser redirect (optional)
     * @param redirectUri The URI that you redirect the browser to to start the authorization process (optional)
     * @param refreshToken The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token (optional)
     * @return OauthTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthTokenResponse oauthAccessToken(String clientId, String grantType, String code, String redirectUri, String refreshToken) throws ApiException {
        ApiResponse<OauthTokenResponse> resp = oauthAccessTokenWithHttpInfo(clientId, grantType, code, redirectUri, refreshToken);
        return resp.getData();
    }

    /**
     * Exchange authorization code for access token.
     * The final leg in the OAuth process which exchanges the specified access token for the access code needed to make API calls. 
     * @param clientId The OAuth application client_id. (required)
     * @param grantType Type of grant (required)
     * @param code Authorization code received back from the browser redirect (optional)
     * @param redirectUri The URI that you redirect the browser to to start the authorization process (optional)
     * @param refreshToken The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token (optional)
     * @return ApiResponse&lt;OauthTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OauthTokenResponse> oauthAccessTokenWithHttpInfo(String clientId, String grantType, String code, String redirectUri, String refreshToken) throws ApiException {
        com.squareup.okhttp.Call call = oauthAccessTokenValidateBeforeCall(clientId, grantType, code, redirectUri, refreshToken, null, null);
        Type localVarReturnType = new TypeToken<OauthTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Exchange authorization code for access token. (asynchronously)
     * The final leg in the OAuth process which exchanges the specified access token for the access code needed to make API calls. 
     * @param clientId The OAuth application client_id. (required)
     * @param grantType Type of grant (required)
     * @param code Authorization code received back from the browser redirect (optional)
     * @param redirectUri The URI that you redirect the browser to to start the authorization process (optional)
     * @param refreshToken The refresh token received during the original grant_type&#x3D;authorization_code that can be used to return a new access token (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthAccessTokenAsync(String clientId, String grantType, String code, String redirectUri, String refreshToken, final ApiCallback<OauthTokenResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = oauthAccessTokenValidateBeforeCall(clientId, grantType, code, redirectUri, refreshToken, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OauthTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for oauthRevoke
     * @param clientId The OAuth application client_id. (required)
     * @param token The OAuth access token that is to be revoked.. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call oauthRevokeCall(String clientId, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/oauth/revoke";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (clientId != null)
        localVarFormParams.put("client_id", clientId);
        if (token != null)
        localVarFormParams.put("token", token);

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ultraCartBrowserApiKey", "ultraCartOauth", "ultraCartSimpleApiKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call oauthRevokeValidateBeforeCall(String clientId, String token, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new ApiException("Missing the required parameter 'clientId' when calling oauthRevoke(Async)");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling oauthRevoke(Async)");
        }
        
        
        com.squareup.okhttp.Call call = oauthRevokeCall(clientId, token, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Revoke this OAuth application.
     * Revokes the OAuth application associated with the specified client_id and token. 
     * @param clientId The OAuth application client_id. (required)
     * @param token The OAuth access token that is to be revoked.. (required)
     * @return OauthRevokeSuccessResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OauthRevokeSuccessResponse oauthRevoke(String clientId, String token) throws ApiException {
        ApiResponse<OauthRevokeSuccessResponse> resp = oauthRevokeWithHttpInfo(clientId, token);
        return resp.getData();
    }

    /**
     * Revoke this OAuth application.
     * Revokes the OAuth application associated with the specified client_id and token. 
     * @param clientId The OAuth application client_id. (required)
     * @param token The OAuth access token that is to be revoked.. (required)
     * @return ApiResponse&lt;OauthRevokeSuccessResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OauthRevokeSuccessResponse> oauthRevokeWithHttpInfo(String clientId, String token) throws ApiException {
        com.squareup.okhttp.Call call = oauthRevokeValidateBeforeCall(clientId, token, null, null);
        Type localVarReturnType = new TypeToken<OauthRevokeSuccessResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Revoke this OAuth application. (asynchronously)
     * Revokes the OAuth application associated with the specified client_id and token. 
     * @param clientId The OAuth application client_id. (required)
     * @param token The OAuth access token that is to be revoked.. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call oauthRevokeAsync(String clientId, String token, final ApiCallback<OauthRevokeSuccessResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = oauthRevokeValidateBeforeCall(clientId, token, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OauthRevokeSuccessResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}