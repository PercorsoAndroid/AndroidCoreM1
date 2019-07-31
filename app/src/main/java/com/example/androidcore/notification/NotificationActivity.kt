package com.example.androidcore.notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import com.example.androidcore.R
import kotlinx.android.synthetic.main.activity_notification.*

class NotificationActivity : AppCompatActivity() {

    val channelId: String = "android_core_notification_channel";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager;

        var builder = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(resources.getString(R.string.notificationTitle))
            .setContentText(resources.getString(R.string.notificationText))
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .build()

        createNotificationChannel(notificationManager);

        fireNotificationButton.setOnClickListener { view ->
            fireNotification(1, builder, notificationManager);
        }

    }

    private fun createNotificationChannel(notificationManager: NotificationManager){

        val channelName = "my_notification_channel";

        val channel = NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_DEFAULT).apply {
            description = "my_channel_description"
        }

        //Registriamo il canale
        notificationManager.createNotificationChannel(channel);

    }

    private fun fireNotification(notificationId: Int, builder: Notification, notificationManager: NotificationManager) {
        NotificationManagerCompat.from(this).apply {
            notificationManager.notify(notificationId, builder);
        }
    }
}
