(defn print-kv [{k :l v :v}]
  (println "the key is " k " the v is " v)
  )

; Equals:
;(defn print-kv [map]
;  (let [{k :l v :v} map] (println "the key is " k " the v is " v)))

(print-kv {:k "a cool key" :v "a cool v"})
