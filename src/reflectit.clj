(import clojure.lang.Reflector)
(println (Reflector/invokeConstructor Object (to-array [])))

(println (Reflector/invokeInstanceMethod [{:alf 'what}] "toString"  (to-array [])))


(def A)

(defn getit [] (println A))
(defn defandcall [val]
  (let [val2 (str val "what")]
     (def A val2)
      (getit)
    ))


(defandcall "val")

(println (str 'alfa))
