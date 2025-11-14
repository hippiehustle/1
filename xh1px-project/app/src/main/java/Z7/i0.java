package Z7;

/* loaded from: classes.dex */
public final class i0 extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final i0 f7608c = new W(j0.f7609a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        int[] iArr = ((Z5.s) obj).f7500d;
        o6.j.e(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        h0 h0Var = (h0) obj;
        o6.j.e(h0Var, "builder");
        int t8 = aVar.G(this.f7576b, i4).t();
        h0Var.b(h0Var.d() + 1);
        int[] iArr = h0Var.f7604a;
        int i8 = h0Var.f7605b;
        h0Var.f7605b = i8 + 1;
        iArr[i8] = t8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z7.h0, java.lang.Object] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        int[] iArr = ((Z5.s) obj).f7500d;
        o6.j.e(iArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f7604a = iArr;
        obj2.f7605b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new Z5.s(new int[0]);
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        int[] iArr = ((Z5.s) obj).f7500d;
        o6.j.e(cVar, "encoder");
        for (int i8 = 0; i8 < i4; i8++) {
            cVar.j(this.f7576b, i8).k(iArr[i8]);
        }
    }
}
