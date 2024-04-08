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


import xio.sds.client.model.DfsTierAddPoolReq;
import xio.sds.client.model.DfsTierRemovePoolReq;
import xio.sds.client.model.DfsTierResp;
import xio.sds.client.model.DfsTiersResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DfsTiersApi {
    private ApiClient apiClient;

    public DfsTiersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DfsTiersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addDfsTierPools
     * @param body pools info (required)
     * @param dfsTierId dfs tier id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addDfsTierPoolsCall(DfsTierAddPoolReq body, Long dfsTierId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-tiers/{dfs_tier_id}:add-pools"
            .replaceAll("\\{" + "dfs_tier_id" + "\\}", apiClient.escapeString(dfsTierId.toString()));

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

        String[] localVarAuthNames = new String[] { "tokenInHeader", "tokenInQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addDfsTierPoolsValidateBeforeCall(DfsTierAddPoolReq body, Long dfsTierId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addDfsTierPools(Async)");
        }
        // verify the required parameter 'dfsTierId' is set
        if (dfsTierId == null) {
            throw new ApiException("Missing the required parameter 'dfsTierId' when calling addDfsTierPools(Async)");
        }
        
        com.squareup.okhttp.Call call = addDfsTierPoolsCall(body, dfsTierId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * add dfs tier pools
     * @param body pools info (required)
     * @param dfsTierId dfs tier id (required)
     * @return DfsTierResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsTierResp addDfsTierPools(DfsTierAddPoolReq body, Long dfsTierId) throws ApiException {
        ApiResponse<DfsTierResp> resp = addDfsTierPoolsWithHttpInfo(body, dfsTierId);
        return resp.getData();
    }

    /**
     * 
     * add dfs tier pools
     * @param body pools info (required)
     * @param dfsTierId dfs tier id (required)
     * @return ApiResponse&lt;DfsTierResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsTierResp> addDfsTierPoolsWithHttpInfo(DfsTierAddPoolReq body, Long dfsTierId) throws ApiException {
        com.squareup.okhttp.Call call = addDfsTierPoolsValidateBeforeCall(body, dfsTierId, null, null);
        Type localVarReturnType = new TypeToken<DfsTierResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * add dfs tier pools
     * @param body pools info (required)
     * @param dfsTierId dfs tier id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addDfsTierPoolsAsync(DfsTierAddPoolReq body, Long dfsTierId, final ApiCallback<DfsTierResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addDfsTierPoolsValidateBeforeCall(body, dfsTierId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsTierResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDfsTier
     * @param dfsTierId dfs tier id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDfsTierCall(Long dfsTierId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-tiers/{dfs_tier_id}"
            .replaceAll("\\{" + "dfs_tier_id" + "\\}", apiClient.escapeString(dfsTierId.toString()));

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
    private com.squareup.okhttp.Call getDfsTierValidateBeforeCall(Long dfsTierId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'dfsTierId' is set
        if (dfsTierId == null) {
            throw new ApiException("Missing the required parameter 'dfsTierId' when calling getDfsTier(Async)");
        }
        
        com.squareup.okhttp.Call call = getDfsTierCall(dfsTierId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get dfs tier
     * @param dfsTierId dfs tier id (required)
     * @return DfsTierResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsTierResp getDfsTier(Long dfsTierId) throws ApiException {
        ApiResponse<DfsTierResp> resp = getDfsTierWithHttpInfo(dfsTierId);
        return resp.getData();
    }

    /**
     * 
     * Get dfs tier
     * @param dfsTierId dfs tier id (required)
     * @return ApiResponse&lt;DfsTierResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsTierResp> getDfsTierWithHttpInfo(Long dfsTierId) throws ApiException {
        com.squareup.okhttp.Call call = getDfsTierValidateBeforeCall(dfsTierId, null, null);
        Type localVarReturnType = new TypeToken<DfsTierResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get dfs tier
     * @param dfsTierId dfs tier id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDfsTierAsync(Long dfsTierId, final ApiCallback<DfsTierResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDfsTierValidateBeforeCall(dfsTierId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsTierResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listDfsTiers
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param dfsRootfsId dfs rootfs id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDfsTiersCall(Long limit, Long offset, String clusterId, Long dfsRootfsId, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-tiers/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));
        if (dfsRootfsId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dfs_rootfs_id", dfsRootfsId));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));

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
    private com.squareup.okhttp.Call listDfsTiersValidateBeforeCall(Long limit, Long offset, String clusterId, Long dfsRootfsId, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listDfsTiersCall(limit, offset, clusterId, dfsRootfsId, q, sort, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List dfs tiers
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param dfsRootfsId dfs rootfs id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return DfsTiersResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsTiersResp listDfsTiers(Long limit, Long offset, String clusterId, Long dfsRootfsId, String q, String sort) throws ApiException {
        ApiResponse<DfsTiersResp> resp = listDfsTiersWithHttpInfo(limit, offset, clusterId, dfsRootfsId, q, sort);
        return resp.getData();
    }

    /**
     * 
     * List dfs tiers
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param dfsRootfsId dfs rootfs id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return ApiResponse&lt;DfsTiersResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsTiersResp> listDfsTiersWithHttpInfo(Long limit, Long offset, String clusterId, Long dfsRootfsId, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = listDfsTiersValidateBeforeCall(limit, offset, clusterId, dfsRootfsId, q, sort, null, null);
        Type localVarReturnType = new TypeToken<DfsTiersResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dfs tiers
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param dfsRootfsId dfs rootfs id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDfsTiersAsync(Long limit, Long offset, String clusterId, Long dfsRootfsId, String q, String sort, final ApiCallback<DfsTiersResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDfsTiersValidateBeforeCall(limit, offset, clusterId, dfsRootfsId, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsTiersResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for removeDfsTierPools
     * @param body pools info (required)
     * @param dfsTierId dfs tier id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeDfsTierPoolsCall(DfsTierRemovePoolReq body, Long dfsTierId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-tiers/{dfs_tier_id}:remove-pools"
            .replaceAll("\\{" + "dfs_tier_id" + "\\}", apiClient.escapeString(dfsTierId.toString()));

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

        String[] localVarAuthNames = new String[] { "tokenInHeader", "tokenInQuery" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeDfsTierPoolsValidateBeforeCall(DfsTierRemovePoolReq body, Long dfsTierId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling removeDfsTierPools(Async)");
        }
        // verify the required parameter 'dfsTierId' is set
        if (dfsTierId == null) {
            throw new ApiException("Missing the required parameter 'dfsTierId' when calling removeDfsTierPools(Async)");
        }
        
        com.squareup.okhttp.Call call = removeDfsTierPoolsCall(body, dfsTierId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * remove dfs tier pools
     * @param body pools info (required)
     * @param dfsTierId dfs tier id (required)
     * @return DfsTierResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsTierResp removeDfsTierPools(DfsTierRemovePoolReq body, Long dfsTierId) throws ApiException {
        ApiResponse<DfsTierResp> resp = removeDfsTierPoolsWithHttpInfo(body, dfsTierId);
        return resp.getData();
    }

    /**
     * 
     * remove dfs tier pools
     * @param body pools info (required)
     * @param dfsTierId dfs tier id (required)
     * @return ApiResponse&lt;DfsTierResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsTierResp> removeDfsTierPoolsWithHttpInfo(DfsTierRemovePoolReq body, Long dfsTierId) throws ApiException {
        com.squareup.okhttp.Call call = removeDfsTierPoolsValidateBeforeCall(body, dfsTierId, null, null);
        Type localVarReturnType = new TypeToken<DfsTierResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * remove dfs tier pools
     * @param body pools info (required)
     * @param dfsTierId dfs tier id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeDfsTierPoolsAsync(DfsTierRemovePoolReq body, Long dfsTierId, final ApiCallback<DfsTierResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeDfsTierPoolsValidateBeforeCall(body, dfsTierId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsTierResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}