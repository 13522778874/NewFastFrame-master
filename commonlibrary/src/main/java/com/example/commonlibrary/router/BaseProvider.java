package com.example.commonlibrary.router;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BaseProvider
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public class BaseProvider {
    private Map<String,BaseAction> actionMap=new HashMap<>();


    private String name;

    public BaseProvider(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void putAction(String actionName, BaseAction baseAction){
        if (actionMap == null) {
            actionMap=new HashMap<>();
        }
        actionMap.put(actionName, baseAction);
    }




    public void removeAll(){
        if (actionMap != null) {
            actionMap.clear();
        }
    }




    public BaseAction getAction(String actionName){
        if (actionMap != null) {
            return actionMap.get(actionName);
        }
        return null;
    }



    public void removeAction(String actionName){
        if (actionName != null && actionMap != null && actionMap.containsKey(actionName)) {
            actionMap.remove(actionName);
        }
    }

}
