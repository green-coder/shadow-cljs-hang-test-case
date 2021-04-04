(ns foo.core
  ;; Typo: "foo.foo_bar" instead of the correct "foo.foo-bar"
  ;; Shadow-CLJS hangs and gives up after 1 minute.
  (:require [foo.foo_bar :as foo-bar]))

(defn init [x y]
  (js/console.log (foo-bar/add x y)))
