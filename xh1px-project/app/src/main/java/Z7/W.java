package Z7;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class W extends AbstractC0393n {

    /* renamed from: b, reason: collision with root package name */
    public final V f7576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(V7.a aVar) {
        super(aVar);
        o6.j.e(aVar, "primitiveSerializer");
        this.f7576b = new V(aVar.d());
    }

    @Override // Z7.AbstractC0380a, V7.a
    public final Object a(Y7.b bVar) {
        return i(bVar);
    }

    @Override // Z7.AbstractC0393n, V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        int h8 = h(obj);
        V v8 = this.f7576b;
        o6.j.e(v8, "descriptor");
        kotlinx.serialization.json.internal.c a3 = cVar.a(v8);
        o(a3, obj, h8);
        a3.v(v8);
    }

    @Override // V7.a
    public final X7.f d() {
        return this.f7576b;
    }

    @Override // Z7.AbstractC0380a
    public final Object e() {
        return (U) k(n());
    }

    @Override // Z7.AbstractC0380a
    public final int f(Object obj) {
        U u8 = (U) obj;
        o6.j.e(u8, "<this>");
        return u8.d();
    }

    @Override // Z7.AbstractC0380a
    public final Iterator g(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // Z7.AbstractC0380a
    public final Object l(Object obj) {
        U u8 = (U) obj;
        o6.j.e(u8, "<this>");
        return u8.a();
    }

    @Override // Z7.AbstractC0393n
    public final void m(Object obj, int i4, Object obj2) {
        o6.j.e((U) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object n();

    public abstract void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4);
}
