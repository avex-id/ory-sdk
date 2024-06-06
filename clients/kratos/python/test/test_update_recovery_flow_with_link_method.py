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

from ory_kratos_client.models.update_recovery_flow_with_link_method import UpdateRecoveryFlowWithLinkMethod

class TestUpdateRecoveryFlowWithLinkMethod(unittest.TestCase):
    """UpdateRecoveryFlowWithLinkMethod unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateRecoveryFlowWithLinkMethod:
        """Test UpdateRecoveryFlowWithLinkMethod
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateRecoveryFlowWithLinkMethod`
        """
        model = UpdateRecoveryFlowWithLinkMethod()
        if include_optional:
            return UpdateRecoveryFlowWithLinkMethod(
                csrf_token = '',
                email = '',
                method = 'link',
                transient_payload = ory_kratos_client.models.transient_payload.transient_payload()
            )
        else:
            return UpdateRecoveryFlowWithLinkMethod(
                email = '',
                method = 'link',
        )
        """

    def testUpdateRecoveryFlowWithLinkMethod(self):
        """Test UpdateRecoveryFlowWithLinkMethod"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
