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


import xio.sds.client.model.EventLogsResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventLogsApi {
    private ApiClient apiClient;

    public EventLogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventLogsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for listEventLogs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param status status of event logs (optional)
     * @param resourceType resource type of event logs (optional)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listEventLogsCall(Long limit, Long offset, String status, String resourceType, String durationBegin, String durationEnd, String q, String sort, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/event-logs/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("status", status));
        if (resourceType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("resource_type", resourceType));
        if (durationBegin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("duration_begin", durationBegin));
        if (durationEnd != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("duration_end", durationEnd));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));
        if (sort != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sort", sort));
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
    private com.squareup.okhttp.Call listEventLogsValidateBeforeCall(Long limit, Long offset, String status, String resourceType, String durationBegin, String durationEnd, String q, String sort, String clusterId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listEventLogsCall(limit, offset, status, resourceType, durationBegin, durationEnd, q, sort, clusterId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List event logs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param status status of event logs (optional)
     * @param resourceType resource type of event logs (optional)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @return EventLogsResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventLogsResp listEventLogs(Long limit, Long offset, String status, String resourceType, String durationBegin, String durationEnd, String q, String sort, String clusterId) throws ApiException {
        ApiResponse<EventLogsResp> resp = listEventLogsWithHttpInfo(limit, offset, status, resourceType, durationBegin, durationEnd, q, sort, clusterId);
        return resp.getData();
    }

    /**
     * 
     * List event logs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param status status of event logs (optional)
     * @param resourceType resource type of event logs (optional)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @return ApiResponse&lt;EventLogsResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventLogsResp> listEventLogsWithHttpInfo(Long limit, Long offset, String status, String resourceType, String durationBegin, String durationEnd, String q, String sort, String clusterId) throws ApiException {
        com.squareup.okhttp.Call call = listEventLogsValidateBeforeCall(limit, offset, status, resourceType, durationBegin, durationEnd, q, sort, clusterId, null, null);
        Type localVarReturnType = new TypeToken<EventLogsResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List event logs
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param status status of event logs (optional)
     * @param resourceType resource type of event logs (optional)
     * @param durationBegin duration begin timestamp (optional)
     * @param durationEnd duration end timestamp (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param clusterId cluster id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listEventLogsAsync(Long limit, Long offset, String status, String resourceType, String durationBegin, String durationEnd, String q, String sort, String clusterId, final ApiCallback<EventLogsResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listEventLogsValidateBeforeCall(limit, offset, status, resourceType, durationBegin, durationEnd, q, sort, clusterId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventLogsResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
