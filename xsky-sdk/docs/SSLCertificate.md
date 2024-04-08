# SSLCertificate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create** | [**OffsetDateTime**](OffsetDateTime.md) | created time of certificate |  [optional]
**description** | **String** | certificate description |  [optional]
**enabled** | **Boolean** | enabled or not |  [optional]
**forceHttps** | **Boolean** | redirect http request to https |  [optional]
**id** | **Long** | certificate id |  [optional]
**issuer** | **Object** | issuer info |  [optional]
**name** | **String** | certificate name |  [optional]
**notAfter** | [**OffsetDateTime**](OffsetDateTime.md) | validity is not after the time |  [optional]
**notBefore** | [**OffsetDateTime**](OffsetDateTime.md) | validity is not before the time |  [optional]
**permittedDnsDomains** | **List&lt;Object&gt;** | permitted dns domains |  [optional]
**publicKeyAlgorithm** | **String** | public key algorithm |  [optional]
**rawCertificate** | **String** | public certificate |  [optional]
**signatureAlgorithm** | **String** | signature algorithm |  [optional]
**status** | **String** |  |  [optional]
**subject** | **Object** | subject info |  [optional]
**type** | **String** | applied type: admin, s3, dfs_s3 |  [optional]
**update** | [**OffsetDateTime**](OffsetDateTime.md) | updated time of certificate |  [optional]
**version** | **Long** | certificate version |  [optional]
