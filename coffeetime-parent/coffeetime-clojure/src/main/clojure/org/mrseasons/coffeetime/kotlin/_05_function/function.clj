(ns
  ^{:author sidneyy}
  org.mrseasons.coffeetime.kotlin._05_function.function)

;; define function
(defn const-fun1 [y] 1)
(defn ident-fun [y] y)
(defn list-maker-fun [x f]
  (map (fn [z] (let [w z]
                 (list w (f w))
                 )) x))

;; call function
(println (list-maker-fun [2 1 3] ident-fun)) ;;  ((2 2) (1 1) (3 3))

;; anonymouse function
;;  %1 is placeholder
(#(println (nth %1 0)) [2 1 3])

;; closure
(defn adder [n] #(+ n %1))
(def plus2 (adder 2))
(println (plus2 3)) ;;  5