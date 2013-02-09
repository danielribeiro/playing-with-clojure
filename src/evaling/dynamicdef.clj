(ns evaling.dynamicdef)
; from http://stackoverflow.com/questions/678867/how-to-defn-a-function-from-string-in-clojure

(intern *ns* (symbol "a") "hi-a")
;(def #=(symbol "new") "hi-new")
;
;(prn #=(symbol "newa"))

; Doesn't work
;(doseq [x ["cool" "wow"]]
;  (def #=(symbol x) (str "hi-" x))
;  )

(prn a)
;(prn new)

(-> (symbol "a") resolve deref prn)
