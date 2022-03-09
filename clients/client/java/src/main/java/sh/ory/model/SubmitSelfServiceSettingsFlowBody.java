/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.120
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
import sh.ory.model.SubmitSelfServiceSettingsFlowWithLookupMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithOidcMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithPasswordMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithProfileMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithTotpMethodBody;
import sh.ory.model.SubmitSelfServiceSettingsFlowWithWebAuthnMethodBody;

/**
 * SubmitSelfServiceSettingsFlowBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-09T12:19:06.426987449Z[Etc/UTC]")
public class SubmitSelfServiceSettingsFlowBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  protected String method;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private String flow;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_UNLINK = "unlink";
  @SerializedName(SERIALIZED_NAME_UNLINK)
  private String unlink;

  public static final String SERIALIZED_NAME_TOTP_CODE = "totp_code";
  @SerializedName(SERIALIZED_NAME_TOTP_CODE)
  private String totpCode;

  public static final String SERIALIZED_NAME_TOTP_UNLINK = "totp_unlink";
  @SerializedName(SERIALIZED_NAME_TOTP_UNLINK)
  private Boolean totpUnlink;

  public static final String SERIALIZED_NAME_WEBAUTHN_REGISTER = "webauthn_register";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_REGISTER)
  private String webauthnRegister;

  public static final String SERIALIZED_NAME_WEBAUTHN_REGISTER_DISPLAYNAME = "webauthn_register_displayname";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_REGISTER_DISPLAYNAME)
  private String webauthnRegisterDisplayname;

  public static final String SERIALIZED_NAME_WEBAUTHN_REMOVE = "webauthn_remove";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_REMOVE)
  private String webauthnRemove;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET_CONFIRM = "lookup_secret_confirm";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET_CONFIRM)
  private Boolean lookupSecretConfirm;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET_DISABLE = "lookup_secret_disable";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET_DISABLE)
  private Boolean lookupSecretDisable;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET_REGENERATE = "lookup_secret_regenerate";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET_REGENERATE)
  private Boolean lookupSecretRegenerate;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET_REVEAL = "lookup_secret_reveal";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET_REVEAL)
  private Boolean lookupSecretReveal;

  public SubmitSelfServiceSettingsFlowBody() { 
    this.method = this.getClass().getSimpleName();
  }

  public SubmitSelfServiceSettingsFlowBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * CSRFToken is the anti-CSRF token
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSRFToken is the anti-CSRF token")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceSettingsFlowBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method  Should be set to \&quot;lookup\&quot; when trying to add, update, or remove a lookup pairing.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method  Should be set to \"lookup\" when trying to add, update, or remove a lookup pairing.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceSettingsFlowBody password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password is the updated password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Password is the updated password")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public SubmitSelfServiceSettingsFlowBody traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * The identity&#39;s traits  in: body
   * @return traits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identity's traits  in: body")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public SubmitSelfServiceSettingsFlowBody flow(String flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * Flow ID is the flow&#39;s ID.  in: query
   * @return flow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flow ID is the flow's ID.  in: query")

  public String getFlow() {
    return flow;
  }


  public void setFlow(String flow) {
    this.flow = flow;
  }


  public SubmitSelfServiceSettingsFlowBody link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Link this provider  Either this or &#x60;unlink&#x60; must be set.  type: string in: body
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link this provider  Either this or `unlink` must be set.  type: string in: body")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public SubmitSelfServiceSettingsFlowBody unlink(String unlink) {
    
    this.unlink = unlink;
    return this;
  }

   /**
   * Unlink this provider  Either this or &#x60;link&#x60; must be set.  type: string in: body
   * @return unlink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unlink this provider  Either this or `link` must be set.  type: string in: body")

  public String getUnlink() {
    return unlink;
  }


  public void setUnlink(String unlink) {
    this.unlink = unlink;
  }


  public SubmitSelfServiceSettingsFlowBody totpCode(String totpCode) {
    
    this.totpCode = totpCode;
    return this;
  }

   /**
   * ValidationTOTP must contain a valid TOTP based on the
   * @return totpCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ValidationTOTP must contain a valid TOTP based on the")

  public String getTotpCode() {
    return totpCode;
  }


  public void setTotpCode(String totpCode) {
    this.totpCode = totpCode;
  }


  public SubmitSelfServiceSettingsFlowBody totpUnlink(Boolean totpUnlink) {
    
    this.totpUnlink = totpUnlink;
    return this;
  }

   /**
   * UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device.
   * @return totpUnlink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UnlinkTOTP if true will remove the TOTP pairing, effectively removing the credential. This can be used to set up a new TOTP device.")

  public Boolean getTotpUnlink() {
    return totpUnlink;
  }


  public void setTotpUnlink(Boolean totpUnlink) {
    this.totpUnlink = totpUnlink;
  }


  public SubmitSelfServiceSettingsFlowBody webauthnRegister(String webauthnRegister) {
    
    this.webauthnRegister = webauthnRegister;
    return this;
  }

   /**
   * Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
   * @return webauthnRegister
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.")

  public String getWebauthnRegister() {
    return webauthnRegister;
  }


  public void setWebauthnRegister(String webauthnRegister) {
    this.webauthnRegister = webauthnRegister;
  }


  public SubmitSelfServiceSettingsFlowBody webauthnRegisterDisplayname(String webauthnRegisterDisplayname) {
    
    this.webauthnRegisterDisplayname = webauthnRegisterDisplayname;
    return this;
  }

   /**
   * Name of the WebAuthn Security Key to be Added  A human-readable name for the security key which will be added.
   * @return webauthnRegisterDisplayname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the WebAuthn Security Key to be Added  A human-readable name for the security key which will be added.")

  public String getWebauthnRegisterDisplayname() {
    return webauthnRegisterDisplayname;
  }


  public void setWebauthnRegisterDisplayname(String webauthnRegisterDisplayname) {
    this.webauthnRegisterDisplayname = webauthnRegisterDisplayname;
  }


  public SubmitSelfServiceSettingsFlowBody webauthnRemove(String webauthnRemove) {
    
    this.webauthnRemove = webauthnRemove;
    return this;
  }

   /**
   * Remove a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
   * @return webauthnRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remove a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.")

  public String getWebauthnRemove() {
    return webauthnRemove;
  }


  public void setWebauthnRemove(String webauthnRemove) {
    this.webauthnRemove = webauthnRemove;
  }


  public SubmitSelfServiceSettingsFlowBody lookupSecretConfirm(Boolean lookupSecretConfirm) {
    
    this.lookupSecretConfirm = lookupSecretConfirm;
    return this;
  }

   /**
   * If set to true will save the regenerated lookup secrets
   * @return lookupSecretConfirm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true will save the regenerated lookup secrets")

  public Boolean getLookupSecretConfirm() {
    return lookupSecretConfirm;
  }


  public void setLookupSecretConfirm(Boolean lookupSecretConfirm) {
    this.lookupSecretConfirm = lookupSecretConfirm;
  }


  public SubmitSelfServiceSettingsFlowBody lookupSecretDisable(Boolean lookupSecretDisable) {
    
    this.lookupSecretDisable = lookupSecretDisable;
    return this;
  }

   /**
   * Disables this method if true.
   * @return lookupSecretDisable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Disables this method if true.")

  public Boolean getLookupSecretDisable() {
    return lookupSecretDisable;
  }


  public void setLookupSecretDisable(Boolean lookupSecretDisable) {
    this.lookupSecretDisable = lookupSecretDisable;
  }


  public SubmitSelfServiceSettingsFlowBody lookupSecretRegenerate(Boolean lookupSecretRegenerate) {
    
    this.lookupSecretRegenerate = lookupSecretRegenerate;
    return this;
  }

   /**
   * If set to true will regenerate the lookup secrets
   * @return lookupSecretRegenerate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true will regenerate the lookup secrets")

  public Boolean getLookupSecretRegenerate() {
    return lookupSecretRegenerate;
  }


  public void setLookupSecretRegenerate(Boolean lookupSecretRegenerate) {
    this.lookupSecretRegenerate = lookupSecretRegenerate;
  }


  public SubmitSelfServiceSettingsFlowBody lookupSecretReveal(Boolean lookupSecretReveal) {
    
    this.lookupSecretReveal = lookupSecretReveal;
    return this;
  }

   /**
   * If set to true will reveal the lookup secrets
   * @return lookupSecretReveal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to true will reveal the lookup secrets")

  public Boolean getLookupSecretReveal() {
    return lookupSecretReveal;
  }


  public void setLookupSecretReveal(Boolean lookupSecretReveal) {
    this.lookupSecretReveal = lookupSecretReveal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceSettingsFlowBody submitSelfServiceSettingsFlowBody = (SubmitSelfServiceSettingsFlowBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceSettingsFlowBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceSettingsFlowBody.method) &&
        Objects.equals(this.password, submitSelfServiceSettingsFlowBody.password) &&
        Objects.equals(this.traits, submitSelfServiceSettingsFlowBody.traits) &&
        Objects.equals(this.flow, submitSelfServiceSettingsFlowBody.flow) &&
        Objects.equals(this.link, submitSelfServiceSettingsFlowBody.link) &&
        Objects.equals(this.unlink, submitSelfServiceSettingsFlowBody.unlink) &&
        Objects.equals(this.totpCode, submitSelfServiceSettingsFlowBody.totpCode) &&
        Objects.equals(this.totpUnlink, submitSelfServiceSettingsFlowBody.totpUnlink) &&
        Objects.equals(this.webauthnRegister, submitSelfServiceSettingsFlowBody.webauthnRegister) &&
        Objects.equals(this.webauthnRegisterDisplayname, submitSelfServiceSettingsFlowBody.webauthnRegisterDisplayname) &&
        Objects.equals(this.webauthnRemove, submitSelfServiceSettingsFlowBody.webauthnRemove) &&
        Objects.equals(this.lookupSecretConfirm, submitSelfServiceSettingsFlowBody.lookupSecretConfirm) &&
        Objects.equals(this.lookupSecretDisable, submitSelfServiceSettingsFlowBody.lookupSecretDisable) &&
        Objects.equals(this.lookupSecretRegenerate, submitSelfServiceSettingsFlowBody.lookupSecretRegenerate) &&
        Objects.equals(this.lookupSecretReveal, submitSelfServiceSettingsFlowBody.lookupSecretReveal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, password, traits, flow, link, unlink, totpCode, totpUnlink, webauthnRegister, webauthnRegisterDisplayname, webauthnRemove, lookupSecretConfirm, lookupSecretDisable, lookupSecretRegenerate, lookupSecretReveal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceSettingsFlowBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    unlink: ").append(toIndentedString(unlink)).append("\n");
    sb.append("    totpCode: ").append(toIndentedString(totpCode)).append("\n");
    sb.append("    totpUnlink: ").append(toIndentedString(totpUnlink)).append("\n");
    sb.append("    webauthnRegister: ").append(toIndentedString(webauthnRegister)).append("\n");
    sb.append("    webauthnRegisterDisplayname: ").append(toIndentedString(webauthnRegisterDisplayname)).append("\n");
    sb.append("    webauthnRemove: ").append(toIndentedString(webauthnRemove)).append("\n");
    sb.append("    lookupSecretConfirm: ").append(toIndentedString(lookupSecretConfirm)).append("\n");
    sb.append("    lookupSecretDisable: ").append(toIndentedString(lookupSecretDisable)).append("\n");
    sb.append("    lookupSecretRegenerate: ").append(toIndentedString(lookupSecretRegenerate)).append("\n");
    sb.append("    lookupSecretReveal: ").append(toIndentedString(lookupSecretReveal)).append("\n");
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

