(ns evaling.override-symbol)
; Fail
(defmulti invoke class)
(defmethod invoke clojure.lang.Keyword [k] :a-keyword)

(prn (:haha 5))

