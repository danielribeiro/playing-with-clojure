(ns macros.a-macro-writing-macro-recursion-ftw)

(defmacro constmacrobuilder [prefix]
  (defmacro constfuncs [& args]
    (cons `do
      (map (fn [a]
             `(defn ~(symbol (str prefix a)) [x# y# z#] (println ~(str a)))) args

        ))
    )
  )

(constmacrobuilder "building-hands-")

(prn (macroexpand '(constfuncs fun macros)))
(constfuncs fun macros)


(building-hands-fun 1 2 3)
