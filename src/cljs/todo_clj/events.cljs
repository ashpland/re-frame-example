(ns todo-clj.events
  (:require
   [re-frame.core :as re-frame]
   [todo-clj.db :as db]))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))

(re-frame/reg-event-db
 :update-input
 (fn [db [_ input-string]]
   (assoc db :input-text (str input-string))))

