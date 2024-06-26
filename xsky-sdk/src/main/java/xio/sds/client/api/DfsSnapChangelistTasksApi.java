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


import xio.sds.client.model.DfsSnapChangelistTaskCreateReq;
import xio.sds.client.model.DfsSnapChangelistTaskResp;
import xio.sds.client.model.DfsSnapChangelistTasksResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DfsSnapChangelistTasksApi {
    private ApiClient apiClient;

    public DfsSnapChangelistTasksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DfsSnapChangelistTasksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createDfsSnapChangelistTask
     * @param body task info (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDfsSnapChangelistTaskCall(DfsSnapChangelistTaskCreateReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-snap-changelist-tasks/";

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
    private com.squareup.okhttp.Call createDfsSnapChangelistTaskValidateBeforeCall(DfsSnapChangelistTaskCreateReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createDfsSnapChangelistTask(Async)");
        }
        
        com.squareup.okhttp.Call call = createDfsSnapChangelistTaskCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create dfs snap change list task
     * @param body task info (required)
     * @return DfsSnapChangelistTaskResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsSnapChangelistTaskResp createDfsSnapChangelistTask(DfsSnapChangelistTaskCreateReq body) throws ApiException {
        ApiResponse<DfsSnapChangelistTaskResp> resp = createDfsSnapChangelistTaskWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 
     * Create dfs snap change list task
     * @param body task info (required)
     * @return ApiResponse&lt;DfsSnapChangelistTaskResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsSnapChangelistTaskResp> createDfsSnapChangelistTaskWithHttpInfo(DfsSnapChangelistTaskCreateReq body) throws ApiException {
        com.squareup.okhttp.Call call = createDfsSnapChangelistTaskValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DfsSnapChangelistTaskResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create dfs snap change list task
     * @param body task info (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDfsSnapChangelistTaskAsync(DfsSnapChangelistTaskCreateReq body, final ApiCallback<DfsSnapChangelistTaskResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDfsSnapChangelistTaskValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsSnapChangelistTaskResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDfsSnapChangelistTask
     * @param dfsSnapChangelistTaskId task id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDfsSnapChangelistTaskCall(Long dfsSnapChangelistTaskId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-snap-changelist-tasks/{dfs_snap_changelist_task_id}"
            .replaceAll("\\{" + "dfs_snap_changelist_task_id" + "\\}", apiClient.escapeString(dfsSnapChangelistTaskId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call deleteDfsSnapChangelistTaskValidateBeforeCall(Long dfsSnapChangelistTaskId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'dfsSnapChangelistTaskId' is set
        if (dfsSnapChangelistTaskId == null) {
            throw new ApiException("Missing the required parameter 'dfsSnapChangelistTaskId' when calling deleteDfsSnapChangelistTask(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteDfsSnapChangelistTaskCall(dfsSnapChangelistTaskId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * delete dfs snap change list task
     * @param dfsSnapChangelistTaskId task id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteDfsSnapChangelistTask(Long dfsSnapChangelistTaskId) throws ApiException {
        deleteDfsSnapChangelistTaskWithHttpInfo(dfsSnapChangelistTaskId);
    }

    /**
     * 
     * delete dfs snap change list task
     * @param dfsSnapChangelistTaskId task id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteDfsSnapChangelistTaskWithHttpInfo(Long dfsSnapChangelistTaskId) throws ApiException {
        com.squareup.okhttp.Call call = deleteDfsSnapChangelistTaskValidateBeforeCall(dfsSnapChangelistTaskId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * delete dfs snap change list task
     * @param dfsSnapChangelistTaskId task id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDfsSnapChangelistTaskAsync(Long dfsSnapChangelistTaskId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDfsSnapChangelistTaskValidateBeforeCall(dfsSnapChangelistTaskId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDfsSnapChangelistTask
     * @param dfsSnapChangelistTaskId the dfs snap change list task id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDfsSnapChangelistTaskCall(Long dfsSnapChangelistTaskId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-snap-changelist-tasks/{dfs_snap_changelist_task_id}"
            .replaceAll("\\{" + "dfs_snap_changelist_task_id" + "\\}", apiClient.escapeString(dfsSnapChangelistTaskId.toString()));

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
    private com.squareup.okhttp.Call getDfsSnapChangelistTaskValidateBeforeCall(Long dfsSnapChangelistTaskId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'dfsSnapChangelistTaskId' is set
        if (dfsSnapChangelistTaskId == null) {
            throw new ApiException("Missing the required parameter 'dfsSnapChangelistTaskId' when calling getDfsSnapChangelistTask(Async)");
        }
        
        com.squareup.okhttp.Call call = getDfsSnapChangelistTaskCall(dfsSnapChangelistTaskId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get dfs snap change list task
     * @param dfsSnapChangelistTaskId the dfs snap change list task id (required)
     * @return DfsSnapChangelistTaskResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsSnapChangelistTaskResp getDfsSnapChangelistTask(Long dfsSnapChangelistTaskId) throws ApiException {
        ApiResponse<DfsSnapChangelistTaskResp> resp = getDfsSnapChangelistTaskWithHttpInfo(dfsSnapChangelistTaskId);
        return resp.getData();
    }

    /**
     * 
     * get dfs snap change list task
     * @param dfsSnapChangelistTaskId the dfs snap change list task id (required)
     * @return ApiResponse&lt;DfsSnapChangelistTaskResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsSnapChangelistTaskResp> getDfsSnapChangelistTaskWithHttpInfo(Long dfsSnapChangelistTaskId) throws ApiException {
        com.squareup.okhttp.Call call = getDfsSnapChangelistTaskValidateBeforeCall(dfsSnapChangelistTaskId, null, null);
        Type localVarReturnType = new TypeToken<DfsSnapChangelistTaskResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get dfs snap change list task
     * @param dfsSnapChangelistTaskId the dfs snap change list task id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDfsSnapChangelistTaskAsync(Long dfsSnapChangelistTaskId, final ApiCallback<DfsSnapChangelistTaskResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDfsSnapChangelistTaskValidateBeforeCall(dfsSnapChangelistTaskId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsSnapChangelistTaskResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listDfsSnapChangelistTasks
     * @param clusterId cluster id (optional)
     * @param path related dfs path (optional)
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDfsSnapChangelistTasksCall(String clusterId, String path, Long limit, Long offset, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-snap-changelist-tasks/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("path", path));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
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
    private com.squareup.okhttp.Call listDfsSnapChangelistTasksValidateBeforeCall(String clusterId, String path, Long limit, Long offset, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listDfsSnapChangelistTasksCall(clusterId, path, limit, offset, q, sort, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List dfs snap change list tasks
     * @param clusterId cluster id (optional)
     * @param path related dfs path (optional)
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return DfsSnapChangelistTasksResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsSnapChangelistTasksResp listDfsSnapChangelistTasks(String clusterId, String path, Long limit, Long offset, String q, String sort) throws ApiException {
        ApiResponse<DfsSnapChangelistTasksResp> resp = listDfsSnapChangelistTasksWithHttpInfo(clusterId, path, limit, offset, q, sort);
        return resp.getData();
    }

    /**
     * 
     * List dfs snap change list tasks
     * @param clusterId cluster id (optional)
     * @param path related dfs path (optional)
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return ApiResponse&lt;DfsSnapChangelistTasksResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsSnapChangelistTasksResp> listDfsSnapChangelistTasksWithHttpInfo(String clusterId, String path, Long limit, Long offset, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = listDfsSnapChangelistTasksValidateBeforeCall(clusterId, path, limit, offset, q, sort, null, null);
        Type localVarReturnType = new TypeToken<DfsSnapChangelistTasksResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dfs snap change list tasks
     * @param clusterId cluster id (optional)
     * @param path related dfs path (optional)
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDfsSnapChangelistTasksAsync(String clusterId, String path, Long limit, Long offset, String q, String sort, final ApiCallback<DfsSnapChangelistTasksResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDfsSnapChangelistTasksValidateBeforeCall(clusterId, path, limit, offset, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsSnapChangelistTasksResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
