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

import type { UpdateRecoveryFlowWithCodeMethod } from './UpdateRecoveryFlowWithCodeMethod';
import {
    instanceOfUpdateRecoveryFlowWithCodeMethod,
    UpdateRecoveryFlowWithCodeMethodFromJSON,
    UpdateRecoveryFlowWithCodeMethodFromJSONTyped,
    UpdateRecoveryFlowWithCodeMethodToJSON,
} from './UpdateRecoveryFlowWithCodeMethod';
import type { UpdateRecoveryFlowWithLinkMethod } from './UpdateRecoveryFlowWithLinkMethod';
import {
    instanceOfUpdateRecoveryFlowWithLinkMethod,
    UpdateRecoveryFlowWithLinkMethodFromJSON,
    UpdateRecoveryFlowWithLinkMethodFromJSONTyped,
    UpdateRecoveryFlowWithLinkMethodToJSON,
} from './UpdateRecoveryFlowWithLinkMethod';

/**
 * @type UpdateRecoveryFlowBody
 * Update Recovery Flow Request Body
 * @export
 */
export type UpdateRecoveryFlowBody = { method: 'code' } & UpdateRecoveryFlowWithCodeMethod | { method: 'link' } & UpdateRecoveryFlowWithLinkMethod;

export function UpdateRecoveryFlowBodyFromJSON(json: any): UpdateRecoveryFlowBody {
    return UpdateRecoveryFlowBodyFromJSONTyped(json, false);
}

export function UpdateRecoveryFlowBodyFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateRecoveryFlowBody {
    if (json == null) {
        return json;
    }
    switch (json['method']) {
        case 'code':
            return {...UpdateRecoveryFlowWithCodeMethodFromJSONTyped(json, true), method: 'code'};
        case 'link':
            return {...UpdateRecoveryFlowWithLinkMethodFromJSONTyped(json, true), method: 'link'};
        default:
            throw new Error(`No variant of UpdateRecoveryFlowBody exists with 'method=${json['method']}'`);
    }
}

export function UpdateRecoveryFlowBodyToJSON(value?: UpdateRecoveryFlowBody | null): any {
    if (value == null) {
        return value;
    }
    switch (value['method']) {
        case 'code':
            return UpdateRecoveryFlowWithCodeMethodToJSON(value);
        case 'link':
            return UpdateRecoveryFlowWithLinkMethodToJSON(value);
        default:
            throw new Error(`No variant of UpdateRecoveryFlowBody exists with 'method=${value['method']}'`);
    }

}

