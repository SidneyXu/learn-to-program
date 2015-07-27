(ns
  ^{:author sidneyy}
  org.mrseasons.coffeetime.kotlin._23_java.java)

;;  method
(defn lenStr [x] (.length (.toString x)))

;;  static method
(println (System/getProperty "java.vm.version"))

;;  static variable
(println (Boolean/TRUE))

;;  import
(import '(java.util.concurrent CountDownLatch LinkedBlockingQueue))

;;  create object
(def cdl (new CountDownLatch 2))
(def lbq (LinkedBlockingQueue.))