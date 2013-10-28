(use '[clojure.java.shell :only [sh]])


(pr (sh "ls" "-l"))

(pr (sh "not-a-real-command" "-l")) ; Throws an exception

