(ns evaling.anaphoric)
(defmacro aif [test-form then-form]
  `(let [~'it ~test-form]
      (if ~'it ~then-form)))

;(-> `(aif (+ 3 4) (println it)) macroexpand println )
(aif nil (println it))