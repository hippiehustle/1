package Z7;

/* loaded from: classes.dex */
public final class b0 extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final b0 f7585c = new W(c0.f7587a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        short[] sArr = (short[]) obj;
        o6.j.e(sArr, "<this>");
        return sArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        a0 a0Var = (a0) obj;
        o6.j.e(a0Var, "builder");
        short l6 = aVar.l(this.f7576b, i4);
        a0Var.b(a0Var.d() + 1);
        short[] sArr = a0Var.f7583a;
        int i8 = a0Var.f7584b;
        a0Var.f7584b = i8 + 1;
        sArr[i8] = l6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z7.a0] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        short[] sArr = (short[]) obj;
        o6.j.e(sArr, "<this>");
        ?? obj2 = new Object();
        obj2.f7583a = sArr;
        obj2.f7584b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new short[0];
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        short[] sArr = (short[]) obj;
        o6.j.e(cVar, "encoder");
        o6.j.e(sArr, "content");
        for (int i8 = 0; i8 < i4; i8++) {
            short s8 = sArr[i8];
            V v8 = this.f7576b;
            o6.j.e(v8, "descriptor");
            cVar.g(v8, i8);
            cVar.s(s8);
        }
    }
}
