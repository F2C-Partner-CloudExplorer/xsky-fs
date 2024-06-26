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


import xio.sds.client.model.NetworkDiagnosesResp;
import xio.sds.client.model.NetworkDiagnosisCreateReq;
import xio.sds.client.model.NetworkDiagnosisResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkDiagnosesApi {
    private ApiClient apiClient;

    public NetworkDiagnosesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetworkDiagnosesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createNetworkDiagnosis
     * @param body network diagnosis info (required)
     * @param clusterId cluster id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createNetworkDiagnosisCall(NetworkDiagnosisCreateReq body, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/network-diagnoses/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createNetworkDiagnosisValidateBeforeCall(NetworkDiagnosisCreateReq body, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNetworkDiagnosis(Async)");
        }
        
        com.squareup.okhttp.Call call = createNetworkDiagnosisCall(body, clusterId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create network diagnosis
     * @param body network diagnosis info (required)
     * @param clusterId cluster id (optional)
     * @return NetworkDiagnosisResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NetworkDiagnosisResp createNetworkDiagnosis(NetworkDiagnosisCreateReq body, String clusterId) throws ApiException {
        ApiResponse<NetworkDiagnosisResp> resp = createNetworkDiagnosisWithHttpInfo(body, clusterId);
        return resp.getData();
    }

    /**
     * 
     * Create network diagnosis
     * @param body network diagnosis info (required)
     * @param clusterId cluster id (optional)
     * @return ApiResponse&lt;NetworkDiagnosisResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NetworkDiagnosisResp> createNetworkDiagnosisWithHttpInfo(NetworkDiagnosisCreateReq body, String clusterId) throws ApiException {
        com.squareup.okhttp.Call call = createNetworkDiagnosisValidateBeforeCall(body, clusterId, null, null);
        Type localVarReturnType = new TypeToken<NetworkDiagnosisResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create network diagnosis
     * @param body network diagnosis info (required)
     * @param clusterId cluster id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNetworkDiagnosisAsync(NetworkDiagnosisCreateReq body, String clusterId, final ApiCallback<NetworkDiagnosisResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createNetworkDiagnosisValidateBeforeCall(body, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NetworkDiagnosisResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteNetworkDiagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteNetworkDiagnosisCall(Long networkDiagnosisId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/network-diagnoses/{network_diagnosis_id}"
            .replaceAll("\\{" + "network_diagnosis_id" + "\\}", apiClient.escapeString(networkDiagnosisId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteNetworkDiagnosisValidateBeforeCall(Long networkDiagnosisId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'networkDiagnosisId' is set
        if (networkDiagnosisId == null) {
            throw new ApiException("Missing the required parameter 'networkDiagnosisId' when calling deleteNetworkDiagnosis(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteNetworkDiagnosisCall(networkDiagnosisId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * delete network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteNetworkDiagnosis(Long networkDiagnosisId) throws ApiException {
        deleteNetworkDiagnosisWithHttpInfo(networkDiagnosisId);
    }

    /**
     * 
     * delete network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteNetworkDiagnosisWithHttpInfo(Long networkDiagnosisId) throws ApiException {
        com.squareup.okhttp.Call call = deleteNetworkDiagnosisValidateBeforeCall(networkDiagnosisId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * delete network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteNetworkDiagnosisAsync(Long networkDiagnosisId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteNetworkDiagnosisValidateBeforeCall(networkDiagnosisId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getNetworkDiagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNetworkDiagnosisCall(Long networkDiagnosisId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/network-diagnoses/{network_diagnosis_id}"
            .replaceAll("\\{" + "network_diagnosis_id" + "\\}", apiClient.escapeString(networkDiagnosisId.toString()));

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
    private com.squareup.okhttp.Call getNetworkDiagnosisValidateBeforeCall(Long networkDiagnosisId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'networkDiagnosisId' is set
        if (networkDiagnosisId == null) {
            throw new ApiException("Missing the required parameter 'networkDiagnosisId' when calling getNetworkDiagnosis(Async)");
        }
        
        com.squareup.okhttp.Call call = getNetworkDiagnosisCall(networkDiagnosisId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @return NetworkDiagnosisResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NetworkDiagnosisResp getNetworkDiagnosis(Long networkDiagnosisId) throws ApiException {
        ApiResponse<NetworkDiagnosisResp> resp = getNetworkDiagnosisWithHttpInfo(networkDiagnosisId);
        return resp.getData();
    }

    /**
     * 
     * Get network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @return ApiResponse&lt;NetworkDiagnosisResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NetworkDiagnosisResp> getNetworkDiagnosisWithHttpInfo(Long networkDiagnosisId) throws ApiException {
        com.squareup.okhttp.Call call = getNetworkDiagnosisValidateBeforeCall(networkDiagnosisId, null, null);
        Type localVarReturnType = new TypeToken<NetworkDiagnosisResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNetworkDiagnosisAsync(Long networkDiagnosisId, final ApiCallback<NetworkDiagnosisResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNetworkDiagnosisValidateBeforeCall(networkDiagnosisId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NetworkDiagnosisResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listNetworkDiagnoses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listNetworkDiagnosesCall(Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/network-diagnoses/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));

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
    private com.squareup.okhttp.Call listNetworkDiagnosesValidateBeforeCall(Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listNetworkDiagnosesCall(limit, offset, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List network diagnoses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @return NetworkDiagnosesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NetworkDiagnosesResp listNetworkDiagnoses(Long limit, Long offset) throws ApiException {
        ApiResponse<NetworkDiagnosesResp> resp = listNetworkDiagnosesWithHttpInfo(limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List network diagnoses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @return ApiResponse&lt;NetworkDiagnosesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NetworkDiagnosesResp> listNetworkDiagnosesWithHttpInfo(Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listNetworkDiagnosesValidateBeforeCall(limit, offset, null, null);
        Type localVarReturnType = new TypeToken<NetworkDiagnosesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List network diagnoses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listNetworkDiagnosesAsync(Long limit, Long offset, final ApiCallback<NetworkDiagnosesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listNetworkDiagnosesValidateBeforeCall(limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NetworkDiagnosesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for stopNetworkDiagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call stopNetworkDiagnosisCall(Long networkDiagnosisId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/network-diagnoses/{network_diagnosis_id}:stop"
            .replaceAll("\\{" + "network_diagnosis_id" + "\\}", apiClient.escapeString(networkDiagnosisId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call stopNetworkDiagnosisValidateBeforeCall(Long networkDiagnosisId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'networkDiagnosisId' is set
        if (networkDiagnosisId == null) {
            throw new ApiException("Missing the required parameter 'networkDiagnosisId' when calling stopNetworkDiagnosis(Async)");
        }
        
        com.squareup.okhttp.Call call = stopNetworkDiagnosisCall(networkDiagnosisId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * stop network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @return NetworkDiagnosisResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NetworkDiagnosisResp stopNetworkDiagnosis(Long networkDiagnosisId) throws ApiException {
        ApiResponse<NetworkDiagnosisResp> resp = stopNetworkDiagnosisWithHttpInfo(networkDiagnosisId);
        return resp.getData();
    }

    /**
     * 
     * stop network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @return ApiResponse&lt;NetworkDiagnosisResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NetworkDiagnosisResp> stopNetworkDiagnosisWithHttpInfo(Long networkDiagnosisId) throws ApiException {
        com.squareup.okhttp.Call call = stopNetworkDiagnosisValidateBeforeCall(networkDiagnosisId, null, null);
        Type localVarReturnType = new TypeToken<NetworkDiagnosisResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * stop network diagnosis
     * @param networkDiagnosisId network diagnosis id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call stopNetworkDiagnosisAsync(Long networkDiagnosisId, final ApiCallback<NetworkDiagnosisResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = stopNetworkDiagnosisValidateBeforeCall(networkDiagnosisId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NetworkDiagnosisResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
