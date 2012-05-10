(ns project_euler.prob13)

(defn prob13[fileName] (clojure.string/join (take 10 (str (apply + (map bigint (clojure.string/split (slurp fileName) #"\n")))))))

