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


import xio.sds.client.model.VIPInstanceResp;
import xio.sds.client.model.VIPInstancesResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VipInstancesApi {
    private ApiClient apiClient;

    public VipInstancesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VipInstancesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getVIPInstance
     * @param vipInstanceId vip group id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getVIPInstanceCall(Long vipInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/vip-instances/{vip_instance_id}"
            .replaceAll("\\{" + "vip_instance_id" + "\\}", apiClient.escapeString(vipInstanceId.toString()));

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
    private com.squareup.okhttp.Call getVIPInstanceValidateBeforeCall(Long vipInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'vipInstanceId' is set
        if (vipInstanceId == null) {
            throw new ApiException("Missing the required parameter 'vipInstanceId' when calling getVIPInstance(Async)");
        }
        
        com.squareup.okhttp.Call call = getVIPInstanceCall(vipInstanceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get a vip group
     * @param vipInstanceId vip group id (required)
     * @return VIPInstanceResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VIPInstanceResp getVIPInstance(Long vipInstanceId) throws ApiException {
        ApiResponse<VIPInstanceResp> resp = getVIPInstanceWithHttpInfo(vipInstanceId);
        return resp.getData();
    }

    /**
     * 
     * Get a vip group
     * @param vipInstanceId vip group id (required)
     * @return ApiResponse&lt;VIPInstanceResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VIPInstanceResp> getVIPInstanceWithHttpInfo(Long vipInstanceId) throws ApiException {
        com.squareup.okhttp.Call call = getVIPInstanceValidateBeforeCall(vipInstanceId, null, null);
        Type localVarReturnType = new TypeToken<VIPInstanceResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a vip group
     * @param vipInstanceId vip group id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVIPInstanceAsync(Long vipInstanceId, final ApiCallback<VIPInstanceResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVIPInstanceValidateBeforeCall(vipInstanceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VIPInstanceResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listVIPInstances
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param vipId vip id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listVIPInstancesCall(Long limit, Long offset, Long vipId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/vip-instances/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (vipId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("vip_id", vipId));

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
    private com.squareup.okhttp.Call listVIPInstancesValidateBeforeCall(Long limit, Long offset, Long vipId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listVIPInstancesCall(limit, offset, vipId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List vip instances
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param vipId vip id (optional)
     * @return VIPInstancesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VIPInstancesResp listVIPInstances(Long limit, Long offset, Long vipId) throws ApiException {
        ApiResponse<VIPInstancesResp> resp = listVIPInstancesWithHttpInfo(limit, offset, vipId);
        return resp.getData();
    }

    /**
     * 
     * List vip instances
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param vipId vip id (optional)
     * @return ApiResponse&lt;VIPInstancesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VIPInstancesResp> listVIPInstancesWithHttpInfo(Long limit, Long offset, Long vipId) throws ApiException {
        com.squareup.okhttp.Call call = listVIPInstancesValidateBeforeCall(limit, offset, vipId, null, null);
        Type localVarReturnType = new TypeToken<VIPInstancesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List vip instances
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param vipId vip id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listVIPInstancesAsync(Long limit, Long offset, Long vipId, final ApiCallback<VIPInstancesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listVIPInstancesValidateBeforeCall(limit, offset, vipId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VIPInstancesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
