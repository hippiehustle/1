package a2;

import O7.Y;
import android.media.projection.MediaProjection;
import android.util.Log;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class j extends MediaProjection.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f7726a;

    public j(Y y4) {
        this.f7726a = y4;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        Log.i("MediaProjectionProxy", "Projection stopped by the user");
        InterfaceC1162a interfaceC1162a = (InterfaceC1162a) this.f7726a.f4115c;
        if (interfaceC1162a != null) {
            interfaceC1162a.a();
        }
    }
}
