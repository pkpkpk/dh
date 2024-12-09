

```bash
# put pkpkpk dir adjacent to replikativ folder containing datahike et al

pkpkpk/dh$ npm install               #<-- installs electron & shadow
pkpkpk/dh$ npm start                 #<-- launches electron
pkpkpk/dh$ shadow-cljs watch :dev    #<-- shadow worker, connect w/ nrepl
```

```clojure
;; shadow worker conn gives access to electron repl
(shadow/repl :dev)
```