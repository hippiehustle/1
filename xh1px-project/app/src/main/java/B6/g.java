package B6;

import C6.A;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0010k;
import F6.y;
import a6.AbstractC0436k;
import i.AbstractC0862a;
import i7.AbstractC0890e;
import java.util.ArrayList;
import java.util.List;
import n6.InterfaceC1163b;
import t7.C1593c;

/* loaded from: classes.dex */
public final class g implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final g f473e = new g();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f474d = 0;

    public /* synthetic */ g() {
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8 = false;
        switch (this.f474d) {
            case 0:
                A a3 = (A) obj;
                e eVar = h.f475d;
                o6.j.e(a3, "module");
                List list = (List) AbstractC0862a.j(((y) a3.U(h.f477f)).f1611i, y.f1608l[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof C1593c) {
                        arrayList.add(obj2);
                    }
                }
                return (C1593c) AbstractC0436k.p0(arrayList);
            default:
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
                if (interfaceC0002c.e() == 1) {
                    InterfaceC0010k q6 = interfaceC0002c.q();
                    o6.j.c(q6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str = d.f457a;
                    if (d.j.containsKey(AbstractC0890e.g((InterfaceC0004e) q6))) {
                        z8 = true;
                    }
                }
                return Boolean.valueOf(z8);
        }
    }

    public g(r rVar) {
    }
}
