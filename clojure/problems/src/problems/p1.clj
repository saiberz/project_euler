(ns problems.p1)

(def p1
  "First problem"  
  (let [y 1000
        s (filter #(= (* (mod % 5) (mod % 3)) 0) (range 1 y))
        sol (reduce + s)
        ]    
    (println sol)))

;> 233168




