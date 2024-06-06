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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;
using System.Reflection;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// KratosContinueWith
    /// </summary>
    [JsonConverter(typeof(KratosContinueWithJsonConverter))]
    [DataContract(Name = "continueWith")]
    public partial class KratosContinueWith : AbstractOpenAPISchema, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KratosContinueWith" /> class
        /// with the <see cref="KratosContinueWithVerificationUi" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of KratosContinueWithVerificationUi.</param>
        public KratosContinueWith(KratosContinueWithVerificationUi actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="KratosContinueWith" /> class
        /// with the <see cref="KratosContinueWithSetOrySessionToken" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of KratosContinueWithSetOrySessionToken.</param>
        public KratosContinueWith(KratosContinueWithSetOrySessionToken actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="KratosContinueWith" /> class
        /// with the <see cref="KratosContinueWithSettingsUi" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of KratosContinueWithSettingsUi.</param>
        public KratosContinueWith(KratosContinueWithSettingsUi actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="KratosContinueWith" /> class
        /// with the <see cref="KratosContinueWithRecoveryUi" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of KratosContinueWithRecoveryUi.</param>
        public KratosContinueWith(KratosContinueWithRecoveryUi actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value.GetType() == typeof(KratosContinueWithRecoveryUi))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(KratosContinueWithSetOrySessionToken))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(KratosContinueWithSettingsUi))
                {
                    this._actualInstance = value;
                }
                else if (value.GetType() == typeof(KratosContinueWithVerificationUi))
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: KratosContinueWithRecoveryUi, KratosContinueWithSetOrySessionToken, KratosContinueWithSettingsUi, KratosContinueWithVerificationUi");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `KratosContinueWithVerificationUi`. If the actual instance is not `KratosContinueWithVerificationUi`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of KratosContinueWithVerificationUi</returns>
        public KratosContinueWithVerificationUi GetKratosContinueWithVerificationUi()
        {
            return (KratosContinueWithVerificationUi)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `KratosContinueWithSetOrySessionToken`. If the actual instance is not `KratosContinueWithSetOrySessionToken`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of KratosContinueWithSetOrySessionToken</returns>
        public KratosContinueWithSetOrySessionToken GetKratosContinueWithSetOrySessionToken()
        {
            return (KratosContinueWithSetOrySessionToken)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `KratosContinueWithSettingsUi`. If the actual instance is not `KratosContinueWithSettingsUi`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of KratosContinueWithSettingsUi</returns>
        public KratosContinueWithSettingsUi GetKratosContinueWithSettingsUi()
        {
            return (KratosContinueWithSettingsUi)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `KratosContinueWithRecoveryUi`. If the actual instance is not `KratosContinueWithRecoveryUi`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of KratosContinueWithRecoveryUi</returns>
        public KratosContinueWithRecoveryUi GetKratosContinueWithRecoveryUi()
        {
            return (KratosContinueWithRecoveryUi)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KratosContinueWith {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, KratosContinueWith.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of KratosContinueWith
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of KratosContinueWith</returns>
        public static KratosContinueWith FromJson(string jsonString)
        {
            KratosContinueWith newKratosContinueWith = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newKratosContinueWith;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(KratosContinueWithRecoveryUi).GetProperty("AdditionalProperties") == null)
                {
                    newKratosContinueWith = new KratosContinueWith(JsonConvert.DeserializeObject<KratosContinueWithRecoveryUi>(jsonString, KratosContinueWith.SerializerSettings));
                }
                else
                {
                    newKratosContinueWith = new KratosContinueWith(JsonConvert.DeserializeObject<KratosContinueWithRecoveryUi>(jsonString, KratosContinueWith.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("KratosContinueWithRecoveryUi");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into KratosContinueWithRecoveryUi: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(KratosContinueWithSetOrySessionToken).GetProperty("AdditionalProperties") == null)
                {
                    newKratosContinueWith = new KratosContinueWith(JsonConvert.DeserializeObject<KratosContinueWithSetOrySessionToken>(jsonString, KratosContinueWith.SerializerSettings));
                }
                else
                {
                    newKratosContinueWith = new KratosContinueWith(JsonConvert.DeserializeObject<KratosContinueWithSetOrySessionToken>(jsonString, KratosContinueWith.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("KratosContinueWithSetOrySessionToken");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into KratosContinueWithSetOrySessionToken: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(KratosContinueWithSettingsUi).GetProperty("AdditionalProperties") == null)
                {
                    newKratosContinueWith = new KratosContinueWith(JsonConvert.DeserializeObject<KratosContinueWithSettingsUi>(jsonString, KratosContinueWith.SerializerSettings));
                }
                else
                {
                    newKratosContinueWith = new KratosContinueWith(JsonConvert.DeserializeObject<KratosContinueWithSettingsUi>(jsonString, KratosContinueWith.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("KratosContinueWithSettingsUi");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into KratosContinueWithSettingsUi: {1}", jsonString, exception.ToString()));
            }

            try
            {
                // if it does not contains "AdditionalProperties", use SerializerSettings to deserialize
                if (typeof(KratosContinueWithVerificationUi).GetProperty("AdditionalProperties") == null)
                {
                    newKratosContinueWith = new KratosContinueWith(JsonConvert.DeserializeObject<KratosContinueWithVerificationUi>(jsonString, KratosContinueWith.SerializerSettings));
                }
                else
                {
                    newKratosContinueWith = new KratosContinueWith(JsonConvert.DeserializeObject<KratosContinueWithVerificationUi>(jsonString, KratosContinueWith.AdditionalPropertiesSerializerSettings));
                }
                matchedTypes.Add("KratosContinueWithVerificationUi");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into KratosContinueWithVerificationUi: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + String.Join(",", matchedTypes));
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newKratosContinueWith;
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

    /// <summary>
    /// Custom JSON converter for KratosContinueWith
    /// </summary>
    public class KratosContinueWithJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(KratosContinueWith).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            switch(reader.TokenType) 
            {
                case JsonToken.StartObject:
                    return KratosContinueWith.FromJson(JObject.Load(reader).ToString(Formatting.None));
                case JsonToken.StartArray:
                    return KratosContinueWith.FromJson(JArray.Load(reader).ToString(Formatting.None));
                default:
                    return null;
            }
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
