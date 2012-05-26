(ns project_euler.string_manipulation
  (:require [project_euler.core :as euler]))

(defn map-occurence[s]
  (reduce (fn [m x] (assoc m (keyword (str x)) (inc (m (keyword (str x)) 0))) ) (sorted-map) s)
  )

(defn map-to-string[m]
  (reduce (fn [s x] (str s (apply str x))) "" (seq m))
  )
