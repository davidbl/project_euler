(ns project_euler.prob18
  (:require [project_euler.core :as euler]))

(defn my-max[lizt e]
  (reduce max (map #(+ e %) lizt))
  )

(defn build-row[bot pen]
  (map my-max (euler/each-cons bot) pen)
  )

(defn prob18-reduce[data]
  (loop [l data]
    (if (= (count l) 1)
      l
      (recur (conj (nthrest l 2) (build-row (first l) (first (rest l))))))
    ))

(defn prob18
  [filename]
  (def a (clojure.string/split (slurp filename) #"\n"))
  (def b (map #(clojure.string/split % #" ") a))
  (def c (map #(map read-string %) b))
  (prob18-reduce (reverse c))
  )
