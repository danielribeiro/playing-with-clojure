(ns evaling.hi)

(defn p [& more] (apply println more))
(let [v (class {:alfa 1 :beta 2})] (p v))
(let [[a b & c :as str] "1234567890"]
  (p [a b c str]))

(p (map (fn [& more] (apply + more)) [1 2 3] [6 6 8] [1 1 1]))

(deftype User [name pass] Object
  (toString [_] (str name '- pass)))


(println (.toString (User. :oi :secret)))

(defmacro ty [type]
  `(deftype ~type []))

(defmacro empties [& args]
  (doseq [arg args]
    `(ty ~arg))
  )

;(ty Base)
;(ty Person)
;(ty Animal)
(empties Base Person Animal)

(derive ::Person ::Base)
(derive ::Animal ::Base)
(p "isa?" (isa? ::Person ::Base))
(p (class (list 1 2 3 7)) (class [1 2 3 4]))
(ty Me)
(p Me)
(println (reduce + [1 2 3]))
