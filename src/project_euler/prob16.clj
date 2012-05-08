(ns project_euler.prob16)

;What is the sum of the digits of the number 21000?

(defn prob16[exp]
  (apply + (map (fn[s] (Integer/parseInt (str s))) (str (apply * (repeat exp (bigint 2))))))
  
  )
