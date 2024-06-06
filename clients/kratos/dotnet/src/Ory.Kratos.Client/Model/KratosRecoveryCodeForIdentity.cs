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
    /// Used when an administrator creates a recovery code for an identity.
    /// </summary>
    [DataContract(Name = "recoveryCodeForIdentity")]
    public partial class KratosRecoveryCodeForIdentity : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosRecoveryCodeForIdentity" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KratosRecoveryCodeForIdentity()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosRecoveryCodeForIdentity" /> class.
        /// </summary>
        /// <param name="expiresAt">Expires At is the timestamp of when the recovery flow expires  The timestamp when the recovery code expires..</param>
        /// <param name="recoveryCode">RecoveryCode is the code that can be used to recover the account (required).</param>
        /// <param name="recoveryLink">RecoveryLink with flow  This link opens the recovery UI with an empty &#x60;code&#x60; field. (required).</param>
        public KratosRecoveryCodeForIdentity(DateTime expiresAt = default(DateTime), string recoveryCode = default(string), string recoveryLink = default(string))
        {
            // to ensure "recoveryCode" is required (not null)
            if (recoveryCode == null)
            {
                throw new ArgumentNullException("recoveryCode is a required property for KratosRecoveryCodeForIdentity and cannot be null");
            }
            this.RecoveryCode = recoveryCode;
            // to ensure "recoveryLink" is required (not null)
            if (recoveryLink == null)
            {
                throw new ArgumentNullException("recoveryLink is a required property for KratosRecoveryCodeForIdentity and cannot be null");
            }
            this.RecoveryLink = recoveryLink;
            this.ExpiresAt = expiresAt;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Expires At is the timestamp of when the recovery flow expires  The timestamp when the recovery code expires.
        /// </summary>
        /// <value>Expires At is the timestamp of when the recovery flow expires  The timestamp when the recovery code expires.</value>
        [DataMember(Name = "expires_at", EmitDefaultValue = false)]
        public DateTime ExpiresAt { get; set; }

        /// <summary>
        /// RecoveryCode is the code that can be used to recover the account
        /// </summary>
        /// <value>RecoveryCode is the code that can be used to recover the account</value>
        [DataMember(Name = "recovery_code", IsRequired = true, EmitDefaultValue = true)]
        public string RecoveryCode { get; set; }

        /// <summary>
        /// RecoveryLink with flow  This link opens the recovery UI with an empty &#x60;code&#x60; field.
        /// </summary>
        /// <value>RecoveryLink with flow  This link opens the recovery UI with an empty &#x60;code&#x60; field.</value>
        [DataMember(Name = "recovery_link", IsRequired = true, EmitDefaultValue = true)]
        public string RecoveryLink { get; set; }

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
            sb.Append("class KratosRecoveryCodeForIdentity {\n");
            sb.Append("  ExpiresAt: ").Append(ExpiresAt).Append("\n");
            sb.Append("  RecoveryCode: ").Append(RecoveryCode).Append("\n");
            sb.Append("  RecoveryLink: ").Append(RecoveryLink).Append("\n");
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
