package Z7;

/* loaded from: classes.dex */
public final class o0 extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f7626c = new W(p0.f7628a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        short[] sArr = ((Z5.x) obj).f7505d;
        o6.j.e(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        n0 n0Var = (n0) obj;
        o6.j.e(n0Var, "builder");
        short z8 = aVar.G(this.f7576b, i4).z();
        n0Var.b(n0Var.d() + 1);
        short[] sArr = n0Var.f7622a;
        int i8 = n0Var.f7623b;
        n0Var.f7623b = i8 + 1;
        sArr[i8] = z8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z7.n0] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        short[] sArr = ((Z5.x) obj).f7505d;
        o6.j.e(sArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f7622a = sArr;
        obj2.f7623b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new Z5.x(new short[0]);
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        short[] sArr = ((Z5.x) obj).f7505d;
        o6.j.e(cVar, "encoder");
        for (int i8 = 0; i8 < i4; i8++) {
            cVar.j(this.f7576b, i8).s(sArr[i8]);
        }
    }
}
