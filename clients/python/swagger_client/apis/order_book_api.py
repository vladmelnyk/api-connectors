# coding: utf-8

"""
OrderBookApi.py
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
"""

from __future__ import absolute_import

import sys
import os

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class OrderBookApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def order_book_get_order_book(self, symbol, **kwargs):
        """
        Get current orderbook.
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.order_book_get_order_book(symbol, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str symbol: Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series. (required)
        :param float depth: Orderbook depth.
        :return: list[OrderBook]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['symbol', 'depth']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_book_get_order_book" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'symbol' is set
        if ('symbol' not in params) or (params['symbol'] is None):
            raise ValueError("Missing the required parameter `symbol` when calling `order_book_get_order_book`")

        resource_path = '/orderBook'.replace('{format}', 'json')
        method = 'GET'

        path_params = {}

        query_params = {}
        if 'symbol' in params:
            query_params['symbol'] = params['symbol']
        if 'depth' in params:
            query_params['depth'] = params['depth']

        header_params = {}

        form_params = {}
        files = {}

        body_params = None

        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json', 'application/xml', 'text/xml', 'application/javascript', 'text/javascript'])
        if not header_params['Accept']:
            del header_params['Accept']

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json', 'application/x-www-form-urlencoded'])

        # Authentication setting
        auth_settings = []

        response = self.api_client.call_api(resource_path, method,
                                            path_params,
                                            query_params,
                                            header_params,
                                            body=body_params,
                                            post_params=form_params,
                                            files=files,
                                            response_type='list[OrderBook]',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response
