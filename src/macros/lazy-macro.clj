(ns macros.lazy-macro)

(defn grab-name [arg]
  (symbol (str (:as (:name arg))))
  )

(defmacro defn-alias [arg]
      `(defn ~(grab-name  arg) [] (prn (quote ~arg)))
  )


(prn (macroexpand '(defn-alias {:name {:as cool}})))


(defn-alias  {:name {:as cool}})
(cool)
