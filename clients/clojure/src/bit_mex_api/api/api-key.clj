(ns bit-mex-api.api.api-key
  (:require [bit-mex-api.core :refer [call-api check-required-params]])
  (:import (java.io File)))

(defn api-key-get-keys
  "Get your API Keys."
  ([] (api-key-get-keys nil))
  ([{:keys [reverse ]}]
   (call-api "/apiKey" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"reverse" reverse }
              :form-params   {}
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn api-key-create-key
  "Create a new API Key.
  API Keys can also be created via <a href=\"https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py\">this Python script</a>. See the <a href=\"/app/apiKeys\">API Key Documentation</a> for more information on capabilities."
  ([] (api-key-create-key nil))
  ([{:keys [name cidr permissions enabled token ]}]
   (call-api "/apiKey" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {"name" name "cidr" cidr "permissions" permissions "enabled" enabled "token" token }
              :content-types ["application/json" "application/x-www-form-urlencoded"]
              :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]})))

(defn api-key-remove
  "Remove an API Key."
  [api-key-id ]
  (call-api "/apiKey" :delete
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"apiKeyID" api-key-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))

(defn api-key-disable
  "Disable an API Key."
  [api-key-id ]
  (call-api "/apiKey/disable" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"apiKeyID" api-key-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))

(defn api-key-enable
  "Enable an API Key."
  [api-key-id ]
  (call-api "/apiKey/enable" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {"apiKeyID" api-key-id }
             :content-types ["application/json" "application/x-www-form-urlencoded"]
             :accepts       ["application/json" "application/xml" "text/xml" "application/javascript" "text/javascript"]}))
