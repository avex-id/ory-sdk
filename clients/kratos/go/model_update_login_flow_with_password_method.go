/*
Ory Identities API

This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

API version: v1.2.0
Contact: office@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// checks if the UpdateLoginFlowWithPasswordMethod type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &UpdateLoginFlowWithPasswordMethod{}

// UpdateLoginFlowWithPasswordMethod Update Login Flow with Password Method
type UpdateLoginFlowWithPasswordMethod struct {
	// Sending the anti-csrf token is only required for browser login flows.
	CsrfToken *string `json:"csrf_token,omitempty"`
	// Identifier is the email or username of the user trying to log in.
	Identifier string `json:"identifier"`
	// Method should be set to \"password\" when logging in using the identifier and password strategy.
	Method string `json:"method"`
	// The user's password.
	Password string `json:"password"`
	// Identifier is the email or username of the user trying to log in. This field is deprecated!
	PasswordIdentifier *string `json:"password_identifier,omitempty"`
	// Transient data to pass along to any webhooks
	TransientPayload map[string]interface{} `json:"transient_payload,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _UpdateLoginFlowWithPasswordMethod UpdateLoginFlowWithPasswordMethod

// NewUpdateLoginFlowWithPasswordMethod instantiates a new UpdateLoginFlowWithPasswordMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateLoginFlowWithPasswordMethod(identifier string, method string, password string) *UpdateLoginFlowWithPasswordMethod {
	this := UpdateLoginFlowWithPasswordMethod{}
	this.Identifier = identifier
	this.Method = method
	this.Password = password
	return &this
}

// NewUpdateLoginFlowWithPasswordMethodWithDefaults instantiates a new UpdateLoginFlowWithPasswordMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateLoginFlowWithPasswordMethodWithDefaults() *UpdateLoginFlowWithPasswordMethod {
	this := UpdateLoginFlowWithPasswordMethod{}
	return &this
}

// GetCsrfToken returns the CsrfToken field value if set, zero value otherwise.
func (o *UpdateLoginFlowWithPasswordMethod) GetCsrfToken() string {
	if o == nil || IsNil(o.CsrfToken) {
		var ret string
		return ret
	}
	return *o.CsrfToken
}

// GetCsrfTokenOk returns a tuple with the CsrfToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithPasswordMethod) GetCsrfTokenOk() (*string, bool) {
	if o == nil || IsNil(o.CsrfToken) {
		return nil, false
	}
	return o.CsrfToken, true
}

// HasCsrfToken returns a boolean if a field has been set.
func (o *UpdateLoginFlowWithPasswordMethod) HasCsrfToken() bool {
	if o != nil && !IsNil(o.CsrfToken) {
		return true
	}

	return false
}

// SetCsrfToken gets a reference to the given string and assigns it to the CsrfToken field.
func (o *UpdateLoginFlowWithPasswordMethod) SetCsrfToken(v string) {
	o.CsrfToken = &v
}

// GetIdentifier returns the Identifier field value
func (o *UpdateLoginFlowWithPasswordMethod) GetIdentifier() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Identifier
}

// GetIdentifierOk returns a tuple with the Identifier field value
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithPasswordMethod) GetIdentifierOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Identifier, true
}

// SetIdentifier sets field value
func (o *UpdateLoginFlowWithPasswordMethod) SetIdentifier(v string) {
	o.Identifier = v
}

// GetMethod returns the Method field value
func (o *UpdateLoginFlowWithPasswordMethod) GetMethod() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Method
}

// GetMethodOk returns a tuple with the Method field value
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithPasswordMethod) GetMethodOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Method, true
}

// SetMethod sets field value
func (o *UpdateLoginFlowWithPasswordMethod) SetMethod(v string) {
	o.Method = v
}

// GetPassword returns the Password field value
func (o *UpdateLoginFlowWithPasswordMethod) GetPassword() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Password
}

// GetPasswordOk returns a tuple with the Password field value
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithPasswordMethod) GetPasswordOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Password, true
}

// SetPassword sets field value
func (o *UpdateLoginFlowWithPasswordMethod) SetPassword(v string) {
	o.Password = v
}

// GetPasswordIdentifier returns the PasswordIdentifier field value if set, zero value otherwise.
func (o *UpdateLoginFlowWithPasswordMethod) GetPasswordIdentifier() string {
	if o == nil || IsNil(o.PasswordIdentifier) {
		var ret string
		return ret
	}
	return *o.PasswordIdentifier
}

// GetPasswordIdentifierOk returns a tuple with the PasswordIdentifier field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithPasswordMethod) GetPasswordIdentifierOk() (*string, bool) {
	if o == nil || IsNil(o.PasswordIdentifier) {
		return nil, false
	}
	return o.PasswordIdentifier, true
}

// HasPasswordIdentifier returns a boolean if a field has been set.
func (o *UpdateLoginFlowWithPasswordMethod) HasPasswordIdentifier() bool {
	if o != nil && !IsNil(o.PasswordIdentifier) {
		return true
	}

	return false
}

// SetPasswordIdentifier gets a reference to the given string and assigns it to the PasswordIdentifier field.
func (o *UpdateLoginFlowWithPasswordMethod) SetPasswordIdentifier(v string) {
	o.PasswordIdentifier = &v
}

// GetTransientPayload returns the TransientPayload field value if set, zero value otherwise.
func (o *UpdateLoginFlowWithPasswordMethod) GetTransientPayload() map[string]interface{} {
	if o == nil || IsNil(o.TransientPayload) {
		var ret map[string]interface{}
		return ret
	}
	return o.TransientPayload
}

// GetTransientPayloadOk returns a tuple with the TransientPayload field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UpdateLoginFlowWithPasswordMethod) GetTransientPayloadOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.TransientPayload) {
		return map[string]interface{}{}, false
	}
	return o.TransientPayload, true
}

// HasTransientPayload returns a boolean if a field has been set.
func (o *UpdateLoginFlowWithPasswordMethod) HasTransientPayload() bool {
	if o != nil && !IsNil(o.TransientPayload) {
		return true
	}

	return false
}

// SetTransientPayload gets a reference to the given map[string]interface{} and assigns it to the TransientPayload field.
func (o *UpdateLoginFlowWithPasswordMethod) SetTransientPayload(v map[string]interface{}) {
	o.TransientPayload = v
}

func (o UpdateLoginFlowWithPasswordMethod) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o UpdateLoginFlowWithPasswordMethod) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.CsrfToken) {
		toSerialize["csrf_token"] = o.CsrfToken
	}
	toSerialize["identifier"] = o.Identifier
	toSerialize["method"] = o.Method
	toSerialize["password"] = o.Password
	if !IsNil(o.PasswordIdentifier) {
		toSerialize["password_identifier"] = o.PasswordIdentifier
	}
	if !IsNil(o.TransientPayload) {
		toSerialize["transient_payload"] = o.TransientPayload
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *UpdateLoginFlowWithPasswordMethod) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"identifier",
		"method",
		"password",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varUpdateLoginFlowWithPasswordMethod := _UpdateLoginFlowWithPasswordMethod{}

	err = json.Unmarshal(data, &varUpdateLoginFlowWithPasswordMethod)

	if err != nil {
		return err
	}

	*o = UpdateLoginFlowWithPasswordMethod(varUpdateLoginFlowWithPasswordMethod)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "csrf_token")
		delete(additionalProperties, "identifier")
		delete(additionalProperties, "method")
		delete(additionalProperties, "password")
		delete(additionalProperties, "password_identifier")
		delete(additionalProperties, "transient_payload")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableUpdateLoginFlowWithPasswordMethod struct {
	value *UpdateLoginFlowWithPasswordMethod
	isSet bool
}

func (v NullableUpdateLoginFlowWithPasswordMethod) Get() *UpdateLoginFlowWithPasswordMethod {
	return v.value
}

func (v *NullableUpdateLoginFlowWithPasswordMethod) Set(val *UpdateLoginFlowWithPasswordMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateLoginFlowWithPasswordMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateLoginFlowWithPasswordMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateLoginFlowWithPasswordMethod(val *UpdateLoginFlowWithPasswordMethod) *NullableUpdateLoginFlowWithPasswordMethod {
	return &NullableUpdateLoginFlowWithPasswordMethod{value: val, isSet: true}
}

func (v NullableUpdateLoginFlowWithPasswordMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateLoginFlowWithPasswordMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


