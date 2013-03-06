(defrecord Cool [name stuff])

(def a (Cool. "m" "w?"))

(defn split-symbol [sym]
    (map #(-> % str symbol) (str sym) )
  )


(defmacro single-recipe [x]
  `(list ~@(split-symbol x))
  )

(defmacro recipe
  ([x] `(list (single-recipe ~x)))
  ([x & args] `(cons (single-recipe ~x)  (recipe ~@args))))

;(prn (single-recipe aaa))

(prn  (map count (recipe aaa
               a
              aaa
  )) )



(prn (Thread/currentThread))