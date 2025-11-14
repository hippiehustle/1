package X6;

import C6.InterfaceC0002c;
import C6.InterfaceC0007h;
import F6.w;
import Z5.y;
import f7.C0723c;
import f7.C0725e;
import m7.AbstractC1098d;
import n6.InterfaceC1163b;
import w7.AbstractC1759v;
import w7.W;

/* loaded from: classes.dex */
public final class o implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final o f7025e = new o(0);

    /* renamed from: f, reason: collision with root package name */
    public static final o f7026f = new o(1);

    /* renamed from: g, reason: collision with root package name */
    public static final o f7027g = new o(2);

    /* renamed from: h, reason: collision with root package name */
    public static final o f7028h = new o(3);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7029d;

    public /* synthetic */ o(int i4) {
        this.f7029d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        switch (this.f7029d) {
            case 0:
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c, "it");
                w M8 = interfaceC0002c.M();
                o6.j.b(M8);
                return M8.b();
            case 1:
                InterfaceC0002c interfaceC0002c2 = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c2, "it");
                AbstractC1759v r8 = interfaceC0002c2.r();
                o6.j.b(r8);
                return r8;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                W w8 = (W) obj;
                o6.j.e(w8, "it");
                return Boolean.valueOf(w8 instanceof U6.h);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC0007h c6 = ((W) obj).B0().c();
                if (c6 == null) {
                    return Boolean.FALSE;
                }
                C0725e name = c6.getName();
                C0723c c0723c = B6.d.f462f;
                if (o6.j.a(name, c0723c.f10797a.f()) && o6.j.a(AbstractC1098d.c(c6), c0723c)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                p pVar = (p) obj;
                o6.j.e(pVar, "$this$function");
                String concat = "java/util/".concat("Spliterator");
                e eVar = m.f7018b;
                pVar.b(concat, eVar, eVar);
                return y.f7506a;
        }
    }
}
