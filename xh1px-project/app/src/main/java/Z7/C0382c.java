package Z7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Z7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382c extends AbstractC0393n {

    /* renamed from: b, reason: collision with root package name */
    public final C0381b f7586b;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.I, Z7.b] */
    public C0382c(V7.a aVar) {
        super(aVar);
        X7.f d2 = aVar.d();
        o6.j.e(d2, "elementDesc");
        this.f7586b = new I(d2);
    }

    @Override // V7.a
    public final X7.f d() {
        return this.f7586b;
    }

    @Override // Z7.AbstractC0380a
    public final Object e() {
        return new ArrayList();
    }

    @Override // Z7.AbstractC0380a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        o6.j.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // Z7.AbstractC0380a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        o6.j.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        o6.j.e(collection, "<this>");
        return collection.size();
    }

    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        o6.j.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // Z7.AbstractC0380a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        o6.j.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // Z7.AbstractC0393n
    public final void m(Object obj, int i4, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        o6.j.e(arrayList, "<this>");
        arrayList.add(i4, obj2);
    }
}
