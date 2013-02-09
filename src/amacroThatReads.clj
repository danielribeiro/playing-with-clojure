(defn- field->map
  [cls field]
  (let [name (.getName field)]
    (try
      {name
       (clojure.lang.Reflector/getStaticField cls name)}
      (catch Exception e {})
      )

    ))

(defn- declared-fields
  [cls]
  (apply merge
    (map
      (partial field->map cls)
      (.getDeclaredFields cls))))

(defmacro define-kv [key value]
    `(def ~(symbol key) ~value)
  )


(defmacro mydefine [m]
  `(def ~(symbol "what") ~m)
  )

(defmacro mydefine2 [m]
  (cons `do
            (map (fn [[k v]]
              `(define-kv ~k ~v)) m

              ))
  )

;(prmacro (declared-fields Math))
(mydefine (declared-fields (eval Math)))
(prn (macroexpand-1 (mydefine (declared-fields (eval Math)))))
;(prn (declared-fields Math))
;
;
;(prn PI)