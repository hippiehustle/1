package Z7;

/* renamed from: Z7.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0402x extends W {

    /* renamed from: c, reason: collision with root package name */
    public static final C0402x f7652c = new W(C0403y.f7653a);

    @Override // Z7.AbstractC0380a
    public final int h(Object obj) {
        float[] fArr = (float[]) obj;
        o6.j.e(fArr, "<this>");
        return fArr.length;
    }

    @Override // Z7.AbstractC0393n, Z7.AbstractC0380a
    public final void j(Y7.a aVar, int i4, Object obj) {
        C0401w c0401w = (C0401w) obj;
        o6.j.e(c0401w, "builder");
        float w8 = aVar.w(this.f7576b, i4);
        c0401w.b(c0401w.d() + 1);
        float[] fArr = c0401w.f7650a;
        int i8 = c0401w.f7651b;
        c0401w.f7651b = i8 + 1;
        fArr[i8] = w8;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Z7.w] */
    @Override // Z7.AbstractC0380a
    public final Object k(Object obj) {
        float[] fArr = (float[]) obj;
        o6.j.e(fArr, "<this>");
        ?? obj2 = new Object();
        obj2.f7650a = fArr;
        obj2.f7651b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // Z7.W
    public final Object n() {
        return new float[0];
    }

    @Override // Z7.W
    public final void o(kotlinx.serialization.json.internal.c cVar, Object obj, int i4) {
        float[] fArr = (float[]) obj;
        o6.j.e(cVar, "encoder");
        o6.j.e(fArr, "content");
        for (int i8 = 0; i8 < i4; i8++) {
            float f8 = fArr[i8];
            V v8 = this.f7576b;
            o6.j.e(v8, "descriptor");
            cVar.g(v8, i8);
            cVar.h(f8);
        }
    }
}
