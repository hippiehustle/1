package Z7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public class T implements X7.f, InterfaceC0389j {

    /* renamed from: a, reason: collision with root package name */
    public final String f7566a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0404z f7567b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7568c;

    /* renamed from: d, reason: collision with root package name */
    public int f7569d = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f7570e;

    /* renamed from: f, reason: collision with root package name */
    public final List[] f7571f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f7572g;

    /* renamed from: h, reason: collision with root package name */
    public Object f7573h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7574i;
    public final Object j;
    public final Object k;

    public T(String str, InterfaceC0404z interfaceC0404z, int i4) {
        this.f7566a = str;
        this.f7567b = interfaceC0404z;
        this.f7568c = i4;
        String[] strArr = new String[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            strArr[i8] = "[UNINITIALIZED]";
        }
        this.f7570e = strArr;
        int i9 = this.f7568c;
        this.f7571f = new List[i9];
        this.f7572g = new boolean[i9];
        this.f7573h = a6.t.f7767d;
        final int i10 = 0;
        InterfaceC1162a interfaceC1162a = new InterfaceC1162a(this) { // from class: Z7.S

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ T f7565e;

            {
                this.f7565e = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                ArrayList arrayList;
                switch (i10) {
                    case 0:
                        InterfaceC0404z interfaceC0404z2 = this.f7565e.f7567b;
                        if (interfaceC0404z2 != null) {
                            return interfaceC0404z2.b();
                        }
                        return Q.f7563b;
                    case 1:
                        if (this.f7565e.f7567b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return Q.c(arrayList);
                    default:
                        T t8 = this.f7565e;
                        return Integer.valueOf(Q.e(t8, (X7.f[]) t8.j.getValue()));
                }
            }
        };
        Z5.h hVar = Z5.h.f7482d;
        this.f7574i = Z5.a.c(hVar, interfaceC1162a);
        final int i11 = 1;
        this.j = Z5.a.c(hVar, new InterfaceC1162a(this) { // from class: Z7.S

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ T f7565e;

            {
                this.f7565e = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                ArrayList arrayList;
                switch (i11) {
                    case 0:
                        InterfaceC0404z interfaceC0404z2 = this.f7565e.f7567b;
                        if (interfaceC0404z2 != null) {
                            return interfaceC0404z2.b();
                        }
                        return Q.f7563b;
                    case 1:
                        if (this.f7565e.f7567b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return Q.c(arrayList);
                    default:
                        T t8 = this.f7565e;
                        return Integer.valueOf(Q.e(t8, (X7.f[]) t8.j.getValue()));
                }
            }
        });
        final int i12 = 2;
        this.k = Z5.a.c(hVar, new InterfaceC1162a(this) { // from class: Z7.S

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ T f7565e;

            {
                this.f7565e = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, Z5.g] */
            @Override // n6.InterfaceC1162a
            public final Object a() {
                ArrayList arrayList;
                switch (i12) {
                    case 0:
                        InterfaceC0404z interfaceC0404z2 = this.f7565e.f7567b;
                        if (interfaceC0404z2 != null) {
                            return interfaceC0404z2.b();
                        }
                        return Q.f7563b;
                    case 1:
                        if (this.f7565e.f7567b != null) {
                            arrayList = new ArrayList(0);
                        } else {
                            arrayList = null;
                        }
                        return Q.c(arrayList);
                    default:
                        T t8 = this.f7565e;
                        return Integer.valueOf(Q.e(t8, (X7.f[]) t8.j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    @Override // X7.f
    public final int a(String str) {
        o6.j.e(str, "name");
        Integer num = (Integer) this.f7573h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // X7.f
    public final String b() {
        return this.f7566a;
    }

    @Override // X7.f
    public final int c() {
        return this.f7568c;
    }

    @Override // X7.f
    public final String d(int i4) {
        return this.f7570e[i4];
    }

    @Override // X7.f
    public q4.X e() {
        return X7.i.f7073e;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, Z5.g] */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof T) {
                X7.f fVar = (X7.f) obj;
                if (this.f7566a.equals(fVar.b()) && Arrays.equals((X7.f[]) this.j.getValue(), (X7.f[]) ((T) obj).j.getValue())) {
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
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // Z7.InterfaceC0389j
    public final Set f() {
        return this.f7573h.keySet();
    }

    @Override // X7.f
    public boolean g() {
        return false;
    }

    @Override // X7.f
    public final List getAnnotations() {
        return a6.s.f7766d;
    }

    @Override // X7.f
    public final boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // X7.f
    public final List i(int i4) {
        List list = this.f7571f[i4];
        if (list == null) {
            return a6.s.f7766d;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, Z5.g] */
    @Override // X7.f
    public X7.f j(int i4) {
        return ((V7.a[]) this.f7574i.getValue())[i4].d();
    }

    @Override // X7.f
    public final boolean k(int i4) {
        return this.f7572g[i4];
    }

    public final void l(String str, boolean z8) {
        o6.j.e(str, "name");
        int i4 = this.f7569d + 1;
        this.f7569d = i4;
        String[] strArr = this.f7570e;
        strArr[i4] = str;
        this.f7572g[i4] = z8;
        this.f7571f[i4] = null;
        if (i4 == this.f7568c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                hashMap.put(strArr[i8], Integer.valueOf(i8));
            }
            this.f7573h = hashMap;
        }
    }

    public String toString() {
        return Q.h(this);
    }
}
