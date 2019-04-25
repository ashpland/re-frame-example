(ns todo-clj.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::name
 (fn [db]
   (:name db)))

(re-frame/reg-sub
 :foo
 (fn [db]
   (:andrew/name db)))

(re-frame/reg-sub
 :texty-text
 (fn [db]
   (:input-text db)))
