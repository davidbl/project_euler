(ns project_euler.core)

(defn sumOfDigits[n] (apply + (map #(Integer/parseInt (str %)) (str n))))

