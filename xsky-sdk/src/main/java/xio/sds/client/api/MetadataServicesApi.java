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


import xio.sds.client.model.MetadataServiceResp;
import xio.sds.client.model.MetadataServiceSamplesResp;
import xio.sds.client.model.MetadataServicesResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetadataServicesApi {
    private ApiClient apiClient;

    public MetadataServicesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetadataServicesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getMetadataService
     * @param metadataServiceId metadata service id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMetadataServiceCall(Long metadataServiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/metadata-services/{metadata_service_id}"
            .replaceAll("\\{" + "metadata_service_id" + "\\}", apiClient.escapeString(metadataServiceId.toString()));

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
    private com.squareup.okhttp.Call getMetadataServiceValidateBeforeCall(Long metadataServiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'metadataServiceId' is set
        if (metadataServiceId == null) {
            throw new ApiException("Missing the required parameter 'metadataServiceId' when calling getMetadataService(Async)");
        }
        
        com.squareup.okhttp.Call call = getMetadataServiceCall(metadataServiceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get a metadata service
     * @param metadataServiceId metadata service id (required)
     * @return MetadataServiceResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MetadataServiceResp getMetadataService(Long metadataServiceId) throws ApiException {
        ApiResponse<MetadataServiceResp> resp = getMetadataServiceWithHttpInfo(metadataServiceId);
        return resp.getData();
    }

    /**
     * 
     * get a metadata service
     * @param metadataServiceId metadata service id (required)
     * @return ApiResponse&lt;MetadataServiceResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MetadataServiceResp> getMetadataServiceWithHttpInfo(Long metadataServiceId) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataServiceValidateBeforeCall(metadataServiceId, null, null);
        Type localVarReturnType = new TypeToken<MetadataServiceResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get a metadata service
     * @param metadataServiceId metadata service id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataServiceAsync(Long metadataServiceId, final ApiCallback<MetadataServiceResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMetadataServiceValidateBeforeCall(metadataServiceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MetadataServiceResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getMetadataServiceSamples
     * @param metadataServiceId metadata service id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMetadataServiceSamplesCall(Long metadataServiceId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/metadata-services/{metadata_service_id}/samples"
            .replaceAll("\\{" + "metadata_service_id" + "\\}", apiClient.escapeString(metadataServiceId.toString()));

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
    private com.squareup.okhttp.Call getMetadataServiceSamplesValidateBeforeCall(Long metadataServiceId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'metadataServiceId' is set
        if (metadataServiceId == null) {
            throw new ApiException("Missing the required parameter 'metadataServiceId' when calling getMetadataServiceSamples(Async)");
        }
        
        com.squareup.okhttp.Call call = getMetadataServiceSamplesCall(metadataServiceId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get samples of a metadata service
     * @param metadataServiceId metadata service id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return MetadataServiceSamplesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MetadataServiceSamplesResp getMetadataServiceSamples(Long metadataServiceId, String durationBegin, String durationEnd, String period) throws ApiException {
        ApiResponse<MetadataServiceSamplesResp> resp = getMetadataServiceSamplesWithHttpInfo(metadataServiceId, durationBegin, durationEnd, period);
        return resp.getData();
    }

    /**
     * 
     * get samples of a metadata service
     * @param metadataServiceId metadata service id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return ApiResponse&lt;MetadataServiceSamplesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MetadataServiceSamplesResp> getMetadataServiceSamplesWithHttpInfo(Long metadataServiceId, String durationBegin, String durationEnd, String period) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataServiceSamplesValidateBeforeCall(metadataServiceId, durationBegin, durationEnd, period, null, null);
        Type localVarReturnType = new TypeToken<MetadataServiceSamplesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get samples of a metadata service
     * @param metadataServiceId metadata service id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataServiceSamplesAsync(Long metadataServiceId, String durationBegin, String durationEnd, String period, final ApiCallback<MetadataServiceSamplesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMetadataServiceSamplesValidateBeforeCall(metadataServiceId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MetadataServiceSamplesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listMetadataServices
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param diskIds disk ids (optional)
     * @param hostId host id (optional)
     * @param metadataClusterId metadata cluster id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listMetadataServicesCall(Long limit, Long offset, String clusterId, Long diskIds, Long hostId, Long metadataClusterId, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/metadata-services/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));
        if (diskIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("disk_ids", diskIds));
        if (hostId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("host_id", hostId));
        if (metadataClusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("metadata_cluster_id", metadataClusterId));
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
    private com.squareup.okhttp.Call listMetadataServicesValidateBeforeCall(Long limit, Long offset, String clusterId, Long diskIds, Long hostId, Long metadataClusterId, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listMetadataServicesCall(limit, offset, clusterId, diskIds, hostId, metadataClusterId, q, sort, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List all metadata services in the cluster
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param diskIds disk ids (optional)
     * @param hostId host id (optional)
     * @param metadataClusterId metadata cluster id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return MetadataServicesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MetadataServicesResp listMetadataServices(Long limit, Long offset, String clusterId, Long diskIds, Long hostId, Long metadataClusterId, String q, String sort) throws ApiException {
        ApiResponse<MetadataServicesResp> resp = listMetadataServicesWithHttpInfo(limit, offset, clusterId, diskIds, hostId, metadataClusterId, q, sort);
        return resp.getData();
    }

    /**
     * 
     * List all metadata services in the cluster
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param diskIds disk ids (optional)
     * @param hostId host id (optional)
     * @param metadataClusterId metadata cluster id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return ApiResponse&lt;MetadataServicesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MetadataServicesResp> listMetadataServicesWithHttpInfo(Long limit, Long offset, String clusterId, Long diskIds, Long hostId, Long metadataClusterId, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = listMetadataServicesValidateBeforeCall(limit, offset, clusterId, diskIds, hostId, metadataClusterId, q, sort, null, null);
        Type localVarReturnType = new TypeToken<MetadataServicesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all metadata services in the cluster
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param diskIds disk ids (optional)
     * @param hostId host id (optional)
     * @param metadataClusterId metadata cluster id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMetadataServicesAsync(Long limit, Long offset, String clusterId, Long diskIds, Long hostId, Long metadataClusterId, String q, String sort, final ApiCallback<MetadataServicesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMetadataServicesValidateBeforeCall(limit, offset, clusterId, diskIds, hostId, metadataClusterId, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MetadataServicesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}