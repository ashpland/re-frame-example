(ns todo-clj.views
  (:require
   [re-frame.core :as re-frame]
   [todo-clj.subs :as subs]
   [reagent.core :as rg]))

(defn App []
  (let [name (re-frame/subscribe [::subs/name])
        *andrew (re-frame/subscribe [:foo])
        *input (re-frame/subscribe [:texty-text])]
    (fn []
      [:div
       [:h1 "Hello from " @*input " " @*andrew]
       [:div
        [:input {:on-change #(re-frame/dispatch [:update-input (.-value (.-target %))])}]]])))

