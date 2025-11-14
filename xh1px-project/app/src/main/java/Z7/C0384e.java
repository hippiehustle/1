package Z7;

/* renamed from: Z7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384e extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final C0384e f7593c = new W(C0385f.f7596a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        o6.j.e(zArr, "<this>");
        return zArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        C0383d c0383d = (C0383d) obj;
        o6.j.e(c0383d, "builder");
        boolean k = aVar.k(this.f7576b, i4);
        c0383d.b(c0383d.d() + 1);
        boolean[] zArr = c0383d.f7589a;
        int i8 = c0383d.f7590b;
        c0383d.f7590b = i8 + 1;
        zArr[i8] = k;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z7.d] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        o6.j.e(zArr, "<this>");
        ?? obj2 = new Object();
        obj2.f7589a = zArr;
        obj2.f7590b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new boolean[0];
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        boolean[] zArr = (boolean[]) obj;
        o6.j.e(cVar, "encoder");
        o6.j.e(zArr, "content");
        for (int i8 = 0; i8 < i4; i8++) {
            cVar.c(this.f7576b, i8, zArr[i8]);
        }
    }
}
