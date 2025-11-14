package G5;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public float f1834a;

    /* renamed from: b, reason: collision with root package name */
    public float f1835b;

    /* renamed from: c, reason: collision with root package name */
    public float f1836c;

    /* renamed from: d, reason: collision with root package name */
    public float f1837d;

    /* renamed from: e, reason: collision with root package name */
    public float f1838e;

    /* renamed from: f, reason: collision with root package name */
    public float f1839f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1840g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1841h = new ArrayList();

    public v() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f8) {
        float f9 = this.f1838e;
        if (f9 != f8) {
            float f10 = ((f8 - f9) + 360.0f) % 360.0f;
            if (f10 > 180.0f) {
                return;
            }
            float f11 = this.f1836c;
            float f12 = this.f1837d;
            r rVar = new r(f11, f12, f11, f12);
            rVar.f1827f = this.f1838e;
            rVar.f1828g = f10;
            this.f1841h.add(new p(rVar));
            this.f1838e = f8;
        }
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1840g;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((t) arrayList.get(i4)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [G5.s, G5.t, java.lang.Object] */
    public final void c(float f8, float f9) {
        ?? tVar = new t();
        tVar.f1829b = f8;
        tVar.f1830c = f9;
        this.f1840g.add(tVar);
        q qVar = new q(tVar, this.f1836c, this.f1837d);
        float b4 = qVar.b() + 270.0f;
        float b9 = qVar.b() + 270.0f;
        a(b4);
        this.f1841h.add(qVar);
        this.f1838e = b9;
        this.f1836c = f8;
        this.f1837d = f9;
    }

    public final void d(float f8, float f9, float f10, float f11) {
        this.f1834a = f8;
        this.f1835b = f9;
        this.f1836c = f8;
        this.f1837d = f9;
        this.f1838e = f10;
        this.f1839f = (f10 + f11) % 360.0f;
        this.f1840g.clear();
        this.f1841h.clear();
    }
}
