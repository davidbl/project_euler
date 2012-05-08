(ns project_euler.prob6)

(defn sum_sq[n] (apply + (map (fn[x] (* x x)) (range 1 (+ n 1)))))

(defn sum[n] (apply + (range (+ n 1))))

(defn sq_sum[n] (Math/pow (sum n) 2))

(defn prob6[n] (- (sq_sum n) (sum_sq n)))
