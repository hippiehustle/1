package A1;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements DialogInterface.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f252e;

    public /* synthetic */ i(int i4, Object obj) {
        this.f251d = i4;
        this.f252e = obj;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
        switch (this.f251d) {
            case 0:
                l lVar = (l) this.f252e;
                if (i4 == 4 && keyEvent.getAction() == 1) {
                    lVar.a();
                    return true;
                }
                return false;
            case 1:
                V4.k kVar = (V4.k) this.f252e;
                if (i4 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                kVar.S(false, false);
                return true;
            default:
                z1.b bVar = (z1.b) this.f252e;
                if (i4 == 4 && keyEvent.getAction() == 1) {
                    bVar.a();
                    return true;
                }
                return false;
        }
    }
}
