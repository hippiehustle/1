package n;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import i.DialogInterfaceC0869h;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, x {

    /* renamed from: d, reason: collision with root package name */
    public SubMenuC1103E f12663d;

    /* renamed from: e, reason: collision with root package name */
    public DialogInterfaceC0869h f12664e;

    /* renamed from: f, reason: collision with root package name */
    public i f12665f;

    @Override // n.x
    public final void a(m mVar, boolean z8) {
        DialogInterfaceC0869h dialogInterfaceC0869h;
        if ((z8 || mVar == this.f12663d) && (dialogInterfaceC0869h = this.f12664e) != null) {
            dialogInterfaceC0869h.dismiss();
        }
    }

    @Override // n.x
    public final boolean h(m mVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        SubMenuC1103E subMenuC1103E = this.f12663d;
        i iVar = this.f12665f;
        if (iVar.f12633i == null) {
            iVar.f12633i = new h(iVar);
        }
        subMenuC1103E.q(iVar.f12633i.getItem(i4), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f12665f.a(this.f12663d, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1103E subMenuC1103E = this.f12663d;
        if (i4 == 82 || i4 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f12664e.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f12664e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1103E.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1103E.performShortcut(i4, keyEvent, 0);
    }
}
