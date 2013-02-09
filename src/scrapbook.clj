(ns scrap
  (:use [clojure.string :only [split-lines trim]])
  )


(defn tryit [func]
  (try (func) (catch Exception e
              (do
                (prn "Bad things happen")
                (.printStackTrace e))))
  )

(prn (tryit #(/ 9 0)))