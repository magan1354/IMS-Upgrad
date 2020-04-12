package com.ims.data;

import com.ims.actor.SystemUser;

public class SystemUserHolder {

    private static SystemUser[] users = new SystemUser[10000];
    private static int pos=0;

    public static SystemUser save(SystemUser user) {
        //Generate ID for the systemuser
        user.setId(pos);
        // Store the user
        users[pos]=user;
        // Increment the pos
        pos = pos +1;
        //return order
        return user;
    }

    public static SystemUser fetchById(Integer id) {
        if(id>users.length || id<0) {
            return null;
        }
        return users[id];
    }

}