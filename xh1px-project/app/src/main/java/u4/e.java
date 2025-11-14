package u4;

import O7.InterfaceC0234g;
import Z5.y;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d6.InterfaceC0617c;
import java.util.List;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f15327e;

    public /* synthetic */ e(k kVar, int i4) {
        this.f15326d = i4;
        this.f15327e = kVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f15326d) {
            case 0:
                return new C1282a(2, this.f15327e, k.class, "updateCopyButtonVisibility", "updateCopyButtonVisibility(Z)V", 4);
            default:
                return new C1282a(2, this.f15327e, k.class, "updateEventList", "updateEventList(Ljava/util/List;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f15326d) {
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
        switch (this.f15326d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f15326d;
        y yVar = y.f7506a;
        k kVar = this.f15327e;
        switch (i4) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                FloatingActionButton floatingActionButton = (FloatingActionButton) kVar.i().G().f292f;
                if (booleanValue) {
                    floatingActionButton.f(true);
                } else {
                    floatingActionButton.d(true);
                }
                return yVar;
            default:
                List list = (List) obj;
                p1 p1Var = kVar.f15340n;
                if (p1Var != null) {
                    E2.c.G0(p1Var, list);
                    C1633b c1633b = kVar.f15341o;
                    if (c1633b != null) {
                        c1633b.h(list);
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
