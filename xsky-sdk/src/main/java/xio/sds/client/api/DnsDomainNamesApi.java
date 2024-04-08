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


import xio.sds.client.model.DNSDomainNameCreateReq;
import xio.sds.client.model.DNSDomainNameResp;
import xio.sds.client.model.DNSDomainNameUpdateReq;
import xio.sds.client.model.DNSDomainNamesResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DnsDomainNamesApi {
    private ApiClient apiClient;

    public DnsDomainNamesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DnsDomainNamesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createDNSDomainName
     * @param body DNS domain name info (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createDNSDomainNameCall(DNSDomainNameCreateReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/dns-domain-names/";

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
    private com.squareup.okhttp.Call createDNSDomainNameValidateBeforeCall(DNSDomainNameCreateReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createDNSDomainName(Async)");
        }
        
        com.squareup.okhttp.Call call = createDNSDomainNameCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Create a DNS domain name.
     * @param body DNS domain name info (required)
     * @return DNSDomainNameResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DNSDomainNameResp createDNSDomainName(DNSDomainNameCreateReq body) throws ApiException {
        ApiResponse<DNSDomainNameResp> resp = createDNSDomainNameWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 
     * Create a DNS domain name.
     * @param body DNS domain name info (required)
     * @return ApiResponse&lt;DNSDomainNameResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DNSDomainNameResp> createDNSDomainNameWithHttpInfo(DNSDomainNameCreateReq body) throws ApiException {
        com.squareup.okhttp.Call call = createDNSDomainNameValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<DNSDomainNameResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a DNS domain name.
     * @param body DNS domain name info (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createDNSDomainNameAsync(DNSDomainNameCreateReq body, final ApiCallback<DNSDomainNameResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createDNSDomainNameValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DNSDomainNameResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteDNSDomainName
     * @param nameId DNS domain name id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteDNSDomainNameCall(Long nameId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dns-domain-names/{name_id}"
            .replaceAll("\\{" + "name_id" + "\\}", apiClient.escapeString(nameId.toString()));

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
    private com.squareup.okhttp.Call deleteDNSDomainNameValidateBeforeCall(Long nameId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'nameId' is set
        if (nameId == null) {
            throw new ApiException("Missing the required parameter 'nameId' when calling deleteDNSDomainName(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteDNSDomainNameCall(nameId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Delete a DNS domain nam.
     * @param nameId DNS domain name id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteDNSDomainName(Long nameId) throws ApiException {
        deleteDNSDomainNameWithHttpInfo(nameId);
    }

    /**
     * 
     * Delete a DNS domain nam.
     * @param nameId DNS domain name id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteDNSDomainNameWithHttpInfo(Long nameId) throws ApiException {
        com.squareup.okhttp.Call call = deleteDNSDomainNameValidateBeforeCall(nameId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Delete a DNS domain nam.
     * @param nameId DNS domain name id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDNSDomainNameAsync(Long nameId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDNSDomainNameValidateBeforeCall(nameId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getDNSDomainName
     * @param nameId dns domain name id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDNSDomainNameCall(Long nameId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dns-domain-names/{name_id}"
            .replaceAll("\\{" + "name_id" + "\\}", apiClient.escapeString(nameId.toString()));

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
    private com.squareup.okhttp.Call getDNSDomainNameValidateBeforeCall(Long nameId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'nameId' is set
        if (nameId == null) {
            throw new ApiException("Missing the required parameter 'nameId' when calling getDNSDomainName(Async)");
        }
        
        com.squareup.okhttp.Call call = getDNSDomainNameCall(nameId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get a dns domain name
     * @param nameId dns domain name id (required)
     * @return DNSDomainNameResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DNSDomainNameResp getDNSDomainName(Long nameId) throws ApiException {
        ApiResponse<DNSDomainNameResp> resp = getDNSDomainNameWithHttpInfo(nameId);
        return resp.getData();
    }

    /**
     * 
     * Get a dns domain name
     * @param nameId dns domain name id (required)
     * @return ApiResponse&lt;DNSDomainNameResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DNSDomainNameResp> getDNSDomainNameWithHttpInfo(Long nameId) throws ApiException {
        com.squareup.okhttp.Call call = getDNSDomainNameValidateBeforeCall(nameId, null, null);
        Type localVarReturnType = new TypeToken<DNSDomainNameResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a dns domain name
     * @param nameId dns domain name id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDNSDomainNameAsync(Long nameId, final ApiCallback<DNSDomainNameResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getDNSDomainNameValidateBeforeCall(nameId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DNSDomainNameResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listDNSDomainNames
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param dnsZoneId dns zone id (optional)
     * @param dfsGatewayZoneId dfs gateway zone id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listDNSDomainNamesCall(Long limit, Long offset, Long dnsZoneId, Long dfsGatewayZoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/dns-domain-names/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (dnsZoneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dns_zone_id", dnsZoneId));
        if (dfsGatewayZoneId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dfs_gateway_zone_id", dfsGatewayZoneId));

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
    private com.squareup.okhttp.Call listDNSDomainNamesValidateBeforeCall(Long limit, Long offset, Long dnsZoneId, Long dfsGatewayZoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listDNSDomainNamesCall(limit, offset, dnsZoneId, dfsGatewayZoneId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List dns domain names
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param dnsZoneId dns zone id (optional)
     * @param dfsGatewayZoneId dfs gateway zone id (optional)
     * @return DNSDomainNamesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DNSDomainNamesResp listDNSDomainNames(Long limit, Long offset, Long dnsZoneId, Long dfsGatewayZoneId) throws ApiException {
        ApiResponse<DNSDomainNamesResp> resp = listDNSDomainNamesWithHttpInfo(limit, offset, dnsZoneId, dfsGatewayZoneId);
        return resp.getData();
    }

    /**
     * 
     * List dns domain names
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param dnsZoneId dns zone id (optional)
     * @param dfsGatewayZoneId dfs gateway zone id (optional)
     * @return ApiResponse&lt;DNSDomainNamesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DNSDomainNamesResp> listDNSDomainNamesWithHttpInfo(Long limit, Long offset, Long dnsZoneId, Long dfsGatewayZoneId) throws ApiException {
        com.squareup.okhttp.Call call = listDNSDomainNamesValidateBeforeCall(limit, offset, dnsZoneId, dfsGatewayZoneId, null, null);
        Type localVarReturnType = new TypeToken<DNSDomainNamesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List dns domain names
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param dnsZoneId dns zone id (optional)
     * @param dfsGatewayZoneId dfs gateway zone id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listDNSDomainNamesAsync(Long limit, Long offset, Long dnsZoneId, Long dfsGatewayZoneId, final ApiCallback<DNSDomainNamesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listDNSDomainNamesValidateBeforeCall(limit, offset, dnsZoneId, dfsGatewayZoneId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DNSDomainNamesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateDNSDomainName
     * @param body DNS domain name info (required)
     * @param nameId DNS domain name id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateDNSDomainNameCall(DNSDomainNameUpdateReq body, Long nameId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/dns-domain-names/{name_id}"
            .replaceAll("\\{" + "name_id" + "\\}", apiClient.escapeString(nameId.toString()));

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
    private com.squareup.okhttp.Call updateDNSDomainNameValidateBeforeCall(DNSDomainNameUpdateReq body, Long nameId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateDNSDomainName(Async)");
        }
        // verify the required parameter 'nameId' is set
        if (nameId == null) {
            throw new ApiException("Missing the required parameter 'nameId' when calling updateDNSDomainName(Async)");
        }
        
        com.squareup.okhttp.Call call = updateDNSDomainNameCall(body, nameId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Update a DNS domain name
     * @param body DNS domain name info (required)
     * @param nameId DNS domain name id (required)
     * @return DNSDomainNameResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DNSDomainNameResp updateDNSDomainName(DNSDomainNameUpdateReq body, Long nameId) throws ApiException {
        ApiResponse<DNSDomainNameResp> resp = updateDNSDomainNameWithHttpInfo(body, nameId);
        return resp.getData();
    }

    /**
     * 
     * Update a DNS domain name
     * @param body DNS domain name info (required)
     * @param nameId DNS domain name id (required)
     * @return ApiResponse&lt;DNSDomainNameResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DNSDomainNameResp> updateDNSDomainNameWithHttpInfo(DNSDomainNameUpdateReq body, Long nameId) throws ApiException {
        com.squareup.okhttp.Call call = updateDNSDomainNameValidateBeforeCall(body, nameId, null, null);
        Type localVarReturnType = new TypeToken<DNSDomainNameResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update a DNS domain name
     * @param body DNS domain name info (required)
     * @param nameId DNS domain name id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDNSDomainNameAsync(DNSDomainNameUpdateReq body, Long nameId, final ApiCallback<DNSDomainNameResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDNSDomainNameValidateBeforeCall(body, nameId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DNSDomainNameResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
