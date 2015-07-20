(ns
  ^{:author sidneyy}
  org.mrseasons.coffeetime.kotlin._06_flow_control.flow)

;;  loop
(defn like-for [counter]
  (loop [ctr counter]
    (println ctr)
    (if (< ctr 10)
      (recur (inc ctr))
      ctr
      )
    )
  )

(like-for 5) ;;  5 6 7 8 9 10

