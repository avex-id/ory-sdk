/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v1.2.0
 * Contact: office@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// Update Settings Flow with Passkey Method
    /// </summary>
    [DataContract(Name = "updateSettingsFlowWithPasskeyMethod")]
    public partial class KratosUpdateSettingsFlowWithPasskeyMethod : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateSettingsFlowWithPasskeyMethod" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KratosUpdateSettingsFlowWithPasskeyMethod()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateSettingsFlowWithPasskeyMethod" /> class.
        /// </summary>
        /// <param name="csrfToken">CSRFToken is the anti-CSRF token.</param>
        /// <param name="method">Method  Should be set to \&quot;passkey\&quot; when trying to add, update, or remove a webAuthn pairing. (required).</param>
        /// <param name="passkeyRemove">Remove a WebAuthn Security Key  This must contain the ID of the WebAuthN connection..</param>
        /// <param name="passkeySettingsRegister">Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here..</param>
        public KratosUpdateSettingsFlowWithPasskeyMethod(string csrfToken = default(string), string method = default(string), string passkeyRemove = default(string), string passkeySettingsRegister = default(string))
        {
            // to ensure "method" is required (not null)
            if (method == null)
            {
                throw new ArgumentNullException("method is a required property for KratosUpdateSettingsFlowWithPasskeyMethod and cannot be null");
            }
            this.Method = method;
            this.CsrfToken = csrfToken;
            this.PasskeyRemove = passkeyRemove;
            this.PasskeySettingsRegister = passkeySettingsRegister;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// CSRFToken is the anti-CSRF token
        /// </summary>
        /// <value>CSRFToken is the anti-CSRF token</value>
        [DataMember(Name = "csrf_token", EmitDefaultValue = false)]
        public string CsrfToken { get; set; }

        /// <summary>
        /// Method  Should be set to \&quot;passkey\&quot; when trying to add, update, or remove a webAuthn pairing.
        /// </summary>
        /// <value>Method  Should be set to \&quot;passkey\&quot; when trying to add, update, or remove a webAuthn pairing.</value>
        [DataMember(Name = "method", IsRequired = true, EmitDefaultValue = true)]
        public string Method { get; set; }

        /// <summary>
        /// Remove a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
        /// </summary>
        /// <value>Remove a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.</value>
        [DataMember(Name = "passkey_remove", EmitDefaultValue = false)]
        public string PasskeyRemove { get; set; }

        /// <summary>
        /// Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
        /// </summary>
        /// <value>Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.</value>
        [DataMember(Name = "passkey_settings_register", EmitDefaultValue = false)]
        public string PasskeySettingsRegister { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class KratosUpdateSettingsFlowWithPasskeyMethod {\n");
            sb.Append("  CsrfToken: ").Append(CsrfToken).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  PasskeyRemove: ").Append(PasskeyRemove).Append("\n");
            sb.Append("  PasskeySettingsRegister: ").Append(PasskeySettingsRegister).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
