(ns evaling.sorting
  (:use [clojure.repl :only (source-fn)])
  )

(defn cool []
  (prn (sort [[10 20] [5 10] [10 2] [5 20]]))
  )

(prn   (source-fn 'evaling.sorting/cool))