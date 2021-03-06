#!/usr/bin/env bb

(require '[babashka.curl :as curl]
         '[clojure.java.io :as io]
         '[cheshire.core :as json])

(def resp
  (curl/get "https://lichess.org/api/user/CookingRooks/perf/blitz"
            {:headers
             {"Authorization" (str "Bearer " "")}}))


(json/parse-string (:body resp)) ;;=> {"code" 200, "description" "OK"}
