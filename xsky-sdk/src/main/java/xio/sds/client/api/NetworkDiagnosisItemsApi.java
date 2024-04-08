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


import xio.sds.client.model.NetworkDiagnosisItemsResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkDiagnosisItemsApi {
    private ApiClient apiClient;

    public NetworkDiagnosisItemsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetworkDiagnosisItemsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listNetworkDiagnosisItems
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param networks network type (optional)
     * @param finished diagnosis item finished or not (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listNetworkDiagnosisItemsCall(Long limit, Long offset, String networks, Boolean finished, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/network-diagnosis-items/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (networks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("networks", networks));
        if (finished != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("finished", finished));

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
    private com.squareup.okhttp.Call listNetworkDiagnosisItemsValidateBeforeCall(Long limit, Long offset, String networks, Boolean finished, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listNetworkDiagnosisItemsCall(limit, offset, networks, finished, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List network diagnosis items
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param networks network type (optional)
     * @param finished diagnosis item finished or not (optional)
     * @return NetworkDiagnosisItemsResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NetworkDiagnosisItemsResp listNetworkDiagnosisItems(Long limit, Long offset, String networks, Boolean finished) throws ApiException {
        ApiResponse<NetworkDiagnosisItemsResp> resp = listNetworkDiagnosisItemsWithHttpInfo(limit, offset, networks, finished);
        return resp.getData();
    }

    /**
     * 
     * List network diagnosis items
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param networks network type (optional)
     * @param finished diagnosis item finished or not (optional)
     * @return ApiResponse&lt;NetworkDiagnosisItemsResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NetworkDiagnosisItemsResp> listNetworkDiagnosisItemsWithHttpInfo(Long limit, Long offset, String networks, Boolean finished) throws ApiException {
        com.squareup.okhttp.Call call = listNetworkDiagnosisItemsValidateBeforeCall(limit, offset, networks, finished, null, null);
        Type localVarReturnType = new TypeToken<NetworkDiagnosisItemsResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List network diagnosis items
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param networks network type (optional)
     * @param finished diagnosis item finished or not (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listNetworkDiagnosisItemsAsync(Long limit, Long offset, String networks, Boolean finished, final ApiCallback<NetworkDiagnosisItemsResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listNetworkDiagnosisItemsValidateBeforeCall(limit, offset, networks, finished, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NetworkDiagnosisItemsResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}