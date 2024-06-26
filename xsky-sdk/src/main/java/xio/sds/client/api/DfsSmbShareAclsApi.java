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


import xio.sds.client.model.DfsSMBShareACLsResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DfsSmbShareAclsApi {
    private ApiClient apiClient;

    public DfsSmbShareAclsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DfsSmbShareAclsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listDfsSMBShareACLs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param dfsSmbShareId dfs smb share id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDfsSMBShareACLsCall(Long limit, Long offset, String clusterId, Long dfsSmbShareId, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dfs-smb-share-acls/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (clusterId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cluster_id", clusterId));
        if (dfsSmbShareId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dfs_smb_share_id", dfsSmbShareId));
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
    private com.squareup.okhttp.Call listDfsSMBShareACLsValidateBeforeCall(Long limit, Long offset, String clusterId, Long dfsSmbShareId, String q, String sort, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listDfsSMBShareACLsCall(limit, offset, clusterId, dfsSmbShareId, q, sort, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List dfs smb share acls
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param dfsSmbShareId dfs smb share id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return DfsSMBShareACLsResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DfsSMBShareACLsResp listDfsSMBShareACLs(Long limit, Long offset, String clusterId, Long dfsSmbShareId, String q, String sort) throws ApiException {
        ApiResponse<DfsSMBShareACLsResp> resp = listDfsSMBShareACLsWithHttpInfo(limit, offset, clusterId, dfsSmbShareId, q, sort);
        return resp.getData();
    }

    /**
     * 
     * List dfs smb share acls
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param dfsSmbShareId dfs smb share id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @return ApiResponse&lt;DfsSMBShareACLsResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DfsSMBShareACLsResp> listDfsSMBShareACLsWithHttpInfo(Long limit, Long offset, String clusterId, Long dfsSmbShareId, String q, String sort) throws ApiException {
        com.squareup.okhttp.Call call = listDfsSMBShareACLsValidateBeforeCall(limit, offset, clusterId, dfsSmbShareId, q, sort, null, null);
        Type localVarReturnType = new TypeToken<DfsSMBShareACLsResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dfs smb share acls
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param clusterId cluster id (optional)
     * @param dfsSmbShareId dfs smb share id (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDfsSMBShareACLsAsync(Long limit, Long offset, String clusterId, Long dfsSmbShareId, String q, String sort, final ApiCallback<DfsSMBShareACLsResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDfsSMBShareACLsValidateBeforeCall(limit, offset, clusterId, dfsSmbShareId, q, sort, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DfsSMBShareACLsResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
