(ns dh.entry
  (:require datahike.api
            datahike.api.impl
            datahike.api.specification
            datahike.array
            datahike.config
            datahike.connector
            datahike.connections
            datahike.constants
            datahike.core
            datahike.datom
            datahike.db
            datahike.db.interface
            datahike.db.search
            datahike.db.transaction
            datahike.db.utils
            datahike.gc
            datahike.impl.entity
            datahike.index
            datahike.index.interface
            datahike.index.persistent-set
            datahike.index.utils
            datahike.integration-test
            ;datahike.json
            datahike.lru
            datahike.middleware.utils
            datahike.pull-api
            datahike.query
            datahike.readers
            ;datahike.remote
            datahike.schema
            datahike.schema-cache
            datahike.spec
            datahike.store
            datahike.transit
            datahike.tools
            datahike.writing
            datahike.writer
            datahike-node))

(defn -main [] (js/console.log "dh.entry/-main"))

;;TODO some protocols (in DB + connector) are extended to cljs PersistentArrayMaps...there are other kinds!

;; -- skipping
;; datahike.remote, datahike.json (jsonista)
;; [datahike.http.writer]