package z4;

import O7.U;
import O7.V;
import O7.i0;
import Z5.y;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a6.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import h4.AbstractC0832f;
import i.AbstractC0863b;
import j2.C0902b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k2.C0952b;
import l2.C1001a;
import s2.p;
import v2.InterfaceC1661a;
import x5.q;

/* renamed from: z4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866j implements v2.j {

    /* renamed from: i, reason: collision with root package name */
    public boolean f16666i;
    public boolean j;
    public C1001a k;

    /* renamed from: m, reason: collision with root package name */
    public Long f16668m;

    /* renamed from: n, reason: collision with root package name */
    public Long f16669n;

    /* renamed from: o, reason: collision with root package name */
    public final i0 f16670o;

    /* renamed from: p, reason: collision with root package name */
    public final i0 f16671p;

    /* renamed from: q, reason: collision with root package name */
    public final i0 f16672q;

    /* renamed from: r, reason: collision with root package name */
    public final i0 f16673r;

    /* renamed from: s, reason: collision with root package name */
    public final U f16674s;

    /* renamed from: d, reason: collision with root package name */
    public final U7.c f16661d = new U7.c();

    /* renamed from: e, reason: collision with root package name */
    public final C1868l f16662e = new C1868l();

    /* renamed from: f, reason: collision with root package name */
    public final C1868l f16663f = new C1868l();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f16664g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f16665h = new LinkedHashMap();

    /* renamed from: l, reason: collision with root package name */
    public List f16667l = s.f7766d;

    public C1866j() {
        i0 c6 = V.c(Boolean.FALSE);
        this.f16670o = c6;
        this.f16671p = c6;
        i0 c9 = V.c(null);
        this.f16672q = c9;
        this.f16673r = c9;
        this.f16674s = V.b(7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004a, B:18:0x0054, B:20:0x0058, B:21:0x0062, B:23:0x007e, B:24:0x0086), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // v2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(C0902b c0902b, InterfaceC0617c interfaceC0617c) {
        C1858b c1858b;
        int i4;
        C0902b c0902b2;
        U7.c cVar;
        boolean z8;
        try {
            if (interfaceC0617c instanceof C1858b) {
                c1858b = (C1858b) interfaceC0617c;
                int i8 = c1858b.k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c1858b.k = i8 - Integer.MIN_VALUE;
                    Object obj = c1858b.f16635i;
                    i4 = c1858b.k;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = c1858b.f16634h;
                            c0902b2 = c1858b.f16633g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        c1858b.f16633g = c0902b;
                        U7.c cVar2 = this.f16661d;
                        c1858b.f16634h = cVar2;
                        c1858b.k = 1;
                        Object d2 = cVar2.d(c1858b);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        c0902b2 = c0902b;
                        cVar = cVar2;
                    }
                    z8 = this.j;
                    y yVar = y.f7506a;
                    if (z8) {
                        cVar.a(null);
                        return yVar;
                    }
                    if (this.f16669n != null) {
                        Log.w("DebugEngine", "onConditionProcessingStarted called without a complete");
                    }
                    this.f16669n = new Long(c0902b2.f11789a.f12187a);
                    LinkedHashMap linkedHashMap = this.f16665h;
                    Long l6 = new Long(c0902b2.f11789a.f12187a);
                    Object obj2 = linkedHashMap.get(l6);
                    if (obj2 == null) {
                        obj2 = new C1857a();
                        linkedHashMap.put(l6, obj2);
                    }
                    ((C1857a) obj2).f16678a.f16681a = System.currentTimeMillis();
                    cVar.a(null);
                    return yVar;
                }
            }
            z8 = this.j;
            y yVar2 = y.f7506a;
            if (z8) {
            }
        } catch (Throwable th) {
            cVar.a(null);
            throw th;
        }
        c1858b = new C1858b(this, (AbstractC0713c) interfaceC0617c);
        Object obj3 = c1858b.f16635i;
        i4 = c1858b.k;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0062 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #0 {all -> 0x00a7, blocks: (B:12:0x0054, B:18:0x0066, B:20:0x009c), top: B:11:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // v2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(Context context, C1001a c1001a, List list, InterfaceC0617c interfaceC0617c) {
        C1865i c1865i;
        int i4;
        Context context2;
        U7.c cVar;
        boolean booleanValue;
        i0 i0Var = this.f16670o;
        try {
            if (interfaceC0617c instanceof C1865i) {
                c1865i = (C1865i) interfaceC0617c;
                int i8 = c1865i.f16660m;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c1865i.f16660m = i8 - Integer.MIN_VALUE;
                    Object obj = c1865i.k;
                    i4 = c1865i.f16660m;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = c1865i.j;
                            list = c1865i.f16658i;
                            c1001a = c1865i.f16657h;
                            context2 = c1865i.f16656g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        c1865i.f16656g = context;
                        c1865i.f16657h = c1001a;
                        c1865i.f16658i = list;
                        U7.c cVar2 = this.f16661d;
                        c1865i.j = cVar2;
                        c1865i.f16660m = 1;
                        Object d2 = cVar2.d(c1865i);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        context2 = context;
                        cVar = cVar2;
                    }
                    booleanValue = ((Boolean) i0Var.f()).booleanValue();
                    y yVar = y.f7506a;
                    if (!booleanValue) {
                        return yVar;
                    }
                    Boolean bool = Boolean.TRUE;
                    i0Var.getClass();
                    i0Var.h(null, bool);
                    this.f16672q.g(null);
                    SharedPreferences h8 = AbstractC0863b.h(context2);
                    this.f16666i = AbstractC0863b.j(h8, context2);
                    this.j = h8.getBoolean("Debug_Report_Enabled", context2.getResources().getBoolean(R.bool.default_debug_report_enabled));
                    this.k = c1001a;
                    this.f16667l = AbstractC0436k.Q0(list);
                    if (this.j) {
                        this.f16662e.f16678a.f16681a = System.currentTimeMillis();
                    }
                    return yVar;
                }
            }
            booleanValue = ((Boolean) i0Var.f()).booleanValue();
            y yVar2 = y.f7506a;
            if (!booleanValue) {
            }
        } finally {
            cVar.a(null);
        }
        c1865i = new C1865i(this, (AbstractC0713c) interfaceC0617c);
        Object obj2 = c1865i.k;
        i4 = c1865i.f16660m;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // v2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(InterfaceC0617c interfaceC0617c) {
        C1859c c1859c;
        int i4;
        U7.c cVar;
        try {
            if (interfaceC0617c instanceof C1859c) {
                c1859c = (C1859c) interfaceC0617c;
                int i8 = c1859c.j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c1859c.j = i8 - Integer.MIN_VALUE;
                    Object obj = c1859c.f16637h;
                    i4 = c1859c.j;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = c1859c.f16636g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        U7.c cVar2 = this.f16661d;
                        c1859c.f16636g = cVar2;
                        c1859c.j = 1;
                        Object d2 = cVar2.d(c1859c);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        cVar = cVar2;
                    }
                    this.f16668m = null;
                    this.f16669n = null;
                    return y.f7506a;
                }
            }
            this.f16668m = null;
            this.f16669n = null;
            return y.f7506a;
        } finally {
            cVar.a(null);
        }
        c1859c = new C1859c(this, (AbstractC0713c) interfaceC0617c);
        Object obj2 = c1859c.f16637h;
        i4 = c1859c.j;
        if (i4 == 0) {
        }
    }

    @Override // v2.j
    public final y R(InterfaceC1661a interfaceC1661a) {
        C1857a c1857a;
        boolean z8 = this.j;
        y yVar = y.f7506a;
        if (!z8) {
            return yVar;
        }
        Long l6 = this.f16669n;
        if (l6 == null) {
            Log.w("DebugEngine", "onConditionProcessingCompleted called before start");
            return yVar;
        }
        if ((interfaceC1661a instanceof p) && (c1857a = (C1857a) this.f16665h.get(l6)) != null) {
            p pVar = (p) interfaceC1661a;
            c1857a.d(pVar.f14494b, new Double(pVar.f14497e));
        }
        this.f16669n = null;
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x0045, B:18:0x004f), top: B:11:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // v2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(InterfaceC0617c interfaceC0617c) {
        C1863g c1863g;
        int i4;
        U7.c cVar;
        boolean z8;
        try {
            if (interfaceC0617c instanceof C1863g) {
                c1863g = (C1863g) interfaceC0617c;
                int i8 = c1863g.j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c1863g.j = i8 - Integer.MIN_VALUE;
                    Object obj = c1863g.f16651h;
                    i4 = c1863g.j;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = c1863g.f16650g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        U7.c cVar2 = this.f16661d;
                        c1863g.f16650g = cVar2;
                        c1863g.j = 1;
                        Object d2 = cVar2.d(c1863g);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        cVar = cVar2;
                    }
                    z8 = this.j;
                    y yVar = y.f7506a;
                    if (z8) {
                        return yVar;
                    }
                    this.f16663f.f16678a.f16681a = System.currentTimeMillis();
                    return yVar;
                }
            }
            z8 = this.j;
            y yVar2 = y.f7506a;
            if (z8) {
            }
        } finally {
            cVar.a(null);
        }
        c1863g = new C1863g(this, (AbstractC0713c) interfaceC0617c);
        Object obj2 = c1863g.f16651h;
        i4 = c1863g.j;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f A[Catch: all -> 0x0058, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0045, B:18:0x004f), top: B:11:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // v2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(InterfaceC0617c interfaceC0617c) {
        C1862f c1862f;
        int i4;
        U7.c cVar;
        boolean z8;
        try {
            if (interfaceC0617c instanceof C1862f) {
                c1862f = (C1862f) interfaceC0617c;
                int i8 = c1862f.j;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c1862f.j = i8 - Integer.MIN_VALUE;
                    Object obj = c1862f.f16648h;
                    i4 = c1862f.j;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = c1862f.f16647g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        U7.c cVar2 = this.f16661d;
                        c1862f.f16647g = cVar2;
                        c1862f.j = 1;
                        Object d2 = cVar2.d(c1862f);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        cVar = cVar2;
                    }
                    z8 = this.j;
                    y yVar = y.f7506a;
                    if (z8) {
                        return yVar;
                    }
                    this.f16663f.b(true);
                    return yVar;
                }
            }
            z8 = this.j;
            y yVar2 = y.f7506a;
            if (z8) {
            }
        } finally {
            cVar.a(null);
        }
        c1862f = new C1862f(this, (AbstractC0713c) interfaceC0617c);
        Object obj2 = c1862f.f16648h;
        i4 = c1862f.j;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[Catch: all -> 0x0037, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:12:0x0033, B:17:0x0077, B:23:0x008a), top: B:11:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[Catch: all -> 0x00df, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:14:0x006f, B:21:0x0083, B:26:0x0095, B:27:0x00ad, B:30:0x00b5, B:32:0x00d5, B:36:0x00f6, B:37:0x00e3, B:40:0x0102, B:41:0x011b, B:44:0x0125, B:46:0x0140, B:48:0x015a, B:50:0x0164, B:53:0x0184, B:57:0x0194, B:59:0x01b8, B:63:0x019a, B:65:0x01d7), top: B:13:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // v2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(InterfaceC0617c interfaceC0617c) {
        C1864h c1864h;
        int i4;
        EnumC0646a enumC0646a;
        int i8;
        U7.a aVar;
        U7.a aVar2;
        U u8;
        Object obj;
        boolean z8;
        LinkedHashMap linkedHashMap;
        y yVar;
        Iterator it;
        C1001a c1001a;
        C4.a aVar3;
        long j;
        double d2;
        double d3;
        C4.g gVar;
        C1868l c1868l = this.f16663f;
        C1868l c1868l2 = this.f16662e;
        try {
            if (interfaceC0617c instanceof C1864h) {
                c1864h = (C1864h) interfaceC0617c;
                int i9 = c1864h.k;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c1864h.k = i9 - Integer.MIN_VALUE;
                    Object obj2 = c1864h.f16655i;
                    i4 = c1864h.k;
                    enumC0646a = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                aVar2 = c1864h.f16653g;
                                try {
                                    Z5.a.d(obj2);
                                } catch (Throwable th) {
                                    th = th;
                                    obj = null;
                                    aVar2.a(obj);
                                    throw th;
                                }
                                try {
                                    z8 = this.j;
                                    i0 i0Var = this.f16670o;
                                    y yVar2 = y.f7506a;
                                    if (z8) {
                                        Boolean bool = Boolean.FALSE;
                                        i0Var.getClass();
                                        i0Var.h(null, bool);
                                        aVar2.a(null);
                                        return yVar2;
                                    }
                                    c1868l2.b(true);
                                    C1001a c1001a2 = this.k;
                                    if (c1001a2 == null) {
                                        Log.w("DebugEngine", "onSessionEnded scenario is not defined");
                                        aVar2.a(null);
                                        return yVar2;
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    List list = this.f16667l;
                                    ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
                                    Iterator it2 = list.iterator();
                                    long j5 = 0;
                                    while (true) {
                                        boolean hasNext = it2.hasNext();
                                        linkedHashMap = this.f16664g;
                                        if (!hasNext) {
                                            break;
                                        }
                                        C0952b c0952b = (C0952b) it2.next();
                                        arrayList.addAll(c0952b.f11964f);
                                        ArrayList arrayList3 = arrayList;
                                        C1868l c1868l3 = (C1868l) linkedHashMap.get(new Long(c0952b.f11959a.f12187a));
                                        if (c1868l3 != null) {
                                            j5 += c1868l3.f16680c;
                                            gVar = c1868l3.c();
                                            if (gVar != null) {
                                                arrayList2.add(new Z5.j(c0952b, gVar));
                                                arrayList = arrayList3;
                                            }
                                        }
                                        gVar = new C4.g(0L, 0L, 0L, 0L, 0L, 0L);
                                        arrayList2.add(new Z5.j(c0952b, gVar));
                                        arrayList = arrayList3;
                                    }
                                    ArrayList arrayList4 = arrayList;
                                    long j8 = 0;
                                    List L02 = AbstractC0436k.L0(arrayList2, new q(1));
                                    HashMap hashMap = new HashMap();
                                    Iterator it3 = arrayList4.iterator();
                                    long j9 = 0;
                                    while (true) {
                                        boolean hasNext2 = it3.hasNext();
                                        C1868l c1868l4 = c1868l;
                                        LinkedHashMap linkedHashMap2 = this.f16665h;
                                        if (hasNext2) {
                                            C0902b c0902b = (C0902b) it3.next();
                                            long j10 = j9;
                                            C1868l c1868l5 = c1868l2;
                                            C1857a c1857a = (C1857a) linkedHashMap2.get(new Long(c0902b.f11789a.f12187a));
                                            if (c1857a != null) {
                                                long j11 = c1857a.f16680c;
                                                j8 += j11;
                                                C1867k c1867k = c1857a.f16632d;
                                                yVar = yVar2;
                                                it = it3;
                                                long j12 = c1857a.f16679b;
                                                C1869m c1869m = c1857a.f16678a;
                                                c1001a = c1001a2;
                                                long j13 = c1869m.f16682b;
                                                if (j12 != j10) {
                                                    j = j13 / j12;
                                                } else {
                                                    j = j10;
                                                }
                                                long j14 = c1869m.f16683c;
                                                long j15 = c1869m.f16684d;
                                                double d9 = AbstractC0832f.d(c1867k.f16675a / j12);
                                                double d10 = c1867k.f16676b;
                                                if (d10 < 0.0d) {
                                                    d2 = 0.0d;
                                                } else {
                                                    d2 = d10;
                                                }
                                                double d11 = c1867k.f16677c;
                                                if (d11 > 100.0d) {
                                                    d3 = 100.0d;
                                                } else {
                                                    d3 = d11;
                                                }
                                                aVar3 = new C4.a(j12, j11, j13, j, j14, j15, d9, d2, d3);
                                            } else {
                                                yVar = yVar2;
                                                it = it3;
                                                c1001a = c1001a2;
                                                aVar3 = new C4.a(0L, 0L, 0L, 0L, 0L, 0L, 0.0d, 0.0d, 0.0d);
                                            }
                                            hashMap.put(new Long(c0902b.f11789a.f12187a), new Z5.j(c0902b, aVar3));
                                            it3 = it;
                                            c1868l = c1868l4;
                                            j9 = j10;
                                            c1868l2 = c1868l5;
                                            yVar2 = yVar;
                                            c1001a2 = c1001a;
                                        } else {
                                            C1868l c1868l6 = c1868l2;
                                            y yVar3 = yVar2;
                                            i0 i0Var2 = this.f16672q;
                                            C4.c cVar = new C4.c(c1001a2, c1868l6.c(), c1868l4.c(), j5, L02, j8, hashMap);
                                            i0Var2.getClass();
                                            i0Var2.h(null, cVar);
                                            this.f16668m = null;
                                            this.f16669n = null;
                                            c1868l6.a();
                                            c1868l4.a();
                                            linkedHashMap.clear();
                                            linkedHashMap2.clear();
                                            Boolean bool2 = Boolean.FALSE;
                                            i0Var.getClass();
                                            i0Var.h(null, bool2);
                                            aVar2.a(null);
                                            return yVar3;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj = null;
                                    aVar2.a(obj);
                                    throw th;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            i8 = c1864h.f16654h;
                            aVar = c1864h.f16653g;
                            Z5.a.d(obj2);
                        }
                    } else {
                        Z5.a.d(obj2);
                        U7.c cVar2 = this.f16661d;
                        c1864h.f16653g = cVar2;
                        i8 = 0;
                        c1864h.f16654h = 0;
                        c1864h.k = 1;
                        if (cVar2.d(c1864h) != enumC0646a) {
                            aVar = cVar2;
                        }
                        return enumC0646a;
                    }
                    u8 = this.f16674s;
                    c1864h.f16653g = aVar;
                    c1864h.f16654h = i8;
                    c1864h.k = 2;
                    if (u8.n(null, c1864h) != enumC0646a) {
                        aVar2 = aVar;
                        z8 = this.j;
                        i0 i0Var3 = this.f16670o;
                        y yVar22 = y.f7506a;
                        if (z8) {
                        }
                    }
                    return enumC0646a;
                }
            }
            u8 = this.f16674s;
            c1864h.f16653g = aVar;
            c1864h.f16654h = i8;
            c1864h.k = 2;
            if (u8.n(null, c1864h) != enumC0646a) {
            }
            return enumC0646a;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            obj = null;
            aVar2.a(obj);
            throw th;
        }
        c1864h = new C1864h(this, (AbstractC0713c) interfaceC0617c);
        Object obj22 = c1864h.f16655i;
        i4 = c1864h.k;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ae A[Catch: all -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x008c, blocks: (B:40:0x007d, B:42:0x0081, B:45:0x008f, B:47:0x0099, B:48:0x00a4, B:16:0x00ae, B:29:0x00db, B:31:0x00df), top: B:39:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3 A[Catch: all -> 0x011e, TRY_ENTER, TryCatch #2 {all -> 0x011e, blocks: (B:11:0x0079, B:13:0x00a6, B:25:0x00c3, B:27:0x00cd, B:33:0x00fa, B:38:0x00e7), top: B:10:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v3, types: [U7.a] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [U7.a] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [U7.a] */
    /* JADX WARN: Type inference failed for: r6v8, types: [U7.a] */
    @Override // v2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(C0952b c0952b, s2.k kVar, InterfaceC0617c interfaceC0617c) {
        C1860d c1860d;
        int i4;
        s2.k kVar2;
        int i8;
        C0952b c0952b2;
        ?? r62;
        ?? r22;
        Object obj;
        Throwable th;
        U7.a aVar;
        Object obj2;
        U7.a aVar2;
        p b4;
        Rect rect;
        try {
            if (interfaceC0617c instanceof C1860d) {
                C1860d c1860d2 = (C1860d) interfaceC0617c;
                int i9 = c1860d2.f16643m;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c1860d2.f16643m = i9 - Integer.MIN_VALUE;
                    c1860d = c1860d2;
                    Object obj3 = c1860d.k;
                    i4 = c1860d.f16643m;
                    y yVar = y.f7506a;
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            try {
                                if (i4 != 2) {
                                    if (i4 == 3) {
                                        aVar = c1860d.f16641i;
                                        Z5.a.d(obj3);
                                        r62 = aVar;
                                        obj2 = null;
                                        r62.a(obj2);
                                        return yVar;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aVar2 = c1860d.f16641i;
                                Z5.a.d(obj3);
                                r62 = aVar2;
                                obj2 = null;
                                r62.a(obj2);
                                return yVar;
                            } catch (Throwable th2) {
                                th = th2;
                                obj = null;
                                r22 = c1860d;
                                r22.a(obj);
                                throw th;
                            }
                        }
                        int i10 = c1860d.j;
                        r62 = c1860d.f16641i;
                        s2.k kVar3 = c1860d.f16640h;
                        C0952b c0952b3 = c1860d.f16639g;
                        Z5.a.d(obj3);
                        c0952b2 = c0952b3;
                        i8 = i10;
                        kVar2 = kVar3;
                    } else {
                        Z5.a.d(obj3);
                        c1860d.f16639g = c0952b;
                        kVar2 = kVar;
                        c1860d.f16640h = kVar2;
                        U7.c cVar = this.f16661d;
                        c1860d.f16641i = cVar;
                        i8 = 0;
                        c1860d.j = 0;
                        c1860d.f16643m = 1;
                        if (cVar.d(c1860d) != enumC0646a) {
                            c0952b2 = c0952b;
                            r62 = cVar;
                        }
                        return enumC0646a;
                    }
                    if (this.j) {
                        try {
                            Long l6 = this.f16668m;
                            if (l6 == null) {
                                Log.w("DebugEngine", "onEventProcessingCompleted called before start");
                                r62.a(null);
                                return yVar;
                            }
                            C1868l c1868l = (C1868l) this.f16664g.get(l6);
                            if (c1868l != null) {
                                c1868l.b(o6.j.a(kVar2.f14474b, Boolean.TRUE));
                            }
                            this.f16668m = null;
                        } catch (Throwable th3) {
                            th = th3;
                            c1860d = r62;
                            obj = null;
                            r22 = c1860d;
                            r22.a(obj);
                            throw th;
                        }
                    }
                    b4 = kVar2.b();
                    U u8 = this.f16674s;
                    if (b4 != null) {
                        c1860d.f16639g = null;
                        c1860d.f16640h = null;
                        c1860d.f16641i = r62;
                        c1860d.j = i8;
                        c1860d.f16643m = 2;
                        if (u8.n(null, c1860d) != enumC0646a) {
                            aVar2 = r62;
                            r62 = aVar2;
                            obj2 = null;
                            r62.a(obj2);
                            return yVar;
                        }
                    } else {
                        C0902b c0902b = b4.f14495c;
                        Point point = b4.f14496d;
                        Rect rect2 = c0902b.f11794f;
                        if (this.f16666i) {
                            int width = rect2.width() / 2;
                            int height = rect2.height() / 2;
                            if (point.x == 0 && point.y == 0) {
                                rect = new Rect();
                            } else {
                                int i11 = point.x;
                                int i12 = point.y;
                                rect = new Rect(i11 - width, i12 - height, i11 + width, i12 + height);
                            }
                            C4.b bVar = new C4.b(c0952b2, c0902b, b4.f14494b, point, b4.f14497e, rect);
                            c1860d.f16639g = null;
                            c1860d.f16640h = null;
                            c1860d.f16641i = r62;
                            c1860d.j = i8;
                            c1860d.f16643m = 3;
                            if (u8.n(bVar, c1860d) != enumC0646a) {
                                aVar = r62;
                                r62 = aVar;
                                obj2 = null;
                                r62.a(obj2);
                                return yVar;
                            }
                        }
                        obj2 = null;
                        r62.a(obj2);
                        return yVar;
                    }
                    return enumC0646a;
                }
            }
            if (this.j) {
            }
            b4 = kVar2.b();
            U u82 = this.f16674s;
            if (b4 != null) {
            }
            return enumC0646a;
        } catch (Throwable th4) {
            th = th4;
            r22 = r62;
            obj = null;
            r22.a(obj);
            throw th;
        }
        c1860d = new C1860d(this, (AbstractC0713c) interfaceC0617c);
        Object obj32 = c1860d.k;
        i4 = c1860d.f16643m;
        y yVar2 = y.f7506a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #0 {all -> 0x0060, blocks: (B:12:0x004a, B:18:0x0054, B:20:0x0058, B:21:0x0062, B:23:0x007e, B:24:0x0086), top: B:11:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // v2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(C0952b c0952b, InterfaceC0617c interfaceC0617c) {
        C1861e c1861e;
        int i4;
        C0952b c0952b2;
        U7.c cVar;
        boolean z8;
        try {
            if (interfaceC0617c instanceof C1861e) {
                c1861e = (C1861e) interfaceC0617c;
                int i8 = c1861e.k;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c1861e.k = i8 - Integer.MIN_VALUE;
                    Object obj = c1861e.f16646i;
                    i4 = c1861e.k;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            cVar = c1861e.f16645h;
                            c0952b2 = c1861e.f16644g;
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        c1861e.f16644g = c0952b;
                        U7.c cVar2 = this.f16661d;
                        c1861e.f16645h = cVar2;
                        c1861e.k = 1;
                        Object d2 = cVar2.d(c1861e);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                        c0952b2 = c0952b;
                        cVar = cVar2;
                    }
                    z8 = this.j;
                    y yVar = y.f7506a;
                    if (z8) {
                        cVar.a(null);
                        return yVar;
                    }
                    if (this.f16668m != null) {
                        Log.w("DebugEngine", "onEventProcessingStarted called without a complete");
                    }
                    this.f16668m = new Long(c0952b2.f11959a.f12187a);
                    LinkedHashMap linkedHashMap = this.f16664g;
                    Long l6 = new Long(c0952b2.f11959a.f12187a);
                    Object obj2 = linkedHashMap.get(l6);
                    if (obj2 == null) {
                        obj2 = new C1868l();
                        linkedHashMap.put(l6, obj2);
                    }
                    ((C1868l) obj2).f16678a.f16681a = System.currentTimeMillis();
                    cVar.a(null);
                    return yVar;
                }
            }
            z8 = this.j;
            y yVar2 = y.f7506a;
            if (z8) {
            }
        } catch (Throwable th) {
            cVar.a(null);
            throw th;
        }
        c1861e = new C1861e(this, (AbstractC0713c) interfaceC0617c);
        Object obj3 = c1861e.f16646i;
        i4 = c1861e.k;
        if (i4 == 0) {
        }
    }
}
