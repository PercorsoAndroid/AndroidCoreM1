package com.example.androidcore.permissions

import android.Manifest
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import com.example.androidcore.R

class PermissionsActivity : AppCompatActivity() {

    val REQUEST_ID_MULTIPLE_PERMISSIONS: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions)

        var permissionsNeeded: ArrayList<String> = ArrayList<String>();

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED)
            permissionsNeeded.add(Manifest.permission.INTERNET);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_SMS) != PackageManager.PERMISSION_GRANTED)
            permissionsNeeded.add(Manifest.permission.READ_SMS);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED)
            permissionsNeeded.add(Manifest.permission.READ_CONTACTS);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
            permissionsNeeded.add(Manifest.permission.CAMERA);

        if (!permissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(this, permissionsNeeded.toArray(arrayOfNulls<String>(permissionsNeeded.size)), REQUEST_ID_MULTIPLE_PERMISSIONS);
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int,  permissions: Array<String>, grantResults: IntArray) {
        when (requestCode) {
            REQUEST_ID_MULTIPLE_PERMISSIONS -> {
                if (grantResults.isNotEmpty()) {
                    for (index in 0 until permissions.size) {
                        if (grantResults[index] == PackageManager.PERMISSION_GRANTED) {
                            //can do operation
                        } else {
                            //cannot do operation
                        }
                    }
                }
            }
            else -> {
                //case not handled
            }
        }
    }
}
