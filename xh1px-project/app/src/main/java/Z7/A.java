package Z7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class A extends T {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7538l;

    public A(String str, B b4) {
        super(str, b4, 1);
        this.f7538l = true;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, Z5.g] */
    @Override // Z7.T
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A) {
                X7.f fVar = (X7.f) obj;
                if (this.f7566a.equals(fVar.b())) {
                    A a3 = (A) obj;
                    if (a3.f7538l && Arrays.equals((X7.f[]) this.j.getValue(), (X7.f[]) a3.j.getValue())) {
                        int c6 = fVar.c();
                        int i4 = this.f7568c;
                        if (i4 == c6) {
                            for (int i8 = 0; i8 < i4; i8++) {
                                if (o6.j.a(j(i8).b(), fVar.j(i8).b()) && o6.j.a(j(i8).e(), fVar.j(i8).e())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // Z7.T, X7.f
    public final boolean g() {
        return this.f7538l;
    }

    @Override // Z7.T
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
