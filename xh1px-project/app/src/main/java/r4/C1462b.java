package r4;

import Z5.y;
import com.buzbuz.smartautoclicker.R;
import java.util.Iterator;
import k2.AbstractC0951a;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1162a;
import q4.X;

/* renamed from: r4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1462b implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1466f f14380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0951a f14381f;

    public /* synthetic */ C1462b(C1466f c1466f, AbstractC0951a abstractC0951a, int i4) {
        this.f14379d = i4;
        this.f14380e = c1466f;
        this.f14381f = abstractC0951a;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        C0999a c0999a;
        switch (this.f14379d) {
            case 0:
                C1466f c1466f = this.f14380e;
                n nVar = (n) c1466f.f14392x.getValue();
                AbstractC0951a abstractC0951a = this.f14381f;
                o6.j.e(abstractC0951a, "event");
                C1001a g8 = nVar.f14405b.f1950e.g();
                Object obj = null;
                if (g8 != null) {
                    c0999a = g8.f12190a;
                } else {
                    c0999a = null;
                }
                if (!o6.j.a(c0999a, abstractC0951a.l())) {
                    Iterator it = abstractC0951a.g().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            f2.a aVar = (f2.a) next;
                            if ((aVar instanceof f2.o) && !((f2.o) aVar).f10754e) {
                                obj = next;
                            }
                        }
                    }
                    if (obj != null) {
                        X.Y(c1466f.k(), R.string.warning_dialog_message_toggle_action_from_another_scenario, new C1462b(c1466f, abstractC0951a, 1));
                        return y.f7506a;
                    }
                }
                c1466f.a();
                c1466f.f14391w.m(abstractC0951a);
                return y.f7506a;
            default:
                C1466f c1466f2 = this.f14380e;
                c1466f2.a();
                c1466f2.f14391w.m(this.f14381f);
                return y.f7506a;
        }
    }
}
