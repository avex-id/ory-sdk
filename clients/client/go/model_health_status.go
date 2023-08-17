/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.49
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// HealthStatus struct for HealthStatus
type HealthStatus struct {
	// Status always contains \"ok\".
	Status *string `json:"status,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _HealthStatus HealthStatus

// NewHealthStatus instantiates a new HealthStatus object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewHealthStatus() *HealthStatus {
	this := HealthStatus{}
	return &this
}

// NewHealthStatusWithDefaults instantiates a new HealthStatus object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewHealthStatusWithDefaults() *HealthStatus {
	this := HealthStatus{}
	return &this
}

// GetStatus returns the Status field value if set, zero value otherwise.
func (o *HealthStatus) GetStatus() string {
	if o == nil || o.Status == nil {
		var ret string
		return ret
	}
	return *o.Status
}

// GetStatusOk returns a tuple with the Status field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *HealthStatus) GetStatusOk() (*string, bool) {
	if o == nil || o.Status == nil {
		return nil, false
	}
	return o.Status, true
}

// HasStatus returns a boolean if a field has been set.
func (o *HealthStatus) HasStatus() bool {
	if o != nil && o.Status != nil {
		return true
	}

	return false
}

// SetStatus gets a reference to the given string and assigns it to the Status field.
func (o *HealthStatus) SetStatus(v string) {
	o.Status = &v
}

func (o HealthStatus) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Status != nil {
		toSerialize["status"] = o.Status
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *HealthStatus) UnmarshalJSON(bytes []byte) (err error) {
	varHealthStatus := _HealthStatus{}

	if err = json.Unmarshal(bytes, &varHealthStatus); err == nil {
		*o = HealthStatus(varHealthStatus)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "status")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableHealthStatus struct {
	value *HealthStatus
	isSet bool
}

func (v NullableHealthStatus) Get() *HealthStatus {
	return v.value
}

func (v *NullableHealthStatus) Set(val *HealthStatus) {
	v.value = val
	v.isSet = true
}

func (v NullableHealthStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableHealthStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableHealthStatus(val *HealthStatus) *NullableHealthStatus {
	return &NullableHealthStatus{value: val, isSet: true}
}

func (v NullableHealthStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableHealthStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


