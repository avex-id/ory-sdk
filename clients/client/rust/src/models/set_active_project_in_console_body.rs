/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.49
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// SetActiveProjectInConsoleBody : Set active project in the Ory Network Console Request Body



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SetActiveProjectInConsoleBody {
    /// Project ID  The Project ID you want to set active.  format: uuid
    #[serde(rename = "project_id")]
    pub project_id: String,
}


impl SetActiveProjectInConsoleBody {
    /// Set active project in the Ory Network Console Request Body
    pub fn new(project_id: String) -> SetActiveProjectInConsoleBody {
        SetActiveProjectInConsoleBody {
                project_id,
        }
    }
}


