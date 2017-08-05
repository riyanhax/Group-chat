package com.codingblocks.groupchat.realm.RealmModels;

import io.realm.RealmObject;

/**
 * Created by piyush on 5/8/17.
 */

public class RGroup extends RealmObject{
    private String groupID;
    private String firebaseUserID;
    private String message;
    private String timeStamp;


    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getFirebaseUserID() {
        return firebaseUserID;
    }

    public void setFirebaseUserID(String firebaseUserID) {
        this.firebaseUserID = firebaseUserID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
