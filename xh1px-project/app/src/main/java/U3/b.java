package U3;

import O7.InterfaceC0234g;
import android.util.Log;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f6098e;

    public /* synthetic */ b(o oVar, int i4) {
        this.f6097d = i4;
        this.f6098e = oVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f6097d) {
            case 0:
                return new C1282a(2, this.f6098e, o.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f6098e, o.class, "updateClickName", "updateClickName(Ljava/lang/String;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f6098e, o.class, "updatePauseDuration", "updatePauseDuration(Ljava/lang/String;)V", 4);
            default:
                return new C1282a(2, this.f6098e, o.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f6097d) {
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
        switch (this.f6097d) {
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
        int i4 = this.f6097d;
        Z5.y yVar = Z5.y.f7506a;
        o oVar = this.f6098e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                oVar.getClass();
                if (!booleanValue) {
                    Log.e("PauseDialog", "Closing PauseDialog because there is no action edited");
                    oVar.i();
                }
                return yVar;
            case 1:
                String str = (String) obj;
                F3.c cVar = oVar.f6125w;
                if (cVar != null) {
                    E2.c.y0(cVar.f1319g, str, 1);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                String str2 = (String) obj;
                F3.c cVar2 = oVar.f6125w;
                if (cVar2 != null) {
                    A.i iVar = cVar2.f1318f;
                    o6.j.d(iVar, "editPauseDurationLayout");
                    E2.c.y0(iVar, str2, 2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                F3.c cVar3 = oVar.f6125w;
                if (cVar3 != null) {
                    X.P(cVar3.f1320h, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
