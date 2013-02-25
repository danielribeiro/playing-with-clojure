; Can we embed dates in full zulu form in clojure? Question inpsired by https://github.com/mojombo/toml

; Inspired on simplest macro.
(defmacro simplemacro [arg]
  `(quote ~arg))

; Answer: iso date in full zulu form is not valid Clojure, even inside a macro. The reader tries to parse it as a number, and failes with
; java.lang.NumberFormatException: Invalid number: 1979-05-27T07:32:00
(prn (macroexpand (printit 1979-05-27T07:32:00Z)))

