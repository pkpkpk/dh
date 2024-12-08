(ns dh.entry
  (:require datahike.array
            datahike.config
            datahike.datom
            datahike.db.interface
            ;datahike.db.search
            datahike.db.transaction
            datahike.db.utils
            datahike.index
            datahike.index.interface
            datahike.index.persistent-set
            datahike.index.utils
            datahike.lru
            datahike.schema
            datahike.schema-cache
            datahike.store
            datahike.tools
            ;datahike.writing
            datahike-node))

(defn -main [] (js/console.log "entry start"))

#! TODO
;src/datahike/api.cljc
;src/datahike/api/macros.clj
;src/datahike/api/specification.cljc
;src/datahike/cli.clj
;src/datahike/connector.cljc
;src/datahike/experimental/gc.cljc
;src/datahike/experimental/versioning.cljc
;src/datahike/impl/entity.cljc
;src/datahike/middleware/utils.cljc
;src/datahike/pull_api.cljc
;src/datahike/readers.cljc
;src/datahike/writer.cljc
;src/datahike/writing.cljc
;test/datahike/test/gc_test.cljc
;src/datahike/db/search.cljc
#!- IN-PROGRESS ---------------------------------
;src/datahike/db/transaction.cljc
#!- DONE ----------------------------------------
;deps.edn
;shadow-cljs.edn
;src/datahike/array.cljc
;src/datahike/config.cljc
;src/datahike/datom.cljc
;src/datahike/index.cljc
;src/datahike/index/interface.cljc
;src/datahike/index/persistent-set.cljc
;src/datahike/index/utils.cljc
;src/datahike/schema.cljc
;src/datahike/schema_cache.cljc
;src/datahike/store.cljc
;src/datahike/tools.cljc
;src/datahike/db/interface.cljc
;src/datahike/db/utils.cljc
;src/datahike/lru.cljc