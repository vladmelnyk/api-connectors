# coding: utf-8

"""
OrderApi.py
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


class OrderApi(object):
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

    def order_get_orders(self, **kwargs):
        """
        Get your orders.
        To get open orders only, send {\"open\": true} in the filter param.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.order_get_orders(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str symbol: Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.
        :param str filter: Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.
        :param str columns: Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
        :param float count: Number of results to fetch.
        :param float start: Starting point for results.
        :param bool reverse: If true, will sort results newest first.
        :param date start_time: Starting date filter for results.
        :param date end_time: Ending date filter for results.
        :return: list[Order]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['symbol', 'filter', 'columns', 'count', 'start', 'reverse', 'start_time', 'end_time']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_get_orders" % key
                )
            params[key] = val
        del params['kwargs']


        resource_path = '/order'.replace('{format}', 'json')
        method = 'GET'

        path_params = {}

        query_params = {}
        if 'symbol' in params:
            query_params['symbol'] = params['symbol']
        if 'filter' in params:
            query_params['filter'] = params['filter']
        if 'columns' in params:
            query_params['columns'] = params['columns']
        if 'count' in params:
            query_params['count'] = params['count']
        if 'start' in params:
            query_params['start'] = params['start']
        if 'reverse' in params:
            query_params['reverse'] = params['reverse']
        if 'start_time' in params:
            query_params['startTime'] = params['start_time']
        if 'end_time' in params:
            query_params['endTime'] = params['end_time']

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
                                            response_type='list[Order]',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def order_new_order(self, symbol, quantity, price, **kwargs):
        """
        Create a new order.
        This endpoint is used for placing orders. Valid order types are 'Limit' and 'StopLimit'. If none is provided, BitMEX will assume a Limit Order.\n\nA note on API tools: if you want to keep track of order IDs yourself, set a unique clOrdID per order. This ID will come back as a property on the order and any related executions (including on the WebSocket), and can be used to get or cancel the order. Max length is 36 characters.\n\nTo generate a clOrdID, consider setting a prefix, and incrementing a counter or generating a UUID. Some UUIDs are longer than 36 characters, so use a url-safe base64 encoding. For example, the prefix 'bmex_mm_' and the UUID '7fbd6545-bb0c-11e4-a273-6003088a7c04' creates 'bmex_mm_f71lRbsMEeSic2ADCIp8BA'.\n\nSee the BitMEX <a href='https://github.com/BitMEX/market-maker/blob/22c75a2b6db63e20212813e9afdb845db1b09b2a/bitmex.py#L152'>Reference Market Maker</a> for an example of how to use and generate clOrdIDs.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.order_new_order(symbol, quantity, price, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str symbol: Instrument symbol. (required)
        :param float quantity: Quantity. Use positive numbers to buy, negative to sell. (required)
        :param float price: Order price. (required)
        :param str time_in_force: Time in force. Valid options: 'IOC' (Immediate-Or-Cancel), 'GTC' (Good-Till-Cancelled).
        :param str type: Order type. Available: 'Limit', 'StopLimit'
        :param float stop_price: If order type is 'StopLimit', this is the trigger/stop price.
        :param str cl_ord_id: Optional Client Order ID to give this order. This ID will come back on any execution messages tied to this order.
        :return: Order
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['symbol', 'quantity', 'price', 'time_in_force', 'type', 'stop_price', 'cl_ord_id']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_new_order" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'symbol' is set
        if ('symbol' not in params) or (params['symbol'] is None):
            raise ValueError("Missing the required parameter `symbol` when calling `order_new_order`")
        # verify the required parameter 'quantity' is set
        if ('quantity' not in params) or (params['quantity'] is None):
            raise ValueError("Missing the required parameter `quantity` when calling `order_new_order`")
        # verify the required parameter 'price' is set
        if ('price' not in params) or (params['price'] is None):
            raise ValueError("Missing the required parameter `price` when calling `order_new_order`")

        resource_path = '/order'.replace('{format}', 'json')
        method = 'POST'

        path_params = {}

        query_params = {}

        header_params = {}

        form_params = {}
        files = {}
        if 'symbol' in params:
            form_params['symbol'] = params['symbol']
        if 'quantity' in params:
            form_params['quantity'] = params['quantity']
        if 'price' in params:
            form_params['price'] = params['price']
        if 'time_in_force' in params:
            form_params['timeInForce'] = params['time_in_force']
        if 'type' in params:
            form_params['type'] = params['type']
        if 'stop_price' in params:
            form_params['stopPrice'] = params['stop_price']
        if 'cl_ord_id' in params:
            form_params['clOrdID'] = params['cl_ord_id']

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
                                            response_type='Order',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def order_cancel_order(self, **kwargs):
        """
        Cancel order(s). Send multiple order IDs to cancel in bulk.
        Either an orderID or a clOrdID must be provided.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.order_cancel_order(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str order_id: Order ID(s).
        :param str cl_ord_id: Client Order ID(s). See POST /order.
        :param str text: Optional cancellation annotation. e.g. 'Spread Exceeded'
        :return: list[Order]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['order_id', 'cl_ord_id', 'text']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_cancel_order" % key
                )
            params[key] = val
        del params['kwargs']


        resource_path = '/order'.replace('{format}', 'json')
        method = 'DELETE'

        path_params = {}

        query_params = {}

        header_params = {}

        form_params = {}
        files = {}
        if 'order_id' in params:
            form_params['orderID'] = params['order_id']
        if 'cl_ord_id' in params:
            form_params['clOrdID'] = params['cl_ord_id']
        if 'text' in params:
            form_params['text'] = params['text']

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
                                            response_type='list[Order]',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def order_cancel_all(self, **kwargs):
        """
        Cancels all of your orders.
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.order_cancel_all(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str symbol: Optional symbol. If provided, only cancels orders for that symbol.
        :param str filter: Optional filter for cancellation. Use to only cancel some orders, e.g. `{\"side\": \"Buy\"}`.
        :param str text: Optional cancellation annotation. e.g. 'Spread Exceeded'
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['symbol', 'filter', 'text']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_cancel_all" % key
                )
            params[key] = val
        del params['kwargs']


        resource_path = '/order/all'.replace('{format}', 'json')
        method = 'DELETE'

        path_params = {}

        query_params = {}

        header_params = {}

        form_params = {}
        files = {}
        if 'symbol' in params:
            form_params['symbol'] = params['symbol']
        if 'filter' in params:
            form_params['filter'] = params['filter']
        if 'text' in params:
            form_params['text'] = params['text']

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
                                            response_type='InlineResponse200',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def order_cancel_all_after(self, timeout, **kwargs):
        """
        Automatically cancel all your orders after a specified timeout.
        Useful as a dead-man's switch to ensure your orders are canceled in case of an outage. If called repeatedly, the existing offset will be canceled and a new one will be inserted in its place. <br><br>Example usage: call this route at 15s intervals with an offset of 60000 (60s). If this route is not called within 60 seconds, all your orders will be automatically canceled.<br><br>This is also available via <a href=\"https://www.bitmex.com/app/wsAPI#dead-man-s-switch-auto-cancel-\">WebSocket</a>.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.order_cancel_all_after(timeout, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param float timeout: Timeout in ms. Set to 0 to cancel this timer. (required)
        :return: InlineResponse200
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['timeout']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_cancel_all_after" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'timeout' is set
        if ('timeout' not in params) or (params['timeout'] is None):
            raise ValueError("Missing the required parameter `timeout` when calling `order_cancel_all_after`")

        resource_path = '/order/cancelAllAfter'.replace('{format}', 'json')
        method = 'POST'

        path_params = {}

        query_params = {}

        header_params = {}

        form_params = {}
        files = {}
        if 'timeout' in params:
            form_params['timeout'] = params['timeout']

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
                                            response_type='InlineResponse200',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def order_close_position(self, symbol, **kwargs):
        """
        Close a position with a market order.
        If no price is specified, a market order will be submitted to close the entirety of your position. Be careful with market orders as you may not be filled at a favorable price.

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.order_close_position(symbol, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str symbol: Symbol of position to close. (required)
        :param float price: Optional limit price.
        :return: Order
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['symbol', 'price']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_close_position" % key
                )
            params[key] = val
        del params['kwargs']

        # verify the required parameter 'symbol' is set
        if ('symbol' not in params) or (params['symbol'] is None):
            raise ValueError("Missing the required parameter `symbol` when calling `order_close_position`")

        resource_path = '/order/closePosition'.replace('{format}', 'json')
        method = 'POST'

        path_params = {}

        query_params = {}

        header_params = {}

        form_params = {}
        files = {}
        if 'symbol' in params:
            form_params['symbol'] = params['symbol']
        if 'price' in params:
            form_params['price'] = params['price']

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
                                            response_type='Order',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response

    def order_get_close_out_orders(self, **kwargs):
        """
        Get open liquidation orders.
        

        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.order_get_close_out_orders(callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str filter: Filter. For example, send {\"symbol\": \"XBT24H\"}.
        :return: list[LiquidationOrder]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['filter']
        all_params.append('callback')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method order_get_close_out_orders" % key
                )
            params[key] = val
        del params['kwargs']


        resource_path = '/order/liquidations'.replace('{format}', 'json')
        method = 'GET'

        path_params = {}

        query_params = {}
        if 'filter' in params:
            query_params['filter'] = params['filter']

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
                                            response_type='list[LiquidationOrder]',
                                            auth_settings=auth_settings,
                                            callback=params.get('callback'))
        return response
