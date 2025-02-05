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
    /// CredentialsCode represents a one time login/registration code
    /// </summary>
    [DataContract(Name = "identityCredentialsCode")]
    public partial class KratosIdentityCredentialsCode : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosIdentityCredentialsCode" /> class.
        /// </summary>
        /// <param name="addressType">The type of the address for this code.</param>
        /// <param name="usedAt">usedAt.</param>
        public KratosIdentityCredentialsCode(string addressType = default(string), DateTime? usedAt = default(DateTime?))
        {
            this.AddressType = addressType;
            this.UsedAt = usedAt;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The type of the address for this code
        /// </summary>
        /// <value>The type of the address for this code</value>
        [DataMember(Name = "address_type", EmitDefaultValue = false)]
        public string AddressType { get; set; }

        /// <summary>
        /// Gets or Sets UsedAt
        /// </summary>
        [DataMember(Name = "used_at", EmitDefaultValue = true)]
        public DateTime? UsedAt { get; set; }

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
            sb.Append("class KratosIdentityCredentialsCode {\n");
            sb.Append("  AddressType: ").Append(AddressType).Append("\n");
            sb.Append("  UsedAt: ").Append(UsedAt).Append("\n");
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
