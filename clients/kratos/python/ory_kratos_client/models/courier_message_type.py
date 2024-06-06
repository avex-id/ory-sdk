# coding: utf-8

"""
    Ory Identities API

    This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

    The version of the OpenAPI document: v1.2.0
    Contact: office@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import json
from enum import Enum
from typing_extensions import Self


class CourierMessageType(str, Enum):
    """
    It can either be `email` or `phone`
    """

    """
    allowed enum values
    """
    EMAIL = 'email'
    PHONE = 'phone'

    @classmethod
    def from_json(cls, json_str: str) -> Self:
        """Create an instance of CourierMessageType from a JSON string"""
        return cls(json.loads(json_str))


