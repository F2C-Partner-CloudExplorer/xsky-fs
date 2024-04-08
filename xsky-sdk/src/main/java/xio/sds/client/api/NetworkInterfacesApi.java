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


import xio.sds.client.model.NetworkInterfaceResp;
import xio.sds.client.model.NetworkInterfaceSamplesResp;
import xio.sds.client.model.NetworkInterfacesResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkInterfacesApi {
    private ApiClient apiClient;

    public NetworkInterfacesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetworkInterfacesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getNetworkInterface
     * @param networkInterfaceId network interface id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNetworkInterfaceCall(Long networkInterfaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/network-interfaces/{network_interface_id}"
            .replaceAll("\\{" + "network_interface_id" + "\\}", apiClient.escapeString(networkInterfaceId.toString()));

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
    private com.squareup.okhttp.Call getNetworkInterfaceValidateBeforeCall(Long networkInterfaceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'networkInterfaceId' is set
        if (networkInterfaceId == null) {
            throw new ApiException("Missing the required parameter 'networkInterfaceId' when calling getNetworkInterface(Async)");
        }
        
        com.squareup.okhttp.Call call = getNetworkInterfaceCall(networkInterfaceId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get a network interface
     * @param networkInterfaceId network interface id (required)
     * @return NetworkInterfaceResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NetworkInterfaceResp getNetworkInterface(Long networkInterfaceId) throws ApiException {
        ApiResponse<NetworkInterfaceResp> resp = getNetworkInterfaceWithHttpInfo(networkInterfaceId);
        return resp.getData();
    }

    /**
     * 
     * Get a network interface
     * @param networkInterfaceId network interface id (required)
     * @return ApiResponse&lt;NetworkInterfaceResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NetworkInterfaceResp> getNetworkInterfaceWithHttpInfo(Long networkInterfaceId) throws ApiException {
        com.squareup.okhttp.Call call = getNetworkInterfaceValidateBeforeCall(networkInterfaceId, null, null);
        Type localVarReturnType = new TypeToken<NetworkInterfaceResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a network interface
     * @param networkInterfaceId network interface id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNetworkInterfaceAsync(Long networkInterfaceId, final ApiCallback<NetworkInterfaceResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNetworkInterfaceValidateBeforeCall(networkInterfaceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NetworkInterfaceResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNetworkInterfaceSamples
     * @param networkInterfaceId network interface id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNetworkInterfaceSamplesCall(Long networkInterfaceId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/network-interfaces/{network_interface_id}/samples"
            .replaceAll("\\{" + "network_interface_id" + "\\}", apiClient.escapeString(networkInterfaceId.toString()));

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
    private com.squareup.okhttp.Call getNetworkInterfaceSamplesValidateBeforeCall(Long networkInterfaceId, String durationBegin, String durationEnd, String period, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'networkInterfaceId' is set
        if (networkInterfaceId == null) {
            throw new ApiException("Missing the required parameter 'networkInterfaceId' when calling getNetworkInterfaceSamples(Async)");
        }
        
        com.squareup.okhttp.Call call = getNetworkInterfaceSamplesCall(networkInterfaceId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get a network interface&#x27;s Samples
     * @param networkInterfaceId network interface id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return NetworkInterfaceSamplesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NetworkInterfaceSamplesResp getNetworkInterfaceSamples(Long networkInterfaceId, String durationBegin, String durationEnd, String period) throws ApiException {
        ApiResponse<NetworkInterfaceSamplesResp> resp = getNetworkInterfaceSamplesWithHttpInfo(networkInterfaceId, durationBegin, durationEnd, period);
        return resp.getData();
    }

    /**
     * 
     * get a network interface&#x27;s Samples
     * @param networkInterfaceId network interface id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @return ApiResponse&lt;NetworkInterfaceSamplesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NetworkInterfaceSamplesResp> getNetworkInterfaceSamplesWithHttpInfo(Long networkInterfaceId, String durationBegin, String durationEnd, String period) throws ApiException {
        com.squareup.okhttp.Call call = getNetworkInterfaceSamplesValidateBeforeCall(networkInterfaceId, durationBegin, durationEnd, period, null, null);
        Type localVarReturnType = new TypeToken<NetworkInterfaceSamplesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get a network interface&#x27;s Samples
     * @param networkInterfaceId network interface id (required)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param period samples period (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNetworkInterfaceSamplesAsync(Long networkInterfaceId, String durationBegin, String durationEnd, String period, final ApiCallback<NetworkInterfaceSamplesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNetworkInterfaceSamplesValidateBeforeCall(networkInterfaceId, durationBegin, durationEnd, period, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NetworkInterfaceSamplesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listNetworkInterfaces
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param masterNetworkInterfaceId master network interface id (optional)
     * @param hostId host id (optional)
     * @param role network interface role (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listNetworkInterfacesCall(Long limit, Long offset, Long masterNetworkInterfaceId, Long hostId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/network-interfaces/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (masterNetworkInterfaceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("master_network_interface_id", masterNetworkInterfaceId));
        if (hostId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("host_id", hostId));
        if (role != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("role", role));

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
    private com.squareup.okhttp.Call listNetworkInterfacesValidateBeforeCall(Long limit, Long offset, Long masterNetworkInterfaceId, Long hostId, String role, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listNetworkInterfacesCall(limit, offset, masterNetworkInterfaceId, hostId, role, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List network interfaces
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param masterNetworkInterfaceId master network interface id (optional)
     * @param hostId host id (optional)
     * @param role network interface role (optional)
     * @return NetworkInterfacesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NetworkInterfacesResp listNetworkInterfaces(Long limit, Long offset, Long masterNetworkInterfaceId, Long hostId, String role) throws ApiException {
        ApiResponse<NetworkInterfacesResp> resp = listNetworkInterfacesWithHttpInfo(limit, offset, masterNetworkInterfaceId, hostId, role);
        return resp.getData();
    }

    /**
     * 
     * List network interfaces
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param masterNetworkInterfaceId master network interface id (optional)
     * @param hostId host id (optional)
     * @param role network interface role (optional)
     * @return ApiResponse&lt;NetworkInterfacesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NetworkInterfacesResp> listNetworkInterfacesWithHttpInfo(Long limit, Long offset, Long masterNetworkInterfaceId, Long hostId, String role) throws ApiException {
        com.squareup.okhttp.Call call = listNetworkInterfacesValidateBeforeCall(limit, offset, masterNetworkInterfaceId, hostId, role, null, null);
        Type localVarReturnType = new TypeToken<NetworkInterfacesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List network interfaces
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param masterNetworkInterfaceId master network interface id (optional)
     * @param hostId host id (optional)
     * @param role network interface role (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listNetworkInterfacesAsync(Long limit, Long offset, Long masterNetworkInterfaceId, Long hostId, String role, final ApiCallback<NetworkInterfacesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listNetworkInterfacesValidateBeforeCall(limit, offset, masterNetworkInterfaceId, hostId, role, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NetworkInterfacesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}