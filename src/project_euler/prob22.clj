(ns project_euler.prob22)

(defn charVal[chr] (- (int chr) 64))
(defn wordVal[word] (apply + (map charVal word)))

(defn nameList[nameFile] (sort (clojure.string/split 
     (clojure.string/replace (slurp nameFile) #"\"" "") #",")))

(defn valueList[myList] (map-indexed (fn[x y] (* (inc x) (wordVal y))) myList))

(defn prob22[nameFile] (apply +  (valueList (nameList nameFile))))
