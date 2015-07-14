(ns
  ^{:author sidneyy}
  org.mrseasons.coffeetime.kotlin._04_operator.operator)

(def list-int '(1 2 3 4))
(def vect-int (vec list-int))
(println (= vect-int list-int)) ;;  true
(println (identical? vect-int list-int)) ;;  false