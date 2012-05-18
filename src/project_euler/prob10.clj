(ns project_euler.prob10
  (:require [project_euler.core :as euler]))


(defn prob10[max-val]
  (apply + (euler/sieve max-val))
  )
