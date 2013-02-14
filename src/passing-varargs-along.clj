(defn p [f & rest]
  (prn f rest)
  )

(defn q [f & rest]
  (apply p f rest)
  )

(p 1 2 3 4)

(q 1 2 3 4)

