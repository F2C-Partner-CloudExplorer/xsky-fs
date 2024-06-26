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


import xio.sds.client.model.OSRemotePoliciesResp;
import xio.sds.client.model.OSRemotePolicyResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OsRemotePoliciesApi {
    private ApiClient apiClient;

    public OsRemotePoliciesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OsRemotePoliciesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getOSRemotePolicy
     * @param policyUuid policy uuid (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOSRemotePolicyCall(String policyUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/os-remote-policies/{policy_uuid}"
            .replaceAll("\\{" + "policy_uuid" + "\\}", apiClient.escapeString(policyUuid.toString()));

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
    private com.squareup.okhttp.Call getOSRemotePolicyValidateBeforeCall(String policyUuid, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'policyUuid' is set
        if (policyUuid == null) {
            throw new ApiException("Missing the required parameter 'policyUuid' when calling getOSRemotePolicy(Async)");
        }
        
        com.squareup.okhttp.Call call = getOSRemotePolicyCall(policyUuid, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get a os remote policy
     * @param policyUuid policy uuid (required)
     * @return OSRemotePolicyResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSRemotePolicyResp getOSRemotePolicy(String policyUuid) throws ApiException {
        ApiResponse<OSRemotePolicyResp> resp = getOSRemotePolicyWithHttpInfo(policyUuid);
        return resp.getData();
    }

    /**
     * 
     * Get a os remote policy
     * @param policyUuid policy uuid (required)
     * @return ApiResponse&lt;OSRemotePolicyResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSRemotePolicyResp> getOSRemotePolicyWithHttpInfo(String policyUuid) throws ApiException {
        com.squareup.okhttp.Call call = getOSRemotePolicyValidateBeforeCall(policyUuid, null, null);
        Type localVarReturnType = new TypeToken<OSRemotePolicyResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a os remote policy
     * @param policyUuid policy uuid (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOSRemotePolicyAsync(String policyUuid, final ApiCallback<OSRemotePolicyResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOSRemotePolicyValidateBeforeCall(policyUuid, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSRemotePolicyResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listOSRemotePolicies
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param marker paging param (optional)
     * @param zoneUuid zone uuid (optional)
     * @param clusterId cluster id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listOSRemotePoliciesCall(Long limit, Long offset, String marker, String zoneUuid, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/os-remote-policies/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (marker != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("marker", marker));
        if (zoneUuid != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("zone_uuid", zoneUuid));
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
    private com.squareup.okhttp.Call listOSRemotePoliciesValidateBeforeCall(Long limit, Long offset, String marker, String zoneUuid, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listOSRemotePoliciesCall(limit, offset, marker, zoneUuid, clusterId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List os remote policies
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param marker paging param (optional)
     * @param zoneUuid zone uuid (optional)
     * @param clusterId cluster id (optional)
     * @return OSRemotePoliciesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSRemotePoliciesResp listOSRemotePolicies(Long limit, Long offset, String marker, String zoneUuid, String clusterId) throws ApiException {
        ApiResponse<OSRemotePoliciesResp> resp = listOSRemotePoliciesWithHttpInfo(limit, offset, marker, zoneUuid, clusterId);
        return resp.getData();
    }

    /**
     * 
     * List os remote policies
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param marker paging param (optional)
     * @param zoneUuid zone uuid (optional)
     * @param clusterId cluster id (optional)
     * @return ApiResponse&lt;OSRemotePoliciesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSRemotePoliciesResp> listOSRemotePoliciesWithHttpInfo(Long limit, Long offset, String marker, String zoneUuid, String clusterId) throws ApiException {
        com.squareup.okhttp.Call call = listOSRemotePoliciesValidateBeforeCall(limit, offset, marker, zoneUuid, clusterId, null, null);
        Type localVarReturnType = new TypeToken<OSRemotePoliciesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List os remote policies
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param marker paging param (optional)
     * @param zoneUuid zone uuid (optional)
     * @param clusterId cluster id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOSRemotePoliciesAsync(Long limit, Long offset, String marker, String zoneUuid, String clusterId, final ApiCallback<OSRemotePoliciesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOSRemotePoliciesValidateBeforeCall(limit, offset, marker, zoneUuid, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSRemotePoliciesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
