package S1;

import T1.C0316o;
import T1.M;
import java.util.ArrayList;
import java.util.List;
import n6.InterfaceC1163b;
import q4.X;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F f5238f;

    public /* synthetic */ J(long j, F f8, int i4) {
        this.f5236d = i4;
        this.f5237e = j;
        this.f5238f = f8;
    }

    /* JADX WARN: Finally extract failed */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        boolean z8;
        boolean z9;
        D0.c L8;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i4 = this.f5236d;
        long j = this.f5237e;
        switch (i4) {
            case 0:
                F f8 = this.f5238f;
                D0.a aVar = (D0.a) obj;
                o6.j.e(aVar, "_connection");
                D0.c L9 = aVar.L("SELECT * FROM scenario_table WHERE id=? ORDER BY name ASC");
                try {
                    L9.c(1, j);
                    int x8 = X.x(L9, "id");
                    int x9 = X.x(L9, "name");
                    int x10 = X.x(L9, "detection_quality");
                    int x11 = X.x(L9, "randomize");
                    int x12 = X.x(L9, "keep_screen_on");
                    M m6 = null;
                    t.g gVar = new t.g((Object) null);
                    t.g gVar2 = new t.g((Object) null);
                    while (L9.H()) {
                        long j5 = L9.getLong(x8);
                        if (!gVar.b(j5)) {
                            gVar.g(j5, new ArrayList());
                        }
                        gVar2.g(L9.getLong(x8), null);
                    }
                    L9.reset();
                    f8.z(aVar, gVar);
                    f8.F(aVar, gVar2);
                    if (L9.H()) {
                        long j8 = L9.getLong(x8);
                        String l6 = L9.l(x9);
                        int i8 = (int) L9.getLong(x10);
                        if (((int) L9.getLong(x11)) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (((int) L9.getLong(x12)) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        T1.K k = new T1.K(j8, l6, i8, z8, z9);
                        Object c6 = gVar.c(L9.getLong(x8));
                        if (c6 != null) {
                            m6 = new M(k, (List) c6, (T1.L) gVar2.c(L9.getLong(x8)));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L9.close();
                    return m6;
                } finally {
                    L9.close();
                }
            case 1:
                F f9 = this.f5238f;
                D0.a aVar2 = (D0.a) obj;
                o6.j.e(aVar2, "_connection");
                L8 = aVar2.L("SELECT * FROM scenario_table WHERE id=? ORDER BY name ASC");
                try {
                    L8.c(1, j);
                    int x13 = X.x(L8, "id");
                    int x14 = X.x(L8, "name");
                    int x15 = X.x(L8, "detection_quality");
                    int x16 = X.x(L8, "randomize");
                    int x17 = X.x(L8, "keep_screen_on");
                    M m8 = null;
                    t.g gVar3 = new t.g((Object) null);
                    t.g gVar4 = new t.g((Object) null);
                    while (L8.H()) {
                        long j9 = L8.getLong(x13);
                        if (!gVar3.b(j9)) {
                            gVar3.g(j9, new ArrayList());
                        }
                        gVar4.g(L8.getLong(x13), null);
                    }
                    L8.reset();
                    f9.z(aVar2, gVar3);
                    f9.F(aVar2, gVar4);
                    if (L8.H()) {
                        long j10 = L8.getLong(x13);
                        String l8 = L8.l(x14);
                        int i9 = (int) L8.getLong(x15);
                        if (((int) L8.getLong(x16)) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (((int) L8.getLong(x17)) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        T1.K k6 = new T1.K(j10, l8, i9, z10, z11);
                        Object c9 = gVar3.c(L8.getLong(x13));
                        if (c9 != null) {
                            m8 = new M(k6, (List) c9, (T1.L) gVar4.c(L8.getLong(x13)));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    L8.close();
                    return m8;
                } finally {
                    L8.close();
                }
            default:
                F f10 = this.f5238f;
                D0.a aVar3 = (D0.a) obj;
                o6.j.e(aVar3, "_connection");
                L8 = aVar3.L("SELECT * FROM scenario_table WHERE id=?");
                try {
                    L8.c(1, j);
                    int x18 = X.x(L8, "id");
                    int x19 = X.x(L8, "name");
                    int x20 = X.x(L8, "detection_quality");
                    int x21 = X.x(L8, "randomize");
                    int x22 = X.x(L8, "keep_screen_on");
                    C0316o c0316o = null;
                    t.g gVar5 = new t.g((Object) null);
                    while (L8.H()) {
                        long j11 = L8.getLong(x18);
                        if (!gVar5.b(j11)) {
                            gVar5.g(j11, new ArrayList());
                        }
                    }
                    L8.reset();
                    f10.x(aVar3, gVar5);
                    if (L8.H()) {
                        long j12 = L8.getLong(x18);
                        String l9 = L8.l(x19);
                        int i10 = (int) L8.getLong(x20);
                        if (((int) L8.getLong(x21)) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (((int) L8.getLong(x22)) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        T1.K k8 = new T1.K(j12, l9, i10, z12, z13);
                        Object c10 = gVar5.c(L8.getLong(x18));
                        if (c10 != null) {
                            c0316o = new C0316o(k8, (List) c10);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    return c0316o;
                } catch (Throwable th) {
                    L8.close();
                    throw th;
                }
        }
    }
}
