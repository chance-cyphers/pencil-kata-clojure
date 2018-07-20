(ns learn-clojure.core)

(defn getInput []
  (println "What do you want to write?")
  (read-line))

(defn doCommand [oldText]
  (let [newText (str oldText (getInput))]
    (println (str "text:\n" newText))
    (doCommand newText)))

(defn -main [& args]
  (doCommand ""))