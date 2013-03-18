(ns macros.debugging-macro)

(defmacro bugit [& form]
  `(let [res# (~@form)]
     (prn res#)
     res#
     ))

(prn (macroexpand '(bugit + 1 2)))

(bugit + 1 2)