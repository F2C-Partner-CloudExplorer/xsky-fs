/*
 * XMS API
 * XMS is the controller of distributed storage system
 *
 * OpenAPI spec version: XSCALEROS_6.2.000.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xio.sds.client.api;

import xio.sds.client.ApiCallback;
import xio.sds.client.ApiClient;
import xio.sds.client.ApiException;
import xio.sds.client.ApiResponse;
import xio.sds.client.Configuration;
import xio.sds.client.Pair;
import xio.sds.client.ProgressRequestBody;
import xio.sds.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import xio.sds.client.model.OSZoneTranslogResp;
import xio.sds.client.model.OSZoneTranslogsResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OsZoneTranslogsApi {
    private ApiClient apiClient;

    public OsZoneTranslogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OsZoneTranslogsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOSZoneTranslog
     * @param translogUuid translog uuid (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOSZoneTranslogCall(String translogUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/os-zone-translogs/{translog_uuid}"
            .replaceAll("\\{" + "translog_uuid" + "\\}", apiClient.escapeString(translogUuid.toString()));

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

        String[] localVarAuthNames = new String[] { "tokenInHeader", "tokenInQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOSZoneTranslogValidateBeforeCall(String translogUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'translogUuid' is set
        if (translogUuid == null) {
            throw new ApiException("Missing the required parameter 'translogUuid' when calling getOSZoneTranslog(Async)");
        }
        
        com.squareup.okhttp.Call call = getOSZoneTranslogCall(translogUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get a os zone translog
     * @param translogUuid translog uuid (required)
     * @return OSZoneTranslogResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSZoneTranslogResp getOSZoneTranslog(String translogUuid) throws ApiException {
        ApiResponse<OSZoneTranslogResp> resp = getOSZoneTranslogWithHttpInfo(translogUuid);
        return resp.getData();
    }

    /**
     * 
     * Get a os zone translog
     * @param translogUuid translog uuid (required)
     * @return ApiResponse&lt;OSZoneTranslogResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSZoneTranslogResp> getOSZoneTranslogWithHttpInfo(String translogUuid) throws ApiException {
        com.squareup.okhttp.Call call = getOSZoneTranslogValidateBeforeCall(translogUuid, null, null);
        Type localVarReturnType = new TypeToken<OSZoneTranslogResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a os zone translog
     * @param translogUuid translog uuid (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOSZoneTranslogAsync(String translogUuid, final ApiCallback<OSZoneTranslogResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOSZoneTranslogValidateBeforeCall(translogUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSZoneTranslogResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listOSZoneTranslogs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param epochUuid paging param (optional)
     * @param clusterId cluster id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listOSZoneTranslogsCall(Long limit, Long offset, String epochUuid, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/os-zone-translogs/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (epochUuid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("epoch_uuid", epochUuid));
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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

        String[] localVarAuthNames = new String[] { "tokenInHeader", "tokenInQuery" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listOSZoneTranslogsValidateBeforeCall(Long limit, Long offset, String epochUuid, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listOSZoneTranslogsCall(limit, offset, epochUuid, clusterId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List os zone translogs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param epochUuid paging param (optional)
     * @param clusterId cluster id (optional)
     * @return OSZoneTranslogsResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSZoneTranslogsResp listOSZoneTranslogs(Long limit, Long offset, String epochUuid, String clusterId) throws ApiException {
        ApiResponse<OSZoneTranslogsResp> resp = listOSZoneTranslogsWithHttpInfo(limit, offset, epochUuid, clusterId);
        return resp.getData();
    }

    /**
     * 
     * List os zone translogs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param epochUuid paging param (optional)
     * @param clusterId cluster id (optional)
     * @return ApiResponse&lt;OSZoneTranslogsResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSZoneTranslogsResp> listOSZoneTranslogsWithHttpInfo(Long limit, Long offset, String epochUuid, String clusterId) throws ApiException {
        com.squareup.okhttp.Call call = listOSZoneTranslogsValidateBeforeCall(limit, offset, epochUuid, clusterId, null, null);
        Type localVarReturnType = new TypeToken<OSZoneTranslogsResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List os zone translogs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param epochUuid paging param (optional)
     * @param clusterId cluster id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOSZoneTranslogsAsync(Long limit, Long offset, String epochUuid, String clusterId, final ApiCallback<OSZoneTranslogsResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOSZoneTranslogsValidateBeforeCall(limit, offset, epochUuid, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSZoneTranslogsResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
