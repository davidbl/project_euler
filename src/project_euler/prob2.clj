(ns project_euler.prob2)

; By considering the terms in the Fibonacci sequence whose values
; do not exceed four million, find the sum of the even-valued terms

(defn cons_fib[fibs] (cons (+ (first fibs) (second fibs)) fibs))

(defn calc_fibs[ max_val]
  (loop [fib_list (list 2 1)]
    (if (< (first fib_list) max_val)
      (recur (cons_fib fib_list))
      (rest fib_list)
      )
  )
)

(defn prob2 [max_val]
  (apply + (filter even? (calc_fibs max_val)))
  )

