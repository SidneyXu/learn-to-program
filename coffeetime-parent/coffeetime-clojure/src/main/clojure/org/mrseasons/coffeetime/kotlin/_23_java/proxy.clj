(ns
  ^{:author sidneyy}
  org.mrseasons.coffeetime.kotlin._23_java.proxy
  (:import [org.mrseasons.coffeetime.kotlin._23_java JavaBean]))

;(import '(java.util.concurrent CountDownLatch LinkedBlockingQueue))
;
;(def cdl (new CountDownLatch 2))
;(def lbq (LinkedBlockingQueue.))
;
;(def msgRdr (proxy [Runnable] []
;              (run [] (.toString (.poll lbq)))
;              ))



(def peter (JavaBean.))
(.setName peter "Peter")
(.hello peter) ;;  hello,my name is Peter

(def jane (new JavaBean "Jane"))
(.hello jane) ;;  hello,my name is Jane

(def info (proxy [JavaBean] []
            (hello [] "A"))
            )
(info [peter])
;(def info (proxy [Runnable] []
;  (run [] ("abc")))
;  )
;(def r (new Runnable [] (defn run [] (println "running"))))