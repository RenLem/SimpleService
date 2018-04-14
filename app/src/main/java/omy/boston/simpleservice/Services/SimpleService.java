package omy.boston.simpleservice.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class SimpleService extends Service {

    private boolean serviceOn = false;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (!serviceOn){
            Toast.makeText(this, "Servis pokrenut!", Toast.LENGTH_SHORT).show();
            serviceOn = true;
        }else{
            Toast.makeText(this, "Servis već radi!", Toast.LENGTH_SHORT).show();
        }
        return START_STICKY;
    }

    public SimpleService() {
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "Servis je zaustavljen!", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
//        throw new UnsupportedOperationException("Not yet implemented"); --Kad nema BINDA null!
        return null;
    }
}
