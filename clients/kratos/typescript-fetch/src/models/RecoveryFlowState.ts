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


/**
 * The state represents the state of the recovery flow.
 * 
 * choose_method: ask the user to choose a method (e.g. recover account via email)
 * sent_email: the email has been sent to the user
 * passed_challenge: the request was successful and the recovery challenge was passed.
 * @export
 */
export const RecoveryFlowState = {
    ChooseMethod: 'choose_method',
    SentEmail: 'sent_email',
    PassedChallenge: 'passed_challenge'
} as const;
export type RecoveryFlowState = typeof RecoveryFlowState[keyof typeof RecoveryFlowState];


export function RecoveryFlowStateFromJSON(json: any): RecoveryFlowState {
    return RecoveryFlowStateFromJSONTyped(json, false);
}

export function RecoveryFlowStateFromJSONTyped(json: any, ignoreDiscriminator: boolean): RecoveryFlowState {
    return json as RecoveryFlowState;
}

export function RecoveryFlowStateToJSON(value?: RecoveryFlowState | null): any {
    return value as any;
}

