(defn doit []
  (let
    [realcls (.getClass (java.util.ArrayList.))
      cls (get-proxy-class realcls)
     block (construct-proxy cls 1)]
    block
    )
  )

(defn doit2 []
  (let
    [realcls (.getClass (java.util.ArrayList.))
      cls (get-proxy-class realcls)]
    cls
    )
  )

(println (doit))

(println (doit2))
