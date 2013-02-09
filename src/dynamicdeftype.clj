(def inst (proxy [Object] [] (toString [] "it is me")))

(println inst)

(def cls (class (Object.)))

(defmacro proxyclas [clas args & fs]

  )
(def inst2 (eval `(proxy [~(symbol (.getCanonicalName cls))] [] (toString [] "it is me 2"))))

(println inst2)