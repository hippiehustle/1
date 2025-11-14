package i;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: i.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0866e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f11677a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != -3 && i4 != -2 && i4 != -1) {
            if (i4 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
            return;
        }
        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f11677a.get(), message.what);
    }
}
