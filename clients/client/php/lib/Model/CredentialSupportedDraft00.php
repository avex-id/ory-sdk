<?php
/**
 * CredentialSupportedDraft00
 *
 * PHP version 7.3
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.
 *
 * The version of the OpenAPI document: v1.1.49
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.4.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Ory\Client\Model;

use \ArrayAccess;
use \Ory\Client\ObjectSerializer;

/**
 * CredentialSupportedDraft00 Class Doc Comment
 *
 * @category Class
 * @description Includes information about the supported verifiable credentials.
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class CredentialSupportedDraft00 implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'credentialSupportedDraft00';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'cryptographicBindingMethodsSupported' => 'string[]',
        'cryptographicSuitesSupported' => 'string[]',
        'format' => 'string',
        'types' => 'string[]'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'cryptographicBindingMethodsSupported' => null,
        'cryptographicSuitesSupported' => null,
        'format' => null,
        'types' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'cryptographicBindingMethodsSupported' => 'cryptographic_binding_methods_supported',
        'cryptographicSuitesSupported' => 'cryptographic_suites_supported',
        'format' => 'format',
        'types' => 'types'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'cryptographicBindingMethodsSupported' => 'setCryptographicBindingMethodsSupported',
        'cryptographicSuitesSupported' => 'setCryptographicSuitesSupported',
        'format' => 'setFormat',
        'types' => 'setTypes'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'cryptographicBindingMethodsSupported' => 'getCryptographicBindingMethodsSupported',
        'cryptographicSuitesSupported' => 'getCryptographicSuitesSupported',
        'format' => 'getFormat',
        'types' => 'getTypes'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['cryptographicBindingMethodsSupported'] = $data['cryptographicBindingMethodsSupported'] ?? null;
        $this->container['cryptographicSuitesSupported'] = $data['cryptographicSuitesSupported'] ?? null;
        $this->container['format'] = $data['format'] ?? null;
        $this->container['types'] = $data['types'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets cryptographicBindingMethodsSupported
     *
     * @return string[]|null
     */
    public function getCryptographicBindingMethodsSupported()
    {
        return $this->container['cryptographicBindingMethodsSupported'];
    }

    /**
     * Sets cryptographicBindingMethodsSupported
     *
     * @param string[]|null $cryptographicBindingMethodsSupported OpenID Connect Verifiable Credentials Cryptographic Binding Methods Supported  Contains a list of cryptographic binding methods supported for signing the proof.
     *
     * @return self
     */
    public function setCryptographicBindingMethodsSupported($cryptographicBindingMethodsSupported)
    {
        $this->container['cryptographicBindingMethodsSupported'] = $cryptographicBindingMethodsSupported;

        return $this;
    }

    /**
     * Gets cryptographicSuitesSupported
     *
     * @return string[]|null
     */
    public function getCryptographicSuitesSupported()
    {
        return $this->container['cryptographicSuitesSupported'];
    }

    /**
     * Sets cryptographicSuitesSupported
     *
     * @param string[]|null $cryptographicSuitesSupported OpenID Connect Verifiable Credentials Cryptographic Suites Supported  Contains a list of cryptographic suites methods supported for signing the proof.
     *
     * @return self
     */
    public function setCryptographicSuitesSupported($cryptographicSuitesSupported)
    {
        $this->container['cryptographicSuitesSupported'] = $cryptographicSuitesSupported;

        return $this;
    }

    /**
     * Gets format
     *
     * @return string|null
     */
    public function getFormat()
    {
        return $this->container['format'];
    }

    /**
     * Sets format
     *
     * @param string|null $format OpenID Connect Verifiable Credentials Format  Contains the format that is supported by this authorization server.
     *
     * @return self
     */
    public function setFormat($format)
    {
        $this->container['format'] = $format;

        return $this;
    }

    /**
     * Gets types
     *
     * @return string[]|null
     */
    public function getTypes()
    {
        return $this->container['types'];
    }

    /**
     * Sets types
     *
     * @param string[]|null $types OpenID Connect Verifiable Credentials Types  Contains the types of verifiable credentials supported.
     *
     * @return self
     */
    public function setTypes($types)
    {
        $this->container['types'] = $types;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


