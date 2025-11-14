package L3;

import O7.InterfaceC0234g;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import d6.InterfaceC0617c;
import o6.C1282a;
import o6.InterfaceC1288g;
import q4.X;

/* renamed from: L3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0102d implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f2847e;

    public /* synthetic */ C0102d(w wVar, int i4) {
        this.f2846d = i4;
        this.f2847e = wVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f2846d) {
            case 0:
                return new C1282a(2, this.f2847e, w.class, "onActionEditingStateChanged", "onActionEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f2847e, w.class, "updateOperationValueVisibility", "updateOperationValueVisibility(Z)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f2847e, w.class, "updateNumberValue", "updateNumberValue(Ljava/lang/String;)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f2847e, w.class, "updateCounterValue", "updateCounterValue(Ljava/lang/String;)V", 4);
            default:
                return new C1282a(2, this.f2847e, w.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f2846d) {
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
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
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
        switch (this.f2846d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f2846d;
        Z5.y yVar = Z5.y.f7506a;
        w wVar = this.f2847e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                wVar.getClass();
                if (!booleanValue) {
                    Log.e("ChangeCounterDialog", "Closing ChangeCounterDialog because there is no action edited");
                    wVar.i();
                }
                return yVar;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                F3.b bVar = wVar.f2886w;
                if (bVar != null) {
                    A4.a aVar = bVar.f1315l;
                    A.i iVar = bVar.f1314i;
                    A4.a aVar2 = bVar.f1313h;
                    if (booleanValue2) {
                        ((ConstraintLayout) aVar2.f280e).setVisibility(8);
                        ((TextInputLayout) iVar.f88e).setVisibility(0);
                        o6.j.d(aVar, "valueTypeMultiStateButton");
                        E2.c.n0(aVar, 0);
                    } else {
                        ((ConstraintLayout) aVar2.f280e).setVisibility(0);
                        ((TextInputLayout) iVar.f88e).setVisibility(8);
                        o6.j.d(aVar, "valueTypeMultiStateButton");
                        E2.c.n0(aVar, 1);
                    }
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                String str = (String) obj;
                F3.b bVar2 = wVar.f2886w;
                if (bVar2 != null) {
                    A.i iVar2 = bVar2.f1314i;
                    o6.j.d(iVar2, "editValueLayout");
                    E2.c.y0(iVar2, str, 2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                String str2 = (String) obj;
                F3.b bVar3 = wVar.f2886w;
                if (bVar3 != null) {
                    A4.a aVar3 = bVar3.f1313h;
                    o6.j.d(aVar3, "editValueCounterName");
                    E2.d.O(aVar3, str2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                F3.b bVar4 = wVar.f2886w;
                if (bVar4 != null) {
                    X.P(bVar4.k, booleanValue3);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
