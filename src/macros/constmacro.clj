(ns macros.constmacro)

(defmacro mynil [] nil)

;(prn mynil) Can't take the value of a macro.

(prn (mynil)) ; nil
