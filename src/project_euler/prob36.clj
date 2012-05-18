(ns project_euler.prob36
  (:require [project_euler.core :as euler]))

(defn palindrome_string? [str]
  (= str (clojure.string/reverse str))
  )

(defn both?[x] (and (palindrome_string? (str x))
                          (palindrome_string? (Integer/toString x 2)))
  )

(defn prob36a[maxVal]
  (apply + (filter both? (range 1 maxVal)))
  )

(def prob36b
  (comp
    (partial apply +)
    (partial filter both?)
    (partial range 1)
  ))
