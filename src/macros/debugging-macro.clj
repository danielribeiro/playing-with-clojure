(ns macros.debugging-macro)

(defmacro bugit [& form]
  (list `do
    `(prn ~form)
    `(~@form))
  )

(prn (macroexpand '(bugit + 1 2)))

(bugit + 1 2)