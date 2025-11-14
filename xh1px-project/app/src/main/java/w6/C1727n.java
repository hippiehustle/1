package w6;

import C6.AbstractC0015p;
import C6.InterfaceC0010k;
import L7.C0165x;
import a7.C0450k;
import c7.InterfaceC0588g;
import f7.AbstractC0726f;
import f7.C0725e;
import h6.AbstractC0837b;
import u7.C1655h;
import u7.InterfaceC1657j;

/* renamed from: w6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1727n extends AbstractC0837b {

    /* renamed from: a, reason: collision with root package name */
    public final C6.M f15881a;

    /* renamed from: b, reason: collision with root package name */
    public final a7.I f15882b;

    /* renamed from: c, reason: collision with root package name */
    public final d7.e f15883c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0588g f15884d;

    /* renamed from: e, reason: collision with root package name */
    public final F6.B f15885e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15886f;

    public C1727n(C6.M m6, a7.I i4, d7.e eVar, InterfaceC0588g interfaceC0588g, F6.B b4) {
        String str;
        String sb;
        String str2;
        o6.j.e(i4, "proto");
        o6.j.e(interfaceC0588g, "nameResolver");
        o6.j.e(b4, "typeTable");
        this.f15881a = m6;
        this.f15882b = i4;
        this.f15883c = eVar;
        this.f15884d = interfaceC0588g;
        this.f15885e = b4;
        if (eVar.i()) {
            sb = interfaceC0588g.getString(eVar.f10478h.f10463f).concat(interfaceC0588g.getString(eVar.f10478h.f10464g));
        } else {
            e7.d b9 = e7.g.b(i4, interfaceC0588g, b4, true);
            if (b9 != null) {
                String str3 = b9.f10663e;
                String str4 = b9.f10664f;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(P6.v.a(str3));
                InterfaceC0010k q6 = m6.q();
                o6.j.d(q6, "getContainingDeclaration(...)");
                if (o6.j.a(m6.d(), AbstractC0015p.f757d) && (q6 instanceof C1655h)) {
                    C0450k c0450k = ((C1655h) q6).f15399h;
                    g7.n nVar = d7.k.f10520i;
                    o6.j.d(nVar, "classModuleName");
                    Integer num = (Integer) E2.d.t(c0450k, nVar);
                    if (num != null) {
                        str2 = interfaceC0588g.getString(num.intValue());
                    } else {
                        str2 = "main";
                    }
                    I7.k kVar = AbstractC0726f.f10806a;
                    kVar.getClass();
                    String replaceAll = kVar.f2244d.matcher(str2).replaceAll("_");
                    o6.j.d(replaceAll, "replaceAll(...)");
                    str = "$".concat(replaceAll);
                } else {
                    if (o6.j.a(m6.d(), AbstractC0015p.f754a) && (q6 instanceof C6.F)) {
                        InterfaceC1657j interfaceC1657j = ((u7.q) m6).f15444I;
                        if (interfaceC1657j instanceof Y6.g) {
                            Y6.g gVar = (Y6.g) interfaceC1657j;
                            if (gVar.f7223e != null) {
                                StringBuilder sb3 = new StringBuilder("$");
                                String d2 = gVar.f7222d.d();
                                o6.j.d(d2, "getInternalName(...)");
                                sb3.append(C0725e.e(I7.m.t0('/', d2, d2)).b());
                                str = sb3.toString();
                            }
                        }
                    }
                    str = "";
                }
                sb2.append(str);
                sb2.append("()");
                sb2.append(str4);
                sb = sb2.toString();
            } else {
                throw new C0165x("No field signature for property: " + m6);
            }
        }
        this.f15886f = sb;
    }

    @Override // h6.AbstractC0837b
    public final String a() {
        return this.f15886f;
    }
}
