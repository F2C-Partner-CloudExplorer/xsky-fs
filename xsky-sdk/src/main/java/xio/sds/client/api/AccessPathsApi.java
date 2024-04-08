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


import xio.sds.client.model.AccessPathCreateReq;
import xio.sds.client.model.AccessPathResp;
import xio.sds.client.model.AccessPathUpdateReq;
import xio.sds.client.model.AccessPathsResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessPathsApi {
    private ApiClient apiClient;

    public AccessPathsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AccessPathsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createAccessPath
     * @param body access path info (required)
     * @param clusterId cluster id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAccessPathCall(AccessPathCreateReq body, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/access-paths/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call createAccessPathValidateBeforeCall(AccessPathCreateReq body, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createAccessPath(Async)");
        }
        
        com.squareup.okhttp.Call call = createAccessPathCall(body, clusterId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create an access path
     * @param body access path info (required)
     * @param clusterId cluster id (optional)
     * @return AccessPathResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccessPathResp createAccessPath(AccessPathCreateReq body, String clusterId) throws ApiException {
        ApiResponse<AccessPathResp> resp = createAccessPathWithHttpInfo(body, clusterId);
        return resp.getData();
    }

    /**
     * 
     * Create an access path
     * @param body access path info (required)
     * @param clusterId cluster id (optional)
     * @return ApiResponse&lt;AccessPathResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccessPathResp> createAccessPathWithHttpInfo(AccessPathCreateReq body, String clusterId) throws ApiException {
        com.squareup.okhttp.Call call = createAccessPathValidateBeforeCall(body, clusterId, null, null);
        Type localVarReturnType = new TypeToken<AccessPathResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create an access path
     * @param body access path info (required)
     * @param clusterId cluster id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAccessPathAsync(AccessPathCreateReq body, String clusterId, final ApiCallback<AccessPathResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAccessPathValidateBeforeCall(body, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessPathResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteAccessPath
     * @param accessPathId access path id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteAccessPathCall(Long accessPathId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/access-paths/{access_path_id}"
            .replaceAll("\\{" + "access_path_id" + "\\}", apiClient.escapeString(accessPathId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteAccessPathValidateBeforeCall(Long accessPathId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessPathId' is set
        if (accessPathId == null) {
            throw new ApiException("Missing the required parameter 'accessPathId' when calling deleteAccessPath(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteAccessPathCall(accessPathId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Delete access path
     * @param accessPathId access path id (required)
     * @return AccessPathResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccessPathResp deleteAccessPath(Long accessPathId) throws ApiException {
        ApiResponse<AccessPathResp> resp = deleteAccessPathWithHttpInfo(accessPathId);
        return resp.getData();
    }

    /**
     * 
     * Delete access path
     * @param accessPathId access path id (required)
     * @return ApiResponse&lt;AccessPathResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccessPathResp> deleteAccessPathWithHttpInfo(Long accessPathId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAccessPathValidateBeforeCall(accessPathId, null, null);
        Type localVarReturnType = new TypeToken<AccessPathResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete access path
     * @param accessPathId access path id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAccessPathAsync(Long accessPathId, final ApiCallback<AccessPathResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAccessPathValidateBeforeCall(accessPathId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessPathResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAccessPath
     * @param accessPathId access path id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAccessPathCall(Long accessPathId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/access-paths/{access_path_id}"
            .replaceAll("\\{" + "access_path_id" + "\\}", apiClient.escapeString(accessPathId.toString()));

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
    private com.squareup.okhttp.Call getAccessPathValidateBeforeCall(Long accessPathId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'accessPathId' is set
        if (accessPathId == null) {
            throw new ApiException("Missing the required parameter 'accessPathId' when calling getAccessPath(Async)");
        }
        
        com.squareup.okhttp.Call call = getAccessPathCall(accessPathId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get access path by id
     * @param accessPathId access path id (required)
     * @return AccessPathResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccessPathResp getAccessPath(Long accessPathId) throws ApiException {
        ApiResponse<AccessPathResp> resp = getAccessPathWithHttpInfo(accessPathId);
        return resp.getData();
    }

    /**
     * 
     * Get access path by id
     * @param accessPathId access path id (required)
     * @return ApiResponse&lt;AccessPathResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccessPathResp> getAccessPathWithHttpInfo(Long accessPathId) throws ApiException {
        com.squareup.okhttp.Call call = getAccessPathValidateBeforeCall(accessPathId, null, null);
        Type localVarReturnType = new TypeToken<AccessPathResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get access path by id
     * @param accessPathId access path id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccessPathAsync(Long accessPathId, final ApiCallback<AccessPathResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAccessPathValidateBeforeCall(accessPathId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessPathResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listAccessPaths
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param q query param of search (optional)
     * @param uid access path uid (optional)
     * @param clientGroupId related client group id (optional)
     * @param all show all access targets (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAccessPathsCall(Long limit, Long offset, String clusterId, String q, String uid, Long clientGroupId, Boolean all, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/access-paths/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (uid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("uid", uid));
        if (clientGroupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("client_group_id", clientGroupId));
        if (all != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("all", all));

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
    private com.squareup.okhttp.Call listAccessPathsValidateBeforeCall(Long limit, Long offset, String clusterId, String q, String uid, Long clientGroupId, Boolean all, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listAccessPathsCall(limit, offset, clusterId, q, uid, clientGroupId, all, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List access paths
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param q query param of search (optional)
     * @param uid access path uid (optional)
     * @param clientGroupId related client group id (optional)
     * @param all show all access targets (optional)
     * @return AccessPathsResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccessPathsResp listAccessPaths(Long limit, Long offset, String clusterId, String q, String uid, Long clientGroupId, Boolean all) throws ApiException {
        ApiResponse<AccessPathsResp> resp = listAccessPathsWithHttpInfo(limit, offset, clusterId, q, uid, clientGroupId, all);
        return resp.getData();
    }

    /**
     * 
     * List access paths
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param q query param of search (optional)
     * @param uid access path uid (optional)
     * @param clientGroupId related client group id (optional)
     * @param all show all access targets (optional)
     * @return ApiResponse&lt;AccessPathsResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccessPathsResp> listAccessPathsWithHttpInfo(Long limit, Long offset, String clusterId, String q, String uid, Long clientGroupId, Boolean all) throws ApiException {
        com.squareup.okhttp.Call call = listAccessPathsValidateBeforeCall(limit, offset, clusterId, q, uid, clientGroupId, all, null, null);
        Type localVarReturnType = new TypeToken<AccessPathsResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List access paths
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param q query param of search (optional)
     * @param uid access path uid (optional)
     * @param clientGroupId related client group id (optional)
     * @param all show all access targets (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccessPathsAsync(Long limit, Long offset, String clusterId, String q, String uid, Long clientGroupId, Boolean all, final ApiCallback<AccessPathsResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAccessPathsValidateBeforeCall(limit, offset, clusterId, q, uid, clientGroupId, all, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessPathsResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateAccessPath
     * @param body access path info (required)
     * @param accessPathId access path id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateAccessPathCall(AccessPathUpdateReq body, Long accessPathId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/access-paths/{access_path_id}"
            .replaceAll("\\{" + "access_path_id" + "\\}", apiClient.escapeString(accessPathId.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateAccessPathValidateBeforeCall(AccessPathUpdateReq body, Long accessPathId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateAccessPath(Async)");
        }
        // verify the required parameter 'accessPathId' is set
        if (accessPathId == null) {
            throw new ApiException("Missing the required parameter 'accessPathId' when calling updateAccessPath(Async)");
        }
        
        com.squareup.okhttp.Call call = updateAccessPathCall(body, accessPathId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * update access path
     * @param body access path info (required)
     * @param accessPathId access path id (required)
     * @return AccessPathResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccessPathResp updateAccessPath(AccessPathUpdateReq body, Long accessPathId) throws ApiException {
        ApiResponse<AccessPathResp> resp = updateAccessPathWithHttpInfo(body, accessPathId);
        return resp.getData();
    }

    /**
     * 
     * update access path
     * @param body access path info (required)
     * @param accessPathId access path id (required)
     * @return ApiResponse&lt;AccessPathResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccessPathResp> updateAccessPathWithHttpInfo(AccessPathUpdateReq body, Long accessPathId) throws ApiException {
        com.squareup.okhttp.Call call = updateAccessPathValidateBeforeCall(body, accessPathId, null, null);
        Type localVarReturnType = new TypeToken<AccessPathResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * update access path
     * @param body access path info (required)
     * @param accessPathId access path id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAccessPathAsync(AccessPathUpdateReq body, Long accessPathId, final ApiCallback<AccessPathResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAccessPathValidateBeforeCall(body, accessPathId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccessPathResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
