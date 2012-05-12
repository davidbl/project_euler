(ns project_euler.prob16
  (:require [project_euler.core :as euler]))

;What is the sum of the digits of the number 2**1000?

(defn prob16[exp]
  (euler/sumOfDigits (apply * (repeat exp (bigint 2))))
  )
