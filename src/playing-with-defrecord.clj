; Great info on defrecord: http://clojuredocs.org/clojure_core/clojure.core/defrecord
(defrecord P [name])

(def a (P. "name"))

(prn a)
(prn (= a (P. "name")))

(prn (map->P {:name "cool"}))

(prn (:name a))

;(prn (a :name)) Does not work: user.P cannot be cast to clojure.lang.IFn

(prn (.name a))

(prn (->P "another named P"))

(prn (assoc a :name "I changed it"))