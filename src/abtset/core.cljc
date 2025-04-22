(ns abtset.core
  (:refer-clojure :exclude [disj]))

#_ (do (require :reload 'abtset) (in-ns 'abtset))

(defprotocol IStorage (-store [this k v]))

(defrecord BTSet [
                  _address ;; mut
                  ])

(defrecord Branch [])
(defrecord ANode [])
(defrecord Leaf [])

(def settings {})

#!-----------------------------------------------------------------------------

(defn disj>
  ;; => {:error <E>}, {:value set'}
  ([set key cb])
  ([set key cmp cb]))

(defn slice>
  ;; => {:error <E>}
  ;;    {:value []}
  ;;    {:value [T ..]}
  ;;    {:value [T ..]
  ;;     :next (fn [cb])}
  ([set from to cb])
  ([set from to cmp cb]))

(defn conj>
  ;; => {:error <E>}, {:value set'}
  ([set key cmp cb]))

(defn walk-addresses>
  ([btset f cb]))