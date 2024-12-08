(ns dh.entry
  (:require datahike.array
            datahike.config
            datahike.datom
            datahike.middleware.utils
            datahike.db
            datahike.db.interface
            datahike.db.search
            datahike.db.transaction
            datahike.db.utils
            datahike.impl.entity
            datahike.index
            datahike.index.interface
            datahike.index.persistent-set
            datahike.index.utils
            datahike.lru
            datahike.pull-api
            datahike.query
            datahike.schema
            datahike.schema-cache
            datahike.store
            datahike.tools
            datahike.writing
            datahike-node))

(defn -main [] (js/console.log "dh.entry/-main"))
