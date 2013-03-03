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


(defmacro multdefit [& args ]
  (cons `do
    (map (fn [a]
           `(defit ~(symbol a))) args

      ))
  )

(prn (macroexpand `(multdefit "one" "two")))

(multdefit "one" "two")

(xone)
(yone)
(xtwo)
(ytwo
  )