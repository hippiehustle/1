package androidx.profileinstaller;

import G5.e;
import H0.b;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import i.RunnableC0872k;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // H0.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // H0.b
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: r0.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler handler;
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                int nextInt = new Random().nextInt(Math.max(1000, 1));
                handler.postDelayed(new RunnableC0872k(applicationContext, 1), nextInt + 5000);
            }
        });
        return new e(26);
    }
}
