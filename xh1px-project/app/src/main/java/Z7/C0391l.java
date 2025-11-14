package Z7;

/* renamed from: Z7.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391l extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final C0391l f7615c = new W(C0392m.f7617a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        char[] cArr = (char[]) obj;
        o6.j.e(cArr, "<this>");
        return cArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        C0390k c0390k = (C0390k) obj;
        o6.j.e(c0390k, "builder");
        char q6 = aVar.q(this.f7576b, i4);
        c0390k.b(c0390k.d() + 1);
        char[] cArr = c0390k.f7611a;
        int i8 = c0390k.f7612b;
        c0390k.f7612b = i8 + 1;
        cArr[i8] = q6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Z7.k, java.lang.Object] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        char[] cArr = (char[]) obj;
        o6.j.e(cArr, "<this>");
        ?? obj2 = new Object();
        obj2.f7611a = cArr;
        obj2.f7612b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new char[0];
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        char[] cArr = (char[]) obj;
        o6.j.e(cVar, "encoder");
        o6.j.e(cArr, "content");
        for (int i8 = 0; i8 < i4; i8++) {
            char c6 = cArr[i8];
            V v8 = this.f7576b;
            o6.j.e(v8, "descriptor");
            cVar.g(v8, i8);
            cVar.e(c6);
        }
    }
}
