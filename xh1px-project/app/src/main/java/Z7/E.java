package Z7;

/* loaded from: classes.dex */
public final class E extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final E f7544c = new W(F.f7545a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        int[] iArr = (int[]) obj;
        o6.j.e(iArr, "<this>");
        return iArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        D d2 = (D) obj;
        o6.j.e(d2, "builder");
        int o7 = aVar.o(this.f7576b, i4);
        d2.b(d2.d() + 1);
        int[] iArr = d2.f7542a;
        int i8 = d2.f7543b;
        d2.f7543b = i8 + 1;
        iArr[i8] = o7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z7.D] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        int[] iArr = (int[]) obj;
        o6.j.e(iArr, "<this>");
        ?? obj2 = new Object();
        obj2.f7542a = iArr;
        obj2.f7543b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new int[0];
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        int[] iArr = (int[]) obj;
        o6.j.e(cVar, "encoder");
        o6.j.e(iArr, "content");
        for (int i8 = 0; i8 < i4; i8++) {
            cVar.l(i8, iArr[i8], this.f7576b);
        }
    }
}
