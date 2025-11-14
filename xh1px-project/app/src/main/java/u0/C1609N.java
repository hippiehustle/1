package u0;

import L7.AbstractC0166y;
import L7.C0162u;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import i.AbstractC0863b;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.AbstractC1149a;
import n6.InterfaceC1162a;
import o3.C1234e;
import o3.C1235f;
import t0.C1536c;

/* renamed from: u0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1609N {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f15193l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final u f15194a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15195b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f15196c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15197d;

    /* renamed from: e, reason: collision with root package name */
    public final W4.i f15198e;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f15200g;

    /* renamed from: h, reason: collision with root package name */
    public final C1621l f15201h;

    /* renamed from: i, reason: collision with root package name */
    public final C1.f f15202i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public InterfaceC1162a k = new C1235f(4);

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f15199f = new LinkedHashMap();

    public C1609N(u uVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z8, W4.i iVar) {
        String str;
        this.f15194a = uVar;
        this.f15195b = linkedHashMap;
        this.f15196c = linkedHashMap2;
        this.f15197d = z8;
        this.f15198e = iVar;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str2 = strArr[i4];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            o6.j.d(lowerCase, "toLowerCase(...)");
            this.f15199f.put(lowerCase, Integer.valueOf(i4));
            String str3 = (String) this.f15195b.get(strArr[i4]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                o6.j.d(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i4] = lowerCase;
        }
        this.f15200g = strArr2;
        for (Map.Entry entry : this.f15195b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            o6.j.d(lowerCase2, "toLowerCase(...)");
            if (this.f15199f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                o6.j.d(lowerCase3, "toLowerCase(...)");
                LinkedHashMap linkedHashMap3 = this.f15199f;
                linkedHashMap3.put(lowerCase3, a6.x.M0(linkedHashMap3, lowerCase2));
            }
        }
        this.f15201h = new C1621l(this.f15200g.length);
        this.f15202i = new C1.f(this.f15200g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C1609N c1609n, InterfaceC1624o interfaceC1624o, AbstractC0713c abstractC0713c) {
        C1596A c1596a;
        int i4;
        Set set;
        if (abstractC0713c instanceof C1596A) {
            c1596a = (C1596A) abstractC0713c;
            int i8 = c1596a.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1596a.j = i8 - Integer.MIN_VALUE;
                Object obj = c1596a.f15147h;
                i4 = c1596a.j;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Set set2 = (Set) c1596a.f15146g;
                            Z5.a.d(obj);
                            return set2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC1624o = (InterfaceC1624o) c1596a.f15146g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    C1234e c1234e = new C1234e(12);
                    c1596a.f15146g = interfaceC1624o;
                    c1596a.j = 1;
                    obj = interfaceC1624o.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", c1234e, c1596a);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    c1596a.f15146g = set;
                    c1596a.j = 2;
                    if (AbstractC0863b.e(interfaceC1624o, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", c1596a) == enumC0646a) {
                        return enumC0646a;
                    }
                }
                return set;
            }
        }
        c1596a = new C1596A(c1609n, abstractC0713c);
        Object obj2 = c1596a.f15147h;
        i4 = c1596a.j;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #0 {all -> 0x008d, blocks: (B:13:0x007a, B:15:0x0082, B:32:0x0046, B:36:0x0053, B:40:0x0065), top: B:31:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(C1609N c1609n, AbstractC0713c abstractC0713c) {
        C1600E c1600e;
        int i4;
        C1536c c1536c;
        Object n3;
        Throwable th;
        C1536c c1536c2;
        Set set;
        u uVar = c1609n.f15194a;
        if (abstractC0713c instanceof C1600E) {
            c1600e = (C1600E) abstractC0713c;
            int i8 = c1600e.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1600e.k = i8 - Integer.MIN_VALUE;
                Object obj = c1600e.f15159i;
                i4 = c1600e.k;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c1536c2 = c1600e.f15158h;
                        C1609N c1609n2 = c1600e.f15157g;
                        try {
                            Z5.a.d(obj);
                            c1536c = c1536c2;
                            c1609n = c1609n2;
                            n3 = obj;
                        } catch (Throwable th2) {
                            th = th2;
                            c1536c2.x();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    c1536c = uVar.f15281g;
                    boolean e9 = c1536c.e();
                    a6.u uVar2 = a6.u.f7768d;
                    if (e9) {
                        try {
                            if (!c1609n.j.compareAndSet(true, false)) {
                                c1536c.x();
                                return uVar2;
                            }
                            if (!((Boolean) c1609n.k.a()).booleanValue()) {
                                c1536c.x();
                                return uVar2;
                            }
                            C1602G c1602g = new C1602G(c1609n, null);
                            c1600e.f15157g = c1609n;
                            c1600e.f15158h = c1536c;
                            c1600e.k = 1;
                            n3 = uVar.n(false, c1602g, c1600e);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n3 == enumC0646a) {
                                return enumC0646a;
                            }
                        } catch (Throwable th3) {
                            C1536c c1536c3 = c1536c;
                            th = th3;
                            c1536c2 = c1536c3;
                            c1536c2.x();
                            throw th;
                        }
                    } else {
                        return uVar2;
                    }
                }
                set = (Set) n3;
                if (!set.isEmpty()) {
                    c1609n.f15202i.c(set);
                    c1609n.f15198e.m(set);
                }
                c1536c.x();
                return set;
            }
        }
        c1600e = new C1600E(c1609n, abstractC0713c);
        Object obj2 = c1600e.f15159i;
        i4 = c1600e.k;
        if (i4 == 0) {
        }
        set = (Set) n3;
        if (!set.isEmpty()) {
        }
        c1536c.x();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        if (i.AbstractC0863b.e(r6, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00dd, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [u0.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00db -> B:11:0x00de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(C1609N c1609n, z zVar, int i4, AbstractC0713c abstractC0713c) {
        C1604I c1604i;
        int i8;
        z zVar2;
        String[] strArr;
        C1609N c1609n2;
        int i9;
        InterfaceC1624o interfaceC1624o;
        int i10;
        String str;
        String str2;
        c1609n.getClass();
        if (abstractC0713c instanceof C1604I) {
            c1604i = (C1604I) abstractC0713c;
            int i11 = c1604i.f15173p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1604i.f15173p = i11 - Integer.MIN_VALUE;
                Object obj = c1604i.f15171n;
                i8 = c1604i.f15173p;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i8 == 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            i9 = c1604i.f15170m;
                            i10 = c1604i.f15169l;
                            i4 = c1604i.k;
                            strArr = c1604i.j;
                            str = c1604i.f15168i;
                            interfaceC1624o = c1604i.f15167h;
                            c1609n2 = c1604i.f15166g;
                            Z5.a.d(obj);
                            i10++;
                            if (i10 < i9) {
                                String str3 = strArr[i10];
                                if (c1609n2.f15197d) {
                                    str2 = "TEMP";
                                } else {
                                    str2 = "";
                                }
                                StringBuilder sb = new StringBuilder("CREATE ");
                                sb.append(str2);
                                sb.append(" TRIGGER IF NOT EXISTS `");
                                sb.append("room_table_modification_trigger_" + str + '_' + str3);
                                sb.append("` AFTER ");
                                AbstractC1149a.m(sb, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                                String h8 = AbstractC1149a.h(sb, i4, " AND invalidated = 0; END");
                                c1604i.f15166g = c1609n2;
                                c1604i.f15167h = interfaceC1624o;
                                c1604i.f15168i = str;
                                c1604i.j = strArr;
                                c1604i.k = i4;
                                c1604i.f15169l = i10;
                                c1604i.f15170m = i9;
                                c1604i.f15173p = 2;
                            } else {
                                return Z5.y.f7506a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i4 = c1604i.k;
                        ?? r13 = c1604i.f15167h;
                        c1609n = c1604i.f15166g;
                        Z5.a.d(obj);
                        zVar2 = r13;
                    }
                } else {
                    Z5.a.d(obj);
                    c1604i.f15166g = c1609n;
                    c1604i.f15167h = zVar;
                    c1604i.k = i4;
                    c1604i.f15173p = 1;
                    Object e9 = AbstractC0863b.e(zVar, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i4 + ", 0)", c1604i);
                    zVar2 = zVar;
                }
                String str4 = c1609n.f15200g[i4];
                strArr = f15193l;
                c1609n2 = c1609n;
                i9 = 3;
                interfaceC1624o = zVar2;
                i10 = 0;
                str = str4;
                if (i10 < i9) {
                }
            }
        }
        c1604i = new C1604I(c1609n, abstractC0713c);
        Object obj2 = c1604i.f15171n;
        i8 = c1604i.f15173p;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i8 == 0) {
        }
        String str42 = c1609n.f15200g[i4];
        strArr = f15193l;
        c1609n2 = c1609n;
        i9 = 3;
        interfaceC1624o = zVar2;
        i10 = 0;
        str = str42;
        if (i10 < i9) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v5, types: [u0.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008d -> B:10:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(C1609N c1609n, z zVar, int i4, AbstractC0713c abstractC0713c) {
        C1605J c1605j;
        int i8;
        String str;
        int i9;
        z zVar2;
        int i10;
        String[] strArr;
        c1609n.getClass();
        if (abstractC0713c instanceof C1605J) {
            c1605j = (C1605J) abstractC0713c;
            int i11 = c1605j.f15179n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1605j.f15179n = i11 - Integer.MIN_VALUE;
                Object obj = c1605j.f15177l;
                i8 = c1605j.f15179n;
                if (i8 == 0) {
                    if (i8 == 1) {
                        i9 = c1605j.k;
                        i10 = c1605j.j;
                        String[] strArr2 = c1605j.f15176i;
                        str = c1605j.f15175h;
                        ?? r32 = c1605j.f15174g;
                        Z5.a.d(obj);
                        strArr = strArr2;
                        zVar2 = r32;
                        i10++;
                        if (i10 < i9) {
                            String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i10]) + '`';
                            c1605j.f15174g = zVar2;
                            c1605j.f15175h = str;
                            c1605j.f15176i = strArr;
                            c1605j.j = i10;
                            c1605j.k = i9;
                            c1605j.f15179n = 1;
                            Object e9 = AbstractC0863b.e(zVar2, str2, c1605j);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (e9 == enumC0646a) {
                                return enumC0646a;
                            }
                            i10++;
                            if (i10 < i9) {
                                return Z5.y.f7506a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    str = c1609n.f15200g[i4];
                    i9 = 3;
                    zVar2 = zVar;
                    i10 = 0;
                    strArr = f15193l;
                    if (i10 < i9) {
                    }
                }
            }
        }
        c1605j = new C1605J(c1609n, abstractC0713c);
        Object obj2 = c1605j.f15177l;
        i8 = c1605j.f15179n;
        if (i8 == 0) {
        }
    }

    public final void e(InterfaceC1162a interfaceC1162a, InterfaceC1162a interfaceC1162a2) {
        o6.j.e(interfaceC1162a, "onRefreshScheduled");
        o6.j.e(interfaceC1162a2, "onRefreshCompleted");
        if (this.j.compareAndSet(false, true)) {
            interfaceC1162a.a();
            Q7.d dVar = this.f15194a.f15275a;
            if (dVar != null) {
                AbstractC0166y.q(dVar, new C0162u(), null, new C1603H(this, interfaceC1162a2, null), 2);
            } else {
                o6.j.i("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC0713c abstractC0713c) {
        C1606K c1606k;
        int i4;
        C1536c c1536c;
        if (abstractC0713c instanceof C1606K) {
            c1606k = (C1606K) abstractC0713c;
            int i8 = c1606k.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1606k.j = i8 - Integer.MIN_VALUE;
                Object obj = c1606k.f15181h;
                i4 = c1606k.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c1536c = c1606k.f15180g;
                        try {
                            Z5.a.d(obj);
                        } catch (Throwable th) {
                            th = th;
                            c1536c.x();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    u uVar = this.f15194a;
                    C1536c c1536c2 = uVar.f15281g;
                    if (c1536c2.e()) {
                        try {
                            C1608M c1608m = new C1608M(this, null);
                            c1606k.f15180g = c1536c2;
                            c1606k.j = 1;
                            Object n3 = uVar.n(false, c1608m, c1606k);
                            EnumC0646a enumC0646a = EnumC0646a.f10656d;
                            if (n3 == enumC0646a) {
                                return enumC0646a;
                            }
                            c1536c = c1536c2;
                        } catch (Throwable th2) {
                            th = th2;
                            c1536c = c1536c2;
                            c1536c.x();
                            throw th;
                        }
                    }
                    return Z5.y.f7506a;
                }
                c1536c.x();
                return Z5.y.f7506a;
            }
        }
        c1606k = new C1606K(this, abstractC0713c);
        Object obj2 = c1606k.f15181h;
        i4 = c1606k.j;
        if (i4 == 0) {
        }
        c1536c.x();
        return Z5.y.f7506a;
    }
}
