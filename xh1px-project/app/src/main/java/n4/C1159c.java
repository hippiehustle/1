package n4;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: n4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1159c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f12933e;

    public /* synthetic */ C1159c(o oVar, int i4) {
        this.f12932d = i4;
        this.f12933e = oVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f12932d) {
            case 0:
                return new C1282a(2, this.f12933e, o.class, "onConditionEditingStateChanged", "onConditionEditingStateChanged(Z)V", 4);
            default:
                return new C1282a(2, this.f12933e, o.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f12932d) {
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
        switch (this.f12932d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f12932d;
        Z5.y yVar = Z5.y.f7506a;
        o oVar = this.f12933e;
        switch (i4) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    oVar.i();
                } else {
                    oVar.getClass();
                }
                return yVar;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                A4.a aVar = oVar.f12958w;
                if (aVar != null) {
                    X.P((A4.d) aVar.f283h, booleanValue);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
