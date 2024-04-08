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


import xio.sds.client.model.MultiS3LoadBalancersSamplesResp;
import xio.sds.client.model.S3LoadBalancerResp;
import xio.sds.client.model.S3LoadBalancerSamplesResp;
import xio.sds.client.model.S3LoadBalancersResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S3LoadBalancersApi {
    private ApiClient apiClient;

    public S3LoadBalancersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public S3LoadBalancersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for batchGetS3LoadBalancerSamples
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call batchGetS3LoadBalancerSamplesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/s3-load-balancers/samples";

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
    private com.squareup.okhttp.Call batchGetS3LoadBalancerSamplesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = batchGetS3LoadBalancerSamplesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get samples of multiple s3 load balancers
     * @return MultiS3LoadBalancersSamplesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultiS3LoadBalancersSamplesResp batchGetS3LoadBalancerSamples() throws ApiException {
        ApiResponse<MultiS3LoadBalancersSamplesResp> resp = batchGetS3LoadBalancerSamplesWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Get samples of multiple s3 load balancers
     * @return ApiResponse&lt;MultiS3LoadBalancersSamplesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultiS3LoadBalancersSamplesResp> batchGetS3LoadBalancerSamplesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = batchGetS3LoadBalancerSamplesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<MultiS3LoadBalancersSamplesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get samples of multiple s3 load balancers
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call batchGetS3LoadBalancerSamplesAsync(final ApiCallback<MultiS3LoadBalancersSamplesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = batchGetS3LoadBalancerSamplesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MultiS3LoadBalancersSamplesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getS3LoadBalancer
     * @param loadBalancerId s3 load balancer id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getS3LoadBalancerCall(Long loadBalancerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/s3-load-balancers/{load_balancer_id}"
            .replaceAll("\\{" + "load_balancer_id" + "\\}", apiClient.escapeString(loadBalancerId.toString()));

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
    private com.squareup.okhttp.Call getS3LoadBalancerValidateBeforeCall(Long loadBalancerId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'loadBalancerId' is set
        if (loadBalancerId == null) {
            throw new ApiException("Missing the required parameter 'loadBalancerId' when calling getS3LoadBalancer(Async)");
        }
        
        com.squareup.okhttp.Call call = getS3LoadBalancerCall(loadBalancerId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get s3 load balancer
     * @param loadBalancerId s3 load balancer id (required)
     * @return S3LoadBalancerResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public S3LoadBalancerResp getS3LoadBalancer(Long loadBalancerId) throws ApiException {
        ApiResponse<S3LoadBalancerResp> resp = getS3LoadBalancerWithHttpInfo(loadBalancerId);
        return resp.getData();
    }

    /**
     * 
     * Get s3 load balancer
     * @param loadBalancerId s3 load balancer id (required)
     * @return ApiResponse&lt;S3LoadBalancerResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<S3LoadBalancerResp> getS3LoadBalancerWithHttpInfo(Long loadBalancerId) throws ApiException {
        com.squareup.okhttp.Call call = getS3LoadBalancerValidateBeforeCall(loadBalancerId, null, null);
        Type localVarReturnType = new TypeToken<S3LoadBalancerResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get s3 load balancer
     * @param loadBalancerId s3 load balancer id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getS3LoadBalancerAsync(Long loadBalancerId, final ApiCallback<S3LoadBalancerResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getS3LoadBalancerValidateBeforeCall(loadBalancerId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<S3LoadBalancerResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getS3LoadBalancerSamples
     * @param s3LoadBalancerId s3 load balancer id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getS3LoadBalancerSamplesCall(Long s3LoadBalancerId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/s3-load-balancers/{s3_load_balancer_id}/samples"
            .replaceAll("\\{" + "s3_load_balancer_id" + "\\}", apiClient.escapeString(s3LoadBalancerId.toString()));

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
    private com.squareup.okhttp.Call getS3LoadBalancerSamplesValidateBeforeCall(Long s3LoadBalancerId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 's3LoadBalancerId' is set
        if (s3LoadBalancerId == null) {
            throw new ApiException("Missing the required parameter 's3LoadBalancerId' when calling getS3LoadBalancerSamples(Async)");
        }
        
        com.squareup.okhttp.Call call = getS3LoadBalancerSamplesCall(s3LoadBalancerId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get a s3 load balancer&#x27;s samples
     * @param s3LoadBalancerId s3 load balancer id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return S3LoadBalancerSamplesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public S3LoadBalancerSamplesResp getS3LoadBalancerSamples(Long s3LoadBalancerId, String durationBegin, String durationEnd, String period) throws ApiException {
        ApiResponse<S3LoadBalancerSamplesResp> resp = getS3LoadBalancerSamplesWithHttpInfo(s3LoadBalancerId, durationBegin, durationEnd, period);
        return resp.getData();
    }

    /**
     * 
     * get a s3 load balancer&#x27;s samples
     * @param s3LoadBalancerId s3 load balancer id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return ApiResponse&lt;S3LoadBalancerSamplesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<S3LoadBalancerSamplesResp> getS3LoadBalancerSamplesWithHttpInfo(Long s3LoadBalancerId, String durationBegin, String durationEnd, String period) throws ApiException {
        com.squareup.okhttp.Call call = getS3LoadBalancerSamplesValidateBeforeCall(s3LoadBalancerId, durationBegin, durationEnd, period, null, null);
        Type localVarReturnType = new TypeToken<S3LoadBalancerSamplesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get a s3 load balancer&#x27;s samples
     * @param s3LoadBalancerId s3 load balancer id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getS3LoadBalancerSamplesAsync(Long s3LoadBalancerId, String durationBegin, String durationEnd, String period, final ApiCallback<S3LoadBalancerSamplesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getS3LoadBalancerSamplesValidateBeforeCall(s3LoadBalancerId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<S3LoadBalancerSamplesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listS3LoadBalancers
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param groupId s3 load balancer group id (optional)
     * @param ospZoneId osp zone id (optional)
     * @param hostId host id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listS3LoadBalancersCall(Long limit, Long offset, String q, String sort, String clusterId, Long groupId, Long ospZoneId, Long hostId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/s3-load-balancers/";

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
        if (groupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("group_id", groupId));
        if (ospZoneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("osp_zone_id", ospZoneId));
        if (hostId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("host_id", hostId));

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
    private com.squareup.okhttp.Call listS3LoadBalancersValidateBeforeCall(Long limit, Long offset, String q, String sort, String clusterId, Long groupId, Long ospZoneId, Long hostId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listS3LoadBalancersCall(limit, offset, q, sort, clusterId, groupId, ospZoneId, hostId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List s3 load balancers
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param groupId s3 load balancer group id (optional)
     * @param ospZoneId osp zone id (optional)
     * @param hostId host id (optional)
     * @return S3LoadBalancersResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public S3LoadBalancersResp listS3LoadBalancers(Long limit, Long offset, String q, String sort, String clusterId, Long groupId, Long ospZoneId, Long hostId) throws ApiException {
        ApiResponse<S3LoadBalancersResp> resp = listS3LoadBalancersWithHttpInfo(limit, offset, q, sort, clusterId, groupId, ospZoneId, hostId);
        return resp.getData();
    }

    /**
     * 
     * List s3 load balancers
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param groupId s3 load balancer group id (optional)
     * @param ospZoneId osp zone id (optional)
     * @param hostId host id (optional)
     * @return ApiResponse&lt;S3LoadBalancersResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<S3LoadBalancersResp> listS3LoadBalancersWithHttpInfo(Long limit, Long offset, String q, String sort, String clusterId, Long groupId, Long ospZoneId, Long hostId) throws ApiException {
        com.squareup.okhttp.Call call = listS3LoadBalancersValidateBeforeCall(limit, offset, q, sort, clusterId, groupId, ospZoneId, hostId, null, null);
        Type localVarReturnType = new TypeToken<S3LoadBalancersResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List s3 load balancers
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param groupId s3 load balancer group id (optional)
     * @param ospZoneId osp zone id (optional)
     * @param hostId host id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listS3LoadBalancersAsync(Long limit, Long offset, String q, String sort, String clusterId, Long groupId, Long ospZoneId, Long hostId, final ApiCallback<S3LoadBalancersResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listS3LoadBalancersValidateBeforeCall(limit, offset, q, sort, clusterId, groupId, ospZoneId, hostId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<S3LoadBalancersResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}