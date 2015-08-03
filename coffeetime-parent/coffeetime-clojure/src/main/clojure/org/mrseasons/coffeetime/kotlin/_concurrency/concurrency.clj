(ns
  ^{:author sidneyy}
  org.mrseasons.coffeetime.kotlin._concurrency.concurrency)

(def simple-future (
                     future (do
                              (println "Line 0")
                              (Thread/sleep 3000)
                              (println "Line 1")
                              (Thread/sleep 3000)
                              (println "Line 2")
                              )
                     ))

;  check status, no blocking
(println (future-done? simple-future)) ; false

;  blocking
(println @simple-future) ; nil, wait until Line 2 is finished


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;(defn wait-with-for [limit]
;  (let [counter 1])
;  (loop [ctr counter]
;    (Thread/sleep 500)
;    (println (str "Ctr=" ctr))
;    (if (< ctr limit)
;      (recur (inc ctr))
;      ctr
;      )
;    )
;  )
;
;(defn wait-1 [] (wait-with-for 1))
;(defn wait-2 [] (wait-with-for 2))
;(defn wait-3 [] (wait-with-for 3))
;
;(def wait-seq (pcalls wait-1 wait2 wait-3))
;
;(first wait-seq)
;(first (next wait-seq))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn make-new-acc [account-name opening-balance]
  (ref {:name account-name :bal opening-balance})
  )
(defn alter-acc [acc new-name new-balance]
  (assoc acc :bal new-balance :name new-name)
  )
(defn loop-and-debit [account]
  (loop [acc account]
    (let [balance (:bal @acc)
          my-name (:name @acc)]
      (Thread/sleep 1)
      (if (> balance 0)
        (recur (dosync (alter acc alter-acc my-name (dec balance)) acc))
        acc
        )
      )
    )
  )

(def my-acc (make-new-acc "Ben" 5000))

(defn my-loop [] (let [the-acc my-acc]
                   (loop-and-debit the-acc)
                   ))
(pcalls my-loop my-loop my-loop my-loop my-loop)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;
;(defn wait-and-log [coll str-to-add]
;  (do (Thread/sleep 10000)
;    (let [my-coll (conj coll str-to-add)]
;      (Thread/sleep 10000)
;      (conj my-coll str-to-add)
;      )
;    )
;  )
;
;(def str-coll (agent []))
;
;(send str-coll wait-and-log "foo")
;
;@str-coll