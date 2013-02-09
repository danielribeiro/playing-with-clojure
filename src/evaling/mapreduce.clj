(ns evaling.mapreduce)
;(println )
(->> (map inc [ 2 3 4]) (reduce +) println)