package l4;

import O7.InterfaceC0234g;
import Z5.y;
import d6.InterfaceC0617c;
import java.util.List;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: l4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1024d implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f12261e;

    public /* synthetic */ C1024d(l lVar, int i4) {
        this.f12260d = i4;
        this.f12261e = lVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f12260d) {
            case 0:
                return new C1282a(2, this.f12261e, l.class, "updateItemList", "updateItemList(Ljava/util/List;)V", 4);
            case 1:
                return new C1282a(2, this.f12261e, l.class, "updateActionVisualisation", "updateActionVisualisation(Lcom/buzbuz/smartautoclicker/core/ui/views/itembrief/ItemBriefDescription;)V", 4);
            default:
                return new C1282a(2, this.f12261e, l.class, "updateTutorialModeState", "updateTutorialModeState(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f12260d) {
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
        switch (this.f12260d) {
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
        int i4 = this.f12260d;
        y yVar = y.f7506a;
        l lVar = this.f12261e;
        switch (i4) {
            case 0:
                lVar.g0((List) obj);
                return yVar;
            case 1:
                lVar.S().f1714b.a((P2.a) obj, true);
                return yVar;
            default:
                lVar.c0(!((Boolean) obj).booleanValue());
                return yVar;
        }
    }
}
