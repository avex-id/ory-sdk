/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.41
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import sh.ory.model.AdminCreateIdentityImportCredentialsOidcConfig;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * AdminCreateIdentityImportCredentialsOidc
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T13:42:50.661579478Z[Etc/UTC]")
public class AdminCreateIdentityImportCredentialsOidc {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private AdminCreateIdentityImportCredentialsOidcConfig config;

  public AdminCreateIdentityImportCredentialsOidc() { 
  }

  public AdminCreateIdentityImportCredentialsOidc config(AdminCreateIdentityImportCredentialsOidcConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminCreateIdentityImportCredentialsOidcConfig getConfig() {
    return config;
  }


  public void setConfig(AdminCreateIdentityImportCredentialsOidcConfig config) {
    this.config = config;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCreateIdentityImportCredentialsOidc adminCreateIdentityImportCredentialsOidc = (AdminCreateIdentityImportCredentialsOidc) o;
    return Objects.equals(this.config, adminCreateIdentityImportCredentialsOidc.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateIdentityImportCredentialsOidc {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdminCreateIdentityImportCredentialsOidc
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdminCreateIdentityImportCredentialsOidc.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminCreateIdentityImportCredentialsOidc is not found in the empty JSON string", AdminCreateIdentityImportCredentialsOidc.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdminCreateIdentityImportCredentialsOidc.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminCreateIdentityImportCredentialsOidc` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `config`
      if (jsonObj.getAsJsonObject("config") != null) {
        AdminCreateIdentityImportCredentialsOidcConfig.validateJsonObject(jsonObj.getAsJsonObject("config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminCreateIdentityImportCredentialsOidc.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminCreateIdentityImportCredentialsOidc' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminCreateIdentityImportCredentialsOidc> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminCreateIdentityImportCredentialsOidc.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminCreateIdentityImportCredentialsOidc>() {
           @Override
           public void write(JsonWriter out, AdminCreateIdentityImportCredentialsOidc value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminCreateIdentityImportCredentialsOidc read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdminCreateIdentityImportCredentialsOidc given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdminCreateIdentityImportCredentialsOidc
  * @throws IOException if the JSON string is invalid with respect to AdminCreateIdentityImportCredentialsOidc
  */
  public static AdminCreateIdentityImportCredentialsOidc fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminCreateIdentityImportCredentialsOidc.class);
  }

 /**
  * Convert an instance of AdminCreateIdentityImportCredentialsOidc to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

