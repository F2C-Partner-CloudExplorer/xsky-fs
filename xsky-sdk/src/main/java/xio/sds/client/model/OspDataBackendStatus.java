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
 * Gets or Sets OspDataBackendStatus
 */
@JsonAdapter(OspDataBackendStatus.Adapter.class)
public enum OspDataBackendStatus {
  DATABACKENDSTATUSENABLED_ENABLED_("DataBackendStatusEnabled = \"enabled\""),
  DATABACKENDSTATUSSUSPENDED_SUSPENDED_("DataBackendStatusSuspended = \"suspended\""),
  DATABACKENDSTATUSERROR_ERROR_("DataBackendStatusError = \"error\"");

  private String value;

  OspDataBackendStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OspDataBackendStatus fromValue(String input) {
    for (OspDataBackendStatus b : OspDataBackendStatus.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<OspDataBackendStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OspDataBackendStatus enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public OspDataBackendStatus read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return OspDataBackendStatus.fromValue((String)(value));
    }
  }
}
