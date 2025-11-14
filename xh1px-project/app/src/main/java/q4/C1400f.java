package q4;

import O7.InterfaceC0234g;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.divider.MaterialDivider;
import d6.InterfaceC0617c;
import java.util.HashSet;
import java.util.List;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: q4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1400f implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1419y f14102e;

    public /* synthetic */ C1400f(C1419y c1419y, int i4) {
        this.f14101d = i4;
        this.f14102e = c1419y;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f14101d) {
            case 0:
                return new C1282a(2, this.f14102e, C1419y.class, "onEventEditingStateChanged", "onEventEditingStateChanged(Z)V", 4);
            case 1:
                return new C1282a(2, this.f14102e, C1419y.class, "updateSaveButton", "updateSaveButton(Z)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f14102e, C1419y.class, "updateImageConditionsField", "updateImageConditionsField(Ljava/util/List;)V", 4);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return new C1282a(2, this.f14102e, C1419y.class, "updateConditionOperator", "updateConditionOperator(I)V", 4);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return new C1282a(2, this.f14102e, C1419y.class, "updateEnabledOnStart", "updateEnabledOnStart(Z)V", 4);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return new C1282a(2, this.f14102e, C1419y.class, "updateKeepDetecting", "updateKeepDetecting(Z)V", 4);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C1282a(2, this.f14102e, C1419y.class, "updateImageEventSpecificViewsVisibility", "updateImageEventSpecificViewsVisibility(Z)V", 4);
            default:
                return new C1282a(2, this.f14102e, C1419y.class, "updateTryFieldEnabledState", "updateTryFieldEnabledState(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f14101d) {
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
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if ((obj instanceof InterfaceC0234g) && (obj instanceof InterfaceC1288g)) {
                    return a().equals(((InterfaceC1288g) obj).a());
                }
                return false;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
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
        switch (this.f14101d) {
            case 0:
                return a().hashCode();
            case 1:
                return a().hashCode();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return a().hashCode();
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return a().hashCode();
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return a().hashCode();
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return a().hashCode();
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4;
        int i8;
        int i9;
        int i10 = this.f14101d;
        int i11 = 0;
        Integer num = null;
        Z5.y yVar = Z5.y.f7506a;
        C1419y c1419y = this.f14102e;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c1419y.getClass();
                if (!booleanValue) {
                    Log.e("EventDialog", "Closing EventDialog because there is no event edited");
                    c1419y.i();
                }
                return yVar;
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                F3.f fVar = c1419y.f14143y;
                if (fVar != null) {
                    X.P((A4.d) fVar.f1342p, booleanValue2);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj;
                F3.f fVar2 = c1419y.f14143y;
                if (fVar2 != null) {
                    A4.a aVar = (A4.a) fVar2.f1337i;
                    o6.j.d(aVar, "fieldImageConditionsSelector");
                    X.S(aVar, list);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                int intValue = ((Number) obj).intValue();
                F3.f fVar3 = c1419y.f14143y;
                if (fVar3 != null) {
                    A4.c cVar = (A4.c) fVar3.k;
                    if (intValue != 1) {
                        i11 = 1;
                    }
                    A4.c cVar2 = (A4.c) cVar.f292f;
                    MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) cVar2.f291e;
                    if (i11 == 0) {
                        num = Integer.valueOf(((MaterialButton) cVar2.f292f).getId());
                    } else if (i11 == 1) {
                        num = Integer.valueOf(((MaterialButton) cVar2.f293g).getId());
                    }
                    if (i11 != materialButtonToggleGroup.getCheckedButtonId()) {
                        if (num == null) {
                            materialButtonToggleGroup.d(new HashSet());
                        } else {
                            materialButtonToggleGroup.b(num.intValue(), true);
                        }
                    }
                    X.R((A4.c) cVar.f293g, i11);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                F3.f fVar4 = c1419y.f14143y;
                if (fVar4 != null) {
                    A4.c cVar3 = (A4.c) fVar4.f1339m;
                    o6.j.b(cVar3);
                    E2.b.H(cVar3, booleanValue3);
                    E2.b.I(cVar3, booleanValue3 ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                F3.f fVar5 = c1419y.f14143y;
                if (fVar5 != null) {
                    A4.c cVar4 = (A4.c) fVar5.f1340n;
                    o6.j.b(cVar4);
                    E2.b.H(cVar4, booleanValue4);
                    E2.b.I(cVar4, booleanValue4 ? 1 : 0);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                boolean booleanValue5 = ((Boolean) obj).booleanValue();
                F3.f fVar6 = c1419y.f14143y;
                if (fVar6 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) ((A4.c) fVar6.f1340n).f291e;
                    if (booleanValue5) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    constraintLayout.setVisibility(i4);
                    MaterialDivider materialDivider = (MaterialDivider) fVar6.f1334f;
                    if (booleanValue5) {
                        i8 = 0;
                    } else {
                        i8 = 8;
                    }
                    materialDivider.setVisibility(i8);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ((A4.c) fVar6.f1341o).f291e;
                    if (booleanValue5) {
                        i9 = 0;
                    } else {
                        i9 = 8;
                    }
                    constraintLayout2.setVisibility(i9);
                    MaterialDivider materialDivider2 = (MaterialDivider) fVar6.f1335g;
                    if (!booleanValue5) {
                        i11 = 8;
                    }
                    materialDivider2.setVisibility(i11);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                F3.f fVar7 = c1419y.f14143y;
                if (fVar7 != null) {
                    A4.c cVar5 = (A4.c) fVar7.f1341o;
                    o6.j.d(cVar5, "fieldTestEvent");
                    E2.c.q0(cVar5, booleanValue6);
                    return yVar;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
