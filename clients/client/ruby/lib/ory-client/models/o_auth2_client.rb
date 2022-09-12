=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.2.0-alpha.39
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'date'
require 'time'

module OryClient
  class OAuth2Client
    attr_accessor :allowed_cors_origins

    attr_accessor :audience

    # Boolean value specifying whether the RP requires that a sid (session ID) Claim be included in the Logout Token to identify the RP session with the OP when the backchannel_logout_uri is used. If omitted, the default value is false.
    attr_accessor :backchannel_logout_session_required

    # RP URL that will cause the RP to log itself out when sent a Logout Token by the OP.
    attr_accessor :backchannel_logout_uri

    # ID  is the id for this client.
    attr_accessor :client_id

    # Name is the human-readable string name of the client to be presented to the end-user during authorization.
    attr_accessor :client_name

    # Secret is the client's secret. The secret will be included in the create request as cleartext, and then never again. The secret is stored using BCrypt so it is impossible to recover it. Tell your users that they need to write the secret down as it will not be made available again.
    attr_accessor :client_secret

    # SecretExpiresAt is an integer holding the time at which the client secret will expire or 0 if it will not expire. The time is represented as the number of seconds from 1970-01-01T00:00:00Z as measured in UTC until the date/time of expiration.  This feature is currently not supported and it's value will always be set to 0.
    attr_accessor :client_secret_expires_at

    # ClientURI is an URL string of a web page providing information about the client. If present, the server SHOULD display this URL to the end-user in a clickable fashion.
    attr_accessor :client_uri

    attr_accessor :contacts

    # CreatedAt returns the timestamp of the client's creation.
    attr_accessor :created_at

    # Boolean value specifying whether the RP requires that iss (issuer) and sid (session ID) query parameters be included to identify the RP session with the OP when the frontchannel_logout_uri is used. If omitted, the default value is false.
    attr_accessor :frontchannel_logout_session_required

    # RP URL that will cause the RP to log itself out when rendered in an iframe by the OP. An iss (issuer) query parameter and a sid (session ID) query parameter MAY be included by the OP to enable the RP to validate the request and to determine which of the potentially multiple sessions is to be logged out; if either is included, both MUST be.
    attr_accessor :frontchannel_logout_uri

    attr_accessor :grant_types

    attr_accessor :jwks

    # URL for the Client's JSON Web Key Set [JWK] document. If the Client signs requests to the Server, it contains the signing key(s) the Server uses to validate signatures from the Client. The JWK Set MAY also contain the Client's encryption keys(s), which are used by the Server to encrypt responses to the Client. When both signing and encryption keys are made available, a use (Key Use) parameter value is REQUIRED for all keys in the referenced JWK Set to indicate each key's intended usage. Although some algorithms allow the same key to be used for both signatures and encryption, doing so is NOT RECOMMENDED, as it is less secure. The JWK x5c parameter MAY be used to provide X.509 representations of keys provided. When used, the bare key values MUST still be present and MUST match those in the certificate.
    attr_accessor :jwks_uri

    # LogoURI is an URL string that references a logo for the client.
    attr_accessor :logo_uri

    attr_accessor :metadata

    # Owner is a string identifying the owner of the OAuth 2.0 Client.
    attr_accessor :owner

    # PolicyURI is a URL string that points to a human-readable privacy policy document that describes how the deployment organization collects, uses, retains, and discloses personal data.
    attr_accessor :policy_uri

    attr_accessor :post_logout_redirect_uris

    attr_accessor :redirect_uris

    # RegistrationAccessToken can be used to update, get, or delete the OAuth2 Client.
    attr_accessor :registration_access_token

    # RegistrationClientURI is the URL used to update, get, or delete the OAuth2 Client.
    attr_accessor :registration_client_uri

    # JWS [JWS] alg algorithm [JWA] that MUST be used for signing Request Objects sent to the OP. All Request Objects from this Client MUST be rejected, if not signed with this algorithm.
    attr_accessor :request_object_signing_alg

    attr_accessor :request_uris

    attr_accessor :response_types

    # Scope is a string containing a space-separated list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749]) that the client can use when requesting access tokens.
    attr_accessor :scope

    # URL using the https scheme to be used in calculating Pseudonymous Identifiers by the OP. The URL references a file with a single JSON array of redirect_uri values.
    attr_accessor :sector_identifier_uri

    # SubjectType requested for responses to this Client. The subject_types_supported Discovery parameter contains a list of the supported subject_type values for this server. Valid types include `pairwise` and `public`.
    attr_accessor :subject_type

    # Requested Client Authentication method for the Token Endpoint. The options are client_secret_post, client_secret_basic, private_key_jwt, and none.
    attr_accessor :token_endpoint_auth_method

    # Requested Client Authentication signing algorithm for the Token Endpoint.
    attr_accessor :token_endpoint_auth_signing_alg

    # TermsOfServiceURI is a URL string that points to a human-readable terms of service document for the client that describes a contractual relationship between the end-user and the client that the end-user accepts when authorizing the client.
    attr_accessor :tos_uri

    # UpdatedAt returns the timestamp of the last update.
    attr_accessor :updated_at

    # JWS alg algorithm [JWA] REQUIRED for signing UserInfo Responses. If this is specified, the response will be JWT [JWT] serialized, and signed using JWS. The default, if omitted, is for the UserInfo Response to return the Claims as a UTF-8 encoded JSON object using the application/json content-type.
    attr_accessor :userinfo_signed_response_alg

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'allowed_cors_origins' => :'allowed_cors_origins',
        :'audience' => :'audience',
        :'backchannel_logout_session_required' => :'backchannel_logout_session_required',
        :'backchannel_logout_uri' => :'backchannel_logout_uri',
        :'client_id' => :'client_id',
        :'client_name' => :'client_name',
        :'client_secret' => :'client_secret',
        :'client_secret_expires_at' => :'client_secret_expires_at',
        :'client_uri' => :'client_uri',
        :'contacts' => :'contacts',
        :'created_at' => :'created_at',
        :'frontchannel_logout_session_required' => :'frontchannel_logout_session_required',
        :'frontchannel_logout_uri' => :'frontchannel_logout_uri',
        :'grant_types' => :'grant_types',
        :'jwks' => :'jwks',
        :'jwks_uri' => :'jwks_uri',
        :'logo_uri' => :'logo_uri',
        :'metadata' => :'metadata',
        :'owner' => :'owner',
        :'policy_uri' => :'policy_uri',
        :'post_logout_redirect_uris' => :'post_logout_redirect_uris',
        :'redirect_uris' => :'redirect_uris',
        :'registration_access_token' => :'registration_access_token',
        :'registration_client_uri' => :'registration_client_uri',
        :'request_object_signing_alg' => :'request_object_signing_alg',
        :'request_uris' => :'request_uris',
        :'response_types' => :'response_types',
        :'scope' => :'scope',
        :'sector_identifier_uri' => :'sector_identifier_uri',
        :'subject_type' => :'subject_type',
        :'token_endpoint_auth_method' => :'token_endpoint_auth_method',
        :'token_endpoint_auth_signing_alg' => :'token_endpoint_auth_signing_alg',
        :'tos_uri' => :'tos_uri',
        :'updated_at' => :'updated_at',
        :'userinfo_signed_response_alg' => :'userinfo_signed_response_alg'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'allowed_cors_origins' => :'Array<String>',
        :'audience' => :'Array<String>',
        :'backchannel_logout_session_required' => :'Boolean',
        :'backchannel_logout_uri' => :'String',
        :'client_id' => :'String',
        :'client_name' => :'String',
        :'client_secret' => :'String',
        :'client_secret_expires_at' => :'Integer',
        :'client_uri' => :'String',
        :'contacts' => :'Array<String>',
        :'created_at' => :'Time',
        :'frontchannel_logout_session_required' => :'Boolean',
        :'frontchannel_logout_uri' => :'String',
        :'grant_types' => :'Array<String>',
        :'jwks' => :'Object',
        :'jwks_uri' => :'String',
        :'logo_uri' => :'String',
        :'metadata' => :'Object',
        :'owner' => :'String',
        :'policy_uri' => :'String',
        :'post_logout_redirect_uris' => :'Array<String>',
        :'redirect_uris' => :'Array<String>',
        :'registration_access_token' => :'String',
        :'registration_client_uri' => :'String',
        :'request_object_signing_alg' => :'String',
        :'request_uris' => :'Array<String>',
        :'response_types' => :'Array<String>',
        :'scope' => :'String',
        :'sector_identifier_uri' => :'String',
        :'subject_type' => :'String',
        :'token_endpoint_auth_method' => :'String',
        :'token_endpoint_auth_signing_alg' => :'String',
        :'tos_uri' => :'String',
        :'updated_at' => :'Time',
        :'userinfo_signed_response_alg' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OryClient::OAuth2Client` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OryClient::OAuth2Client`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'allowed_cors_origins')
        if (value = attributes[:'allowed_cors_origins']).is_a?(Array)
          self.allowed_cors_origins = value
        end
      end

      if attributes.key?(:'audience')
        if (value = attributes[:'audience']).is_a?(Array)
          self.audience = value
        end
      end

      if attributes.key?(:'backchannel_logout_session_required')
        self.backchannel_logout_session_required = attributes[:'backchannel_logout_session_required']
      end

      if attributes.key?(:'backchannel_logout_uri')
        self.backchannel_logout_uri = attributes[:'backchannel_logout_uri']
      end

      if attributes.key?(:'client_id')
        self.client_id = attributes[:'client_id']
      end

      if attributes.key?(:'client_name')
        self.client_name = attributes[:'client_name']
      end

      if attributes.key?(:'client_secret')
        self.client_secret = attributes[:'client_secret']
      end

      if attributes.key?(:'client_secret_expires_at')
        self.client_secret_expires_at = attributes[:'client_secret_expires_at']
      end

      if attributes.key?(:'client_uri')
        self.client_uri = attributes[:'client_uri']
      end

      if attributes.key?(:'contacts')
        if (value = attributes[:'contacts']).is_a?(Array)
          self.contacts = value
        end
      end

      if attributes.key?(:'created_at')
        self.created_at = attributes[:'created_at']
      end

      if attributes.key?(:'frontchannel_logout_session_required')
        self.frontchannel_logout_session_required = attributes[:'frontchannel_logout_session_required']
      end

      if attributes.key?(:'frontchannel_logout_uri')
        self.frontchannel_logout_uri = attributes[:'frontchannel_logout_uri']
      end

      if attributes.key?(:'grant_types')
        if (value = attributes[:'grant_types']).is_a?(Array)
          self.grant_types = value
        end
      end

      if attributes.key?(:'jwks')
        self.jwks = attributes[:'jwks']
      end

      if attributes.key?(:'jwks_uri')
        self.jwks_uri = attributes[:'jwks_uri']
      end

      if attributes.key?(:'logo_uri')
        self.logo_uri = attributes[:'logo_uri']
      end

      if attributes.key?(:'metadata')
        self.metadata = attributes[:'metadata']
      end

      if attributes.key?(:'owner')
        self.owner = attributes[:'owner']
      end

      if attributes.key?(:'policy_uri')
        self.policy_uri = attributes[:'policy_uri']
      end

      if attributes.key?(:'post_logout_redirect_uris')
        if (value = attributes[:'post_logout_redirect_uris']).is_a?(Array)
          self.post_logout_redirect_uris = value
        end
      end

      if attributes.key?(:'redirect_uris')
        if (value = attributes[:'redirect_uris']).is_a?(Array)
          self.redirect_uris = value
        end
      end

      if attributes.key?(:'registration_access_token')
        self.registration_access_token = attributes[:'registration_access_token']
      end

      if attributes.key?(:'registration_client_uri')
        self.registration_client_uri = attributes[:'registration_client_uri']
      end

      if attributes.key?(:'request_object_signing_alg')
        self.request_object_signing_alg = attributes[:'request_object_signing_alg']
      end

      if attributes.key?(:'request_uris')
        if (value = attributes[:'request_uris']).is_a?(Array)
          self.request_uris = value
        end
      end

      if attributes.key?(:'response_types')
        if (value = attributes[:'response_types']).is_a?(Array)
          self.response_types = value
        end
      end

      if attributes.key?(:'scope')
        self.scope = attributes[:'scope']
      end

      if attributes.key?(:'sector_identifier_uri')
        self.sector_identifier_uri = attributes[:'sector_identifier_uri']
      end

      if attributes.key?(:'subject_type')
        self.subject_type = attributes[:'subject_type']
      end

      if attributes.key?(:'token_endpoint_auth_method')
        self.token_endpoint_auth_method = attributes[:'token_endpoint_auth_method']
      end

      if attributes.key?(:'token_endpoint_auth_signing_alg')
        self.token_endpoint_auth_signing_alg = attributes[:'token_endpoint_auth_signing_alg']
      end

      if attributes.key?(:'tos_uri')
        self.tos_uri = attributes[:'tos_uri']
      end

      if attributes.key?(:'updated_at')
        self.updated_at = attributes[:'updated_at']
      end

      if attributes.key?(:'userinfo_signed_response_alg')
        self.userinfo_signed_response_alg = attributes[:'userinfo_signed_response_alg']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      pattern = Regexp.new(/([a-zA-Z0-9\.\*]+\s?)+/)
      if !@scope.nil? && @scope !~ pattern
        invalid_properties.push("invalid value for \"scope\", must conform to the pattern #{pattern}.")
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@scope.nil? && @scope !~ Regexp.new(/([a-zA-Z0-9\.\*]+\s?)+/)
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] scope Value to be assigned
    def scope=(scope)
      pattern = Regexp.new(/([a-zA-Z0-9\.\*]+\s?)+/)
      if !scope.nil? && scope !~ pattern
        fail ArgumentError, "invalid value for \"scope\", must conform to the pattern #{pattern}."
      end

      @scope = scope
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          allowed_cors_origins == o.allowed_cors_origins &&
          audience == o.audience &&
          backchannel_logout_session_required == o.backchannel_logout_session_required &&
          backchannel_logout_uri == o.backchannel_logout_uri &&
          client_id == o.client_id &&
          client_name == o.client_name &&
          client_secret == o.client_secret &&
          client_secret_expires_at == o.client_secret_expires_at &&
          client_uri == o.client_uri &&
          contacts == o.contacts &&
          created_at == o.created_at &&
          frontchannel_logout_session_required == o.frontchannel_logout_session_required &&
          frontchannel_logout_uri == o.frontchannel_logout_uri &&
          grant_types == o.grant_types &&
          jwks == o.jwks &&
          jwks_uri == o.jwks_uri &&
          logo_uri == o.logo_uri &&
          metadata == o.metadata &&
          owner == o.owner &&
          policy_uri == o.policy_uri &&
          post_logout_redirect_uris == o.post_logout_redirect_uris &&
          redirect_uris == o.redirect_uris &&
          registration_access_token == o.registration_access_token &&
          registration_client_uri == o.registration_client_uri &&
          request_object_signing_alg == o.request_object_signing_alg &&
          request_uris == o.request_uris &&
          response_types == o.response_types &&
          scope == o.scope &&
          sector_identifier_uri == o.sector_identifier_uri &&
          subject_type == o.subject_type &&
          token_endpoint_auth_method == o.token_endpoint_auth_method &&
          token_endpoint_auth_signing_alg == o.token_endpoint_auth_signing_alg &&
          tos_uri == o.tos_uri &&
          updated_at == o.updated_at &&
          userinfo_signed_response_alg == o.userinfo_signed_response_alg
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [allowed_cors_origins, audience, backchannel_logout_session_required, backchannel_logout_uri, client_id, client_name, client_secret, client_secret_expires_at, client_uri, contacts, created_at, frontchannel_logout_session_required, frontchannel_logout_uri, grant_types, jwks, jwks_uri, logo_uri, metadata, owner, policy_uri, post_logout_redirect_uris, redirect_uris, registration_access_token, registration_client_uri, request_object_signing_alg, request_uris, response_types, scope, sector_identifier_uri, subject_type, token_endpoint_auth_method, token_endpoint_auth_signing_alg, tos_uri, updated_at, userinfo_signed_response_alg].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OryClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
