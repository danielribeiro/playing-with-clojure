(ns macros.constfuncs-hygenic)

(defmacro constfuncs [& args]
  (cons `do
    (map (fn [a]
              `(defn ~(symbol (str "x" a)) [x# y# z#] (println ~(str a)))) args

      ))
  )

(prn (macroexpand '(constfuncs fun macros)))
(constfuncs fun macros)

(xfun 1 2 3)
(xmacros 1 2 3)

(prn (:arglists (meta #'xfun)))