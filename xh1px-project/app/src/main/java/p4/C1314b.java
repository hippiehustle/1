package p4;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: p4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1314b implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f13743e;

    public /* synthetic */ C1314b(p pVar, int i4) {
        this.f13742d = i4;
        this.f13743e = pVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f13742d) {
            case 0:
                return new C1282a(2, this.f13743e, p.class, "onConditionEditingStateChanged", "onConditionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f13743e, p.class, "updateDuration", "updateDuration(Ljava/lang/String;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f13743e, p.class, "updateIsResetField", "updateIsResetField(Z)V", 4);
            default:
                return new C1282a(2, this.f13743e, p.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f13742d) {
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
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
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
        switch (this.f13742d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f13742d;
        Z5.y yVar = Z5.y.f7506a;
        p pVar = this.f13743e;
        switch (i4) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    pVar.i();
                } else {
                    pVar.getClass();
                }
                return yVar;
            case 1:
                String str = (String) obj;
                F3.a aVar = pVar.f13772w;
                if (aVar != null) {
                    A.i iVar = (A.i) aVar.f1305f;
                    o6.j.d(iVar, "editDurationLayout");
                    E2.c.y0(iVar, str, 2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                F3.a aVar2 = pVar.f13772w;
                if (aVar2 != null) {
                    A4.c cVar = (A4.c) aVar2.f1306g;
                    o6.j.b(cVar);
                    E2.b.H(cVar, booleanValue);
                    E2.b.I(cVar, booleanValue ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                F3.a aVar3 = pVar.f13772w;
                if (aVar3 != null) {
                    X.P((A4.d) aVar3.f1308i, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
