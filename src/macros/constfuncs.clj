(ns macros.constfuncs)

(defmacro constfuncs [& args]
  (cons `do
    (map (fn [a]
              `(defn ~a [x# y# z#] (println ~(str a)))) args

      ))
  )

(prn (macroexpand '(constfuncs fun macros)))
(constfuncs fun macros)

(fun 1 2 3)
(macros 1 2 3)

(prn (:arglists (meta #'fun)))
(let)