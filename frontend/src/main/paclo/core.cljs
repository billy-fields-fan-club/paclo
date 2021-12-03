(ns paclo.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(defonce timer (r/atom (js/Date.)))

(defonce time-updater (js/setInterval
                       #(reset! timer (js/Date.)) 1000))

(defn app []
  [:div
   "Meu objetivo é a conquista"
   [:p (.toTimeString @timer)]])

(defn run []
  (rdom/render [app] (js/document.getElementById "app")))

(run)
