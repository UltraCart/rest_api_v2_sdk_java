/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
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
import java.io.File;
import com.ultracart.admin.v2.models.IntegrationLogQueryRequest;
import com.ultracart.admin.v2.models.IntegrationLogQueryResponse;
import com.ultracart.admin.v2.models.IntegrationLogResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegrationLogApi {
    private ApiClient apiClient;

    public IntegrationLogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IntegrationLogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  public IntegrationLogApi(String apiKey){
      ApiClient client = new ApiClient();

      com.ultracart.admin.v2.swagger.auth.ApiKeyAuth ultraCartSimpleApiKey = (com.ultracart.admin.v2.swagger.auth.ApiKeyAuth) client.getAuthentication("ultraCartSimpleApiKey");
      ultraCartSimpleApiKey.setApiKey(apiKey);

      client.addDefaultHeader("X-UltraCart-Api-Version", "2017-03-01");
      this.apiClient = client;
  }


  public IntegrationLogApi(String apiKey, boolean verifySsl, boolean debugging){
      ApiClient client = new ApiClient();

      com.ultracart.admin.v2.swagger.auth.ApiKeyAuth ultraCartSimpleApiKey = (com.ultracart.admin.v2.swagger.auth.ApiKeyAuth) client.getAuthentication("ultraCartSimpleApiKey");
      ultraCartSimpleApiKey.setApiKey(apiKey);

      client.addDefaultHeader("X-UltraCart-Api-Version", "2017-03-01");

      client.setDebugging(debugging);
      client.setVerifyingSsl(verifySsl);
      this.apiClient = client;
  }


    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getIntegrationLog
     * @param pk  (required)
     * @param sk  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIntegrationLogCall(String pk, String sk, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/integration_log/query/{pk}/{sk}"
            .replaceAll("\\{" + "pk" + "\\}", apiClient.escapeString(pk.toString()))
            .replaceAll("\\{" + "sk" + "\\}", apiClient.escapeString(sk.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "ultraCartOauth", "ultraCartSimpleApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getIntegrationLogValidateBeforeCall(String pk, String sk, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'pk' is set
        if (pk == null) {
            throw new ApiException("Missing the required parameter 'pk' when calling getIntegrationLog(Async)");
        }
        
        // verify the required parameter 'sk' is set
        if (sk == null) {
            throw new ApiException("Missing the required parameter 'sk' when calling getIntegrationLog(Async)");
        }
        

        com.squareup.okhttp.Call call = getIntegrationLogCall(pk, sk, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve an integration log
     * Retrieve an integration logs from the account based identifiers 
     * @param pk  (required)
     * @param sk  (required)
     * @return IntegrationLogResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IntegrationLogResponse getIntegrationLog(String pk, String sk) throws ApiException {
        ApiResponse<IntegrationLogResponse> resp = getIntegrationLogWithHttpInfo(pk, sk);
        return resp.getData();
    }

    /**
     * Retrieve an integration log
     * Retrieve an integration logs from the account based identifiers 
     * @param pk  (required)
     * @param sk  (required)
     * @return ApiResponse&lt;IntegrationLogResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IntegrationLogResponse> getIntegrationLogWithHttpInfo(String pk, String sk) throws ApiException {
        com.squareup.okhttp.Call call = getIntegrationLogValidateBeforeCall(pk, sk, null, null);
        Type localVarReturnType = new TypeToken<IntegrationLogResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve an integration log (asynchronously)
     * Retrieve an integration logs from the account based identifiers 
     * @param pk  (required)
     * @param sk  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIntegrationLogAsync(String pk, String sk, final ApiCallback<IntegrationLogResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIntegrationLogValidateBeforeCall(pk, sk, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IntegrationLogResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getIntegrationLogFile
     * @param pk  (required)
     * @param sk  (required)
     * @param uuid  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIntegrationLogFileCall(String pk, String sk, String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/integration_log/query/{pk}/{sk}/{uuid}"
            .replaceAll("\\{" + "pk" + "\\}", apiClient.escapeString(pk.toString()))
            .replaceAll("\\{" + "sk" + "\\}", apiClient.escapeString(sk.toString()))
            .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "ultraCartOauth", "ultraCartSimpleApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getIntegrationLogFileValidateBeforeCall(String pk, String sk, String uuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'pk' is set
        if (pk == null) {
            throw new ApiException("Missing the required parameter 'pk' when calling getIntegrationLogFile(Async)");
        }
        
        // verify the required parameter 'sk' is set
        if (sk == null) {
            throw new ApiException("Missing the required parameter 'sk' when calling getIntegrationLogFile(Async)");
        }
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getIntegrationLogFile(Async)");
        }
        

        com.squareup.okhttp.Call call = getIntegrationLogFileCall(pk, sk, uuid, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve an integration log file
     * Retrieve an integration log file from the account based identifiers 
     * @param pk  (required)
     * @param sk  (required)
     * @param uuid  (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getIntegrationLogFile(String pk, String sk, String uuid) throws ApiException {
        ApiResponse<File> resp = getIntegrationLogFileWithHttpInfo(pk, sk, uuid);
        return resp.getData();
    }

    /**
     * Retrieve an integration log file
     * Retrieve an integration log file from the account based identifiers 
     * @param pk  (required)
     * @param sk  (required)
     * @param uuid  (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getIntegrationLogFileWithHttpInfo(String pk, String sk, String uuid) throws ApiException {
        com.squareup.okhttp.Call call = getIntegrationLogFileValidateBeforeCall(pk, sk, uuid, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve an integration log file (asynchronously)
     * Retrieve an integration log file from the account based identifiers 
     * @param pk  (required)
     * @param sk  (required)
     * @param uuid  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIntegrationLogFileAsync(String pk, String sk, String uuid, final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIntegrationLogFileValidateBeforeCall(pk, sk, uuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getIntegrationLogsQuery
     * @param integrationLogQuery Integration log query (required)
     * @param limit The maximum number of records to return on this one API call. (Default 100, Max 500) (optional, default to 100)
     * @param offset Pagination of the record set.  Offset is a zero based index. (optional, default to 0)
     * @param sort The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIntegrationLogsQueryCall(IntegrationLogQueryRequest integrationLogQuery, Integer limit, Integer offset, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = integrationLogQuery;

        // create path and map variables
        String localVarPath = "/integration_log/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("_limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("_offset", offset));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("_sort", sort));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "ultraCartOauth", "ultraCartSimpleApiKey" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getIntegrationLogsQueryValidateBeforeCall(IntegrationLogQueryRequest integrationLogQuery, Integer limit, Integer offset, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'integrationLogQuery' is set
        if (integrationLogQuery == null) {
            throw new ApiException("Missing the required parameter 'integrationLogQuery' when calling getIntegrationLogsQuery(Async)");
        }
        

        com.squareup.okhttp.Call call = getIntegrationLogsQueryCall(integrationLogQuery, limit, offset, sort, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve integration logs
     * Retrieves a set of integration logs from the account based on a query object. 
     * @param integrationLogQuery Integration log query (required)
     * @param limit The maximum number of records to return on this one API call. (Default 100, Max 500) (optional, default to 100)
     * @param offset Pagination of the record set.  Offset is a zero based index. (optional, default to 0)
     * @param sort The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. (optional)
     * @return IntegrationLogQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public IntegrationLogQueryResponse getIntegrationLogsQuery(IntegrationLogQueryRequest integrationLogQuery, Integer limit, Integer offset, String sort) throws ApiException {
        ApiResponse<IntegrationLogQueryResponse> resp = getIntegrationLogsQueryWithHttpInfo(integrationLogQuery, limit, offset, sort);
        return resp.getData();
    }

    /**
     * Retrieve integration logs
     * Retrieves a set of integration logs from the account based on a query object. 
     * @param integrationLogQuery Integration log query (required)
     * @param limit The maximum number of records to return on this one API call. (Default 100, Max 500) (optional, default to 100)
     * @param offset Pagination of the record set.  Offset is a zero based index. (optional, default to 0)
     * @param sort The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. (optional)
     * @return ApiResponse&lt;IntegrationLogQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<IntegrationLogQueryResponse> getIntegrationLogsQueryWithHttpInfo(IntegrationLogQueryRequest integrationLogQuery, Integer limit, Integer offset, String sort) throws ApiException {
        com.squareup.okhttp.Call call = getIntegrationLogsQueryValidateBeforeCall(integrationLogQuery, limit, offset, sort, null, null);
        Type localVarReturnType = new TypeToken<IntegrationLogQueryResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve integration logs (asynchronously)
     * Retrieves a set of integration logs from the account based on a query object. 
     * @param integrationLogQuery Integration log query (required)
     * @param limit The maximum number of records to return on this one API call. (Default 100, Max 500) (optional, default to 100)
     * @param offset Pagination of the record set.  Offset is a zero based index. (optional, default to 0)
     * @param sort The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIntegrationLogsQueryAsync(IntegrationLogQueryRequest integrationLogQuery, Integer limit, Integer offset, String sort, final ApiCallback<IntegrationLogQueryResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getIntegrationLogsQueryValidateBeforeCall(integrationLogQuery, limit, offset, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<IntegrationLogQueryResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}