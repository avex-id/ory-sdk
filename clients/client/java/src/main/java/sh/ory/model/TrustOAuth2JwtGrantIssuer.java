/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.26
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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.JsonWebKey;

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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * Trust OAuth2 JWT Bearer Grant Type Issuer Request Body
 */
@ApiModel(description = "Trust OAuth2 JWT Bearer Grant Type Issuer Request Body")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-05T06:48:46.434133512Z[Etc/UTC]")
public class TrustOAuth2JwtGrantIssuer {
  public static final String SERIALIZED_NAME_ALLOW_ANY_SUBJECT = "allow_any_subject";
  @SerializedName(SERIALIZED_NAME_ALLOW_ANY_SUBJECT)
  private Boolean allowAnySubject;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private String issuer;

  public static final String SERIALIZED_NAME_JWK = "jwk";
  @SerializedName(SERIALIZED_NAME_JWK)
  private JsonWebKey jwk;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private List<String> scope = new ArrayList<>();

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public TrustOAuth2JwtGrantIssuer() {
  }

  public TrustOAuth2JwtGrantIssuer allowAnySubject(Boolean allowAnySubject) {
    
    this.allowAnySubject = allowAnySubject;
    return this;
  }

   /**
   * The \&quot;allow_any_subject\&quot; indicates that the issuer is allowed to have any principal as the subject of the JWT.
   * @return allowAnySubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The \"allow_any_subject\" indicates that the issuer is allowed to have any principal as the subject of the JWT.")

  public Boolean getAllowAnySubject() {
    return allowAnySubject;
  }


  public void setAllowAnySubject(Boolean allowAnySubject) {
    this.allowAnySubject = allowAnySubject;
  }


  public TrustOAuth2JwtGrantIssuer expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The \&quot;expires_at\&quot; indicates, when grant will expire, so we will reject assertion from \&quot;issuer\&quot; targeting \&quot;subject\&quot;.
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The \"expires_at\" indicates, when grant will expire, so we will reject assertion from \"issuer\" targeting \"subject\".")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public TrustOAuth2JwtGrantIssuer issuer(String issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * The \&quot;issuer\&quot; identifies the principal that issued the JWT assertion (same as \&quot;iss\&quot; claim in JWT).
   * @return issuer
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://jwt-idp.example.com", required = true, value = "The \"issuer\" identifies the principal that issued the JWT assertion (same as \"iss\" claim in JWT).")

  public String getIssuer() {
    return issuer;
  }


  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  public TrustOAuth2JwtGrantIssuer jwk(JsonWebKey jwk) {
    
    this.jwk = jwk;
    return this;
  }

   /**
   * Get jwk
   * @return jwk
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JsonWebKey getJwk() {
    return jwk;
  }


  public void setJwk(JsonWebKey jwk) {
    this.jwk = jwk;
  }


  public TrustOAuth2JwtGrantIssuer scope(List<String> scope) {
    
    this.scope = scope;
    return this;
  }

  public TrustOAuth2JwtGrantIssuer addScopeItem(String scopeItem) {
    this.scope.add(scopeItem);
    return this;
  }

   /**
   * The \&quot;scope\&quot; contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749])
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"openid\",\"offline\"]", required = true, value = "The \"scope\" contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749])")

  public List<String> getScope() {
    return scope;
  }


  public void setScope(List<String> scope) {
    this.scope = scope;
  }


  public TrustOAuth2JwtGrantIssuer subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The \&quot;subject\&quot; identifies the principal that is the subject of the JWT.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mike@example.com", value = "The \"subject\" identifies the principal that is the subject of the JWT.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustOAuth2JwtGrantIssuer trustOAuth2JwtGrantIssuer = (TrustOAuth2JwtGrantIssuer) o;
    return Objects.equals(this.allowAnySubject, trustOAuth2JwtGrantIssuer.allowAnySubject) &&
        Objects.equals(this.expiresAt, trustOAuth2JwtGrantIssuer.expiresAt) &&
        Objects.equals(this.issuer, trustOAuth2JwtGrantIssuer.issuer) &&
        Objects.equals(this.jwk, trustOAuth2JwtGrantIssuer.jwk) &&
        Objects.equals(this.scope, trustOAuth2JwtGrantIssuer.scope) &&
        Objects.equals(this.subject, trustOAuth2JwtGrantIssuer.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAnySubject, expiresAt, issuer, jwk, scope, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustOAuth2JwtGrantIssuer {\n");
    sb.append("    allowAnySubject: ").append(toIndentedString(allowAnySubject)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    jwk: ").append(toIndentedString(jwk)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("allow_any_subject");
    openapiFields.add("expires_at");
    openapiFields.add("issuer");
    openapiFields.add("jwk");
    openapiFields.add("scope");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expires_at");
    openapiRequiredFields.add("issuer");
    openapiRequiredFields.add("jwk");
    openapiRequiredFields.add("scope");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TrustOAuth2JwtGrantIssuer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TrustOAuth2JwtGrantIssuer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TrustOAuth2JwtGrantIssuer is not found in the empty JSON string", TrustOAuth2JwtGrantIssuer.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TrustOAuth2JwtGrantIssuer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TrustOAuth2JwtGrantIssuer` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TrustOAuth2JwtGrantIssuer.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      // validate the required field `jwk`
      JsonWebKey.validateJsonObject(jsonObj.getAsJsonObject("jwk"));
      // ensure the required json array is present
      if (jsonObj.get("scope") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("scope").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be an array in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TrustOAuth2JwtGrantIssuer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TrustOAuth2JwtGrantIssuer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TrustOAuth2JwtGrantIssuer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TrustOAuth2JwtGrantIssuer.class));

       return (TypeAdapter<T>) new TypeAdapter<TrustOAuth2JwtGrantIssuer>() {
           @Override
           public void write(JsonWriter out, TrustOAuth2JwtGrantIssuer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TrustOAuth2JwtGrantIssuer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TrustOAuth2JwtGrantIssuer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TrustOAuth2JwtGrantIssuer
  * @throws IOException if the JSON string is invalid with respect to TrustOAuth2JwtGrantIssuer
  */
  public static TrustOAuth2JwtGrantIssuer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TrustOAuth2JwtGrantIssuer.class);
  }

 /**
  * Convert an instance of TrustOAuth2JwtGrantIssuer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

