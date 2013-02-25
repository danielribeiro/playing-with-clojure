(ns macros.simplest-macro)

(defmacro simplemacro [arg]
  `(quote ~arg))

(prn (macroexpand '(simplemacro (println "hey"))))

(let [f (simplemacro (println "hey"))]
  (prn (class f))
  )
