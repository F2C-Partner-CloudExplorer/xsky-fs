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

package xio.sds.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import xio.sds.client.model.OspBucketClassFilter;
import xio.sds.client.model.OspBucketKVPair;
/**
 * OspBucketFilter
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-01T09:00:29.487Z[GMT]")
public class OspBucketFilter {
  @SerializedName("prefix_negate")
  private String prefixNegate = null;

  @SerializedName("suffix")
  private String suffix = null;

  @SerializedName("storage_target")
  private List<OspBucketClassFilter> storageTarget = null;

  @SerializedName("object_size_less_than")
  private Long objectSizeLessThan = null;

  @SerializedName("tag_negate")
  private List<OspBucketKVPair> tagNegate = null;

  @SerializedName("tag")
  private List<OspBucketKVPair> tag = null;

  @SerializedName("suffix_negate")
  private String suffixNegate = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("meta_negate")
  private List<OspBucketKVPair> metaNegate = null;

  @SerializedName("meta")
  private List<OspBucketKVPair> meta = null;

  @SerializedName("owner_not_found")
  private List<String> ownerNotFound = null;

  @SerializedName("content_type")
  private List<String> contentType = null;

  @SerializedName("owner")
  private List<Long> owner = null;

  @SerializedName("object_size_greater_than")
  private Long objectSizeGreaterThan = null;

  public OspBucketFilter prefixNegate(String prefixNegate) {
    this.prefixNegate = prefixNegate;
    return this;
  }

   /**
   * Get prefixNegate
   * @return prefixNegate
  **/
  @Schema(description = "")
  public String getPrefixNegate() {
    return prefixNegate;
  }

  public void setPrefixNegate(String prefixNegate) {
    this.prefixNegate = prefixNegate;
  }

  public OspBucketFilter suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * Get suffix
   * @return suffix
  **/
  @Schema(description = "")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public OspBucketFilter storageTarget(List<OspBucketClassFilter> storageTarget) {
    this.storageTarget = storageTarget;
    return this;
  }

  public OspBucketFilter addStorageTargetItem(OspBucketClassFilter storageTargetItem) {
    if (this.storageTarget == null) {
      this.storageTarget = new ArrayList<OspBucketClassFilter>();
    }
    this.storageTarget.add(storageTargetItem);
    return this;
  }

   /**
   * Get storageTarget
   * @return storageTarget
  **/
  @Schema(description = "")
  public List<OspBucketClassFilter> getStorageTarget() {
    return storageTarget;
  }

  public void setStorageTarget(List<OspBucketClassFilter> storageTarget) {
    this.storageTarget = storageTarget;
  }

  public OspBucketFilter objectSizeLessThan(Long objectSizeLessThan) {
    this.objectSizeLessThan = objectSizeLessThan;
    return this;
  }

   /**
   * Get objectSizeLessThan
   * @return objectSizeLessThan
  **/
  @Schema(description = "")
  public Long getObjectSizeLessThan() {
    return objectSizeLessThan;
  }

  public void setObjectSizeLessThan(Long objectSizeLessThan) {
    this.objectSizeLessThan = objectSizeLessThan;
  }

  public OspBucketFilter tagNegate(List<OspBucketKVPair> tagNegate) {
    this.tagNegate = tagNegate;
    return this;
  }

  public OspBucketFilter addTagNegateItem(OspBucketKVPair tagNegateItem) {
    if (this.tagNegate == null) {
      this.tagNegate = new ArrayList<OspBucketKVPair>();
    }
    this.tagNegate.add(tagNegateItem);
    return this;
  }

   /**
   * Get tagNegate
   * @return tagNegate
  **/
  @Schema(description = "")
  public List<OspBucketKVPair> getTagNegate() {
    return tagNegate;
  }

  public void setTagNegate(List<OspBucketKVPair> tagNegate) {
    this.tagNegate = tagNegate;
  }

  public OspBucketFilter tag(List<OspBucketKVPair> tag) {
    this.tag = tag;
    return this;
  }

  public OspBucketFilter addTagItem(OspBucketKVPair tagItem) {
    if (this.tag == null) {
      this.tag = new ArrayList<OspBucketKVPair>();
    }
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @Schema(description = "")
  public List<OspBucketKVPair> getTag() {
    return tag;
  }

  public void setTag(List<OspBucketKVPair> tag) {
    this.tag = tag;
  }

  public OspBucketFilter suffixNegate(String suffixNegate) {
    this.suffixNegate = suffixNegate;
    return this;
  }

   /**
   * Get suffixNegate
   * @return suffixNegate
  **/
  @Schema(description = "")
  public String getSuffixNegate() {
    return suffixNegate;
  }

  public void setSuffixNegate(String suffixNegate) {
    this.suffixNegate = suffixNegate;
  }

  public OspBucketFilter prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @Schema(description = "")
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public OspBucketFilter metaNegate(List<OspBucketKVPair> metaNegate) {
    this.metaNegate = metaNegate;
    return this;
  }

  public OspBucketFilter addMetaNegateItem(OspBucketKVPair metaNegateItem) {
    if (this.metaNegate == null) {
      this.metaNegate = new ArrayList<OspBucketKVPair>();
    }
    this.metaNegate.add(metaNegateItem);
    return this;
  }

   /**
   * Get metaNegate
   * @return metaNegate
  **/
  @Schema(description = "")
  public List<OspBucketKVPair> getMetaNegate() {
    return metaNegate;
  }

  public void setMetaNegate(List<OspBucketKVPair> metaNegate) {
    this.metaNegate = metaNegate;
  }

  public OspBucketFilter meta(List<OspBucketKVPair> meta) {
    this.meta = meta;
    return this;
  }

  public OspBucketFilter addMetaItem(OspBucketKVPair metaItem) {
    if (this.meta == null) {
      this.meta = new ArrayList<OspBucketKVPair>();
    }
    this.meta.add(metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")
  public List<OspBucketKVPair> getMeta() {
    return meta;
  }

  public void setMeta(List<OspBucketKVPair> meta) {
    this.meta = meta;
  }

  public OspBucketFilter ownerNotFound(List<String> ownerNotFound) {
    this.ownerNotFound = ownerNotFound;
    return this;
  }

  public OspBucketFilter addOwnerNotFoundItem(String ownerNotFoundItem) {
    if (this.ownerNotFound == null) {
      this.ownerNotFound = new ArrayList<String>();
    }
    this.ownerNotFound.add(ownerNotFoundItem);
    return this;
  }

   /**
   * Get ownerNotFound
   * @return ownerNotFound
  **/
  @Schema(description = "")
  public List<String> getOwnerNotFound() {
    return ownerNotFound;
  }

  public void setOwnerNotFound(List<String> ownerNotFound) {
    this.ownerNotFound = ownerNotFound;
  }

  public OspBucketFilter contentType(List<String> contentType) {
    this.contentType = contentType;
    return this;
  }

  public OspBucketFilter addContentTypeItem(String contentTypeItem) {
    if (this.contentType == null) {
      this.contentType = new ArrayList<String>();
    }
    this.contentType.add(contentTypeItem);
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @Schema(description = "")
  public List<String> getContentType() {
    return contentType;
  }

  public void setContentType(List<String> contentType) {
    this.contentType = contentType;
  }

  public OspBucketFilter owner(List<Long> owner) {
    this.owner = owner;
    return this;
  }

  public OspBucketFilter addOwnerItem(Long ownerItem) {
    if (this.owner == null) {
      this.owner = new ArrayList<Long>();
    }
    this.owner.add(ownerItem);
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public List<Long> getOwner() {
    return owner;
  }

  public void setOwner(List<Long> owner) {
    this.owner = owner;
  }

  public OspBucketFilter objectSizeGreaterThan(Long objectSizeGreaterThan) {
    this.objectSizeGreaterThan = objectSizeGreaterThan;
    return this;
  }

   /**
   * Get objectSizeGreaterThan
   * @return objectSizeGreaterThan
  **/
  @Schema(description = "")
  public Long getObjectSizeGreaterThan() {
    return objectSizeGreaterThan;
  }

  public void setObjectSizeGreaterThan(Long objectSizeGreaterThan) {
    this.objectSizeGreaterThan = objectSizeGreaterThan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OspBucketFilter ospBucketFilter = (OspBucketFilter) o;
    return Objects.equals(this.prefixNegate, ospBucketFilter.prefixNegate) &&
        Objects.equals(this.suffix, ospBucketFilter.suffix) &&
        Objects.equals(this.storageTarget, ospBucketFilter.storageTarget) &&
        Objects.equals(this.objectSizeLessThan, ospBucketFilter.objectSizeLessThan) &&
        Objects.equals(this.tagNegate, ospBucketFilter.tagNegate) &&
        Objects.equals(this.tag, ospBucketFilter.tag) &&
        Objects.equals(this.suffixNegate, ospBucketFilter.suffixNegate) &&
        Objects.equals(this.prefix, ospBucketFilter.prefix) &&
        Objects.equals(this.metaNegate, ospBucketFilter.metaNegate) &&
        Objects.equals(this.meta, ospBucketFilter.meta) &&
        Objects.equals(this.ownerNotFound, ospBucketFilter.ownerNotFound) &&
        Objects.equals(this.contentType, ospBucketFilter.contentType) &&
        Objects.equals(this.owner, ospBucketFilter.owner) &&
        Objects.equals(this.objectSizeGreaterThan, ospBucketFilter.objectSizeGreaterThan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixNegate, suffix, storageTarget, objectSizeLessThan, tagNegate, tag, suffixNegate, prefix, metaNegate, meta, ownerNotFound, contentType, owner, objectSizeGreaterThan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OspBucketFilter {\n");
    
    sb.append("    prefixNegate: ").append(toIndentedString(prefixNegate)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    storageTarget: ").append(toIndentedString(storageTarget)).append("\n");
    sb.append("    objectSizeLessThan: ").append(toIndentedString(objectSizeLessThan)).append("\n");
    sb.append("    tagNegate: ").append(toIndentedString(tagNegate)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    suffixNegate: ").append(toIndentedString(suffixNegate)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    metaNegate: ").append(toIndentedString(metaNegate)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    ownerNotFound: ").append(toIndentedString(ownerNotFound)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    objectSizeGreaterThan: ").append(toIndentedString(objectSizeGreaterThan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
