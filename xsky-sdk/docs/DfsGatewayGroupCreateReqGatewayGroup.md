# DfsGatewayGroupCreateReqGatewayGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adId** | **Long** | active directory id |  [optional]
**cpus** | **Long** | cpus of gateway container |  [optional]
**description** | **String** | description of gateway group |  [optional]
**dfsGateways** | [**List&lt;DfsGatewayReq&gt;**](DfsGatewayReq.md) | dfs gateways list | 
**dfsVipGateways** | **List&lt;String&gt;** | VIPGateways contains all the gateways of VIP network |  [optional]
**dfsVips** | **List&lt;String&gt;** | VIPs of gateway group | 
**encoding** | **String** | ftp encoding format, default is utf8 |  [optional]
**hdfsSecurities** | **List&lt;String&gt;** | security type for hdfs (local, ldap) |  [optional]
**ldapId** | **Long** | ldap id |  [optional]
**memoryKbyte** | **Long** | memory limit of gateway container, unit KB |  [optional]
**name** | **String** | name of gateway group | 
**nfsVersions** | **List&lt;String&gt;** | nfs versions of nfs supported |  [optional]
**securities** | **List&lt;String&gt;** | security type for smb/quota (local, ad, ldap) |  [optional]
**smb1Enabled** | **Boolean** | smb version 1.0 enabled |  [optional]
**smbBrowseable** | **Boolean** | smb browseable enable |  [optional]
**smbHomes** | **Boolean** | smb Homes share enable |  [optional]
**smbPorts** | **List&lt;Long&gt;** | smb ports |  [optional]
**smbType** | **String** | smb service type (smb, xsmb) |  [optional]
**types** | **List&lt;String&gt;** | types of supported (smb, nfs, ftp) | 
**zoneName** | **String** | name of gateway zone |  [optional]
