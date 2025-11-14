package y7;

import C6.AbstractC0015p;
import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0007h;
import C6.O;
import F6.N;
import a6.s;
import a6.u;
import f7.C0725e;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import n6.InterfaceC1163b;
import p7.C1324f;
import p7.InterfaceC1333o;
import q4.X;

/* loaded from: classes.dex */
public class g implements InterfaceC1333o {

    /* renamed from: b, reason: collision with root package name */
    public final String f16522b;

    public g(h hVar, String... strArr) {
        o6.j.e(strArr, "formatParams");
        String str = hVar.f16528d;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        this.f16522b = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
    }

    @Override // p7.InterfaceC1335q
    public Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        o6.j.e(c1324f, "kindFilter");
        return s.f7766d;
    }

    @Override // p7.InterfaceC1333o
    public Set b() {
        return u.f7768d;
    }

    @Override // p7.InterfaceC1333o
    public Set c() {
        return u.f7768d;
    }

    @Override // p7.InterfaceC1335q
    public InterfaceC0007h d(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        o6.j.e(bVar, "location");
        return new C1842a(C0725e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{c0725e}, 1))));
    }

    @Override // p7.InterfaceC1333o
    public Set e() {
        return u.f7768d;
    }

    @Override // p7.InterfaceC1333o
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set g(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        C1842a c1842a = l.f16569c;
        o6.j.e(c1842a, "containingDeclaration");
        N n3 = new N(c1842a, null, D6.i.f1043a, C0725e.g("<Error function>"), 1, O.f726a);
        i c6 = l.c(k.RETURN_TYPE_FOR_FUNCTION, new String[0]);
        EnumC0023y enumC0023y = EnumC0023y.f780g;
        C0014o c0014o = AbstractC0015p.f758e;
        s sVar = s.f7766d;
        n3.R0(null, null, sVar, sVar, sVar, c6, enumC0023y, c0014o);
        return X.T(n3);
    }

    @Override // p7.InterfaceC1333o
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set f(C0725e c0725e, K6.b bVar) {
        o6.j.e(c0725e, "name");
        return l.f16572f;
    }

    public String toString() {
        return A.j.q(new StringBuilder("ErrorScope{"), this.f16522b, '}');
    }
}
