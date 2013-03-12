(ns macros.simplest-macro)

(defmacro simplemacro [arg]
  `(quote ~arg))

(prn (macroexpand '(simplemacro {:name (name cool)})))

(let [f (simplemacro (println {:name (name cool)}))]
  (prn (->> f last :name first))
  )

