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
 * CredentialsCode represents a one time login/registration code
 * @export
 * @interface IdentityCredentialsCode
 */
export interface IdentityCredentialsCode {
    /**
     * The type of the address for this code
     * @type {string}
     * @memberof IdentityCredentialsCode
     */
    address_type?: string;
    /**
     * 
     * @type {Date}
     * @memberof IdentityCredentialsCode
     */
    used_at?: Date;
}

/**
 * Check if a given object implements the IdentityCredentialsCode interface.
 */
export function instanceOfIdentityCredentialsCode(value: object): boolean {
    return true;
}

export function IdentityCredentialsCodeFromJSON(json: any): IdentityCredentialsCode {
    return IdentityCredentialsCodeFromJSONTyped(json, false);
}

export function IdentityCredentialsCodeFromJSONTyped(json: any, ignoreDiscriminator: boolean): IdentityCredentialsCode {
    if (json == null) {
        return json;
    }
    return {
        
        'address_type': json['address_type'] == null ? undefined : json['address_type'],
        'used_at': json['used_at'] == null ? undefined : (new Date(json['used_at'])),
    };
}

export function IdentityCredentialsCodeToJSON(value?: IdentityCredentialsCode | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'address_type': value['address_type'],
        'used_at': value['used_at'] == null ? undefined : ((value['used_at'] as any).toISOString()),
    };
}

