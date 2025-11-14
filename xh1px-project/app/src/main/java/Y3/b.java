package Y3;

import O7.InterfaceC0234g;
import android.util.Log;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f7117e;

    public /* synthetic */ b(m mVar, int i4) {
        this.f7116d = i4;
        this.f7117e = mVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f7116d) {
            case 0:
                return new C1282a(2, this.f7117e, m.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            default:
                return new C1282a(2, this.f7117e, m.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f7116d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            default:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f7116d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f7116d;
        Z5.y yVar = Z5.y.f7506a;
        m mVar = this.f7117e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mVar.getClass();
                if (!booleanValue) {
                    Log.e("SystemActionDialog", "Closing SystemAction Dialog because there is no action edited");
                    mVar.i();
                }
                return yVar;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                A4.a aVar = mVar.f7140w;
                if (aVar != null) {
                    X.P((A4.d) aVar.f283h, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
