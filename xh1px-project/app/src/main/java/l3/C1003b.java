package l3;

import O7.InterfaceC0234g;
import Z5.y;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1003b implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1013l f12200e;

    public /* synthetic */ C1003b(C1013l c1013l, int i4) {
        this.f12199d = i4;
        this.f12200e = c1013l;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f12199d) {
            case 0:
                return new C1282a(2, this.f12200e, C1013l.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
            default:
                return new C1282a(2, this.f12200e, C1013l.class, "updateDumbPauseDuration", "updateDumbPauseDuration(Ljava/lang/String;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f12199d) {
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
        switch (this.f12199d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f12199d;
        y yVar = y.f7506a;
        C1013l c1013l = this.f12200e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                F3.c cVar = c1013l.f12224z;
                if (cVar != null) {
                    X.P(cVar.f1320h, booleanValue);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                String str = (String) obj;
                F3.c cVar2 = c1013l.f12224z;
                if (cVar2 != null) {
                    A.i iVar = cVar2.f1319g;
                    o6.j.d(iVar, "editPauseDurationLayout");
                    E2.c.y0(iVar, str, 2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
