/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.120
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// UiNodeAnchorAttributes struct for UiNodeAnchorAttributes
type UiNodeAnchorAttributes struct {
	// The link's href (destination) URL.  format: uri
	Href string `json:"href"`
	// A unique identifier
	Id string `json:"id"`
	NodeType string `json:"node_type"`
	Title UiText `json:"title"`
}

// NewUiNodeAnchorAttributes instantiates a new UiNodeAnchorAttributes object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUiNodeAnchorAttributes(href string, id string, nodeType string, title UiText) *UiNodeAnchorAttributes {
	this := UiNodeAnchorAttributes{}
	this.Href = href
	this.Id = id
	this.NodeType = nodeType
	this.Title = title
	return &this
}

// NewUiNodeAnchorAttributesWithDefaults instantiates a new UiNodeAnchorAttributes object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUiNodeAnchorAttributesWithDefaults() *UiNodeAnchorAttributes {
	this := UiNodeAnchorAttributes{}
	return &this
}

// GetHref returns the Href field value
func (o *UiNodeAnchorAttributes) GetHref() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Href
}

// GetHrefOk returns a tuple with the Href field value
// and a boolean to check if the value has been set.
func (o *UiNodeAnchorAttributes) GetHrefOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Href, true
}

// SetHref sets field value
func (o *UiNodeAnchorAttributes) SetHref(v string) {
	o.Href = v
}

// GetId returns the Id field value
func (o *UiNodeAnchorAttributes) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *UiNodeAnchorAttributes) GetIdOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *UiNodeAnchorAttributes) SetId(v string) {
	o.Id = v
}

// GetNodeType returns the NodeType field value
func (o *UiNodeAnchorAttributes) GetNodeType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.NodeType
}

// GetNodeTypeOk returns a tuple with the NodeType field value
// and a boolean to check if the value has been set.
func (o *UiNodeAnchorAttributes) GetNodeTypeOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.NodeType, true
}

// SetNodeType sets field value
func (o *UiNodeAnchorAttributes) SetNodeType(v string) {
	o.NodeType = v
}

// GetTitle returns the Title field value
func (o *UiNodeAnchorAttributes) GetTitle() UiText {
	if o == nil {
		var ret UiText
		return ret
	}

	return o.Title
}

// GetTitleOk returns a tuple with the Title field value
// and a boolean to check if the value has been set.
func (o *UiNodeAnchorAttributes) GetTitleOk() (*UiText, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Title, true
}

// SetTitle sets field value
func (o *UiNodeAnchorAttributes) SetTitle(v UiText) {
	o.Title = v
}

func (o UiNodeAnchorAttributes) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["href"] = o.Href
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["node_type"] = o.NodeType
	}
	if true {
		toSerialize["title"] = o.Title
	}
	return json.Marshal(toSerialize)
}

type NullableUiNodeAnchorAttributes struct {
	value *UiNodeAnchorAttributes
	isSet bool
}

func (v NullableUiNodeAnchorAttributes) Get() *UiNodeAnchorAttributes {
	return v.value
}

func (v *NullableUiNodeAnchorAttributes) Set(val *UiNodeAnchorAttributes) {
	v.value = val
	v.isSet = true
}

func (v NullableUiNodeAnchorAttributes) IsSet() bool {
	return v.isSet
}

func (v *NullableUiNodeAnchorAttributes) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUiNodeAnchorAttributes(val *UiNodeAnchorAttributes) *NullableUiNodeAnchorAttributes {
	return &NullableUiNodeAnchorAttributes{value: val, isSet: true}
}

func (v NullableUiNodeAnchorAttributes) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUiNodeAnchorAttributes) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


