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


import xio.sds.client.model.CloudInstanceResp;
import xio.sds.client.model.CloudInstanceSamplesResp;
import xio.sds.client.model.CloudInstancesResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloudInstancesApi {
    private ApiClient apiClient;

    public CloudInstancesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CloudInstancesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCloudInstance
     * @param cloudInstanceId cloud instance id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCloudInstanceCall(Long cloudInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/cloud-instances/{cloud_instance_id}"
            .replaceAll("\\{" + "cloud_instance_id" + "\\}", apiClient.escapeString(cloudInstanceId.toString()));

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
    private com.squareup.okhttp.Call getCloudInstanceValidateBeforeCall(Long cloudInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'cloudInstanceId' is set
        if (cloudInstanceId == null) {
            throw new ApiException("Missing the required parameter 'cloudInstanceId' when calling getCloudInstance(Async)");
        }
        
        com.squareup.okhttp.Call call = getCloudInstanceCall(cloudInstanceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get a cloud instance
     * @param cloudInstanceId cloud instance id (required)
     * @return CloudInstanceResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudInstanceResp getCloudInstance(Long cloudInstanceId) throws ApiException {
        ApiResponse<CloudInstanceResp> resp = getCloudInstanceWithHttpInfo(cloudInstanceId);
        return resp.getData();
    }

    /**
     * 
     * Get a cloud instance
     * @param cloudInstanceId cloud instance id (required)
     * @return ApiResponse&lt;CloudInstanceResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudInstanceResp> getCloudInstanceWithHttpInfo(Long cloudInstanceId) throws ApiException {
        com.squareup.okhttp.Call call = getCloudInstanceValidateBeforeCall(cloudInstanceId, null, null);
        Type localVarReturnType = new TypeToken<CloudInstanceResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a cloud instance
     * @param cloudInstanceId cloud instance id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCloudInstanceAsync(Long cloudInstanceId, final ApiCallback<CloudInstanceResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCloudInstanceValidateBeforeCall(cloudInstanceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudInstanceResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getCloudInstanceSamples
     * @param cloudInstanceId cloud instance id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCloudInstanceSamplesCall(Long cloudInstanceId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/cloud-instances/{cloud_instance_id}/samples"
            .replaceAll("\\{" + "cloud_instance_id" + "\\}", apiClient.escapeString(cloudInstanceId.toString()));

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
    private com.squareup.okhttp.Call getCloudInstanceSamplesValidateBeforeCall(Long cloudInstanceId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'cloudInstanceId' is set
        if (cloudInstanceId == null) {
            throw new ApiException("Missing the required parameter 'cloudInstanceId' when calling getCloudInstanceSamples(Async)");
        }
        
        com.squareup.okhttp.Call call = getCloudInstanceSamplesCall(cloudInstanceId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get a cloud instance&#x27;s Samples
     * @param cloudInstanceId cloud instance id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return CloudInstanceSamplesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudInstanceSamplesResp getCloudInstanceSamples(Long cloudInstanceId, String durationBegin, String durationEnd, String period) throws ApiException {
        ApiResponse<CloudInstanceSamplesResp> resp = getCloudInstanceSamplesWithHttpInfo(cloudInstanceId, durationBegin, durationEnd, period);
        return resp.getData();
    }

    /**
     * 
     * get a cloud instance&#x27;s Samples
     * @param cloudInstanceId cloud instance id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return ApiResponse&lt;CloudInstanceSamplesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudInstanceSamplesResp> getCloudInstanceSamplesWithHttpInfo(Long cloudInstanceId, String durationBegin, String durationEnd, String period) throws ApiException {
        com.squareup.okhttp.Call call = getCloudInstanceSamplesValidateBeforeCall(cloudInstanceId, durationBegin, durationEnd, period, null, null);
        Type localVarReturnType = new TypeToken<CloudInstanceSamplesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get a cloud instance&#x27;s Samples
     * @param cloudInstanceId cloud instance id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCloudInstanceSamplesAsync(Long cloudInstanceId, String durationBegin, String durationEnd, String period, final ApiCallback<CloudInstanceSamplesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCloudInstanceSamplesValidateBeforeCall(cloudInstanceId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudInstanceSamplesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listCloudInstances
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param cloudPlatformId cloud platform id (optional)
     * @param cloudPlatformType cloud platform type (optional)
     * @param cloudPlatformName cloud platform name (optional)
     * @param clusterId cluster id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCloudInstancesCall(Long limit, Long offset, Long cloudPlatformId, String cloudPlatformType, String cloudPlatformName, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/cloud-instances/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (cloudPlatformId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cloud_platform_id", cloudPlatformId));
        if (cloudPlatformType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cloud_platform_type", cloudPlatformType));
        if (cloudPlatformName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cloud_platform_name", cloudPlatformName));
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
    private com.squareup.okhttp.Call listCloudInstancesValidateBeforeCall(Long limit, Long offset, Long cloudPlatformId, String cloudPlatformType, String cloudPlatformName, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listCloudInstancesCall(limit, offset, cloudPlatformId, cloudPlatformType, cloudPlatformName, clusterId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List cloud instances
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param cloudPlatformId cloud platform id (optional)
     * @param cloudPlatformType cloud platform type (optional)
     * @param cloudPlatformName cloud platform name (optional)
     * @param clusterId cluster id (optional)
     * @return CloudInstancesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CloudInstancesResp listCloudInstances(Long limit, Long offset, Long cloudPlatformId, String cloudPlatformType, String cloudPlatformName, String clusterId) throws ApiException {
        ApiResponse<CloudInstancesResp> resp = listCloudInstancesWithHttpInfo(limit, offset, cloudPlatformId, cloudPlatformType, cloudPlatformName, clusterId);
        return resp.getData();
    }

    /**
     * 
     * List cloud instances
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param cloudPlatformId cloud platform id (optional)
     * @param cloudPlatformType cloud platform type (optional)
     * @param cloudPlatformName cloud platform name (optional)
     * @param clusterId cluster id (optional)
     * @return ApiResponse&lt;CloudInstancesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CloudInstancesResp> listCloudInstancesWithHttpInfo(Long limit, Long offset, Long cloudPlatformId, String cloudPlatformType, String cloudPlatformName, String clusterId) throws ApiException {
        com.squareup.okhttp.Call call = listCloudInstancesValidateBeforeCall(limit, offset, cloudPlatformId, cloudPlatformType, cloudPlatformName, clusterId, null, null);
        Type localVarReturnType = new TypeToken<CloudInstancesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List cloud instances
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param cloudPlatformId cloud platform id (optional)
     * @param cloudPlatformType cloud platform type (optional)
     * @param cloudPlatformName cloud platform name (optional)
     * @param clusterId cluster id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCloudInstancesAsync(Long limit, Long offset, Long cloudPlatformId, String cloudPlatformType, String cloudPlatformName, String clusterId, final ApiCallback<CloudInstancesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listCloudInstancesValidateBeforeCall(limit, offset, cloudPlatformId, cloudPlatformType, cloudPlatformName, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CloudInstancesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
