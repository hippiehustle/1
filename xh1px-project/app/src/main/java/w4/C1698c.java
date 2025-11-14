package w4;

import O7.InterfaceC0234g;
import Z5.y;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d6.InterfaceC0617c;
import java.util.List;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1698c implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1704i f15691e;

    public /* synthetic */ C1698c(C1704i c1704i, int i4) {
        this.f15690d = i4;
        this.f15691e = c1704i;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f15690d) {
            case 0:
                return new C1282a(2, this.f15691e, C1704i.class, "updateCopyButtonVisibility", "updateCopyButtonVisibility(Z)V", 4);
            default:
                return new C1282a(2, this.f15691e, C1704i.class, "updateTriggerEventList", "updateTriggerEventList(Ljava/util/List;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f15690d) {
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
        switch (this.f15690d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f15690d;
        y yVar = y.f7506a;
        C1704i c1704i = this.f15691e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                FloatingActionButton floatingActionButton = (FloatingActionButton) c1704i.i().G().f292f;
                if (booleanValue) {
                    floatingActionButton.f(true);
                } else {
                    floatingActionButton.d(true);
                }
                return yVar;
            default:
                List list = (List) obj;
                p1 p1Var = c1704i.f15703m;
                if (p1Var != null) {
                    E2.c.G0(p1Var, list);
                    R4.d dVar = c1704i.f15704n;
                    if (dVar != null) {
                        dVar.h(list);
                        return yVar;
                    }
                    o6.j.i("eventAdapter");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
        }
    }
}
