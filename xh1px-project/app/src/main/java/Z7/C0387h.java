package Z7;

/* renamed from: Z7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0387h extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final C0387h f7603c = new W(C0388i.f7606a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        byte[] bArr = (byte[]) obj;
        o6.j.e(bArr, "<this>");
        return bArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        C0386g c0386g = (C0386g) obj;
        o6.j.e(c0386g, "builder");
        byte D7 = aVar.D(this.f7576b, i4);
        c0386g.b(c0386g.d() + 1);
        byte[] bArr = c0386g.f7599a;
        int i8 = c0386g.f7600b;
        c0386g.f7600b = i8 + 1;
        bArr[i8] = D7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z7.g] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        byte[] bArr = (byte[]) obj;
        o6.j.e(bArr, "<this>");
        ?? obj2 = new Object();
        obj2.f7599a = bArr;
        obj2.f7600b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new byte[0];
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        byte[] bArr = (byte[]) obj;
        o6.j.e(cVar, "encoder");
        o6.j.e(bArr, "content");
        for (int i8 = 0; i8 < i4; i8++) {
            byte b4 = bArr[i8];
            V v8 = this.f7576b;
            o6.j.e(v8, "descriptor");
            cVar.g(v8, i8);
            cVar.d(b4);
        }
    }
}
