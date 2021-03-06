# coding: utf-8

"""
Copyright 2015 SmartBear Software

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

    Ref: https://github.com/swagger-api/swagger-codegen
"""

from pprint import pformat
from six import iteritems


class User(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self):
        """
        User - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'float',
            'firstname': 'str',
            'lastname': 'str',
            'status': 'str',
            'username': 'str',
            'email': 'str',
            'phone': 'str',
            'country_code': 'float',
            'created': 'date',
            'last_updated': 'date',
            'preferences': 'UserPreferences',
            'role': 'str',
            'tfa_enabled': 'str',
            'affiliate_id': 'str',
            'pgp_pub_key': 'str',
            'country': 'str',
            'disabled': 'bool'
        }

        self.attribute_map = {
            'id': 'id',
            'firstname': 'firstname',
            'lastname': 'lastname',
            'status': 'status',
            'username': 'username',
            'email': 'email',
            'phone': 'phone',
            'country_code': 'countryCode',
            'created': 'created',
            'last_updated': 'lastUpdated',
            'preferences': 'preferences',
            'role': 'role',
            'tfa_enabled': 'TFAEnabled',
            'affiliate_id': 'affiliateID',
            'pgp_pub_key': 'pgpPubKey',
            'country': 'country',
            'disabled': 'disabled'
        }

        self._id = None
        self._firstname = None
        self._lastname = None
        self._status = None
        self._username = None
        self._email = None
        self._phone = None
        self._country_code = None
        self._created = None
        self._last_updated = None
        self._preferences = None
        self._role = None
        self._tfa_enabled = None
        self._affiliate_id = None
        self._pgp_pub_key = None
        self._country = None
        self._disabled = None

    @property
    def id(self):
        """
        Gets the id of this User.


        :return: The id of this User.
        :rtype: float
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this User.


        :param id: The id of this User.
        :type: float
        """
        self._id = id

    @property
    def firstname(self):
        """
        Gets the firstname of this User.


        :return: The firstname of this User.
        :rtype: str
        """
        return self._firstname

    @firstname.setter
    def firstname(self, firstname):
        """
        Sets the firstname of this User.


        :param firstname: The firstname of this User.
        :type: str
        """
        self._firstname = firstname

    @property
    def lastname(self):
        """
        Gets the lastname of this User.


        :return: The lastname of this User.
        :rtype: str
        """
        return self._lastname

    @lastname.setter
    def lastname(self, lastname):
        """
        Sets the lastname of this User.


        :param lastname: The lastname of this User.
        :type: str
        """
        self._lastname = lastname

    @property
    def status(self):
        """
        Gets the status of this User.


        :return: The status of this User.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this User.


        :param status: The status of this User.
        :type: str
        """
        self._status = status

    @property
    def username(self):
        """
        Gets the username of this User.


        :return: The username of this User.
        :rtype: str
        """
        return self._username

    @username.setter
    def username(self, username):
        """
        Sets the username of this User.


        :param username: The username of this User.
        :type: str
        """
        self._username = username

    @property
    def email(self):
        """
        Gets the email of this User.


        :return: The email of this User.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """
        Sets the email of this User.


        :param email: The email of this User.
        :type: str
        """
        self._email = email

    @property
    def phone(self):
        """
        Gets the phone of this User.


        :return: The phone of this User.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """
        Sets the phone of this User.


        :param phone: The phone of this User.
        :type: str
        """
        self._phone = phone

    @property
    def country_code(self):
        """
        Gets the country_code of this User.


        :return: The country_code of this User.
        :rtype: float
        """
        return self._country_code

    @country_code.setter
    def country_code(self, country_code):
        """
        Sets the country_code of this User.


        :param country_code: The country_code of this User.
        :type: float
        """
        self._country_code = country_code

    @property
    def created(self):
        """
        Gets the created of this User.


        :return: The created of this User.
        :rtype: date
        """
        return self._created

    @created.setter
    def created(self, created):
        """
        Sets the created of this User.


        :param created: The created of this User.
        :type: date
        """
        self._created = created

    @property
    def last_updated(self):
        """
        Gets the last_updated of this User.


        :return: The last_updated of this User.
        :rtype: date
        """
        return self._last_updated

    @last_updated.setter
    def last_updated(self, last_updated):
        """
        Sets the last_updated of this User.


        :param last_updated: The last_updated of this User.
        :type: date
        """
        self._last_updated = last_updated

    @property
    def preferences(self):
        """
        Gets the preferences of this User.


        :return: The preferences of this User.
        :rtype: UserPreferences
        """
        return self._preferences

    @preferences.setter
    def preferences(self, preferences):
        """
        Sets the preferences of this User.


        :param preferences: The preferences of this User.
        :type: UserPreferences
        """
        self._preferences = preferences

    @property
    def role(self):
        """
        Gets the role of this User.


        :return: The role of this User.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """
        Sets the role of this User.


        :param role: The role of this User.
        :type: str
        """
        self._role = role

    @property
    def tfa_enabled(self):
        """
        Gets the tfa_enabled of this User.


        :return: The tfa_enabled of this User.
        :rtype: str
        """
        return self._tfa_enabled

    @tfa_enabled.setter
    def tfa_enabled(self, tfa_enabled):
        """
        Sets the tfa_enabled of this User.


        :param tfa_enabled: The tfa_enabled of this User.
        :type: str
        """
        self._tfa_enabled = tfa_enabled

    @property
    def affiliate_id(self):
        """
        Gets the affiliate_id of this User.


        :return: The affiliate_id of this User.
        :rtype: str
        """
        return self._affiliate_id

    @affiliate_id.setter
    def affiliate_id(self, affiliate_id):
        """
        Sets the affiliate_id of this User.


        :param affiliate_id: The affiliate_id of this User.
        :type: str
        """
        self._affiliate_id = affiliate_id

    @property
    def pgp_pub_key(self):
        """
        Gets the pgp_pub_key of this User.


        :return: The pgp_pub_key of this User.
        :rtype: str
        """
        return self._pgp_pub_key

    @pgp_pub_key.setter
    def pgp_pub_key(self, pgp_pub_key):
        """
        Sets the pgp_pub_key of this User.


        :param pgp_pub_key: The pgp_pub_key of this User.
        :type: str
        """
        self._pgp_pub_key = pgp_pub_key

    @property
    def country(self):
        """
        Gets the country of this User.


        :return: The country of this User.
        :rtype: str
        """
        return self._country

    @country.setter
    def country(self, country):
        """
        Sets the country of this User.


        :param country: The country of this User.
        :type: str
        """
        self._country = country

    @property
    def disabled(self):
        """
        Gets the disabled of this User.


        :return: The disabled of this User.
        :rtype: bool
        """
        return self._disabled

    @disabled.setter
    def disabled(self, disabled):
        """
        Sets the disabled of this User.


        :param disabled: The disabled of this User.
        :type: bool
        """
        self._disabled = disabled

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other): 
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """ 
        Returns true if both objects are not equal
        """
        return not self == other

