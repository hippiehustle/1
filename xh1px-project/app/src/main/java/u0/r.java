package u0;

import a6.AbstractC0436k;
import android.content.Context;
import android.content.Intent;
import b6.C0533a;
import b6.C0535c;
import d6.InterfaceC0622h;
import h6.AbstractC0837b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o3.C1234e;
import r2.C1429a;
import t0.C1536c;
import t2.C1562a;
import w0.InterfaceC1684b;
import x0.C1772a;
import x0.C1773b;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public boolean f15251a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15252b;

    /* renamed from: c, reason: collision with root package name */
    public final C1610a f15253c;

    /* renamed from: d, reason: collision with root package name */
    public final c0.g f15254d;

    /* renamed from: e, reason: collision with root package name */
    public final List f15255e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1684b f15256f;

    /* renamed from: g, reason: collision with root package name */
    public E0.a f15257g;

    public r(C1610a c1610a, c0.g gVar) {
        int i4;
        w0.i iVar;
        t tVar = c1610a.f15209g;
        G5.e eVar = c1610a.f15205c;
        String str = c1610a.f15204b;
        this.f15253c = c1610a;
        this.f15254d = gVar;
        List list = c1610a.f15207e;
        this.f15255e = list == null ? a6.s.f7766d : list;
        D0.b bVar = c1610a.f15220t;
        if (bVar != null) {
            if (str == null) {
                iVar = new w0.i(new C1536c(this, bVar));
            } else {
                C1536c c1536c = new C1536c(this, bVar);
                int ordinal = tVar.ordinal();
                if (ordinal == 1) {
                    i4 = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + tVar + '\'').toString());
                    }
                    i4 = 4;
                }
                int ordinal2 = tVar.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + tVar + '\'').toString());
                }
                iVar = new w0.i(c1536c, str, i4);
            }
            this.f15256f = iVar;
        } else if (eVar != null) {
            Context context = c1610a.f15203a;
            o6.j.e(context, "context");
            this.f15256f = new C1773b(new C1562a((E0.b) new F0.h(context, str, new M.i(this, gVar.f9382a))));
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z8 = tVar == t.f15273f;
        E0.b c6 = c();
        if (c6 != null) {
            c6.setWriteAheadLoggingEnabled(z8);
        }
    }

    public static final void a(r rVar, D0.a aVar) {
        Object b4;
        c0.g gVar = rVar.f15254d;
        C1610a c1610a = rVar.f15253c;
        t tVar = c1610a.f15209g;
        t tVar2 = t.f15273f;
        if (tVar == tVar2) {
            E2.b.p(aVar, "PRAGMA journal_mode = WAL");
        } else {
            E2.b.p(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c1610a.f15209g == tVar2) {
            E2.b.p(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            E2.b.p(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        D0.c L8 = aVar.L("PRAGMA user_version");
        try {
            L8.H();
            int i4 = (int) L8.getLong(0);
            AbstractC0837b.d(L8, null);
            int i8 = gVar.f9382a;
            if (i4 != i8) {
                E2.b.p(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i4 == 0) {
                        rVar.d(aVar);
                    } else {
                        rVar.e(aVar, i4, i8);
                    }
                    E2.b.p(aVar, "PRAGMA user_version = " + i8);
                    b4 = Z5.y.f7506a;
                } catch (Throwable th) {
                    b4 = Z5.a.b(th);
                }
                if (!(b4 instanceof Z5.k)) {
                    E2.b.p(aVar, "END TRANSACTION");
                }
                Throwable a3 = Z5.l.a(b4);
                if (a3 != null) {
                    E2.b.p(aVar, "ROLLBACK TRANSACTION");
                    throw a3;
                }
            }
            rVar.f(aVar);
        } finally {
        }
    }

    public static void b(D0.a aVar) {
        D0.c L8 = aVar.L("PRAGMA busy_timeout");
        try {
            L8.H();
            long j = L8.getLong(0);
            AbstractC0837b.d(L8, null);
            if (j < 3000) {
                E2.b.p(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0837b.d(L8, th);
                throw th2;
            }
        }
    }

    public final E0.b c() {
        C1773b c1773b;
        C1562a c1562a;
        InterfaceC1684b interfaceC1684b = this.f15256f;
        if (interfaceC1684b instanceof C1773b) {
            c1773b = (C1773b) interfaceC1684b;
        } else {
            c1773b = null;
        }
        if (c1773b == null || (c1562a = c1773b.f16080d) == null) {
            return null;
        }
        return (E0.b) c1562a.f15048d;
    }

    public final void d(D0.a aVar) {
        o6.j.e(aVar, "connection");
        D0.c L8 = aVar.L("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z8 = false;
            if (L8.H()) {
                if (L8.getLong(0) == 0) {
                    z8 = true;
                }
            }
            AbstractC0837b.d(L8, null);
            c0.g gVar = this.f15254d;
            gVar.a(aVar);
            if (!z8) {
                N.f v8 = gVar.v(aVar);
                if (!v8.f3524e) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) v8.f3525f)).toString());
                }
            }
            g(aVar);
            gVar.r(aVar);
            Iterator it = this.f15255e.iterator();
            while (it.hasNext()) {
                ((q) it.next()).getClass();
                if (aVar instanceof C1772a) {
                    o6.j.e(((C1772a) aVar).f16079d, "db");
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0837b.d(L8, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x009b A[EDGE_INSN: B:129:0x009b->B:113:0x009b BREAK  A[LOOP:4: B:92:0x0024->B:114:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(D0.a aVar, int i4, int i8) {
        boolean z8;
        Iterable iterable;
        Z5.j jVar;
        boolean z9;
        o6.j.e(aVar, "connection");
        C1610a c1610a = this.f15253c;
        C1.a aVar2 = c1610a.f15206d;
        o6.j.e(aVar2, "<this>");
        LinkedHashMap linkedHashMap = aVar2.f561a;
        if (i4 == i8) {
            iterable = a6.s.f7766d;
        } else {
            if (i8 > i4) {
                z8 = true;
            } else {
                z8 = false;
            }
            ArrayList arrayList = new ArrayList();
            int i9 = i4;
            do {
                if (z8) {
                    if (i9 >= i8) {
                        iterable = arrayList;
                        break;
                    }
                    if (!z8) {
                        TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i9));
                        if (treeMap != null) {
                            jVar = new Z5.j(treeMap, treeMap.descendingKeySet());
                            if (jVar != null) {
                                break;
                            }
                            Map map = (Map) jVar.f7485d;
                            Iterator it = ((Iterable) jVar.f7486e).iterator();
                            while (it.hasNext()) {
                                int intValue = ((Number) it.next()).intValue();
                                if (z8) {
                                    if (i9 + 1 <= intValue && intValue <= i8) {
                                        Object obj = map.get(Integer.valueOf(intValue));
                                        o6.j.b(obj);
                                        arrayList.add(obj);
                                        z9 = true;
                                        i9 = intValue;
                                        break;
                                    }
                                } else if (i8 <= intValue && intValue < i9) {
                                    Object obj2 = map.get(Integer.valueOf(intValue));
                                    o6.j.b(obj2);
                                    arrayList.add(obj2);
                                    z9 = true;
                                    i9 = intValue;
                                    break;
                                    break;
                                }
                            }
                            z9 = false;
                        }
                        jVar = null;
                        if (jVar != null) {
                        }
                    } else {
                        TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i9));
                        if (treeMap2 != null) {
                            jVar = new Z5.j(treeMap2, treeMap2.keySet());
                            if (jVar != null) {
                            }
                        }
                        jVar = null;
                        if (jVar != null) {
                        }
                    }
                } else {
                    if (i9 <= i8) {
                        iterable = arrayList;
                        break;
                    }
                    if (!z8) {
                    }
                }
            } while (z9);
            iterable = null;
        }
        c0.g gVar = this.f15254d;
        if (iterable != null) {
            gVar.u(aVar);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((AbstractC1829a) it2.next()).a(aVar);
            }
            N.f v8 = gVar.v(aVar);
            if (v8.f3524e) {
                gVar.t(aVar);
                g(aVar);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + ((String) v8.f3525f)).toString());
            }
        }
        o6.j.e(c1610a, "<this>");
        boolean z10 = false;
        if (i4 <= i8 || !c1610a.f15212l) {
            Set set = c1610a.f15213m;
            if (c1610a.k && (set == null || !set.contains(Integer.valueOf(i4)))) {
                z10 = true;
            }
        }
        if (!z10) {
            if (c1610a.f15219s) {
                D0.c L8 = aVar.L("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                try {
                    C0535c i10 = E2.d.i();
                    while (L8.H()) {
                        String l6 = L8.l(0);
                        if (!I7.v.a0(l6, "sqlite_") && !l6.equals("android_metadata")) {
                            i10.add(new Z5.j(l6, Boolean.valueOf(o6.j.a(L8.l(1), "view"))));
                        }
                    }
                    C0535c f8 = E2.d.f(i10);
                    AbstractC0837b.d(L8, null);
                    ListIterator listIterator = f8.listIterator(0);
                    while (true) {
                        C0533a c0533a = (C0533a) listIterator;
                        if (!c0533a.hasNext()) {
                            break;
                        }
                        Z5.j jVar2 = (Z5.j) c0533a.next();
                        String str = (String) jVar2.f7485d;
                        if (((Boolean) jVar2.f7486e).booleanValue()) {
                            E2.b.p(aVar, "DROP VIEW IF EXISTS " + str);
                        } else {
                            E2.b.p(aVar, "DROP TABLE IF EXISTS " + str);
                        }
                    }
                } finally {
                }
            } else {
                gVar.c(aVar);
            }
            Iterator it3 = this.f15255e.iterator();
            while (it3.hasNext()) {
                ((q) it3.next()).getClass();
                if (aVar instanceof C1772a) {
                    o6.j.e(((C1772a) aVar).f16079d, "db");
                }
            }
            gVar.a(aVar);
            return;
        }
        throw new IllegalStateException(("A migration from " + i4 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(D0.a aVar) {
        boolean z8;
        Object b4;
        N.f v8;
        String str;
        o6.j.e(aVar, "connection");
        D0.c L8 = aVar.L("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (L8.H()) {
                if (L8.getLong(0) != 0) {
                    z8 = true;
                    AbstractC0837b.d(L8, null);
                    c0.g gVar = this.f15254d;
                    if (!z8) {
                        L8 = aVar.L("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            if (L8.H()) {
                                str = L8.l(0);
                            } else {
                                str = null;
                            }
                            AbstractC0837b.d(L8, null);
                            if (!((String) gVar.f9383b).equals(str) && !((String) gVar.f9384c).equals(str)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) gVar.f9383b) + ", found: " + str).toString());
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        E2.b.p(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            v8 = gVar.v(aVar);
                        } catch (Throwable th2) {
                            b4 = Z5.a.b(th2);
                        }
                        if (v8.f3524e) {
                            gVar.t(aVar);
                            g(aVar);
                            b4 = Z5.y.f7506a;
                            if (!(b4 instanceof Z5.k)) {
                                E2.b.p(aVar, "END TRANSACTION");
                            }
                            Throwable a3 = Z5.l.a(b4);
                            if (a3 != null) {
                                E2.b.p(aVar, "ROLLBACK TRANSACTION");
                                throw a3;
                            }
                        } else {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) v8.f3525f)).toString());
                        }
                    }
                    gVar.s(aVar);
                    for (q qVar : this.f15255e) {
                        qVar.getClass();
                        if (aVar instanceof C1772a) {
                            E0.a aVar2 = ((C1772a) aVar).f16079d;
                            o6.j.e(aVar2, "db");
                            qVar.f15250a.m(aVar2);
                        }
                    }
                    this.f15251a = true;
                }
            }
            z8 = false;
            AbstractC0837b.d(L8, null);
            c0.g gVar2 = this.f15254d;
            if (!z8) {
            }
            gVar2.s(aVar);
            while (r0.hasNext()) {
            }
            this.f15251a = true;
        } catch (Throwable th3) {
            try {
                throw th3;
            } finally {
            }
        }
    }

    public final void g(D0.a aVar) {
        E2.b.p(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = (String) this.f15254d.f9383b;
        o6.j.e(str, "hash");
        E2.b.p(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    public r(C1610a c1610a, C1234e c1234e) {
        this.f15253c = c1610a;
        this.f15254d = new c0.g(-1, "", "");
        List list = c1610a.f15207e;
        a6.s sVar = a6.s.f7766d;
        this.f15255e = list == null ? sVar : list;
        ArrayList D02 = AbstractC0436k.D0(list == null ? sVar : list, new q(new C1429a(3, this)));
        Context context = c1610a.f15203a;
        String str = c1610a.f15204b;
        G5.e eVar = c1610a.f15205c;
        C1.a aVar = c1610a.f15206d;
        boolean z8 = c1610a.f15208f;
        t tVar = c1610a.f15209g;
        Executor executor = c1610a.f15210h;
        Executor executor2 = c1610a.f15211i;
        Intent intent = c1610a.j;
        boolean z9 = c1610a.k;
        boolean z10 = c1610a.f15212l;
        Set set = c1610a.f15213m;
        String str2 = c1610a.f15214n;
        File file = c1610a.f15215o;
        Callable callable = c1610a.f15216p;
        List list2 = c1610a.f15217q;
        List list3 = c1610a.f15218r;
        boolean z11 = c1610a.f15219s;
        D0.b bVar = c1610a.f15220t;
        InterfaceC0622h interfaceC0622h = c1610a.f15221u;
        o6.j.e(context, "context");
        o6.j.e(aVar, "migrationContainer");
        o6.j.e(executor, "queryExecutor");
        o6.j.e(executor2, "transactionExecutor");
        o6.j.e(list2, "typeConverters");
        o6.j.e(list3, "autoMigrationSpecs");
        c1234e.m(new C1610a(context, str, eVar, aVar, D02, z8, tVar, executor, executor2, intent, z9, z10, set, str2, file, callable, list2, list3, z11, bVar, interfaceC0622h));
        throw null;
    }
}
