/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.2.0
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

/// UpdateRegistrationFlowWithPasskeyMethod : Update Registration Flow with Passkey Method
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateRegistrationFlowWithPasskeyMethod {
    /// CSRFToken is the anti-CSRF token
    #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
    pub csrf_token: Option<String>,
    /// Method  Should be set to \"passkey\" when trying to add, update, or remove a Passkey.
    #[serde(rename = "method")]
    pub method: String,
    /// Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
    #[serde(rename = "passkey_register", skip_serializing_if = "Option::is_none")]
    pub passkey_register: Option<String>,
    /// The identity's traits
    #[serde(rename = "traits")]
    pub traits: serde_json::Value,
    /// Transient data to pass along to any webhooks
    #[serde(rename = "transient_payload", skip_serializing_if = "Option::is_none")]
    pub transient_payload: Option<serde_json::Value>,
}

impl UpdateRegistrationFlowWithPasskeyMethod {
    /// Update Registration Flow with Passkey Method
    pub fn new(method: String, traits: serde_json::Value) -> UpdateRegistrationFlowWithPasskeyMethod {
        UpdateRegistrationFlowWithPasskeyMethod {
            csrf_token: None,
            method,
            passkey_register: None,
            traits,
            transient_payload: None,
        }
    }
}

