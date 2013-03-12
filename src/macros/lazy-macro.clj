(ns macros.lazy-macro)

(defmacro defn-alias [arg]
      `(defn ~(symbol (str (:name arg))) [] "hey")
  )


(prn (macroexpand `(defn-alias "cool")))


(defn-alias {:name cool})
(prn (cool))
