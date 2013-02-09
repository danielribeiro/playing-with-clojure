(ns evaling.implementing-function)
(def cool (proxy [clojure.lang.IFn]
  []
  (invoke [& args] (println args))))

(cool 452)
