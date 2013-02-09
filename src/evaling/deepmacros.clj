(ns evaling.deepmacros)

(def changemap)
(def changeforms)


(defn changesingleform
  [number form]
  (cond
    (map? form) (changemap number form)
    (seq? form) (map #(changesingleform number %) form)
    (keyword? form) number
    true form
    )
  )

(defn changeforms [number & forms] (map #(changesingleform number %) forms)
  )

(defn changemap [number m]
  (reduce
    (fn [m [k v]]
      (assoc m (changesingleform number v) (changesingleform number k))
      )
    {} m)
  )

(defmacro to42 [number form] (changesingleform number form))

(to42 53 (do (prn :alfa) (prn :beta)))


