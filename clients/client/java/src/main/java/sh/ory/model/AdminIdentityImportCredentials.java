/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.39
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
import sh.ory.model.AdminCreateIdentityImportCredentialsOidc;
import sh.ory.model.AdminCreateIdentityImportCredentialsPassword;

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
 * AdminIdentityImportCredentials
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-12T14:18:52.808756159Z[Etc/UTC]")
public class AdminIdentityImportCredentials {
  public static final String SERIALIZED_NAME_OIDC = "oidc";
  @SerializedName(SERIALIZED_NAME_OIDC)
  private AdminCreateIdentityImportCredentialsOidc oidc;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private AdminCreateIdentityImportCredentialsPassword password;

  public AdminIdentityImportCredentials() { 
  }

  public AdminIdentityImportCredentials oidc(AdminCreateIdentityImportCredentialsOidc oidc) {
    
    this.oidc = oidc;
    return this;
  }

   /**
   * Get oidc
   * @return oidc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminCreateIdentityImportCredentialsOidc getOidc() {
    return oidc;
  }


  public void setOidc(AdminCreateIdentityImportCredentialsOidc oidc) {
    this.oidc = oidc;
  }


  public AdminIdentityImportCredentials password(AdminCreateIdentityImportCredentialsPassword password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminCreateIdentityImportCredentialsPassword getPassword() {
    return password;
  }


  public void setPassword(AdminCreateIdentityImportCredentialsPassword password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminIdentityImportCredentials adminIdentityImportCredentials = (AdminIdentityImportCredentials) o;
    return Objects.equals(this.oidc, adminIdentityImportCredentials.oidc) &&
        Objects.equals(this.password, adminIdentityImportCredentials.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oidc, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminIdentityImportCredentials {\n");
    sb.append("    oidc: ").append(toIndentedString(oidc)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("oidc");
    openapiFields.add("password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AdminIdentityImportCredentials
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AdminIdentityImportCredentials.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdminIdentityImportCredentials is not found in the empty JSON string", AdminIdentityImportCredentials.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AdminIdentityImportCredentials.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdminIdentityImportCredentials` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `oidc`
      if (jsonObj.getAsJsonObject("oidc") != null) {
        AdminCreateIdentityImportCredentialsOidc.validateJsonObject(jsonObj.getAsJsonObject("oidc"));
      }
      // validate the optional field `password`
      if (jsonObj.getAsJsonObject("password") != null) {
        AdminCreateIdentityImportCredentialsPassword.validateJsonObject(jsonObj.getAsJsonObject("password"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdminIdentityImportCredentials.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdminIdentityImportCredentials' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdminIdentityImportCredentials> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdminIdentityImportCredentials.class));

       return (TypeAdapter<T>) new TypeAdapter<AdminIdentityImportCredentials>() {
           @Override
           public void write(JsonWriter out, AdminIdentityImportCredentials value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdminIdentityImportCredentials read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdminIdentityImportCredentials given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdminIdentityImportCredentials
  * @throws IOException if the JSON string is invalid with respect to AdminIdentityImportCredentials
  */
  public static AdminIdentityImportCredentials fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdminIdentityImportCredentials.class);
  }

 /**
  * Convert an instance of AdminIdentityImportCredentials to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

