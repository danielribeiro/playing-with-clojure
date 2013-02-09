(println (resolve (symbol "Object")))
(println (->> "Object" symbol resolve type))
(def mycls (class (Object.)))
(println (eval `(new ~mycls)))

(defn inst [clas & args ]
  (clojure.lang.Reflector/invokeConstructor clas (to-array args))
  )

(println (eval `(new ~(resolve (symbol "Object")))))

(println (inst Object))

(->> (resolve (symbol "Object")) type println)
(->> Object type println)

(def MyObj
   (get-proxy-class (resolve (symbol "Object")) )
  )

(def inst (construct-proxy MyObj) )

(println "using stuff")
(println inst)

(init-proxy inst {"toString" (fn [this] "not an object")})

(println inst)