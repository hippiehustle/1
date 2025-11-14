package Z7;

/* loaded from: classes.dex */
public final class l0 extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f7616c = new W(m0.f7619a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        long[] jArr = ((Z5.u) obj).f7502d;
        o6.j.e(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        k0 k0Var = (k0) obj;
        o6.j.e(k0Var, "builder");
        long a3 = aVar.G(this.f7576b, i4).a();
        k0Var.b(k0Var.d() + 1);
        long[] jArr = k0Var.f7613a;
        int i8 = k0Var.f7614b;
        k0Var.f7614b = i8 + 1;
        jArr[i8] = a3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z7.k0] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        long[] jArr = ((Z5.u) obj).f7502d;
        o6.j.e(jArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f7613a = jArr;
        obj2.f7614b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new Z5.u(new long[0]);
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        long[] jArr = ((Z5.u) obj).f7502d;
        o6.j.e(cVar, "encoder");
        for (int i8 = 0; i8 < i4; i8++) {
            cVar.j(this.f7576b, i8).m(jArr[i8]);
        }
    }
}
