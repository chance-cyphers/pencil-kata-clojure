(ns learn-clojure.core
  (:require [clojure.string :as str]))

(defn getInput []
  (println "Options:\n\twrite [text]")
  (read-line))

(defn write [oldText input]
  (let [newText (str oldText input)]
    (println (str "\nPaper:\n" newText "\n"))
    newText))

(defn processCommand [text]
  (let [input (getInput) command (first (str/split input #" "))]
    (if (= command "write")
      (let [options (subs input (+ (count command) 1))]
        (processCommand (write text options)))
      (
        (println "Not a valid command")
        (processCommand text)))))

(defn -main [& args]
  (processCommand ""))