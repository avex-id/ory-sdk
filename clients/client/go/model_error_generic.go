/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.40
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// ErrorGeneric The standard Ory JSON API error format.
type ErrorGeneric struct {
	Error GenericErrorContent `json:"error"`
	AdditionalProperties map[string]interface{}
}

type _ErrorGeneric ErrorGeneric

// NewErrorGeneric instantiates a new ErrorGeneric object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewErrorGeneric(error_ GenericErrorContent) *ErrorGeneric {
	this := ErrorGeneric{}
	this.Error = error_
	return &this
}

// NewErrorGenericWithDefaults instantiates a new ErrorGeneric object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewErrorGenericWithDefaults() *ErrorGeneric {
	this := ErrorGeneric{}
	return &this
}

// GetError returns the Error field value
func (o *ErrorGeneric) GetError() GenericErrorContent {
	if o == nil {
		var ret GenericErrorContent
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *ErrorGeneric) GetErrorOk() (*GenericErrorContent, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *ErrorGeneric) SetError(v GenericErrorContent) {
	o.Error = v
}

func (o ErrorGeneric) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["error"] = o.Error
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *ErrorGeneric) UnmarshalJSON(bytes []byte) (err error) {
	varErrorGeneric := _ErrorGeneric{}

	if err = json.Unmarshal(bytes, &varErrorGeneric); err == nil {
		*o = ErrorGeneric(varErrorGeneric)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "error")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableErrorGeneric struct {
	value *ErrorGeneric
	isSet bool
}

func (v NullableErrorGeneric) Get() *ErrorGeneric {
	return v.value
}

func (v *NullableErrorGeneric) Set(val *ErrorGeneric) {
	v.value = val
	v.isSet = true
}

func (v NullableErrorGeneric) IsSet() bool {
	return v.isSet
}

func (v *NullableErrorGeneric) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableErrorGeneric(val *ErrorGeneric) *NullableErrorGeneric {
	return &NullableErrorGeneric{value: val, isSet: true}
}

func (v NullableErrorGeneric) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableErrorGeneric) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


