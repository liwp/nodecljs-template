(ns {{name}}.core
    (:require [cljs.nodejs :as nodejs]))
 
(defn -main []
  (println "Hello world!"))
 
(nodejs/enable-util-print!)
(set! *main-cli-fn* -main)
