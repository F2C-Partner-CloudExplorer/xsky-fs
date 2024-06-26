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


import xio.sds.client.model.DpBlockSnapshotPoliciesResp;
import xio.sds.client.model.DpBlockSnapshotPolicyCreateReq;
import xio.sds.client.model.DpBlockSnapshotPolicyResp;
import xio.sds.client.model.DpBlockSnapshotPolicyUpdateReq;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DpBlockSnapshotPoliciesApi {
    private ApiClient apiClient;

    public DpBlockSnapshotPoliciesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DpBlockSnapshotPoliciesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createDpBlockSnapshotPolicy
     * @param body policy info (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDpBlockSnapshotPolicyCall(DpBlockSnapshotPolicyCreateReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/dp-block-snapshot-policies/";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createDpBlockSnapshotPolicyValidateBeforeCall(DpBlockSnapshotPolicyCreateReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createDpBlockSnapshotPolicy(Async)");
        }
        
        com.squareup.okhttp.Call call = createDpBlockSnapshotPolicyCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create dp block snapshot policy
     * @param body policy info (required)
     * @return DpBlockSnapshotPolicyResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DpBlockSnapshotPolicyResp createDpBlockSnapshotPolicy(DpBlockSnapshotPolicyCreateReq body) throws ApiException {
        ApiResponse<DpBlockSnapshotPolicyResp> resp = createDpBlockSnapshotPolicyWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 
     * Create dp block snapshot policy
     * @param body policy info (required)
     * @return ApiResponse&lt;DpBlockSnapshotPolicyResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DpBlockSnapshotPolicyResp> createDpBlockSnapshotPolicyWithHttpInfo(DpBlockSnapshotPolicyCreateReq body) throws ApiException {
        com.squareup.okhttp.Call call = createDpBlockSnapshotPolicyValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPolicyResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create dp block snapshot policy
     * @param body policy info (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDpBlockSnapshotPolicyAsync(DpBlockSnapshotPolicyCreateReq body, final ApiCallback<DpBlockSnapshotPolicyResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDpBlockSnapshotPolicyValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPolicyResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDpBlockSnapshotPolicy
     * @param policyId resource id (required)
     * @param force force delete or not (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDpBlockSnapshotPolicyCall(Long policyId, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dp-block-snapshot-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (force != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("force", force));

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
    private com.squareup.okhttp.Call deleteDpBlockSnapshotPolicyValidateBeforeCall(Long policyId, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling deleteDpBlockSnapshotPolicy(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteDpBlockSnapshotPolicyCall(policyId, force, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Delete dp block snapshot policy
     * @param policyId resource id (required)
     * @param force force delete or not (optional)
     * @return DpBlockSnapshotPolicyResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DpBlockSnapshotPolicyResp deleteDpBlockSnapshotPolicy(Long policyId, Boolean force) throws ApiException {
        ApiResponse<DpBlockSnapshotPolicyResp> resp = deleteDpBlockSnapshotPolicyWithHttpInfo(policyId, force);
        return resp.getData();
    }

    /**
     * 
     * Delete dp block snapshot policy
     * @param policyId resource id (required)
     * @param force force delete or not (optional)
     * @return ApiResponse&lt;DpBlockSnapshotPolicyResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DpBlockSnapshotPolicyResp> deleteDpBlockSnapshotPolicyWithHttpInfo(Long policyId, Boolean force) throws ApiException {
        com.squareup.okhttp.Call call = deleteDpBlockSnapshotPolicyValidateBeforeCall(policyId, force, null, null);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPolicyResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete dp block snapshot policy
     * @param policyId resource id (required)
     * @param force force delete or not (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDpBlockSnapshotPolicyAsync(Long policyId, Boolean force, final ApiCallback<DpBlockSnapshotPolicyResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDpBlockSnapshotPolicyValidateBeforeCall(policyId, force, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPolicyResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDpBlockSnapshotPolicy
     * @param policyId resource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDpBlockSnapshotPolicyCall(Long policyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dp-block-snapshot-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

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
    private com.squareup.okhttp.Call getDpBlockSnapshotPolicyValidateBeforeCall(Long policyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling getDpBlockSnapshotPolicy(Async)");
        }
        
        com.squareup.okhttp.Call call = getDpBlockSnapshotPolicyCall(policyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get dp block snapshot policy
     * @param policyId resource id (required)
     * @return DpBlockSnapshotPolicyResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DpBlockSnapshotPolicyResp getDpBlockSnapshotPolicy(Long policyId) throws ApiException {
        ApiResponse<DpBlockSnapshotPolicyResp> resp = getDpBlockSnapshotPolicyWithHttpInfo(policyId);
        return resp.getData();
    }

    /**
     * 
     * Get dp block snapshot policy
     * @param policyId resource id (required)
     * @return ApiResponse&lt;DpBlockSnapshotPolicyResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DpBlockSnapshotPolicyResp> getDpBlockSnapshotPolicyWithHttpInfo(Long policyId) throws ApiException {
        com.squareup.okhttp.Call call = getDpBlockSnapshotPolicyValidateBeforeCall(policyId, null, null);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPolicyResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get dp block snapshot policy
     * @param policyId resource id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDpBlockSnapshotPolicyAsync(Long policyId, final ApiCallback<DpBlockSnapshotPolicyResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDpBlockSnapshotPolicyValidateBeforeCall(policyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPolicyResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listDpBlockSnapshotPolicies
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDpBlockSnapshotPoliciesCall(Long limit, Long offset, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dp-block-snapshot-policies/";

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
    private com.squareup.okhttp.Call listDpBlockSnapshotPoliciesValidateBeforeCall(Long limit, Long offset, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listDpBlockSnapshotPoliciesCall(limit, offset, q, sort, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List dp block snapshot policies
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return DpBlockSnapshotPoliciesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DpBlockSnapshotPoliciesResp listDpBlockSnapshotPolicies(Long limit, Long offset, String q, String sort) throws ApiException {
        ApiResponse<DpBlockSnapshotPoliciesResp> resp = listDpBlockSnapshotPoliciesWithHttpInfo(limit, offset, q, sort);
        return resp.getData();
    }

    /**
     * 
     * List dp block snapshot policies
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return ApiResponse&lt;DpBlockSnapshotPoliciesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DpBlockSnapshotPoliciesResp> listDpBlockSnapshotPoliciesWithHttpInfo(Long limit, Long offset, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = listDpBlockSnapshotPoliciesValidateBeforeCall(limit, offset, q, sort, null, null);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPoliciesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dp block snapshot policies
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDpBlockSnapshotPoliciesAsync(Long limit, Long offset, String q, String sort, final ApiCallback<DpBlockSnapshotPoliciesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDpBlockSnapshotPoliciesValidateBeforeCall(limit, offset, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPoliciesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDpBlockSnapshotPolicy
     * @param body policy info (required)
     * @param policyId resource id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDpBlockSnapshotPolicyCall(DpBlockSnapshotPolicyUpdateReq body, Long policyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/dp-block-snapshot-policies/{policy_id}"
            .replaceAll("\\{" + "policy_id" + "\\}", apiClient.escapeString(policyId.toString()));

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
    private com.squareup.okhttp.Call updateDpBlockSnapshotPolicyValidateBeforeCall(DpBlockSnapshotPolicyUpdateReq body, Long policyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateDpBlockSnapshotPolicy(Async)");
        }
        // verify the required parameter 'policyId' is set
        if (policyId == null) {
            throw new ApiException("Missing the required parameter 'policyId' when calling updateDpBlockSnapshotPolicy(Async)");
        }
        
        com.squareup.okhttp.Call call = updateDpBlockSnapshotPolicyCall(body, policyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Update dp block snapshot policy
     * @param body policy info (required)
     * @param policyId resource id (required)
     * @return DpBlockSnapshotPolicyResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DpBlockSnapshotPolicyResp updateDpBlockSnapshotPolicy(DpBlockSnapshotPolicyUpdateReq body, Long policyId) throws ApiException {
        ApiResponse<DpBlockSnapshotPolicyResp> resp = updateDpBlockSnapshotPolicyWithHttpInfo(body, policyId);
        return resp.getData();
    }

    /**
     * 
     * Update dp block snapshot policy
     * @param body policy info (required)
     * @param policyId resource id (required)
     * @return ApiResponse&lt;DpBlockSnapshotPolicyResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DpBlockSnapshotPolicyResp> updateDpBlockSnapshotPolicyWithHttpInfo(DpBlockSnapshotPolicyUpdateReq body, Long policyId) throws ApiException {
        com.squareup.okhttp.Call call = updateDpBlockSnapshotPolicyValidateBeforeCall(body, policyId, null, null);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPolicyResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update dp block snapshot policy
     * @param body policy info (required)
     * @param policyId resource id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDpBlockSnapshotPolicyAsync(DpBlockSnapshotPolicyUpdateReq body, Long policyId, final ApiCallback<DpBlockSnapshotPolicyResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDpBlockSnapshotPolicyValidateBeforeCall(body, policyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DpBlockSnapshotPolicyResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
