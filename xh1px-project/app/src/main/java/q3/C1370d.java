package q3;

import O7.InterfaceC0234g;
import Z5.y;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import d6.InterfaceC0617c;
import java.util.List;
import o.p1;
import o6.C1282a;
import o6.InterfaceC1288g;

/* renamed from: q3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1370d implements InterfaceC0234g, InterfaceC1288g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f13983e;

    public /* synthetic */ C1370d(j jVar, int i4) {
        this.f13982d = i4;
        this.f13983e = jVar;
    }

    @Override // o6.InterfaceC1288g
    public final Z5.d a() {
        switch (this.f13982d) {
            case 0:
                return new C1282a(2, this.f13983e, j.class, "updateDumbActionList", "updateDumbActionList(Ljava/util/List;)V", 4);
            default:
                return new C1282a(2, this.f13983e, j.class, "updateCopyButtonState", "updateCopyButtonState(Z)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f13982d) {
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
        switch (this.f13982d) {
            case 0:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        int i4 = this.f13982d;
        y yVar = y.f7506a;
        j jVar = this.f13983e;
        switch (i4) {
            case 0:
                List list = (List) obj;
                p1 p1Var = jVar.f13995m;
                if (p1Var != null) {
                    E2.c.G0(p1Var, list);
                    C1368b c1368b = jVar.f13996n;
                    if (c1368b != null) {
                        c1368b.h(list);
                        return yVar;
                    }
                    o6.j.i("dumbActionsAdapter");
                    throw null;
                }
                o6.j.i("viewBinding");
                throw null;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                FloatingActionButton floatingActionButton = (FloatingActionButton) jVar.i().G().f292f;
                if (booleanValue) {
                    floatingActionButton.f(true);
                } else {
                    floatingActionButton.d(true);
                }
                return yVar;
        }
    }
}
