(ns project_euler.prob7
  (:require [project_euler.core :as euler]))

(defn nth-prime
  [n]
  (nth (euler/sieve 120000) n)
  )

(defn prob7
  [cnt]
  (loop [res () x 3]
    (if (>= (count res) cnt)
      (nth  res cnt)
      (recur (euler/sieve x) (+ cnt x))
      )
    )
  )
