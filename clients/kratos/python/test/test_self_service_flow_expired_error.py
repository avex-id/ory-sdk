# coding: utf-8

"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

    The version of the OpenAPI document: v1.2.0
    Contact: office@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ory_kratos_client.models.self_service_flow_expired_error import SelfServiceFlowExpiredError

class TestSelfServiceFlowExpiredError(unittest.TestCase):
    """SelfServiceFlowExpiredError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SelfServiceFlowExpiredError:
        """Test SelfServiceFlowExpiredError
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SelfServiceFlowExpiredError`
        """
        model = SelfServiceFlowExpiredError()
        if include_optional:
            return SelfServiceFlowExpiredError(
                error = ory_kratos_client.models.generic_error.genericError(
                    code = 404, 
                    debug = 'SQL field "foo" is not a bool.', 
                    details = ory_kratos_client.models.details.details(), 
                    id = '', 
                    message = 'The resource could not be found', 
                    reason = 'User with ID 1234 does not exist.', 
                    request = 'd7ef54b1-ec15-46e6-bccb-524b82c035e6', 
                    status = 'Not Found', ),
                expired_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                since = 56,
                use_flow_id = ''
            )
        else:
            return SelfServiceFlowExpiredError(
        )
        """

    def testSelfServiceFlowExpiredError(self):
        """Test SelfServiceFlowExpiredError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
