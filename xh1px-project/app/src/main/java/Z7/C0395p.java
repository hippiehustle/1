package Z7;

/* renamed from: Z7.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395p extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final C0395p f7627c = new W(C0396q.f7630a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        double[] dArr = (double[]) obj;
        o6.j.e(dArr, "<this>");
        return dArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        C0394o c0394o = (C0394o) obj;
        o6.j.e(c0394o, "builder");
        double b4 = aVar.b(this.f7576b, i4);
        c0394o.b(c0394o.d() + 1);
        double[] dArr = c0394o.f7624a;
        int i8 = c0394o.f7625b;
        c0394o.f7625b = i8 + 1;
        dArr[i8] = b4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z7.o, java.lang.Object] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        double[] dArr = (double[]) obj;
        o6.j.e(dArr, "<this>");
        ?? obj2 = new Object();
        obj2.f7624a = dArr;
        obj2.f7625b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new double[0];
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        double[] dArr = (double[]) obj;
        o6.j.e(cVar, "encoder");
        o6.j.e(dArr, "content");
        for (int i8 = 0; i8 < i4; i8++) {
            double d2 = dArr[i8];
            V v8 = this.f7576b;
            o6.j.e(v8, "descriptor");
            cVar.g(v8, i8);
            cVar.f(d2);
        }
    }
}
