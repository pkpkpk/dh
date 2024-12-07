(ns dh)


#! TODO
;java/src/datahike/java/Datahike.java
;java/src/datahike/java/DatahikeTest.java
;libdatahike/src/datahike/impl/LibDatahike.java
;src/datahike/api.cljc
;src/datahike/api/macros.clj
;src/datahike/api/specification.cljc
;src/datahike/array.cljc
;src/datahike/cli.clj
;src/datahike/config.cljc
;src/datahike/connector.cljc

;src/datahike/db/search.cljc
;src/datahike/db/transaction.cljc
;src/datahike/experimental/gc.cljc
;src/datahike/experimental/versioning.cljc
;src/datahike/impl/entity.cljc
;src/datahike/lru.cljc
;src/datahike/middleware/utils.cljc
;src/datahike/pull_api.cljc
;src/datahike/readers.cljc
;src/datahike/schema.cljc
;src/datahike/schema_cache.cljc
;src/datahike/store.cljc
;src/datahike/writer.cljc
;src/datahike/writing.cljc
;test/datahike/test/gc_test.cljc


;src/datahike/index.cljc


#! DONE -------------------------------------------------------
;deps.edn
;shadow-cljs.edn
;src/datahike/datom.cljc
;src/datahike/index/interface.cljc







;{:deps {:aliases [:cljs]}
; :builds
; {
;  :browser-test
;  {:target :browser-test
;   :test-dir  "resources/public/js/test"
;   :ns-regexp "datahike.test.lookup-refs-test"
;   :devtools {:http-port 8021
;              :http-root "resources/public/js/test"}}

;  :browser-module
;  {:target :browser
;   :output-dir "public/assets/app/js"
;   :asset-path "/assets/app/js"
;   :modules {:main {:init-fn db.compiled/run-query}}}

;  :node-test
;  {:target :node-test
;   :output-to "out/node-tests.js"
;   :autorun true}
;  :ci {:target :karma :output-to "target/ci.js"}}}
