{:user {:plugins [[lein-try "0.4.3"]
                  [lein-ancient "0.5.5"]]
        :dependencies [[im.chit/vinyasa "0.1.8"]
                       [org.clojars.gjahad/debug-repl "0.3.3"]]
        :injections [(require 'vinyasa.inject)
                     #_(require 'alex-and-georges.debug-repl)
                     (vinyasa.inject/inject 'clojure.core '>
                       '[[clojure.repl doc source]
                         [clojure.pprint pprint pp]])
                     #_(vinyasa.inject/inject 'clojure.core '>
                       '[[alex-and-georges.debug-repl debug-repl]])]}}
