/* tslint:disable */
/* eslint-disable */
/**
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.2.0
 * Contact: office@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * Update Login Flow with Passkey Method
 * @export
 * @interface UpdateLoginFlowWithPasskeyMethod
 */
export interface UpdateLoginFlowWithPasskeyMethod {
    /**
     * Sending the anti-csrf token is only required for browser login flows.
     * @type {string}
     * @memberof UpdateLoginFlowWithPasskeyMethod
     */
    csrf_token?: string;
    /**
     * Method should be set to "passkey" when logging in using the Passkey strategy.
     * @type {string}
     * @memberof UpdateLoginFlowWithPasskeyMethod
     */
    method: string;
    /**
     * Login a WebAuthn Security Key
     * 
     * This must contain the ID of the WebAuthN connection.
     * @type {string}
     * @memberof UpdateLoginFlowWithPasskeyMethod
     */
    passkey_login?: string;
}

/**
 * Check if a given object implements the UpdateLoginFlowWithPasskeyMethod interface.
 */
export function instanceOfUpdateLoginFlowWithPasskeyMethod(value: object): boolean {
    if (!('method' in value)) return false;
    return true;
}

export function UpdateLoginFlowWithPasskeyMethodFromJSON(json: any): UpdateLoginFlowWithPasskeyMethod {
    return UpdateLoginFlowWithPasskeyMethodFromJSONTyped(json, false);
}

export function UpdateLoginFlowWithPasskeyMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateLoginFlowWithPasskeyMethod {
    if (json == null) {
        return json;
    }
    return {
        
        'csrf_token': json['csrf_token'] == null ? undefined : json['csrf_token'],
        'method': json['method'],
        'passkey_login': json['passkey_login'] == null ? undefined : json['passkey_login'],
    };
}

export function UpdateLoginFlowWithPasskeyMethodToJSON(value?: UpdateLoginFlowWithPasskeyMethod | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'csrf_token': value['csrf_token'],
        'method': value['method'],
        'passkey_login': value['passkey_login'],
    };
}

