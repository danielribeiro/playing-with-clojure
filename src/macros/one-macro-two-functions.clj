(ns macros.one-macro-two-functions)

(defmacro defit [arg]
  (cons `do
    (list
    `(defn ~(symbol (str "x" arg)) [] (println ~(str "called " arg)))
    `(defn ~(symbol (str "y" arg)) [] (println ~(str "called new" arg)))
    ))
  )

(prn (macroexpand `(defit "name")))
(defit "name")

(xname)
(yname)
