"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.1.49
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.identity_with_credentials_oidc import IdentityWithCredentialsOidc
from ory_client.model.identity_with_credentials_password import IdentityWithCredentialsPassword
globals()['IdentityWithCredentialsOidc'] = IdentityWithCredentialsOidc
globals()['IdentityWithCredentialsPassword'] = IdentityWithCredentialsPassword
from ory_client.model.identity_with_credentials import IdentityWithCredentials


class TestIdentityWithCredentials(unittest.TestCase):
    """IdentityWithCredentials unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIdentityWithCredentials(self):
        """Test IdentityWithCredentials"""
        # FIXME: construct object with mandatory attributes with example values
        # model = IdentityWithCredentials()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
