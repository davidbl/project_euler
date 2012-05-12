(ns project_euler.core)

(defn sumOfDigits[n] (apply + (map #(Integer/parseInt (str %)) (str n))))

(defn positive-numbers
    ([] (positive-numbers (bigint 1)))
    ([n] (lazy-seq (cons n (positive-numbers (inc n))))))

