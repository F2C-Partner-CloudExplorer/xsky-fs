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


import xio.sds.client.model.DfsGatewayConnectionsResp;
import xio.sds.client.model.DfsGatewayResp;
import xio.sds.client.model.DfsGatewaySamplesResp;
import xio.sds.client.model.DfsGatewaysResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DfsGatewaysApi {
    private ApiClient apiClient;

    public DfsGatewaysApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DfsGatewaysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDfsGateway
     * @param dfsGatewayId gateway id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDfsGatewayCall(Long dfsGatewayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-gateways/{dfs_gateway_id}"
            .replaceAll("\\{" + "dfs_gateway_id" + "\\}", apiClient.escapeString(dfsGatewayId.toString()));

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
    private com.squareup.okhttp.Call getDfsGatewayValidateBeforeCall(Long dfsGatewayId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'dfsGatewayId' is set
        if (dfsGatewayId == null) {
            throw new ApiException("Missing the required parameter 'dfsGatewayId' when calling getDfsGateway(Async)");
        }
        
        com.squareup.okhttp.Call call = getDfsGatewayCall(dfsGatewayId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get dfs gateway
     * @param dfsGatewayId gateway id (required)
     * @return DfsGatewayResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsGatewayResp getDfsGateway(Long dfsGatewayId) throws ApiException {
        ApiResponse<DfsGatewayResp> resp = getDfsGatewayWithHttpInfo(dfsGatewayId);
        return resp.getData();
    }

    /**
     * 
     * Get dfs gateway
     * @param dfsGatewayId gateway id (required)
     * @return ApiResponse&lt;DfsGatewayResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsGatewayResp> getDfsGatewayWithHttpInfo(Long dfsGatewayId) throws ApiException {
        com.squareup.okhttp.Call call = getDfsGatewayValidateBeforeCall(dfsGatewayId, null, null);
        Type localVarReturnType = new TypeToken<DfsGatewayResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get dfs gateway
     * @param dfsGatewayId gateway id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDfsGatewayAsync(Long dfsGatewayId, final ApiCallback<DfsGatewayResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDfsGatewayValidateBeforeCall(dfsGatewayId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsGatewayResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDfsGatewaySamples
     * @param dfsGatewayId dfs gateway id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDfsGatewaySamplesCall(Long dfsGatewayId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-gateways/{dfs_gateway_id}/samples"
            .replaceAll("\\{" + "dfs_gateway_id" + "\\}", apiClient.escapeString(dfsGatewayId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (durationBegin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("duration_begin", durationBegin));
        if (durationEnd != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("duration_end", durationEnd));
        if (period != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("period", period));

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
    private com.squareup.okhttp.Call getDfsGatewaySamplesValidateBeforeCall(Long dfsGatewayId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'dfsGatewayId' is set
        if (dfsGatewayId == null) {
            throw new ApiException("Missing the required parameter 'dfsGatewayId' when calling getDfsGatewaySamples(Async)");
        }
        
        com.squareup.okhttp.Call call = getDfsGatewaySamplesCall(dfsGatewayId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get a dfs gateway&#x27;s samples
     * @param dfsGatewayId dfs gateway id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return DfsGatewaySamplesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsGatewaySamplesResp getDfsGatewaySamples(Long dfsGatewayId, String durationBegin, String durationEnd, String period) throws ApiException {
        ApiResponse<DfsGatewaySamplesResp> resp = getDfsGatewaySamplesWithHttpInfo(dfsGatewayId, durationBegin, durationEnd, period);
        return resp.getData();
    }

    /**
     * 
     * get a dfs gateway&#x27;s samples
     * @param dfsGatewayId dfs gateway id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return ApiResponse&lt;DfsGatewaySamplesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsGatewaySamplesResp> getDfsGatewaySamplesWithHttpInfo(Long dfsGatewayId, String durationBegin, String durationEnd, String period) throws ApiException {
        com.squareup.okhttp.Call call = getDfsGatewaySamplesValidateBeforeCall(dfsGatewayId, durationBegin, durationEnd, period, null, null);
        Type localVarReturnType = new TypeToken<DfsGatewaySamplesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get a dfs gateway&#x27;s samples
     * @param dfsGatewayId dfs gateway id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDfsGatewaySamplesAsync(Long dfsGatewayId, String durationBegin, String durationEnd, String period, final ApiCallback<DfsGatewaySamplesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDfsGatewaySamplesValidateBeforeCall(dfsGatewayId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsGatewaySamplesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listDfsGatewayConnections
     * @param dfsGatewayId dfs gateway id (required)
     * @param types share types, value is smb|nfs|ftp|s3|hdfs (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDfsGatewayConnectionsCall(Long dfsGatewayId, String types, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-gateways/{dfs_gateway_id}/connections"
            .replaceAll("\\{" + "dfs_gateway_id" + "\\}", apiClient.escapeString(dfsGatewayId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (types != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("types", types));

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
    private com.squareup.okhttp.Call listDfsGatewayConnectionsValidateBeforeCall(Long dfsGatewayId, String types, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'dfsGatewayId' is set
        if (dfsGatewayId == null) {
            throw new ApiException("Missing the required parameter 'dfsGatewayId' when calling listDfsGatewayConnections(Async)");
        }
        
        com.squareup.okhttp.Call call = listDfsGatewayConnectionsCall(dfsGatewayId, types, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * list client connections of dfs gateway
     * @param dfsGatewayId dfs gateway id (required)
     * @param types share types, value is smb|nfs|ftp|s3|hdfs (optional)
     * @return DfsGatewayConnectionsResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsGatewayConnectionsResp listDfsGatewayConnections(Long dfsGatewayId, String types) throws ApiException {
        ApiResponse<DfsGatewayConnectionsResp> resp = listDfsGatewayConnectionsWithHttpInfo(dfsGatewayId, types);
        return resp.getData();
    }

    /**
     * 
     * list client connections of dfs gateway
     * @param dfsGatewayId dfs gateway id (required)
     * @param types share types, value is smb|nfs|ftp|s3|hdfs (optional)
     * @return ApiResponse&lt;DfsGatewayConnectionsResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsGatewayConnectionsResp> listDfsGatewayConnectionsWithHttpInfo(Long dfsGatewayId, String types) throws ApiException {
        com.squareup.okhttp.Call call = listDfsGatewayConnectionsValidateBeforeCall(dfsGatewayId, types, null, null);
        Type localVarReturnType = new TypeToken<DfsGatewayConnectionsResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * list client connections of dfs gateway
     * @param dfsGatewayId dfs gateway id (required)
     * @param types share types, value is smb|nfs|ftp|s3|hdfs (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDfsGatewayConnectionsAsync(Long dfsGatewayId, String types, final ApiCallback<DfsGatewayConnectionsResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDfsGatewayConnectionsValidateBeforeCall(dfsGatewayId, types, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsGatewayConnectionsResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listDfsGateways
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param dfsGatewayGroupId dfs gateway group id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDfsGatewaysCall(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-gateways/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));
        if (dfsGatewayGroupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dfs_gateway_group_id", dfsGatewayGroupId));

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
    private com.squareup.okhttp.Call listDfsGatewaysValidateBeforeCall(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listDfsGatewaysCall(limit, offset, q, sort, clusterId, dfsGatewayGroupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List dfs gateways
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param dfsGatewayGroupId dfs gateway group id (optional)
     * @return DfsGatewaysResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsGatewaysResp listDfsGateways(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId) throws ApiException {
        ApiResponse<DfsGatewaysResp> resp = listDfsGatewaysWithHttpInfo(limit, offset, q, sort, clusterId, dfsGatewayGroupId);
        return resp.getData();
    }

    /**
     * 
     * List dfs gateways
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param dfsGatewayGroupId dfs gateway group id (optional)
     * @return ApiResponse&lt;DfsGatewaysResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsGatewaysResp> listDfsGatewaysWithHttpInfo(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId) throws ApiException {
        com.squareup.okhttp.Call call = listDfsGatewaysValidateBeforeCall(limit, offset, q, sort, clusterId, dfsGatewayGroupId, null, null);
        Type localVarReturnType = new TypeToken<DfsGatewaysResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dfs gateways
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param dfsGatewayGroupId dfs gateway group id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDfsGatewaysAsync(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId, final ApiCallback<DfsGatewaysResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDfsGatewaysValidateBeforeCall(limit, offset, q, sort, clusterId, dfsGatewayGroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsGatewaysResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
