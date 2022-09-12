/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.39
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */


use std::fmt::Display;

use num_traits;
use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};


trait NumVecJoin {
    fn join(&self, sep: &str) -> String;
}

impl <T: Display + num_traits::Num> NumVecJoin for Vec<T> {
    fn join(&self, sep: &str) -> String {
        self.iter()
            .map(ToString::to_string)
            .collect::<Vec<String>>()
            .join(sep)
    }
}


/// struct for typed errors of method `get_check`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetCheckError {
    Status400(crate::models::GenericError),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `get_check_mirror_status`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetCheckMirrorStatusError {
    Status400(crate::models::GenericError),
    Status403(crate::models::GetCheckResponse),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `get_expand`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetExpandError {
    Status400(crate::models::GenericError),
    Status404(crate::models::GenericError),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `get_relation_tuples`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetRelationTuplesError {
    Status404(crate::models::GenericError),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `post_check`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PostCheckError {
    Status400(crate::models::GenericError),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `post_check_mirror_status`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PostCheckMirrorStatusError {
    Status400(crate::models::GenericError),
    Status403(crate::models::GetCheckResponse),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}


/// To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
pub async fn get_check(configuration: &configuration::Configuration, namespace: Option<&str>, object: Option<&str>, relation: Option<&str>, subject_id: Option<&str>, subject_set_namespace: Option<&str>, subject_set_object: Option<&str>, subject_set_relation: Option<&str>, max_depth: Option<i64>) -> Result<crate::models::GetCheckResponse, Error<GetCheckError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/relation-tuples/check/openapi", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = namespace {
        local_var_req_builder = local_var_req_builder.query(&[("namespace", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = object {
        local_var_req_builder = local_var_req_builder.query(&[("object", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = relation {
        local_var_req_builder = local_var_req_builder.query(&[("relation", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_id {
        local_var_req_builder = local_var_req_builder.query(&[("subject_id", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_namespace {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.namespace", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_object {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.object", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_relation {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.relation", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = max_depth {
        local_var_req_builder = local_var_req_builder.query(&[("max-depth", local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetCheckError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
pub async fn get_check_mirror_status(configuration: &configuration::Configuration, ) -> Result<crate::models::GetCheckResponse, Error<GetCheckMirrorStatusError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/relation-tuples/check", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetCheckMirrorStatusError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Use this endpoint to expand a relation tuple.
pub async fn get_expand(configuration: &configuration::Configuration, namespace: &str, object: &str, relation: &str, max_depth: Option<i64>) -> Result<crate::models::ExpandTree, Error<GetExpandError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/relation-tuples/expand", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("namespace", namespace.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("object", object.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("relation", relation.to_string())]);
    if let Some(ref local_var_str) = max_depth {
        local_var_req_builder = local_var_req_builder.query(&[("max-depth", local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetExpandError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get all relation tuples that match the query. Only the namespace field is required.
pub async fn get_relation_tuples(configuration: &configuration::Configuration, page_token: Option<&str>, page_size: Option<i64>, namespace: Option<&str>, object: Option<&str>, relation: Option<&str>, subject_id: Option<&str>, subject_set_namespace: Option<&str>, subject_set_object: Option<&str>, subject_set_relation: Option<&str>) -> Result<crate::models::GetRelationTuplesResponse, Error<GetRelationTuplesError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/relation-tuples", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = page_token {
        local_var_req_builder = local_var_req_builder.query(&[("page_token", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = page_size {
        local_var_req_builder = local_var_req_builder.query(&[("page_size", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = namespace {
        local_var_req_builder = local_var_req_builder.query(&[("namespace", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = object {
        local_var_req_builder = local_var_req_builder.query(&[("object", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = relation {
        local_var_req_builder = local_var_req_builder.query(&[("relation", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_id {
        local_var_req_builder = local_var_req_builder.query(&[("subject_id", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_namespace {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.namespace", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_object {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.object", local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_relation {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.relation", local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetRelationTuplesError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
pub async fn post_check(configuration: &configuration::Configuration, max_depth: Option<i64>, relation_query: Option<&crate::models::RelationQuery>) -> Result<crate::models::GetCheckResponse, Error<PostCheckError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/relation-tuples/check/openapi", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = max_depth {
        local_var_req_builder = local_var_req_builder.query(&[("max-depth", local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&relation_query);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<PostCheckError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// To learn how relation tuples and the check works, head over to [the documentation](../concepts/relation-tuples.mdx).
pub async fn post_check_mirror_status(configuration: &configuration::Configuration, ) -> Result<crate::models::GetCheckResponse, Error<PostCheckMirrorStatusError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/relation-tuples/check", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<PostCheckMirrorStatusError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

