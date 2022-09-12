/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.39
 * Contact: support@ory.sh
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
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// JSON Patch allows you to target individual keys in a JSON document for updates.  For more examples see: https://jsonpatch.com
    /// </summary>
    [DataContract(Name = "jsonPatch")]
    public partial class ClientJsonPatch : IEquatable<ClientJsonPatch>, IValidatableObject
    {
        /// <summary>
        /// The JSON Patch operation
        /// </summary>
        /// <value>The JSON Patch operation</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OpEnum
        {
            /// <summary>
            /// Enum Add for value: add
            /// </summary>
            [EnumMember(Value = "add")]
            Add = 1,

            /// <summary>
            /// Enum Remove for value: remove
            /// </summary>
            [EnumMember(Value = "remove")]
            Remove = 2,

            /// <summary>
            /// Enum Replace for value: replace
            /// </summary>
            [EnumMember(Value = "replace")]
            Replace = 3,

            /// <summary>
            /// Enum Move for value: move
            /// </summary>
            [EnumMember(Value = "move")]
            Move = 4,

            /// <summary>
            /// Enum Copy for value: copy
            /// </summary>
            [EnumMember(Value = "copy")]
            Copy = 5,

            /// <summary>
            /// Enum Test for value: test
            /// </summary>
            [EnumMember(Value = "test")]
            Test = 6

        }


        /// <summary>
        /// The JSON Patch operation
        /// </summary>
        /// <value>The JSON Patch operation</value>
        [DataMember(Name = "op", IsRequired = true, EmitDefaultValue = false)]
        public OpEnum Op { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientJsonPatch" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientJsonPatch()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientJsonPatch" /> class.
        /// </summary>
        /// <param name="from">This field is used together with operation \&quot;move\&quot; and uses JSON Pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5)..</param>
        /// <param name="op">The JSON Patch operation (required).</param>
        /// <param name="path">The JSON Pointer to the target key (required).</param>
        /// <param name="value">The value to be used. Only available for &#x60;add&#x60; and &#x60;replace&#x60; operations..</param>
        public ClientJsonPatch(string from = default(string), OpEnum op = default(OpEnum), string path = default(string), Object value = default(Object))
        {
            this.Op = op;
            // to ensure "path" is required (not null)
            if (path == null) {
                throw new ArgumentNullException("path is a required property for ClientJsonPatch and cannot be null");
            }
            this.Path = path;
            this.From = from;
            this.Value = value;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// This field is used together with operation \&quot;move\&quot; and uses JSON Pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
        /// </summary>
        /// <value>This field is used together with operation \&quot;move\&quot; and uses JSON Pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).</value>
        [DataMember(Name = "from", EmitDefaultValue = false)]
        public string From { get; set; }

        /// <summary>
        /// The JSON Pointer to the target key
        /// </summary>
        /// <value>The JSON Pointer to the target key</value>
        [DataMember(Name = "path", IsRequired = true, EmitDefaultValue = false)]
        public string Path { get; set; }

        /// <summary>
        /// The value to be used. Only available for &#x60;add&#x60; and &#x60;replace&#x60; operations.
        /// </summary>
        /// <value>The value to be used. Only available for &#x60;add&#x60; and &#x60;replace&#x60; operations.</value>
        [DataMember(Name = "value", EmitDefaultValue = true)]
        public Object Value { get; set; }

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
            sb.Append("class ClientJsonPatch {\n");
            sb.Append("  From: ").Append(From).Append("\n");
            sb.Append("  Op: ").Append(Op).Append("\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientJsonPatch);
        }

        /// <summary>
        /// Returns true if ClientJsonPatch instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientJsonPatch to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientJsonPatch input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.From == input.From ||
                    (this.From != null &&
                    this.From.Equals(input.From))
                ) && 
                (
                    this.Op == input.Op ||
                    this.Op.Equals(input.Op)
                ) && 
                (
                    this.Path == input.Path ||
                    (this.Path != null &&
                    this.Path.Equals(input.Path))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.From != null)
                {
                    hashCode = (hashCode * 59) + this.From.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Op.GetHashCode();
                if (this.Path != null)
                {
                    hashCode = (hashCode * 59) + this.Path.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
