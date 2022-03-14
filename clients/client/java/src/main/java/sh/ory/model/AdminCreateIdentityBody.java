/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.125
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.AdminIdentityImportCredentials;
import sh.ory.model.IdentityState;
import sh.ory.model.RecoveryAddress;
import sh.ory.model.VerifiableIdentityAddress;

/**
 * AdminCreateIdentityBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-14T17:16:34.528362018Z[Etc/UTC]")
public class AdminCreateIdentityBody {
  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private AdminIdentityImportCredentials credentials;

  public static final String SERIALIZED_NAME_RECOVERY_ADDRESSES = "recovery_addresses";
  @SerializedName(SERIALIZED_NAME_RECOVERY_ADDRESSES)
  private List<RecoveryAddress> recoveryAddresses = null;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private IdentityState state;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_VERIFIABLE_ADDRESSES = "verifiable_addresses";
  @SerializedName(SERIALIZED_NAME_VERIFIABLE_ADDRESSES)
  private List<VerifiableIdentityAddress> verifiableAddresses = null;

  public AdminCreateIdentityBody() { 
  }

  public AdminCreateIdentityBody credentials(AdminIdentityImportCredentials credentials) {
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AdminIdentityImportCredentials getCredentials() {
    return credentials;
  }


  public void setCredentials(AdminIdentityImportCredentials credentials) {
    this.credentials = credentials;
  }


  public AdminCreateIdentityBody recoveryAddresses(List<RecoveryAddress> recoveryAddresses) {
    
    this.recoveryAddresses = recoveryAddresses;
    return this;
  }

  public AdminCreateIdentityBody addRecoveryAddressesItem(RecoveryAddress recoveryAddressesItem) {
    if (this.recoveryAddresses == null) {
      this.recoveryAddresses = new ArrayList<>();
    }
    this.recoveryAddresses.add(recoveryAddressesItem);
    return this;
  }

   /**
   * RecoveryAddresses contains all the addresses that can be used to recover an identity.  Use this structure to import recovery addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
   * @return recoveryAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RecoveryAddresses contains all the addresses that can be used to recover an identity.  Use this structure to import recovery addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.")

  public List<RecoveryAddress> getRecoveryAddresses() {
    return recoveryAddresses;
  }


  public void setRecoveryAddresses(List<RecoveryAddress> recoveryAddresses) {
    this.recoveryAddresses = recoveryAddresses;
  }


  public AdminCreateIdentityBody schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits.
   * @return schemaId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public AdminCreateIdentityBody state(IdentityState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityState getState() {
    return state;
  }


  public void setState(IdentityState state) {
    this.state = state;
  }


  public AdminCreateIdentityBody traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_url&#x60;.
   * @return traits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public AdminCreateIdentityBody verifiableAddresses(List<VerifiableIdentityAddress> verifiableAddresses) {
    
    this.verifiableAddresses = verifiableAddresses;
    return this;
  }

  public AdminCreateIdentityBody addVerifiableAddressesItem(VerifiableIdentityAddress verifiableAddressesItem) {
    if (this.verifiableAddresses == null) {
      this.verifiableAddresses = new ArrayList<>();
    }
    this.verifiableAddresses.add(verifiableAddressesItem);
    return this;
  }

   /**
   * VerifiableAddresses contains all the addresses that can be verified by the user.  Use this structure to import verified addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
   * @return verifiableAddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VerifiableAddresses contains all the addresses that can be verified by the user.  Use this structure to import verified addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.")

  public List<VerifiableIdentityAddress> getVerifiableAddresses() {
    return verifiableAddresses;
  }


  public void setVerifiableAddresses(List<VerifiableIdentityAddress> verifiableAddresses) {
    this.verifiableAddresses = verifiableAddresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminCreateIdentityBody adminCreateIdentityBody = (AdminCreateIdentityBody) o;
    return Objects.equals(this.credentials, adminCreateIdentityBody.credentials) &&
        Objects.equals(this.recoveryAddresses, adminCreateIdentityBody.recoveryAddresses) &&
        Objects.equals(this.schemaId, adminCreateIdentityBody.schemaId) &&
        Objects.equals(this.state, adminCreateIdentityBody.state) &&
        Objects.equals(this.traits, adminCreateIdentityBody.traits) &&
        Objects.equals(this.verifiableAddresses, adminCreateIdentityBody.verifiableAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, recoveryAddresses, schemaId, state, traits, verifiableAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminCreateIdentityBody {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    recoveryAddresses: ").append(toIndentedString(recoveryAddresses)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    verifiableAddresses: ").append(toIndentedString(verifiableAddresses)).append("\n");
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

}

