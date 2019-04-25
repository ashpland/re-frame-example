(ns todo-clj.core
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [todo-clj.events :as events]
   [todo-clj.views :as views]
   [todo-clj.config :as config]))


(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/App]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
