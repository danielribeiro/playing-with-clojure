(defn co [x] (str "com " x))

(println (->> [9] (apply (fn [valor] (str "com" valor))) ))


(println (->> 9 inc inc inc (+ 2)))


