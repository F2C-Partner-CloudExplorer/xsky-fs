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


import xio.sds.client.model.DpDfsSnapshotJobsResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DpDfsSnapshotJobsApi {
    private ApiClient apiClient;

    public DpDfsSnapshotJobsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DpDfsSnapshotJobsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listDpDfsSnapshotJobs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param dpDfsSnapshotPolicyId dp dfs snapshot policy (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDpDfsSnapshotJobsCall(Long limit, Long offset, String q, String sort, Long dpDfsSnapshotPolicyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dp-dfs-snapshot-jobs/";

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
        if (dpDfsSnapshotPolicyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dp_dfs_snapshot_policy_id", dpDfsSnapshotPolicyId));

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
    private com.squareup.okhttp.Call listDpDfsSnapshotJobsValidateBeforeCall(Long limit, Long offset, String q, String sort, Long dpDfsSnapshotPolicyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listDpDfsSnapshotJobsCall(limit, offset, q, sort, dpDfsSnapshotPolicyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List dp dfs snapshot jobs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param dpDfsSnapshotPolicyId dp dfs snapshot policy (optional)
     * @return DpDfsSnapshotJobsResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DpDfsSnapshotJobsResp listDpDfsSnapshotJobs(Long limit, Long offset, String q, String sort, Long dpDfsSnapshotPolicyId) throws ApiException {
        ApiResponse<DpDfsSnapshotJobsResp> resp = listDpDfsSnapshotJobsWithHttpInfo(limit, offset, q, sort, dpDfsSnapshotPolicyId);
        return resp.getData();
    }

    /**
     * 
     * List dp dfs snapshot jobs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param dpDfsSnapshotPolicyId dp dfs snapshot policy (optional)
     * @return ApiResponse&lt;DpDfsSnapshotJobsResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DpDfsSnapshotJobsResp> listDpDfsSnapshotJobsWithHttpInfo(Long limit, Long offset, String q, String sort, Long dpDfsSnapshotPolicyId) throws ApiException {
        com.squareup.okhttp.Call call = listDpDfsSnapshotJobsValidateBeforeCall(limit, offset, q, sort, dpDfsSnapshotPolicyId, null, null);
        Type localVarReturnType = new TypeToken<DpDfsSnapshotJobsResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dp dfs snapshot jobs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param dpDfsSnapshotPolicyId dp dfs snapshot policy (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDpDfsSnapshotJobsAsync(Long limit, Long offset, String q, String sort, Long dpDfsSnapshotPolicyId, final ApiCallback<DpDfsSnapshotJobsResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDpDfsSnapshotJobsValidateBeforeCall(limit, offset, q, sort, dpDfsSnapshotPolicyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DpDfsSnapshotJobsResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}