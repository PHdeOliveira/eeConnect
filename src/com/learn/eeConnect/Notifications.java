package com.learn.eeConnect;


import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

public class Notifications {

    Context context;

    NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context)
            .setSmallIcon(R.drawable.ee_notification)
            .setContentTitle("Notifications")
            .setContentText("Site has been added!");

}
