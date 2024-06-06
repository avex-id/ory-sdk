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
    /// Update Login Flow with WebAuthn Method
    /// </summary>
    [DataContract(Name = "updateLoginFlowWithWebAuthnMethod")]
    public partial class KratosUpdateLoginFlowWithWebAuthnMethod : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateLoginFlowWithWebAuthnMethod" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KratosUpdateLoginFlowWithWebAuthnMethod()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosUpdateLoginFlowWithWebAuthnMethod" /> class.
        /// </summary>
        /// <param name="csrfToken">Sending the anti-csrf token is only required for browser login flows..</param>
        /// <param name="identifier">Identifier is the email or username of the user trying to log in. (required).</param>
        /// <param name="method">Method should be set to \&quot;webAuthn\&quot; when logging in using the WebAuthn strategy. (required).</param>
        /// <param name="transientPayload">Transient data to pass along to any webhooks.</param>
        /// <param name="webauthnLogin">Login a WebAuthn Security Key  This must contain the ID of the WebAuthN connection..</param>
        public KratosUpdateLoginFlowWithWebAuthnMethod(string csrfToken = default(string), string identifier = default(string), string method = default(string), Object transientPayload = default(Object), string webauthnLogin = default(string))
        {
            // to ensure "identifier" is required (not null)
            if (identifier == null)
            {
                throw new ArgumentNullException("identifier is a required property for KratosUpdateLoginFlowWithWebAuthnMethod and cannot be null");
            }
            this.Identifier = identifier;
            // to ensure "method" is required (not null)
            if (method == null)
            {
                throw new ArgumentNullException("method is a required property for KratosUpdateLoginFlowWithWebAuthnMethod and cannot be null");
            }
            this.Method = method;
            this.CsrfToken = csrfToken;
            this.TransientPayload = transientPayload;
            this.WebauthnLogin = webauthnLogin;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Sending the anti-csrf token is only required for browser login flows.
        /// </summary>
        /// <value>Sending the anti-csrf token is only required for browser login flows.</value>
        [DataMember(Name = "csrf_token", EmitDefaultValue = false)]
        public string CsrfToken { get; set; }

        /// <summary>
        /// Identifier is the email or username of the user trying to log in.
        /// </summary>
        /// <value>Identifier is the email or username of the user trying to log in.</value>
        [DataMember(Name = "identifier", IsRequired = true, EmitDefaultValue = true)]
        public string Identifier { get; set; }

        /// <summary>
        /// Method should be set to \&quot;webAuthn\&quot; when logging in using the WebAuthn strategy.
        /// </summary>
        /// <value>Method should be set to \&quot;webAuthn\&quot; when logging in using the WebAuthn strategy.</value>
        [DataMember(Name = "method", IsRequired = true, EmitDefaultValue = true)]
        public string Method { get; set; }

        /// <summary>
        /// Transient data to pass along to any webhooks
        /// </summary>
        /// <value>Transient data to pass along to any webhooks</value>
        [DataMember(Name = "transient_payload", EmitDefaultValue = false)]
        public Object TransientPayload { get; set; }

        /// <summary>
        /// Login a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.
        /// </summary>
        /// <value>Login a WebAuthn Security Key  This must contain the ID of the WebAuthN connection.</value>
        [DataMember(Name = "webauthn_login", EmitDefaultValue = false)]
        public string WebauthnLogin { get; set; }

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
            sb.Append("class KratosUpdateLoginFlowWithWebAuthnMethod {\n");
            sb.Append("  CsrfToken: ").Append(CsrfToken).Append("\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  Method: ").Append(Method).Append("\n");
            sb.Append("  TransientPayload: ").Append(TransientPayload).Append("\n");
            sb.Append("  WebauthnLogin: ").Append(WebauthnLogin).Append("\n");
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
