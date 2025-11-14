package Z7;

/* loaded from: classes.dex */
public final class K extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final K f7553c = new W(L.f7554a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        long[] jArr = (long[]) obj;
        o6.j.e(jArr, "<this>");
        return jArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        J j = (J) obj;
        o6.j.e(j, "builder");
        long i8 = aVar.i(this.f7576b, i4);
        j.b(j.d() + 1);
        long[] jArr = j.f7551a;
        int i9 = j.f7552b;
        j.f7552b = i9 + 1;
        jArr[i9] = i8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z7.J, java.lang.Object] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        long[] jArr = (long[]) obj;
        o6.j.e(jArr, "<this>");
        ?? obj2 = new Object();
        obj2.f7551a = jArr;
        obj2.f7552b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new long[0];
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        long[] jArr = (long[]) obj;
        o6.j.e(cVar, "encoder");
        o6.j.e(jArr, "content");
        for (int i8 = 0; i8 < i4; i8++) {
            cVar.n(this.f7576b, i8, jArr[i8]);
        }
    }
}
