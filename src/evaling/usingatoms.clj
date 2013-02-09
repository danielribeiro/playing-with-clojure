(ns evaling.usingatoms
  (:import (java.util.concurrent TimeUnit)))
(def bo (atom {:name "barak obama", :occupation :president, :age 50}))




(defn assoclist [values]
  #(apply assoc % values))

(defn edit-atom [atom values]
  (swap! atom (assoclist values))
  )
(def >> edit-atom)
(defn edit-agent [agent values]
  (send agent (assoclist values)
  ))

(defn agent? [x] (instance? clojure.lang.Agent x))
(defn atom? [x] (instance? clojure.lang.Atom x))

(defn editany [ref & values]
  (cond
    (atom? ref) (edit-atom ref values)
    (agent? ref) (edit-agent ref values)
    )
  )

;(swap! moi #(apply assoc % [:age 51]))
(editany bo :age 66)

(prn @bo)
(def boagent (agent @bo))
(prn (instance? clojure.lang.Agent boagent) (class boagent))

(editany boagent :age 44)


(.sleep TimeUnit/MILLISECONDS 500)
(prn @boagent)
(shutdown-agents)



