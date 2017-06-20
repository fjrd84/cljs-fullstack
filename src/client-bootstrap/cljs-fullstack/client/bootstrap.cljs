(ns cljs-fullstack.client.bootstrap
  (:require [cljs-fullstack.client.core :refer [insert-root-component! load-features!]]))

(enable-console-print!)

(insert-root-component! (.getElementById js/document "features"))
(load-features!)
