(ns mapmap.core)

(defn mapmap
  "Applies map f to args, filters out nils and returns the result as a map.
  f should return a two element vector or nil."
  [f & args]
  (->> (apply map f args)
       (remove nil?)
       (into {})))

(defn pmapmap
  "Applies pmap f to args, filters out nils and returns the result as a map.
  f should return a two element vector or nil."
  [f & args]
  (->> (apply pmap f args)
       (remove nil?)
       (into {})))
