(ns project_euler.prob20
  (:require [project_euler.core :as euler]))

;What is the sum of the digits of the number 100!?

(defn prob20[num]
  (euler/sumOfDigits (apply * (range (bigint 1) (bigint num))))
  )

(defn prob20a[num]
  (euler/sumOfDigits (apply * (take num (euler/positive-numbers))))
  )
