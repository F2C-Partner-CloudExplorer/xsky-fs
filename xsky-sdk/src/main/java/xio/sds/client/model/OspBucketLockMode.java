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
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets OspBucketLockMode
 */
@JsonAdapter(OspBucketLockMode.Adapter.class)
public enum OspBucketLockMode {
  BUCKETLOCKMODEGOVERNANCE_GOVERNANCE_("BucketLockModeGovernance = \"GOVERNANCE\""),
  BUCKETLOCKMODECOMPLIANCE_COMPLIANCE_("BucketLockModeCompliance = \"COMPLIANCE\"");

  private String value;

  OspBucketLockMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OspBucketLockMode fromValue(String input) {
    for (OspBucketLockMode b : OspBucketLockMode.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OspBucketLockMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final OspBucketLockMode enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public OspBucketLockMode read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return OspBucketLockMode.fromValue((String)(value));
    }
  }
}
