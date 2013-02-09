(ns evaling.macrofun)
(defmacro ty [type]
  `(deftype ~type []))

(defmacro empties [& args]
  (cons `do
        (for [arg args]
          `(ty ~arg))))

(defn prmacro [& args]
  (prn (cons `do
        (for [arg args]
          `(ty ~arg)))
  ))




(empties Base Person Animal)
(prmacro :Base :Person :Animal)
;equivalent to:
;(ty Base)
;(ty Person)
;(ty Animal)


(derive ::Person ::Base)
(derive ::Animal ::Base)
(empties Me)
(prn ::Me)
(prn Me)

(-> `(ty Empty) macroexpand println )
(println (macroexpand  `(ty Empty) ))

(prn '(1 2 (6 8 9)
          (um dois)
            3))
(println (macroexpand `(-> 5 class println)))
