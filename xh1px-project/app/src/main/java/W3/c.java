package W3;

import O7.InterfaceC0234g;
import android.util.Log;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f6510e;

    public /* synthetic */ c(o oVar, int i4) {
        this.f6509d = i4;
        this.f6510e = oVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f6509d) {
            case 0:
                return new C1282a(2, this.f6510e, o.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f6510e, o.class, "updateValidateInput", "updateValidateInput(Z)V", 4);
            default:
                return new C1282a(2, this.f6510e, o.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f6509d) {
            case 0:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case 1:
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
        switch (this.f6509d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f6509d;
        Z5.y yVar = Z5.y.f7506a;
        o oVar = this.f6510e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                oVar.getClass();
                if (!booleanValue) {
                    Log.e("SystemActionDialog", "Closing SystemAction Dialog because there is no action edited");
                    oVar.i();
                }
                return yVar;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                A4.d dVar = oVar.f6535w;
                if (dVar != null) {
                    A4.c cVar = (A4.c) dVar.f298h;
                    o6.j.b(cVar);
                    E2.b.H(cVar, booleanValue2);
                    E2.b.I(cVar, booleanValue2 ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                A4.d dVar2 = oVar.f6535w;
                if (dVar2 != null) {
                    X.P((A4.d) dVar2.f299i, booleanValue3);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
