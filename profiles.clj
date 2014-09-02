{:user {:plugins [[lein-try "0.4.3"]
                  [lein-ancient "0.5.5"]]
        :dependencies [[org.clojure/tools.trace "0.7.8"]
                       [org.clojure/tools.namespace "0.2.5"]
                       [im.chit/vinyasa "0.1.8"]
                       [org.clojars.gjahad/debug-repl "0.3.3"]]
        :injections [(require 'vinyasa.inject) 
                     (vinyasa.inject/inject 'clojure.core '>
                       '[[clojure.repl doc source]
                         [clojure.pprint pprint pp]])]}}
