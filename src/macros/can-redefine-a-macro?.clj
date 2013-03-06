(ns macros.can-redefine-a-macro?)

(defmacro forty-two [] 42)

(defmacro forty-two [] "yes")

(prn (forty-two))
