package androidx.room;

import Z.g;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import o6.j;
import u0.BinderC1618i;
import u0.RemoteCallbackListC1619j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: d, reason: collision with root package name */
    public int f9003d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f9004e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final RemoteCallbackListC1619j f9005f = new RemoteCallbackListC1619j(this);

    /* renamed from: g, reason: collision with root package name */
    public final BinderC1618i f9006g = new BinderC1618i(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j.e(intent, "intent");
        return this.f9006g;
    }
}
