# DfsSMBShareCreateReqShare

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessBasedShareEnum** | **Boolean** | smb access-based-share-enum enable |  [optional]
**aclInherited** | **Boolean** | default acl status |  [optional]
**caseSensitive** | **Boolean** | case sensitive |  [optional]
**description** | **String** | description of share |  [optional]
**dfsGatewayGroupId** | **Long** | gateway group id |  [optional]
**dfsRootfsId** | **Long** | rootfs id | 
**dfsSmbShareAcls** | [**List&lt;DfsSMBShareACLReq&gt;**](DfsSMBShareACLReq.md) | access control array |  [optional]
**hostsAllow** | **String** | allow ips in share |  [optional]
**name** | **String** | name of share | 
**oplocks** | **Boolean** | smb oplocks enable |  [optional]
**path** | **String** | directory path | 
**recycled** | **Boolean** | recycle status |  [optional]
**windowsAcl** | **Boolean** | windows acl status |  [optional]
