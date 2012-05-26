(ns project_euler.core)

(defn sumOfDigits[n] (apply + (map #(Integer/parseInt (str %)) (str n))))

(defn positive-numbers
    ([] (positive-numbers (bigint 1)))
    ([n] (lazy-seq (cons n (positive-numbers (inc n))))))

(defn each-cons
     ([org] (each-cons org 2))
     ([org size]
       (loop [res () l org]
         (if (= 1 (count l))
            (if (= (count org) 1) org res)
            (recur (concat res (list (take size l))) (rest l))
           ))))



(defn sieve [n]
  (let [n (int n)]
    "Returns a list of all primes from 2 to n"
    (let [root (int (Math/round (Math/floor (Math/sqrt n))))]
      (loop [i (int 3)
             a (int-array n)
             result (list 2)]
        (if (>= i n)
          (reverse result)
          (recur (+ i (int 2))
                 (if (< i root)
                   (loop [arr a
                          inc (+ i i)
                          j (* i i)]
                     (if (>= j n)
                       arr
                       (recur (do (aset arr j (int 1)) arr)
                              inc
                              (+ j inc))))
                   a)
                 (if (zero? (aget a i))
                   (conj result i)
                   result)))))))

