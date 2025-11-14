package u0;

import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import n6.InterfaceC1162a;
import o3.C1235f;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617h {

    /* renamed from: a, reason: collision with root package name */
    public final u f15230a;

    /* renamed from: b, reason: collision with root package name */
    public final C1609N f15231b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f15232c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f15233d;

    /* renamed from: e, reason: collision with root package name */
    public final C1235f f15234e;

    /* renamed from: f, reason: collision with root package name */
    public final C1615f f15235f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15236g;

    /* JADX WARN: Type inference failed for: r1v5, types: [u0.f] */
    public C1617h(u uVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.f15230a = uVar;
        C1609N c1609n = new C1609N(uVar, linkedHashMap, linkedHashMap2, strArr, uVar.k, new W4.i(1, this, C1617h.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 28));
        this.f15231b = c1609n;
        this.f15232c = new LinkedHashMap();
        this.f15233d = new ReentrantLock();
        this.f15234e = new C1235f(this);
        final int i4 = 0;
        this.f15235f = new InterfaceC1162a(this) { // from class: u0.f

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1617h f15227e;

            {
                this.f15227e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z8;
                switch (i4) {
                    case 0:
                        this.f15227e.getClass();
                        return Z5.y.f7506a;
                    default:
                        C1617h c1617h = this.f15227e;
                        if (c1617h.f15230a.i() && !c1617h.f15230a.m()) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        return Boolean.valueOf(z8);
                }
            }
        };
        o6.j.d(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.f15236g = new Object();
        final int i8 = 1;
        c1609n.k = new InterfaceC1162a(this) { // from class: u0.f

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C1617h f15227e;

            {
                this.f15227e = this;
            }

            @Override // n6.InterfaceC1162a
            public final Object a() {
                boolean z8;
                switch (i8) {
                    case 0:
                        this.f15227e.getClass();
                        return Z5.y.f7506a;
                    default:
                        C1617h c1617h = this.f15227e;
                        if (c1617h.f15230a.i() && !c1617h.f15230a.m()) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        return Boolean.valueOf(z8);
                }
            }
        };
    }

    public final Object a(AbstractC0720j abstractC0720j) {
        Object f8;
        u uVar = this.f15230a;
        if ((!uVar.i() || uVar.m()) && (f8 = this.f15231b.f(abstractC0720j)) == EnumC0646a.f10656d) {
            return f8;
        }
        return Z5.y.f7506a;
    }
}
