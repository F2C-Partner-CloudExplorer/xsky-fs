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


import xio.sds.client.model.LunResp;
import xio.sds.client.model.LunsResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LunsApi {
    private ApiClient apiClient;

    public LunsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LunsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getLun
     * @param lunId lun id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLunCall(Long lunId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/luns/{lun_id}"
            .replaceAll("\\{" + "lun_id" + "\\}", apiClient.escapeString(lunId.toString()));

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
    private com.squareup.okhttp.Call getLunValidateBeforeCall(Long lunId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'lunId' is set
        if (lunId == null) {
            throw new ApiException("Missing the required parameter 'lunId' when calling getLun(Async)");
        }
        
        com.squareup.okhttp.Call call = getLunCall(lunId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get a lun
     * @param lunId lun id (required)
     * @return LunResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LunResp getLun(Long lunId) throws ApiException {
        ApiResponse<LunResp> resp = getLunWithHttpInfo(lunId);
        return resp.getData();
    }

    /**
     * 
     * get a lun
     * @param lunId lun id (required)
     * @return ApiResponse&lt;LunResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LunResp> getLunWithHttpInfo(Long lunId) throws ApiException {
        com.squareup.okhttp.Call call = getLunValidateBeforeCall(lunId, null, null);
        Type localVarReturnType = new TypeToken<LunResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get a lun
     * @param lunId lun id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLunAsync(Long lunId, final ApiCallback<LunResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLunValidateBeforeCall(lunId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LunResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listLuns
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param mappingGroupId mapping group id (optional)
     * @param volumeId volume id (optional)
     * @param accessPathId access path id (optional)
     * @param clusterId cluster id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listLunsCall(Long limit, Long offset, Long mappingGroupId, Long volumeId, Long accessPathId, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/luns/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (mappingGroupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("mapping_group_id", mappingGroupId));
        if (volumeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("volume_id", volumeId));
        if (accessPathId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("access_path_id", accessPathId));
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
    private com.squareup.okhttp.Call listLunsValidateBeforeCall(Long limit, Long offset, Long mappingGroupId, Long volumeId, Long accessPathId, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listLunsCall(limit, offset, mappingGroupId, volumeId, accessPathId, clusterId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List luns
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param mappingGroupId mapping group id (optional)
     * @param volumeId volume id (optional)
     * @param accessPathId access path id (optional)
     * @param clusterId cluster id (optional)
     * @return LunsResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LunsResp listLuns(Long limit, Long offset, Long mappingGroupId, Long volumeId, Long accessPathId, String clusterId) throws ApiException {
        ApiResponse<LunsResp> resp = listLunsWithHttpInfo(limit, offset, mappingGroupId, volumeId, accessPathId, clusterId);
        return resp.getData();
    }

    /**
     * 
     * List luns
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param mappingGroupId mapping group id (optional)
     * @param volumeId volume id (optional)
     * @param accessPathId access path id (optional)
     * @param clusterId cluster id (optional)
     * @return ApiResponse&lt;LunsResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LunsResp> listLunsWithHttpInfo(Long limit, Long offset, Long mappingGroupId, Long volumeId, Long accessPathId, String clusterId) throws ApiException {
        com.squareup.okhttp.Call call = listLunsValidateBeforeCall(limit, offset, mappingGroupId, volumeId, accessPathId, clusterId, null, null);
        Type localVarReturnType = new TypeToken<LunsResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List luns
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param mappingGroupId mapping group id (optional)
     * @param volumeId volume id (optional)
     * @param accessPathId access path id (optional)
     * @param clusterId cluster id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listLunsAsync(Long limit, Long offset, Long mappingGroupId, Long volumeId, Long accessPathId, String clusterId, final ApiCallback<LunsResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listLunsValidateBeforeCall(limit, offset, mappingGroupId, volumeId, accessPathId, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LunsResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
