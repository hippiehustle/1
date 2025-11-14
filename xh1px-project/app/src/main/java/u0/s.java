package u0;

import L7.AbstractC0166y;
import L7.S;
import android.app.ActivityManager;
import android.content.Context;
import d6.InterfaceC0622h;
import i.ExecutorC0875n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import o3.C1234e;
import p.C1290b;
import p.ExecutorC1289a;
import u6.InterfaceC1642c;
import y0.AbstractC1829a;
import z0.AbstractC1851a;
import z0.AbstractC1852b;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1642c f15258a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15259b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15260c;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorC1289a f15263f;

    /* renamed from: g, reason: collision with root package name */
    public ExecutorC1289a f15264g;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15261d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15262e = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final t f15265h = t.f15271d;

    /* renamed from: i, reason: collision with root package name */
    public final long f15266i = -1;
    public final C1.a j = new C1.a(4);
    public final LinkedHashSet k = new LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f15267l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f15268m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f15269n = true;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f15270o = true;

    public s(Context context, Class cls, String str) {
        this.f15258a = h2.a.n(cls);
        this.f15259b = context;
        this.f15260c = str;
    }

    public final void a(AbstractC1829a... abstractC1829aArr) {
        for (AbstractC1829a abstractC1829a : abstractC1829aArr) {
            Integer valueOf = Integer.valueOf(abstractC1829a.f16457a);
            LinkedHashSet linkedHashSet = this.f15267l;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(abstractC1829a.f16458b));
        }
        AbstractC1829a[] abstractC1829aArr2 = (AbstractC1829a[]) Arrays.copyOf(abstractC1829aArr, abstractC1829aArr.length);
        C1.a aVar = this.j;
        aVar.getClass();
        o6.j.e(abstractC1829aArr2, "migrations");
        for (AbstractC1829a abstractC1829a2 : abstractC1829aArr2) {
            aVar.b(abstractC1829a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0390  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u b() {
        ActivityManager activityManager;
        String str;
        String str2;
        c0.g gVar;
        E0.b bVar;
        r rVar;
        E0.b bVar2;
        boolean z8;
        ExecutorC1289a executorC1289a = this.f15263f;
        if (executorC1289a == null && this.f15264g == null) {
            ExecutorC1289a executorC1289a2 = C1290b.f13646c;
            this.f15264g = executorC1289a2;
            this.f15263f = executorC1289a2;
        } else if (executorC1289a != null && this.f15264g == null) {
            this.f15264g = executorC1289a;
        } else if (executorC1289a == null) {
            this.f15263f = this.f15264g;
        }
        LinkedHashSet linkedHashSet = this.f15267l;
        o6.j.e(linkedHashSet, "migrationStartAndEndVersions");
        LinkedHashSet linkedHashSet2 = this.k;
        o6.j.e(linkedHashSet2, "migrationsNotRequiredFrom");
        if (!linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    throw new IllegalArgumentException(A.j.l("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue).toString());
                }
            }
        }
        G5.e eVar = new G5.e(3);
        if (this.f15266i > 0) {
            if (this.f15260c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        t tVar = this.f15265h;
        tVar.getClass();
        Context context = this.f15259b;
        o6.j.e(context, "context");
        if (tVar == t.f15271d) {
            Object systemService = context.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                activityManager = (ActivityManager) systemService;
            } else {
                activityManager = null;
            }
            if (activityManager != null && !activityManager.isLowRamDevice()) {
                tVar = t.f15273f;
            } else {
                tVar = t.f15272e;
            }
        }
        t tVar2 = tVar;
        ExecutorC1289a executorC1289a3 = this.f15263f;
        if (executorC1289a3 != null) {
            ExecutorC1289a executorC1289a4 = this.f15264g;
            if (executorC1289a4 != null) {
                C1610a c1610a = new C1610a(context, this.f15260c, eVar, this.j, this.f15261d, false, tVar2, executorC1289a3, executorC1289a4, null, this.f15269n, false, linkedHashSet2, null, null, null, this.f15262e, this.f15268m, false, null, null);
                c1610a.f15222v = this.f15270o;
                Class k = h2.a.k(this.f15258a);
                Package r42 = k.getPackage();
                if (r42 == null || (str = r42.getName()) == null) {
                    str = "";
                }
                String canonicalName = k.getCanonicalName();
                o6.j.b(canonicalName);
                if (str.length() != 0) {
                    canonicalName = canonicalName.substring(str.length() + 1);
                    o6.j.d(canonicalName, "substring(...)");
                }
                String concat = I7.v.Y(canonicalName, '.', '_').concat("_Impl");
                try {
                    if (str.length() == 0) {
                        str2 = concat;
                    } else {
                        str2 = str + '.' + concat;
                    }
                    Class<?> cls = Class.forName(str2, true, k.getClassLoader());
                    o6.j.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
                    u uVar = (u) cls.getDeclaredConstructor(null).newInstance(null);
                    uVar.getClass();
                    uVar.k = c1610a.f15222v;
                    try {
                        gVar = uVar.d();
                        o6.j.c(gVar, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
                    } catch (Z5.i unused) {
                        gVar = null;
                    }
                    if (gVar != null) {
                        uVar.f15279e = new r(c1610a, gVar);
                        uVar.f15280f = uVar.c();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Set g8 = uVar.g();
                        List list = c1610a.f15218r;
                        int size = list.size();
                        boolean[] zArr = new boolean[size];
                        Iterator it2 = g8.iterator();
                        while (true) {
                            int i4 = -1;
                            if (it2.hasNext()) {
                                InterfaceC1642c interfaceC1642c = (InterfaceC1642c) it2.next();
                                int size2 = list.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i8 = size2 - 1;
                                        if (interfaceC1642c.b(list.get(size2))) {
                                            zArr[size2] = true;
                                            i4 = size2;
                                            break;
                                        }
                                        if (i8 < 0) {
                                            break;
                                        }
                                        size2 = i8;
                                    }
                                }
                                if (i4 >= 0) {
                                    linkedHashMap.put(interfaceC1642c, list.get(i4));
                                } else {
                                    throw new IllegalArgumentException(("A required auto migration spec (" + interfaceC1642c.a() + ") is missing in the database configuration.").toString());
                                }
                            } else {
                                int size3 = list.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i9 = size3 - 1;
                                        if (size3 >= size || !zArr[size3]) {
                                            break;
                                        }
                                        if (i9 < 0) {
                                            break;
                                        }
                                        size3 = i9;
                                    }
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                                for (AbstractC1829a abstractC1829a : uVar.b(linkedHashMap)) {
                                    int i10 = abstractC1829a.f16457a;
                                    int i11 = abstractC1829a.f16458b;
                                    C1.a aVar = c1610a.f15206d;
                                    LinkedHashMap linkedHashMap2 = aVar.f561a;
                                    if (linkedHashMap2.containsKey(Integer.valueOf(i10))) {
                                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i10));
                                        if (map == null) {
                                            map = a6.t.f7767d;
                                        }
                                        z8 = map.containsKey(Integer.valueOf(i11));
                                    } else {
                                        z8 = false;
                                    }
                                    if (!z8) {
                                        aVar.b(abstractC1829a);
                                    }
                                }
                                LinkedHashMap h8 = uVar.h();
                                List list2 = c1610a.f15217q;
                                boolean[] zArr2 = new boolean[list2.size()];
                                for (Map.Entry entry : h8.entrySet()) {
                                    InterfaceC1642c interfaceC1642c2 = (InterfaceC1642c) entry.getKey();
                                    for (InterfaceC1642c interfaceC1642c3 : (List) entry.getValue()) {
                                        int size4 = list2.size() - 1;
                                        if (size4 >= 0) {
                                            while (true) {
                                                int i12 = size4 - 1;
                                                if (interfaceC1642c3.b(list2.get(size4))) {
                                                    zArr2[size4] = true;
                                                    break;
                                                }
                                                if (i12 < 0) {
                                                    break;
                                                }
                                                size4 = i12;
                                            }
                                        }
                                        size4 = -1;
                                        if (size4 >= 0) {
                                            Object obj = list2.get(size4);
                                            o6.j.e(interfaceC1642c3, "kclass");
                                            o6.j.e(obj, "converter");
                                            uVar.j.put(interfaceC1642c3, obj);
                                        } else {
                                            throw new IllegalArgumentException(("A required type converter (" + interfaceC1642c3.a() + ") for " + interfaceC1642c2.a() + " is missing in the database configuration.").toString());
                                        }
                                    }
                                }
                                int size5 = list2.size() - 1;
                                if (size5 >= 0) {
                                    while (true) {
                                        int i13 = size5 - 1;
                                        if (zArr2[size5]) {
                                            if (i13 < 0) {
                                                break;
                                            }
                                            size5 = i13;
                                        } else {
                                            throw new IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                        }
                                    }
                                }
                                uVar.f15277c = c1610a.f15210h;
                                uVar.f15278d = new ExecutorC0875n(c1610a.f15211i);
                                Executor executor = uVar.f15277c;
                                if (executor != null) {
                                    if (executor instanceof L7.E) {
                                    }
                                    Q7.d b4 = AbstractC0166y.b(E2.d.C(new S(executor), AbstractC0166y.c()));
                                    uVar.f15275a = b4;
                                    InterfaceC0622h interfaceC0622h = b4.f4940d;
                                    ExecutorC0875n executorC0875n = uVar.f15278d;
                                    if (executorC0875n != null) {
                                        uVar.f15276b = interfaceC0622h.D(new S(executorC0875n));
                                        uVar.f15282h = c1610a.f15208f;
                                        r rVar2 = uVar.f15279e;
                                        if (rVar2 != null) {
                                            E0.b c6 = rVar2.c();
                                            if (c6 != null) {
                                                bVar = c6;
                                                while (!(bVar instanceof AbstractC1852b)) {
                                                    if (bVar instanceof InterfaceC1611b) {
                                                        bVar = ((InterfaceC1611b) bVar).a();
                                                    }
                                                }
                                                rVar = uVar.f15279e;
                                                if (rVar == null) {
                                                    E0.b c9 = rVar.c();
                                                    if (c9 != null) {
                                                        bVar2 = c9;
                                                        while (!(bVar2 instanceof AbstractC1851a)) {
                                                            if (bVar2 instanceof InterfaceC1611b) {
                                                                bVar2 = ((InterfaceC1611b) bVar2).a();
                                                            }
                                                        }
                                                        return uVar;
                                                    }
                                                    bVar2 = null;
                                                    return uVar;
                                                }
                                                o6.j.i("connectionManager");
                                                throw null;
                                            }
                                            bVar = null;
                                            rVar = uVar.f15279e;
                                            if (rVar == null) {
                                            }
                                        } else {
                                            o6.j.i("connectionManager");
                                            throw null;
                                        }
                                    } else {
                                        o6.j.i("internalTransactionExecutor");
                                        throw null;
                                    }
                                } else {
                                    o6.j.i("internalQueryExecutor");
                                    throw null;
                                }
                            }
                        }
                    } else {
                        new r(c1610a, new C1234e(uVar));
                        throw null;
                    }
                } catch (ClassNotFoundException e9) {
                    throw new RuntimeException("Cannot find implementation for " + k.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e9);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot access the constructor " + k.getCanonicalName(), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Failed to create an instance of " + k.getCanonicalName(), e11);
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
