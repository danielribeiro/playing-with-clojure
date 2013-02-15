(defn grab
  [json & args]
  (if (map? json)
    (select-keys json args)
    (map #(select-keys % args) json)
    ))


(def json {:name "me" :age 42 :where "SF" :who-again? "me, really" :twitter "@me"} )
(prn (grab json :name :where))
