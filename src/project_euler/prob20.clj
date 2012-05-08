(ns project_euler.prob20)

;What is the sum of the digits of the number 21000?

(defn prob20[num]
  (apply + (map (fn[s] (Integer/parseInt (str s))) (str (apply * (range (bigint 1) (bigint num))))))
  
  )
