# DfsGatewayGroupUpdateTypesReqGatewayGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adId** | **Long** | active directory id |  [optional]
**encoding** | **String** | ftp encoding format, default is utf8 |  [optional]
**hdfsSecurities** | **List&lt;String&gt;** | security type for hdfs (local, ldap) |  [optional]
**ldapId** | **Long** | ldap id |  [optional]
**nfsVersions** | **List&lt;String&gt;** | nfs versions supported |  [optional]
**securities** | **List&lt;String&gt;** | security type for smb/quota (local, ad, ldap) |  [optional]
**smb1Enabled** | **Boolean** | smb version 1.0 enabled |  [optional]
**smbBrowseable** | **Boolean** | smb browseable enable |  [optional]
**smbHomes** | **Boolean** | smb Homes share enable |  [optional]
**smbPorts** | **List&lt;Long&gt;** | smb ports |  [optional]
**smbType** | **String** | smb service type (smb, xsmb) |  [optional]
**types** | **List&lt;String&gt;** | types of supported |  [optional]
