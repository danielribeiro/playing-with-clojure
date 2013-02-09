(ns evaling.samp)
(defn atom-set
  "Helper function for setting an atom of a map"
  [atom & values]
  (swap! atom #(apply assoc % values))
  )

(def game
  (atom
    {:center-x 50
     :center-y 50
     :world "world"
     :canvas "canvas"
     :speed 0
     })
  )

(prn @game)
(atom-set game :world "cool")
(prn @game)