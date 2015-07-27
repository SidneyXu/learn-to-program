(ns
  ^{:author sidneyy}
  org.mrseasons.coffeetime.kotlin._09_container.seq)

;;  seq
(def s1 (seq '(1 2 3)))
(println s1) ;;  (1 2 3)

(def s2 (seq [1 2 3]))
(println s2) ;;  (1 2 3)

;;  first
(println (first s1)) ;;  1
(println (first s2)) ;;  1

;;  empty seq
(println (seq ())) ;;  nil
(println (seq [])) ;;  nil

;;  rest
(println (rest '(1 2 3))) ;;  (2 3)
(println (rest [1 2 3])) ;;  (2 3)

;;  is seq
(println (seq? '(1 2 3))) ;;  true
(println (seq? s1)) ;;  true
(println (seq? s2)) ;;  true

;;  cons
(println (cons 5 [1 2])) ;;  (5 1 2)

;;  every
(defn lt5 [x] (< x 5))
(println (every? lt5 [1 2 3 4])) ;;  true
(println (every? lt5 [1 5 3 4])) ;;  false


;;  lazy seq
(defn next-big-n [n] (let [new-val (+ 1 n)]
                       (lazy-seq
                         (cons new-val (next-big-n new-val))
                         )
                       ))

(defn natural-k [k]
  (concat [k] (next-big-n k))
  )

(take 10 (natural-k 3))


;;  vararguments function, like overload
(defn const-fun
  ([] 1)
  ([x] 2)
  ([x & more] 3)
  )
(println (const-fun)) ;;  1
(println (const-fun [])) ;;  2
(println (const-fun [1])) ;;  2
(println (const-fun [1 2])) ;;  2
(println (const-fun [1] [2])) ;;  3