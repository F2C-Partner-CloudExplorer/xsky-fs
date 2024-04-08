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


import xio.sds.client.model.OSOriginPullRuleCreateReq;
import xio.sds.client.model.OSOriginPullRuleResp;
import xio.sds.client.model.OSOriginPullRuleUpdateReq;
import xio.sds.client.model.OSOriginPullRulesResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OsOriginPullRulesApi {
    private ApiClient apiClient;

    public OsOriginPullRulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OsOriginPullRulesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createOSOriginPullRule
     * @param body origin pull rule info (required)
     * @param clusterId cluster id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createOSOriginPullRuleCall(OSOriginPullRuleCreateReq body, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/os-origin-pull-rules/";

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
    private com.squareup.okhttp.Call createOSOriginPullRuleValidateBeforeCall(OSOriginPullRuleCreateReq body, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createOSOriginPullRule(Async)");
        }
        
        com.squareup.okhttp.Call call = createOSOriginPullRuleCall(body, clusterId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create os origin pull rule
     * @param body origin pull rule info (required)
     * @param clusterId cluster id (optional)
     * @return OSOriginPullRuleResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSOriginPullRuleResp createOSOriginPullRule(OSOriginPullRuleCreateReq body, String clusterId) throws ApiException {
        ApiResponse<OSOriginPullRuleResp> resp = createOSOriginPullRuleWithHttpInfo(body, clusterId);
        return resp.getData();
    }

    /**
     * 
     * Create os origin pull rule
     * @param body origin pull rule info (required)
     * @param clusterId cluster id (optional)
     * @return ApiResponse&lt;OSOriginPullRuleResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSOriginPullRuleResp> createOSOriginPullRuleWithHttpInfo(OSOriginPullRuleCreateReq body, String clusterId) throws ApiException {
        com.squareup.okhttp.Call call = createOSOriginPullRuleValidateBeforeCall(body, clusterId, null, null);
        Type localVarReturnType = new TypeToken<OSOriginPullRuleResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create os origin pull rule
     * @param body origin pull rule info (required)
     * @param clusterId cluster id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createOSOriginPullRuleAsync(OSOriginPullRuleCreateReq body, String clusterId, final ApiCallback<OSOriginPullRuleResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createOSOriginPullRuleValidateBeforeCall(body, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSOriginPullRuleResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteOSOriginPullRule
     * @param ruleId origin pull rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteOSOriginPullRuleCall(Long ruleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/os-origin-pull-rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteOSOriginPullRuleValidateBeforeCall(Long ruleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling deleteOSOriginPullRule(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteOSOriginPullRuleCall(ruleId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Delete an os origin pull rule
     * @param ruleId origin pull rule id (required)
     * @return OSOriginPullRuleResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSOriginPullRuleResp deleteOSOriginPullRule(Long ruleId) throws ApiException {
        ApiResponse<OSOriginPullRuleResp> resp = deleteOSOriginPullRuleWithHttpInfo(ruleId);
        return resp.getData();
    }

    /**
     * 
     * Delete an os origin pull rule
     * @param ruleId origin pull rule id (required)
     * @return ApiResponse&lt;OSOriginPullRuleResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSOriginPullRuleResp> deleteOSOriginPullRuleWithHttpInfo(Long ruleId) throws ApiException {
        com.squareup.okhttp.Call call = deleteOSOriginPullRuleValidateBeforeCall(ruleId, null, null);
        Type localVarReturnType = new TypeToken<OSOriginPullRuleResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete an os origin pull rule
     * @param ruleId origin pull rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteOSOriginPullRuleAsync(Long ruleId, final ApiCallback<OSOriginPullRuleResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteOSOriginPullRuleValidateBeforeCall(ruleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSOriginPullRuleResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOSOriginPullRule
     * @param ruleId rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOSOriginPullRuleCall(Long ruleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/os-origin-pull-rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

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
    private com.squareup.okhttp.Call getOSOriginPullRuleValidateBeforeCall(Long ruleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling getOSOriginPullRule(Async)");
        }
        
        com.squareup.okhttp.Call call = getOSOriginPullRuleCall(ruleId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get an os origin pull rule
     * @param ruleId rule id (required)
     * @return OSOriginPullRuleResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSOriginPullRuleResp getOSOriginPullRule(Long ruleId) throws ApiException {
        ApiResponse<OSOriginPullRuleResp> resp = getOSOriginPullRuleWithHttpInfo(ruleId);
        return resp.getData();
    }

    /**
     * 
     * Get an os origin pull rule
     * @param ruleId rule id (required)
     * @return ApiResponse&lt;OSOriginPullRuleResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSOriginPullRuleResp> getOSOriginPullRuleWithHttpInfo(Long ruleId) throws ApiException {
        com.squareup.okhttp.Call call = getOSOriginPullRuleValidateBeforeCall(ruleId, null, null);
        Type localVarReturnType = new TypeToken<OSOriginPullRuleResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get an os origin pull rule
     * @param ruleId rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOSOriginPullRuleAsync(Long ruleId, final ApiCallback<OSOriginPullRuleResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOSOriginPullRuleValidateBeforeCall(ruleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSOriginPullRuleResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listOSOriginPullRules
     * @param clusterId cluster id (optional)
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param bucketId bucket id (optional)
     * @param s3LbGroupId s3 lb group id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listOSOriginPullRulesCall(String clusterId, Long limit, Long offset, Long bucketId, Long s3LbGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/os-origin-pull-rules/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (bucketId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("bucket_id", bucketId));
        if (s3LbGroupId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("s3_lb_group_id", s3LbGroupId));

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
    private com.squareup.okhttp.Call listOSOriginPullRulesValidateBeforeCall(String clusterId, Long limit, Long offset, Long bucketId, Long s3LbGroupId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listOSOriginPullRulesCall(clusterId, limit, offset, bucketId, s3LbGroupId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List os origin pull rules
     * @param clusterId cluster id (optional)
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param bucketId bucket id (optional)
     * @param s3LbGroupId s3 lb group id (optional)
     * @return OSOriginPullRulesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSOriginPullRulesResp listOSOriginPullRules(String clusterId, Long limit, Long offset, Long bucketId, Long s3LbGroupId) throws ApiException {
        ApiResponse<OSOriginPullRulesResp> resp = listOSOriginPullRulesWithHttpInfo(clusterId, limit, offset, bucketId, s3LbGroupId);
        return resp.getData();
    }

    /**
     * 
     * List os origin pull rules
     * @param clusterId cluster id (optional)
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param bucketId bucket id (optional)
     * @param s3LbGroupId s3 lb group id (optional)
     * @return ApiResponse&lt;OSOriginPullRulesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSOriginPullRulesResp> listOSOriginPullRulesWithHttpInfo(String clusterId, Long limit, Long offset, Long bucketId, Long s3LbGroupId) throws ApiException {
        com.squareup.okhttp.Call call = listOSOriginPullRulesValidateBeforeCall(clusterId, limit, offset, bucketId, s3LbGroupId, null, null);
        Type localVarReturnType = new TypeToken<OSOriginPullRulesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List os origin pull rules
     * @param clusterId cluster id (optional)
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param bucketId bucket id (optional)
     * @param s3LbGroupId s3 lb group id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOSOriginPullRulesAsync(String clusterId, Long limit, Long offset, Long bucketId, Long s3LbGroupId, final ApiCallback<OSOriginPullRulesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOSOriginPullRulesValidateBeforeCall(clusterId, limit, offset, bucketId, s3LbGroupId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSOriginPullRulesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateOSOriginPullRule
     * @param body origin pull rule info (required)
     * @param ruleId origin pull rule id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateOSOriginPullRuleCall(OSOriginPullRuleUpdateReq body, Long ruleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/os-origin-pull-rules/{rule_id}"
            .replaceAll("\\{" + "rule_id" + "\\}", apiClient.escapeString(ruleId.toString()));

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateOSOriginPullRuleValidateBeforeCall(OSOriginPullRuleUpdateReq body, Long ruleId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateOSOriginPullRule(Async)");
        }
        // verify the required parameter 'ruleId' is set
        if (ruleId == null) {
            throw new ApiException("Missing the required parameter 'ruleId' when calling updateOSOriginPullRule(Async)");
        }
        
        com.squareup.okhttp.Call call = updateOSOriginPullRuleCall(body, ruleId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * update os origin pull rule
     * @param body origin pull rule info (required)
     * @param ruleId origin pull rule id (required)
     * @return OSOriginPullRuleResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OSOriginPullRuleResp updateOSOriginPullRule(OSOriginPullRuleUpdateReq body, Long ruleId) throws ApiException {
        ApiResponse<OSOriginPullRuleResp> resp = updateOSOriginPullRuleWithHttpInfo(body, ruleId);
        return resp.getData();
    }

    /**
     * 
     * update os origin pull rule
     * @param body origin pull rule info (required)
     * @param ruleId origin pull rule id (required)
     * @return ApiResponse&lt;OSOriginPullRuleResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OSOriginPullRuleResp> updateOSOriginPullRuleWithHttpInfo(OSOriginPullRuleUpdateReq body, Long ruleId) throws ApiException {
        com.squareup.okhttp.Call call = updateOSOriginPullRuleValidateBeforeCall(body, ruleId, null, null);
        Type localVarReturnType = new TypeToken<OSOriginPullRuleResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * update os origin pull rule
     * @param body origin pull rule info (required)
     * @param ruleId origin pull rule id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateOSOriginPullRuleAsync(OSOriginPullRuleUpdateReq body, Long ruleId, final ApiCallback<OSOriginPullRuleResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateOSOriginPullRuleValidateBeforeCall(body, ruleId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OSOriginPullRuleResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}