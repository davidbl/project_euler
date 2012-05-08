(ns project_euler.prob4)

(defn large_factors[num]
  (let [largest (first (filter (fn[x]  (and (> x 100) (< x 999) (zero? (mod num x))) )  (reverse (range 2 (Math/sqrt num)))))]
    (if (number? largest)
      (list largest (/ num largest))
      ()
      )
    )
  )
(defn palindrome? [num]
  (let [str (Integer/toString num)]
      (= str (clojure.string/reverse str))
    )
  )

(defn prob4[max_val]
 (first (map (fn[x] (apply * x)) (filter (fn[x] (and (= (count x) 2) (< (first x) 1000) (< (second x) 1000)))  (map large_factors (filter palindrome? (reverse (range (* max_val max_val))))))) 
        )
  )
