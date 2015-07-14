(ns
  ^{:author sidneyy}
  org.mrseasons.coffeetime.kotlin._02_container.container)

;;  list
(def nums '(1 2 3))
(println nums) ;;  (1 2 3)
(println (nth nums 1)) ;;  2

;;  vector
(def vnums1 (vector 1 2 3))
(def vnums2 (vec '(1 2 3)))
(def vnums3 [1 2 3])
(println vnums3) ;;  [1 2 3]
(println (nth vnums3 2)) ;;  3

;;  map
(def foo {"name" "Peter" "age" 18})
(println foo) ;;  {name Peter, age 18}
(println (foo "name")) ;;  Peter
(println (foo name)) ;;  nil

;;  key words
(def martijn {:name "Jane", :city "London"})
(println martijn) ;;  {:name Jane, :city London}
(println (martijn :name)) ;;  Jane
(println (:name martijn)) ;;  Jane
(println :name) ;;  :name

;;  set
(def fruits (set '("pair" "peach" "orange" "pair")))
(println fruits) ;;  #{peach orange pair}
