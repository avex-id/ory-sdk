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
 * Update Login flow using the code method
 * @export
 * @interface UpdateLoginFlowWithCodeMethod
 */
export interface UpdateLoginFlowWithCodeMethod {
    /**
     * Code is the 6 digits code sent to the user
     * @type {string}
     * @memberof UpdateLoginFlowWithCodeMethod
     */
    code?: string;
    /**
     * CSRFToken is the anti-CSRF token
     * @type {string}
     * @memberof UpdateLoginFlowWithCodeMethod
     */
    csrf_token: string;
    /**
     * Identifier is the code identifier
     * The identifier requires that the user has already completed the registration or settings with code flow.
     * @type {string}
     * @memberof UpdateLoginFlowWithCodeMethod
     */
    identifier?: string;
    /**
     * Method should be set to "code" when logging in using the code strategy.
     * @type {string}
     * @memberof UpdateLoginFlowWithCodeMethod
     */
    method: string;
    /**
     * Resend is set when the user wants to resend the code
     * @type {string}
     * @memberof UpdateLoginFlowWithCodeMethod
     */
    resend?: string;
    /**
     * Transient data to pass along to any webhooks
     * @type {object}
     * @memberof UpdateLoginFlowWithCodeMethod
     */
    transient_payload?: object;
}

/**
 * Check if a given object implements the UpdateLoginFlowWithCodeMethod interface.
 */
export function instanceOfUpdateLoginFlowWithCodeMethod(value: object): boolean {
    if (!('csrf_token' in value)) return false;
    if (!('method' in value)) return false;
    return true;
}

export function UpdateLoginFlowWithCodeMethodFromJSON(json: any): UpdateLoginFlowWithCodeMethod {
    return UpdateLoginFlowWithCodeMethodFromJSONTyped(json, false);
}

export function UpdateLoginFlowWithCodeMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateLoginFlowWithCodeMethod {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'] == null ? undefined : json['code'],
        'csrf_token': json['csrf_token'],
        'identifier': json['identifier'] == null ? undefined : json['identifier'],
        'method': json['method'],
        'resend': json['resend'] == null ? undefined : json['resend'],
        'transient_payload': json['transient_payload'] == null ? undefined : json['transient_payload'],
    };
}

export function UpdateLoginFlowWithCodeMethodToJSON(value?: UpdateLoginFlowWithCodeMethod | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'code': value['code'],
        'csrf_token': value['csrf_token'],
        'identifier': value['identifier'],
        'method': value['method'],
        'resend': value['resend'],
        'transient_payload': value['transient_payload'],
    };
}

