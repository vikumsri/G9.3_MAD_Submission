package com.example.affixpaws;

public class ChatListData {
    private int chatImage;
    private String name;
    private  String message;

    public ChatListData(int chatImage_source,String friend_name,String last_message) {
       chatImage =  chatImage_source;
       name=friend_name;
       message=last_message;



    }

    public int getChatImage() {
        return chatImage;
    }

    public String getName() {
        return name;
    }
    public String getMessage(){
        return message;
    }

}
