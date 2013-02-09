(ns here)
(def state (atom 0))

(println (swap! state inc))

(println @state)

(def vari 10)


(defn incit [incvalue]
  (def vari (+ vari incvalue)))

(incit 20)

(println vari)