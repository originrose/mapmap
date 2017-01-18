(ns mapmap.core-test
  (:require [clojure.test :refer :all]
            [mapmap.core :refer [mapmap]]))

(deftest mapmap-test
  (let [m1 {:a 1 :b 2 :c 3}
        m2 (mapmap (fn [[k v]]
                     (if (<= v 2)
                       [k (inc v)]))
                   m1)]
    (is (map? m2))
    (is (= 2 (count m2)))
    (is (= 2 (:a m2)))
    (is (= 3 (:b m2)))))
