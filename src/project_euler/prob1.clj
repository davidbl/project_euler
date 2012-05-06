(ns project_euler.prob1)

; Find the sum of all the multiples of 3 or 5 below 1000.
(defn filt [x]
  (or (zero? (mod x 3))
      (zero? (mod x 5))
  )
)

(defn prob1 [max]
  (apply + (filter filt (range max))))


(defn prob1a [max]
  (apply + (for [x (range max) :when (or (zero? (mod x 3)) (zero? (mod x 5)))]  x))
  )

(defn prob1b [max my_filt]
  (apply + (filter my_filt (range max))))
