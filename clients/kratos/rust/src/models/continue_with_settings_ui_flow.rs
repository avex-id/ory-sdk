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

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ContinueWithSettingsUiFlow {
    /// The ID of the settings flow
    #[serde(rename = "id")]
    pub id: String,
}

impl ContinueWithSettingsUiFlow {
    pub fn new(id: String) -> ContinueWithSettingsUiFlow {
        ContinueWithSettingsUiFlow {
            id,
        }
    }
}

