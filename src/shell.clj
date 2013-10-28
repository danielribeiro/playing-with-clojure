(use '[clojure.java.shell :only [sh]])


(pr (sh "ls" "-l"))
