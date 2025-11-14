package v2;

import Z5.y;
import android.os.PowerManager;
import android.util.Log;
import n6.InterfaceC1164c;
import o6.C1282a;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1662b extends C1282a implements InterfaceC1164c {
    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PowerManager.WakeLock wakeLock = ((h) this.f13621d).f15505e;
        Log.i("DetectionRepository", "updateWakeLockState: keepScreenOn=" + booleanValue);
        if (booleanValue) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
        return y.f7506a;
    }
}
