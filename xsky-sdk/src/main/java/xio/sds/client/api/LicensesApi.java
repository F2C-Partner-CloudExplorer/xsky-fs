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


import java.io.File;
import xio.sds.client.model.LicenseResp;
import xio.sds.client.model.LicenseSummaryResp;
import xio.sds.client.model.LicensesResp;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LicensesApi {
    private ApiClient apiClient;

    public LicensesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LicensesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for disableLicense
     * @param licenseId the license id (required)
     * @param force force disable not expired license (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call disableLicenseCall(Long licenseId, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/licenses/{license_id}:disable"
            .replaceAll("\\{" + "license_id" + "\\}", apiClient.escapeString(licenseId.toString()));

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call disableLicenseValidateBeforeCall(Long licenseId, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'licenseId' is set
        if (licenseId == null) {
            throw new ApiException("Missing the required parameter 'licenseId' when calling disableLicense(Async)");
        }
        
        com.squareup.okhttp.Call call = disableLicenseCall(licenseId, force, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * disable license
     * @param licenseId the license id (required)
     * @param force force disable not expired license (optional)
     * @return LicenseResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LicenseResp disableLicense(Long licenseId, Boolean force) throws ApiException {
        ApiResponse<LicenseResp> resp = disableLicenseWithHttpInfo(licenseId, force);
        return resp.getData();
    }

    /**
     * 
     * disable license
     * @param licenseId the license id (required)
     * @param force force disable not expired license (optional)
     * @return ApiResponse&lt;LicenseResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LicenseResp> disableLicenseWithHttpInfo(Long licenseId, Boolean force) throws ApiException {
        com.squareup.okhttp.Call call = disableLicenseValidateBeforeCall(licenseId, force, null, null);
        Type localVarReturnType = new TypeToken<LicenseResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * disable license
     * @param licenseId the license id (required)
     * @param force force disable not expired license (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call disableLicenseAsync(Long licenseId, Boolean force, final ApiCallback<LicenseResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = disableLicenseValidateBeforeCall(licenseId, force, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LicenseResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for downloadLicenseKey
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadLicenseKeyCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/licenses/key";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call downloadLicenseKeyValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = downloadLicenseKeyCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get license key file
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File downloadLicenseKey() throws ApiException {
        ApiResponse<File> resp = downloadLicenseKeyWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * get license key file
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> downloadLicenseKeyWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = downloadLicenseKeyValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get license key file
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadLicenseKeyAsync(final ApiCallback<File> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = downloadLicenseKeyValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLicense
     * @param licenseId the license id (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLicenseCall(Long licenseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/licenses/{license_id}"
            .replaceAll("\\{" + "license_id" + "\\}", apiClient.escapeString(licenseId.toString()));

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
    private com.squareup.okhttp.Call getLicenseValidateBeforeCall(Long licenseId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'licenseId' is set
        if (licenseId == null) {
            throw new ApiException("Missing the required parameter 'licenseId' when calling getLicense(Async)");
        }
        
        com.squareup.okhttp.Call call = getLicenseCall(licenseId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * get license
     * @param licenseId the license id (required)
     * @return LicenseResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LicenseResp getLicense(Long licenseId) throws ApiException {
        ApiResponse<LicenseResp> resp = getLicenseWithHttpInfo(licenseId);
        return resp.getData();
    }

    /**
     * 
     * get license
     * @param licenseId the license id (required)
     * @return ApiResponse&lt;LicenseResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LicenseResp> getLicenseWithHttpInfo(Long licenseId) throws ApiException {
        com.squareup.okhttp.Call call = getLicenseValidateBeforeCall(licenseId, null, null);
        Type localVarReturnType = new TypeToken<LicenseResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get license
     * @param licenseId the license id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLicenseAsync(Long licenseId, final ApiCallback<LicenseResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLicenseValidateBeforeCall(licenseId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LicenseResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLicenseSummary
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLicenseSummaryCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/licenses/summary";

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getLicenseSummaryValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = getLicenseSummaryCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get licenses sumary
     * @return LicenseSummaryResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LicenseSummaryResp getLicenseSummary() throws ApiException {
        ApiResponse<LicenseSummaryResp> resp = getLicenseSummaryWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * Get licenses sumary
     * @return ApiResponse&lt;LicenseSummaryResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LicenseSummaryResp> getLicenseSummaryWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getLicenseSummaryValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<LicenseSummaryResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get licenses sumary
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLicenseSummaryAsync(final ApiCallback<LicenseSummaryResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLicenseSummaryValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LicenseSummaryResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listLicenses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param active filter license by active status (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listLicensesCall(Long limit, Long offset, String q, String sort, Boolean active, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/licenses/";

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
        if (active != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("active", active));

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listLicensesValidateBeforeCall(Long limit, Long offset, String q, String sort, Boolean active, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = listLicensesCall(limit, offset, q, sort, active, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * List licenses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param active filter license by active status (optional)
     * @return LicensesResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LicensesResp listLicenses(Long limit, Long offset, String q, String sort, Boolean active) throws ApiException {
        ApiResponse<LicensesResp> resp = listLicensesWithHttpInfo(limit, offset, q, sort, active);
        return resp.getData();
    }

    /**
     * 
     * List licenses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param active filter license by active status (optional)
     * @return ApiResponse&lt;LicensesResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LicensesResp> listLicensesWithHttpInfo(Long limit, Long offset, String q, String sort, Boolean active) throws ApiException {
        com.squareup.okhttp.Call call = listLicensesValidateBeforeCall(limit, offset, q, sort, active, null, null);
        Type localVarReturnType = new TypeToken<LicensesResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List licenses
     * @param limit paging param (optional)
     * @param offset paging param (optional)
     * @param q query param of search (optional)
     * @param sort sort param of search (optional)
     * @param active filter license by active status (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listLicensesAsync(Long limit, Long offset, String q, String sort, Boolean active, final ApiCallback<LicensesResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listLicensesValidateBeforeCall(limit, offset, q, sort, active, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LicensesResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for registerLicense
     * @param license  (required)
     * @param force force activate (optional)
     * @param dryRun dry run upload license file (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call registerLicenseCall(File license, Boolean force, Boolean dryRun, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/licenses/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (force != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("force", force));
        if (dryRun != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("dry_run", dryRun));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (license != null)
        localVarFormParams.put("license", license);

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private com.squareup.okhttp.Call registerLicenseValidateBeforeCall(File license, Boolean force, Boolean dryRun, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'license' is set
        if (license == null) {
            throw new ApiException("Missing the required parameter 'license' when calling registerLicense(Async)");
        }
        
        com.squareup.okhttp.Call call = registerLicenseCall(license, force, dryRun, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Activate product license
     * @param license  (required)
     * @param force force activate (optional)
     * @param dryRun dry run upload license file (optional)
     * @return LicenseResp
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LicenseResp registerLicense(File license, Boolean force, Boolean dryRun) throws ApiException {
        ApiResponse<LicenseResp> resp = registerLicenseWithHttpInfo(license, force, dryRun);
        return resp.getData();
    }

    /**
     * 
     * Activate product license
     * @param license  (required)
     * @param force force activate (optional)
     * @param dryRun dry run upload license file (optional)
     * @return ApiResponse&lt;LicenseResp&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LicenseResp> registerLicenseWithHttpInfo(File license, Boolean force, Boolean dryRun) throws ApiException {
        com.squareup.okhttp.Call call = registerLicenseValidateBeforeCall(license, force, dryRun, null, null);
        Type localVarReturnType = new TypeToken<LicenseResp>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Activate product license
     * @param license  (required)
     * @param force force activate (optional)
     * @param dryRun dry run upload license file (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call registerLicenseAsync(File license, Boolean force, Boolean dryRun, final ApiCallback<LicenseResp> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = registerLicenseValidateBeforeCall(license, force, dryRun, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LicenseResp>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
