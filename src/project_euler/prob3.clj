(ns project_euler.prob3)

(defn is_prime?[num]
  (and (pos? (rem num 2))
    (zero? (count (filter (fn[x] (zero? (rem num x))) (range 3 (Math/sqrt num) 2))))
   )
  )

(defn factors[num]
  (filter (fn[x] (zero? (mod num x))) (range 2 (Math/sqrt num)))
  )

(defn largest_prime_factor[num]
  (apply max (filter is_prime? (factors num)))
  )

