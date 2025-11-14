package K3;

import O7.InterfaceC0234g;
import d6.InterfaceC0617c;
import java.util.List;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: K3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0097k implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f2692e;

    public /* synthetic */ C0097k(s sVar, int i4) {
        this.f2691d = i4;
        this.f2692e = sVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f2691d) {
            case 0:
                return new C1282a(2, this.f2692e, s.class, "updateRecordingState", "updateRecordingState(Z)V", 4);
            case 1:
                return new C1282a(2, this.f2692e, s.class, "updateItemList", "updateItemList(Ljava/util/List;)V", 4);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1282a(2, this.f2692e, s.class, "updateActionVisualisation", "updateActionVisualisation(Lcom/buzbuz/smartautoclicker/core/ui/views/itembrief/ItemBriefDescription;)V", 4);
            default:
                return new C1282a(2, this.f2692e, s.class, "updateTutorialModeState", "updateTutorialModeState(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f2691d) {
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
        switch (this.f2691d) {
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
        int i4 = this.f2691d;
        Z5.y yVar = Z5.y.f7506a;
        s sVar = this.f2692e;
        switch (i4) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    F3.k kVar = sVar.f2708R;
                    if (kVar != null) {
                        sVar.O(kVar.f1364g, true, false);
                        F3.k kVar2 = sVar.f2708R;
                        if (kVar2 != null) {
                            sVar.O(kVar2.f1363f, false, false);
                            F3.k kVar3 = sVar.f2708R;
                            if (kVar3 != null) {
                                sVar.O(kVar3.f1365h, false, false);
                                F3.k kVar4 = sVar.f2708R;
                                if (kVar4 != null) {
                                    sVar.O(kVar4.f1366i, true, false);
                                    F3.k kVar5 = sVar.f2708R;
                                    if (kVar5 != null) {
                                        sVar.O(kVar5.j, false, false);
                                    } else {
                                        o6.j.i("viewBinding");
                                        throw null;
                                    }
                                } else {
                                    o6.j.i("viewBinding");
                                    throw null;
                                }
                            } else {
                                o6.j.i("viewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                } else {
                    F3.k kVar6 = sVar.f2708R;
                    if (kVar6 != null) {
                        sVar.O(kVar6.f1364g, true, false);
                        F3.k kVar7 = sVar.f2708R;
                        if (kVar7 != null) {
                            sVar.O(kVar7.f1363f, true, false);
                            F3.k kVar8 = sVar.f2708R;
                            if (kVar8 != null) {
                                sVar.O(kVar8.f1365h, true, false);
                                F3.k kVar9 = sVar.f2708R;
                                if (kVar9 != null) {
                                    sVar.O(kVar9.f1366i, true, false);
                                    F3.k kVar10 = sVar.f2708R;
                                    if (kVar10 != null) {
                                        sVar.O(kVar10.j, true, false);
                                    } else {
                                        o6.j.i("viewBinding");
                                        throw null;
                                    }
                                } else {
                                    o6.j.i("viewBinding");
                                    throw null;
                                }
                            } else {
                                o6.j.i("viewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("viewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("viewBinding");
                        throw null;
                    }
                }
                return yVar;
            case 1:
                sVar.g0((List) obj);
                return yVar;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                sVar.S().f1714b.a((P2.a) obj, true);
                return yVar;
            default:
                sVar.c0(!((Boolean) obj).booleanValue());
                return yVar;
        }
    }
}
