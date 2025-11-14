package Z7;

/* loaded from: classes.dex */
public final class f0 extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f7598c = new W(g0.f7601a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        byte[] bArr = ((Z5.q) obj).f7498d;
        o6.j.e(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        e0 e0Var = (e0) obj;
        o6.j.e(e0Var, "builder");
        byte x8 = aVar.G(this.f7576b, i4).x();
        e0Var.b(e0Var.d() + 1);
        byte[] bArr = e0Var.f7594a;
        int i8 = e0Var.f7595b;
        e0Var.f7595b = i8 + 1;
        bArr[i8] = x8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z7.e0, java.lang.Object] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        byte[] bArr = ((Z5.q) obj).f7498d;
        o6.j.e(bArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.f7594a = bArr;
        obj2.f7595b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new Z5.q(new byte[0]);
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        byte[] bArr = ((Z5.q) obj).f7498d;
        o6.j.e(cVar, "encoder");
        for (int i8 = 0; i8 < i4; i8++) {
            cVar.j(this.f7576b, i8).d(bArr[i8]);
        }
    }
}
