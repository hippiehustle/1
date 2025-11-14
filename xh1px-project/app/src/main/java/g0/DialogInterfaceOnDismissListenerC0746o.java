package g0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: g0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0746o implements DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f11049d;

    public DialogInterfaceOnDismissListenerC0746o(r rVar) {
        this.f11049d = rVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        r rVar = this.f11049d;
        Dialog dialog = rVar.f11062n0;
        if (dialog != null) {
            rVar.onDismiss(dialog);
        }
    }
}
