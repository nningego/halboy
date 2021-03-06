(ns halboy.http
  (:require [org.httpkit.client :as http]))

(def default-http-options
  {:as        :text
   :headers   {"Content-Type" "application/json"
               "Accept"       "application/hal+json"}})

(defn GET
  ([url] (GET url {}))
  ([url options] @(http/get url (merge default-http-options options))))

(defn POST
  ([url] (POST url {}))
  ([url options] @(http/post url (merge default-http-options options))))
