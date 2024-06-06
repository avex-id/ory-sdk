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
 * Used when an administrator creates a recovery link for an identity.
 * @export
 * @interface RecoveryLinkForIdentity
 */
export interface RecoveryLinkForIdentity {
    /**
     * Recovery Link Expires At
     * 
     * The timestamp when the recovery link expires.
     * @type {Date}
     * @memberof RecoveryLinkForIdentity
     */
    expires_at?: Date;
    /**
     * Recovery Link
     * 
     * This link can be used to recover the account.
     * @type {string}
     * @memberof RecoveryLinkForIdentity
     */
    recovery_link: string;
}

/**
 * Check if a given object implements the RecoveryLinkForIdentity interface.
 */
export function instanceOfRecoveryLinkForIdentity(value: object): boolean {
    if (!('recovery_link' in value)) return false;
    return true;
}

export function RecoveryLinkForIdentityFromJSON(json: any): RecoveryLinkForIdentity {
    return RecoveryLinkForIdentityFromJSONTyped(json, false);
}

export function RecoveryLinkForIdentityFromJSONTyped(json: any, ignoreDiscriminator: boolean): RecoveryLinkForIdentity {
    if (json == null) {
        return json;
    }
    return {
        
        'expires_at': json['expires_at'] == null ? undefined : (new Date(json['expires_at'])),
        'recovery_link': json['recovery_link'],
    };
}

export function RecoveryLinkForIdentityToJSON(value?: RecoveryLinkForIdentity | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'expires_at': value['expires_at'] == null ? undefined : ((value['expires_at']).toISOString()),
        'recovery_link': value['recovery_link'],
    };
}

