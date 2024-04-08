# DfsSMBWindowsACLSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aceType** | **String** | type of acl like allowed, denied | 
**actionType** | **String** | api action type like add, modify, delete | 
**applyTo** | **String** | inherited information | 
**fsActiveDirectoryId** | **Long** | fs active directory id |  [optional]
**permissions** | **List&lt;String&gt;** | principal access permissions | 
**principal** | **String** | the entity of performing access control |  [optional]
**principalType** | **String** | principal type like Everyone, user, user_group | 
**securityType** | **String** | security type like local, ad |  [optional]
**userGroupId** | **Long** | local fs user group id |  [optional]
**userGroupName** | **String** | domain user group name |  [optional]
**userId** | **Long** | local fs user id |  [optional]
**username** | **String** | domain username |  [optional]
