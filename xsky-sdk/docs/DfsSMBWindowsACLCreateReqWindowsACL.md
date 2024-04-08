# DfsSMBWindowsACLCreateReqWindowsACL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aceType** | **String** | type of acl, allowed or denied | 
**applyTo** | **String** | inherited information | 
**dfsRootfsId** | **Long** | id of rootfs | 
**fsActiveDirectoryId** | **Long** | fs active directory id |  [optional]
**path** | **String** | subdirectory or sub file of share path | 
**permissions** | **List&lt;String&gt;** | principal access permissions | 
**principalType** | **String** | principal type such as Everyone, user, user_group | 
**securityType** | **String** | security type like local, ad | 
**userGroupId** | **Long** | local fs user group id |  [optional]
**userGroupName** | **String** | domain user_group_name |  [optional]
**userId** | **Long** | local fs user id |  [optional]
**username** | **String** | domain username |  [optional]
