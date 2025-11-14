package J5;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class e implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W0.d f2500a;

    public e(W0.d dVar) {
        this.f2500a = dVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        W0.d dVar = this.f2500a;
        if (message.obj == null) {
            synchronized (dVar.f6489e) {
                throw null;
            }
        }
        throw new ClassCastException();
    }
}
