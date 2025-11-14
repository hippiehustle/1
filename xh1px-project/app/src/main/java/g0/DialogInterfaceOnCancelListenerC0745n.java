package g0;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: g0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0745n implements DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f11048d;

    public DialogInterfaceOnCancelListenerC0745n(r rVar) {
        this.f11048d = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        r rVar = this.f11048d;
        Dialog dialog = rVar.f11062n0;
        if (dialog != null) {
            rVar.onCancel(dialog);
        }
    }
}
