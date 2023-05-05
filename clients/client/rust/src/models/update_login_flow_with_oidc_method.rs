/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.26
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// UpdateLoginFlowWithOidcMethod : Update Login Flow with OpenID Connect Method



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateLoginFlowWithOidcMethod {
    /// The CSRF Token
    #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
    pub csrf_token: Option<String>,
    /// Method to use  This field must be set to `oidc` when using the oidc method.
    #[serde(rename = "method")]
    pub method: String,
    /// The provider to register with
    #[serde(rename = "provider")]
    pub provider: String,
    /// The identity traits. This is a placeholder for the registration flow.
    #[serde(rename = "traits", skip_serializing_if = "Option::is_none")]
    pub traits: Option<serde_json::Value>,
    /// UpstreamParameters are the parameters that are passed to the upstream identity provider.  These parameters are optional and depend on what the upstream identity provider supports. Supported parameters are: `login_hint` (string): The `login_hint` parameter suppresses the account chooser and either pre-fills the email box on the sign-in form, or selects the proper session. `hd` (string): The `hd` parameter limits the login/registration process to a Google Organization, e.g. `mycollege.edu`.
    #[serde(rename = "upstream_parameters", skip_serializing_if = "Option::is_none")]
    pub upstream_parameters: Option<serde_json::Value>,
}


impl UpdateLoginFlowWithOidcMethod {
    /// Update Login Flow with OpenID Connect Method
    pub fn new(method: String, provider: String) -> UpdateLoginFlowWithOidcMethod {
        UpdateLoginFlowWithOidcMethod {
                csrf_token: None,
                method,
                provider,
                traits: None,
                upstream_parameters: None,
        }
    }
}


