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


import xio.sds.client.model.DfsGatewayNetworkAddressResp;
import xio.sds.client.model.DfsGatewayNetworkAddressesResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DfsGatewayNetworkAddressesApi {
    private ApiClient apiClient;

    public DfsGatewayNetworkAddressesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DfsGatewayNetworkAddressesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDfsGatewayNetworkAddress
     * @param dfsGatewayNetworkAddressId gateway network address id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDfsGatewayNetworkAddressCall(Long dfsGatewayNetworkAddressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-gateway-network-addresses/{dfs_gateway_network_address_id}"
            .replaceAll("\\{" + "dfs_gateway_network_address_id" + "\\}", apiClient.escapeString(dfsGatewayNetworkAddressId.toString()));

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
    private com.squareup.okhttp.Call getDfsGatewayNetworkAddressValidateBeforeCall(Long dfsGatewayNetworkAddressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'dfsGatewayNetworkAddressId' is set
        if (dfsGatewayNetworkAddressId == null) {
            throw new ApiException("Missing the required parameter 'dfsGatewayNetworkAddressId' when calling getDfsGatewayNetworkAddress(Async)");
        }
        
        com.squareup.okhttp.Call call = getDfsGatewayNetworkAddressCall(dfsGatewayNetworkAddressId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get dfs gateway
     * @param dfsGatewayNetworkAddressId gateway network address id (required)
     * @return DfsGatewayNetworkAddressResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsGatewayNetworkAddressResp getDfsGatewayNetworkAddress(Long dfsGatewayNetworkAddressId) throws ApiException {
        ApiResponse<DfsGatewayNetworkAddressResp> resp = getDfsGatewayNetworkAddressWithHttpInfo(dfsGatewayNetworkAddressId);
        return resp.getData();
    }

    /**
     * 
     * Get dfs gateway
     * @param dfsGatewayNetworkAddressId gateway network address id (required)
     * @return ApiResponse&lt;DfsGatewayNetworkAddressResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsGatewayNetworkAddressResp> getDfsGatewayNetworkAddressWithHttpInfo(Long dfsGatewayNetworkAddressId) throws ApiException {
        com.squareup.okhttp.Call call = getDfsGatewayNetworkAddressValidateBeforeCall(dfsGatewayNetworkAddressId, null, null);
        Type localVarReturnType = new TypeToken<DfsGatewayNetworkAddressResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get dfs gateway
     * @param dfsGatewayNetworkAddressId gateway network address id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDfsGatewayNetworkAddressAsync(Long dfsGatewayNetworkAddressId, final ApiCallback<DfsGatewayNetworkAddressResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDfsGatewayNetworkAddressValidateBeforeCall(dfsGatewayNetworkAddressId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsGatewayNetworkAddressResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listDfsGatewayNetworkAddresses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param dfsGatewayGroupId dfs gateway group id (optional)
     * @param dfsGatewayZoneId dfs gateway zone id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDfsGatewayNetworkAddressesCall(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId, Long dfsGatewayZoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-gateway-network-addresses/";

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
        if (dfsGatewayZoneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dfs_gateway_zone_id", dfsGatewayZoneId));

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
    private com.squareup.okhttp.Call listDfsGatewayNetworkAddressesValidateBeforeCall(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId, Long dfsGatewayZoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listDfsGatewayNetworkAddressesCall(limit, offset, q, sort, clusterId, dfsGatewayGroupId, dfsGatewayZoneId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List dfs gateway network addresses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param dfsGatewayGroupId dfs gateway group id (optional)
     * @param dfsGatewayZoneId dfs gateway zone id (optional)
     * @return DfsGatewayNetworkAddressesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsGatewayNetworkAddressesResp listDfsGatewayNetworkAddresses(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId, Long dfsGatewayZoneId) throws ApiException {
        ApiResponse<DfsGatewayNetworkAddressesResp> resp = listDfsGatewayNetworkAddressesWithHttpInfo(limit, offset, q, sort, clusterId, dfsGatewayGroupId, dfsGatewayZoneId);
        return resp.getData();
    }

    /**
     * 
     * List dfs gateway network addresses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param dfsGatewayGroupId dfs gateway group id (optional)
     * @param dfsGatewayZoneId dfs gateway zone id (optional)
     * @return ApiResponse&lt;DfsGatewayNetworkAddressesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsGatewayNetworkAddressesResp> listDfsGatewayNetworkAddressesWithHttpInfo(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId, Long dfsGatewayZoneId) throws ApiException {
        com.squareup.okhttp.Call call = listDfsGatewayNetworkAddressesValidateBeforeCall(limit, offset, q, sort, clusterId, dfsGatewayGroupId, dfsGatewayZoneId, null, null);
        Type localVarReturnType = new TypeToken<DfsGatewayNetworkAddressesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dfs gateway network addresses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param dfsGatewayGroupId dfs gateway group id (optional)
     * @param dfsGatewayZoneId dfs gateway zone id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDfsGatewayNetworkAddressesAsync(Long limit, Long offset, String q, String sort, String clusterId, Long dfsGatewayGroupId, Long dfsGatewayZoneId, final ApiCallback<DfsGatewayNetworkAddressesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDfsGatewayNetworkAddressesValidateBeforeCall(limit, offset, q, sort, clusterId, dfsGatewayGroupId, dfsGatewayZoneId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsGatewayNetworkAddressesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
