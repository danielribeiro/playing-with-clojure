(ns test-it
    (:use clojure.test))

(defn same [x y] (is (= x y))
  )

(deftest gogog
  (same 10 10))


(run-tests 'test-it)

