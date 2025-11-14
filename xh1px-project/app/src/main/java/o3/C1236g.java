package o3;

import O7.InterfaceC0234g;
import Z5.y;
import d6.InterfaceC0617c;
import java.util.List;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: o3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1236g implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1243n f13453e;

    public /* synthetic */ C1236g(C1243n c1243n, int i4) {
        this.f13452d = i4;
        this.f13453e = c1243n;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f13452d) {
            case 0:
                return new C1282a(2, this.f13453e, C1243n.class, "updateRecordingState", "updateRecordingState(Z)V", 4);
            case 1:
                return new C1282a(2, this.f13453e, C1243n.class, "updateItemList", "updateItemList(Ljava/util/List;)V", 4);
            default:
                return new C1282a(2, this.f13453e, C1243n.class, "updateDumbActionVisualisation", "updateDumbActionVisualisation(Lcom/buzbuz/smartautoclicker/core/ui/views/itembrief/ItemBriefDescription;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f13452d) {
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
        switch (this.f13452d) {
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
        int i4 = this.f13452d;
        y yVar = y.f7506a;
        C1243n c1243n = this.f13453e;
        switch (i4) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    F3.k kVar = c1243n.f13468S;
                    if (kVar != null) {
                        c1243n.O(kVar.f1364g, true, false);
                        F3.k kVar2 = c1243n.f13468S;
                        if (kVar2 != null) {
                            c1243n.O(kVar2.f1363f, false, false);
                            F3.k kVar3 = c1243n.f13468S;
                            if (kVar3 != null) {
                                c1243n.O(kVar3.f1365h, false, false);
                                F3.k kVar4 = c1243n.f13468S;
                                if (kVar4 != null) {
                                    c1243n.O(kVar4.f1366i, true, false);
                                    F3.k kVar5 = c1243n.f13468S;
                                    if (kVar5 != null) {
                                        c1243n.O(kVar5.j, false, false);
                                    } else {
                                        o6.j.i("menuViewBinding");
                                        throw null;
                                    }
                                } else {
                                    o6.j.i("menuViewBinding");
                                    throw null;
                                }
                            } else {
                                o6.j.i("menuViewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("menuViewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("menuViewBinding");
                        throw null;
                    }
                } else {
                    F3.k kVar6 = c1243n.f13468S;
                    if (kVar6 != null) {
                        c1243n.O(kVar6.f1364g, true, false);
                        F3.k kVar7 = c1243n.f13468S;
                        if (kVar7 != null) {
                            c1243n.O(kVar7.f1363f, true, false);
                            F3.k kVar8 = c1243n.f13468S;
                            if (kVar8 != null) {
                                c1243n.O(kVar8.f1365h, true, false);
                                F3.k kVar9 = c1243n.f13468S;
                                if (kVar9 != null) {
                                    c1243n.O(kVar9.f1366i, true, false);
                                    F3.k kVar10 = c1243n.f13468S;
                                    if (kVar10 != null) {
                                        c1243n.O(kVar10.j, true, false);
                                    } else {
                                        o6.j.i("menuViewBinding");
                                        throw null;
                                    }
                                } else {
                                    o6.j.i("menuViewBinding");
                                    throw null;
                                }
                            } else {
                                o6.j.i("menuViewBinding");
                                throw null;
                            }
                        } else {
                            o6.j.i("menuViewBinding");
                            throw null;
                        }
                    } else {
                        o6.j.i("menuViewBinding");
                        throw null;
                    }
                }
                return yVar;
            case 1:
                c1243n.g0((List) obj);
                return yVar;
            default:
                c1243n.S().f1714b.a((P2.a) obj, true);
                return yVar;
        }
    }
}
