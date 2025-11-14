package u0;

import a6.AbstractC0436k;
import a6.AbstractC0438m;
import android.os.Looper;
import d6.InterfaceC0622h;
import f6.AbstractC0713c;
import h6.AbstractC0837b;
import i.ExecutorC0875n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import n6.InterfaceC1164c;
import t0.C1536c;
import u6.InterfaceC1642c;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public Q7.d f15275a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0622h f15276b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f15277c;

    /* renamed from: d, reason: collision with root package name */
    public ExecutorC0875n f15278d;

    /* renamed from: e, reason: collision with root package name */
    public r f15279e;

    /* renamed from: f, reason: collision with root package name */
    public C1617h f15280f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15282h;

    /* renamed from: g, reason: collision with root package name */
    public final C1536c f15281g = new C1536c(new J3.s(0, this, u.class, "onClosed", "onClosed()V", 0, 0, 27));

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f15283i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        boolean z8;
        if (!this.f15282h) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
            } else {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    public List b(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a6.x.N0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(h2.a.k((InterfaceC1642c) entry.getKey()), entry.getValue());
        }
        return a6.s.f7766d;
    }

    public abstract C1617h c();

    public c0.g d() {
        throw new Z5.i();
    }

    public final C1617h e() {
        C1617h c1617h = this.f15280f;
        if (c1617h != null) {
            return c1617h;
        }
        o6.j.i("internalTracker");
        throw null;
    }

    public final E0.b f() {
        r rVar = this.f15279e;
        if (rVar != null) {
            E0.b c6 = rVar.c();
            if (c6 != null) {
                return c6;
            }
            throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        }
        o6.j.i("connectionManager");
        throw null;
    }

    public Set g() {
        return AbstractC0436k.V0(new ArrayList(AbstractC0438m.d0(a6.u.f7768d, 10)));
    }

    public LinkedHashMap h() {
        int N02 = a6.x.N0(AbstractC0438m.d0(a6.u.f7768d, 10));
        if (N02 < 16) {
            N02 = 16;
        }
        return new LinkedHashMap(N02);
    }

    public final boolean i() {
        r rVar = this.f15279e;
        if (rVar != null) {
            if (rVar.c() != null) {
                return true;
            }
            return false;
        }
        o6.j.i("connectionManager");
        throw null;
    }

    public final boolean j() {
        if (m() && f().J().w()) {
            return true;
        }
        return false;
    }

    public final void k() {
        f().J().f();
        if (!j()) {
            C1617h e9 = e();
            e9.f15231b.e(e9.f15234e, e9.f15235f);
        }
    }

    public final void l(D0.a aVar) {
        o6.j.e(aVar, "connection");
        C1617h e9 = e();
        C1609N c1609n = e9.f15231b;
        c1609n.getClass();
        D0.c L8 = aVar.L("PRAGMA query_only");
        try {
            L8.H();
            boolean z8 = false;
            if (L8.getLong(0) != 0) {
                z8 = true;
            }
            AbstractC0837b.d(L8, null);
            if (!z8) {
                E2.b.p(aVar, "PRAGMA temp_store = MEMORY");
                E2.b.p(aVar, "PRAGMA recursive_triggers = 1");
                E2.b.p(aVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (c1609n.f15197d) {
                    E2.b.p(aVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    E2.b.p(aVar, I7.v.Z("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                C1621l c1621l = c1609n.f15201h;
                ReentrantLock reentrantLock = (ReentrantLock) c1621l.f15244e;
                reentrantLock.lock();
                try {
                    c1621l.f15243d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (e9.f15236g) {
            }
        } finally {
        }
    }

    public final boolean m() {
        r rVar = this.f15279e;
        if (rVar != null) {
            E0.a aVar = rVar.f15257g;
            if (aVar != null) {
                return aVar.isOpen();
            }
            return false;
        }
        o6.j.i("connectionManager");
        throw null;
    }

    public final Object n(boolean z8, InterfaceC1164c interfaceC1164c, AbstractC0713c abstractC0713c) {
        r rVar = this.f15279e;
        if (rVar != null) {
            return rVar.f15256f.s(z8, interfaceC1164c, abstractC0713c);
        }
        o6.j.i("connectionManager");
        throw null;
    }
}
