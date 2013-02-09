(def theclasis System)

(defprotocol Yeller
  (yell [_] "you yell...")
  )



(extend-type Class
  Yeller
    (yell [this] "whoho"))

(prn "here we go again" (yell theclasis ))

(defn inst [clas & args ]
  (clojure.lang.Reflector/invokeConstructor (-> clas .getCanonicalName symbol resolve) (to-array args))
  )





(prn (clojure.lang.Reflector/getStaticField theclasis "out"))

(def text '(what a cool (clojure is) thing.`I 'can' "write" a test
           Yes!!!
          what about :keywords
          and :bad 'ones?
            ))

(def text2 '(are \:



              ))
(prn text2)