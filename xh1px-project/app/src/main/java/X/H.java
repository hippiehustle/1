package X;

import L7.AbstractC0166y;
import L7.C0156n;
import L7.C0158p;
import L7.InterfaceC0155m;
import L7.k0;
import O7.C0238k;
import O7.InterfaceC0233f;
import androidx.datastore.core.CorruptionException;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class H implements InterfaceC0339g {

    /* renamed from: d, reason: collision with root package name */
    public final L f6655d;

    /* renamed from: e, reason: collision with root package name */
    public final W5.a f6656e;

    /* renamed from: f, reason: collision with root package name */
    public final Q7.d f6657f;

    /* renamed from: i, reason: collision with root package name */
    public int f6660i;
    public k0 j;

    /* renamed from: l, reason: collision with root package name */
    public final A4.a f6661l;

    /* renamed from: o, reason: collision with root package name */
    public final A4.a f6664o;

    /* renamed from: g, reason: collision with root package name */
    public final W0.d f6658g = new W0.d(new C0349q(this, null));

    /* renamed from: h, reason: collision with root package name */
    public final U7.c f6659h = new U7.c();
    public final C1.f k = new C1.f();

    /* renamed from: m, reason: collision with root package name */
    public final Z5.n f6662m = new Z5.n(new C0344l(this, 1));

    /* renamed from: n, reason: collision with root package name */
    public final Z5.n f6663n = new Z5.n(new C0344l(this, 0));

    public H(L l6, List list, W5.a aVar, Q7.d dVar) {
        this.f6655d = l6;
        this.f6656e = aVar;
        this.f6657f = dVar;
        this.f6661l = new A4.a(this, list);
        this.f6664o = new A4.a(dVar, new c.s(2, this), new E(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0048, B:14:0x0050, B:16:0x0054, B:17:0x005a), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(H h8, AbstractC0713c abstractC0713c) {
        r rVar;
        int i4;
        U7.c cVar;
        int i8;
        try {
            if (abstractC0713c instanceof r) {
                rVar = (r) abstractC0713c;
                int i9 = rVar.k;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    rVar.k = i9 - Integer.MIN_VALUE;
                    Object obj = rVar.f6768i;
                    i4 = rVar.k;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            U7.c cVar2 = rVar.f6767h;
                            H h9 = rVar.f6766g;
                            Z5.a.d(obj);
                            cVar = cVar2;
                            h8 = h9;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        cVar = h8.f6659h;
                        rVar.f6766g = h8;
                        rVar.f6767h = cVar;
                        rVar.k = 1;
                        Object d2 = cVar.d(rVar);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                    }
                    i8 = h8.f6660i - 1;
                    h8.f6660i = i8;
                    if (i8 == 0) {
                        k0 k0Var = h8.j;
                        if (k0Var != null) {
                            k0Var.d(null);
                        }
                        h8.j = null;
                    }
                    cVar.a(null);
                    return Z5.y.f7506a;
                }
            }
            i8 = h8.f6660i - 1;
            h8.f6660i = i8;
            if (i8 == 0) {
            }
            cVar.a(null);
            return Z5.y.f7506a;
        } catch (Throwable th) {
            cVar.a(null);
            throw th;
        }
        rVar = new r(h8, abstractC0713c);
        Object obj2 = rVar.f6768i;
        i4 = rVar.k;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r9 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r9 != r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* JADX WARN: Type inference failed for: r1v3, types: [f6.j, n6.c] */
    /* JADX WARN: Type inference failed for: r1v9, types: [f6.j, n6.c] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(H h8, T t8, AbstractC0713c abstractC0713c) {
        C0350s c0350s;
        int i4;
        InterfaceC0155m interfaceC0155m;
        C0156n c0156n;
        H h9;
        Object b4;
        InterfaceC0155m interfaceC0155m2;
        Throwable a3;
        if (abstractC0713c instanceof C0350s) {
            c0350s = (C0350s) abstractC0713c;
            int i8 = c0350s.f6772l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0350s.f6772l = i8 - Integer.MIN_VALUE;
                Object obj = c0350s.j;
                i4 = c0350s.f6772l;
                boolean z8 = true;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    try {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    interfaceC0155m = (InterfaceC0155m) c0350s.f6769g;
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                C0156n c0156n2 = c0350s.f6771i;
                                H h10 = c0350s.f6770h;
                                T t9 = (T) c0350s.f6769g;
                                Z5.a.d(obj);
                                c0156n = c0156n2;
                                h9 = h10;
                                t8 = t9;
                            }
                        } else {
                            interfaceC0155m = (InterfaceC0155m) c0350s.f6769g;
                        }
                        Z5.a.d(obj);
                        interfaceC0155m2 = interfaceC0155m;
                    } catch (Throwable th) {
                        th = th;
                        obj = Z5.a.b(th);
                        interfaceC0155m2 = h8;
                        a3 = Z5.l.a(obj);
                        C0156n c0156n3 = (C0156n) interfaceC0155m2;
                        if (a3 == null) {
                        }
                        return Z5.y.f7506a;
                    }
                    a3 = Z5.l.a(obj);
                    C0156n c0156n32 = (C0156n) interfaceC0155m2;
                    if (a3 == null) {
                        c0156n32.R(obj);
                    } else {
                        c0156n32.getClass();
                        c0156n32.R(new C0158p(a3, false));
                    }
                    return Z5.y.f7506a;
                }
                Z5.a.d(obj);
                c0156n = t8.f6694b;
                try {
                    c0 b9 = h8.k.b();
                    if (b9 instanceof C0334b) {
                        ?? r12 = t8.f6693a;
                        InterfaceC0622h interfaceC0622h = t8.f6696d;
                        c0350s.f6769g = c0156n;
                        c0350s.f6772l = 1;
                        try {
                            b4 = h8.h().b(new A(h8, interfaceC0622h, (InterfaceC1164c) r12, (InterfaceC0617c) null), c0350s);
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            h8 = c0156n;
                            obj = Z5.a.b(th);
                            interfaceC0155m2 = h8;
                            a3 = Z5.l.a(obj);
                            C0156n c0156n322 = (C0156n) interfaceC0155m2;
                            if (a3 == null) {
                            }
                            return Z5.y.f7506a;
                        }
                    } else {
                        if (!(b9 instanceof U)) {
                            z8 = b9 instanceof d0;
                        }
                        if (z8) {
                            if (b9 == t8.f6695c) {
                                c0350s.f6769g = t8;
                                c0350s.f6770h = h8;
                                c0350s.f6771i = c0156n;
                                c0350s.f6772l = 2;
                                Object i9 = h8.i(c0350s);
                                h9 = h8;
                                if (i9 == enumC0646a) {
                                }
                            } else {
                                o6.j.c(b9, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                                throw ((U) b9).f6697b;
                            }
                        } else {
                            if (b9 instanceof S) {
                                throw ((S) b9).f6692b;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return enumC0646a;
                } catch (Throwable th3) {
                    th = th3;
                    h8 = c0156n;
                    obj = Z5.a.b(th);
                    interfaceC0155m2 = h8;
                    a3 = Z5.l.a(obj);
                    C0156n c0156n3222 = (C0156n) interfaceC0155m2;
                    if (a3 == null) {
                    }
                    return Z5.y.f7506a;
                }
                ?? r13 = t8.f6693a;
                InterfaceC0622h interfaceC0622h2 = t8.f6696d;
                c0350s.f6769g = c0156n;
                c0350s.f6770h = null;
                c0350s.f6771i = null;
                c0350s.f6772l = 3;
                b4 = h9.h().b(new A(h9, interfaceC0622h2, (InterfaceC1164c) r13, (InterfaceC0617c) null), c0350s);
            }
        }
        c0350s = new C0350s(h8, abstractC0713c);
        Object obj2 = c0350s.j;
        i4 = c0350s.f6772l;
        boolean z82 = true;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        ?? r132 = t8.f6693a;
        InterfaceC0622h interfaceC0622h22 = t8.f6696d;
        c0350s.f6769g = c0156n;
        c0350s.f6770h = null;
        c0350s.f6771i = null;
        c0350s.f6772l = 3;
        b4 = h9.h().b(new A(h9, interfaceC0622h22, (InterfaceC1164c) r132, (InterfaceC0617c) null), c0350s);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0048, B:14:0x004f), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(H h8, AbstractC0713c abstractC0713c) {
        C0351t c0351t;
        int i4;
        U7.c cVar;
        int i8;
        try {
            if (abstractC0713c instanceof C0351t) {
                c0351t = (C0351t) abstractC0713c;
                int i9 = c0351t.k;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c0351t.k = i9 - Integer.MIN_VALUE;
                    Object obj = c0351t.f6775i;
                    i4 = c0351t.k;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            U7.c cVar2 = c0351t.f6774h;
                            H h9 = c0351t.f6773g;
                            Z5.a.d(obj);
                            cVar = cVar2;
                            h8 = h9;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        cVar = h8.f6659h;
                        c0351t.f6773g = h8;
                        c0351t.f6774h = cVar;
                        c0351t.k = 1;
                        Object d2 = cVar.d(c0351t);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (d2 == enumC0646a) {
                            return enumC0646a;
                        }
                    }
                    i8 = h8.f6660i + 1;
                    h8.f6660i = i8;
                    if (i8 == 1) {
                        h8.j = AbstractC0166y.q(h8.f6657f, null, null, new C0352u(h8, null), 3);
                    }
                    cVar.a(null);
                    return Z5.y.f7506a;
                }
            }
            i8 = h8.f6660i + 1;
            h8.f6660i = i8;
            if (i8 == 1) {
            }
            cVar.a(null);
            return Z5.y.f7506a;
        } catch (Throwable th) {
            cVar.a(null);
            throw th;
        }
        c0351t = new C0351t(h8, abstractC0713c);
        Object obj2 = c0351t.f6775i;
        i4 = c0351t.k;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(H h8, boolean z8, InterfaceC0617c interfaceC0617c) {
        C0354w c0354w;
        int i4;
        EnumC0646a enumC0646a;
        H h9;
        c0 c0Var;
        boolean z9;
        int i8;
        H h10;
        Z5.j jVar;
        if (interfaceC0617c instanceof C0354w) {
            c0354w = (C0354w) interfaceC0617c;
            int i9 = c0354w.f6784l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0354w.f6784l = i9 - Integer.MIN_VALUE;
                Object obj = c0354w.j;
                i4 = c0354w.f6784l;
                enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                h10 = c0354w.f6781g;
                                Z5.a.d(obj);
                                jVar = (Z5.j) obj;
                                c0 c0Var2 = (c0) jVar.f7485d;
                                if (((Boolean) jVar.f7486e).booleanValue()) {
                                    h10.k.d(c0Var2);
                                }
                                return c0Var2;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h10 = c0354w.f6781g;
                        Z5.a.d(obj);
                        jVar = (Z5.j) obj;
                        c0 c0Var22 = (c0) jVar.f7485d;
                        if (((Boolean) jVar.f7486e).booleanValue()) {
                        }
                        return c0Var22;
                    }
                    z8 = c0354w.f6783i;
                    c0Var = c0354w.f6782h;
                    h9 = c0354w.f6781g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    c0 b4 = h8.k.b();
                    if (!(b4 instanceof d0)) {
                        b0 h11 = h8.h();
                        c0354w.f6781g = h8;
                        c0354w.f6782h = b4;
                        c0354w.f6783i = z8;
                        c0354w.f6784l = 1;
                        Integer a3 = h11.a();
                        if (a3 != enumC0646a) {
                            h9 = h8;
                            c0Var = b4;
                            obj = a3;
                        }
                        return enumC0646a;
                    }
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                int intValue = ((Number) obj).intValue();
                z9 = c0Var instanceof C0334b;
                if (!z9) {
                    i8 = c0Var.f6718a;
                } else {
                    i8 = -1;
                }
                if (!z9 && intValue == i8) {
                    return c0Var;
                }
                if (!z8) {
                    b0 h12 = h9.h();
                    C0238k c0238k = new C0238k(h9, null);
                    c0354w.f6781g = h9;
                    c0354w.f6782h = null;
                    c0354w.f6784l = 2;
                    obj = h12.b(c0238k, c0354w);
                    if (obj != enumC0646a) {
                        h10 = h9;
                        jVar = (Z5.j) obj;
                        c0 c0Var222 = (c0) jVar.f7485d;
                        if (((Boolean) jVar.f7486e).booleanValue()) {
                        }
                        return c0Var222;
                    }
                } else {
                    b0 h13 = h9.h();
                    C0355x c0355x = new C0355x(h9, i8, null);
                    c0354w.f6781g = h9;
                    c0354w.f6782h = null;
                    c0354w.f6784l = 3;
                    obj = h13.c(c0355x, c0354w);
                    if (obj != enumC0646a) {
                        h10 = h9;
                        jVar = (Z5.j) obj;
                        c0 c0Var2222 = (c0) jVar.f7485d;
                        if (((Boolean) jVar.f7486e).booleanValue()) {
                        }
                        return c0Var2222;
                    }
                }
                return enumC0646a;
            }
        }
        c0354w = new C0354w(h8, interfaceC0617c);
        Object obj2 = c0354w.j;
        i4 = c0354w.f6784l;
        enumC0646a = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z9 = c0Var instanceof C0334b;
        if (!z9) {
        }
        if (!z9) {
        }
        if (!z8) {
        }
        return enumC0646a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005f, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013f A[Catch: all -> 0x016c, TryCatch #1 {all -> 0x016c, blocks: (B:27:0x012d, B:29:0x013f, B:32:0x0147), top: B:26:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #1 {all -> 0x016c, blocks: (B:27:0x012d, B:29:0x013f, B:32:0x0147), top: B:26:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f A[Catch: CorruptionException -> 0x005f, TryCatch #3 {CorruptionException -> 0x005f, blocks: (B:36:0x005a, B:37:0x00fe, B:40:0x0068, B:41:0x00e0, B:56:0x0085, B:58:0x009f, B:59:0x00a5, B:65:0x008e, B:68:0x00cd), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.io.Serializable, o6.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o6.u, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(H h8, boolean z8, AbstractC0713c abstractC0713c) {
        C0356y c0356y;
        int i4;
        CorruptionException corruptionException;
        H h9;
        boolean z9;
        o6.u uVar;
        o6.u uVar2;
        CorruptionException corruptionException2;
        Object b4;
        o6.s sVar;
        o6.u uVar3;
        Object obj;
        int i8;
        Integer a3;
        H h10;
        int i9;
        Object obj2;
        if (abstractC0713c instanceof C0356y) {
            c0356y = (C0356y) abstractC0713c;
            int i10 = c0356y.f6794o;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0356y.f6794o = i10 - Integer.MIN_VALUE;
                Object obj3 = c0356y.f6792m;
                i4 = c0356y.f6794o;
                int i11 = 0;
                InterfaceC0617c interfaceC0617c = null;
                Object obj4 = EnumC0646a.f10656d;
                switch (i4) {
                    case 0:
                        Z5.a.d(obj3);
                        if (z8) {
                            c0356y.f6788g = h8;
                            c0356y.k = z8;
                            c0356y.f6794o = 1;
                            obj3 = h8.j(c0356y);
                            if (obj3 == obj4) {
                            }
                            if (obj3 == null) {
                                i8 = obj3.hashCode();
                            } else {
                                i8 = 0;
                            }
                            b0 h11 = h8.h();
                            c0356y.f6788g = h8;
                            c0356y.f6789h = obj3;
                            c0356y.k = z8;
                            c0356y.f6791l = i8;
                            c0356y.f6794o = 2;
                            a3 = h11.a();
                            if (a3 != obj4) {
                                h10 = h8;
                                i9 = i8;
                                obj2 = obj3;
                                obj3 = a3;
                                return new C0334b(obj2, i9, ((Number) obj3).intValue());
                            }
                        } else {
                            b0 h12 = h8.h();
                            c0356y.f6788g = h8;
                            c0356y.k = z8;
                            c0356y.f6794o = 3;
                            obj3 = h12.a();
                            if (obj3 == obj4) {
                            }
                            int intValue = ((Number) obj3).intValue();
                            b0 h13 = h8.h();
                            C0357z c0357z = new C0357z(h8, intValue, null);
                            c0356y.f6788g = h8;
                            c0356y.k = z8;
                            c0356y.f6794o = 4;
                            obj3 = h13.c(c0357z, c0356y);
                            if (obj3 == obj4) {
                            }
                            return (C0334b) obj3;
                        }
                        return obj4;
                    case 1:
                        z8 = c0356y.k;
                        h8 = (H) c0356y.f6788g;
                        Z5.a.d(obj3);
                        if (obj3 == null) {
                        }
                        b0 h112 = h8.h();
                        c0356y.f6788g = h8;
                        c0356y.f6789h = obj3;
                        c0356y.k = z8;
                        c0356y.f6791l = i8;
                        c0356y.f6794o = 2;
                        a3 = h112.a();
                        if (a3 != obj4) {
                        }
                        return obj4;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        i9 = c0356y.f6791l;
                        z8 = c0356y.k;
                        obj2 = c0356y.f6789h;
                        h10 = (H) c0356y.f6788g;
                        try {
                            Z5.a.d(obj3);
                            return new C0334b(obj2, i9, ((Number) obj3).intValue());
                        } catch (CorruptionException e9) {
                            e = e9;
                            h8 = h10;
                            ?? obj5 = new Object();
                            W5.a aVar = h8.f6656e;
                            c0356y.f6788g = h8;
                            c0356y.f6789h = e;
                            c0356y.f6790i = obj5;
                            c0356y.j = obj5;
                            c0356y.k = z8;
                            c0356y.f6794o = 5;
                            Object m6 = ((M7.c) aVar.f6634e).m(e);
                            if (m6 != obj4) {
                                corruptionException = e;
                                obj3 = m6;
                                h9 = h8;
                                z9 = z8;
                                uVar = obj5;
                                uVar2 = obj5;
                                uVar.f13642d = obj3;
                                ?? obj6 = new Object();
                                try {
                                    A a4 = new A(uVar2, h9, (o6.s) obj6, (InterfaceC0617c) null);
                                    c0356y.f6788g = corruptionException;
                                    c0356y.f6789h = uVar2;
                                    c0356y.f6790i = obj6;
                                    c0356y.j = null;
                                    c0356y.f6794o = 6;
                                    if (!z9) {
                                    }
                                    if (b4 != obj4) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    corruptionException2 = corruptionException;
                                    Z5.a.a(corruptionException2, th);
                                    throw corruptionException2;
                                }
                            }
                            return obj4;
                        }
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        z8 = c0356y.k;
                        h8 = (H) c0356y.f6788g;
                        Z5.a.d(obj3);
                        int intValue2 = ((Number) obj3).intValue();
                        b0 h132 = h8.h();
                        C0357z c0357z2 = new C0357z(h8, intValue2, null);
                        c0356y.f6788g = h8;
                        c0356y.k = z8;
                        c0356y.f6794o = 4;
                        obj3 = h132.c(c0357z2, c0356y);
                        if (obj3 == obj4) {
                        }
                        return (C0334b) obj3;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        boolean z10 = c0356y.k;
                        Z5.a.d(obj3);
                        return (C0334b) obj3;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        z9 = c0356y.k;
                        uVar = c0356y.j;
                        o6.u uVar4 = (o6.u) c0356y.f6790i;
                        corruptionException = (CorruptionException) c0356y.f6789h;
                        h9 = (H) c0356y.f6788g;
                        Z5.a.d(obj3);
                        uVar2 = uVar4;
                        uVar.f13642d = obj3;
                        ?? obj62 = new Object();
                        A a42 = new A(uVar2, h9, (o6.s) obj62, (InterfaceC0617c) null);
                        c0356y.f6788g = corruptionException;
                        c0356y.f6789h = uVar2;
                        c0356y.f6790i = obj62;
                        c0356y.j = null;
                        c0356y.f6794o = 6;
                        if (!z9) {
                            h9.getClass();
                            b4 = a42.m(c0356y);
                        } else {
                            b4 = h9.h().b(new C0337e(a42, interfaceC0617c, 1), c0356y);
                        }
                        if (b4 != obj4) {
                            sVar = obj62;
                            uVar3 = uVar2;
                            obj = uVar3.f13642d;
                            if (obj != null) {
                                i11 = obj.hashCode();
                            }
                            obj4 = new C0334b(obj, i11, sVar.f13640d);
                        }
                        return obj4;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        sVar = (o6.s) c0356y.f6790i;
                        uVar3 = (o6.u) c0356y.f6789h;
                        corruptionException2 = (CorruptionException) c0356y.f6788g;
                        try {
                            Z5.a.d(obj3);
                            obj = uVar3.f13642d;
                            if (obj != null) {
                            }
                            obj4 = new C0334b(obj, i11, sVar.f13640d);
                            return obj4;
                        } catch (Throwable th2) {
                            th = th2;
                            Z5.a.a(corruptionException2, th);
                            throw corruptionException2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        c0356y = new C0356y(h8, abstractC0713c);
        Object obj32 = c0356y.f6792m;
        i4 = c0356y.f6794o;
        int i112 = 0;
        InterfaceC0617c interfaceC0617c2 = null;
        Object obj42 = EnumC0646a.f10656d;
        switch (i4) {
        }
    }

    @Override // X.InterfaceC0339g
    public final Object c(InterfaceC1164c interfaceC1164c, InterfaceC0617c interfaceC0617c) {
        g0 g0Var = (g0) interfaceC0617c.h().B(f0.f6731d);
        if (g0Var != null) {
            g0Var.b(this);
        }
        return AbstractC0166y.A(new g0(g0Var, this), new D(this, interfaceC1164c, null), interfaceC0617c);
    }

    @Override // X.InterfaceC0339g
    public final InterfaceC0233f g() {
        return this.f6658g;
    }

    public final b0 h() {
        return (b0) this.f6663n.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.q(r0) != r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(AbstractC0713c abstractC0713c) {
        C0353v c0353v;
        int i4;
        H h8;
        int intValue;
        int i8;
        Throwable th;
        H h9;
        try {
            if (abstractC0713c instanceof C0353v) {
                c0353v = (C0353v) abstractC0713c;
                int i9 = c0353v.k;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    c0353v.k = i9 - Integer.MIN_VALUE;
                    Object obj = c0353v.f6780i;
                    i4 = c0353v.k;
                    Object obj2 = EnumC0646a.f10656d;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                i8 = c0353v.f6779h;
                                h9 = c0353v.f6778g;
                                try {
                                    Z5.a.d(obj);
                                    return Z5.y.f7506a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    h9.k.d(new U(th, i8));
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8 = c0353v.f6778g;
                        Z5.a.d(obj);
                    } else {
                        Z5.a.d(obj);
                        b0 h10 = h();
                        c0353v.f6778g = this;
                        c0353v.k = 1;
                        obj = h10.a();
                        if (obj != obj2) {
                            h8 = this;
                        }
                        return obj2;
                    }
                    intValue = ((Number) obj).intValue();
                    A4.a aVar = h8.f6661l;
                    c0353v.f6778g = h8;
                    c0353v.f6779h = intValue;
                    c0353v.k = 2;
                }
            }
            A4.a aVar2 = h8.f6661l;
            c0353v.f6778g = h8;
            c0353v.f6779h = intValue;
            c0353v.k = 2;
        } catch (Throwable th3) {
            H h11 = h8;
            i8 = intValue;
            th = th3;
            h9 = h11;
            h9.k.d(new U(th, i8));
            throw th;
        }
        c0353v = new C0353v(this, abstractC0713c);
        Object obj3 = c0353v.f6780i;
        i4 = c0353v.k;
        Object obj22 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object j(AbstractC0713c abstractC0713c) {
        return ((O) this.f6662m.getValue()).a(new S3.h(3, null, 2), abstractC0713c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o6.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, boolean z8, AbstractC0713c abstractC0713c) {
        F f8;
        int i4;
        o6.s sVar;
        if (abstractC0713c instanceof F) {
            f8 = (F) abstractC0713c;
            int i8 = f8.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                f8.j = i8 - Integer.MIN_VALUE;
                Object obj2 = f8.f6648h;
                i4 = f8.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        sVar = f8.f6647g;
                        Z5.a.d(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj2);
                    ?? obj3 = new Object();
                    O o7 = (O) this.f6662m.getValue();
                    G g8 = new G(obj3, this, obj, z8, null);
                    f8.f6647g = obj3;
                    f8.j = 1;
                    Object b4 = o7.b(g8, f8);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (b4 == enumC0646a) {
                        return enumC0646a;
                    }
                    sVar = obj3;
                }
                return new Integer(sVar.f13640d);
            }
        }
        f8 = new F(this, abstractC0713c);
        Object obj22 = f8.f6648h;
        i4 = f8.j;
        if (i4 == 0) {
        }
        return new Integer(sVar.f13640d);
    }
}
